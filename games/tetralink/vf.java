/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static int field_b;
    static ah field_a;

    final static void a(boolean param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_135_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_171_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_208_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_222_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_234_0 = 0;
        int stackIn_244_0 = 0;
        int stackIn_248_0 = 0;
        int stackIn_252_0 = 0;
        int stackIn_256_0 = 0;
        int stackIn_284_0 = 0;
        int stackIn_291_0 = 0;
        int stackIn_295_0 = 0;
        int stackIn_299_0 = 0;
        int stackIn_303_0 = 0;
        int stackIn_324_0 = 0;
        int stackIn_336_0 = 0;
        int stackIn_340_0 = 0;
        int stackIn_344_0 = 0;
        int stackIn_348_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_233_0 = 0;
        int stackOut_243_0 = 0;
        int stackOut_247_0 = 0;
        int stackOut_251_0 = 0;
        int stackOut_255_0 = 0;
        int stackOut_281_0 = 0;
        int stackOut_283_0 = 0;
        int stackOut_290_0 = 0;
        int stackOut_294_0 = 0;
        int stackOut_298_0 = 0;
        int stackOut_302_0 = 0;
        int stackOut_323_0 = 0;
        int stackOut_335_0 = 0;
        int stackOut_339_0 = 0;
        int stackOut_343_0 = 0;
        int stackOut_347_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = TetraLink.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param2) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        vf.a((byte) 91);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = param1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var3_int ^ -1) != -1) {
                            statePc = 10;
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
                        if (var6 == 0) {
                            statePc = 124;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-2 == (var3_int ^ -1)) {
                            statePc = 126;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-3 != (var3_int ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var6 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (7 != var3_int) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var6 == 0) {
                            statePc = 156;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-4 == (var3_int ^ -1)) {
                            statePc = 178;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-6 != (var3_int ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var6 == 0) {
                            statePc = 197;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var3_int ^ -1) == -9) {
                            statePc = 219;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var3_int ^ -1) != -5) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var6 == 0) {
                            statePc = 241;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var3_int ^ -1) != -15) {
                            statePc = 49;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var3_int != 15) {
                            statePc = 55;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (-17 == (var3_int ^ -1)) {
                            statePc = 357;
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
                        if ((var3_int ^ -1) != -18) {
                            statePc = 64;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if ((var3_int ^ -1) == -7) {
                            statePc = 263;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if ((var3_int ^ -1) == -10) {
                            statePc = 271;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (-11 != (var3_int ^ -1)) {
                            statePc = 76;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var6 == 0) {
                            statePc = 274;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if ((var3_int ^ -1) == -12) {
                            statePc = 275;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (18 != var3_int) {
                            statePc = 85;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var6 == 0) {
                            statePc = 276;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (-20 != (var3_int ^ -1)) {
                            statePc = 91;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (var6 == 0) {
                            statePc = 278;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (12 != var3_int) {
                            statePc = 97;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (var6 == 0) {
                            statePc = 285;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (20 != var3_int) {
                            statePc = 103;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (var6 == 0) {
                            statePc = 314;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if ((var3_int ^ -1) == -22) {
                            statePc = 317;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (var3_int != 22) {
                            statePc = 112;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (var6 == 0) {
                            statePc = 320;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if ((var3_int ^ -1) != -14) {
                            statePc = 118;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (var6 == 0) {
                            statePc = 330;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if ((var3_int ^ -1) != -24) {
                            statePc = 357;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (var6 == 0) {
                            statePc = 333;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var3_int = param0 ? 1 : 0;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        ac.a(-3, -96, var3_int != 0, 0);
                        wb.a(false, -7869);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        bf discarded$9 = lb.a(e.field_c, 573509761);
                        if (!ug.o(34)) {
                            statePc = 136;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if (ug.o(102)) {
                            statePc = 134;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackOut_132_0 = 1;
                        stackIn_135_0 = stackOut_132_0;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        stackOut_134_0 = 0;
                        stackIn_135_0 = stackOut_134_0;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var3_int = stackIn_135_0;
                        gm.a(true, (byte) 33, li.field_l, 240, li.field_l, 2, 320, (jb) (Object) mk.field_b, mk.field_b.field_u, eo.field_a, param0, mk.field_b.field_u - -mk.field_b.field_K, 8, var3_int, 8);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        var3_int = param0 ? 1 : 0;
                        var4 = pf.field_d;
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (0 == ed.field_O) {
                            statePc = 153;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        stackOut_138_0 = -3;
                        stackIn_139_0 = stackOut_138_0;
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if (stackIn_139_0 == (kb.field_t ^ -1)) {
                            statePc = 153;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        stackOut_142_0 = 3;
                        stackIn_143_0 = stackOut_142_0;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (stackIn_143_0 == kb.field_t) {
                            statePc = 153;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        stackOut_146_0 = ed.field_O;
                        stackIn_147_0 = stackOut_146_0;
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (stackIn_147_0 == 4) {
                            statePc = 153;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (5 != ed.field_O) {
                            statePc = 154;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        var4 = ed.field_O;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        ac.a(-4, -117, var3_int != 0, var4);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        bf discarded$10 = lb.a(uf.field_d, 573509761);
                        cl.field_g = 2;
                        im.field_e = wk.field_s;
                        ok.field_d = dg.field_j;
                        wb.a(false, -7869);
                        var3_int = param0 ? 1 : 0;
                        ac.a(-1, -73, var3_int != 0, 0);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        bf discarded$11 = lb.a(e.field_c, 573509761);
                        var3_int = param0 ? 1 : 0;
                        var4 = pf.field_d;
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (0 == ed.field_O) {
                            statePc = 176;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        stackOut_158_0 = -3;
                        stackIn_159_0 = stackOut_158_0;
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        if (stackIn_159_0 == (kb.field_t ^ -1)) {
                            statePc = 176;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        stackOut_162_0 = 3;
                        stackIn_163_0 = stackOut_162_0;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (stackIn_163_0 == kb.field_t) {
                            statePc = 176;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        stackOut_166_0 = ed.field_O;
                        stackIn_167_0 = stackOut_166_0;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if ((stackIn_167_0 ^ -1) == -5) {
                            statePc = 176;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        stackOut_170_0 = -6;
                        stackIn_171_0 = stackOut_170_0;
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (stackIn_171_0 == (ed.field_O ^ -1)) {
                            statePc = 176;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        var4 = ed.field_O;
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        ac.a(0, -66, var3_int != 0, var4);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 178;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        bf discarded$12 = lb.a(e.field_c, 573509761);
                        var3_int = param0 ? 1 : 0;
                        var4 = pf.field_d;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (0 == ed.field_O) {
                            statePc = 195;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        stackOut_180_0 = 2;
                        stackIn_181_0 = stackOut_180_0;
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        if (stackIn_181_0 == kb.field_t) {
                            statePc = 195;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        stackOut_184_0 = kb.field_t;
                        stackIn_185_0 = stackOut_184_0;
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if (stackIn_185_0 == 3) {
                            statePc = 195;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 191;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 191;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 191;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        stackOut_188_0 = 4;
                        stackIn_189_0 = stackOut_188_0;
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 191;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        if (stackIn_189_0 == ed.field_O) {
                            statePc = 195;
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
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        if ((ed.field_O ^ -1) != -6) {
                            statePc = 196;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        var4 = ed.field_O;
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        ac.a(8, -109, var3_int != 0, var4);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 197;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        bf discarded$13 = lb.a(e.field_c, 573509761);
                        af.field_h = 0;
                        var3_int = param0 ? 1 : 0;
                        var4 = pf.field_d;
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        if ((ed.field_O ^ -1) == -1) {
                            statePc = 217;
                        } else {
                            statePc = 199;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        stackOut_199_0 = 2;
                        stackIn_200_0 = stackOut_199_0;
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        if (stackIn_200_0 == kb.field_t) {
                            statePc = 217;
                        } else {
                            statePc = 201;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        statePc = 203;
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        stackOut_203_0 = -4;
                        stackIn_204_0 = stackOut_203_0;
                        statePc = 204;
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        if (stackIn_204_0 == (kb.field_t ^ -1)) {
                            statePc = 217;
                        } else {
                            statePc = 205;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 210;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 210;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 210;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        stackOut_207_0 = ed.field_O;
                        stackIn_208_0 = stackOut_207_0;
                        statePc = 208;
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 210;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        if ((stackIn_208_0 ^ -1) == -5) {
                            statePc = 217;
                        } else {
                            statePc = 209;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        statePc = 211;
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        stackOut_211_0 = 5;
                        stackIn_212_0 = stackOut_211_0;
                        statePc = 212;
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        if (stackIn_212_0 == ed.field_O) {
                            statePc = 217;
                        } else {
                            statePc = 213;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 216;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 216;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 216;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        statePc = 218;
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 216;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        var4 = ed.field_O;
                        statePc = 218;
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        ac.a(7, -65, var3_int != 0, var4);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 219;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        bf discarded$14 = lb.a(e.field_c, 573509761);
                        var3_int = pf.field_d;
                        var4 = param0 ? 1 : 0;
                        var5 = pf.field_d;
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        if ((ed.field_O ^ -1) == -1) {
                            statePc = 239;
                        } else {
                            statePc = 221;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        stackOut_221_0 = -3;
                        stackIn_222_0 = stackOut_221_0;
                        statePc = 222;
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        if (stackIn_222_0 == (kb.field_t ^ -1)) {
                            statePc = 239;
                        } else {
                            statePc = 223;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        statePc = 225;
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        stackOut_225_0 = kb.field_t;
                        stackIn_226_0 = stackOut_225_0;
                        statePc = 226;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        if ((stackIn_226_0 ^ -1) == -4) {
                            statePc = 239;
                        } else {
                            statePc = 227;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        statePc = 229;
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        stackOut_229_0 = 4;
                        stackIn_230_0 = stackOut_229_0;
                        statePc = 230;
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        if (stackIn_230_0 == ed.field_O) {
                            statePc = 239;
                        } else {
                            statePc = 231;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 236;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        statePc = 233;
                        continue stateLoop;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 236;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 236;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        stackOut_233_0 = ed.field_O;
                        stackIn_234_0 = stackOut_233_0;
                        statePc = 234;
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 236;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        if (stackIn_234_0 == 5) {
                            statePc = 239;
                        } else {
                            statePc = 235;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        statePc = 237;
                        continue stateLoop;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        statePc = 240;
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        var5 = ed.field_O;
                        statePc = 240;
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        ac.a(var3_int, -93, var4 != 0, var5);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 241;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_240) {
                        caughtException = stateCaught_240;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        bf discarded$15 = lb.a(e.field_c, 573509761);
                        var3_int = param0 ? 1 : 0;
                        var4 = pf.field_d;
                        statePc = 242;
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        if ((ed.field_O ^ -1) == -1) {
                            statePc = 261;
                        } else {
                            statePc = 243;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 246;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        stackOut_243_0 = -3;
                        stackIn_244_0 = stackOut_243_0;
                        statePc = 244;
                        continue stateLoop;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 246;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        if (stackIn_244_0 == (kb.field_t ^ -1)) {
                            statePc = 261;
                        } else {
                            statePc = 245;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        statePc = 247;
                        continue stateLoop;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        stackOut_247_0 = 3;
                        stackIn_248_0 = stackOut_247_0;
                        statePc = 248;
                        continue stateLoop;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        if (stackIn_248_0 == kb.field_t) {
                            statePc = 261;
                        } else {
                            statePc = 249;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 249: {
                    try {
                        statePc = 251;
                        continue stateLoop;
                    } catch (Throwable stateCaught_249) {
                        caughtException = stateCaught_249;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        stackOut_251_0 = -5;
                        stackIn_252_0 = stackOut_251_0;
                        statePc = 252;
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        if (stackIn_252_0 == (ed.field_O ^ -1)) {
                            statePc = 261;
                        } else {
                            statePc = 253;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_252) {
                        caughtException = stateCaught_252;
                        statePc = 258;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        statePc = 255;
                        continue stateLoop;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 258;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 258;
                        continue stateLoop;
                    }
                }
                case 255: {
                    try {
                        stackOut_255_0 = -6;
                        stackIn_256_0 = stackOut_255_0;
                        statePc = 256;
                        continue stateLoop;
                    } catch (Throwable stateCaught_255) {
                        caughtException = stateCaught_255;
                        statePc = 258;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        if (stackIn_256_0 == (ed.field_O ^ -1)) {
                            statePc = 261;
                        } else {
                            statePc = 257;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 260;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        statePc = 259;
                        continue stateLoop;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 260;
                        continue stateLoop;
                    }
                }
                case 258: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_258) {
                        caughtException = stateCaught_258;
                        statePc = 260;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        statePc = 262;
                        continue stateLoop;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 260;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 261: {
                    try {
                        var4 = ed.field_O;
                        statePc = 262;
                        continue stateLoop;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        ac.a(6, -90, var3_int != 0, var4);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 263;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 265;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        if (null == hd.field_u) {
                            statePc = 269;
                        } else {
                            statePc = 264;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 268;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        statePc = 266;
                        continue stateLoop;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 268;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 268;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        qa.b((byte) 119);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 267;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 268;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        statePc = 269;
                        continue stateLoop;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        var3_int = param0 ? 1 : 0;
                        statePc = 270;
                        continue stateLoop;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        em.field_f = false;
                        s.a(8, li.field_l, (byte) 7, 2, var3_int != 0, 240, 8, 320, mk.field_b.field_K + mk.field_b.field_u, mk.field_b.field_u, (jb) (Object) mk.field_b, li.field_l);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 271;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 273;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        wb.a(true, -7869);
                        nn.field_X = false;
                        tb.field_g = true;
                        aa.field_bc.a(true, param0);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 272;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 273;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        statePc = 274;
                        continue stateLoop;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        aa.field_bc.a(0);
                        var3_int = param0 ? 1 : 0;
                        ac.a(-1, -117, var3_int != 0, 0);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 275;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_274) {
                        caughtException = stateCaught_274;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 275: {
                    try {
                        aa.field_bc.a(false);
                        var3_int = param0 ? 1 : 0;
                        ac.a(-1, -72, var3_int != 0, 0);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 276;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_275) {
                        caughtException = stateCaught_275;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        aa.field_bc.e(-1);
                        var3_int = param0 ? 1 : 0;
                        statePc = 277;
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 277: {
                    try {
                        ac.a(-1, -121, var3_int != 0, 0);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 278;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_277) {
                        caughtException = stateCaught_277;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        bf discarded$16 = lb.a(e.field_c, 573509761);
                        if (-1 != (hm.field_a ^ -1)) {
                            statePc = 283;
                        } else {
                            statePc = 279;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 279: {
                    try {
                        statePc = 281;
                        continue stateLoop;
                    } catch (Throwable stateCaught_279) {
                        caughtException = stateCaught_279;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 280: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_280) {
                        caughtException = stateCaught_280;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 281: {
                    try {
                        stackOut_281_0 = 1;
                        stackIn_284_0 = stackOut_281_0;
                        statePc = 284;
                        continue stateLoop;
                    } catch (Throwable stateCaught_281) {
                        caughtException = stateCaught_281;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 282: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_282) {
                        caughtException = stateCaught_282;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 283: {
                    try {
                        stackOut_283_0 = 0;
                        stackIn_284_0 = stackOut_283_0;
                        statePc = 284;
                        continue stateLoop;
                    } catch (Throwable stateCaught_283) {
                        caughtException = stateCaught_283;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 284: {
                    try {
                        af.field_h = stackIn_284_0;
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 285;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_284) {
                        caughtException = stateCaught_284;
                        statePc = 287;
                        continue stateLoop;
                    }
                }
                case 285: {
                    try {
                        wb.a(true, -7869);
                        if (!ph.field_s) {
                            statePc = 310;
                        } else {
                            statePc = 286;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_285) {
                        caughtException = stateCaught_285;
                        statePc = 287;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        statePc = 288;
                        continue stateLoop;
                    } catch (Throwable stateCaught_286) {
                        caughtException = stateCaught_286;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 287: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_287) {
                        caughtException = stateCaught_287;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 288: {
                    try {
                        var3_int = param0 ? 1 : 0;
                        var4 = pf.field_d;
                        statePc = 289;
                        continue stateLoop;
                    } catch (Throwable stateCaught_288) {
                        caughtException = stateCaught_288;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 289: {
                    try {
                        if (-1 == (ed.field_O ^ -1)) {
                            statePc = 308;
                        } else {
                            statePc = 290;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_289) {
                        caughtException = stateCaught_289;
                        statePc = 293;
                        continue stateLoop;
                    }
                }
                case 290: {
                    try {
                        stackOut_290_0 = kb.field_t;
                        stackIn_291_0 = stackOut_290_0;
                        statePc = 291;
                        continue stateLoop;
                    } catch (Throwable stateCaught_290) {
                        caughtException = stateCaught_290;
                        statePc = 293;
                        continue stateLoop;
                    }
                }
                case 291: {
                    try {
                        if ((stackIn_291_0 ^ -1) == -3) {
                            statePc = 308;
                        } else {
                            statePc = 292;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_291) {
                        caughtException = stateCaught_291;
                        statePc = 297;
                        continue stateLoop;
                    }
                }
                case 292: {
                    try {
                        statePc = 294;
                        continue stateLoop;
                    } catch (Throwable stateCaught_292) {
                        caughtException = stateCaught_292;
                        statePc = 297;
                        continue stateLoop;
                    }
                }
                case 293: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_293) {
                        caughtException = stateCaught_293;
                        statePc = 297;
                        continue stateLoop;
                    }
                }
                case 294: {
                    try {
                        stackOut_294_0 = kb.field_t;
                        stackIn_295_0 = stackOut_294_0;
                        statePc = 295;
                        continue stateLoop;
                    } catch (Throwable stateCaught_294) {
                        caughtException = stateCaught_294;
                        statePc = 297;
                        continue stateLoop;
                    }
                }
                case 295: {
                    try {
                        if ((stackIn_295_0 ^ -1) == -4) {
                            statePc = 308;
                        } else {
                            statePc = 296;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_295) {
                        caughtException = stateCaught_295;
                        statePc = 301;
                        continue stateLoop;
                    }
                }
                case 296: {
                    try {
                        statePc = 298;
                        continue stateLoop;
                    } catch (Throwable stateCaught_296) {
                        caughtException = stateCaught_296;
                        statePc = 301;
                        continue stateLoop;
                    }
                }
                case 297: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_297) {
                        caughtException = stateCaught_297;
                        statePc = 301;
                        continue stateLoop;
                    }
                }
                case 298: {
                    try {
                        stackOut_298_0 = ed.field_O;
                        stackIn_299_0 = stackOut_298_0;
                        statePc = 299;
                        continue stateLoop;
                    } catch (Throwable stateCaught_298) {
                        caughtException = stateCaught_298;
                        statePc = 301;
                        continue stateLoop;
                    }
                }
                case 299: {
                    try {
                        if ((stackIn_299_0 ^ -1) == -5) {
                            statePc = 308;
                        } else {
                            statePc = 300;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_299) {
                        caughtException = stateCaught_299;
                        statePc = 305;
                        continue stateLoop;
                    }
                }
                case 300: {
                    try {
                        statePc = 302;
                        continue stateLoop;
                    } catch (Throwable stateCaught_300) {
                        caughtException = stateCaught_300;
                        statePc = 305;
                        continue stateLoop;
                    }
                }
                case 301: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_301) {
                        caughtException = stateCaught_301;
                        statePc = 305;
                        continue stateLoop;
                    }
                }
                case 302: {
                    try {
                        stackOut_302_0 = 5;
                        stackIn_303_0 = stackOut_302_0;
                        statePc = 303;
                        continue stateLoop;
                    } catch (Throwable stateCaught_302) {
                        caughtException = stateCaught_302;
                        statePc = 305;
                        continue stateLoop;
                    }
                }
                case 303: {
                    try {
                        if (stackIn_303_0 == ed.field_O) {
                            statePc = 308;
                        } else {
                            statePc = 304;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_303) {
                        caughtException = stateCaught_303;
                        statePc = 307;
                        continue stateLoop;
                    }
                }
                case 304: {
                    try {
                        statePc = 306;
                        continue stateLoop;
                    } catch (Throwable stateCaught_304) {
                        caughtException = stateCaught_304;
                        statePc = 307;
                        continue stateLoop;
                    }
                }
                case 305: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_305) {
                        caughtException = stateCaught_305;
                        statePc = 307;
                        continue stateLoop;
                    }
                }
                case 306: {
                    try {
                        statePc = 309;
                        continue stateLoop;
                    } catch (Throwable stateCaught_306) {
                        caughtException = stateCaught_306;
                        statePc = 307;
                        continue stateLoop;
                    }
                }
                case 307: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_307) {
                        caughtException = stateCaught_307;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 308: {
                    try {
                        var4 = ed.field_O;
                        statePc = 309;
                        continue stateLoop;
                    } catch (Throwable stateCaught_308) {
                        caughtException = stateCaught_308;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 309: {
                    try {
                        ac.a(-5, -98, var3_int != 0, var4);
                        statePc = 310;
                        continue stateLoop;
                    } catch (Throwable stateCaught_309) {
                        caughtException = stateCaught_309;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 310: {
                    try {
                        if (!sj.field_a) {
                            statePc = 357;
                        } else {
                            statePc = 311;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_310) {
                        caughtException = stateCaught_310;
                        statePc = 313;
                        continue stateLoop;
                    }
                }
                case 311: {
                    try {
                        mi.a(3, 0, 11);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 312;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_311) {
                        caughtException = stateCaught_311;
                        statePc = 316;
                        continue stateLoop;
                    }
                }
                case 312: {
                    try {
                        statePc = 314;
                        continue stateLoop;
                    } catch (Throwable stateCaught_312) {
                        caughtException = stateCaught_312;
                        statePc = 316;
                        continue stateLoop;
                    }
                }
                case 313: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_313) {
                        caughtException = stateCaught_313;
                        statePc = 316;
                        continue stateLoop;
                    }
                }
                case 314: {
                    try {
                        wd.field_k = 0;
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 315;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_314) {
                        caughtException = stateCaught_314;
                        statePc = 319;
                        continue stateLoop;
                    }
                }
                case 315: {
                    try {
                        statePc = 317;
                        continue stateLoop;
                    } catch (Throwable stateCaught_315) {
                        caughtException = stateCaught_315;
                        statePc = 319;
                        continue stateLoop;
                    }
                }
                case 316: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_316) {
                        caughtException = stateCaught_316;
                        statePc = 319;
                        continue stateLoop;
                    }
                }
                case 317: {
                    try {
                        wd.field_k = 1;
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 318;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_317) {
                        caughtException = stateCaught_317;
                        statePc = 322;
                        continue stateLoop;
                    }
                }
                case 318: {
                    try {
                        statePc = 320;
                        continue stateLoop;
                    } catch (Throwable stateCaught_318) {
                        caughtException = stateCaught_318;
                        statePc = 322;
                        continue stateLoop;
                    }
                }
                case 319: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_319) {
                        caughtException = stateCaught_319;
                        statePc = 322;
                        continue stateLoop;
                    }
                }
                case 320: {
                    try {
                        if (8 == kb.field_t) {
                            statePc = 327;
                        } else {
                            statePc = 321;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_320) {
                        caughtException = stateCaught_320;
                        statePc = 326;
                        continue stateLoop;
                    }
                }
                case 321: {
                    try {
                        statePc = 323;
                        continue stateLoop;
                    } catch (Throwable stateCaught_321) {
                        caughtException = stateCaught_321;
                        statePc = 326;
                        continue stateLoop;
                    }
                }
                case 322: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_322) {
                        caughtException = stateCaught_322;
                        statePc = 326;
                        continue stateLoop;
                    }
                }
                case 323: {
                    try {
                        stackOut_323_0 = kb.field_t;
                        stackIn_324_0 = stackOut_323_0;
                        statePc = 324;
                        continue stateLoop;
                    } catch (Throwable stateCaught_323) {
                        caughtException = stateCaught_323;
                        statePc = 326;
                        continue stateLoop;
                    }
                }
                case 324: {
                    try {
                        if ((stackIn_324_0 ^ -1) != -7) {
                            statePc = 357;
                        } else {
                            statePc = 325;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_324) {
                        caughtException = stateCaught_324;
                        statePc = 329;
                        continue stateLoop;
                    }
                }
                case 325: {
                    try {
                        statePc = 327;
                        continue stateLoop;
                    } catch (Throwable stateCaught_325) {
                        caughtException = stateCaught_325;
                        statePc = 329;
                        continue stateLoop;
                    }
                }
                case 326: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_326) {
                        caughtException = stateCaught_326;
                        statePc = 329;
                        continue stateLoop;
                    }
                }
                case 327: {
                    try {
                        hd.a(vg.field_Mb, kb.field_t, -308);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 328;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_327) {
                        caughtException = stateCaught_327;
                        statePc = 332;
                        continue stateLoop;
                    }
                }
                case 328: {
                    try {
                        statePc = 330;
                        continue stateLoop;
                    } catch (Throwable stateCaught_328) {
                        caughtException = stateCaught_328;
                        statePc = 332;
                        continue stateLoop;
                    }
                }
                case 329: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_329) {
                        caughtException = stateCaught_329;
                        statePc = 332;
                        continue stateLoop;
                    }
                }
                case 330: {
                    try {
                        ma.a(lk.q(13), (byte) 116);
                        if (var6 == 0) {
                            statePc = 357;
                        } else {
                            statePc = 331;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_330) {
                        caughtException = stateCaught_330;
                        statePc = 332;
                        continue stateLoop;
                    }
                }
                case 331: {
                    try {
                        statePc = 333;
                        continue stateLoop;
                    } catch (Throwable stateCaught_331) {
                        caughtException = stateCaught_331;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 332: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_332) {
                        caughtException = stateCaught_332;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 333: {
                    try {
                        bf discarded$17 = lb.a(e.field_c, 573509761);
                        var3_int = param0 ? 1 : 0;
                        var4 = pf.field_d;
                        statePc = 334;
                        continue stateLoop;
                    } catch (Throwable stateCaught_333) {
                        caughtException = stateCaught_333;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 334: {
                    try {
                        if (-1 == (ed.field_O ^ -1)) {
                            statePc = 353;
                        } else {
                            statePc = 335;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_334) {
                        caughtException = stateCaught_334;
                        statePc = 338;
                        continue stateLoop;
                    }
                }
                case 335: {
                    try {
                        stackOut_335_0 = 2;
                        stackIn_336_0 = stackOut_335_0;
                        statePc = 336;
                        continue stateLoop;
                    } catch (Throwable stateCaught_335) {
                        caughtException = stateCaught_335;
                        statePc = 338;
                        continue stateLoop;
                    }
                }
                case 336: {
                    try {
                        if (stackIn_336_0 == kb.field_t) {
                            statePc = 353;
                        } else {
                            statePc = 337;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_336) {
                        caughtException = stateCaught_336;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 337: {
                    try {
                        statePc = 339;
                        continue stateLoop;
                    } catch (Throwable stateCaught_337) {
                        caughtException = stateCaught_337;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 338: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_338) {
                        caughtException = stateCaught_338;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 339: {
                    try {
                        stackOut_339_0 = kb.field_t;
                        stackIn_340_0 = stackOut_339_0;
                        statePc = 340;
                        continue stateLoop;
                    } catch (Throwable stateCaught_339) {
                        caughtException = stateCaught_339;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 340: {
                    try {
                        if (stackIn_340_0 == 3) {
                            statePc = 353;
                        } else {
                            statePc = 341;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_340) {
                        caughtException = stateCaught_340;
                        statePc = 346;
                        continue stateLoop;
                    }
                }
                case 341: {
                    try {
                        statePc = 343;
                        continue stateLoop;
                    } catch (Throwable stateCaught_341) {
                        caughtException = stateCaught_341;
                        statePc = 346;
                        continue stateLoop;
                    }
                }
                case 342: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_342) {
                        caughtException = stateCaught_342;
                        statePc = 346;
                        continue stateLoop;
                    }
                }
                case 343: {
                    try {
                        stackOut_343_0 = -5;
                        stackIn_344_0 = stackOut_343_0;
                        statePc = 344;
                        continue stateLoop;
                    } catch (Throwable stateCaught_343) {
                        caughtException = stateCaught_343;
                        statePc = 346;
                        continue stateLoop;
                    }
                }
                case 344: {
                    try {
                        if (stackIn_344_0 == (ed.field_O ^ -1)) {
                            statePc = 353;
                        } else {
                            statePc = 345;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_344) {
                        caughtException = stateCaught_344;
                        statePc = 350;
                        continue stateLoop;
                    }
                }
                case 345: {
                    try {
                        statePc = 347;
                        continue stateLoop;
                    } catch (Throwable stateCaught_345) {
                        caughtException = stateCaught_345;
                        statePc = 350;
                        continue stateLoop;
                    }
                }
                case 346: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_346) {
                        caughtException = stateCaught_346;
                        statePc = 350;
                        continue stateLoop;
                    }
                }
                case 347: {
                    try {
                        stackOut_347_0 = ed.field_O;
                        stackIn_348_0 = stackOut_347_0;
                        statePc = 348;
                        continue stateLoop;
                    } catch (Throwable stateCaught_347) {
                        caughtException = stateCaught_347;
                        statePc = 350;
                        continue stateLoop;
                    }
                }
                case 348: {
                    try {
                        if ((stackIn_348_0 ^ -1) == -6) {
                            statePc = 353;
                        } else {
                            statePc = 349;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_348) {
                        caughtException = stateCaught_348;
                        statePc = 352;
                        continue stateLoop;
                    }
                }
                case 349: {
                    try {
                        statePc = 351;
                        continue stateLoop;
                    } catch (Throwable stateCaught_349) {
                        caughtException = stateCaught_349;
                        statePc = 352;
                        continue stateLoop;
                    }
                }
                case 350: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_350) {
                        caughtException = stateCaught_350;
                        statePc = 352;
                        continue stateLoop;
                    }
                }
                case 351: {
                    try {
                        statePc = 354;
                        continue stateLoop;
                    } catch (Throwable stateCaught_351) {
                        caughtException = stateCaught_351;
                        statePc = 352;
                        continue stateLoop;
                    }
                }
                case 352: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_352) {
                        caughtException = stateCaught_352;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 353: {
                    try {
                        var4 = ed.field_O;
                        statePc = 354;
                        continue stateLoop;
                    } catch (Throwable stateCaught_353) {
                        caughtException = stateCaught_353;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 354: {
                    try {
                        ac.a(1, -80, var3_int != 0, var4);
                        statePc = 357;
                        continue stateLoop;
                    } catch (Throwable stateCaught_354) {
                        caughtException = stateCaught_354;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 356: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw oi.a((Throwable) (Object) var3, "vf.A(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 357: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        bc var1 = null;
        int var2 = 0;
        gd var3_ref_gd = null;
        int var3 = 0;
        long var3_long = 0L;
        el var3_ref_el = null;
        int var4 = 0;
        el var4_ref_el = null;
        el var4_ref = null;
        int var5 = 0;
        String var5_ref = null;
        el var5_ref_el = null;
        gd var6 = null;
        String var7 = null;
        gd var8_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_16_0 = 0;
        gd stackIn_23_0 = null;
        gd stackIn_24_0 = null;
        gd stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        String stackIn_101_0 = null;
        String stackIn_102_0 = null;
        String stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        boolean stackIn_167_0 = false;
        boolean stackIn_168_0 = false;
        int stackIn_179_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        gd stackOut_22_0 = null;
        gd stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        gd stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        String stackOut_100_0 = null;
        String stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        String stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        boolean stackOut_166_0 = false;
        boolean stackOut_167_0 = false;
        int stackOut_178_0 = 0;
        var11 = TetraLink.field_J;
        if (param0 == -7) {
          L0: {
            L1: {
              var1 = kb.field_q;
              var2 = ((bh) (Object) var1).d((byte) -99);
              if (-1 == (var2 ^ -1)) {
                break L1;
              } else {
                if (-2 == (var2 ^ -1)) {
                  break L1;
                } else {
                  if (var2 == 2) {
                    break L1;
                  } else {
                    if (3 == var2) {
                      break L1;
                    } else {
                      if ((var2 ^ -1) == -5) {
                        break L1;
                      } else {
                        L2: {
                          if (var2 != 5) {
                            break L2;
                          } else {
                            L3: {
                              var3_long = ((bh) (Object) var1).c(255);
                              var5_ref = ((bh) (Object) var1).g((byte) 81);
                              var6 = (gd) (Object) ((bh) (Object) var1).g((byte) 81);
                              var7 = ((bh) (Object) var1).g((byte) 81);
                              var8_ref = tm.a(var3_long, -26778);
                              if (((String) (Object) var6).equals((Object) (Object) "")) {
                                stackOut_15_0 = 0;
                                stackIn_16_0 = stackOut_15_0;
                                break L3;
                              } else {
                                stackOut_14_0 = 1;
                                stackIn_16_0 = stackOut_14_0;
                                break L3;
                              }
                            }
                            L4: {
                              L5: {
                                var9 = stackIn_16_0;
                                if (null == var8_ref) {
                                  break L5;
                                } else {
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    var8_ref.a(32, var5_ref, var7);
                                    if (var11 == 0) {
                                      break L4;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                              var8_ref = new gd(var5_ref, var7, var3_long);
                              db.field_a.a(var3_long, (gb) (Object) var8_ref, param0 ^ -122);
                              break L4;
                            }
                            L6: {
                              var8_ref.field_bc = k.a(param0 ^ -7) + -(long)((bh) (Object) var1).f(param0 ^ 112);
                              var8_ref.field_Pb = ((bh) (Object) var1).e(127);
                              var10 = ((bh) (Object) var1).b((byte) 120);
                              var8_ref.field_Qb = var10 >> 69249281;
                              stackOut_22_0 = (gd) var8_ref;
                              stackIn_24_0 = stackOut_22_0;
                              stackIn_23_0 = stackOut_22_0;
                              if ((var10 & 1 ^ -1) == -1) {
                                stackOut_24_0 = (gd) (Object) stackIn_24_0;
                                stackOut_24_1 = 0;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                break L6;
                              } else {
                                stackOut_23_0 = (gd) (Object) stackIn_23_0;
                                stackOut_23_1 = 1;
                                stackIn_25_0 = stackOut_23_0;
                                stackIn_25_1 = stackOut_23_1;
                                break L6;
                              }
                            }
                            stackIn_25_0.field_Tb = stackIn_25_1 != 0;
                            var8_ref.field_dc = ((bh) (Object) var1).d((byte) -99);
                            var8_ref.field_Ub = ((bh) (Object) var1).d((byte) -99);
                            ul.a((byte) -91, var8_ref);
                            if (var11 == 0) {
                              break L0;
                            } else {
                              break L2;
                            }
                          }
                        }
                        L7: {
                          if (-7 == (var2 ^ -1)) {
                            break L7;
                          } else {
                            L8: {
                              if ((var2 ^ -1) != -8) {
                                break L8;
                              } else {
                                var3_ref_gd = (gd) (Object) gl.field_p.c(false);
                                L9: while (true) {
                                  L10: {
                                    L11: {
                                      if (null == var3_ref_gd) {
                                        break L11;
                                      } else {
                                        var3_ref_gd.b(false);
                                        var3_ref_gd.e(param0 ^ -7);
                                        var3_ref_gd = (gd) (Object) gl.field_p.a((byte) -70);
                                        if (var11 != 0) {
                                          break L10;
                                        } else {
                                          if (var11 == 0) {
                                            continue L9;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                    ja.field_g = 0;
                                    break L10;
                                  }
                                  if (var11 == 0) {
                                    break L0;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            L12: {
                              if (8 != var2) {
                                break L12;
                              } else {
                                L13: {
                                  var3 = ((bh) (Object) var1).e(param0 ^ -122);
                                  var4_ref_el = (el) (Object) db.field_e.a((long)var3, param0 ^ -8);
                                  if (var4_ref_el != null) {
                                    break L13;
                                  } else {
                                    var4_ref = new el(hg.field_k);
                                    db.field_e.a((long)var3, (gb) (Object) var4_ref, param0 + 129);
                                    break L13;
                                  }
                                }
                                dh.a(true, true, var4_ref, (bh) (Object) var1);
                                ll.a(var4_ref, -40);
                                if (var11 == 0) {
                                  break L0;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            L14: {
                              if (9 == var2) {
                                break L14;
                              } else {
                                L15: {
                                  if (10 == var2) {
                                    break L15;
                                  } else {
                                    L16: {
                                      L17: {
                                        if (var2 == 11) {
                                          break L17;
                                        } else {
                                          if (-13 != (var2 ^ -1)) {
                                            break L16;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      L18: {
                                        var3 = ((bh) (Object) var1).e(param0 ^ -122);
                                        var4_ref_el = (el) (Object) db.field_e.a((long)var3, param0 ^ -8);
                                        if (var4_ref_el != null) {
                                          L19: {
                                            L20: {
                                              if (-12 != (var2 ^ -1)) {
                                                break L20;
                                              } else {
                                                var4_ref_el.field_Vb = true;
                                                if (var11 == 0) {
                                                  break L19;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            var4_ref_el.field_Wb = true;
                                            break L19;
                                          }
                                          ll.a(var4_ref_el, 107);
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L0;
                                      } else {
                                        break L16;
                                      }
                                    }
                                    L21: {
                                      if (var2 != 13) {
                                        break L21;
                                      } else {
                                        L22: {
                                          var3 = ((bh) (Object) var1).e(127);
                                          var4 = ((bh) (Object) var1).d((byte) -99);
                                          var5_ref_el = (el) (Object) db.field_e.a((long)var3, 1);
                                          if (null == var5_ref_el) {
                                            break L22;
                                          } else {
                                            L23: {
                                              var5_ref_el.field_Wb = false;
                                              var6 = (gd) (Object) var5_ref_el;
                                              ((el) (Object) var6).field_Vb = false;
                                              if (-1 == (var4 ^ -1)) {
                                                break L23;
                                              } else {
                                                var5_ref_el.field_gc = var4;
                                                var5_ref_el.field_Ub = u.field_a;
                                                break L23;
                                              }
                                            }
                                            ll.a(var5_ref_el, 104);
                                            break L22;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    L24: {
                                      L25: {
                                        if ((var2 ^ -1) == -15) {
                                          break L25;
                                        } else {
                                          if (-17 != (var2 ^ -1)) {
                                            break L24;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                      L26: {
                                        var3_long = ((bh) (Object) var1).c(255);
                                        var5_ref = (String) (Object) tm.a(var3_long, -26778);
                                        if (var5_ref == null) {
                                          break L26;
                                        } else {
                                          L27: {
                                            L28: {
                                              if (-15 == (var2 ^ -1)) {
                                                break L28;
                                              } else {
                                                if (!((gd) (Object) var5_ref).field_Kb) {
                                                  ((gd) (Object) var5_ref).field_Kb = true;
                                                  ja.field_g = ja.field_g + 1;
                                                  if (var11 == 0) {
                                                    break L27;
                                                  } else {
                                                    break L28;
                                                  }
                                                } else {
                                                  break L27;
                                                }
                                              }
                                            }
                                            ((gd) (Object) var5_ref).field_cc = true;
                                            break L27;
                                          }
                                          ul.a((byte) 96, (gd) (Object) var5_ref);
                                          break L26;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L0;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    L29: {
                                      L30: {
                                        if (var2 == 15) {
                                          break L30;
                                        } else {
                                          if ((var2 ^ -1) != -18) {
                                            break L29;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      L31: {
                                        var3_long = ((bh) (Object) var1).c(255);
                                        var5 = ((bh) (Object) var1).d((byte) -99);
                                        var6 = tm.a(var3_long, -26778);
                                        if (var6 != null) {
                                          L32: {
                                            L33: {
                                              if (15 == var2) {
                                                break L33;
                                              } else {
                                                if (var6.field_Kb) {
                                                  ja.field_g = ja.field_g - 1;
                                                  var6.field_Kb = false;
                                                  if (var11 == 0) {
                                                    break L32;
                                                  } else {
                                                    break L33;
                                                  }
                                                } else {
                                                  break L32;
                                                }
                                              }
                                            }
                                            var6.field_cc = false;
                                            break L32;
                                          }
                                          L34: {
                                            if ((var5 ^ -1) == -1) {
                                              break L34;
                                            } else {
                                              var6.field_Sb = u.field_a;
                                              var6.field_Xb = var5;
                                              break L34;
                                            }
                                          }
                                          ul.a((byte) -128, var6);
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L0;
                                      } else {
                                        break L29;
                                      }
                                    }
                                    L35: {
                                      if (-19 != (var2 ^ -1)) {
                                        break L35;
                                      } else {
                                        L36: {
                                          var3_long = ((bh) (Object) var1).c(255);
                                          var5_ref = ((bh) (Object) var1).g((byte) 81);
                                          var6 = (gd) (Object) ((bh) (Object) var1).g((byte) 81);
                                          var7 = (String) (Object) sf.a(-18701, var3_long);
                                          if (null == var7) {
                                            var7 = (String) (Object) new gd(var5_ref, (String) (Object) var6, var3_long);
                                            dg.field_g.a(var3_long, (gb) (Object) var7, 108);
                                            qb.field_N.field_jc = qb.field_N.field_jc + 1;
                                            break L36;
                                          } else {
                                            break L36;
                                          }
                                        }
                                        L37: {
                                          ((gd) (Object) var7).field_Pb = ((bh) (Object) var1).e(127);
                                          var8 = ((bh) (Object) var1).b((byte) 120);
                                          stackOut_100_0 = (String) var7;
                                          stackIn_102_0 = stackOut_100_0;
                                          stackIn_101_0 = stackOut_100_0;
                                          if ((1 & var8) == 0) {
                                            stackOut_102_0 = (String) (Object) stackIn_102_0;
                                            stackOut_102_1 = 0;
                                            stackIn_103_0 = stackOut_102_0;
                                            stackIn_103_1 = stackOut_102_1;
                                            break L37;
                                          } else {
                                            stackOut_101_0 = (String) (Object) stackIn_101_0;
                                            stackOut_101_1 = 1;
                                            stackIn_103_0 = stackOut_101_0;
                                            stackIn_103_1 = stackOut_101_1;
                                            break L37;
                                          }
                                        }
                                        ((gd) (Object) stackIn_103_0).field_Tb = stackIn_103_1 != 0;
                                        ((gd) (Object) var7).field_Qb = var8 >> -1023189855;
                                        ((gd) (Object) var7).field_dc = ((bh) (Object) var1).d((byte) -99);
                                        ((gd) (Object) var7).field_Ub = ((bh) (Object) var1).d((byte) -99);
                                        ui.field_d.a((mc) (Object) var7, false);
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                    L38: {
                                      if (19 != var2) {
                                        break L38;
                                      } else {
                                        L39: {
                                          var3_long = ((bh) (Object) var1).c(param0 ^ -250);
                                          var5 = ((bh) (Object) var1).d((byte) -99);
                                          var6 = sf.a(param0 + -18694, var3_long);
                                          if (null != var6) {
                                            L40: {
                                              L41: {
                                                if ((var5 ^ -1) != -1) {
                                                  break L41;
                                                } else {
                                                  var6.b(false);
                                                  if (var11 == 0) {
                                                    break L40;
                                                  } else {
                                                    break L41;
                                                  }
                                                }
                                              }
                                              var6.field_Xb = var5;
                                              var6.field_Sb = u.field_a;
                                              break L40;
                                            }
                                            var6.e(0);
                                            qb.field_N.field_jc = qb.field_N.field_jc - 1;
                                            break L39;
                                          } else {
                                            break L39;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                    L42: {
                                      if (20 == var2) {
                                        break L42;
                                      } else {
                                        L43: {
                                          if (-22 == (var2 ^ -1)) {
                                            break L43;
                                          } else {
                                            L44: {
                                              if (var2 == 22) {
                                                break L44;
                                              } else {
                                                L45: {
                                                  if ((var2 ^ -1) == -24) {
                                                    break L45;
                                                  } else {
                                                    fk.a(-126, (Throwable) null, "L1: " + hc.a(false));
                                                    mk.a(false);
                                                    if (var11 == 0) {
                                                      break L0;
                                                    } else {
                                                      break L45;
                                                    }
                                                  }
                                                }
                                                oj.field_c = ((bh) (Object) var1).c(255);
                                                if (var11 == 0) {
                                                  break L0;
                                                } else {
                                                  break L44;
                                                }
                                              }
                                            }
                                            aa.field_Pb = ((bh) (Object) var1).e(127);
                                            mc.field_l = ((bh) (Object) var1).b((byte) 120);
                                            if (var11 == 0) {
                                              break L0;
                                            } else {
                                              break L43;
                                            }
                                          }
                                        }
                                        L46: {
                                          L47: {
                                            var3 = ((bh) (Object) var1).e(param0 ^ -122);
                                            if (var3 != 0) {
                                              break L47;
                                            } else {
                                              un.field_f = 0L;
                                              if (var11 == 0) {
                                                break L46;
                                              } else {
                                                break L47;
                                              }
                                            }
                                          }
                                          un.field_f = k.a(0) + (long)var3;
                                          break L46;
                                        }
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L42;
                                        }
                                      }
                                    }
                                    dh.a(false, true, qb.field_N, (bh) (Object) var1);
                                    if (var11 == 0) {
                                      break L0;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                var3_ref_el = (el) (Object) jl.field_a.c(false);
                                L48: while (true) {
                                  L49: {
                                    if (var3_ref_el == null) {
                                      break L49;
                                    } else {
                                      var3_ref_el.b(false);
                                      var3_ref_el.e(0);
                                      var3_ref_el = (el) (Object) jl.field_a.a((byte) -70);
                                      if (var11 != 0) {
                                        break L0;
                                      } else {
                                        if (var11 == 0) {
                                          continue L48;
                                        } else {
                                          break L49;
                                        }
                                      }
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L0;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            L50: {
                              var3 = ((bh) (Object) var1).e(127);
                              var4 = ((bh) (Object) var1).d((byte) -99);
                              var5_ref_el = (el) (Object) db.field_e.a((long)var3, 1);
                              if (var5_ref_el != null) {
                                L51: {
                                  L52: {
                                    if (0 != var4) {
                                      break L52;
                                    } else {
                                      var5_ref_el.b(false);
                                      if (var11 == 0) {
                                        break L51;
                                      } else {
                                        break L52;
                                      }
                                    }
                                  }
                                  var5_ref_el.field_Ub = u.field_a;
                                  var5_ref_el.field_gc = var4;
                                  break L51;
                                }
                                var5_ref_el.e(0);
                                break L50;
                              } else {
                                break L50;
                              }
                            }
                            if (var11 == 0) {
                              break L0;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L53: {
                          var3_long = ((bh) (Object) var1).c(param0 + 262);
                          var5 = ((bh) (Object) var1).d((byte) -99);
                          var6 = tm.a(var3_long, -26778);
                          if (null != var6) {
                            L54: {
                              if (!var6.field_Kb) {
                                break L54;
                              } else {
                                ja.field_g = ja.field_g - 1;
                                var6.field_Kb = false;
                                break L54;
                              }
                            }
                            L55: {
                              L56: {
                                if ((var5 ^ -1) == -1) {
                                  break L56;
                                } else {
                                  var6.field_Sb = u.field_a;
                                  var6.field_Xb = var5;
                                  if (var11 == 0) {
                                    break L55;
                                  } else {
                                    break L56;
                                  }
                                }
                              }
                              var6.b(false);
                              break L55;
                            }
                            var6.e(0);
                            break L53;
                          } else {
                            break L53;
                          }
                        }
                        if (var11 == 0) {
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var3_ref_gd = (gd) (Object) ui.field_d.c(false);
            L57: while (true) {
              L58: {
                L59: {
                  if (var3_ref_gd == null) {
                    break L59;
                  } else {
                    var3_ref_gd.b(false);
                    var3_ref_gd.e(0);
                    var3_ref_gd = (gd) (Object) ui.field_d.a((byte) -70);
                    if (var11 != 0) {
                      break L58;
                    } else {
                      if (var11 == 0) {
                        continue L57;
                      } else {
                        break L59;
                      }
                    }
                  }
                }
                var3_ref_gd = (gd) (Object) db.field_a.b(108);
                break L58;
              }
              L60: while (true) {
                L61: {
                  L62: {
                    if (var3_ref_gd == null) {
                      break L62;
                    } else {
                      stackOut_166_0 = var3_ref_gd.field_cc;
                      stackIn_179_0 = stackOut_166_0 ? 1 : 0;
                      stackIn_167_0 = stackOut_166_0;
                      if (var11 != 0) {
                        break L61;
                      } else {
                        stackOut_167_0 = stackIn_167_0;
                        stackIn_168_0 = stackOut_167_0;
                        L63: {
                          L64: {
                            if (stackIn_168_0) {
                              break L64;
                            } else {
                              if (!var3_ref_gd.field_Kb) {
                                break L63;
                              } else {
                                break L64;
                              }
                            }
                          }
                          L65: {
                            var3_ref_gd.field_cc = false;
                            if (var3_ref_gd.field_Kb) {
                              ja.field_g = ja.field_g - 1;
                              var3_ref_gd.field_Kb = false;
                              break L65;
                            } else {
                              break L65;
                            }
                          }
                          ul.a((byte) 127, var3_ref_gd);
                          break L63;
                        }
                        var3_ref_gd = (gd) (Object) db.field_a.d(param0 ^ 6);
                        if (var11 == 0) {
                          continue L60;
                        } else {
                          break L62;
                        }
                      }
                    }
                  }
                  stackOut_178_0 = var2 ^ -1;
                  stackIn_179_0 = stackOut_178_0;
                  break L61;
                }
                L66: {
                  if (stackIn_179_0 != -2) {
                    break L66;
                  } else {
                    if (null == qb.field_N) {
                      break L66;
                    } else {
                      ll.field_t = qb.field_N.field_ec;
                      break L66;
                    }
                  }
                }
                L67: {
                  L68: {
                    if ((var2 ^ -1) == -5) {
                      break L68;
                    } else {
                      qb.field_N = null;
                      if (var11 == 0) {
                        break L67;
                      } else {
                        break L68;
                      }
                    }
                  }
                  var3 = ((bh) (Object) var1).e(param0 + 134);
                  qb.field_N = new el(hg.field_k);
                  qb.field_N.a((long)var3, 17260);
                  dh.a(false, true, qb.field_N, (bh) (Object) var1);
                  un.field_f = 0L;
                  break L67;
                }
                L69: {
                  L70: {
                    if (var2 == 2) {
                      break L70;
                    } else {
                      if ((var2 ^ -1) == -4) {
                        break L70;
                      } else {
                        qe.field_a = null;
                        if (var11 == 0) {
                          break L69;
                        } else {
                          break L70;
                        }
                      }
                    }
                  }
                  if (qe.field_a == null) {
                    qe.field_a = new el(hg.field_k);
                    break L69;
                  } else {
                    break L69;
                  }
                }
                L71: {
                  if (3 != var2) {
                    break L71;
                  } else {
                    kl.field_a = true;
                    var3 = 0;
                    L72: while (true) {
                      L73: {
                        L74: {
                          if ((km.field_o.length ^ -1) >= (var3 ^ -1)) {
                            break L74;
                          } else {
                            km.field_o[var3] = ((bh) (Object) var1).g(param0 + -1772093430);
                            var3++;
                            if (var11 != 0) {
                              break L73;
                            } else {
                              if (var11 == 0) {
                                continue L72;
                              } else {
                                break L74;
                              }
                            }
                          }
                        }
                        ni.field_c = ((bh) (Object) var1).d((byte) -99);
                        qa.field_A = ((bh) (Object) var1).d((byte) -99);
                        break L73;
                      }
                      var3 = 0;
                      L75: while (true) {
                        L76: {
                          if ((lo.field_a.length ^ -1) >= (var3 ^ -1)) {
                            break L76;
                          } else {
                            lo.field_a[var3] = ((bh) (Object) var1).g(-1772093437);
                            var3++;
                            if (var11 != 0) {
                              break L0;
                            } else {
                              if (var11 == 0) {
                                continue L75;
                              } else {
                                break L76;
                              }
                            }
                          }
                        }
                        if (var11 == 0) {
                          break L0;
                        } else {
                          break L71;
                        }
                      }
                    }
                  }
                }
                kl.field_a = false;
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 < -37) {
                break L0;
              } else {
                vf.a((byte) -19);
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
        }
    }

    static {
    }
}
