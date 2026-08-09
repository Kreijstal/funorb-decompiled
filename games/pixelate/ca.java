/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    private long[] field_c;
    private int field_h;
    static String field_m;
    private long[] field_g;
    private int field_i;
    static String field_k;
    private byte[] field_j;
    private long[] field_d;
    static lc field_f;
    private byte[] field_l;
    static int[] field_a;
    private long[] field_b;
    private long[] field_e;

    final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        if (param0 > 122) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ca.b(-128);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var2_int ^ -1) <= -33) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_l[var2_int] = (byte) 0;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_i = 0;
                        this.field_h = 0;
                        this.field_j[0] = (byte) 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (8 <= var2_int) {
                            statePc = 18;
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
                        this.field_g[var2_int] = 0L;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var3 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw aa.a((Throwable) ((Object) runtimeException), "ca.C(" + param0 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, rl param1, boolean param2, int param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        boolean stackOut_12_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = aq.a((byte) 32, 3 * (param0 + -param3));
                        var6 = 3 * param3;
                        if (!param2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ca.a(-91);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = var5_int + -10;
                        da.e(-98);
                        if (param1.field_B <= 0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (null == param1.field_n) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        vf.a((byte) -37);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        mp.field_b = 0;
                        var8 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var8 >= param1.field_j) {
                            statePc = 53;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = param1.field_h[var8];
                        var10 = param1.field_I[var8];
                        var11 = param1.field_o[var8];
                        stackOut_12_0 = param4;
                        stackIn_54_0 = stackOut_12_0 ? 1 : 0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var19 != 0) {
                            statePc = 54;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = jp.field_a[var9];
                        var13 = al.field_m[var9];
                        var14 = -var12 + jp.field_a[var10];
                        var15 = -var12 + jp.field_a[var11];
                        var16 = -var13 + al.field_m[var10];
                        var17 = al.field_m[var11] + -var13;
                        if (-1 < (var17 * var14 + -(var15 * var16) ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var19 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var12 = qe.field_v[var9];
                        if ((var12 ^ -1) != 2147483647) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var19 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var13 = qe.field_v[var10];
                        if (-2147483648 == var13) {
                            statePc = 52;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var14 = qe.field_v[var11];
                        if (2147483647 != (var14 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var19 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var15 = -var6 + var12 - (-var13 + -var14);
                        if (var7 >= 0) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_34_0 = var15 << -var7;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = var15 >> var7;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var16 = -stackIn_34_0 + (-1 + kb.field_N.length);
                        var17 = kb.field_N[var16];
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((var17 >> -558220764 ^ -1) == -1) {
                            statePc = 44;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var16--;
                        stackIn_45_0 = var16 ^ -1;
                        stackIn_37_0 = stackIn_45_0;
                        stackIn_45_1 = -1;
                        stackIn_37_1 = stackIn_45_1;
                        if (var19 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 <= stackIn_37_1) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var17 = kb.field_N[var16];
                        if (var19 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = var17;
                        stackIn_45_1 = var16 << 120367940;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var18 = stackIn_45_0 + stackIn_45_1;
                        nd.field_c[var18] = var8;
                        kb.field_N[var16] = var17 - -1;
                        if ((param1.field_B ^ -1) >= -1) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (null == param1.field_n) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        dupTemp$0 = param1.field_n[var8];
                        sc.field_i[dupTemp$0] = sc.field_i[dupTemp$0] + 1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        mp.field_b = mp.field_b + 1;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_54_0 = -1;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (stackIn_54_0 <= (param1.field_B ^ -1)) {
                            statePc = 70;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (param1.field_n == null) {
                            statePc = 70;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if ((sc.field_i.length ^ -1) >= (var9 ^ -1)) {
                            statePc = 70;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var10 = sc.field_i[var9];
                        sc.field_i[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var19 == 0) {
                            statePc = 59;
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
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_68_0 = (RuntimeException) (var5);
                    stackIn_66_0 = stackIn_68_0;
                    stackIn_68_1 = new StringBuilder().append("ca.D(").append(param0).append(',');
                    stackIn_66_1 = stackIn_68_1;
                    if (param1 == null) {
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
                    throw aa.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 70: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var2_int ^ -1) <= -9) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_c[var2_int] = fp.a(fp.a(mk.a(65280L, (long)this.field_j[var3 - -6] << -1034788856), fp.a(fp.a(mk.a((long)this.field_j[4 + var3], 255L) << 1457721944, fp.a(fp.a(fp.a(mk.a((long)this.field_j[1 + var3], 255L) << 709804016, (long)this.field_j[var3] << 371262584), mk.a(280375465082880L, (long)this.field_j[2 + var3] << -254312152)), mk.a((long)this.field_j[3 + var3], 255L) << 309214816)), mk.a((long)this.field_j[var3 + 5] << 2062310672, 16711680L))), mk.a((long)this.field_j[7 + var3], 255L));
                        var2_int++;
                        var3 += 8;
                        if (var6 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 68;
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
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_int = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var2_int >= 8) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        dupTemp$0 = this.field_g[var2_int];
                        arrayValue$1 = this.field_c[var2_int];
                        this.field_d[var2_int] = dupTemp$0;
                        this.field_e[var2_int] = fp.a(arrayValue$1, dupTemp$0);
                        var2_int++;
                        if (var6 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var6 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var2_int = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-11 > (var2_int ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_60_0 = 0;
                        stackIn_18_0 = stackIn_60_0;
                        if (var6 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_20_0 = stackIn_18_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3 = stackIn_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var3 >= 8) {
                            statePc = 31;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_b[var3] = 0L;
                        var4 = 0;
                        stackIn_32_0 = 56;
                        stackIn_23_0 = stackIn_32_0;
                        if (var6 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var5 = stackIn_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var4 >= 8) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_b[var3] = fp.a(this.field_b[var3], pg.field_b[var4][cm.a(255, (int)(this.field_d[cm.a(-var4 + var3, 7)] >>> var5))]);
                        var4++;
                        var5 -= 8;
                        if (var6 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var6 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var3++;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var6 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var3 = stackIn_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (-9 >= (var3 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.field_d[var3] = this.field_b[var3];
                        var3++;
                        if (var6 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var6 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        this.field_d[0] = fp.a(this.field_d[0], pg.field_c[var2_int]);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var3 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var3 ^ -1) <= -9) {
                            statePc = 50;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        this.field_b[var3] = this.field_d[var3];
                        var4 = 0;
                        stackIn_51_0 = 56;
                        stackIn_42_0 = stackIn_51_0;
                        if (var6 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var5 = stackIn_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var4 >= 8) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        this.field_b[var3] = fp.a(this.field_b[var3], pg.field_b[var4][cm.a((int)(this.field_e[cm.a(7, var3 + -var4)] >>> var5), 255)]);
                        var5 -= 8;
                        var4++;
                        if (var6 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var6 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var3++;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var6 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var3 = stackIn_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var3 >= 8) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        this.field_e[var3] = this.field_b[var3];
                        var3++;
                        if (var6 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var6 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var2_int++;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var6 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var2_int = 0;
                        stackIn_60_0 = param0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 == 41) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 61: {
                    return;
                }
                case 62: {
                    try {
                        if (var2_int >= 8) {
                            statePc = 69;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        this.field_g[var2_int] = fp.a(this.field_g[var2_int], fp.a(this.field_c[var2_int], this.field_e[var2_int]));
                        var2_int++;
                        if (var6 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var6 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw aa.a((Throwable) ((Object) var2), "ca.F(" + param0 + ')');
                }
                case 69: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static tf a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        byte[] var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        tf var4 = null;
        int var5 = 0;
        tf stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var1_int = ge.field_c[0] * gf.field_g[0];
            var2 = wo.field_f[param0];
            var3 = new int[var1_int];
            var4_int = 0;
            L1: while (true) {
              L2: {
                if (var4_int >= var1_int) {
                  break L2;
                } else {
                  var3[var4_int] = fl.field_g[cm.a((int) var2[var4_int], 255)];
                  var4_int++;
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = new tf(tj.field_y, jb.field_a, fa.field_b[0], e.field_b[0], gf.field_g[0], ge.field_c[0], var3);
              re.b(140);
              stackIn_5_0 = (tf) (var4);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "ca.E(" + param0 + ')');
        }
        return stackIn_5_0;
    }

    final void a(byte[] param0, long param1, byte param2) {
        int stackIn_9_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        var6 = 8 + -(7 & (int)param1) & 7;
                        var7 = this.field_h & 7;
                        var9 = param1;
                        var11 = 31;
                        var12 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var11 ^ -1) > -1) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var12 = var12 + ((255 & this.field_l[var11]) - -((int)var9 & 255));
                        this.field_l[var11] = (byte)var12;
                        var12 = var12 >>> 8;
                        var9 = var9 >>> 8;
                        var11--;
                        if (var13 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var13 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((param1 ^ -1L) >= -9L) {
                            statePc = 23;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = 255 & param0[var5_int] << var6 | (255 & param0[var5_int - -1]) >>> 8 - var6;
                        stackIn_24_0 = var8;
                        stackIn_9_0 = stackIn_24_0;
                        if (var13 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 < 0) {
                            statePc = 17;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (256 <= var8) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw new RuntimeException("LOGIC ERROR");
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_j[this.field_i] = (byte)bq.a((int) this.field_j[this.field_i], var8 >>> var7);
                        this.field_h = this.field_h + (8 + -var7);
                        this.field_i = this.field_i + 1;
                        if ((this.field_h ^ -1) == -513) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.b((byte) 41);
                        this.field_i = 0;
                        this.field_h = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_j[this.field_i] = (byte)cm.a(var8 << -var7 + 8, 255);
                        param1 = param1 - 8L;
                        this.field_h = this.field_h + var7;
                        var5_int++;
                        if (var13 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = (0L < param1 ? -1 : (0L == param1 ? 0 : 1));
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 < 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var8 = 0;
                        if (var13 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var8 = param0[var5_int] << var6 & 255;
                        this.field_j[this.field_i] = (byte)bq.a((int) this.field_j[this.field_i], var8 >>> var7);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var11 = -86 % ((param2 - 39) / 48);
                        if (-9L >= ((long)var7 + param1 ^ -1L)) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.field_h = (int)((long)this.field_h + param1);
                        if (var13 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        param1 = param1 - (long)(8 - var7);
                        this.field_i = this.field_i + 1;
                        this.field_h = this.field_h + (-var7 + 8);
                        if ((this.field_h ^ -1) == -513) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.b((byte) 41);
                        this.field_h = 0;
                        this.field_i = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        this.field_j[this.field_i] = (byte)cm.a(var8 << -var7 + 8, 255);
                        this.field_h = this.field_h + (int)param1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_40_0 = (RuntimeException) (var5);
                    stackIn_38_0 = stackIn_40_0;
                    stackIn_40_1 = new StringBuilder().append("ca.G(");
                    stackIn_38_1 = stackIn_40_1;
                    if (param0 == null) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_41_0 = (RuntimeException) ((Object) stackIn_38_0);
                    stackIn_41_1 = (StringBuilder) ((Object) stackIn_38_1);
                    stackIn_41_2 = "{...}";
                    statePc = 41;
                    continue stateLoop;
                }
                case 40: {
                    stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
                    stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                    stackIn_41_2 = "null";
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    throw aa.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 42: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte[] param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_j[this.field_i] = (byte)bq.a((int) this.field_j[this.field_i], 128 >>> cm.a(this.field_h, 7));
                        this.field_i = this.field_i + 1;
                        if (-33 <= (this.field_i ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_i >= 64) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        fieldTemp$0 = this.field_i;
                        this.field_i = this.field_i + 1;
                        this.field_j[fieldTemp$0] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var8 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.b((byte) 41);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_i = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (32 <= this.field_i) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        fieldTemp$1 = this.field_i;
                        this.field_i = this.field_i + 1;
                        this.field_j[fieldTemp$1] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var8 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param2 == 16157) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return;
                }
                case 18: {
                    try {
                        qb.a(this.field_l, 0, this.field_j, 32, 32);
                        this.b((byte) 41);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4_int = 0;
                        var5 = param0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var4_int ^ -1) <= -9) {
                            statePc = 31;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6 = this.field_g[var4_int];
                        param1[var5] = (byte)(int)(var6 >>> -2108129288);
                        param1[var5 - -1] = (byte)(int)(var6 >>> 760747760);
                        param1[var5 - -2] = (byte)(int)(var6 >>> 680189352);
                        param1[var5 - -3] = (byte)(int)(var6 >>> -2036045728);
                        param1[4 + var5] = (byte)(int)(var6 >>> -373204968);
                        param1[var5 + 5] = (byte)(int)(var6 >>> -323347376);
                        param1[var5 + 6] = (byte)(int)(var6 >>> 1610654920);
                        param1[var5 + 7] = (byte)(int)var6;
                        var5 += 8;
                        var4_int++;
                        if (var8 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var8 == 0) {
                            statePc = 20;
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
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_29_0 = (RuntimeException) (var4);
                    stackIn_27_0 = stackIn_29_0;
                    stackIn_29_1 = new StringBuilder().append("ca.B(").append(param0).append(',');
                    stackIn_27_1 = stackIn_29_1;
                    if (param1 == null) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw aa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ')');
                }
                case 31: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_a = null;
              field_m = null;
              field_k = null;
              if (param0 == 64) {
                break L1;
              } else {
                ca.a(59);
                break L1;
              }
            }
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "ca.A(" + param0 + ')');
        }
    }

    ca() {
        this.field_i = 0;
        this.field_g = new long[8];
        this.field_c = new long[8];
        this.field_d = new long[8];
        this.field_h = 0;
        this.field_l = new byte[32];
        this.field_b = new long[8];
        this.field_j = new byte[64];
        this.field_e = new long[8];
    }

    static {
        field_m = "Log in";
        field_f = null;
        field_k = "Invite players";
    }
}
