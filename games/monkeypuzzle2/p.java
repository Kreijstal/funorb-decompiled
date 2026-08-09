/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static String field_b;
    static int field_a;
    static int[] field_d;
    static String field_c;

    final static void b(int param0) {
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4_long = 0L;
        de var4 = null;
        int var5 = 0;
        d var6_ref_d = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        hb var28 = null;
        hb var29 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var26 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var28 = MonkeyPuzzle2.field_D;
                        var29 = var28;
                        var2 = var29.a((byte) 114);
                        if (var2 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (1 == var2) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        kk.a("HS1: " + bh.a((byte) -105), (byte) 115, (Throwable) null);
                        gk.a(-1);
                        if (var26 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = var29.j(17277);
                        var4_long = var29.i(58);
                        var6_ref_d = (d) ((Object) wk.field_b.a((byte) -117));
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6_ref_d == null) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_69_0 = var6_ref_d.field_n ^ -1;
                        stackIn_8_0 = stackIn_69_0;
                        stackIn_69_1 = var3 ^ -1;
                        stackIn_8_1 = stackIn_69_1;
                        if (var26 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 != stackIn_8_1) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var26 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6_ref_d = (d) ((Object) wk.field_b.d((byte) 63));
                        if (var26 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var6_ref_d != null) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        gk.a(-1);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        var6_ref_d.field_g = var4_long;
                        var6_ref_d.c(-19822);
                        if (var26 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3 = var29.j(17277);
                        var4 = (de) ((Object) qa.field_d.a((byte) -117));
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var4 == null) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_69_0 = var3 ^ -1;
                        stackIn_19_0 = stackIn_69_0;
                        stackIn_69_1 = var4.field_k ^ -1;
                        stackIn_19_1 = stackIn_69_1;
                        if (var26 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 != stackIn_19_1) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var26 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var4 = (de) ((Object) qa.field_d.d((byte) 63));
                        if (var26 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var4 == null) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        gk.a(-1);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return;
                }
                case 27: {
                    try {
                        var5 = var29.a((byte) 114);
                        if (-1 != (var5 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6 = var4.field_h;
                        var7 = var4.field_e;
                        ah.field_a[0].field_d = cl.field_e;
                        ah.field_a[0].field_c = null;
                        ah.field_a[0].field_a = false;
                        var8_int = 1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var8_int >= var5) {
                            statePc = 37;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ah.field_a[var8_int].field_d = var28.f(-1);
                        ah.field_a[var8_int].field_a = false;
                        stackIn_69_0 = 1;
                        stackIn_32_0 = stackIn_69_0;
                        stackIn_69_1 = var29.a((byte) 114);
                        stackIn_32_1 = stackIn_69_1;
                        if (var26 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 != stackIn_32_1) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ah.field_a[var8_int].field_c = var29.f(-1);
                        if (var26 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ah.field_a[var8_int].field_c = null;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var8_int++;
                        if (var26 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        dupTemp$0 = new String[3][var6];
                        var4.field_g = dupTemp$0;
                        var8 = dupTemp$0;
                        var9 = new String[3][var6];
                        dupTemp$1 = new long[3][var6];
                        var4.field_p = dupTemp$1;
                        var10 = dupTemp$1;
                        dupTemp$2 = new int[3][var6 * var7];
                        var4.field_i = dupTemp$2;
                        var11 = dupTemp$2;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var29.a((byte) 114);
                        if (var18 > 0) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var19 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var18 <= var19) {
                            statePc = 67;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var20 = var28.a((byte) 114);
                        var21 = ah.field_a[var20].field_d;
                        var22 = var29.i(89);
                        var24 = var29.field_h;
                        stackIn_69_0 = var19 ^ -1;
                        stackIn_42_0 = stackIn_69_0;
                        stackIn_69_1 = var6 ^ -1;
                        stackIn_42_1 = stackIn_69_1;
                        if (var26 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 > stackIn_42_1) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var8[0][var12] = var21;
                        var9[0][var12] = ah.field_a[var20].field_c;
                        var10[0][var12] = var22;
                        var25 = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var7 <= var25) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        incrementValue$3 = var15;
                        var15++;
                        var11[0][incrementValue$3] = var28.e(-95);
                        var25++;
                        if (var26 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var26 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var12++;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var21 == null) {
                            statePc = 57;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (!f.a(-15189, var21)) {
                            statePc = 57;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var8[1][var13] = cl.field_e;
                        var9[1][var13] = null;
                        var10[1][var13] = var22;
                        var13++;
                        var29.field_h = var24;
                        var25 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var25 >= var7) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        incrementValue$4 = var16;
                        var16++;
                        var11[1][incrementValue$4] = var28.e(126);
                        var25++;
                        if (var26 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var26 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var14 >= var6) {
                            statePc = 65;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (!ah.field_a[var20].field_a) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        ah.field_a[var20].field_a = true;
                        var8[2][var14] = var21;
                        var9[2][var14] = ah.field_a[var20].field_c;
                        var10[2][var14] = var22;
                        var14++;
                        var29.field_h = var24;
                        var25 = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var7 <= var25) {
                            statePc = 65;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        incrementValue$5 = var17;
                        var17++;
                        var11[2][incrementValue$5] = var28.e(127);
                        var25++;
                        if (var26 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var26 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var19++;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var26 == 0) {
                            statePc = 40;
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
                        var4.field_l = true;
                        var4.c(-19822);
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_69_0 = param0;
                        stackIn_69_1 = -62;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (stackIn_69_0 < stackIn_69_1) {
                            statePc = 73;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        field_b = (String) null;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 72: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var1), "p.D(" + param0 + ')');
                }
                case 73: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, byte param1, int param2, String[] param3) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 >= 95) {
              L1: {
                L2: {
                  ed.field_c = f.field_i;
                  if (255 == param2) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (param2 < 100) {
                          break L4;
                        } else {
                          if (105 >= param2) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      w.field_c = lh.a(true, param0, param2);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                    var4 = param3;
                    wh.a(var4, true);
                    w.field_c = jj.a(param3, true);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L5: {
                  stackIn_12_0 = -89;

                  if ((dd.field_d ^ -1) <= -14) {
                    stackIn_13_0 = stackIn_12_0;
                    stackIn_13_1 = 0;
                    break L5;
                  } else {
                    stackIn_13_0 = stackIn_12_0;
                    stackIn_13_1 = 1;
                    break L5;
                  }
                }
                w.field_c = hj.a((byte) stackIn_13_0, stackIn_13_1 != 0);
                var6 = (String[]) null;
                wh.a((String[]) null, true);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (runtimeException);

            stackIn_17_1 = new StringBuilder().append("p.B(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static Object a(byte[] param0, byte param1, boolean param2) {
        ab var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        ab stackIn_6_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              if (-137 > (param0.length ^ -1)) {
                var3 = new ab();
                ((ka) ((Object) var3)).a(76, param0);
                stackIn_6_0 = (ab) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param1 >= 109) {
                    break L1;
                  } else {
                    p.a(39);
                    break L1;
                  }
                }
                if (param2) {
                  stackIn_13_0 = bk.a(0, param0);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = (byte[]) (param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("p.C(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != -14) {
            return;
        }
        field_c = null;
    }

    static {
        field_b = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_a = 0;
        field_d = new int[8192];
        field_c = "Email: ";
    }
}
