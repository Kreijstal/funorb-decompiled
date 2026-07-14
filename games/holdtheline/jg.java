/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends hl {
    int field_i;
    static String field_q;
    int[][] field_p;
    boolean field_j;
    long[][] field_k;
    static go[] field_o;
    int field_n;
    String[][] field_m;
    int field_l;

    public static void a(int param0) {
        try {
            field_o = null;
            field_q = null;
            if (param0 > -66) {
                field_q = null;
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "jg.A(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, hj param2, boolean param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = (param5 - param1 << 736941000) / param2.field_o;
                        var7 = (param1 << 1987805000) + var6_int * param2.field_u;
                        param0 = param0 + param2.field_x;
                        param4 = param4 + param2.field_u;
                        var8 = param4 - -(param0 * tc.field_j);
                        var9 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param3) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        jg.a(13);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10 = param2.field_y;
                        var11 = param2.field_s;
                        var12 = -var11 + tc.field_j;
                        if (param0 >= tc.field_a) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var14 = -param0 + tc.field_a;
                        var9 = var9 + var14 * var11;
                        var8 = var8 + tc.field_j * var14;
                        var10 = var10 - var14;
                        param0 = tc.field_a;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var13 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param4 < tc.field_d) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var14 = -param4 + tc.field_d;
                        var11 = var11 - var14;
                        var12 = var12 + var14;
                        var8 = var8 + var14;
                        var7 = var7 + var14 * var6_int;
                        var13 = var13 + var14;
                        var9 = var9 + var14;
                        param4 = tc.field_d;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((tc.field_i ^ -1) <= (var10 + param0 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var10 = var10 - (var10 + (param0 + -tc.field_i));
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var11 + param4 > tc.field_e) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var14 = param4 + (var11 - tc.field_e);
                        var13 = var13 + var14;
                        var11 = var11 - var14;
                        var12 = var12 + var14;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (0 >= var11) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (0 < var10) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return;
                }
                case 24: {
                    try {
                        param0 = -var10;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-1 >= (param0 ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var14 = var7;
                        if (var20 != 0) {
                            statePc = 56;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        param4 = -var11;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param4 >= 0) {
                            statePc = 47;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var15 = var14 >> 1719775784;
                        var16 = -var15 + 256;
                        var14 = var14 + var6_int;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = -1;
                        stackOut_30_1 = var15 ^ -1;
                        stackIn_48_0 = stackOut_30_0;
                        stackIn_48_1 = stackOut_30_1;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        if (var20 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 < stackIn_31_1) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9++;
                        var8++;
                        if (var20 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9++;
                        var17 = param2.field_z[var9];
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var17 ^ -1) != -1) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (-256 <= (var15 ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        tc.field_b[var8] = var17;
                        if (var20 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var18 = tc.field_b[var8];
                        var19 = 16711935 & var16 * (16711935 & var18) - -((var17 & 16711935) * var15) >> 1658284680;
                        tc.field_b[var8] = var19 - -pk.a(65280, pk.a(var18, 65280) * var16 - -(pk.a(65280, var17) * var15) >> 1066756584);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var8++;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        param4++;
                        if (var20 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var9 = var9 + var13;
                        stackOut_47_0 = var8;
                        stackOut_47_1 = var12;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var8 = stackIn_48_0 + stackIn_48_1;
                        param0++;
                        if (var20 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var6 = (RuntimeException) (Object) caughtException;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    try {
                        stackOut_51_0 = (RuntimeException) var6;
                        stackOut_51_1 = new StringBuilder().append("jg.D(").append(param0).append(44).append(param1).append(44);
                        stackIn_54_0 = stackOut_51_0;
                        stackIn_54_1 = stackOut_51_1;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        if (param2 == null) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                        stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                        stackOut_52_2 = "{...}";
                        stackIn_55_0 = stackOut_52_0;
                        stackIn_55_1 = stackOut_52_1;
                        stackIn_55_2 = stackOut_52_2;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 54: {
                    stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
                    stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
                    stackOut_54_2 = "null";
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    stackIn_55_2 = stackOut_54_2;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    throw kk.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
                }
                case 56: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(rd param0, ei param1, byte param2) {
        RuntimeException var3 = null;
        qm var3_ref = null;
        qm var4 = null;
        qm var5 = null;
        uh var6 = null;
        uh var7 = null;
        vj var8 = null;
        vj var9 = null;
        in var10 = null;
        in var11 = null;
        float var12 = 0.0f;
        int var13 = 0;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        vj var17 = null;
        vj var17_ref = null;
        vj var18 = null;
        int var19 = 0;
        int var20 = 0;
        lb var21 = null;
        gj var21_ref = null;
        float var22 = 0.0f;
        float var23 = 0.0f;
        int var23_int = 0;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        int var27 = 0;
        int var28 = 0;
        int stackIn_16_0 = 0;
        boolean stackIn_36_0 = false;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int stackOut_15_0 = 0;
        boolean stackOut_35_0 = false;
        boolean stackOut_43_0 = false;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var28 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = o.a((byte) -115);
                        var7 = o.a((byte) -113);
                        var8 = (vj) param1.field_b[-1 + param1.field_e];
                        var9 = (vj) param1.field_b[0];
                        var5 = var8.a(0);
                        var10 = wb.a(var8, var9, 3251);
                        var11 = new in(var10);
                        var10.a((float)param0.field_c, -1);
                        var11.a((float)param0.field_h, -1);
                        var3_ref = new qm(var5);
                        var3_ref.a(var10, (byte) 98);
                        var4 = new qm(var5);
                        var4.a(var11, -13201);
                        var6.a(var3_ref.field_h, (byte) 64);
                        var6.a(var3_ref.field_f, (byte) 127);
                        var7.a(var4.field_h, (byte) 71);
                        var7.a(var4.field_f, (byte) 68);
                        var12 = fb.a(param1, (byte) 115);
                        var13 = (int)(var12 / param0.field_k) + 1;
                        var14 = var12 / (float)(var13 * param0.field_i);
                        var15 = var14;
                        var17 = (vj) param1.field_b[param1.field_e - 1];
                        var18 = (vj) param1.field_b[0];
                        var19 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2 >= 14) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        field_o = null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var20 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var20 ^ -1) <= (param1.field_e ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var17_ref = var18;
                        var18 = (vj) param1.field_b[(1 + var20) % param1.field_e];
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var28 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var17_ref instanceof lb) {
                            statePc = 32;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var21_ref = (gj) (Object) var17_ref;
                        var22 = var21_ref.f(50);
                        var23_int = (int)(var22 / 5.0f) - -1;
                        var24 = var22 / (float)var23_int;
                        var25 = (var21_ref.field_w - var21_ref.field_r) / (float)var23_int;
                        var26 = var25 + var21_ref.field_r;
                        var27 = 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var23_int < var27) {
                            statePc = 31;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = (var21_ref.field_r < var21_ref.field_w ? -1 : (var21_ref.field_r == var21_ref.field_w ? 0 : 1));
                        stackIn_44_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var28 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 > 0) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3_ref = new qm((int)((double)var21_ref.field_t.field_h + (double)(-param0.field_h + var21_ref.field_u) * Math.cos((double)var26)), (int)((double)var21_ref.field_t.field_f - (double)(-param0.field_h + var21_ref.field_u) * Math.sin((double)var26)));
                        var4 = new qm((int)((double)var21_ref.field_t.field_h + (double)(var21_ref.field_u + param0.field_c) * Math.cos((double)var26)), (int)((double)var21_ref.field_t.field_f - (double)(var21_ref.field_u + param0.field_c) * Math.sin((double)var26)));
                        if (var28 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var3_ref = new qm((int)((double)var21_ref.field_t.field_h + (double)(param0.field_h + var21_ref.field_u) * Math.cos((double)var26)), (int)((double)var21_ref.field_t.field_f - (double)(param0.field_h + var21_ref.field_u) * Math.sin((double)var26)));
                        var4 = new qm((int)((double)var21_ref.field_t.field_h + (double)(-param0.field_c + var21_ref.field_u) * Math.cos((double)var26)), (int)((double)var21_ref.field_t.field_f - (double)(var21_ref.field_u - param0.field_c) * Math.sin((double)var26)));
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var26 = var26 + var25;
                        var6.a(var3_ref.field_h, (byte) 74);
                        var6.a(var3_ref.field_f, (byte) 94);
                        var7.a(var4.field_h, (byte) 106);
                        var15 = var15 - var24;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7.a(var4.field_f, (byte) 104);
                        if (var15 > 0.0f) {
                            statePc = 30;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!var21_ref.field_p) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param0.a(var6.a(-97), var19, (byte) -79, var7.a(-90));
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6 = o.a((byte) 78);
                        var15 = var15 + var14;
                        var19++;
                        var7 = o.a((byte) 55);
                        var6.a(var3_ref.field_h, (byte) 71);
                        var6.a(var3_ref.field_f, (byte) 69);
                        var7.a(var4.field_h, (byte) 101);
                        var7.a(var4.field_f, (byte) 72);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var27++;
                        if (var28 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var5 = var21_ref.a(0);
                        var10 = wb.a((vj) (Object) var21_ref, var18, 3251);
                        var11 = new in(var10);
                        var10.a((float)param0.field_c, -1);
                        var11.a((float)param0.field_h, -1);
                        var3_ref = new qm(var5);
                        var3_ref.a(var10, (byte) 117);
                        var4 = new qm(var5);
                        var4.a(var11, -13201);
                        var6.a(var3_ref.field_h, (byte) 103);
                        var6.a(var3_ref.field_f, (byte) 75);
                        var7.a(var4.field_h, (byte) 93);
                        var7.a(var4.field_f, (byte) 65);
                        if (var28 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var21 = (lb) (Object) var17_ref;
                        var10 = var21.g(-1).a((byte) 77);
                        var11 = new in(var10);
                        var10.a((float)param0.field_c, -1);
                        var11.a((float)param0.field_h, -1);
                        var22 = var14 / var21.f(50);
                        var16 = var15 / var21.f(50);
                        var23 = var21.f(50);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var23 <= var15) {
                            statePc = 42;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var5 = var21.a(false, var16);
                        var3_ref = new qm(var5);
                        var3_ref.a(var10, (byte) 89);
                        var4 = new qm(var5);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var4.a(var11, -13201);
                        var6.a(var3_ref.field_h, (byte) 100);
                        var6.a(var3_ref.field_f, (byte) 63);
                        var7.a(var4.field_h, (byte) 106);
                        var7.a(var4.field_f, (byte) 89);
                        stackOut_35_0 = var17_ref.field_p;
                        stackIn_44_0 = stackOut_35_0 ? 1 : 0;
                        stackIn_36_0 = stackOut_35_0;
                        if (var28 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        param0.a(var6.a(-77), var19, (byte) -65, var7.a(-60));
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var19++;
                        var6 = o.a((byte) -112);
                        var7 = o.a((byte) -125);
                        var6.a(var3_ref.field_h, (byte) 97);
                        var6.a(var3_ref.field_f, (byte) 82);
                        var7.a(var4.field_h, (byte) 71);
                        var23 = var23 - var15;
                        var16 = var16 + var22;
                        var7.a(var4.field_f, (byte) 109);
                        var15 = var14;
                        if (var28 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var5 = var21.field_s;
                        var10 = wb.a((vj) (Object) var21, var18, 3251);
                        var11 = new in(var10);
                        var10.a((float)param0.field_c, -1);
                        var11.a((float)param0.field_h, -1);
                        var3_ref = new qm(var5);
                        var3_ref.a(var10, (byte) 126);
                        var4 = new qm(var5);
                        var4.a(var11, -13201);
                        var6.a(var3_ref.field_h, (byte) 95);
                        var6.a(var3_ref.field_f, (byte) 92);
                        var7.a(var4.field_h, (byte) 71);
                        var15 = var15 - var23;
                        var7.a(var4.field_f, (byte) 106);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = var17_ref.field_p;
                        stackIn_44_0 = stackOut_43_0 ? 1 : 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        param0.a(var6.a(-88), var19, (byte) -127, var7.a(-57));
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var6 = o.a((byte) 68);
                        var7 = o.a((byte) -109);
                        var6.a(var3_ref.field_h, (byte) 68);
                        var6.a(var3_ref.field_f, (byte) 75);
                        var7.a(var4.field_h, (byte) 82);
                        var7.a(var4.field_f, (byte) 115);
                        var20++;
                        if (var28 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    try {
                        stackOut_50_0 = (RuntimeException) var3;
                        stackOut_50_1 = new StringBuilder().append("jg.B(");
                        stackIn_53_0 = stackOut_50_0;
                        stackIn_53_1 = stackOut_50_1;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        if (param0 == null) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                        stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                        stackOut_51_2 = "{...}";
                        stackIn_54_0 = stackOut_51_0;
                        stackIn_54_1 = stackOut_51_1;
                        stackIn_54_2 = stackOut_51_2;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 53: {
                    stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                    stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                    stackOut_53_2 = "null";
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    stackIn_54_2 = stackOut_53_2;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    try {
                        stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
                        stackOut_54_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(44);
                        stackIn_57_0 = stackOut_54_0;
                        stackIn_57_1 = stackOut_54_1;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        if (param1 == null) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
                        stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
                        stackOut_55_2 = "{...}";
                        stackIn_58_0 = stackOut_55_0;
                        stackIn_58_1 = stackOut_55_1;
                        stackIn_58_2 = stackOut_55_2;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 57: {
                    stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
                    stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
                    stackOut_57_2 = "null";
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    stackIn_58_2 = stackOut_57_2;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    throw kk.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + 44 + param2 + 41);
                }
                case 59: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = 0;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if ((7 & param1 ^ -1) != param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2_int = -(param1 & 7) + 8;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = param1 + var2_int;
                        stackOut_5_0 = var3;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw kk.a((Throwable) (Object) var2, "jg.C(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    jg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "EXCLUSIVE";
    }
}
