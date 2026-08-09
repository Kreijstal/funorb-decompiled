/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg implements Runnable {
    go field_b;
    static byte[] field_a;
    static cj field_d;
    volatile boolean field_h;
    volatile boolean field_c;
    volatile gp[] field_f;
    static ag field_i;
    static hk field_e;
    static uc field_g;

    final static int a(int param0, CharSequence param1, int param2, int param3, byte[] param4, int param5) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_99_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == -256) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 10;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var6_int = param5 - param2;
                        var7 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var6_int <= var7) {
                            statePc = 98;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = param1.charAt(param2 + var7);
                        stackIn_99_0 = var8;
                        stackIn_7_0 = stackIn_99_0;
                        if (var9 != 0) {
                            statePc = 99;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 <= 0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var8 < 128) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var8 < 160) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var8 > 255) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        param4[var7 + param0] = (byte)var8;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (8364 == var8) {
                            statePc = 96;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (8218 == var8) {
                            statePc = 94;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var8 == 402) {
                            statePc = 92;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var8 == 8222) {
                            statePc = 90;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var8 == 8230) {
                            statePc = 88;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var8 == 8224) {
                            statePc = 86;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var8 != 8225) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param4[param0 - -var7] = (byte)-121;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var8 == 710) {
                            statePc = 84;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var8 != 8240) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param4[var7 + param0] = (byte)-119;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var8 == 352) {
                            statePc = 82;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var8 != 8249) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        param4[param0 + var7] = (byte)-117;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var8 == 338) {
                            statePc = 80;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var8 != 381) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        param4[param0 + var7] = (byte)-114;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var8 == 8216) {
                            statePc = 78;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var8 == 8217) {
                            statePc = 76;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var8 == 8220) {
                            statePc = 74;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var8 == 8221) {
                            statePc = 72;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var8 == 8226) {
                            statePc = 70;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var8 != 8211) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        param4[param0 + var7] = (byte)-106;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var8 == 8212) {
                            statePc = 68;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (732 != var8) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        param4[var7 + param0] = (byte)-104;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var8 == 8482) {
                            statePc = 66;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (353 != var8) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        param4[param0 - -var7] = (byte)-102;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var8 != 8250) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        param4[param0 - -var7] = (byte)-101;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var8 != 339) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        param4[param0 + var7] = (byte)-100;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var8 != 382) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        param4[var7 + param0] = (byte)-98;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var8 != 376) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        param4[param0 - -var7] = (byte)-97;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        param4[var7 + param0] = (byte)63;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        param4[var7 + param0] = (byte)-103;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        param4[param0 + var7] = (byte)-105;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        param4[var7 + param0] = (byte)-107;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        param4[var7 + param0] = (byte)-108;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        param4[param0 + var7] = (byte)-109;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        param4[param0 + var7] = (byte)-110;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        param4[var7 + param0] = (byte)-111;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        param4[var7 + param0] = (byte)-116;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        param4[var7 + param0] = (byte)-118;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        param4[param0 + var7] = (byte)-120;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        param4[param0 + var7] = (byte)-122;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        param4[var7 + param0] = (byte)-123;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        param4[param0 - -var7] = (byte)-124;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        param4[param0 + var7] = (byte)-125;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        param4[var7 + param0] = (byte)-126;
                        if (var9 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        param4[var7 + param0] = (byte)-128;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var7++;
                        if (var9 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        stackIn_99_0 = var6_int;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 99: {
                    return stackIn_99_0;
                }
                case 100: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_102_0 = (RuntimeException) (var6);
                    stackIn_101_0 = stackIn_102_0;
                    stackIn_102_1 = new StringBuilder().append("tg.H(").append(param0).append(',');
                    stackIn_101_1 = stackIn_102_1;
                    if (param1 == null) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackIn_103_0 = (RuntimeException) ((Object) stackIn_101_0);
                    stackIn_103_1 = (StringBuilder) ((Object) stackIn_101_1);
                    stackIn_103_2 = "{...}";
                    statePc = 103;
                    continue stateLoop;
                }
                case 102: {
                    stackIn_103_0 = (RuntimeException) ((Object) stackIn_102_0);
                    stackIn_103_1 = (StringBuilder) ((Object) stackIn_102_1);
                    stackIn_103_2 = "null";
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    stackIn_105_0 = (RuntimeException) ((Object) stackIn_103_0);
                    stackIn_104_0 = stackIn_105_0;
                    stackIn_105_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_103_2).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_104_1 = stackIn_105_1;
                    if (param4 == null) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    stackIn_106_0 = (RuntimeException) ((Object) stackIn_104_0);
                    stackIn_106_1 = (StringBuilder) ((Object) stackIn_104_1);
                    stackIn_106_2 = "{...}";
                    statePc = 106;
                    continue stateLoop;
                }
                case 105: {
                    stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
                    stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
                    stackIn_106_2 = "null";
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    throw fa.a((Throwable) ((Object) stackIn_106_0), stackIn_106_2 + ',' + param5 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static ja[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ja var16 = null;
        int[] var18 = oo.field_i;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = oo.field_b;
        int var8 = oo.field_l;
        ja var9 = new ja(param3, -(param3 * 2) + param1);
        var9.a();
        oo.a(0, 0, param3, -(param3 * 2) + param1, param4, param2);
        ja var10 = new ja(param3, param3);
        if (param5 <= 25) {
            field_d = (cj) null;
        }
        var10.a();
        oo.e(0, 0, param3, param3, param4);
        ja var11 = new ja(16, param3);
        var11.a();
        oo.e(0, 0, 16, param3, param4);
        ja var12 = new ja(param3, param3);
        var12.a();
        oo.e(0, 0, param3, param3, param2);
        ja var13 = new ja(16, param3);
        var13.a();
        oo.e(0, 0, 16, param3, param2);
        Object var14 = null;
        if (-1 > (param0 ^ -1)) {
            var16 = new ja(16, 16);
            var14 = var16;
            var16.a();
            oo.e(0, 0, 16, 16, param0);
        }
        oo.a(var18, var7, var8);
        return new ja[]{var10, var11, var10, var9, (ja) (var14), var9, var12, var13, var12};
    }

    final static int b(int param0) {
        if (-3 < (fn.field_i ^ -1)) {
          return 0;
        } else {
          if (p.field_e == 0) {
            if (ra.field_l.a((byte) -124)) {
              if (!ra.field_l.a(false, "commonui")) {
                return 40;
              } else {
                if (!fe.field_L.a((byte) -111)) {
                  return 50;
                } else {
                  if (!fe.field_L.a(false, "commonui")) {
                    return 60;
                  } else {
                    if (!wm.field_V.a((byte) -117)) {
                      return 70;
                    } else {
                      if (!wm.field_V.a(0)) {
                        return 80;
                      } else {
                        L0: {
                          if (param0 == 8218) {
                            break L0;
                          } else {
                            field_i = (ag) null;
                            break L0;
                          }
                        }
                        return 100;
                      }
                    }
                  }
                }
              }
            } else {
              return 20;
            }
          } else {
            L1: {
              if (null == cp.field_P) {
                break L1;
              } else {
                if (cp.field_P.a((byte) -116)) {
                  if (cp.field_P.a("", 2)) {
                    if (!cp.field_P.a(false, "")) {
                      return 29;
                    } else {
                      break L1;
                    }
                  } else {
                    return 29;
                  }
                } else {
                  return 14;
                }
              }
            }
            if (ra.field_l.a((byte) -115)) {
              if (!ra.field_l.a(false, "commonui")) {
                return 57;
              } else {
                if (!fe.field_L.a((byte) -115)) {
                  return 71;
                } else {
                  if (!fe.field_L.a(false, "commonui")) {
                    return 80;
                  } else {
                    if (!wm.field_V.a((byte) -122)) {
                      return 82;
                    } else {
                      if (!wm.field_V.a(0)) {
                        return 86;
                      } else {
                        L2: {
                          if (param0 == 8218) {
                            break L2;
                          } else {
                            field_i = (ag) null;
                            break L2;
                          }
                        }
                        return 100;
                      }
                    }
                  }
                }
              }
            } else {
              return 43;
            }
          }
        }
    }

    final static uc a(String param0, boolean param1) {
        RuntimeException var2 = null;
        uc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                tg.a((byte) 33, false);
                break L1;
              }
            }
            stackIn_3_0 = new uc(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("tg.C(");

            if (param0 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(CharSequence param0, boolean param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        int stackIn_12_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_18_0 = 0;
        Object stackIn_22_0 = null;
        boolean stackIn_26_0 = false;
        boolean stackIn_33_0 = false;
        Object stackIn_37_0 = null;
        String stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_6_0;
        boolean stackOut_13_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
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
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (String) ((Object) stackIn_3_0);
                }
                case 4: {
                    try {
                        var2_int = 0;
                        var3 = param0.length();
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var2_int >= var3) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = eb.a((byte) -126, param0.charAt(var2_int));
                        stackIn_12_0 = stackOut_6_0 ? 1 : 0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var9 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!stackIn_7_0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int++;
                        if (var9 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = var3 ^ -1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 >= (var2_int ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = eb.a((byte) 110, param0.charAt(var3 - 1));
                        stackIn_18_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var9 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!stackIn_14_0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3--;
                        if (var9 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = -var2_int + var3;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4 = stackIn_18_0;
                        if ((var4 ^ -1) <= -2) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var4 ^ -1) >= -13) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = null;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return (String) ((Object) stackIn_22_0);
                }
                case 23: {
                    try {
                        var5 = new StringBuilder(var4);
                        var6 = var2_int;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var3 <= var6) {
                            statePc = 32;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7 = param0.charAt(var6);
                        stackIn_33_0 = lo.a(8192, (char) var7);
                        stackIn_26_0 = stackIn_33_0;
                        if (var9 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var9 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var8 = qf.a(28233, (char) var7);
                        if (var8 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        discarded$0 = var5.append((char) var8);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var6++;
                        if (var9 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = param1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (!stackIn_33_0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        tg.b(83);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-1 != (var5.length() ^ -1)) {
                            statePc = 38;
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
                        stackIn_37_0 = null;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return (String) ((Object) stackIn_37_0);
                }
                case 38: {
                    try {
                        stackIn_39_0 = var5.toString();
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return stackIn_39_0;
                }
                case 40: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_42_0 = (RuntimeException) (var2);
                    stackIn_41_0 = stackIn_42_0;
                    stackIn_42_1 = new StringBuilder().append("tg.F(");
                    stackIn_41_1 = stackIn_42_1;
                    if (param0 == null) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_43_0 = (RuntimeException) ((Object) stackIn_41_0);
                    stackIn_43_1 = (StringBuilder) ((Object) stackIn_41_1);
                    stackIn_43_2 = "{...}";
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
                    stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                    stackIn_43_2 = "null";
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    throw fa.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, boolean param1, int param2) {
        ja stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        ja stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        ja stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        ja stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        er var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        Object var17;
        er var17_ref;
        cj var18;
        ja var19;
        ja var20;
        L0: {
          L1: {
            var17 = null;
            var16 = ZombieDawnMulti.field_E ? 1 : 0;
            if (param2 == -7) {
              break L1;
            } else {
              L2: {
                if (1 == (param2 ^ -1)) {
                  break L2;
                } else {
                  gk.a(2, param2).b(0);
                  gk.a(2, param2).a(true);
                  gk.a(2, param2).d(4);
                  if (var16 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                gk.a(2, 1).b(0);
                oo.f(0, 0, 640, 480, 0, 128);
                var18 = vb.a(21262);
                if (var18 != null) {
                  L4: {
                    var4 = var18.field_zb / 2 + var18.field_w;
                    var5 = -6 + (var18.field_qb + var18.field_z - 48);
                    oo.h(3 + var18.field_w, var18.field_qb, -6 + var18.field_w + var18.field_zb, var18.field_qb + var18.field_z + -3);
                    e.field_e.field_g = 0;
                    e.field_e.field_k = 420 + -var4 + -(var18.field_zb / 4);
                    kk.field_w.a(-10136, e.field_e);
                    kk.field_w.field_P = nk.a(1052688, 455739624, ll.field_k.field_p[1]);
                    var6 = 0;
                    var7 = 30;
                    var8 = 0;
                    var9 = 7;
                    var10 = wf.field_m / var7 % var9 - -var8;
                    var19 = nk.a(no.field_Hb[var6][var10], ll.field_k.field_c[0], 255, ll.field_k.field_p[0]);
                    og.h((byte) 126);
                    var19.g(var4 - var18.field_zb / 4, var5);
                    var7 = 45;
                    var6 = 1;
                    var10 = (wf.field_m - -3) / var7 % var9 + var8;
                    var20 = nk.a(no.field_Hb[var6][var10], ll.field_k.field_c[1], 255, ll.field_k.field_p[1]);
                    og.h((byte) 119);
                    var20.b(var18.field_zb / 4 + var4, var5);
                    oo.h(3 + var18.field_w, var18.field_qb, var18.field_zb + (var18.field_w - 6), -3 + (var18.field_qb - -var18.field_z));
                    var12 = 1;
                    var6 = (int)(1.1 * (double)wf.field_m) / 64 % 10;
                    var8 = gg.field_l[var12];
                    var7 = gg.field_b[var12];
                    var9 = gg.field_j[var12];
                    var13 = (int)((double)wf.field_m * 1.1) % 64;
                    var10 = (8 + wf.field_m) / var7 % var9 + var8;
                    var14 = var4 - -8;
                    var15 = 50 - -var5 + (3 - var13);
                    stackIn_8_0 = wq.field_c[var6][var10];

                    stackIn_8_1 = var14;

                    stackIn_8_2 = var15;

                    if (var13 < 48) {
                      stackIn_9_0 = (ja) ((Object) stackIn_8_0);
                      stackIn_9_1 = stackIn_8_1;
                      stackIn_9_2 = stackIn_8_2;
                      stackIn_9_3 = 256;
                      break L4;
                    } else {
                      stackIn_9_0 = (ja) ((Object) stackIn_8_0);
                      stackIn_9_1 = stackIn_8_1;
                      stackIn_9_2 = stackIn_8_2;
                      stackIn_9_3 = 64 + -var13 << 477500708;
                      break L4;
                    }
                  }
                  L5: {
                    ((ja) (Object) stackIn_9_0).c(stackIn_9_1, stackIn_9_2, stackIn_9_3);
                    var14 = -8 + var4;
                    var10 = var8 + (3 + wf.field_m) / var7 % var9;
                    var6 = (wf.field_m + 13) / 64 % 10;
                    var13 = (13 + wf.field_m) % 64;
                    var15 = 3 + (50 - -var5) - var13;
                    stackIn_11_0 = wq.field_c[var6][var10];

                    stackIn_11_1 = var14;

                    stackIn_11_2 = var15;

                    if (var13 < 48) {
                      stackIn_12_0 = (ja) ((Object) stackIn_11_0);
                      stackIn_12_1 = stackIn_11_1;
                      stackIn_12_2 = stackIn_11_2;
                      stackIn_12_3 = 256;
                      break L5;
                    } else {
                      stackIn_12_0 = (ja) ((Object) stackIn_11_0);
                      stackIn_12_1 = stackIn_11_1;
                      stackIn_12_2 = stackIn_11_2;
                      stackIn_12_3 = -var13 + 64 << -492264060;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      ((ja) (Object) stackIn_12_0).c(stackIn_12_1, stackIn_12_2, stackIn_12_3);
                      if (400 > wf.field_m % 1000) {
                        break L7;
                      } else {
                        if (-401 >= ((500 + wf.field_m) % 1000 ^ -1)) {
                          break L6;
                        } else {
                          qp.field_w.a(wm.field_P, -130 + var4, var5 - 30, 100, 50, 16777215, 65793, 1, 0, 0);
                          if (var16 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    qp.field_w.a(nq.field_A, 80 + var4, -30 + var5, 100, 50, 16777215, 65793, 1, 0, 0);
                    break L6;
                  }
                  oo.c();
                  break L3;
                } else {
                  break L3;
                }
              }
              tm.a(vk.i((byte) -39), false);
              br.a(vk.i((byte) -39), 2);
              pm.a(false, vk.i((byte) -39));
              if (var16 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L8: {
            if (null != np.field_m) {
              np.field_m.b(true, 1);
              break L8;
            } else {
              break L8;
            }
          }
          if (af.field_e == null) {
            break L0;
          } else {
            af.field_e.b(true, 1);
            break L0;
          }
        }
        L9: {
          if (!am.a(-110)) {
            break L9;
          } else {
            ui.a(param1, false);
            break L9;
          }
        }
        L10: {
          var17_ref = (er) ((Object) bh.field_d.c(104));
          var3 = var17_ref;
          if (param0 <= -8) {
            break L10;
          } else {
            tg.a((byte) -77, false);
            break L10;
          }
        }
        L11: {
          if (var3 == null) {
            break L11;
          } else {
            L12: {
              L13: {
                var4 = 10;
                var5 = 10;
                var6 = var17_ref.field_g;
                var7 = pb.field_e.a(dg.field_G[var6]) + 70;
                var8 = er.field_k;
                if (-33 < (var8 ^ -1)) {
                  break L13;
                } else {
                  if (var8 <= 303) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (var8 > 32) {
                  var8 = -var8 + 335;
                  break L14;
                } else {
                  break L14;
                }
              }
              var4 = -310 + var8 * 10;
              break L12;
            }
            oo.b(var4, var5, var7, 40, 6, 0, 160);
            oo.b(var4, var5, var7, 40, 6, 7829367);
            la.field_l[var6].b(var4 + 9, var5 + 5);
            pb.field_e.c(dg.field_G[var6], var4 - -50, 25 + var5, 16777215, 3355443);
            break L11;
          }
        }
    }

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        gp var2 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        Throwable var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    this.field_c = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_h) {
                            statePc = 11;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = ((Object) stateCaught_1 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var1_int >= 2) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = this.field_f[var1_int];
                        if (var4 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var2 == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2.a();
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_int++;
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        vd.a(false, 10L);
                        var5 = (Object) null;
                        de.a(this.field_b, (byte) 99, (Object) null);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = ((Object) stateCaught_10 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 11: {
                    this.field_c = false;
                    statePc = 16;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        exception = (Exception) ((Object) caughtException);
                        var6 = (String) null;
                        bd.a((String) null, (Throwable) ((Object) exception), false);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    this.field_c = false;
                    statePc = 16;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        var3 = caughtException;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    this.field_c = false;
                    throw tg.<RuntimeException>$cfr$sneakyThrow(var3);
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, boolean param1) {
        ci stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ci stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ci stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_21_0 = false;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        String[] var3 = null;
        bm var5 = null;
        fc var6 = null;
        ro var7 = null;
        hk[] var8 = null;
        int var9_int = 0;
        kb var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var15 = null;
        k var16 = null;
        int[] var18 = null;
        byte[] var20 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 23) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        pp.field_n = param1;
                        df.field_I = true;
                        var2 = ta.field_lb;
                        if (var2 == null) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = oe.field_d;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = new String[]{var2};
                        stackIn_8_0 = bn.field_d;
                        stackIn_7_0 = stackIn_8_0;
                        stackIn_8_1 = -85;
                        stackIn_7_1 = stackIn_8_1;
                        if (!pp.field_n) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_9_0 = (ci) ((Object) stackIn_7_0);
                        stackIn_9_1 = stackIn_7_1;
                        stackIn_9_2 = 1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = (ci) ((Object) stackIn_8_0);
                        stackIn_9_1 = stackIn_8_1;
                        stackIn_9_2 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var20 = ((ci) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2);
                        var5 = (bm) ((Object) sf.a((byte) -96, var20));
                        var6 = wh.a(var20, -67);
                        var7 = new ro(var3, var5);
                        var8 = new hk[4];
                        var8[0] = new hk();
                        var9_int = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var9_int >= 3) {
                            statePc = 20;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = ((Object) stateCaught_10 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_21_0 = pp.field_n;
                        stackIn_12_0 = stackIn_21_0;
                        if (var12 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = ((Object) stateCaught_11 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = ((Object) stateCaught_12 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!h.i(51603)) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = ((Object) stateCaught_13 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!jk.a((byte) -128, ll.field_k.field_s[var9_int])) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = ((Object) stateCaught_14 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = ((Object) stateCaught_15 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8[0].field_c[var9_int] = 255;
                        if (var12 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = ((Object) stateCaught_16 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = ((Object) stateCaught_17 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8[0].field_c[var9_int] = ll.field_k.field_s[var9_int];
                        var7.field_e[0] = cp.a(var7.field_e[0], 1L << ll.field_k.field_s[var9_int]);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = ((Object) stateCaught_18 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9_int++;
                        if (var12 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = ((Object) stateCaught_19 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = pp.field_n;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = ((Object) stateCaught_20 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!stackIn_21_0) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = ((Object) stateCaught_21 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8[0].field_d[0] = 0;
                        var8[0].field_f[0] = 255;
                        var9_int = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = ((Object) stateCaught_22 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var9_int >= 5) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = ((Object) stateCaught_23 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var18 = var8[0].field_f;
                        var15 = var18;
                        var13 = var15;
                        var10 = var13;
                        var11 = var9_int;
                        var8[0].field_d[var9_int] = 255;
                        var18[var11] = 255;
                        var9_int++;
                        if (var12 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = ((Object) stateCaught_24 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var12 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = ((Object) stateCaught_25 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = ((Object) stateCaught_26 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var12 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = ((Object) stateCaught_27 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9_int = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = ((Object) stateCaught_28 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (-6 >= (var9_int ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = ((Object) stateCaught_29 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var8[0].field_d[var9_int] = ll.field_k.field_m[var9_int];
                        var8[0].field_f[var9_int] = ll.field_k.field_g[var9_int];
                        var9_int++;
                        if (var12 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = ((Object) stateCaught_30 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var12 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = ((Object) stateCaught_31 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = ((Object) stateCaught_32 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9_int = 1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = ((Object) stateCaught_33 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var8.length <= var9_int) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = ((Object) stateCaught_34 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var8[var9_int] = new hk();
                        var9_int++;
                        if (var12 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = ((Object) stateCaught_35 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var12 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = ((Object) stateCaught_36 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = ((Object) stateCaught_37 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var7.field_C = 2147483647;
                        var5.a(var7, (byte) 53);
                        cf.field_s = new rl(var7, var8, true, false);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = ((Object) stateCaught_38 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = new kb(var3, var6);
                        var7.field_H = 1000;
                        var16 = new k(4096);
                        var7.a(var16, (byte) -122);
                        var16.field_j = 1;
                        var9.a(2, var16);
                        var9.field_C = 2147483646;
                        var9.field_H = var7.field_H + -50;
                        wp.field_h = new qd(var9, var8[0], 0);
                        np.field_m = wp.field_h;
                        hh.field_b = true;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = ((Object) stateCaught_39 instanceof Exception ? 41 : 43);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var2_ref = (Exception) ((Object) caughtException);
                        var2_ref.printStackTrace();
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    var2_ref2 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2_ref2), "tg.B(" + param0 + ',' + param1 + ')');
                }
                case 44: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        field_d = null;
        if (param0 > -35) {
            CharSequence var2 = (CharSequence) null;
            tg.a((CharSequence) null, false);
        }
        field_e = null;
    }

    final static ja[] a(int param0) {
        boolean stackIn_3_0 = false;
        int stackIn_20_0 = 0;
        boolean stackOut_2_0;
        int statePc = 0;
        ja[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawnMulti.field_E ? 1 : 0;
                    var1 = new ja[qc.field_v];
                    var2 = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (qc.field_v <= var2) {
                        statePc = 19;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3 = vj.field_p[var2] * oq.field_w[var2];
                    var17 = qp.field_t[var2];
                    stackOut_2_0 = ll.field_h[var2];
                    stackIn_20_0 = stackOut_2_0 ? 1 : 0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var8 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (!stackIn_3_0) {
                        statePc = 11;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var18 = vf.field_b[var2];
                    var14 = new int[var3];
                    var12 = var14;
                    var6_ref_int__ = var12;
                    var7 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var3 <= var7) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var6_ref_int__[var7] = cr.b(tp.field_t[tq.b((int) var17[var7], 255)], tq.b(255, (int) var18[var7]) << -44073448);
                    var7++;
                    if (var8 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var8 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var1[var2] = (ja) ((Object) new rf(ie.field_nb, hj.field_a, k.field_i[var2], qj.field_o[var2], oq.field_w[var2], vj.field_p[var2], var14));
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var8 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var10 = new int[var3];
                    var6 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var3 <= var6) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var10[var6] = tp.field_t[tq.b(255, (int) var17[var6])];
                    var6++;
                    if (var8 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var8 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var1[var2] = new ja(ie.field_nb, hj.field_a, k.field_i[var2], qj.field_o[var2], oq.field_w[var2], vj.field_p[var2], var10);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var2++;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var8 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = 125;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    fd.h((byte) stackIn_20_0);
                    return var1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    tg() {
        this.field_f = new gp[2];
        this.field_h = false;
        this.field_c = false;
    }

    static {
        field_i = null;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
