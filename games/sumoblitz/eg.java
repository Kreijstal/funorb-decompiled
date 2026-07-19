/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends ms {
    boolean field_o;
    static an field_l;
    int field_k;
    static String field_n;
    int[] field_m;

    public static void c(boolean param0) {
        field_n = null;
        field_l = null;
        if (param0) {
            field_n = (String) null;
        }
    }

    eg() {
        this.field_o = false;
    }

    final static void a(int param0, byte[] param1) {
        byte dupTemp$2 = 0;
        byte dupTemp$3 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        fs var16 = null;
        fs var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_75_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_47_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int stackOut_74_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var16 = new fs(param1);
                        var17 = var16;
                        var17.field_p = -2 + param1.length;
                        rl.field_n = var17.a(255);
                        vg.field_k = new int[rl.field_n];
                        we.field_B = new int[rl.field_n];
                        og.field_d = new boolean[rl.field_n];
                        ag.field_d = new byte[rl.field_n][];
                        av.field_C = new int[rl.field_n];
                        er.field_h = new int[rl.field_n];
                        fl.field_o = new byte[rl.field_n][];
                        var17.field_p = -(rl.field_n * 8) + -7 + param1.length;
                        vf.field_d = var17.a(param0);
                        li.field_u = var17.a(255);
                        var3 = 1 + (var17.e(param0 + -31557) & 255);
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 >= rl.field_n) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        er.field_h[var4] = var16.a(255);
                        var4++;
                        if (var15 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var15 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (rl.field_n <= var4) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        av.field_C[var4] = var16.a(255);
                        var4++;
                        if (var15 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var15 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (rl.field_n <= var4) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        vg.field_k[var4] = var16.a(255);
                        var4++;
                        if (var15 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var15 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var4 ^ -1) <= (rl.field_n ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        we.field_B[var4] = var16.a(jg.a(param0, 0));
                        var4++;
                        if (var15 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var15 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var17.field_p = -(8 * rl.field_n) + (-7 + param1.length + -((-1 + var3) * 3));
                        iv.field_l = new int[var3];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var4 = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var3 ^ -1) >= (var4 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        iv.field_l[var4] = var16.c((byte) 121);
                        stackOut_27_0 = iv.field_l[var4] ^ -1;
                        stackOut_27_1 = -1;
                        stackIn_34_0 = stackOut_27_0;
                        stackIn_34_1 = stackOut_27_1;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        if (var15 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 != stackIn_28_1) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        iv.field_l[var4] = 1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var4++;
                        if (var15 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var17.field_p = 0;
                        var4 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = var4;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = stackIn_33_0;
                        stackOut_33_1 = rl.field_n;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 >= stackIn_34_1) {
                            statePc = 85;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5 = vg.field_k[var4];
                        var6 = we.field_B[var4];
                        var7 = var6 * var5;
                        var20 = new byte[var7];
                        var18 = var20;
                        var8 = var18;
                        ag.field_d[var4] = var20;
                        var21 = new byte[var7];
                        var19 = var21;
                        var9 = var19;
                        fl.field_o[var4] = var21;
                        var10 = 0;
                        var11 = var17.e(param0 + -31557);
                        if (var15 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var11 & 1 ^ -1) != -1) {
                            statePc = 52;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var12 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var7 ^ -1) >= (var12 ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8[var12] = var16.d(true);
                        var12++;
                        if (var15 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var15 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (0 != (2 & var11)) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var12 = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((var7 ^ -1) >= (var12 ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        dupTemp$2 = var16.d(true);
                        var9[var12] = dupTemp$2;
                        var13 = dupTemp$2;
                        stackOut_46_0 = var10;
                        stackOut_46_1 = var13;
                        stackOut_46_2 = -1;
                        stackIn_57_0 = stackOut_46_0;
                        stackIn_57_1 = stackOut_46_1;
                        stackIn_57_2 = stackOut_46_2;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        stackIn_47_2 = stackOut_46_2;
                        if (var15 != 0) {
                            statePc = 57;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = stackIn_47_0;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_48_0 = stackOut_47_0;
                        if (stackIn_47_1 == stackIn_47_2) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = stackIn_48_0;
                        stackOut_48_1 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = stackIn_49_0;
                        stackOut_49_1 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var10 = stackIn_50_0 | stackIn_50_1;
                        var12++;
                        if (var15 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var15 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var12 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var5 <= var12) {
                            statePc = 65;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = 0;
                        stackIn_66_0 = stackOut_54_0;
                        stackIn_55_0 = stackOut_54_0;
                        if (var15 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var13 = stackIn_55_0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = var6 ^ -1;
                        stackOut_56_1 = var13;
                        stackOut_56_2 = -1;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        stackIn_57_2 = stackOut_56_2;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = stackIn_57_0;
                        stackOut_57_1 = stackIn_57_1 ^ stackIn_57_2;
                        stackIn_59_0 = stackOut_57_0;
                        stackIn_59_1 = stackOut_57_1;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = stackIn_58_0;
                        stackOut_58_1 = stackIn_58_1 ^ stackIn_58_2;
                        stackIn_59_0 = stackOut_58_0;
                        stackIn_59_1 = stackOut_58_1;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (stackIn_59_0 >= stackIn_59_1) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var8[var12 + var5 * var13] = var16.d(true);
                        var13++;
                        if (var15 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var15 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var12++;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var15 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = 2 & var11 ^ -1;
                        stackIn_66_0 = stackOut_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 != -1) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var12 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var12 >= var5) {
                            statePc = 79;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackOut_70_0 = 0;
                        stackIn_33_0 = stackOut_70_0;
                        stackIn_71_0 = stackOut_70_0;
                        if (var15 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var13 = stackIn_71_0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var6 <= var13) {
                            statePc = 78;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        dupTemp$3 = var16.d(true);
                        var9[var5 * var13 + var12] = dupTemp$3;
                        var14 = dupTemp$3;
                        stackOut_73_0 = var10;
                        stackOut_73_1 = -1;
                        stackOut_73_2 = var14;
                        stackIn_58_0 = stackOut_73_0;
                        stackIn_58_1 = stackOut_73_1;
                        stackIn_58_2 = stackOut_73_2;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        stackIn_74_2 = stackOut_73_2;
                        if (var15 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = stackIn_74_0;
                        stackIn_76_0 = stackOut_74_0;
                        stackIn_75_0 = stackOut_74_0;
                        if (stackIn_74_1 == stackIn_74_2) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = stackIn_75_0;
                        stackOut_75_1 = 1;
                        stackIn_77_0 = stackOut_75_0;
                        stackIn_77_1 = stackOut_75_1;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackOut_76_0 = stackIn_76_0;
                        stackOut_76_1 = 0;
                        stackIn_77_0 = stackOut_76_0;
                        stackIn_77_1 = stackOut_76_1;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var10 = stackIn_77_0 | stackIn_77_1;
                        var13++;
                        if (var15 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var12++;
                        if (var15 == 0) {
                            statePc = 69;
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
                        og.field_d[var4] = var10 != 0;
                        var4++;
                        if (var15 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 81: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackOut_81_0 = (RuntimeException) (var2);
                    stackOut_81_1 = new StringBuilder().append("eg.B(").append(param0).append(',');
                    stackIn_83_0 = stackOut_81_0;
                    stackIn_83_1 = stackOut_81_1;
                    stackIn_82_0 = stackOut_81_0;
                    stackIn_82_1 = stackOut_81_1;
                    if (param1 == null) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
                    stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
                    stackOut_82_2 = "{...}";
                    stackIn_84_0 = stackOut_82_0;
                    stackIn_84_1 = stackOut_82_1;
                    stackIn_84_2 = stackOut_82_2;
                    statePc = 84;
                    continue stateLoop;
                }
                case 83: {
                    stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
                    stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
                    stackOut_83_2 = "null";
                    stackIn_84_0 = stackOut_83_0;
                    stackIn_84_1 = stackOut_83_1;
                    stackIn_84_2 = stackOut_83_2;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    throw qo.a((Throwable) ((Object) stackIn_84_0), stackIn_84_2 + ')');
                }
                case 85: {
                    return;
                }
                case 86: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_n = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
