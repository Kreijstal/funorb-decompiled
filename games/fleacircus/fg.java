/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends lh {
    int[] field_o;
    int field_k;
    static sf field_l;
    static ia field_x;
    int field_v;
    od[] field_s;
    int[] field_r;
    static vc field_t;
    static ce field_q;
    int[] field_p;
    static ce field_i;
    static dd field_j;
    static int[] field_u;
    byte[][][] field_w;
    od[] field_n;
    static String field_m;

    final static void a(byte param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_83_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        pl.field_f = 0;
                        var1_int = 61 % ((param0 - -43) / 47);
                        qh.field_z = 0;
                        qi.field_f = 0;
                        kb.field_i = 0;
                        pa.field_o = 0;
                        gh.field_q = 0;
                        jc.field_f = 0;
                        md.field_L = 1;
                        pl.field_g = 0;
                        db.field_H = 0;
                        ue.field_d = 4;
                        we.field_c = 0;
                        oe.field_a = 0;
                        var2 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = -41;
                        stackIn_3_1 = var2 ^ -1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 >= stackIn_3_1) {
                            statePc = 82;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_83_0 = 0;
                        stackIn_5_0 = stackIn_83_0;
                        if (var8 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = var3;
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
                        if (stackIn_7_0 >= 21) {
                            statePc = 81;
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
                        var4 = fl.field_c[var2][var3];
                        stackIn_3_0 = var4;
                        stackIn_9_0 = stackIn_3_0;
                        stackIn_3_1 = 15;
                        stackIn_9_1 = stackIn_3_1;
                        if (var8 != 0) {
                            statePc = 3;
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
                        if (stackIn_9_0 != stackIn_9_1) {
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
                        fl.field_c[var2][var3 - -2] = (char)7;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (1 != var4) {
                            statePc = 13;
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
                        rk.field_s = 8 + 16 * var2;
                        ck.field_o = 16 + var3 * 16;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (8 == var4) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        gk.a(var3, 125, 9, var2, 8);
                        ok.field_s[-1 + oe.field_a] = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (13 == var4) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var4 == 27) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        gk.a(var3, 124, 27, var2, 13);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var4 == 12) {
                            statePc = 23;
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
                        if (var4 != 32) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        gk.a(var3, 127, 32, var2, 12);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var4 == 14) {
                            statePc = 27;
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
                        if (var4 == 28) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        gk.a(var3, 126, 28, var2, 14);
                        rk.field_u[qi.field_f] = var2;
                        kk.field_a[qi.field_f] = var3;
                        me.field_i[qi.field_f] = 0;
                        qi.field_f = qi.field_f + 1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (16 == var4) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var4 == 29) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (jc.field_f != 0) {
                            statePc = 34;
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
                        jc.field_f = 1;
                        pc.field_b = var2;
                        lb.field_m = var3;
                        if (var8 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        hf.field_b = var3;
                        tg.field_d = var2;
                        jc.field_f = 2;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        gk.a(var3, 127, 29, var2, 16);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var4 == 17) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var4 == 31) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        gk.a(var3, 126, 31, var2, 17);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var5 = fl.field_c[var2][var3];
                        var6 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = var6;
                        stackIn_42_1 = 4;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 >= stackIn_42_1) {
                            statePc = 80;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_7_0 = 0;
                        stackIn_44_0 = stackIn_7_0;
                        if (var8 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var7 = stackIn_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (-5 >= (var7 ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_42_0 = -1;
                        stackIn_47_0 = stackIn_42_0;
                        stackIn_42_1 = var5 ^ -1;
                        stackIn_47_1 = stackIn_42_1;
                        if (var8 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 != stackIn_47_1) {
                            statePc = 50;
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
                        lh.field_e[4 * var2 + var6][var7 + 4 * var3] = 0;
                        if (var8 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var5 != 1) {
                            statePc = 53;
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
                        lh.field_e[var6 + 4 * var2][var3 * 4 + var7] = 1;
                        if (var8 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (3 != var5) {
                            statePc = 59;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var6 == -var7 + 3) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        lh.field_e[var6 + 4 * var2][4 * var3 - -var7] = 0;
                        if (var8 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        lh.field_e[var6 + var2 * 4][4 * var3 + var7] = 1;
                        if (var8 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var5 != 4) {
                            statePc = 65;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var7 == var6) {
                            statePc = 63;
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
                        lh.field_e[var6 + 4 * var2][4 * var3 + var7] = 0;
                        if (var8 == 0) {
                            statePc = 78;
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
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        lh.field_e[4 * var2 + var6][4 * var3 + var7] = 1;
                        if (var8 == 0) {
                            statePc = 78;
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
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var5 != 8) {
                            statePc = 68;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        lh.field_e[var2 * 4 + var6][var7 + 4 * var3] = -1;
                        if (var8 == 0) {
                            statePc = 78;
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
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (18 == var5) {
                            statePc = 77;
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
                        if (var5 == 11) {
                            statePc = 72;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        lh.field_e[var6 + var2 * 4][var3 * 4 - -var7] = 2;
                        if (var8 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
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
                        if (3 == var7) {
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
                        lh.field_e[4 * var2 - -var6][var3 * 4 + var7] = 0;
                        if (var8 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        lh.field_e[var6 + 4 * var2][var7 + var3 * 4] = 1;
                        if (var8 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        lh.field_e[var6 + var2 * 4][var7 + var3 * 4] = -1;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var7++;
                        if (var8 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var6++;
                        if (var8 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var3++;
                        if (var8 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var2++;
                        if (var8 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        bm.e((byte) 31);
                        stackIn_83_0 = 6;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        ee.field_h = stackIn_83_0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 85: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var1), "fg.B(" + param0 + ')');
                }
                case 86: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_u = null;
        field_t = null;
        if (param0 != -5) {
            field_i = (ce) null;
        }
        field_m = null;
        field_l = null;
        field_i = null;
        field_q = null;
        field_j = null;
        field_x = null;
    }

    fg() {
    }

    static {
        field_u = new int[150];
        field_t = new vc();
        field_m = null;
    }
}
