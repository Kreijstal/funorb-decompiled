/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends pg {
    static ri field_i;
    static int field_m;
    static String field_s;
    int field_p;
    int field_o;
    int field_r;
    int field_g;
    int field_k;
    int field_h;
    static String field_q;
    int[] field_j;
    static String field_l;
    static vn field_n;

    final static void a(int[] param0, int param1, int param2, int param3, int[] param4, int[] param5, int param6, int param7, byte param8, int[] param9, int param10, int param11, int[] param12, int param13, int[] param14, int param15) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_53_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var16 = null;
        int var17 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param6 = -param3;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param6 >= 0) {
                            statePc = 52;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_53_0 = -param13;
                        stackIn_4_0 = stackIn_53_0;
                        if (var17 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param7 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param7 >= 0) {
                            statePc = 50;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        incrementValue$0 = param1;
                        param1++;
                        param15 = param4[incrementValue$0];
                        stackIn_51_0 = 0;
                        stackIn_7_0 = stackIn_51_0;
                        stackIn_51_1 = param15;
                        stackIn_7_1 = stackIn_51_1;
                        if (var17 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 == stackIn_7_1) {
                            statePc = 47;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((param15 ^ -1) != (param15 & 16711680 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        param15 = 255 & param15 >> -1243729616;
                        incrementValue$1 = param11;
                        param11++;
                        param14[incrementValue$1] = dg.a(param9[1] * param15, 65280) + (dg.a(param15 * param9[0] << 1234032296, 16711703) - -(dg.a(param9[2] * param15, 65466) >> -985223896));
                        if ((param14[param11 - 1] ^ -1) != -1) {
                            statePc = 49;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        param14[-1 + param11] = 65792;
                        if (var17 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((65280 & param15) != param15) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        param15 = param15 >> 131368072 & 255;
                        incrementValue$2 = param11;
                        param11++;
                        param14[incrementValue$2] = dg.a(param15 * param5[1], 65280) + ((dg.a(param5[0] * param15, 1812004608) << 233744712) + dg.a(255, param5[2] * param15 >> -607027576));
                        if (0 == param14[-1 + param11]) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        param14[-1 + param11] = 65792;
                        if (var17 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((param15 ^ -1) == (255 & param15 ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((255 & param15) != (255 & param15 >> 777666824)) {
                            statePc = 40;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((param15 >> 1629639376 ^ -1) != (param15 & 255 ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        param15 = param15 & 255;
                        if (127 <= param15) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        param15 = param15 * 2;
                        incrementValue$3 = param11;
                        param11++;
                        param14[incrementValue$3] = (dg.a(param12[2] * param15, 65330) >> 1998949576) + dg.a(param15 * param12[1], 65280) + (dg.a(param12[0] * param15, -1107230976) << -1665686104);
                        if (var17 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param15 = 2 * (param15 - 127);
                        incrementValue$4 = param11;
                        param11++;
                        param14[incrementValue$4] = dg.a((-param12[1] + 255) * param15 + 255 * param12[1], 65280) + ((dg.a(1275133696, 255 * param12[0] - -((255 - param12[0]) * param15)) << 1663882152) + dg.a(param15 * (255 + -param12[2]) + 255 * param12[2] >> -1045158104, 255));
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (0 == param14[-1 + param11]) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        param14[-1 + param11] = 65792;
                        if (var17 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        incrementValue$5 = param11;
                        param11++;
                        param14[incrementValue$5] = param15;
                        if (var17 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        param15 = param15 & 255;
                        incrementValue$6 = param11;
                        param11++;
                        param14[incrementValue$6] = dg.a(param15 * param0[2] >> -1837035992, 255) + dg.a(param15 * param0[1], 65280) + dg.a(16711759, param0[0] * param15 << 414493608);
                        if (-1 != (param14[-1 + param11] ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        param14[param11 + -1] = 65792;
                        if (var17 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        param11++;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        param7++;
                        if (var17 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        param1 = param1 + param10;
                        stackIn_51_0 = param11;
                        stackIn_51_1 = param2;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        param11 = stackIn_51_0 + stackIn_51_1;
                        param6++;
                        if (var17 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = param8;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 == -99) {
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
                        field_s = (String) null;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    var16 = (RuntimeException) ((Object) caughtException);
                    stackIn_60_0 = (RuntimeException) (var16);
                    stackIn_58_0 = stackIn_60_0;
                    stackIn_60_1 = new StringBuilder().append("uh.A(");
                    stackIn_58_1 = stackIn_60_1;
                    if (param0 == null) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_61_0 = (RuntimeException) ((Object) stackIn_58_0);
                    stackIn_61_1 = (StringBuilder) ((Object) stackIn_58_1);
                    stackIn_61_2 = "{...}";
                    statePc = 61;
                    continue stateLoop;
                }
                case 60: {
                    stackIn_61_0 = (RuntimeException) ((Object) stackIn_60_0);
                    stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
                    stackIn_61_2 = "null";
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    stackIn_64_0 = (RuntimeException) ((Object) stackIn_61_0);
                    stackIn_62_0 = stackIn_64_0;
                    stackIn_64_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_62_1 = stackIn_64_1;
                    if (param4 == null) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackIn_65_0 = (RuntimeException) ((Object) stackIn_62_0);
                    stackIn_65_1 = (StringBuilder) ((Object) stackIn_62_1);
                    stackIn_65_2 = "{...}";
                    statePc = 65;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
                    stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
                    stackIn_65_2 = "null";
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    stackIn_68_0 = (RuntimeException) ((Object) stackIn_65_0);
                    stackIn_66_0 = stackIn_68_0;
                    stackIn_68_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',');
                    stackIn_66_1 = stackIn_68_1;
                    if (param5 == null) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_69_0 = (RuntimeException) ((Object) stackIn_66_0);
                    stackIn_69_1 = (StringBuilder) ((Object) stackIn_66_1);
                    stackIn_69_2 = "{...}";
                    statePc = 69;
                    continue stateLoop;
                }
                case 68: {
                    stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_69_2 = "null";
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_70_0 = stackIn_72_0;
                    stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
                    stackIn_70_1 = stackIn_72_1;
                    if (param9 == null) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_73_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_73_2 = "{...}";
                    statePc = 73;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_73_2 = "null";
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_76_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_74_0 = stackIn_76_0;
                    stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param10).append(',').append(param11).append(',');
                    stackIn_74_1 = stackIn_76_1;
                    if (param12 == null) {
                        statePc = 76;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_77_2 = "{...}";
                    statePc = 77;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_77_2 = "null";
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_0 = stackIn_80_0;
                    stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param13).append(',');
                    stackIn_78_1 = stackIn_80_1;
                    if (param14 == null) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_81_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_81_2 = "{...}";
                    statePc = 81;
                    continue stateLoop;
                }
                case 80: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
                    stackIn_81_2 = "null";
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    throw aa.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param15 + ')');
                }
                case 82: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(qb param0, int param1) {
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        var3 = 0;
                        var4 = Math.min(param0.field_y, de.field_j / param1);
                        var5 = Math.min(param0.field_q, de.field_e / 2);
                        var6 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var4 ^ -1) >= (var6 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7 = var2_int;
                        var8 = var3;
                        if (var10 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var5 ^ -1) >= (var9 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        dupTemp$2 = param0.field_A[var8];
                        de.field_l[de.field_e + var7] = dupTemp$2;
                        de.field_l[var7] = dupTemp$2;
                        var7++;
                        dupTemp$3 = param0.field_A[var8];
                        de.field_l[de.field_e + var7] = dupTemp$3;
                        de.field_l[var7] = dupTemp$3;
                        var7++;
                        var8++;
                        var9++;
                        if (var10 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var10 == 0) {
                            statePc = 5;
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
                case 10: {
                    try {
                        var3 = var3 + param0.field_n;
                        var2_int = var2_int + de.field_e * 2;
                        var6++;
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
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (runtimeException);
                    stackIn_14_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("uh.D(");
                    stackIn_14_1 = stackIn_16_1;
                    if (param0 == null) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_17_2 = "{...}";
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_17_2 = "null";
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(char param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -120) {
                break L1;
              } else {
                uh.a((int[]) null, 98, -65, 94, (int[]) null, (int[]) null, -75, 116, (byte) -14, (int[]) null, -110, 9, (int[]) null, -39, (int[]) null, -48);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if ((param0 ^ -1) > -66) {
                    break L4;
                  } else {
                    if (90 >= param0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if ((param0 ^ -1) > -98) {
                    break L5;
                  } else {
                    if ((param0 ^ -1) < -123) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_16_0 = 0;
                break L2;
              }
              stackIn_16_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "uh.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0 != 0;
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_s = null;
              field_q = null;
              if (param0 < -44) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            field_l = null;
            field_i = null;
            field_n = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "uh.E(" + param0 + ')');
        }
    }

    final void a(int param0, int[] param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          L0: {
            L1: {
              this.field_o = param6;
              this.field_r = param4;
              this.field_p = param5;
              this.field_k = param7;
              this.field_h = param3;
              this.field_g = param0;
              if (param2 == 27) {
                break L1;
              } else {
                field_s = (String) null;
                break L1;
              }
            }
            this.field_j = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var9);

            stackIn_8_1 = new StringBuilder().append("uh.C(").append(param0).append(',');

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
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        try {
            if (pn.a((byte) -120)) {
                param0 = false;
            }
            ig.a(0, param0);
            int var2_int = 32 % ((param1 - 18) / 50);
            cj.a(-127);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "uh.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              vi.field_F = param1;
              ee.a(12, (byte) 30);
              if (param0 > 125) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("uh.B(").append(param0).append(',');

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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    uh() {
    }

    static {
        field_s = "Cancel draw";
        field_q = "Increases the power of your flame spells by up to 50%";
        field_l = "Make your way to the islands of Mos Le'Harmless to get your hands on some 'rum', but watch out for the monkeys - they might just rain on your parade.";
        field_i = new ri();
        field_n = new vn();
    }
}
