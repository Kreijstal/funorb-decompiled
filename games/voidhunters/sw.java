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
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_135_0 = 0;
        int[] stackIn_135_1 = null;
        int stackIn_137_0 = 0;
        int[] stackIn_137_1 = null;
        int stackIn_138_0 = 0;
        int[] stackIn_138_1 = null;
        int stackIn_138_2 = 0;
        int stackIn_146_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_164_0 = 0;
        RuntimeException stackIn_166_0 = null;
        StringBuilder stackIn_166_1 = null;
        RuntimeException stackIn_168_0 = null;
        StringBuilder stackIn_168_1 = null;
        RuntimeException stackIn_169_0 = null;
        StringBuilder stackIn_169_1 = null;
        String stackIn_169_2 = null;
        RuntimeException stackIn_170_0 = null;
        StringBuilder stackIn_170_1 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        RuntimeException stackIn_173_0 = null;
        StringBuilder stackIn_173_1 = null;
        String stackIn_173_2 = null;
        RuntimeException stackIn_174_0 = null;
        StringBuilder stackIn_174_1 = null;
        RuntimeException stackIn_176_0 = null;
        StringBuilder stackIn_176_1 = null;
        RuntimeException stackIn_177_0 = null;
        StringBuilder stackIn_177_1 = null;
        String stackIn_177_2 = null;
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        RuntimeException stackIn_180_0 = null;
        StringBuilder stackIn_180_1 = null;
        RuntimeException stackIn_181_0 = null;
        StringBuilder stackIn_181_1 = null;
        String stackIn_181_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        int var20_int = 0;
        Exception var20 = null;
        int var21 = 0;
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
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 165;
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
                        if (param4 == 4) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.a(-30, 'ﾮ', -56);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var13 = 0;
                        var14 = param0.length();
                        var15 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var14 ^ -1) >= (var15 ^ -1)) {
                            statePc = 159;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var16 = 255 & aea.a(-122, param0.charAt(var15));
                        var17 = 0;
                        stackIn_160_0 = var16 ^ -1;
                        stackIn_10_0 = stackIn_160_0;
                        stackIn_160_1 = -61;
                        stackIn_10_1 = stackIn_160_1;
                        if (var21 != 0) {
                            statePc = 160;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == stackIn_10_1) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var11 = var15;
                        if (var21 == 0) {
                            statePc = 158;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (-1 != var11) {
                            statePc = 24;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var17 = var17 + this.a(var16, (byte) 104);
                        var18 = var15;
                        if (null == this.field_g) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var12 ^ -1) == 0) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var17 = var17 + this.field_g[var12][var16];
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var12 = var16;
                        if (var21 == 0) {
                            statePc = 128;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (62 != var16) {
                            statePc = 158;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var18 = var11;
                        var19 = param0.substring(1 + var11, var15);
                        var11 = -1;
                        if (!var19.equals("br")) {
                            statePc = 36;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        param3[var13] = param0.substring(var7, var15 + 1);
                        var13++;
                        if ((var13 ^ -1) <= (param3.length ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return stackIn_34_0;
                }
                case 35: {
                    try {
                        var7 = var15 - -1;
                        var12 = -1;
                        var8 = -1;
                        var6_int = 0;
                        if (var21 == 0) {
                            statePc = 158;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (!var19.equals("lt")) {
                            statePc = 45;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var17 = var17 + this.a(60, (byte) 37);
                        if (null == this.field_g) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var12 ^ -1) == 0) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var17 = var17 + this.field_g[var12][60];
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var12 = 60;
                        if (var21 == 0) {
                            statePc = 127;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var19.equals("gt")) {
                            statePc = 121;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (!var19.equals("nbsp")) {
                            statePc = 59;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var17 = var17 + this.a(160, (byte) 52);
                        if (this.field_g == null) {
                            statePc = 58;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (-1 != var12) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var17 = var17 + this.field_g[var12][160];
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var12 = 160;
                        if (var21 == 0) {
                            statePc = 127;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (!var19.equals("shy")) {
                            statePc = 70;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var17 = var17 + this.a(173, (byte) 100);
                        if (this.field_g == null) {
                            statePc = 69;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if ((var12 ^ -1) != 0) {
                            statePc = 68;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var17 = var17 + this.field_g[var12][173];
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var12 = 173;
                        if (var21 == 0) {
                            statePc = 127;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (!var19.equals("times")) {
                            statePc = 81;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var17 = var17 + this.a(215, (byte) 117);
                        if (this.field_g == null) {
                            statePc = 80;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (-1 != var12) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var17 = var17 + this.field_g[var12][215];
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var12 = 215;
                        if (var21 == 0) {
                            statePc = 127;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (!var19.equals("euro")) {
                            statePc = 92;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var17 = var17 + this.a(8364, (byte) 32);
                        if (this.field_g == null) {
                            statePc = 91;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (-1 != var12) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var17 = var17 + this.field_g[var12][8364];
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var12 = 8364;
                        if (var21 == 0) {
                            statePc = 127;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (!var19.equals("copy")) {
                            statePc = 101;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var17 = var17 + this.a(169, (byte) 92);
                        if (null == this.field_g) {
                            statePc = 100;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (var12 == -1) {
                            statePc = 100;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var17 = var17 + this.field_g[var12][169];
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var12 = 169;
                        if (var21 == 0) {
                            statePc = 127;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (var19.equals("reg")) {
                            statePc = 115;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (!var19.startsWith("img=")) {
                            statePc = 127;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (null != param1) {
                            statePc = 112;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var20_int = lob.a(123, (CharSequence) ((Object) var19.substring(4)));
                        var17 = var17 + param1[var20_int].c();
                        var12 = -1;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = ((Object) stateCaught_112 instanceof Exception ? 114 : 165);
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var20 = (Exception) ((Object) caughtException);
                        if (var21 == 0) {
                            statePc = 127;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var17 = var17 + this.a(174, (byte) 56);
                        if (this.field_g == null) {
                            statePc = 120;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if ((var12 ^ -1) == 0) {
                            statePc = 120;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var17 = var17 + this.field_g[var12][174];
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var12 = 174;
                        if (var21 == 0) {
                            statePc = 127;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var17 = var17 + this.a(62, (byte) 76);
                        if (this.field_g == null) {
                            statePc = 126;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (var12 == -1) {
                            statePc = 126;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var17 = var17 + this.field_g[var12][62];
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var12 = 62;
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var16 = -1;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (var17 <= 0) {
                            statePc = 158;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var6_int = var6_int + var17;
                        if (null == param2) {
                            statePc = 158;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (var16 != 32) {
                            statePc = 134;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var8 = var15;
                        var10 = 1;
                        var9 = var6_int;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        stackIn_137_0 = var6_int ^ -1;
                        stackIn_135_0 = stackIn_137_0;
                        stackIn_137_1 = (int[]) (param2);
                        stackIn_135_1 = stackIn_137_1;
                        if (param2.length <= var13) {
                            statePc = 137;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        stackIn_138_0 = stackIn_135_0;
                        stackIn_138_1 = (int[]) ((Object) stackIn_135_1);
                        stackIn_138_2 = var13;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        stackIn_138_0 = stackIn_137_0;
                        stackIn_138_1 = (int[]) ((Object) stackIn_137_1);
                        stackIn_138_2 = -1 + param2.length;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (stackIn_138_0 < (stackIn_138_1[stackIn_138_2] ^ -1)) {
                            statePc = 141;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (0 > var8) {
                            statePc = 148;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        param3[var13] = param0.substring(var7, -var10 + (var8 - -1));
                        var13++;
                        if ((param3.length ^ -1) < (var13 ^ -1)) {
                            statePc = 147;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        stackIn_146_0 = 0;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 146: {
                    return stackIn_146_0;
                }
                case 147: {
                    try {
                        var7 = 1 + var8;
                        var8 = -1;
                        var12 = -1;
                        var6_int = var6_int - var9;
                        if (var21 == 0) {
                            statePc = 156;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        param3[var13] = param0.substring(var7, var18);
                        var13++;
                        if ((param3.length ^ -1) >= (var13 ^ -1)) {
                            statePc = 153;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        stackIn_154_0 = 0;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 154: {
                    return stackIn_154_0;
                }
                case 155: {
                    try {
                        var7 = var18;
                        var8 = -1;
                        var6_int = var17;
                        var12 = -1;
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        if (var16 != 45) {
                            statePc = 158;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        var8 = var15;
                        var10 = 0;
                        var9 = var6_int;
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        var15++;
                        if (var21 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        stackIn_160_0 = var7 ^ -1;
                        stackIn_160_1 = param0.length() ^ -1;
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if (stackIn_160_0 > stackIn_160_1) {
                            statePc = 162;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        param3[var13] = param0.substring(var7, param0.length());
                        var13++;
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
                        stackIn_164_0 = var13;
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 164: {
                    return stackIn_164_0;
                }
                case 165: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_168_0 = (RuntimeException) (var6);
                    stackIn_166_0 = stackIn_168_0;
                    stackIn_168_1 = new StringBuilder().append("sw.D(");
                    stackIn_166_1 = stackIn_168_1;
                    if (param0 == null) {
                        statePc = 168;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    stackIn_169_0 = (RuntimeException) ((Object) stackIn_166_0);
                    stackIn_169_1 = (StringBuilder) ((Object) stackIn_166_1);
                    stackIn_169_2 = "{...}";
                    statePc = 169;
                    continue stateLoop;
                }
                case 168: {
                    stackIn_169_0 = (RuntimeException) ((Object) stackIn_168_0);
                    stackIn_169_1 = (StringBuilder) ((Object) stackIn_168_1);
                    stackIn_169_2 = "null";
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    stackIn_172_0 = (RuntimeException) ((Object) stackIn_169_0);
                    stackIn_170_0 = stackIn_172_0;
                    stackIn_172_1 = ((StringBuilder) (Object) stackIn_169_1).append(stackIn_169_2).append(',');
                    stackIn_170_1 = stackIn_172_1;
                    if (param1 == null) {
                        statePc = 172;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    stackIn_173_0 = (RuntimeException) ((Object) stackIn_170_0);
                    stackIn_173_1 = (StringBuilder) ((Object) stackIn_170_1);
                    stackIn_173_2 = "{...}";
                    statePc = 173;
                    continue stateLoop;
                }
                case 172: {
                    stackIn_173_0 = (RuntimeException) ((Object) stackIn_172_0);
                    stackIn_173_1 = (StringBuilder) ((Object) stackIn_172_1);
                    stackIn_173_2 = "null";
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    stackIn_176_0 = (RuntimeException) ((Object) stackIn_173_0);
                    stackIn_174_0 = stackIn_176_0;
                    stackIn_176_1 = ((StringBuilder) (Object) stackIn_173_1).append(stackIn_173_2).append(',');
                    stackIn_174_1 = stackIn_176_1;
                    if (param2 == null) {
                        statePc = 176;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    stackIn_177_0 = (RuntimeException) ((Object) stackIn_174_0);
                    stackIn_177_1 = (StringBuilder) ((Object) stackIn_174_1);
                    stackIn_177_2 = "{...}";
                    statePc = 177;
                    continue stateLoop;
                }
                case 176: {
                    stackIn_177_0 = (RuntimeException) ((Object) stackIn_176_0);
                    stackIn_177_1 = (StringBuilder) ((Object) stackIn_176_1);
                    stackIn_177_2 = "null";
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    stackIn_180_0 = (RuntimeException) ((Object) stackIn_177_0);
                    stackIn_178_0 = stackIn_180_0;
                    stackIn_180_1 = ((StringBuilder) (Object) stackIn_177_1).append(stackIn_177_2).append(',');
                    stackIn_178_1 = stackIn_180_1;
                    if (param3 == null) {
                        statePc = 180;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    stackIn_181_0 = (RuntimeException) ((Object) stackIn_178_0);
                    stackIn_181_1 = (StringBuilder) ((Object) stackIn_178_1);
                    stackIn_181_2 = "{...}";
                    statePc = 181;
                    continue stateLoop;
                }
                case 180: {
                    stackIn_181_0 = (RuntimeException) ((Object) stackIn_180_0);
                    stackIn_181_1 = (StringBuilder) ((Object) stackIn_180_1);
                    stackIn_181_2 = "null";
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    throw rta.a((Throwable) ((Object) stackIn_181_0), stackIn_181_2 + ',' + param4 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String a(String param0, int param1, int param2, aja[] param3) {
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_57_0 = null;
        String stackIn_80_0 = null;
        String stackIn_84_0 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14_int = 0;
        Exception var14 = null;
        int var15 = 0;
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
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (String) (param0);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 85;
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
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var9 <= var11) {
                            statePc = 83;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_84_0 = (String) (param0);
                        stackIn_9_0 = stackIn_84_0;
                        if (var15 != 0) {
                            statePc = 84;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var12 = ((String) (Object) stackIn_9_0).charAt(var11);
                        if ((var12 ^ -1) != -61) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = var11;
                        if (var15 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (62 != var12) {
                            statePc = 66;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (0 != (var6 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var13_ref_String = param0.substring(var6 + 1, var11);
                        var6 = -1;
                        if (var13_ref_String.equals("lt")) {
                            statePc = 65;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (!var13_ref_String.equals("gt")) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var12 = 62;
                        if (var15 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var13_ref_String.equals("nbsp")) {
                            statePc = 64;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (!var13_ref_String.equals("shy")) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var12 = 173;
                        if (var15 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (!var13_ref_String.equals("times")) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var12 = 215;
                        if (var15 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var13_ref_String.equals("euro")) {
                            statePc = 63;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var13_ref_String.equals("copy")) {
                            statePc = 62;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var13_ref_String.equals("reg")) {
                            statePc = 61;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (!var13_ref_String.startsWith("img=")) {
                            statePc = 82;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (param3 != null) {
                            statePc = 53;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var15 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var14_int = lob.a(78, (CharSequence) ((Object) var13_ref_String.substring(4)));
                        var8 = var8 + param3[var14_int].c();
                        var7 = -1;
                        if ((var8 ^ -1) < (param1 ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = ((Object) stateCaught_53 instanceof Exception ? 60 : 85);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = ((Object) stateCaught_54 instanceof Exception ? 60 : 85);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_57_0 = var10 + "...";
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = ((Object) stateCaught_56 instanceof Exception ? 60 : 85);
                        continue stateLoop;
                    }
                }
                case 57: {
                    return stackIn_57_0;
                }
                case 58: {
                    try {
                        var10 = param0.substring(0, var11 - -1);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = ((Object) stateCaught_58 instanceof Exception ? 60 : 85);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var14 = (Exception) ((Object) caughtException);
                        if (var15 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var12 = 174;
                        if (var15 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var12 = 169;
                        if (var15 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var12 = 8364;
                        if (var15 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var12 = 160;
                        if (var15 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var12 = 60;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((var6 ^ -1) != 0) {
                            statePc = 82;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var8 = var8 + (255 & this.field_b[255 & aea.a(-122, (char) var12)]);
                        if (this.field_g == null) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var7 == -1) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var8 = var8 + this.field_g[var7][var12];
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var7 = var12;
                        var13 = var8;
                        if (null != this.field_g) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var13 = var13 + this.field_g[var12][46];
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if ((var13 ^ -1) < (param1 ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_80_0 = var10 + "...";
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 80: {
                    return stackIn_80_0;
                }
                case 81: {
                    try {
                        var10 = param0.substring(0, var11 + 1);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var11++;
                        if (var15 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackIn_84_0 = (String) (param0);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 84: {
                    return stackIn_84_0;
                }
                case 85: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_88_0 = (RuntimeException) (var5);
                    stackIn_86_0 = stackIn_88_0;
                    stackIn_88_1 = new StringBuilder().append("sw.G(");
                    stackIn_86_1 = stackIn_88_1;
                    if (param0 == null) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    stackIn_89_0 = (RuntimeException) ((Object) stackIn_86_0);
                    stackIn_89_1 = (StringBuilder) ((Object) stackIn_86_1);
                    stackIn_89_2 = "{...}";
                    statePc = 89;
                    continue stateLoop;
                }
                case 88: {
                    stackIn_89_0 = (RuntimeException) ((Object) stackIn_88_0);
                    stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
                    stackIn_89_2 = "null";
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    stackIn_92_0 = (RuntimeException) ((Object) stackIn_89_0);
                    stackIn_90_0 = stackIn_92_0;
                    stackIn_92_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_89_2).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_90_1 = stackIn_92_1;
                    if (param3 == null) {
                        statePc = 92;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    stackIn_93_0 = (RuntimeException) ((Object) stackIn_90_0);
                    stackIn_93_1 = (StringBuilder) ((Object) stackIn_90_1);
                    stackIn_93_2 = "{...}";
                    statePc = 93;
                    continue stateLoop;
                }
                case 92: {
                    stackIn_93_0 = (RuntimeException) ((Object) stackIn_92_0);
                    stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
                    stackIn_93_2 = "null";
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    throw rta.a((Throwable) ((Object) stackIn_93_0), stackIn_93_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(String param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                field_f = true;
                break L1;
              }
            }
            stackIn_4_0 = this.a(62, param0, (aja[]) null);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("sw.B(");

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
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
                        statePc = 21;
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
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1 <= (var7 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var25 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var13 ^ -1) > -1) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-1 >= (var13 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var14 = var14 + var19;
                        var13 = var13 + var17;
                        var6_int++;
                        var19 = var19 + var16;
                        var17 = var17 + var16;
                        if (var25 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var25 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-1 >= (var14 ^ -1)) {
                            statePc = 18;
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
                        var14 = var14 + var19;
                        var13 = var13 + var17;
                        var19 = var19 + var16;
                        var17 = var17 + var16;
                        var6_int++;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var13 = var13 + -var20;
                        var14 = var14 + -var18;
                        var20 = var20 - var15;
                        var18 = var18 - var15;
                        var7--;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
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
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    throw rta.a((Throwable) ((Object) var6), "sw.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 22: {
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
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var5_int = this.a(param1, param3, new int[]{param0}, to.field_p, 4);
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var7 ^ -1) <= (var5_int ^ -1)) {
                    break L3;
                  } else {
                    var8 = this.a(62, to.field_p[var7], param3);
                    stackIn_10_0 = var8 ^ -1;

                    stackIn_10_1 = var6 ^ -1;

                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_10_0 >= stackIn_10_1) {
                          break L4;
                        } else {
                          var6 = var8;
                          break L4;
                        }
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_10_0 = param2 ? 1 : 0;
                stackIn_10_1 = 1;
                break L2;
              }
              L5: {
                if (stackIn_10_0 == stackIn_10_1) {
                  break L5;
                } else {
                  this.a(-9, (byte) -117);
                  break L5;
                }
              }
              stackIn_14_0 = var6;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("sw.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_23_2 + ')');
        }
        return stackIn_14_0;
    }

    final int a(String param0, int param1, int param2, byte param3, aja[] param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) != -1) {
                break L1;
              } else {
                param1 = this.field_a;
                break L1;
              }
            }
            L2: {
              var6_int = this.a(param0, param4, new int[]{param2}, to.field_p, 4);
              if (param3 > 83) {
                break L2;
              } else {
                this.a((String) null, 127, 112, (byte) -23, (aja[]) null);
                break L2;
              }
            }
            var7 = (var6_int - 1) * param1;
            stackIn_6_0 = this.field_e + (this.field_c - -var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("sw.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_15_2 + ')');
        }
        return stackIn_6_0;
    }

    final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 21) {
                break L1;
              } else {
                this.a(-79, 'ﾁ', 63);
                break L1;
              }
            }
            stackIn_4_0 = this.field_b[param0] & 255;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "sw.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    sw(byte[] param0) {
        byte[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_8_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        ds var2 = null;
        RuntimeException var2_ref = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new ds(param0);
                        var3 = var2.e((byte) -102);
                        if (0 == var3) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var2.e((byte) -89) ^ -1) != -2) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_8_0 = 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = stackIn_8_0;
                        this.field_b = new byte[256];
                        var2.a(0, this.field_b, (byte) -59, 256);
                        if (var4 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = new int[256];
                        var6 = new int[256];
                        var7_int = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-257 >= (var7_int ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5[var7_int] = var2.e((byte) -124);
                        var7_int++;
                        if (var12 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var12 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7_int = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7_int >= 256) {
                            statePc = 23;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var6[var7_int] = var2.e((byte) -92);
                        var7_int++;
                        if (var12 != 0) {
                            statePc = 82;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var12 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7 = new byte[256][];
                        var8_int = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (256 <= var8_int) {
                            statePc = 34;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        array$0 = new byte[var5[var8_int]];
                        var7[var8_int] = array$0;
                        var9 = 0;
                        stackIn_35_0 = 0;
                        stackIn_26_0 = stackIn_35_0;
                        if (var12 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var10 = stackIn_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var7[var8_int].length <= var10) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 = (byte)(var9 + var2.d((byte) -114));
                        var7[var8_int][var10] = (byte) var9;
                        var10++;
                        if (var12 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var12 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var8_int++;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var12 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = 256;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var8 = new byte[stackIn_35_0][];
                        var9 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (-257 >= (var9 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        array$1 = new byte[var5[var9]];
                        var8[var9] = array$1;
                        var10 = 0;
                        stackIn_47_0 = 0;
                        stackIn_38_0 = stackIn_47_0;
                        if (var12 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var11 = stackIn_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var8[var9].length <= var11) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var10 = (byte)(var10 + var2.d((byte) -114));
                        var8[var9][var11] = (byte) var10;
                        var11++;
                        if (var12 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var12 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var9++;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var12 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        this.field_g = new byte[256][256];
                        stackIn_47_0 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var9 = stackIn_47_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = -257;
                        stackIn_49_1 = var9 ^ -1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 >= stackIn_49_1) {
                            statePc = 71;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_75_0 = var9;
                        stackIn_51_0 = stackIn_75_0;
                        if (var12 != 0) {
                            statePc = 75;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 == 32) {
                            statePc = 70;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (-161 == (var9 ^ -1)) {
                            statePc = 70;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var10 = 0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((var10 ^ -1) <= -257) {
                            statePc = 70;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_49_0 = 32;
                        stackIn_60_0 = stackIn_49_0;
                        stackIn_49_1 = var10;
                        stackIn_60_1 = stackIn_49_1;
                        if (var12 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 == stackIn_60_1) {
                            statePc = 69;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (-161 != (var10 ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var12 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        this.field_g[var9][var10] = (byte)om.a(this.field_b, var10, var9, var7, false, var8, var5, var6);
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var10++;
                        if (var12 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var9++;
                        if (var12 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        this.field_a = var6[32] - -var5[32];
                        if (var12 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        this.field_a = var2.e((byte) -104);
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        this.field_d = var2.e((byte) -91);
                        stackIn_75_0 = var2.e((byte) -88);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        this.field_c = var2.e((byte) -87);
                        this.field_e = var2.e((byte) -126);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 77: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_80_0 = (RuntimeException) (var2_ref);
                    stackIn_78_0 = stackIn_80_0;
                    stackIn_80_1 = new StringBuilder().append("sw.<init>(");
                    stackIn_78_1 = stackIn_80_1;
                    if (param0 == null) {
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
                    throw rta.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
                }
                case 82: {
                    return;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = -30 % ((41 - param2) / 57);
            if (this.field_g == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = this.field_g[param0][param1];
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var4), "sw.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(int param0, String param1, aja[] param2) {
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11_int = 0;
        Exception var11 = null;
        int var12 = 0;
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
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 76;
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
                        if (param0 == 62) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        sw.a((byte) -112, -45, -77, 71, 75, 122);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var8 ^ -1) <= (var7 ^ -1)) {
                            statePc = 74;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param1.charAt(var8);
                        stackIn_75_0 = var9;
                        stackIn_10_0 = stackIn_75_0;
                        if (var12 != 0) {
                            statePc = 75;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 != 60) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_int = var8;
                        if (var12 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (62 != var9) {
                            statePc = 64;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var4_int != -1) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var10 = param1.substring(1 + var4_int, var8);
                        var4_int = -1;
                        if (!var10.equals("lt")) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9 = 60;
                        if (var12 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!var10.equals("gt")) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9 = 62;
                        if (var12 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var10.equals("nbsp")) {
                            statePc = 63;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (!var10.equals("shy")) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = 173;
                        if (var12 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (!var10.equals("times")) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = 215;
                        if (var12 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (!var10.equals("euro")) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9 = 8364;
                        if (var12 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var10.equals("copy")) {
                            statePc = 62;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var10.equals("reg")) {
                            statePc = 61;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (!var10.startsWith("img=")) {
                            statePc = 73;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (param2 != null) {
                            statePc = 58;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var12 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var11_int = lob.a(10, (CharSequence) ((Object) var10.substring(4)));
                        var6 = var6 + param2[var11_int].c();
                        var5 = -1;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = ((Object) stateCaught_58 instanceof Exception ? 60 : 76);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var11 = (Exception) ((Object) caughtException);
                        if (var12 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var9 = 174;
                        if (var12 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var9 = 169;
                        if (var12 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var9 = 160;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if ((var4_int ^ -1) != 0) {
                            statePc = 73;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var6 = var6 + (255 & this.field_b[aea.a(-121, (char) var9) & 255]);
                        if (this.field_g == null) {
                            statePc = 72;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (-1 != var5) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var6 = var6 + this.field_g[var5][var9];
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var5 = var9;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_75_0 = var6;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 75: {
                    return stackIn_75_0;
                }
                case 76: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_79_0 = (RuntimeException) (var4);
                    stackIn_77_0 = stackIn_79_0;
                    stackIn_79_1 = new StringBuilder().append("sw.F(").append(param0).append(',');
                    stackIn_77_1 = stackIn_79_1;
                    if (param1 == null) {
                        statePc = 79;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_80_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_80_2 = "{...}";
                    statePc = 80;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
                    stackIn_80_2 = "null";
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    stackIn_83_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_81_0 = stackIn_83_0;
                    stackIn_83_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',');
                    stackIn_81_1 = stackIn_83_1;
                    if (param2 == null) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    stackIn_84_0 = (RuntimeException) ((Object) stackIn_81_0);
                    stackIn_84_1 = (StringBuilder) ((Object) stackIn_81_1);
                    stackIn_84_2 = "{...}";
                    statePc = 84;
                    continue stateLoop;
                }
                case 83: {
                    stackIn_84_0 = (RuntimeException) ((Object) stackIn_83_0);
                    stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
                    stackIn_84_2 = "null";
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    throw rta.a((Throwable) ((Object) stackIn_84_0), stackIn_84_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
