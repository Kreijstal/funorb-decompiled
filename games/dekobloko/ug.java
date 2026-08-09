/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends bh {
    static int[] field_q;
    int field_o;
    static String field_n;
    int field_p;

    final static void a(vg param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_18_0 = 0;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        dh stackIn_42_0 = null;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        int stackIn_49_4 = 0;
        int stackIn_49_5 = 0;
        int stackIn_49_6 = 0;
        int stackIn_49_7 = 0;
        int stackIn_49_8 = 0;
        int stackIn_49_9 = 0;
        int stackIn_49_10 = 0;
        int stackIn_49_11 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        int stackIn_50_4 = 0;
        int stackIn_50_5 = 0;
        int stackIn_50_6 = 0;
        int stackIn_50_7 = 0;
        int stackIn_50_8 = 0;
        int stackIn_50_9 = 0;
        int stackIn_50_10 = 0;
        int stackIn_50_11 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int stackIn_51_4 = 0;
        int stackIn_51_5 = 0;
        int stackIn_51_6 = 0;
        int stackIn_51_7 = 0;
        int stackIn_51_8 = 0;
        int stackIn_51_9 = 0;
        int stackIn_51_10 = 0;
        int stackIn_51_11 = 0;
        int stackIn_51_12 = 0;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        dh var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        vg var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var40 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var44 = param0;
                        if (!param4) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_q = (int[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var44.field_Q == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var44.field_B ^ -1) >= -2) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var60 = var44.field_Q;
                        sh.a(var60, -25724, 0, nm.field_Nb, 0);
                        if (var40 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        kh.a(2);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var54 = new int[param0.field_D];
                        var49 = var54;
                        var41 = var49;
                        var8 = var41;
                        var64 = new int[param0.field_D];
                        var62 = id.field_M;
                        var61 = bc.field_I;
                        var63 = sf.field_C;
                        var13 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param0.field_D ^ -1) >= (var13 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var14 = var61[var13] * param1 + var62[var13] * param3 + var63[var13] * param6 >> 227238920;
                        stackIn_24_0 = var14 ^ -1;
                        stackIn_10_0 = stackIn_24_0;
                        stackIn_24_1 = -1;
                        stackIn_10_1 = stackIn_24_1;
                        if (var40 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 > stackIn_10_1) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var14 = -var14;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (0 > var14) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var14 < 128) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_18_0 = 256;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_18_0 = var14 + 128;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = 128;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var14 = stackIn_18_0;
                        var15 = param2 * var62[var13] + var61[var13] * param7 - -(var63[var13] * param5) >> -1816498232;
                        stackIn_20_0 = ch.field_b;
                        stackIn_19_0 = stackIn_20_0;
                        if (-1 >= (var15 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_21_0 = (int[]) ((Object) stackIn_19_0);
                        stackIn_21_1 = -var15;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                        stackIn_21_1 = var15;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var15 = stackIn_21_0[stackIn_21_1];
                        var14 = (256 + -var15) * var14 >>> 1268162184;
                        var54[var13] = var14;
                        var64[var13] = var15;
                        var13++;
                        if (var40 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var13 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = var13;
                        stackIn_24_1 = ta.field_d;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 >= stackIn_24_1) {
                            statePc = 62;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var14 = hb.field_Vb[var13];
                        var15 = param0.field_M[var14];
                        var16 = param0.field_c[var14];
                        var17 = param0.field_A[var14];
                        if (var40 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (id.field_M.length > param0.field_F[var14]) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_29_0 = -1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = param0.field_F[var14];
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var18 = stackIn_29_0;
                        if (id.field_M.length > param0.field_t[var14]) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_32_0 = -1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = param0.field_t[var14];
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var19 = stackIn_32_0;
                        if ((id.field_M.length ^ -1) >= (param0.field_r[var14] ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_35_0 = param0.field_r[var14];
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = -1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var20 = stackIn_35_0;
                        if (null == l.field_i) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (null == param0.field_j) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((param0.field_j.length ^ -1) >= (var14 ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (0 == (param0.field_j[var14] ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (l.field_i.length <= param0.field_j[var14]) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_42_0 = l.field_i[param0.field_j[var14]];
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = null;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var21 = stackIn_42_0;
                        var22 = kl.field_n[var15];
                        var23 = rn.field_b[var15];
                        var24 = kl.field_n[var16];
                        var25 = rn.field_b[var16];
                        var26 = kl.field_n[var17];
                        var27 = rn.field_b[var17];
                        if (var18 != var19) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var20 ^ -1) == (var19 ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 != null) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_48_0 = 8355711;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = var21.field_a;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var34 = stackIn_48_0;
                        var35 = var34 & 16711935;
                        var36 = var34 & 65280;
                        var37 = (16711810 & var36 * var28) >>> -1017884856 | (var35 * var28 & -16711879) >>> 1795278632;
                        var38 = var35 * var29 >>> 770485128 & 285147391 | var36 * var29 >>> 853475976 & 1291910912;
                        var39 = -755040001 & var35 * var30 >>> -1925801080 | var36 * var30 >>> -1947323704 & -2046755072;
                        var37 = var37 + var31 * 65793;
                        var38 = var38 + var32 * 65793;
                        var39 = var39 + var33 * 65793;
                        stackIn_50_0 = var37 & 255;
                        stackIn_49_0 = stackIn_50_0;
                        stackIn_50_1 = var25;
                        stackIn_49_1 = stackIn_50_1;
                        stackIn_50_2 = var22;
                        stackIn_49_2 = stackIn_50_2;
                        stackIn_50_3 = var39 >> 225006032;
                        stackIn_49_3 = stackIn_50_3;
                        stackIn_50_4 = var24;
                        stackIn_49_4 = stackIn_50_4;
                        stackIn_50_5 = var37 >> 2099190608;
                        stackIn_49_5 = stackIn_50_5;
                        stackIn_50_6 = var39 & 255;
                        stackIn_49_6 = stackIn_50_6;
                        stackIn_50_7 = 255 & var38;
                        stackIn_49_7 = stackIn_50_7;
                        stackIn_50_8 = var27;
                        stackIn_49_8 = stackIn_50_8;
                        stackIn_50_9 = var38 >> 281414704;
                        stackIn_49_9 = stackIn_50_9;
                        stackIn_50_10 = var39 >> 1640941864 & 255;
                        stackIn_49_10 = stackIn_50_10;
                        stackIn_50_11 = var23;
                        stackIn_49_11 = stackIn_50_11;
                        if (param4) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_51_0 = stackIn_49_0;
                        stackIn_51_1 = stackIn_49_1;
                        stackIn_51_2 = stackIn_49_2;
                        stackIn_51_3 = stackIn_49_3;
                        stackIn_51_4 = stackIn_49_4;
                        stackIn_51_5 = stackIn_49_5;
                        stackIn_51_6 = stackIn_49_6;
                        stackIn_51_7 = stackIn_49_7;
                        stackIn_51_8 = stackIn_49_8;
                        stackIn_51_9 = stackIn_49_9;
                        stackIn_51_10 = stackIn_49_10;
                        stackIn_51_11 = stackIn_49_11;
                        stackIn_51_12 = 1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = stackIn_50_0;
                        stackIn_51_1 = stackIn_50_1;
                        stackIn_51_2 = stackIn_50_2;
                        stackIn_51_3 = stackIn_50_3;
                        stackIn_51_4 = stackIn_50_4;
                        stackIn_51_5 = stackIn_50_5;
                        stackIn_51_6 = stackIn_50_6;
                        stackIn_51_7 = stackIn_50_7;
                        stackIn_51_8 = stackIn_50_8;
                        stackIn_51_9 = stackIn_50_9;
                        stackIn_51_10 = stackIn_50_10;
                        stackIn_51_11 = stackIn_50_11;
                        stackIn_51_12 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        wf.a(stackIn_51_0, stackIn_51_1, stackIn_51_2, stackIn_51_3, stackIn_51_4, stackIn_51_5, stackIn_51_6, stackIn_51_7, stackIn_51_8, stackIn_51_9, stackIn_51_10, stackIn_51_11, stackIn_51_12 != 0, var37 >> -1725201496 & 255, var26, 255 & var38 >> -522552696);
                        if (var40 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var28 = var54[var18];
                        var29 = var64[var18];
                        if (var21 != null) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_55_0 = 8355711;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_55_0 = var21.field_a;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var30 = stackIn_55_0;
                        var31 = var30 & 16711935;
                        var32 = var30 & 65280;
                        var33 = 1476460288 & var32 * var28 >>> -1357940280 | -268500737 & var31 * var28 >>> 1730230664;
                        var33 = var33 + 65793 * var29;
                        tb.a(var23, var27, var22, var33 >> 626219073 & 8355711, var24, var25, 127, var26);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var13++;
                        if (var40 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    var8_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_60_0 = (RuntimeException) (var8_ref);
                    stackIn_59_0 = stackIn_60_0;
                    stackIn_60_1 = new StringBuilder().append("ug.B(");
                    stackIn_59_1 = stackIn_60_1;
                    if (param0 == null) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_61_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_61_1 = (StringBuilder) ((Object) stackIn_59_1);
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
                    throw dh.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
                }
                case 62: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (!cb.a(param1, param0, 4564)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var3_int ^ -1) <= (param0.length() ^ -1)) {
                      break L3;
                    } else {
                      stackOut_7_0 = ci.a(param0.charAt(var3_int), (byte) 82);
                      stackIn_14_0 = stackOut_7_0 ? 1 : 0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_8_0) {
                          stackIn_11_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var3_int++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_14_0 = -86 % ((-31 - param2) / 56);
                  break L2;
                }
                var4 = stackIn_14_0;
                stackIn_15_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("ug.A(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != -21771) {
            CharSequence var2 = (CharSequence) null;
            ug.a((CharSequence) null, false, -92);
        }
        field_n = null;
    }

    private ug() throws Throwable {
        throw new Error();
    }

    final static boolean a(char param0, int param1) {
        int stackIn_9_0 = 0;
        if (param1 == 32) {
          L0: {
            L1: {
              if (160 == param0) {
                break L1;
              } else {
                if (param0 == 32) {
                  break L1;
                } else {
                  if (param0 == 95) {
                    break L1;
                  } else {
                    if (param0 != 45) {
                      stackIn_9_0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_9_0 = 1;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return false;
        }
    }

    static {
        field_n = "The Controls";
    }
}
