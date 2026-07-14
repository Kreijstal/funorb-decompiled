/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends in {
    static nd field_e;
    static int[] field_g;
    private long field_i;
    private long field_j;
    private int field_o;
    static bd field_k;
    private int field_p;
    private long[] field_r;
    private long field_q;
    static int field_m;
    static int field_f;
    static String field_h;
    static String[] field_n;
    static String field_l;

    final long a(byte param0) {
        ((lg) this).field_j = ((lg) this).field_j + this.b(1);
        if (!(((lg) this).field_j >= ((lg) this).field_q)) {
            return (((lg) this).field_q - ((lg) this).field_j) / 1000000L;
        }
        if (param0 > -21) {
            field_m = -113;
        }
        return 0L;
    }

    final static void c(boolean param0) {
        ig.field_N.field_k = 0;
        ig.field_N.field_e = 0;
        if (!param0) {
            lg.c(true);
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Exception var8 = null;
        double var8_double = 0.0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        qm var13 = null;
        oj var14 = null;
        bd stackIn_16_0 = null;
        bd stackIn_25_0 = null;
        bd stackIn_94_0 = null;
        bd stackIn_103_0 = null;
        Throwable decompiledCaughtException = null;
        bd stackOut_101_0 = null;
        bd stackOut_102_0 = null;
        bd stackOut_92_0 = null;
        bd stackOut_93_0 = null;
        bd stackOut_24_0 = null;
        bd stackOut_23_0 = null;
        bd stackOut_15_0 = null;
        bd stackOut_14_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = HostileSpawn.field_I ? 1 : 0;
                    var4 = param1;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 >= dk.field_o) {
                        statePc = 72;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var13 = vj.field_w[var4];
                    if (var13 == null) {
                        statePc = 71;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var13.c(0) == param2) {
                        statePc = 5;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var6 = (int)(((double)var13.field_j.field_g + 0.5 + var13.field_l.field_a) * 24.0) + -param0;
                        var5 = (int)(24.0 * (-0.5 + (double)var13.field_j.field_e + var13.field_l.field_f)) + -param3;
                        if (var5 > 95) {
                            statePc = 71;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6 < -96) {
                            statePc = 71;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-737 < var5) {
                            statePc = 71;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (576 < var6) {
                            statePc = 71;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (9 == var13.field_i) {
                            statePc = 26;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (22 != var13.field_i) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var13.field_I ^ -1) >= -1) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = ci.field_b;
                        stackIn_16_0 = stackOut_14_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = v.field_j;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((bd) (Object) stackIn_16_0).a(true, 128, (int)var13.field_c, var5 - 8, var6 - 8);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (-6 == var13.field_i) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-31 != var13.field_i) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        c.field_f[em.field_c / 2 % c.field_f.length].a(true, 128, (int)var13.field_c, var5, var6);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var13.field_i != 230) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        qm.field_P.a(true, 128, (int)var13.field_c, -8 + var5, -8 + var6);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-1 <= (var13.field_I ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = ia.field_l[12];
                        stackIn_25_0 = stackOut_23_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = rl.field_d;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((bd) (Object) stackIn_25_0).a(true, 128, (int)var13.field_c, var5 + -8, -8 + var6);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-1 == (ue.field_d ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (6 != var13.field_i) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ia.field_l[13].a((double)var6, (double)var5, false, var13.field_c, 128);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var13.field_u == null) {
                            statePc = 39;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var13.field_i == 128) {
                            statePc = 39;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var13.field_i == -130) {
                            statePc = 39;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (-131 == var13.field_i) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var13.field_i == -132) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-133 == var13.field_i) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (133 != var13.field_i) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var13.field_u.a(true, 128, (int)var13.field_c, var5, var6);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (246 == var13.field_i) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var8_double = var13.field_c % 256.0;
                        if (var13.field_u != vb.field_Kb[13]) {
                            statePc = 51;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (64.0 == var8_double) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (192.0 != var8_double) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var8_double = 256.0 - var8_double;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var8_double == 0.0) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var8_double == 128.0) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var5 += 2;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var5 -= 2;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (0.0 != var8_double) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var10 = ng.field_u / 2 % 3;
                        ie.field_b[var10].c(-54 + var5, var6 + -16);
                        var10++;
                        if (var10 >= ie.field_b.length) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var10 = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ie.field_b[var10].c(25 + var5, var6 + -16);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (64.0 == var8_double) {
                            statePc = 66;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (128.0 == var8_double) {
                            statePc = 63;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (192.0 != var8_double) {
                            statePc = 71;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var10 = ng.field_u / 2 % 3;
                        ie.field_b[var10].c(var5 + -16, -55 + var6);
                        var10++;
                        if (var10 >= ie.field_b.length) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var10 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        ie.field_b[var10].c(-16 + var5, 24 + var6);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var10 = ng.field_u / 2 % 3;
                        ie.field_b[var10].c(-56 + var5, -16 + var6);
                        var10++;
                        if (ie.field_b.length > var10) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var10 = 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        ie.field_b[var10].c(23 + var5, -16 + var6);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var10 = ng.field_u / 2 % 3;
                        ie.field_b[var10].c(var5 - 16, -56 + var6);
                        var10++;
                        if (var10 < ie.field_b.length) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var10 = 0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        ie.field_b[var10].c(var5 - 16, 23 + var6);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    var8 = (Exception) (Object) caughtException;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    var4++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 72: {
                    if (param2 == 1) {
                        statePc = 74;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var12 = 0;
                    var4 = var12;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (rc.field_e <= var12) {
                        statePc = 128;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var14 = re.field_n[var12];
                    if ((var14.field_i ^ -1) == -23) {
                        statePc = 95;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if ((var14.field_i ^ -1) == -6) {
                        statePc = 87;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if ((var14.field_i ^ -1) == -25) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if ((var14.field_i ^ -1) == -5) {
                        statePc = 81;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var6 = (int)(24.0 * (var14.field_l.field_a + (0.5 + (double)var14.field_j.field_g))) + -param0;
                    var5 = (int)(((double)var14.field_j.field_e + -0.5 + var14.field_l.field_f) * 24.0) + -param3;
                    if (-96 > var5) {
                        statePc = 127;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (var6 < -96) {
                        statePc = 127;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (var5 > 736) {
                        statePc = 127;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if ((var6 ^ -1) >= -577) {
                        statePc = 86;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 86: {
                    ia.field_l[10].a(true, 128, (int)var14.field_c, var5, var6);
                    statePc = 104;
                    continue stateLoop;
                }
                case 87: {
                    var6 = -param0 + (int)(24.0 * (0.5 + (double)var14.field_j.field_g + var14.field_l.field_a));
                    var5 = -param3 + (int)((var14.field_l.field_f + (-0.5 + (double)var14.field_j.field_e)) * 24.0);
                    if (-96 > var5) {
                        statePc = 127;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (95 < var6) {
                        statePc = 127;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (-737 < var5) {
                        statePc = 127;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (576 < var6) {
                        statePc = 127;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (0 < var14.field_I) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    stackOut_92_0 = rl.field_d;
                    stackIn_94_0 = stackOut_92_0;
                    statePc = 94;
                    continue stateLoop;
                }
                case 93: {
                    stackOut_93_0 = ia.field_l[12];
                    stackIn_94_0 = stackOut_93_0;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    ((bd) (Object) stackIn_94_0).a(true, 128, (int)var14.field_c, -8 + var5, -8 + var6);
                    statePc = 104;
                    continue stateLoop;
                }
                case 95: {
                    var5 = -param3 + (int)(24.0 * (var14.field_l.field_f + (-0.5 + (double)var14.field_j.field_e)));
                    var6 = -param0 + (int)(24.0 * (var14.field_l.field_a + ((double)var14.field_j.field_g + 0.5)));
                    if (-96 > var5) {
                        statePc = 127;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (var6 < -96) {
                        statePc = 127;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (736 < var5) {
                        statePc = 127;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (-577 <= (var6 ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (var14.field_I <= 0) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackOut_101_0 = ci.field_b;
                    stackIn_103_0 = stackOut_101_0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 102: {
                    stackOut_102_0 = v.field_j;
                    stackIn_103_0 = stackOut_102_0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    ((bd) (Object) stackIn_103_0).a(true, 128, (int)var14.field_c, -8 + var5, -8 + var6);
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (0 == ue.field_d) {
                        statePc = 106;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (-7 == (var14.field_i ^ -1)) {
                        statePc = 121;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (var14.field_u == null) {
                        statePc = 127;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (128 == var14.field_i) {
                        statePc = 127;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if ((var14.field_i ^ -1) == -130) {
                        statePc = 127;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (130 == var14.field_i) {
                        statePc = 127;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if ((var14.field_i ^ -1) == -132) {
                        statePc = 127;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if ((var14.field_i ^ -1) == -133) {
                        statePc = 127;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (133 != var14.field_i) {
                        statePc = 115;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var5 = (int)(((double)var14.field_j.field_e + -0.5 + var14.field_l.field_f) * 24.0) - param3;
                    var6 = (int)(((double)var14.field_j.field_g + 0.5 + var14.field_l.field_a) * 24.0) + -param0;
                    if (var5 > 95) {
                        statePc = 127;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (95 > var6) {
                        statePc = 127;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    if ((var5 ^ -1) < -737) {
                        statePc = 127;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if ((var6 ^ -1) >= -577) {
                        statePc = 120;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var14.field_u.a((double)var6, (double)var5, false, var14.field_c, 128);
                    statePc = 127;
                    continue stateLoop;
                }
                case 121: {
                    var6 = -param0 + (int)((var14.field_l.field_a + (0.5 + (double)var14.field_j.field_g)) * 24.0);
                    var5 = (int)(24.0 * (var14.field_l.field_f + ((double)var14.field_j.field_e + -0.5))) - param3;
                    if (var5 < -96) {
                        statePc = 127;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (-96 > var6) {
                        statePc = 127;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (-737 > (var5 ^ -1)) {
                        statePc = 127;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (var6 <= 576) {
                        statePc = 126;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 126: {
                    ia.field_l[13].a(true, 128, 0, var5, var6);
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    var12++;
                    statePc = 75;
                    continue stateLoop;
                }
                case 128: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(byte param0, long param1) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        if (param0 > -122) {
            lg.a(-6, 9, -15, -117);
        }
        if ((((lg) this).field_q ^ -1L) >= (((lg) this).field_j ^ -1L)) {
            var4 = 0;
            do {
                ((lg) this).field_q = ((lg) this).field_q + param1;
                var4++;
                // if_icmple L90
            } while ((((lg) this).field_q ^ -1L) > (((lg) this).field_j ^ -1L));
            if ((((lg) this).field_j ^ -1L) < (((lg) this).field_q ^ -1L)) {
                ((lg) this).field_q = ((lg) this).field_j;
            }
            return var4;
        }
        ((lg) this).field_i = ((lg) this).field_i + (-((lg) this).field_j + ((lg) this).field_q);
        ((lg) this).field_j = ((lg) this).field_j + (-((lg) this).field_j + ((lg) this).field_q);
        ((lg) this).field_q = ((lg) this).field_q + param1;
        return 1;
    }

    final void b(boolean param0) {
        if (param0) {
            lg.a(-37, 17, 11, -80);
        }
        ((lg) this).field_i = 0L;
        if (((lg) this).field_j < ((lg) this).field_q) {
            ((lg) this).field_j = ((lg) this).field_j + (((lg) this).field_q + -((lg) this).field_j);
        }
    }

    private final long b(int param0) {
        int var8 = 0;
        int var9 = HostileSpawn.field_I ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - ((lg) this).field_i;
        ((lg) this).field_i = var2;
        if ((var4 ^ -1L) < 4999999999L) {
            if (!(-5000000001L >= (var4 ^ -1L))) {
                ((lg) this).field_r[((lg) this).field_o] = var4;
                if (1 > ((lg) this).field_p) {
                    ((lg) this).field_p = ((lg) this).field_p + 1;
                }
                ((lg) this).field_o = (((lg) this).field_o + 1) % 10;
            }
        }
        long var6 = 0L;
        if (param0 != 1) {
            return -82L;
        }
        for (var8 = 1; ((lg) this).field_p >= var8; var8++) {
            var6 = var6 + ((lg) this).field_r[(10 + -var8 + ((lg) this).field_o) % 10];
        }
        return var6 / (long)((lg) this).field_p;
    }

    public static void b(byte param0) {
        field_g = null;
        field_e = null;
        if (param0 >= -111) {
            field_f = -60;
        }
        field_l = null;
        field_h = null;
        field_n = null;
        field_k = null;
    }

    lg() {
        ((lg) this).field_i = 0L;
        ((lg) this).field_j = 0L;
        ((lg) this).field_r = new long[10];
        ((lg) this).field_p = 1;
        ((lg) this).field_q = 0L;
        ((lg) this).field_o = 0;
        ((lg) this).field_j = System.nanoTime();
        ((lg) this).field_q = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_e = new nd(10, 2, 2, 0);
        field_h = "Highscores";
        field_n = new String[]{"Ammo", "Fuel", "Cells", "Rockets"};
        field_l = "Start Game";
    }
}
