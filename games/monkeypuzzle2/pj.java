/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static md field_g;
    static vd field_a;
    static kc field_b;
    static ta field_c;
    ug field_f;
    static float field_h;
    static String field_d;
    private ug field_e;

    final void b(byte param0) {
        ug var2 = null;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var2 = this.field_f.field_d;
                    if (this.field_f != var2) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (var3 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var3 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var2.c(param0 + -19943);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (param0 != 121) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_e = null;
                    return;
                }
                case 9: {
                    field_b = (kc) null;
                    this.field_e = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static byte[] a(int param0, CharSequence param1) {
        byte[] stackIn_96_0 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
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
                        var2_int = param1.length();
                        var3 = new byte[var2_int];
                        var4 = 0;
                        if (param0 == 3231) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_a = (vd) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var2_int <= var4) {
                            statePc = 95;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5 = param1.charAt(var4);
                        if (0 >= var5) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (128 > var5) {
                            statePc = 93;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5 < 160) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var5 <= 255) {
                            statePc = 93;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5 != 8364) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3[var4] = (byte)-128;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var5 == 8218) {
                            statePc = 91;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5 != 402) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3[var4] = (byte)-125;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var5 == 8222) {
                            statePc = 89;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var5 == 8230) {
                            statePc = 87;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (8224 != var5) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3[var4] = (byte)-122;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var5 == 8225) {
                            statePc = 85;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var5 != 710) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var3[var4] = (byte)-120;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var5 == 8240) {
                            statePc = 83;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var5 != 352) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var3[var4] = (byte)-118;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var5 == 8249) {
                            statePc = 81;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (338 == var5) {
                            statePc = 79;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (381 != var5) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var3[var4] = (byte)-114;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (8216 != var5) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var3[var4] = (byte)-111;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var5 != 8217) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var3[var4] = (byte)-110;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (8220 != var5) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var3[var4] = (byte)-109;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var5 != 8221) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var3[var4] = (byte)-108;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (8226 != var5) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var3[var4] = (byte)-107;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var5 == 8211) {
                            statePc = 77;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var5 != 8212) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var3[var4] = (byte)-105;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var5 == 732) {
                            statePc = 75;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var5 == 8482) {
                            statePc = 73;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (353 == var5) {
                            statePc = 71;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (8250 != var5) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var3[var4] = (byte)-101;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var5 == 339) {
                            statePc = 69;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var5 == 382) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var5 == 376) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var3[var4] = (byte)63;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var3[var4] = (byte)-97;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var3[var4] = (byte)-98;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var3[var4] = (byte)-100;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var3[var4] = (byte)-102;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var3[var4] = (byte)-103;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var3[var4] = (byte)-104;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var3[var4] = (byte)-106;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var3[var4] = (byte)-116;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var3[var4] = (byte)-117;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var3[var4] = (byte)-119;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var3[var4] = (byte)-121;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var3[var4] = (byte)-123;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var3[var4] = (byte)-124;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var3[var4] = (byte)-126;
                        if (var6 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var3[var4] = (byte)var5;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        stackIn_96_0 = (byte[]) (var3);
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 96: {
                    return stackIn_96_0;
                }
                case 97: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_99_0 = (RuntimeException) (var2);
                    stackIn_98_0 = stackIn_99_0;
                    stackIn_99_1 = new StringBuilder().append("pj.K(").append(param0).append(',');
                    stackIn_98_1 = stackIn_99_1;
                    if (param1 == null) {
                        statePc = 99;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    stackIn_100_0 = (RuntimeException) ((Object) stackIn_98_0);
                    stackIn_100_1 = (StringBuilder) ((Object) stackIn_98_1);
                    stackIn_100_2 = "{...}";
                    statePc = 100;
                    continue stateLoop;
                }
                case 99: {
                    stackIn_100_0 = (RuntimeException) ((Object) stackIn_99_0);
                    stackIn_100_1 = (StringBuilder) ((Object) stackIn_99_1);
                    stackIn_100_2 = "null";
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    throw la.a((Throwable) ((Object) stackIn_100_0), stackIn_100_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, d param1, boolean param2) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hb var7 = null;
        hb var8 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7 = gf.field_c;
                        var8 = var7;
                        var8.b(param2, param0);
                        var8.field_h = var8.field_h + 1;
                        var4 = var8.field_h;
                        var8.b(1, -49152);
                        var8.c(param1.field_n, 121);
                        var8.c(param1.field_m, 88);
                        var8.c(param1.field_p, 62);
                        var8.a(-803539344, param1.field_o);
                        var8.a(-803539344, param1.field_i);
                        var8.a(-803539344, param1.field_j);
                        var8.a(-803539344, param1.field_l);
                        var8.b(param1.field_f.length, -49152);
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1.field_f.length <= var5) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7.a(-803539344, param1.field_f[var5]);
                        var5++;
                        if (var6 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8.a((byte) -108, var4);
                        var8.a(var8.field_h + -var4, (byte) -124);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_10_0 = (RuntimeException) (var3);
                    stackIn_9_0 = stackIn_10_0;
                    stackIn_10_1 = new StringBuilder().append("pj.E(").append(param0).append(',');
                    stackIn_9_1 = stackIn_10_1;
                    if (param1 == null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_11_2 = "{...}";
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(ug param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_c) {
                param0.c(-19822);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_d = this.field_f.field_d;
            param0.field_c = this.field_f;
            param0.field_c.field_d = param0;
            param0.field_d.field_c = param0;
            if (param1 == 13) {
              break L0;
            } else {
              this.a((byte) -120);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("pj.H(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final ug c(byte param0) {
        ug var2;
        var2 = this.field_f.field_c;
        if (var2 != this.field_f) {
          var2.c(-19822);
          if (param0 != -66) {
            field_h = -1.0866156816482544f;
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final ug d(int param0) {
        ug var2;
        if (param0 == 4011) {
          var2 = this.field_f.field_d;
          if (var2 == this.field_f) {
            return null;
          } else {
            var2.c(param0 + -23833);
            return var2;
          }
        } else {
          field_c = (ta) null;
          var2 = this.field_f.field_d;
          if (var2 == this.field_f) {
            return null;
          } else {
            var2.c(param0 + -23833);
            return var2;
          }
        }
    }

    final static vk a(byte param0, byte[] param1) {
        vk var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        vk stackIn_5_0 = null;
        vk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              if (param0 > 9) {
                var2 = new vk(param1, qc.field_P, mb.field_b, da.field_c, ra.field_ab, cb.field_b);
                gb.a(-63);
                stackIn_7_0 = (vk) (var2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (vk) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("pj.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vk) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 < 37) {
          field_h = 1.3061877489089966f;
          field_c = null;
          field_b = null;
          field_a = null;
          field_g = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_a = null;
          field_g = null;
          return;
        }
    }

    final int b(int param0) {
        int var2;
        ug var3;
        int var4;
        int var5;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0;
        var3 = this.field_f.field_d;
        L0: while (true) {
          L1: {
            if (this.field_f == var3) {
              break L1;
            } else {
              var3 = var3.field_d;
              var2++;
              if (var5 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 61 / ((param0 - 78) / 46);
          return var2;
        }
    }

    final ug a(boolean param0) {
        ug var2;
        var2 = this.field_e;
        if (this.field_f != var2) {
          this.field_e = var2.field_c;
          if (!param0) {
            field_h = -0.11541689187288284f;
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_e = null;
          return null;
        }
    }

    final ug d(byte param0) {
        ug var2;
        var2 = this.field_e;
        if (this.field_f == var2) {
          this.field_e = null;
          return null;
        } else {
          if (param0 != 63) {
            return (ug) null;
          } else {
            this.field_e = var2.field_d;
            return var2;
          }
        }
    }

    final ug c(int param0) {
        ug var2;
        var2 = this.field_f.field_c;
        if (var2 != this.field_f) {
          if (param0 != -1) {
            return (ug) null;
          } else {
            this.field_e = var2.field_c;
            return var2;
          }
        } else {
          this.field_e = null;
          return null;
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 11253) {
          L0: {
            this.field_f = (ug) null;
            if (this.field_f != this.field_f.field_d) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_f != this.field_f.field_d) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final ug a(byte param0) {
        ug var2 = null;
        if (param0 != -117) {
            pj.a(false, 11);
            var2 = this.field_f.field_d;
            if (!(this.field_f != var2)) {
                this.field_e = null;
                return null;
            }
            this.field_e = var2.field_d;
            return var2;
        }
        var2 = this.field_f.field_d;
        if (!(this.field_f != var2)) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_d;
        return var2;
    }

    private final void a(int param0, pj param1, ug param2) {
        ug var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -16293) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            var4 = this.field_f.field_c;
            this.field_f.field_c = param2.field_c;
            param2.field_c.field_d = this.field_f;
            if (param2 != this.field_f) {
              param2.field_c = param1.field_f.field_c;
              param2.field_c.field_d = param2;
              param1.field_f.field_c = var4;
              var4.field_d = param1.field_f;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4_ref);

            stackIn_8_1 = new StringBuilder().append("pj.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    final void a(pj param0, int param1) {
        if (param1 != 0) {
            return;
        }
        try {
            this.a(-16293, param0, this.field_f.field_d);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "pj.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String b(boolean param0) {
        if (!param0) {
            field_d = (String) null;
            return hf.field_b;
        }
        return hf.field_b;
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = mk.a(sd.a(37, param1), 480);
              if (param0 >= 78) {
                break L1;
              } else {
                var3 = (byte[]) null;
                pj.a((byte) -73, (byte[]) null);
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("pj.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(boolean param0, int param1) {
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        boolean stackIn_20_0 = false;
        int stackIn_33_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_19_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vl var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 31645) {
                            statePc = 3;
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
                        field_b = (kc) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        jk.field_B = jk.field_B + 1;
                        if (kc.field_d != 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2_int = -116 + qg.field_c;
                        var3 = ab.field_e + -90;
                        var4 = ee.field_F;
                        var5 = 0;
                        if (!param0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_8_0 = fg.field_b;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = kg.field_c;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = stackIn_8_0;
                        var7 = 0;
                        if (!param0) {
                            statePc = 16;
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
                        var8 = 9;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var8 ^ -1) > -1) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_17_0 = 0;
                        stackIn_12_0 = stackIn_17_0;
                        stackIn_17_1 = var6 & 1 << var8;
                        stackIn_12_1 = stackIn_17_1;
                        if (var10 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 == stackIn_12_1) {
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 += 20;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8--;
                        if (var10 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = var7;
                        stackIn_17_1 = 10;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = stackIn_17_0 + stackIn_17_1;
                        var9 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-11 >= (var9 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = param0;
                        stackIn_33_0 = stackOut_19_0 ? 1 : 0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var10 != 0) {
                            statePc = 33;
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
                        if (!stackIn_20_0) {
                            statePc = 23;
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
                        if ((1 << var9 & var6) == 0) {
                            statePc = 25;
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (lf.a(-19864, var2_int, var3, 40, 40, var8, 10)) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
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
                        if (!param0) {
                            statePc = 28;
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
                        if ((var6 & 1 << var9) != 0) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var8 += 40;
                        if (var10 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ee.field_F = var9;
                        var5 = 1;
                        if (var10 == 0) {
                            statePc = 32;
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
                        var9++;
                        if (var10 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = var5;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 == 0) {
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
                        if (ee.field_F != var4) {
                            statePc = 36;
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
                        jk.field_B = 0;
                        ee.field_F = -1;
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
                        if ((uk.field_r ^ -1) <= -1) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (fj.field_E == null) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (!fj.field_E.field_j) {
                            statePc = 40;
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
                        uk.field_r = fj.field_E.field_e;
                        fg.field_b = fg.field_b & (uk.field_r ^ -1);
                        fj.field_E = null;
                        k.field_i = true;
                        kg.field_c = kg.field_c | uk.field_r;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (!ok.a(false)) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        return;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var11 = (vl) ((Object) em.field_C.d(4011));
                        if (var11 == null) {
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
                        mh.a(var11, param1 + -31645, 4);
                        if (var10 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var10 == 0) {
                            statePc = 42;
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
                        return;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var2), "pj.T(" + param0 + ',' + param1 + ')');
                }
                case 48: {
                    return;
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, ug param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != param1.field_c) {
                param1.c(-19822);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_c = this.field_f.field_c;
            param1.field_d = this.field_f;
            param1.field_c.field_d = param1;
            param1.field_d.field_c = param1;
            if (param0 == -8212) {
              break L0;
            } else {
              field_b = (kc) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("pj.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public pj() {
        this.field_f = new ug();
        this.field_f.field_c = this.field_f;
        this.field_f.field_d = this.field_f;
    }

    static {
        field_b = null;
        field_d = "You have <%0> unread messages!";
    }
}
