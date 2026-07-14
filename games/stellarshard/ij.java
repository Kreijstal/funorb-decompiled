/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends ib {
    int field_u;
    int field_t;
    int field_s;
    int field_r;
    private boolean field_o;
    int field_p;
    private int field_q;

    final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_32_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        boolean stackIn_72_0 = false;
        boolean stackIn_80_0 = false;
        boolean stackIn_88_0 = false;
        int stackIn_105_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_117_0 = 0;
        boolean stackIn_124_0 = false;
        boolean stackIn_132_0 = false;
        boolean stackIn_140_0 = false;
        int stackOut_31_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        boolean stackOut_71_0 = false;
        boolean stackOut_79_0 = false;
        boolean stackOut_87_0 = false;
        int stackOut_104_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_116_0 = 0;
        boolean stackOut_123_0 = false;
        boolean stackOut_131_0 = false;
        boolean stackOut_139_0 = false;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = stellarshard.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (fb.field_n > 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var2_int = 0;
                        var3 = ((ij) this).field_j + -1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!s.field_i) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 -= 3;
                        if ((mk.field_k ^ -1) >= -1) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3--;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((of.field_A ^ -1) >= -2) {
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var2_int = 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (tl.field_c == 4) {
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
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var2_int = 8;
                        var3 = 9;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (tl.field_c != 1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var3 = 10;
                        var2_int = 9;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-3 != (tl.field_c ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var2_int = 8;
                        var3 = 10;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((tl.field_c ^ -1) == -4) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var2_int = 8;
                        var3 = 10;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (param0 != tl.field_c) {
                            statePc = 38;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = -97;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 != (gi.field_f ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ((ij) this).field_l = 1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((tl.field_c ^ -1) != -9) {
                            statePc = 48;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = gi.field_f;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((stackIn_42_0 ^ -1) == -98) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ((ij) this).field_l = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (gi.field_f != 98) {
                            statePc = 98;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((tl.field_c ^ -1) == -1) {
                            statePc = 70;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = tl.field_c;
                        stackIn_53_0 = stackOut_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if ((stackIn_53_0 ^ -1) == -5) {
                            statePc = 70;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = tl.field_c;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0 == 1) {
                            statePc = 70;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackOut_60_0 = tl.field_c;
                        stackIn_61_0 = stackOut_60_0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (stackIn_61_0 == 2) {
                            statePc = 70;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = 3;
                        stackIn_65_0 = stackOut_64_0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (stackIn_65_0 == tl.field_c) {
                            statePc = 70;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        ((ij) this).field_l = ((ij) this).field_l - 1;
                        if ((((ij) this).field_l ^ -1) != -1) {
                            statePc = 78;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = s.field_i;
                        stackIn_72_0 = stackOut_71_0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (stackIn_72_0) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        ((ij) this).field_l = -1 + var3;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (1 != ((ij) this).field_l) {
                            statePc = 86;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackOut_79_0 = s.field_i;
                        stackIn_80_0 = stackOut_79_0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (stackIn_80_0) {
                            statePc = 85;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        ((ij) this).field_l = ((ij) this).field_l - 1;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((var2_int ^ -1) >= (((ij) this).field_l ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackOut_87_0 = s.field_i;
                        stackIn_88_0 = stackOut_87_0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (stackIn_88_0) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        ((ij) this).field_l = 1;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (var2_int > ((ij) this).field_l) {
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
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        ((ij) this).field_l = var3 + -1;
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (gi.field_f != 99) {
                            statePc = 154;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (-1 == (tl.field_c ^ -1)) {
                            statePc = 120;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        stackOut_104_0 = -5;
                        stackIn_105_0 = stackOut_104_0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (stackIn_105_0 == (tl.field_c ^ -1)) {
                            statePc = 120;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackOut_108_0 = -2;
                        stackIn_109_0 = stackOut_108_0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (stackIn_109_0 == (tl.field_c ^ -1)) {
                            statePc = 120;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackOut_112_0 = 2;
                        stackIn_113_0 = stackOut_112_0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (stackIn_113_0 == tl.field_c) {
                            statePc = 120;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        stackOut_116_0 = -4;
                        stackIn_117_0 = stackOut_116_0;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (stackIn_117_0 != (tl.field_c ^ -1)) {
                            statePc = 159;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        ((ij) this).field_l = ((ij) this).field_l + 1;
                        if (((ij) this).field_l != 2) {
                            statePc = 130;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = s.field_i;
                        stackIn_124_0 = stackOut_123_0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (!stackIn_124_0) {
                            statePc = 130;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        ((ij) this).field_l = var2_int;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (((ij) this).field_l != 1) {
                            statePc = 138;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        stackOut_131_0 = s.field_i;
                        stackIn_132_0 = stackOut_131_0;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (stackIn_132_0) {
                            statePc = 137;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        ((ij) this).field_l = ((ij) this).field_l + 1;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if ((((ij) this).field_l ^ -1) > (var3 ^ -1)) {
                            statePc = 146;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        stackOut_139_0 = s.field_i;
                        stackIn_140_0 = stackOut_139_0;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (stackIn_140_0) {
                            statePc = 145;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        ((ij) this).field_l = 1;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (((ij) this).field_l < var2_int) {
                            statePc = 149;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        ((ij) this).field_l = var2_int;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if ((var3 ^ -1) >= (((ij) this).field_l ^ -1)) {
                            statePc = 153;
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
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        ((ij) this).field_l = var2_int;
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        this.c(((ij) this).field_l, -3);
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 158: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var2, "ij.I(" + param0 + 41);
                }
                case 159: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_41_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2 < ((ij) this).field_e) {
                            statePc = 8;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = param2;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((stackIn_2_0 ^ -1) <= (((ij) this).field_i ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((((ij) this).field_b ^ -1) >= (param1 ^ -1)) {
                            statePc = 10;
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
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = -1;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    try {
                        if (param0 == 59) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        boolean discarded$2 = this.a(-41, -5, true, 42, true, (String) null, -77);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_int = (param1 - ((ij) this).field_b) / ((ij) this).field_a;
                        if (((ij) this).field_j > var4_int) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = -1;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    try {
                        if (!s.field_i) {
                            statePc = 41;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = tl.field_c;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((stackIn_19_0 ^ -1) == -1) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((var4_int ^ -1) > -2) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var4_int++;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var4_int ^ -1) >= -5) {
                            statePc = 36;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = mk.field_k;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 <= 0) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var4_int = 1;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (5 >= var4_int) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((mk.field_k ^ -1) >= -1) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var4_int = 1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = var4_int;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    return stackIn_42_0;
                }
                case 43: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var4, "ij.J(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_21_0 = false;
        int stackIn_25_0 = 0;
        Object stackIn_38_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_70_0 = 0;
        Object stackIn_90_0 = null;
        Object stackIn_92_0 = null;
        Object stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        Object stackIn_94_0 = null;
        Object stackIn_96_0 = null;
        Object stackIn_98_0 = null;
        Object stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_120_0 = 0;
        boolean stackIn_133_0 = false;
        Object stackIn_140_0 = null;
        Object stackIn_142_0 = null;
        Object stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        Object stackIn_144_0 = null;
        Object stackIn_146_0 = null;
        Object stackIn_148_0 = null;
        Object stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_20_0 = false;
        int stackOut_24_0 = 0;
        Object stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_42_0 = null;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_69_0 = 0;
        Object stackOut_89_0 = null;
        Object stackOut_90_0 = null;
        Object stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        Object stackOut_93_0 = null;
        Object stackOut_94_0 = null;
        Object stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        Object stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_119_0 = 0;
        boolean stackOut_132_0 = false;
        Object stackOut_139_0 = null;
        Object stackOut_140_0 = null;
        Object stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        Object stackOut_143_0 = null;
        Object stackOut_144_0 = null;
        Object stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        Object stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = stellarshard.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == 8) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((ij) this).field_o = true;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-3 != (tl.field_c ^ -1)) {
                            statePc = 14;
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
                        stackOut_6_0 = param3;
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
                        if ((stackIn_7_0 ^ -1) != -9) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = -1;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!ah.a(stackIn_11_0)) {
                            statePc = 165;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (0 != tl.field_c) {
                            statePc = 162;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (1 != param3) {
                            statePc = 28;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = s.field_i;
                        stackIn_21_0 = stackOut_20_0;
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
                        if (stackIn_21_0) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = -2;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 > (of.field_A ^ -1)) {
                            statePc = 139;
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
                        if ((param3 ^ -1) == -4) {
                            statePc = 89;
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
                        if (4 == param3) {
                            statePc = 37;
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
                        super.a(param0, param1, (byte) 8, param3, param4, param5);
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
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
                        stackOut_37_0 = this;
                        stackIn_46_0 = stackOut_37_0;
                        stackIn_38_0 = stackOut_37_0;
                        if (320 > param1) {
                            statePc = 46;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = this;
                        stackIn_40_0 = stackOut_38_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = this;
                        stackOut_40_1 = param1;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = this;
                        stackIn_46_0 = stackOut_41_0;
                        stackIn_42_0 = stackOut_41_0;
                        if ((stackIn_41_1 ^ -1) <= -421) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = this;
                        stackIn_44_0 = stackOut_42_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = this;
                        stackOut_44_1 = 1;
                        stackIn_47_0 = stackOut_44_0;
                        stackIn_47_1 = stackOut_44_1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = this;
                        stackOut_46_1 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ((ij) this).field_o = stackIn_47_1 != 0;
                        if (param5) {
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
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((ij) this).field_o = true;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (!((ij) this).field_o) {
                            statePc = 66;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ai.field_c = param1 + -320;
                        if (ai.field_c < 0) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        ai.field_c = 0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (-101 <= (ai.field_c ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        ai.field_c = 100;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (vf.field_L == null) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        vf.field_L = fe.field_c;
                        nj.field_o.a((p) (Object) vf.field_L);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((320 + -l.field_f.b(of.field_D) ^ -1) < (param1 ^ -1)) {
                            statePc = 85;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackOut_69_0 = param1;
                        stackIn_70_0 = stackOut_69_0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (stackIn_70_0 < 320) {
                            statePc = 75;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (!param5) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (null == vf.field_L) {
                            statePc = 82;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        nj.field_o.b((p) (Object) vf.field_L);
                        vf.field_L.c();
                        vf.field_L = null;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
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
                        vf.field_L = fe.field_c;
                        nj.field_o.a((p) (Object) vf.field_L);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (vf.field_L != null) {
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
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        vf.field_L.d(ai.field_c / 2);
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackOut_89_0 = this;
                        stackIn_98_0 = stackOut_89_0;
                        stackIn_90_0 = stackOut_89_0;
                        if (-321 < (param1 ^ -1)) {
                            statePc = 98;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackOut_90_0 = this;
                        stackIn_92_0 = stackOut_90_0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackOut_92_0 = this;
                        stackOut_92_1 = param1;
                        stackIn_93_0 = stackOut_92_0;
                        stackIn_93_1 = stackOut_92_1;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackOut_93_0 = this;
                        stackIn_98_0 = stackOut_93_0;
                        stackIn_94_0 = stackOut_93_0;
                        if ((stackIn_93_1 ^ -1) <= -421) {
                            statePc = 98;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        stackOut_94_0 = this;
                        stackIn_96_0 = stackOut_94_0;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackOut_96_0 = this;
                        stackOut_96_1 = 1;
                        stackIn_99_0 = stackOut_96_0;
                        stackIn_99_1 = stackOut_96_1;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        stackOut_98_0 = this;
                        stackOut_98_1 = 0;
                        stackIn_99_0 = stackOut_98_0;
                        stackIn_99_1 = stackOut_98_1;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        ((ij) this).field_o = stackIn_99_1 != 0;
                        if (!param5) {
                            statePc = 103;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        ((ij) this).field_o = true;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (((ij) this).field_o) {
                            statePc = 121;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if ((param1 ^ -1) > (320 - l.field_f.b(vl.field_h) ^ -1)) {
                            statePc = 131;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        stackOut_107_0 = param1;
                        stackIn_108_0 = stackOut_107_0;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (stackIn_108_0 < 320) {
                            statePc = 113;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (param5) {
                            statePc = 131;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (fe.field_e) {
                            statePc = 119;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackOut_117_0 = 1;
                        stackIn_120_0 = stackOut_117_0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        stackOut_119_0 = 0;
                        stackIn_120_0 = stackOut_119_0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        fe.field_e = stackIn_120_0 != 0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        pk.field_h = param1 - 320;
                        fe.field_e = true;
                        if (pk.field_h >= 0) {
                            statePc = 127;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        pk.field_h = 0;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if ((pk.field_h ^ -1) < -101) {
                            statePc = 130;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        pk.field_h = 100;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (!fe.field_e) {
                            statePc = 182;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackOut_132_0 = param5;
                        stackIn_133_0 = stackOut_132_0;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (stackIn_133_0) {
                            statePc = 182;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        ll.field_c.a(sb.field_e[0], 50, pk.field_h * 2);
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        stackOut_139_0 = this;
                        stackIn_148_0 = stackOut_139_0;
                        stackIn_140_0 = stackOut_139_0;
                        if (-321 < (param1 ^ -1)) {
                            statePc = 148;
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
                        stackOut_140_0 = this;
                        stackIn_142_0 = stackOut_140_0;
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
                        stackOut_142_0 = this;
                        stackOut_142_1 = -421;
                        stackIn_143_0 = stackOut_142_0;
                        stackIn_143_1 = stackOut_142_1;
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
                        stackOut_143_0 = this;
                        stackIn_148_0 = stackOut_143_0;
                        stackIn_144_0 = stackOut_143_0;
                        if (stackIn_143_1 >= (param1 ^ -1)) {
                            statePc = 148;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        stackOut_144_0 = this;
                        stackIn_146_0 = stackOut_144_0;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        stackOut_146_0 = this;
                        stackOut_146_1 = 1;
                        stackIn_149_0 = stackOut_146_0;
                        stackIn_149_1 = stackOut_146_1;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        stackOut_148_0 = this;
                        stackOut_148_1 = 0;
                        stackIn_149_0 = stackOut_148_0;
                        stackIn_149_1 = stackOut_148_1;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        ((ij) this).field_o = stackIn_149_1 != 0;
                        if (!param5) {
                            statePc = 153;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        ((ij) this).field_o = true;
                        statePc = 151;
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
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (!((ij) this).field_o) {
                            statePc = 182;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        var7_int = -320 + param1;
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (0 > var7_int) {
                            statePc = 158;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        var7_int = 0;
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        if (100 >= var7_int) {
                            statePc = 161;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        var7_int = 100;
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        qi.field_a = 1 + (-2 + of.field_A * var7_int) / 100;
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        super.a(param0, param1, (byte) 8, param3, param4, param5);
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        if (ni.field_e >= 224) {
                            statePc = 171;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        si.field_X = 0;
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (416 < ni.field_e) {
                            statePc = 177;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        si.field_X = 1;
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 179;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 179;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        si.field_X = 2;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 179;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 181: {
                    var7 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var7, "ij.K(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
                }
                case 182: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = stellarshard.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (1 != param0) {
                            statePc = 20;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = s.field_i;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0) {
                            statePc = 20;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = of.field_A;
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
                        if ((stackIn_7_0 ^ -1) >= -2) {
                            statePc = 20;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = tl.field_c;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((stackIn_11_0 ^ -1) != -1) {
                            statePc = 20;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        qi.field_a = qi.field_a - 1;
                        if (1 > qi.field_a) {
                            statePc = 19;
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        qi.field_a = 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((param0 ^ -1) != -4) {
                            statePc = 29;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        pk.field_h = pk.field_h - 12;
                        if (pk.field_h >= 10) {
                            statePc = 45;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        pk.field_h = 10;
                        fe.field_e = false;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (4 == param0) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ai.field_c = ai.field_c - 12;
                        if (-11 >= (ai.field_c ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ai.field_c = 10;
                        if (vf.field_L == null) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        nj.field_o.b((p) (Object) vf.field_L);
                        vf.field_L.c();
                        vf.field_L = null;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (null != vf.field_L) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        vf.field_L.d(ai.field_c / 2);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (param1 == -1) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((ij) this).field_s = -58;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var3, "ij.B(" + param0 + 44 + param1 + 41);
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_48_0 = 0;
        boolean stackIn_58_0 = false;
        int stackIn_93_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_185_0 = 0;
        qe[] stackIn_192_0 = null;
        int stackIn_196_0 = 0;
        Object stackIn_206_0 = null;
        qe[] stackIn_210_0 = null;
        int stackIn_238_0 = 0;
        qe[] stackIn_327_0 = null;
        Object stackIn_361_0 = null;
        Object stackIn_363_0 = null;
        Object stackIn_364_0 = null;
        boolean stackIn_364_1 = false;
        Object stackIn_365_0 = null;
        Object stackIn_367_0 = null;
        Object stackIn_369_0 = null;
        Object stackIn_370_0 = null;
        int stackIn_370_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_47_0 = 0;
        boolean stackOut_57_0 = false;
        int stackOut_92_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_184_0 = 0;
        qe[] stackOut_191_0 = null;
        int stackOut_195_0 = 0;
        Object stackOut_205_0 = null;
        qe[] stackOut_209_0 = null;
        int stackOut_235_0 = 0;
        int stackOut_237_0 = 0;
        qe[] stackOut_326_0 = null;
        Object stackOut_360_0 = null;
        Object stackOut_361_0 = null;
        Object stackOut_363_0 = null;
        boolean stackOut_363_1 = false;
        Object stackOut_364_0 = null;
        Object stackOut_365_0 = null;
        Object stackOut_367_0 = null;
        int stackOut_367_1 = 0;
        Object stackOut_369_0 = null;
        int stackOut_369_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = stellarshard.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!pk.a(-12663, 0)) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (fe.field_e) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ll.field_c.a(sb.field_e[51 + (int)(Math.random() * 10.0)], (int)(Math.random() * 100.0) + 50, pk.field_h * 2);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0 == 424) {
                            statePc = 12;
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
                        this.a(true, 82);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (tl.field_c != 8) {
                            statePc = 35;
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
                        if ((param1 ^ -1) != -1) {
                            statePc = 30;
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
                        if (!v.field_e) {
                            statePc = 22;
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
                        ((ij) this).field_l = -1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
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
                        stackOut_22_0 = this;
                        stackIn_27_0 = stackOut_22_0;
                        stackIn_23_0 = stackOut_22_0;
                        if ((of.field_A ^ -1) >= -2) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = this;
                        stackIn_25_0 = stackOut_23_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = this;
                        stackOut_25_1 = 0;
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = this;
                        stackOut_27_1 = 1;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ((ij) this).field_l = stackIn_28_1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        n.field_L = 255;
                        tl.field_c = 0;
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (-2 == (param1 ^ -1)) {
                            statePc = 373;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (tl.field_c != 3) {
                            statePc = 86;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = -1;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 == (fb.field_n ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = 1;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 != gh.field_c) {
                            statePc = 86;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (-9 != (param1 ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = param0;
                        stackIn_48_0 = stackOut_47_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (!ah.a(stackIn_48_0 ^ -425)) {
                            statePc = 54;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        am.a(3, 3, param0 ^ 466);
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (-9 != (param1 ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = oc.field_d;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0) {
                            statePc = 77;
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
                        if ((param1 ^ -1) == -10) {
                            statePc = 66;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        n.field_L = 255;
                        if (!v.field_e) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        ((ij) this).field_l = -1;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
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
                        ((ij) this).field_l = 7;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        tl.field_c = 0;
                        if (!oa.field_D) {
                            statePc = 76;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        tl.field_c = 8;
                        oa.field_D = true;
                        ta.a(v.field_e, 713);
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        tl.field_c = 2;
                        oc.field_d = false;
                        n.field_L = 255;
                        if (v.field_e) {
                            statePc = 83;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        ((ij) this).field_l = 9;
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        ((ij) this).field_l = -1;
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (2 != tl.field_c) {
                            statePc = 124;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if ((param1 ^ -1) != -9) {
                            statePc = 99;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackOut_92_0 = -1;
                        stackIn_93_0 = stackOut_92_0;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (!ah.a(stackIn_93_0)) {
                            statePc = 99;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        am.a(2, 2, param0 + -544);
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if ((param1 ^ -1) == -9) {
                            statePc = 118;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if ((param1 ^ -1) == -10) {
                            statePc = 107;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        n.field_L = 255;
                        if (v.field_e) {
                            statePc = 111;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        ((ij) this).field_l = 6;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        ((ij) this).field_l = -1;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        tl.field_c = 0;
                        if (!oa.field_D) {
                            statePc = 117;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        oa.field_D = true;
                        tl.field_c = 8;
                        ta.a(v.field_e, 713);
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        si.field_X = si.field_X + 1;
                        if (3 > si.field_X) {
                            statePc = 373;
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
                        si.field_X = si.field_X - 3;
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (-2 == (tl.field_c ^ -1)) {
                            statePc = 351;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (4 != tl.field_c) {
                            statePc = 164;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if ((param1 ^ -1) == -9) {
                            statePc = 135;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (v.field_e) {
                            statePc = 139;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        ((ij) this).field_l = 9;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        ((ij) this).field_l = -1;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        tl.field_c = 0;
                        n.field_L = 255;
                        gh.field_d = null;
                        if (ah.a(-1)) {
                            statePc = 161;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (0 < ue.field_a) {
                            statePc = 148;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        tl.field_c = 2;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (!oc.field_d) {
                            statePc = 153;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        tl.field_c = 3;
                        statePc = 151;
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
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (tl.field_c != 0) {
                            statePc = 156;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        if (mk.field_k <= 0) {
                            statePc = 159;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        stackOut_157_0 = 1;
                        stackIn_160_0 = stackOut_157_0;
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        stackOut_159_0 = 0;
                        stackIn_160_0 = stackOut_159_0;
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        oa.field_D = stackIn_160_0 != 0;
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        oc.field_d = false;
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (tl.field_c == 0) {
                            statePc = 169;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        var3_int = ((ij) this).field_j;
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        if (s.field_i) {
                            statePc = 173;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        var3_int -= 3;
                        if (-1 <= (mk.field_k ^ -1)) {
                            statePc = 176;
                        } else {
                            statePc = 174;
                        }
                        continue stateLoop;
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
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        var3_int--;
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        if (var3_int > param1) {
                            statePc = 179;
                        } else {
                            statePc = 178;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 178: {
                    return;
                }
                case 179: {
                    try {
                        if (-9 != (param1 ^ -1)) {
                            statePc = 188;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        stackOut_180_0 = fb.field_n;
                        stackIn_181_0 = stackOut_180_0;
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        if ((stackIn_181_0 ^ -1) == -1) {
                            statePc = 343;
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
                case 184: {
                    try {
                        stackOut_184_0 = -2;
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
                        if (stackIn_185_0 == (gh.field_c ^ -1)) {
                            statePc = 343;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        if (param1 != 0) {
                            statePc = 202;
                        } else {
                            statePc = 189;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        stackOut_191_0 = a.field_h;
                        stackIn_192_0 = stackOut_191_0;
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
                        if (stackIn_192_0[0] == null) {
                            statePc = 202;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        stackOut_195_0 = 0;
                        stackIn_196_0 = stackOut_195_0;
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        if (stackIn_196_0 != (a.field_h[0].field_m ^ -1)) {
                            statePc = 202;
                        } else {
                            statePc = 197;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        na.field_j = null;
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        if ((param1 ^ -1) != -1) {
                            statePc = 226;
                        } else {
                            statePc = 203;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        statePc = 205;
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        stackOut_205_0 = null;
                        stackIn_206_0 = stackOut_205_0;
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        if (stackIn_206_0 == (Object) (Object) a.field_h[0]) {
                            statePc = 213;
                        } else {
                            statePc = 207;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        statePc = 209;
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        stackOut_209_0 = a.field_h;
                        stackIn_210_0 = stackOut_209_0;
                        statePc = 210;
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        if ((stackIn_210_0[0].field_m ^ -1) == 0) {
                            statePc = 226;
                        } else {
                            statePc = 211;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        if (-2 <= (of.field_A ^ -1)) {
                            statePc = 350;
                        } else {
                            statePc = 214;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        ea.e((byte) 97);
                        vc.field_h.m((byte) 127);
                        na.field_j = null;
                        stellarshard.field_K = false;
                        bi.field_u = null;
                        if ((qi.field_a ^ -1) >= -1) {
                            statePc = 222;
                        } else {
                            statePc = 217;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        qi.field_a = qi.field_a - 1;
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        statePc = 222;
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        nf.field_r = false;
                        s.field_i = true;
                        tl.field_a = 0;
                        if (-1 != (qi.field_a ^ -1)) {
                            statePc = 350;
                        } else {
                            statePc = 223;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 225;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        nf.field_r = true;
                        stellarshard.field_K = true;
                        e.field_c = false;
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 228;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        if (1 == param1) {
                            statePc = 323;
                        } else {
                            statePc = 227;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        statePc = 229;
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        if (-4 != (param1 ^ -1)) {
                            statePc = 239;
                        } else {
                            statePc = 230;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        statePc = 232;
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        if (fe.field_e) {
                            statePc = 237;
                        } else {
                            statePc = 233;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 236;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        statePc = 235;
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 236;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 236;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        stackOut_235_0 = 1;
                        stackIn_238_0 = stackOut_235_0;
                        statePc = 238;
                        continue stateLoop;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 236;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        stackOut_237_0 = 0;
                        stackIn_238_0 = stackOut_237_0;
                        statePc = 238;
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        fe.field_e = stackIn_238_0 != 0;
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 241;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        if (4 != param1) {
                            statePc = 251;
                        } else {
                            statePc = 240;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 244;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        statePc = 242;
                        continue stateLoop;
                    } catch (Throwable stateCaught_240) {
                        caughtException = stateCaught_240;
                        statePc = 244;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 244;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        if (null != vf.field_L) {
                            statePc = 248;
                        } else {
                            statePc = 243;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        statePc = 245;
                        continue stateLoop;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        vf.field_L = fe.field_c;
                        nj.field_o.a((p) (Object) vf.field_L);
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        nj.field_o.b((p) (Object) vf.field_L);
                        vf.field_L.c();
                        vf.field_L = null;
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 253;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 253;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        if (-3 != (param1 ^ -1)) {
                            statePc = 267;
                        } else {
                            statePc = 252;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 256;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        statePc = 254;
                        continue stateLoop;
                    } catch (Throwable stateCaught_252) {
                        caughtException = stateCaught_252;
                        statePc = 256;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 256;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        if (1 != tl.field_c) {
                            statePc = 259;
                        } else {
                            statePc = 255;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 258;
                        continue stateLoop;
                    }
                }
                case 255: {
                    try {
                        statePc = 257;
                        continue stateLoop;
                    } catch (Throwable stateCaught_255) {
                        caughtException = stateCaught_255;
                        statePc = 258;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 258;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        statePc = 260;
                        continue stateLoop;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 258;
                        continue stateLoop;
                    }
                }
                case 258: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_258) {
                        caughtException = stateCaught_258;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        n.field_L = 255;
                        statePc = 260;
                        continue stateLoop;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        tl.field_c = 1;
                        if (v.field_e) {
                            statePc = 264;
                        } else {
                            statePc = 261;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 263;
                        continue stateLoop;
                    }
                }
                case 261: {
                    try {
                        ((ij) this).field_l = 9;
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 266;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 266;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        ((ij) this).field_l = -1;
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 269;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 269;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        if (param1 != 7) {
                            statePc = 288;
                        } else {
                            statePc = 268;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 272;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        statePc = 270;
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 272;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 272;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        if (s.field_i) {
                            statePc = 287;
                        } else {
                            statePc = 271;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 275;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        statePc = 273;
                        continue stateLoop;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 275;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 275;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        if ((tl.field_c ^ -1) != -4) {
                            statePc = 278;
                        } else {
                            statePc = 274;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        statePc = 276;
                        continue stateLoop;
                    } catch (Throwable stateCaught_274) {
                        caughtException = stateCaught_274;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 275: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_275) {
                        caughtException = stateCaught_275;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        statePc = 279;
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 277: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_277) {
                        caughtException = stateCaught_277;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        n.field_L = 255;
                        statePc = 279;
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 279: {
                    try {
                        if (!v.field_e) {
                            statePc = 283;
                        } else {
                            statePc = 280;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_279) {
                        caughtException = stateCaught_279;
                        statePc = 282;
                        continue stateLoop;
                    }
                }
                case 280: {
                    try {
                        ((ij) this).field_l = -1;
                        statePc = 286;
                        continue stateLoop;
                    } catch (Throwable stateCaught_280) {
                        caughtException = stateCaught_280;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 282: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_282) {
                        caughtException = stateCaught_282;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 283: {
                    try {
                        ((ij) this).field_l = 9;
                        statePc = 284;
                        continue stateLoop;
                    } catch (Throwable stateCaught_283) {
                        caughtException = stateCaught_283;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 284: {
                    try {
                        statePc = 286;
                        continue stateLoop;
                    } catch (Throwable stateCaught_284) {
                        caughtException = stateCaught_284;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 285: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_285) {
                        caughtException = stateCaught_285;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        tl.field_c = 3;
                        statePc = 287;
                        continue stateLoop;
                    } catch (Throwable stateCaught_286) {
                        caughtException = stateCaught_286;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 287: {
                    try {
                        oc.field_d = false;
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_287) {
                        caughtException = stateCaught_287;
                        statePc = 290;
                        continue stateLoop;
                    }
                }
                case 288: {
                    try {
                        if ((param1 ^ -1) == -7) {
                            statePc = 303;
                        } else {
                            statePc = 289;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_288) {
                        caughtException = stateCaught_288;
                        statePc = 293;
                        continue stateLoop;
                    }
                }
                case 289: {
                    try {
                        statePc = 291;
                        continue stateLoop;
                    } catch (Throwable stateCaught_289) {
                        caughtException = stateCaught_289;
                        statePc = 293;
                        continue stateLoop;
                    }
                }
                case 290: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_290) {
                        caughtException = stateCaught_290;
                        statePc = 293;
                        continue stateLoop;
                    }
                }
                case 291: {
                    try {
                        if (-6 != (param1 ^ -1)) {
                            statePc = 350;
                        } else {
                            statePc = 292;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_291) {
                        caughtException = stateCaught_291;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 292: {
                    try {
                        statePc = 294;
                        continue stateLoop;
                    } catch (Throwable stateCaught_292) {
                        caughtException = stateCaught_292;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 293: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_293) {
                        caughtException = stateCaught_293;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 294: {
                    try {
                        if (null != s.field_e) {
                            statePc = 300;
                        } else {
                            statePc = 295;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_294) {
                        caughtException = stateCaught_294;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 295: {
                    try {
                        statePc = 297;
                        continue stateLoop;
                    } catch (Throwable stateCaught_295) {
                        caughtException = stateCaught_295;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 296: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_296) {
                        caughtException = stateCaught_296;
                        statePc = 299;
                        continue stateLoop;
                    }
                }
                case 297: {
                    try {
                        vc.field_h.l((byte) -119);
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_297) {
                        caughtException = stateCaught_297;
                        statePc = 302;
                        continue stateLoop;
                    }
                }
                case 299: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_299) {
                        caughtException = stateCaught_299;
                        statePc = 302;
                        continue stateLoop;
                    }
                }
                case 300: {
                    try {
                        nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                        s.field_e.a(ic.field_d, -105);
                        s.field_e = null;
                        qd.field_j.requestFocus();
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_300) {
                        caughtException = stateCaught_300;
                        statePc = 305;
                        continue stateLoop;
                    }
                }
                case 302: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_302) {
                        caughtException = stateCaught_302;
                        statePc = 305;
                        continue stateLoop;
                    }
                }
                case 303: {
                    try {
                        if (!s.field_i) {
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
                        statePc = 350;
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
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 308: {
                    try {
                        if (ah.a(-1)) {
                            statePc = 312;
                        } else {
                            statePc = 309;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_308) {
                        caughtException = stateCaught_308;
                        statePc = 311;
                        continue stateLoop;
                    }
                }
                case 309: {
                    try {
                        gh.field_d = bk.a(3, 10, 1, param0 ^ 441, 5);
                        statePc = 310;
                        continue stateLoop;
                    } catch (Throwable stateCaught_309) {
                        caughtException = stateCaught_309;
                        statePc = 311;
                        continue stateLoop;
                    }
                }
                case 310: {
                    try {
                        statePc = 312;
                        continue stateLoop;
                    } catch (Throwable stateCaught_310) {
                        caughtException = stateCaught_310;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 311: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_311) {
                        caughtException = stateCaught_311;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 312: {
                    try {
                        if (2 != tl.field_c) {
                            statePc = 315;
                        } else {
                            statePc = 313;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_312) {
                        caughtException = stateCaught_312;
                        statePc = 314;
                        continue stateLoop;
                    }
                }
                case 313: {
                    try {
                        statePc = 316;
                        continue stateLoop;
                    } catch (Throwable stateCaught_313) {
                        caughtException = stateCaught_313;
                        statePc = 314;
                        continue stateLoop;
                    }
                }
                case 314: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_314) {
                        caughtException = stateCaught_314;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 315: {
                    try {
                        n.field_L = 255;
                        statePc = 316;
                        continue stateLoop;
                    } catch (Throwable stateCaught_315) {
                        caughtException = stateCaught_315;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 316: {
                    try {
                        tl.field_c = 2;
                        if (!v.field_e) {
                            statePc = 320;
                        } else {
                            statePc = 317;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_316) {
                        caughtException = stateCaught_316;
                        statePc = 319;
                        continue stateLoop;
                    }
                }
                case 317: {
                    try {
                        ((ij) this).field_l = -1;
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_317) {
                        caughtException = stateCaught_317;
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
                        ((ij) this).field_l = 9;
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_320) {
                        caughtException = stateCaught_320;
                        statePc = 325;
                        continue stateLoop;
                    }
                }
                case 322: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_322) {
                        caughtException = stateCaught_322;
                        statePc = 325;
                        continue stateLoop;
                    }
                }
                case 323: {
                    try {
                        if (a.field_h[0] == null) {
                            statePc = 330;
                        } else {
                            statePc = 324;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_323) {
                        caughtException = stateCaught_323;
                        statePc = 329;
                        continue stateLoop;
                    }
                }
                case 324: {
                    try {
                        statePc = 326;
                        continue stateLoop;
                    } catch (Throwable stateCaught_324) {
                        caughtException = stateCaught_324;
                        statePc = 329;
                        continue stateLoop;
                    }
                }
                case 325: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_325) {
                        caughtException = stateCaught_325;
                        statePc = 329;
                        continue stateLoop;
                    }
                }
                case 326: {
                    try {
                        stackOut_326_0 = a.field_h;
                        stackIn_327_0 = stackOut_326_0;
                        statePc = 327;
                        continue stateLoop;
                    } catch (Throwable stateCaught_326) {
                        caughtException = stateCaught_326;
                        statePc = 329;
                        continue stateLoop;
                    }
                }
                case 327: {
                    try {
                        if ((stackIn_327_0[0].field_m ^ -1) == 0) {
                            statePc = 340;
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
                        if (of.field_A > 1) {
                            statePc = 350;
                        } else {
                            statePc = 331;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_330) {
                        caughtException = stateCaught_330;
                        statePc = 335;
                        continue stateLoop;
                    }
                }
                case 331: {
                    try {
                        statePc = 333;
                        continue stateLoop;
                    } catch (Throwable stateCaught_331) {
                        caughtException = stateCaught_331;
                        statePc = 335;
                        continue stateLoop;
                    }
                }
                case 332: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_332) {
                        caughtException = stateCaught_332;
                        statePc = 335;
                        continue stateLoop;
                    }
                }
                case 333: {
                    try {
                        ea.e((byte) 93);
                        vc.field_h.m((byte) 127);
                        s.field_i = true;
                        qe.field_e = 0;
                        nf.field_r = true;
                        stellarshard.field_K = true;
                        tl.field_a = 0;
                        bi.field_u = null;
                        if ((qi.field_a ^ -1) < -1) {
                            statePc = 338;
                        } else {
                            statePc = 334;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_333) {
                        caughtException = stateCaught_333;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 334: {
                    try {
                        statePc = 336;
                        continue stateLoop;
                    } catch (Throwable stateCaught_334) {
                        caughtException = stateCaught_334;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 335: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_335) {
                        caughtException = stateCaught_335;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 336: {
                    try {
                        statePc = 339;
                        continue stateLoop;
                    } catch (Throwable stateCaught_336) {
                        caughtException = stateCaught_336;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 337: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_337) {
                        caughtException = stateCaught_337;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 338: {
                    try {
                        qi.field_a = qi.field_a - 1;
                        statePc = 339;
                        continue stateLoop;
                    } catch (Throwable stateCaught_338) {
                        caughtException = stateCaught_338;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 339: {
                    try {
                        na.field_j = null;
                        na.field_j = null;
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_339) {
                        caughtException = stateCaught_339;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 340: {
                    try {
                        nc.field_H = 0;
                        a.field_h[0].field_g = -150;
                        na.field_j = null;
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_340) {
                        caughtException = stateCaught_340;
                        statePc = 345;
                        continue stateLoop;
                    }
                }
                case 342: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_342) {
                        caughtException = stateCaught_342;
                        statePc = 345;
                        continue stateLoop;
                    }
                }
                case 343: {
                    try {
                        if (s.field_e != null) {
                            statePc = 348;
                        } else {
                            statePc = 344;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_343) {
                        caughtException = stateCaught_343;
                        statePc = 347;
                        continue stateLoop;
                    }
                }
                case 344: {
                    try {
                        statePc = 346;
                        continue stateLoop;
                    } catch (Throwable stateCaught_344) {
                        caughtException = stateCaught_344;
                        statePc = 347;
                        continue stateLoop;
                    }
                }
                case 345: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_345) {
                        caughtException = stateCaught_345;
                        statePc = 347;
                        continue stateLoop;
                    }
                }
                case 346: {
                    try {
                        statePc = 349;
                        continue stateLoop;
                    } catch (Throwable stateCaught_346) {
                        caughtException = stateCaught_346;
                        statePc = 347;
                        continue stateLoop;
                    }
                }
                case 347: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_347) {
                        caughtException = stateCaught_347;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 348: {
                    try {
                        nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                        s.field_e.a(ic.field_d, -104);
                        s.field_e = null;
                        qd.field_j.requestFocus();
                        statePc = 349;
                        continue stateLoop;
                    } catch (Throwable stateCaught_348) {
                        caughtException = stateCaught_348;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 349: {
                    try {
                        df.a(false, hf.a((byte) -93));
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_349) {
                        caughtException = stateCaught_349;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 350: {
                    try {
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_350) {
                        caughtException = stateCaught_350;
                        statePc = 353;
                        continue stateLoop;
                    }
                }
                case 351: {
                    try {
                        if ((param1 ^ -1) != -10) {
                            statePc = 373;
                        } else {
                            statePc = 352;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_351) {
                        caughtException = stateCaught_351;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 352: {
                    try {
                        statePc = 354;
                        continue stateLoop;
                    } catch (Throwable stateCaught_352) {
                        caughtException = stateCaught_352;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 353: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_353) {
                        caughtException = stateCaught_353;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 354: {
                    try {
                        n.field_L = 255;
                        tl.field_c = 0;
                        if (!v.field_e) {
                            statePc = 360;
                        } else {
                            statePc = 355;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_354) {
                        caughtException = stateCaught_354;
                        statePc = 359;
                        continue stateLoop;
                    }
                }
                case 355: {
                    try {
                        statePc = 357;
                        continue stateLoop;
                    } catch (Throwable stateCaught_355) {
                        caughtException = stateCaught_355;
                        statePc = 359;
                        continue stateLoop;
                    }
                }
                case 356: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_356) {
                        caughtException = stateCaught_356;
                        statePc = 359;
                        continue stateLoop;
                    }
                }
                case 357: {
                    try {
                        ((ij) this).field_l = -1;
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_357) {
                        caughtException = stateCaught_357;
                        statePc = 362;
                        continue stateLoop;
                    }
                }
                case 359: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_359) {
                        caughtException = stateCaught_359;
                        statePc = 362;
                        continue stateLoop;
                    }
                }
                case 360: {
                    try {
                        stackOut_360_0 = this;
                        stackIn_369_0 = stackOut_360_0;
                        stackIn_361_0 = stackOut_360_0;
                        if (1 < of.field_A) {
                            statePc = 369;
                        } else {
                            statePc = 361;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_360) {
                        caughtException = stateCaught_360;
                        statePc = 366;
                        continue stateLoop;
                    }
                }
                case 361: {
                    try {
                        stackOut_361_0 = this;
                        stackIn_363_0 = stackOut_361_0;
                        statePc = 363;
                        continue stateLoop;
                    } catch (Throwable stateCaught_361) {
                        caughtException = stateCaught_361;
                        statePc = 366;
                        continue stateLoop;
                    }
                }
                case 362: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_362) {
                        caughtException = stateCaught_362;
                        statePc = 366;
                        continue stateLoop;
                    }
                }
                case 363: {
                    try {
                        stackOut_363_0 = this;
                        stackOut_363_1 = s.field_i;
                        stackIn_364_0 = stackOut_363_0;
                        stackIn_364_1 = stackOut_363_1;
                        statePc = 364;
                        continue stateLoop;
                    } catch (Throwable stateCaught_363) {
                        caughtException = stateCaught_363;
                        statePc = 366;
                        continue stateLoop;
                    }
                }
                case 364: {
                    try {
                        stackOut_364_0 = this;
                        stackIn_369_0 = stackOut_364_0;
                        stackIn_365_0 = stackOut_364_0;
                        if (stackIn_364_1) {
                            statePc = 369;
                        } else {
                            statePc = 365;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_364) {
                        caughtException = stateCaught_364;
                        statePc = 368;
                        continue stateLoop;
                    }
                }
                case 365: {
                    try {
                        stackOut_365_0 = this;
                        stackIn_367_0 = stackOut_365_0;
                        statePc = 367;
                        continue stateLoop;
                    } catch (Throwable stateCaught_365) {
                        caughtException = stateCaught_365;
                        statePc = 368;
                        continue stateLoop;
                    }
                }
                case 366: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_366) {
                        caughtException = stateCaught_366;
                        statePc = 368;
                        continue stateLoop;
                    }
                }
                case 367: {
                    try {
                        stackOut_367_0 = this;
                        stackOut_367_1 = 3;
                        stackIn_370_0 = stackOut_367_0;
                        stackIn_370_1 = stackOut_367_1;
                        statePc = 370;
                        continue stateLoop;
                    } catch (Throwable stateCaught_367) {
                        caughtException = stateCaught_367;
                        statePc = 368;
                        continue stateLoop;
                    }
                }
                case 368: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_368) {
                        caughtException = stateCaught_368;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 369: {
                    try {
                        stackOut_369_0 = this;
                        stackOut_369_1 = 2;
                        stackIn_370_0 = stackOut_369_0;
                        stackIn_370_1 = stackOut_369_1;
                        statePc = 370;
                        continue stateLoop;
                    } catch (Throwable stateCaught_369) {
                        caughtException = stateCaught_369;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 370: {
                    try {
                        ((ij) this).field_l = stackIn_370_1;
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_370) {
                        caughtException = stateCaught_370;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 372: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var3, "ij.F(" + param0 + 44 + param1 + 41);
                }
                case 373: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ij(stellarshard param0) {
        super(10, 64, 576, 196, 28);
        RuntimeException runtimeException = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((ij) this).field_u = -1;
                    ((ij) this).field_t = -5;
                    ((ij) this).field_s = 30;
                    ((ij) this).field_r = -1;
                    ((ij) this).field_p = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        nj.field_f = new int[10];
                        n.field_L = 255;
                        tl.field_c = 0;
                        ((ij) this).field_l = 0;
                        if (s.field_i) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = of.field_A;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((stackIn_3_0 ^ -1) >= -2) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((ij) this).field_l = 1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        vc.field_h = param0;
                        if (!oc.field_d) {
                            statePc = 18;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((ij) this).field_l = 9;
                        tl.field_c = 3;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) runtimeException;
                        stackOut_13_1 = new StringBuilder().append("ij.<init>(");
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param0 == null) {
                            statePc = 16;
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
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                        stackOut_14_2 = "{...}";
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_17_2 = stackOut_14_2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                    stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                    stackOut_16_2 = "null";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw ma.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
                }
                case 18: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        qe[] stackIn_20_0 = null;
        int stackIn_39_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_124_0 = 0;
        qe[] stackOut_19_0 = null;
        int stackOut_38_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_123_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = stellarshard.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -9) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (!s.field_i) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0 >= param2) {
                            statePc = 13;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-2 == (param2 ^ -1)) {
                            statePc = 11;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param3 = param3 - ((ij) this).field_a;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param3 = param3 + ((ij) this).field_a * 3;
                        if (0 >= mk.field_k) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        param3 = param3 + ((ij) this).field_a;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-1 != (tl.field_c ^ -1)) {
                            statePc = 140;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5_int = 5883647;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param2 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (a.field_h[0] == null) {
                            statePc = 26;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = a.field_h;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0[0].field_m != -1) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ic.a(dj.field_c, param2, -1, false, 320, var5_int, param3);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (1 < of.field_A) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ic.a(kf.field_c + qi.field_a, param2, -1, false, 320, var5_int, param3);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (1 != param2) {
                            statePc = 54;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (null == a.field_h[0]) {
                            statePc = 45;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = -1;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 != a.field_h[0].field_m) {
                            statePc = 45;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ic.a(kk.field_n, param2, -1, false, 320, var5_int, param3);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (of.field_A <= 1) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ic.a(qf.field_f, param2, -1, false, 320, var5_int, param3);
                        fh.field_k[0].e(316, param3 - -3);
                        fh.field_k[2].e(418, 3 + param3);
                        fh.field_k[1].e(-3 + ((100 * qi.field_a - 100) / (-1 + of.field_A) + 320), 3 + param3);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ic.a(rk.field_b, param2, -1, false, 320, var5_int, param3);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (3 != param2) {
                            statePc = 66;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (fe.field_e) {
                            statePc = 63;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        ic.a(ch.field_d, param2, -1, false, 320, var5_int, param3);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        ic.a(eh.field_b, param2, -1, false, 320, var5_int, param3);
                        fh.field_k[0].e(316, 2 + param3);
                        fh.field_k[2].e(418, 2 + param3);
                        fh.field_k[1].e(320 - -pk.field_h + -3, 2 + param3);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((param2 ^ -1) == -5) {
                            statePc = 129;
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
                        if (param2 == 5) {
                            statePc = 105;
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
                        if (-3 != (param2 ^ -1)) {
                            statePc = 78;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        ic.a(ig.field_C, param2, -1, false, 320, var5_int, param3);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if ((param2 ^ -1) == -7) {
                            statePc = 99;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if ((param2 ^ -1) == -8) {
                            statePc = 93;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (-9 == (param2 ^ -1)) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (s.field_i) {
                            statePc = 140;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        ic.a(il.field_x, param2, -1, false, 320, var5_int, param3);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (!s.field_i) {
                            statePc = 98;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        ic.a(nl.field_b, param2, -1, false, 320, var5_int, param3);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (s.field_i) {
                            statePc = 140;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        ic.a(ta.field_r, param2, -1, false, 320, var5_int, param3);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (!s.field_i) {
                            statePc = 114;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackOut_108_0 = mk.field_k;
                        stackIn_109_0 = stackOut_108_0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if ((stackIn_109_0 ^ -1) < -1) {
                            statePc = 114;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (s.field_e != null) {
                            statePc = 126;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (!lh.a(ic.field_d, (byte) -119)) {
                            statePc = 120;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (param0) {
                            statePc = 123;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        stackOut_121_0 = 8421504;
                        stackIn_124_0 = stackOut_121_0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = 16777215;
                        stackIn_124_0 = stackOut_123_0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var5_int = stackIn_124_0;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        ic.a(ch.field_a, param2, -1, false, 320, var5_int, param3);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        ic.a(ch.field_a, param2, -1, false, 320, var5_int, param3);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
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
                        if (vf.field_L == null) {
                            statePc = 135;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        ic.a(fe.field_f, param2, -1, false, 320, var5_int, param3);
                        fh.field_k[0].e(316, 2 + param3);
                        fh.field_k[2].e(418, param3 + 2);
                        fh.field_k[1].e(ai.field_c + 317, 2 + param3);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        ic.a(rc.field_f, param2, -1, false, 320, var5_int, param3);
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 139: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var5, "ij.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 140: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = stellarshard.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((ij) this).field_p = -111;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 != 1) {
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
                        stackOut_6_0 = s.field_i;
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
                        if (stackIn_7_0) {
                            statePc = 24;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = of.field_A;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((stackIn_11_0 ^ -1) >= -2) {
                            statePc = 24;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = tl.field_c;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((stackIn_15_0 ^ -1) != -1) {
                            statePc = 24;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        qi.field_a = qi.field_a + 1;
                        if (qi.field_a > of.field_A) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        qi.field_a = of.field_A;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-4 == (param1 ^ -1)) {
                            statePc = 44;
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
                        if (param1 != 4) {
                            statePc = 52;
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
                        ai.field_c = ai.field_c + 12;
                        if (ai.field_c > 100) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ai.field_c = 100;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (null != vf.field_L) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        vf.field_L = fe.field_c;
                        nj.field_o.a((p) (Object) vf.field_L);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (vf.field_L != null) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        vf.field_L.d(ai.field_c / 2);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        pk.field_h = pk.field_h + 12;
                        fe.field_e = true;
                        if (-101 <= (pk.field_h ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        pk.field_h = 100;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var3, "ij.A(" + param0 + 44 + param1 + 41);
                }
                case 52: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(int param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_36_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_35_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = stellarshard.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -3) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.c(-34, 99);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (gi.field_f != 96) {
                            statePc = 14;
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
                        stackOut_6_0 = param0;
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
                        if (stackIn_7_0 == 8) {
                            statePc = 42;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = tl.field_c;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((stackIn_11_0 ^ -1) != -3) {
                            statePc = 42;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (97 != gi.field_f) {
                            statePc = 32;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = -9;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 == (param0 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = tl.field_c;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((stackIn_22_0 ^ -1) == -3) {
                            statePc = 32;
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
                        si.field_X = si.field_X + 1;
                        if (si.field_X >= 3) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        si.field_X = si.field_X - 3;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        this.a(true, param0);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (-85 == (gi.field_f ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = 83;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 == gi.field_f) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((ij) this).a(param1 ^ -427, param0);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        si.field_X = si.field_X - 1;
                        if (si.field_X >= 0) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        si.field_X = si.field_X + 3;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((ij) this).b(param0, -1);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var3, "ij.D(" + param0 + 44 + param1 + 41);
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, int param1, boolean param2, int param3, boolean param4, String param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_27_0 = 0;
        boolean stackIn_31_0 = false;
        int stackIn_37_0 = 0;
        boolean[] stackIn_40_0 = null;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_26_0 = 0;
        boolean stackOut_30_0 = false;
        int stackOut_36_0 = 0;
        boolean[] stackOut_39_0 = null;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var8_int = l.field_f.b(param5);
                        param3 += 4;
                        param0 = param0 + var8_int / 2;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if ((ni.field_e ^ -1) >= (-4 + -var8_int + param0 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = param0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((stackIn_3_0 ^ -1) > (ni.field_e ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = param3;
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
                        if (stackIn_7_0 + -l.field_f.field_N >= eb.field_a) {
                            statePc = 23;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = eb.field_a;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((stackIn_11_0 ^ -1) < (param3 ^ -1)) {
                            statePc = 23;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = param4;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((param6 ^ -1) == -5883648) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        param6 = 16748431;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param6 = 16777215;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!param2) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        param6 = 16777215;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        l.field_f.b(param5, param0 + -2, param1 + param3, param6, -1);
                        if ((param6 ^ -1) != -16777216) {
                            statePc = 38;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 == fb.field_n) {
                            statePc = 38;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = param4;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = 1;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return stackIn_37_0 != 0;
                }
                case 38: {
                    try {
                        if (param6 != 16777215) {
                            statePc = 48;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = si.field_jb;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (!stackIn_40_0[84]) {
                            statePc = 48;
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
                case 43: {
                    try {
                        if (!param2) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = 1;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    return stackIn_47_0 != 0;
                }
                case 48: {
                    try {
                        stackOut_48_0 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    return stackIn_49_0 != 0;
                }
                case 50: {
                    var8 = (RuntimeException) (Object) caughtException;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    try {
                        stackOut_51_0 = (RuntimeException) var8;
                        stackOut_51_1 = new StringBuilder().append("ij.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
                        stackIn_54_0 = stackOut_51_0;
                        stackIn_54_1 = stackOut_51_1;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        if (param5 == null) {
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
                    throw ma.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param6 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static jj a(int param0, gk param1, String param2, pf param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        jj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        jj stackOut_5_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var5_int = param3.b(param4, (byte) -118);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (param0 == 576) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        jj discarded$2 = ij.a(-91, (gk) null, (String) null, (pf) null, (String) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = param3.a(var5_int, param2, (byte) -11);
                        stackOut_5_0 = ca.a(var5_int, 24325, var6, param3, param1);
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) var5;
                        stackOut_8_1 = new StringBuilder().append("ij.H(").append(param0).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param1 == null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param2 == null) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "{...}";
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_16_2 = stackOut_13_2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                    stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                    stackOut_15_2 = "null";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param3 == null) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "{...}";
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_20_2 = stackOut_17_2;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 19: {
                    stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                    stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                    stackOut_19_2 = "null";
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param4 == null) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_24_2 = stackOut_21_2;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 23: {
                    stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                    stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                    stackOut_23_2 = "null";
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw ma.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) {
        ub var2 = null;
        int var2_int = 0;
        double var2_double = 0.0;
        int var3 = 0;
        String var3_ref = null;
        String[] var3_ref_String__ = null;
        int var4 = 0;
        double var4_double = 0.0;
        long[] var4_ref_long__ = null;
        String var5_ref = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nf var8_ref = null;
        int var9 = 0;
        pa var10_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        String var12 = null;
        String var12_ref = null;
        bj var13_ref = null;
        int var13 = 0;
        int var14 = 0;
        ub stackIn_66_0 = null;
        ub stackIn_67_0 = null;
        ub stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        ub stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        ub stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        ub stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        ub stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        ub stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        ub stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        int stackIn_77_3 = 0;
        ub stackIn_82_0 = null;
        ub stackIn_83_0 = null;
        ub stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        ub stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        ub stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        ub stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        ub stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_88_3 = 0;
        ub stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_89_2 = 0;
        int stackIn_89_3 = 0;
        ub stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        int stackIn_90_4 = 0;
        Object stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        Object stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        ub stackIn_96_0 = null;
        ub stackIn_97_0 = null;
        ub stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        ub stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        ub stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        ub stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int stackIn_101_2 = 0;
        ub stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        int stackIn_102_3 = 0;
        ub stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        int stackIn_103_3 = 0;
        ub stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        int stackIn_104_3 = 0;
        int stackIn_104_4 = 0;
        int stackIn_131_0 = 0;
        ub stackIn_170_0 = null;
        String stackIn_170_1 = null;
        int stackIn_170_2 = 0;
        int stackIn_170_3 = 0;
        ub stackIn_171_0 = null;
        String stackIn_171_1 = null;
        int stackIn_171_2 = 0;
        int stackIn_171_3 = 0;
        ub stackIn_172_0 = null;
        String stackIn_172_1 = null;
        int stackIn_172_2 = 0;
        int stackIn_172_3 = 0;
        ub stackIn_173_0 = null;
        String stackIn_173_1 = null;
        int stackIn_173_2 = 0;
        int stackIn_173_3 = 0;
        int stackIn_173_4 = 0;
        int stackIn_195_0 = 0;
        ub stackOut_65_0 = null;
        ub stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        ub stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        ub stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        ub stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        ub stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        ub stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        ub stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int stackOut_73_3 = 0;
        ub stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        Object stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int stackOut_75_3 = 0;
        ub stackOut_81_0 = null;
        ub stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        ub stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        ub stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        ub stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        ub stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        ub stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        int stackOut_87_3 = 0;
        ub stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        int stackOut_89_3 = 0;
        int stackOut_89_4 = 0;
        ub stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        int stackOut_88_3 = 0;
        int stackOut_88_4 = 0;
        Object stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        Object stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        Object stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        ub stackOut_95_0 = null;
        ub stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        ub stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        ub stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        ub stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        int stackOut_100_2 = 0;
        ub stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        int stackOut_99_2 = 0;
        ub stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        ub stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        int stackOut_103_4 = 0;
        ub stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        int stackOut_102_3 = 0;
        int stackOut_102_4 = 0;
        int stackOut_129_0 = 0;
        int stackOut_130_0 = 0;
        ub stackOut_169_0 = null;
        String stackOut_169_1 = null;
        int stackOut_169_2 = 0;
        int stackOut_169_3 = 0;
        ub stackOut_172_0 = null;
        String stackOut_172_1 = null;
        int stackOut_172_2 = 0;
        int stackOut_172_3 = 0;
        int stackOut_172_4 = 0;
        ub stackOut_170_0 = null;
        String stackOut_170_1 = null;
        int stackOut_170_2 = 0;
        int stackOut_170_3 = 0;
        ub stackOut_171_0 = null;
        String stackOut_171_1 = null;
        int stackOut_171_2 = 0;
        int stackOut_171_3 = 0;
        int stackOut_171_4 = 0;
        int stackOut_194_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_192_0 = 0;
        L0: {
          var14 = stellarshard.field_B;
          if ((tl.field_c ^ -1) == -9) {
            wj.c((byte) 57);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (tl.field_c != 6) {
            if (tl.field_c != 7) {
              break L1;
            } else {
              if (!ah.a(-1)) {
                be.field_g = ab.a(-5094, 4);
                tl.field_c = ea.field_p;
                if (tl.field_c != 4) {
                  break L1;
                } else {
                  L2: {
                    qf.a((byte) -125);
                    wh.a(-94);
                    vc.field_h.c(param0 + 42, te.field_c);
                    oc.field_d = false;
                    if (tl.field_a <= 0) {
                      break L2;
                    } else {
                      oc.field_d = true;
                      break L2;
                    }
                  }
                  cl.field_a = cl.field_a + te.field_c;
                  te.field_c = 0;
                  break L1;
                }
              } else {
                n.field_L = 255;
                tl.field_c = fg.field_O;
                break L1;
              }
            }
          } else {
            rj.c((byte) -94);
            tl.field_c = 7;
            break L1;
          }
        }
        L3: {
          if ((tl.field_c ^ -1) == -6) {
            L4: {
              var2 = qj.field_a;
              var3 = var2.field_N + 200;
              var4 = 4 + (var2.field_x + var2.field_r);
              ti.b(112, 190, 416, 20 + 5 * var4 - -60, 0, 192);
              ed.a(-6313, 103, 183, fg.field_P, 434, 80 + var4 * 5 + 14);
              var2.c(qj.field_b, 320, var3, 10742263, -1);
              stackOut_65_0 = (ub) var2;
              stackIn_67_0 = stackOut_65_0;
              stackIn_66_0 = stackOut_65_0;
              if (tf.field_a.a(0)) {
                stackOut_67_0 = (ub) (Object) stackIn_67_0;
                stackOut_67_1 = 0;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                break L4;
              } else {
                stackOut_66_0 = (ub) (Object) stackIn_66_0;
                stackOut_66_1 = 1;
                stackIn_68_0 = stackOut_66_0;
                stackIn_68_1 = stackOut_66_1;
                break L4;
              }
            }
            L5: {
              stackOut_68_0 = (ub) (Object) stackIn_68_0;
              stackOut_68_1 = stackIn_68_1;
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              if ((tl.field_a ^ -1) == -1) {
                stackOut_70_0 = (ub) (Object) stackIn_70_0;
                stackOut_70_1 = stackIn_70_1;
                stackOut_70_2 = 0;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                stackIn_71_2 = stackOut_70_2;
                break L5;
              } else {
                stackOut_69_0 = (ub) (Object) stackIn_69_0;
                stackOut_69_1 = stackIn_69_1;
                stackOut_69_2 = 1;
                stackIn_71_0 = stackOut_69_0;
                stackIn_71_1 = stackOut_69_1;
                stackIn_71_2 = stackOut_69_2;
                break L5;
              }
            }
            L6: {
              stackOut_71_0 = (ub) (Object) stackIn_71_0;
              stackOut_71_1 = stackIn_71_1;
              stackOut_71_2 = stackIn_71_2;
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              if (0 == te.field_c) {
                stackOut_73_0 = (ub) (Object) stackIn_73_0;
                stackOut_73_1 = stackIn_73_1;
                stackOut_73_2 = stackIn_73_2;
                stackOut_73_3 = 0;
                stackIn_74_0 = stackOut_73_0;
                stackIn_74_1 = stackOut_73_1;
                stackIn_74_2 = stackOut_73_2;
                stackIn_74_3 = stackOut_73_3;
                break L6;
              } else {
                stackOut_72_0 = (ub) (Object) stackIn_72_0;
                stackOut_72_1 = stackIn_72_1;
                stackOut_72_2 = stackIn_72_2;
                stackOut_72_3 = 1;
                stackIn_74_0 = stackOut_72_0;
                stackIn_74_1 = stackOut_72_1;
                stackIn_74_2 = stackOut_72_2;
                stackIn_74_3 = stackOut_72_3;
                break L6;
              }
            }
            L7: {
              ((ub) (Object) stackIn_74_0).c(ch.a(stackIn_74_1 != 0, stackIn_74_2 != 0, stackIn_74_3 != 0, 0), 320, var4 + var3, 10742263, -1);
              stackOut_74_0 = this;
              stackOut_74_1 = 320;
              stackOut_74_2 = -4;
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              if (-1 != (ld.field_F ^ -1)) {
                stackOut_76_0 = this;
                stackOut_76_1 = stackIn_76_1;
                stackOut_76_2 = stackIn_76_2;
                stackOut_76_3 = 0;
                stackIn_77_0 = stackOut_76_0;
                stackIn_77_1 = stackOut_76_1;
                stackIn_77_2 = stackOut_76_2;
                stackIn_77_3 = stackOut_76_3;
                break L7;
              } else {
                stackOut_75_0 = this;
                stackOut_75_1 = stackIn_75_1;
                stackOut_75_2 = stackIn_75_2;
                stackOut_75_3 = 1;
                stackIn_77_0 = stackOut_75_0;
                stackIn_77_1 = stackOut_75_1;
                stackIn_77_2 = stackOut_75_2;
                stackIn_77_3 = stackOut_75_3;
                break L7;
              }
            }
            L8: {
              if (this.a(stackIn_77_1, stackIn_77_2, stackIn_77_3 == 0, var4 * 3 + var3, v.field_e, wl.field_T, 5883647)) {
                break L8;
              } else {
                if (n.field_L > 0) {
                  break L8;
                } else {
                  am.a(5, 4, -122);
                  break L8;
                }
              }
            }
            L9: {
              stackOut_81_0 = (ub) var2;
              stackIn_83_0 = stackOut_81_0;
              stackIn_82_0 = stackOut_81_0;
              if (te.field_c == 0) {
                stackOut_83_0 = (ub) (Object) stackIn_83_0;
                stackOut_83_1 = 0;
                stackIn_84_0 = stackOut_83_0;
                stackIn_84_1 = stackOut_83_1;
                break L9;
              } else {
                stackOut_82_0 = (ub) (Object) stackIn_82_0;
                stackOut_82_1 = 1;
                stackIn_84_0 = stackOut_82_0;
                stackIn_84_1 = stackOut_82_1;
                break L9;
              }
            }
            L10: {
              stackOut_84_0 = (ub) (Object) stackIn_84_0;
              stackOut_84_1 = stackIn_84_1;
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              if (tf.field_a.a(0)) {
                stackOut_86_0 = (ub) (Object) stackIn_86_0;
                stackOut_86_1 = stackIn_86_1;
                stackOut_86_2 = 0;
                stackIn_87_0 = stackOut_86_0;
                stackIn_87_1 = stackOut_86_1;
                stackIn_87_2 = stackOut_86_2;
                break L10;
              } else {
                stackOut_85_0 = (ub) (Object) stackIn_85_0;
                stackOut_85_1 = stackIn_85_1;
                stackOut_85_2 = 1;
                stackIn_87_0 = stackOut_85_0;
                stackIn_87_1 = stackOut_85_1;
                stackIn_87_2 = stackOut_85_2;
                break L10;
              }
            }
            L11: {
              stackOut_87_0 = (ub) (Object) stackIn_87_0;
              stackOut_87_1 = stackIn_87_1;
              stackOut_87_2 = stackIn_87_2;
              stackOut_87_3 = -72;
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              stackIn_89_3 = stackOut_87_3;
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              stackIn_88_3 = stackOut_87_3;
              if (-1 == (tl.field_a ^ -1)) {
                stackOut_89_0 = (ub) (Object) stackIn_89_0;
                stackOut_89_1 = stackIn_89_1;
                stackOut_89_2 = stackIn_89_2;
                stackOut_89_3 = stackIn_89_3;
                stackOut_89_4 = 0;
                stackIn_90_0 = stackOut_89_0;
                stackIn_90_1 = stackOut_89_1;
                stackIn_90_2 = stackOut_89_2;
                stackIn_90_3 = stackOut_89_3;
                stackIn_90_4 = stackOut_89_4;
                break L11;
              } else {
                stackOut_88_0 = (ub) (Object) stackIn_88_0;
                stackOut_88_1 = stackIn_88_1;
                stackOut_88_2 = stackIn_88_2;
                stackOut_88_3 = stackIn_88_3;
                stackOut_88_4 = 1;
                stackIn_90_0 = stackOut_88_0;
                stackIn_90_1 = stackOut_88_1;
                stackIn_90_2 = stackOut_88_2;
                stackIn_90_3 = stackOut_88_3;
                stackIn_90_4 = stackOut_88_4;
                break L11;
              }
            }
            L12: {
              ((ub) (Object) stackIn_90_0).c(pe.a(stackIn_90_1 != 0, stackIn_90_2 != 0, (byte) stackIn_90_3, stackIn_90_4 != 0), 320, 30 + (3 * var4 + var3), 10742263, -1);
              stackOut_90_0 = this;
              stackOut_90_1 = 320;
              stackOut_90_2 = param0 ^ -87;
              stackIn_92_0 = stackOut_90_0;
              stackIn_92_1 = stackOut_90_1;
              stackIn_92_2 = stackOut_90_2;
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              if (-2 != (ld.field_F ^ -1)) {
                stackOut_92_0 = this;
                stackOut_92_1 = stackIn_92_1;
                stackOut_92_2 = stackIn_92_2;
                stackOut_92_3 = 0;
                stackIn_93_0 = stackOut_92_0;
                stackIn_93_1 = stackOut_92_1;
                stackIn_93_2 = stackOut_92_2;
                stackIn_93_3 = stackOut_92_3;
                break L12;
              } else {
                stackOut_91_0 = this;
                stackOut_91_1 = stackIn_91_1;
                stackOut_91_2 = stackIn_91_2;
                stackOut_91_3 = 1;
                stackIn_93_0 = stackOut_91_0;
                stackIn_93_1 = stackOut_91_1;
                stackIn_93_2 = stackOut_91_2;
                stackIn_93_3 = stackOut_91_3;
                break L12;
              }
            }
            L13: {
              if (this.a(stackIn_93_1, stackIn_93_2, stackIn_93_3 == 0, 30 + var4 / 2 + (var3 + 4 * var4), v.field_e, sg.field_b, 5883647)) {
                break L13;
              } else {
                oc.field_d = false;
                tl.field_a = 0;
                ue.field_a = 0;
                ta.a(true, 713);
                ue.field_c.a((byte) -8);
                tf.field_a.a((byte) -8);
                qi.field_a = 0;
                n.field_L = 255;
                tl.field_c = 8;
                break L13;
              }
            }
            L14: {
              stackOut_95_0 = (ub) var2;
              stackIn_97_0 = stackOut_95_0;
              stackIn_96_0 = stackOut_95_0;
              if (0 == te.field_c) {
                stackOut_97_0 = (ub) (Object) stackIn_97_0;
                stackOut_97_1 = 0;
                stackIn_98_0 = stackOut_97_0;
                stackIn_98_1 = stackOut_97_1;
                break L14;
              } else {
                stackOut_96_0 = (ub) (Object) stackIn_96_0;
                stackOut_96_1 = 1;
                stackIn_98_0 = stackOut_96_0;
                stackIn_98_1 = stackOut_96_1;
                break L14;
              }
            }
            L15: {
              stackOut_98_0 = (ub) (Object) stackIn_98_0;
              stackOut_98_1 = stackIn_98_1;
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              if ((tl.field_a ^ -1) == -1) {
                stackOut_100_0 = (ub) (Object) stackIn_100_0;
                stackOut_100_1 = stackIn_100_1;
                stackOut_100_2 = 0;
                stackIn_101_0 = stackOut_100_0;
                stackIn_101_1 = stackOut_100_1;
                stackIn_101_2 = stackOut_100_2;
                break L15;
              } else {
                stackOut_99_0 = (ub) (Object) stackIn_99_0;
                stackOut_99_1 = stackIn_99_1;
                stackOut_99_2 = 1;
                stackIn_101_0 = stackOut_99_0;
                stackIn_101_1 = stackOut_99_1;
                stackIn_101_2 = stackOut_99_2;
                break L15;
              }
            }
            L16: {
              stackOut_101_0 = (ub) (Object) stackIn_101_0;
              stackOut_101_1 = stackIn_101_1;
              stackOut_101_2 = stackIn_101_2;
              stackOut_101_3 = 6;
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              stackIn_103_3 = stackOut_101_3;
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              stackIn_102_3 = stackOut_101_3;
              if (tf.field_a.a(param0 + -85)) {
                stackOut_103_0 = (ub) (Object) stackIn_103_0;
                stackOut_103_1 = stackIn_103_1;
                stackOut_103_2 = stackIn_103_2;
                stackOut_103_3 = stackIn_103_3;
                stackOut_103_4 = 0;
                stackIn_104_0 = stackOut_103_0;
                stackIn_104_1 = stackOut_103_1;
                stackIn_104_2 = stackOut_103_2;
                stackIn_104_3 = stackOut_103_3;
                stackIn_104_4 = stackOut_103_4;
                break L16;
              } else {
                stackOut_102_0 = (ub) (Object) stackIn_102_0;
                stackOut_102_1 = stackIn_102_1;
                stackOut_102_2 = stackIn_102_2;
                stackOut_102_3 = stackIn_102_3;
                stackOut_102_4 = 1;
                stackIn_104_0 = stackOut_102_0;
                stackIn_104_1 = stackOut_102_1;
                stackIn_104_2 = stackOut_102_2;
                stackIn_104_3 = stackOut_102_3;
                stackIn_104_4 = stackOut_102_4;
                break L16;
              }
            }
            ((ub) (Object) stackIn_104_0).c(stellarshard.a(stackIn_104_1 != 0, stackIn_104_2 != 0, stackIn_104_3, stackIn_104_4 != 0), 320, 4 * var4 + var3 + 60, 10742263, -1);
            ti.b(112, 190, 416, 80 + var4 * 5, 16777215, n.field_L);
            break L3;
          } else {
            if (tl.field_c == 4) {
              if (((ij) this).field_t >= 0) {
                var8 = ((ij) this).field_t;
                var9 = 0;
                L17: while (true) {
                  if ((var9 ^ -1) < -51) {
                    L18: {
                      var2_int = 5883647;
                      if (0 < tl.field_a) {
                        ic.a(dj.field_c, 8, -1, false, 320, var2_int, 415);
                        break L18;
                      } else {
                        ic.a(dj.field_c, 8, -1, false, 320, var2_int, 415);
                        break L18;
                      }
                    }
                    var3_ref = sg.field_d + qi.field_a + wc.field_l + ue.field_a;
                    int discarded$8 = l.field_f.a(var3_ref, -1, 260, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
                    int discarded$9 = l.field_f.a(var3_ref, 1, 260, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
                    int discarded$10 = l.field_f.a(var3_ref, 0, 259, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
                    int discarded$11 = l.field_f.a(var3_ref, 0, 261, 640, 180, 0, -1, 1, 1, l.field_f.field_N);
                    int discarded$12 = l.field_f.a(var3_ref, 0, 260, 640, 180, 10742263, -1, 1, 1, l.field_f.field_N);
                    break L3;
                  } else {
                    L19: {
                      var2_double = 3.141592653589793 * (double)var9 / 25.0;
                      if (-26 != (var9 ^ -1)) {
                        break L19;
                      } else {
                        L20: {
                          var10_ref = new pa(rh.field_b, false, false, false, false);
                          ((ij) this).field_q = ((ij) this).field_q + 1;
                          if ((((ij) this).field_q ^ -1) < -257) {
                            ((ij) this).field_q = ((ij) this).field_q - 256;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        var11 = (int)(Math.cos((double)((ij) this).field_q * 3.141592653589793 / 128.0) * 65536.0);
                        var12_int = (int)(65536.0 * Math.sin(3.141592653589793 * (double)((ij) this).field_q / 128.0));
                        var10_ref.a(new int[12]);
                        var10_ref.a(new int[12]);
                        var10_ref.a(new int[12]);
                        var10_ref.a(new int[12]);
                        var10_ref.a(new int[12]);
                        var13_ref = var10_ref.a(32, 346, 50, 50, -50);
                        var13_ref.a(0, 0, 0, 0, 0, 0, 1000, -1L);
                        pd.field_h.a((byte) -107);
                        break L19;
                      }
                    }
                    L21: {
                      var4_double = (double)(var9 + 1) * 3.141592653589793 / 25.0;
                      var6 = (int)(128.0 * Math.cos(var2_double));
                      var7 = (int)(Math.sin(var2_double) * -64.0);
                      if (var8 > 0) {
                        L22: {
                          L23: {
                            if (var8 <= var9) {
                              break L23;
                            } else {
                              if (mg.field_t > var9) {
                                break L23;
                              } else {
                                ti.a(var6 + 320 << 1191221188, 240 + var7 << 484338308, 256, 255 * var9 / var8, ei.field_I);
                                break L22;
                              }
                            }
                          }
                          if (var8 != var9) {
                            ti.a(var6 + 320 << 601263876, var7 + 240 << -1462754268, 128, 64, ei.field_I);
                            break L22;
                          } else {
                            ti.a(320 + var6 << 813411044, 240 + var7 << 698909956, 256, var9 * 255 / var8, ei.field_B);
                            break L22;
                          }
                        }
                        L24: {
                          var6 = var6 * 9 / 10;
                          var7 = 9 * var7 / 10;
                          if (var8 <= var9) {
                            break L24;
                          } else {
                            if (mg.field_t > var9) {
                              break L24;
                            } else {
                              ti.a(var6 - -320 << 1136674916, 240 + var7 << 1718751332, 192, var9 * 255 / var8, ei.field_I);
                              break L24;
                            }
                          }
                        }
                        L25: {
                          if (var9 == var8) {
                            ti.a(320 + var6 << -790631132, var7 + 240 << 1162240548, 192, 255 * var9 / var8, ei.field_B);
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          var7 = 9 * var7 / 10;
                          var6 = 9 * var6 / 10;
                          if (var8 <= var9) {
                            break L26;
                          } else {
                            if ((var9 ^ -1) > (mg.field_t ^ -1)) {
                              break L26;
                            } else {
                              ti.a(320 + var6 << -1366632700, 240 + var7 << -476867068, 128, var9 * 255 / var8, ei.field_I);
                              break L26;
                            }
                          }
                        }
                        L27: {
                          if ((var9 ^ -1) != (var8 ^ -1)) {
                            break L27;
                          } else {
                            ti.a(320 + var6 << 463620868, var7 + 240 << -1211113436, 128, 255 * var9 / var8, ei.field_B);
                            break L27;
                          }
                        }
                        L28: {
                          var6 = 9 * var6 / 10;
                          var7 = 9 * var7 / 10;
                          if (var8 <= var9) {
                            break L28;
                          } else {
                            if ((mg.field_t ^ -1) < (var9 ^ -1)) {
                              break L28;
                            } else {
                              ti.a(var6 - -320 << 394473636, 240 + var7 << 1950440772, 64, var9 * 255 / var8, ei.field_I);
                              break L28;
                            }
                          }
                        }
                        if ((var8 ^ -1) == (var9 ^ -1)) {
                          ti.a(var6 + 320 << 1638733956, 240 + var7 << 1574692356, 64, 255 * var9 / var8, ei.field_B);
                          break L21;
                        } else {
                          break L21;
                        }
                      } else {
                        break L21;
                      }
                    }
                    var9++;
                    continue L17;
                  }
                }
              } else {
                return;
              }
            } else {
              break L3;
            }
          }
        }
        L29: {
          if ((tl.field_c ^ -1) != -1) {
            break L29;
          } else {
            ((ij) this).field_u = -1;
            if (!s.field_i) {
              break L29;
            } else {
              break L29;
            }
          }
        }
        L30: {
          if (-2 != (tl.field_c ^ -1)) {
            break L30;
          } else {
            hk.field_l[1].e(0, 0);
            ti.b(12, 96, 616, 336, 0, 192);
            ed.a(-6313, 3, 89, fg.field_P, 634, 343);
            ic.a(li.field_b, 9, -1, false, 320, 5883647, 439);
            var2_int = 84;
            var3 = 104;
            qj.field_a.c(be.field_a, 320, var3 - -12, 10742263, -1);
            var3 += 14;
            qj.field_a.c(hj.field_c, 320, var3 - -12, 10742263, -1);
            var3 += 22;
            int discarded$13 = qj.field_a.a(pl.field_V, 160, var3 + -6, 416, 32, 10742263, -1, 0, 0, 13);
            e.field_g[8].e(var2_int, -36 + (var3 - -4));
            var3 += 12;
            var2_int -= 64;
            var4 = var3;
            e.field_g[0].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(ei.field_A, var2_int - -68, 12 + var3, 16777215, -1);
            e.field_g[1].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(gf.field_a, var2_int + 68, 12 + var3, 16777215, -1);
            e.field_g[2].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(ka.field_l, var2_int - -68, var3 + 12, 16777215, -1);
            e.field_g[3].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(he.field_l, 68 + var2_int, 12 + var3, 16777215, -1);
            e.field_g[4].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(td.field_e, var2_int - -68, var3 + 12, 16777215, -1);
            // wide iinc 2 192
            var3 = var4;
            e.field_g[5].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(nl.field_f, 68 + var2_int, var3 + 12, 16777215, -1);
            e.field_g[6].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(qh.field_h, 68 + var2_int, 12 + var3, 16777215, -1);
            e.field_g[7].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(we.field_e, var2_int + 68, 12 + var3, 16777215, -1);
            e.field_g[9].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(te.field_b, 68 + var2_int, var3 - -12, 16777215, -1);
            e.field_g[10].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(ha.field_x, var2_int - -68, 12 + var3, 16777215, -1);
            // wide iinc 2 192
            var3 = var4;
            e.field_g[11].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(fc.field_c, var2_int + 68, 12 + var3, 16777215, -1);
            e.field_g[12].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(wg.field_e, var2_int - -68, var3 - -12, 16777215, -1);
            e.field_g[13].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(nb.field_O, 68 + var2_int, var3 - -12, 16777215, -1);
            e.field_g[14].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(ja.field_k, var2_int - -68, var3 + 12, 16777215, -1);
            e.field_g[15].e(var2_int, var3);
            var3 += 40;
            qj.field_a.a(rd.field_b, 68 + var2_int, 12 + var3, 16777215, -1);
            // wide iinc 2 144
            var3 = var4;
            var3 = 400;
            var2_int = 320;
            var5_ref = nb.field_N;
            qj.field_a.c(var5_ref, 1 + var2_int, var3, 0, -1);
            qj.field_a.c(var5_ref, var2_int - 1, var3, 0, -1);
            qj.field_a.c(var5_ref, var2_int, var3 - -1, 0, -1);
            qj.field_a.c(var5_ref, var2_int, var3 + -1, 0, -1);
            qj.field_a.c(var5_ref, var2_int, var3, 16777215, -1);
            var5_ref = cm.field_e;
            var3 += 16;
            qj.field_a.c(var5_ref, 1 + var2_int, var3, 0, -1);
            qj.field_a.c(var5_ref, var2_int - 1, var3, 0, -1);
            qj.field_a.c(var5_ref, var2_int, 1 + var3, 0, -1);
            qj.field_a.c(var5_ref, var2_int, var3 + -1, 0, -1);
            qj.field_a.c(var5_ref, var2_int, var3, 16777215, -1);
            ti.b(12, 96, 616, 336, 16777215, n.field_L);
            break L30;
          }
        }
        L31: {
          if (-3 != (tl.field_c ^ -1)) {
            break L31;
          } else {
            L32: {
              hk.field_l[0].e(0, 0);
              ti.b(128, 105, 384, 295, 0, 192);
              ed.a(-6313, 119, 98, fg.field_P, 402, 302);
              ic.a(li.field_b, 9, -1, false, 320, 5883647, 439);
              if (!ah.a(-1)) {
                L33: {
                  if (gh.field_d != null) {
                    break L33;
                  } else {
                    gh.field_d = bk.a(3, 10, 1, 17, 5);
                    break L33;
                  }
                }
                L34: {
                  if (gh.field_d.field_s) {
                    if (gh.field_d.field_u != null) {
                      var3_ref_String__ = gh.field_d.field_u[si.field_X];
                      var4_ref_long__ = gh.field_d.field_w[si.field_X];
                      var5_ref_int__ = gh.field_d.field_o[si.field_X];
                      var6 = 0;
                      var7 = 0;
                      var8_ref = bi.field_u;
                      var9 = 123;
                      var10 = 0;
                      L35: while (true) {
                        L36: {
                          L37: {
                            if (var6 != 0) {
                              break L37;
                            } else {
                              if (ue.field_a <= 0) {
                                break L37;
                              } else {
                                stackOut_129_0 = 11;
                                stackIn_131_0 = stackOut_129_0;
                                break L36;
                              }
                            }
                          }
                          stackOut_130_0 = 10;
                          stackIn_131_0 = stackOut_130_0;
                          break L36;
                        }
                        if ((stackIn_131_0 ^ -1) >= (var10 ^ -1)) {
                          L38: {
                            if (var7 != 0) {
                              break L38;
                            } else {
                              qj.field_a.c(pd.field_p, 320, 159, 0, -1);
                              qj.field_a.c(pd.field_p, 320, 161, 0, -1);
                              qj.field_a.c(pd.field_p, 319, 160, 0, -1);
                              qj.field_a.c(pd.field_p, 321, 160, 0, -1);
                              qj.field_a.c(pd.field_p, 320, 160, 16777215, -1);
                              break L38;
                            }
                          }
                          ti.d(129, 0, 511, 479);
                          qj.field_a.c(sj.field_C, 320 + -bf.field_c, 366, 0, -1);
                          qj.field_a.c(sj.field_C, -bf.field_c + 320, 368, 0, -1);
                          qj.field_a.c(sj.field_C, 319 + -bf.field_c, 367, 0, -1);
                          qj.field_a.c(sj.field_C, -bf.field_c + 321, 367, 0, -1);
                          qj.field_a.c(sj.field_C, 320 - bf.field_c, 367, 16777215, -1);
                          ti.b();
                          break L34;
                        } else {
                          L39: {
                            var2_int = 10742263;
                            if (10 <= var10) {
                              break L39;
                            } else {
                              if (var6 != 0) {
                                break L39;
                              } else {
                                if (var8_ref == null) {
                                  break L39;
                                } else {
                                  if (!hk.a(89, var3_ref_String__[var10])) {
                                    break L39;
                                  } else {
                                    if (var4_ref_long__[var10] != var8_ref.field_k) {
                                      break L39;
                                    } else {
                                      if ((var5_ref_int__[var10] ^ -1) == (ue.field_a ^ -1)) {
                                        var6 = 1;
                                        var2_int = 16777215;
                                        break L39;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L40: {
                            L41: {
                              if ((var10 ^ -1) == -11) {
                                break L41;
                              } else {
                                if (var3_ref_String__[var10] != null) {
                                  break L41;
                                } else {
                                  break L40;
                                }
                              }
                            }
                            L42: {
                              var7 = 1;
                              var11 = 0;
                              if (-11 < (var10 ^ -1)) {
                                var11 = var5_ref_int__[var10];
                                break L42;
                              } else {
                                break L42;
                              }
                            }
                            L43: {
                              var12 = null;
                              if (10 > var10) {
                                var12_ref = var3_ref_String__[var10];
                                break L43;
                              } else {
                                break L43;
                              }
                            }
                            L44: {
                              var12 = var10 - -1 + "." + var12_ref;
                              if (var6 != 0) {
                                break L44;
                              } else {
                                if (-11 != (var10 ^ -1)) {
                                  break L44;
                                } else {
                                  if (0 < ue.field_a) {
                                    var11 = ue.field_a;
                                    var12 = wf.field_b;
                                    var2_int = 16777215;
                                    var12 = vg.field_s + var12;
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                            }
                            var13 = 162;
                            qj.field_a.a(var12, var13 - -1, var9 + 16, 0, -1);
                            qj.field_a.a(var12, -1 + var13, var9 - -16, 0, -1);
                            qj.field_a.a(var12, var13, 1 + var9 - -16, 0, -1);
                            qj.field_a.a(var12, var13, -1 + var9 + 16, 0, -1);
                            qj.field_a.a(var12, var13, 16 + var9, var2_int, -1);
                            qj.field_a.b("" + var11, 477, var9 + 16, 0, -1);
                            qj.field_a.b("" + var11, 479, 16 + var9, 0, -1);
                            qj.field_a.b("" + var11, 478, var9 - 1 - -16, 0, -1);
                            qj.field_a.b("" + var11, 478, var9 + 1 - -16, 0, -1);
                            qj.field_a.b("" + var11, 478, var9 - -16, var2_int, -1);
                            break L40;
                          }
                          var9 += 20;
                          var10++;
                          continue L35;
                        }
                      }
                    } else {
                      qj.field_a.c(ib.field_d, 320, 159, 0, -1);
                      qj.field_a.c(ib.field_d, 320, 161, 0, -1);
                      qj.field_a.c(ib.field_d, 319, 160, 0, -1);
                      qj.field_a.c(ib.field_d, 321, 160, 0, -1);
                      qj.field_a.c(ib.field_d, 320, 160, 16777215, -1);
                      break L34;
                    }
                  } else {
                    qj.field_a.c(wk.field_g, 320, 159, 0, -1);
                    qj.field_a.c(wk.field_g, 320, 161, 0, -1);
                    qj.field_a.c(wk.field_g, 319, 160, 0, -1);
                    qj.field_a.c(wk.field_g, 321, 160, 0, -1);
                    qj.field_a.c(wk.field_g, 320, 160, 16777215, -1);
                    break L34;
                  }
                }
                ic.a("                                                ", 8, -1, false, 320, 5883647, 411);
                var3 = -1;
                L45: while (true) {
                  if (var3 > 1) {
                    break L32;
                  } else {
                    L46: {
                      l.field_f.c(od.field_w[1 + var3], 192 * var3 + 319, 435, 0, 0);
                      l.field_f.c(od.field_w[1 + var3], 320 + 192 * var3, 434, 0, 0);
                      stackOut_169_0 = l.field_f;
                      stackOut_169_1 = od.field_w[var3 + 1];
                      stackOut_169_2 = 192 * var3 + 320;
                      stackOut_169_3 = 435;
                      stackIn_172_0 = stackOut_169_0;
                      stackIn_172_1 = stackOut_169_1;
                      stackIn_172_2 = stackOut_169_2;
                      stackIn_172_3 = stackOut_169_3;
                      stackIn_170_0 = stackOut_169_0;
                      stackIn_170_1 = stackOut_169_1;
                      stackIn_170_2 = stackOut_169_2;
                      stackIn_170_3 = stackOut_169_3;
                      if ((var3 ^ -1) == (si.field_X - 1 ^ -1)) {
                        stackOut_172_0 = (ub) (Object) stackIn_172_0;
                        stackOut_172_1 = (String) (Object) stackIn_172_1;
                        stackOut_172_2 = stackIn_172_2;
                        stackOut_172_3 = stackIn_172_3;
                        stackOut_172_4 = 16777215;
                        stackIn_173_0 = stackOut_172_0;
                        stackIn_173_1 = stackOut_172_1;
                        stackIn_173_2 = stackOut_172_2;
                        stackIn_173_3 = stackOut_172_3;
                        stackIn_173_4 = stackOut_172_4;
                        break L46;
                      } else {
                        stackOut_170_0 = (ub) (Object) stackIn_170_0;
                        stackOut_170_1 = (String) (Object) stackIn_170_1;
                        stackOut_170_2 = stackIn_170_2;
                        stackOut_170_3 = stackIn_170_3;
                        stackIn_171_0 = stackOut_170_0;
                        stackIn_171_1 = stackOut_170_1;
                        stackIn_171_2 = stackOut_170_2;
                        stackIn_171_3 = stackOut_170_3;
                        stackOut_171_0 = (ub) (Object) stackIn_171_0;
                        stackOut_171_1 = (String) (Object) stackIn_171_1;
                        stackOut_171_2 = stackIn_171_2;
                        stackOut_171_3 = stackIn_171_3;
                        stackOut_171_4 = 5883647;
                        stackIn_173_0 = stackOut_171_0;
                        stackIn_173_1 = stackOut_171_1;
                        stackIn_173_2 = stackOut_171_2;
                        stackIn_173_3 = stackOut_171_3;
                        stackIn_173_4 = stackOut_171_4;
                        break L46;
                      }
                    }
                    ((ub) (Object) stackIn_173_0).c(stackIn_173_1, stackIn_173_2, stackIn_173_3, stackIn_173_4, -1);
                    var3++;
                    continue L45;
                  }
                }
              } else {
                L47: {
                  qj.field_a.c(pd.field_p, 320, 159, 0, -1);
                  qj.field_a.c(pd.field_p, 320, 161, 0, -1);
                  qj.field_a.c(pd.field_p, 319, 160, 0, -1);
                  qj.field_a.c(pd.field_p, 321, 160, 0, -1);
                  qj.field_a.c(pd.field_p, 320, 160, 16777215, -1);
                  if (!ah.a(param0 ^ -86)) {
                    break L47;
                  } else {
                    int discarded$14 = qj.field_a.a(hj.field_e, 220, 192, 200, 200, 16777215, 0, 1, 0, qj.field_a.field_N);
                    break L47;
                  }
                }
                ic.a(wl.field_T, 8, -1, false, 320, 5883647, 411);
                break L32;
              }
            }
            ti.b(128, 105, 384, 295, 16777215, n.field_L);
            break L31;
          }
        }
        L48: {
          if (-4 != (tl.field_c ^ -1)) {
            break L48;
          } else {
            L49: {
              ((ij) this).field_r = -1;
              ti.b(108, 112, 424, 296, 0, 192);
              ed.a(-6313, 99, 105, fg.field_P, 442, 303);
              ti.e(175, 129, 282, 82, 4, 2387345);
              if (3 == bb.field_d) {
                ti.e(126, -98 + (330 + 5 * qj.field_a.field_N / 2) - 7, 388, 132, 4, 2387345);
                break L49;
              } else {
                ti.e(130, -96 + (qj.field_a.field_N * 5 / 2 + 321), 380, 132, 4, 2387345);
                break L49;
              }
            }
            L50: {
              if (!oc.field_d) {
                hk.field_l[2].e(0, 0);
                break L50;
              } else {
                hk.field_l[3].e(0, 0);
                break L50;
              }
            }
            L51: {
              ic.a(li.field_b, 9, -1, false, 320, 5883647, 439);
              if (oc.field_d) {
                ic.a(ta.field_r, 8, -1, false, 320, 5883647, 411);
                break L51;
              } else {
                break L51;
              }
            }
            L52: {
              if (ah.a(param0 + -86)) {
                ic.a(wl.field_T, 8, -1, false, 320, 5883647, 411);
                break L52;
              } else {
                break L52;
              }
            }
            L53: {
              var2_int = 180;
              var3 = 134;
              if (oc.field_d) {
                stackOut_194_0 = tl.field_a;
                stackIn_195_0 = stackOut_194_0;
                break L53;
              } else {
                if (!ah.a(-1)) {
                  stackOut_193_0 = sd.field_d;
                  stackIn_195_0 = stackOut_193_0;
                  break L53;
                } else {
                  stackOut_192_0 = 0;
                  stackIn_195_0 = stackOut_192_0;
                  break L53;
                }
              }
            }
            var4 = stackIn_195_0;
            var5 = 0;
            var6 = 1;
            var7 = 0;
            L54: while (true) {
              if (rc.field_e.length <= var7) {
                L55: {
                  if (var6 == 0) {
                    break L55;
                  } else {
                    var7 = 330 - (-(qj.field_a.field_N * 5 / 2) + 96);
                    var7 = var7 + qj.field_a.field_N;
                    qj.field_a.c(id.field_l, 320, var7, 10742263, -1);
                    if (ah.a(-1)) {
                      qj.field_a.c(hj.field_e, 320, var7 + 100, 10742263, -1);
                      break L55;
                    } else {
                      break L55;
                    }
                  }
                }
                ti.b(108, 80, 424, 328, 16777215, n.field_L);
                break L48;
              } else {
                L56: {
                  L57: {
                    if (var7 != 13) {
                      break L57;
                    } else {
                      if (pk.a(-12663, 0)) {
                        break L57;
                      } else {
                        if ((var4 & 1 << var7) == 0) {
                          var5++;
                          break L56;
                        } else {
                          break L57;
                        }
                      }
                    }
                  }
                  L58: {
                    var8 = 0;
                    if ((var2_int ^ -1) < (ni.field_e ^ -1)) {
                      break L58;
                    } else {
                      if ((ni.field_e ^ -1) < (32 + var2_int ^ -1)) {
                        break L58;
                      } else {
                        if ((eb.field_a ^ -1) > (var3 ^ -1)) {
                          break L58;
                        } else {
                          if (var3 - -32 >= eb.field_a) {
                            ((ij) this).field_r = var7;
                            var8 = 2;
                            if ((((ij) this).field_u ^ -1) != 0) {
                              ti.e(var2_int - 2, -2 + var3, 36, 36, 4, 1193544);
                              break L58;
                            } else {
                              break L58;
                            }
                          } else {
                            break L58;
                          }
                        }
                      }
                    }
                  }
                  L59: {
                    if ((var7 ^ -1) == (((ij) this).field_u ^ -1)) {
                      var8 = 2;
                      ti.e(-3 + var2_int, var3 - 3, 38, 38, 4, 2387345);
                      break L59;
                    } else {
                      break L59;
                    }
                  }
                  L60: {
                    if (0 != (1 << var7 & var4)) {
                      wh.field_e[var7].a(var2_int - var8, -var8 + var3, var8 * 2 + 32, 2 * var8 + 32);
                      break L60;
                    } else {
                      if (oc.field_d) {
                        break L56;
                      } else {
                        L61: {
                          if (6 == var7) {
                            break L61;
                          } else {
                            if (var7 == 8) {
                              break L61;
                            } else {
                              if ((mk.field_k ^ -1) >= -1) {
                                ce.field_a.a(var2_int + -var8, -var8 + var3, 32 + var8 * 2, 32 - -(2 * var8));
                                break L60;
                              } else {
                                break L61;
                              }
                            }
                          }
                        }
                        uf.field_g.a(-var8 + var2_int, -var8 + var3, 2 * var8 + 32, 32 + var8 * 2);
                        break L60;
                      }
                    }
                  }
                  L62: {
                    L63: {
                      if ((var7 ^ -1) == (((ij) this).field_u ^ -1)) {
                        break L63;
                      } else {
                        if (((ij) this).field_u != -1) {
                          break L62;
                        } else {
                          if ((var2_int ^ -1) < (ni.field_e ^ -1)) {
                            break L62;
                          } else {
                            if ((32 + var2_int ^ -1) > (ni.field_e ^ -1)) {
                              break L62;
                            } else {
                              if ((var3 ^ -1) < (eb.field_a ^ -1)) {
                                break L62;
                              } else {
                                if (eb.field_a <= var3 + 32) {
                                  break L63;
                                } else {
                                  break L62;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L64: {
                      qj.field_a.c(rc.field_e[var7], 320, 230, 16777215, -1);
                      var6 = 0;
                      if ((1 << var7 & var4) == 0) {
                        qj.field_a.c(tf.field_c, 320, 234 + qj.field_a.field_N, 16711680, -1);
                        break L64;
                      } else {
                        qj.field_a.c(jg.field_ob, 320, qj.field_a.field_N + 234, 16777215, -1);
                        break L64;
                      }
                    }
                    L65: {
                      var9 = qj.field_a.field_N * 5 / 2 + 323 - 96;
                      if (-1 == (1 << var7 & var4 ^ -1)) {
                        L66: {
                          if (-7 == (var7 ^ -1)) {
                            break L66;
                          } else {
                            if (8 == var7) {
                              break L66;
                            } else {
                              if ((mk.field_k ^ -1) < -1) {
                                break L66;
                              } else {
                                ce.field_a.e(132, var9);
                                break L65;
                              }
                            }
                          }
                        }
                        uf.field_g.e(132, var9);
                        break L65;
                      } else {
                        wh.field_e[var7].e(132, var9);
                        break L65;
                      }
                    }
                    var9 = var9 + qj.field_a.field_N;
                    int discarded$15 = qj.field_a.a(hc.field_t[var7] + "<br><br>" + bb.field_h + wf.field_d[var7] + "<br><br>" + dd.field_b + am.field_d[var7], 280, -qj.field_a.field_N + var9, 228, 92, 10742263, -1, 1, 1, 2 + qj.field_a.field_N);
                    var10 = am.field_d[var7];
                    var11 = 0;
                    L67: while (true) {
                      if ((var10 ^ -1) >= (var11 ^ -1)) {
                        break L62;
                      } else {
                        af.field_n.a(-16 + -(4 * (var10 + -1)) + 8 * var11 + 394, 126 + var9 - (qj.field_a.field_N - -32));
                        var11++;
                        continue L67;
                      }
                    }
                  }
                  var5++;
                  if (6 == var5) {
                    var3 += 40;
                    var2_int = 180;
                    break L56;
                  } else {
                    var2_int += 40;
                    break L56;
                  }
                }
                var7++;
                continue L54;
              }
            }
          }
        }
        super.a(param0);
    }

    static {
    }
}
