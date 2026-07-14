/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends ji {
    static cr field_z;
    static int field_y;

    final int[][] b(int param0, int param1) {
        RuntimeException var3 = null;
        int[][] var3_array = null;
        int[] var4 = null;
        int[][] var5 = null;
        int[][] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[][] stackIn_26_0 = null;
        int[][] stackOut_25_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -3780) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_y = 109;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_array = ((gj) this).field_v.a(param1, param0 ^ 3778);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((gj) this).field_v.field_c) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = ((gj) this).a(2, -1, param1);
                        var5 = ((gj) this).c(0, 3, param1);
                        var6 = ((gj) this).c(1, 3, param1);
                        var7 = var3_array[0];
                        var8 = var3_array[1];
                        var9 = var3_array[2];
                        var10 = var5[0];
                        var11 = var5[1];
                        var12 = var5[2];
                        var13 = var6[0];
                        var14 = var6[1];
                        var15 = var6[2];
                        var16 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var16 ^ -1) <= (we.field_M ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var17 = var4[var16];
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var17 ^ -1) != -4097) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                        if (var19 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-1 == (var17 ^ -1)) {
                            statePc = 21;
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
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var18 = -var17 + 4096;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7[var16] = var13[var16] * var18 + var17 * var10[var16] >> -251472660;
                        var8[var16] = var14[var16] * var18 + var17 * var11[var16] >> -1824778068;
                        var9[var16] = var15[var16] * var18 + var17 * var12[var16] >> -452825556;
                        if (var19 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var16++;
                        if (var19 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = (int[][]) var3_array;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0;
                }
                case 27: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw wn.a((Throwable) (Object) var3, "gj.M(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public gj() {
        super(3, false);
    }

    final int[] c(int param0, int param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int[] stackIn_31_0 = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int[] stackOut_30_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_array = ((gj) this).field_x.a(param0, (byte) -59);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((gj) this).field_x.field_i) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = ((gj) this).a(0, -1, param0);
                        var5 = ((gj) this).a(1, -1, param0);
                        var6 = ((gj) this).a(2, -1, param0);
                        var7 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((we.field_M ^ -1) >= (var7 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = var6[var7];
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = -4097;
                        stackOut_8_1 = var8 ^ -1;
                        stackIn_26_0 = stackOut_8_0;
                        stackIn_26_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var9 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 == stackIn_9_1) {
                            statePc = 21;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var8 == 0) {
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3_array[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 1297401100;
                        if (var9 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var3_array[var7] = var5[var7];
                        if (var9 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3_array[var7] = var4[var7];
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7++;
                        if (var9 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = param1;
                        stackOut_25_1 = 91;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 >= stackIn_26_1) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        int[] discarded$1 = ((gj) this).c(-97, -12);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = (int[]) var3_array;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0;
                }
                case 32: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw wn.a((Throwable) (Object) var3, "gj.D(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, boolean param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        am.field_n = param3;
                        vl.field_c = 0;
                        ue.field_O = param2;
                        if (al.a(am.field_n, (byte) -94)) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((am.field_n ^ -1) == -14) {
                            statePc = 11;
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
                        stackOut_5_0 = -20;
                        stackIn_6_0 = stackOut_5_0;
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
                        if (stackIn_6_0 == (am.field_n ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4_int = 1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((am.field_n ^ -1) == -1) {
                            statePc = 37;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = -22;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 == (am.field_n ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = am.field_n;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((stackIn_18_0 ^ -1) == -2) {
                            statePc = 37;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = 2;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 == am.field_n) {
                            statePc = 37;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = -23;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 == (am.field_n ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = 3;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 == am.field_n) {
                            statePc = 37;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (am.field_n == 4) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var4_int = vp.a((byte) 76, am.field_n) - 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((am.field_n ^ -1) != -8) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var4_int = 1;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        fh.field_y[am.field_n].a(-121, param1, var4_int);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var4_int = 72 % ((-10 - param0) / 41);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw wn.a((Throwable) (Object) var4, "gj.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 43: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        cr var5_ref = null;
        cr var6 = null;
        cr var7 = null;
        cr var8 = null;
        int var9 = 0;
        String var9_ref = null;
        String var10_ref = null;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int[] var13_array = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        nj var17 = null;
        bs var18 = null;
        int var18_int = 0;
        int var19 = 0;
        boolean stackIn_22_0 = false;
        cr stackIn_30_0 = null;
        cr stackIn_31_0 = null;
        long stackIn_31_1 = 0L;
        cr stackIn_32_0 = null;
        cr stackIn_34_0 = null;
        cr stackIn_36_0 = null;
        cr stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_100_0 = 0;
        int[][] stackIn_110_0 = null;
        int[][] stackIn_114_0 = null;
        Object stackIn_118_0 = null;
        boolean[][] stackIn_128_0 = null;
        boolean[][] stackIn_132_0 = null;
        boolean stackIn_174_0 = false;
        int stackIn_213_0 = 0;
        boolean[] stackIn_215_0 = null;
        boolean stackIn_241_0 = false;
        int stackIn_250_0 = 0;
        cr stackIn_267_0 = null;
        int stackIn_267_1 = 0;
        cr stackIn_268_0 = null;
        int stackIn_268_1 = 0;
        boolean stackIn_268_2 = false;
        cr stackIn_269_0 = null;
        int stackIn_269_1 = 0;
        cr stackIn_271_0 = null;
        int stackIn_271_1 = 0;
        cr stackIn_272_0 = null;
        int stackIn_272_1 = 0;
        boolean stackIn_272_2 = false;
        cr stackIn_273_0 = null;
        int stackIn_273_1 = 0;
        cr stackIn_275_0 = null;
        int stackIn_275_1 = 0;
        cr stackIn_277_0 = null;
        int stackIn_277_1 = 0;
        cr stackIn_278_0 = null;
        int stackIn_278_1 = 0;
        int stackIn_278_2 = 0;
        cr stackIn_279_0 = null;
        int stackIn_279_1 = 0;
        cr stackIn_280_0 = null;
        int stackIn_280_1 = 0;
        boolean stackIn_280_2 = false;
        cr stackIn_281_0 = null;
        int stackIn_281_1 = 0;
        cr stackIn_283_0 = null;
        int stackIn_283_1 = 0;
        cr stackIn_284_0 = null;
        int stackIn_284_1 = 0;
        boolean stackIn_284_2 = false;
        cr stackIn_285_0 = null;
        int stackIn_285_1 = 0;
        cr stackIn_287_0 = null;
        int stackIn_287_1 = 0;
        cr stackIn_289_0 = null;
        int stackIn_289_1 = 0;
        cr stackIn_290_0 = null;
        int stackIn_290_1 = 0;
        int stackIn_290_2 = 0;
        cr stackIn_291_0 = null;
        int stackIn_291_1 = 0;
        cr stackIn_292_0 = null;
        int stackIn_292_1 = 0;
        boolean stackIn_292_2 = false;
        cr stackIn_293_0 = null;
        int stackIn_293_1 = 0;
        cr stackIn_295_0 = null;
        int stackIn_295_1 = 0;
        cr stackIn_296_0 = null;
        int stackIn_296_1 = 0;
        boolean stackIn_296_2 = false;
        cr stackIn_297_0 = null;
        int stackIn_297_1 = 0;
        cr stackIn_299_0 = null;
        int stackIn_299_1 = 0;
        cr stackIn_301_0 = null;
        int stackIn_301_1 = 0;
        cr stackIn_302_0 = null;
        int stackIn_302_1 = 0;
        int stackIn_302_2 = 0;
        Throwable caughtException = null;
        boolean stackOut_21_0 = false;
        cr stackOut_29_0 = null;
        cr stackOut_30_0 = null;
        long stackOut_30_1 = 0L;
        cr stackOut_31_0 = null;
        cr stackOut_32_0 = null;
        cr stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        cr stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_99_0 = 0;
        int[][] stackOut_109_0 = null;
        int[][] stackOut_113_0 = null;
        Object stackOut_117_0 = null;
        boolean[][] stackOut_127_0 = null;
        boolean[][] stackOut_131_0 = null;
        boolean stackOut_173_0 = false;
        int stackOut_212_0 = 0;
        boolean[] stackOut_214_0 = null;
        boolean stackOut_240_0 = false;
        int stackOut_249_0 = 0;
        cr stackOut_266_0 = null;
        int stackOut_266_1 = 0;
        cr stackOut_267_0 = null;
        int stackOut_267_1 = 0;
        boolean stackOut_267_2 = false;
        cr stackOut_268_0 = null;
        int stackOut_268_1 = 0;
        cr stackOut_269_0 = null;
        int stackOut_269_1 = 0;
        cr stackOut_271_0 = null;
        int stackOut_271_1 = 0;
        boolean stackOut_271_2 = false;
        cr stackOut_272_0 = null;
        int stackOut_272_1 = 0;
        cr stackOut_273_0 = null;
        int stackOut_273_1 = 0;
        cr stackOut_275_0 = null;
        int stackOut_275_1 = 0;
        int stackOut_275_2 = 0;
        cr stackOut_277_0 = null;
        int stackOut_277_1 = 0;
        int stackOut_277_2 = 0;
        cr stackOut_278_0 = null;
        int stackOut_278_1 = 0;
        cr stackOut_279_0 = null;
        int stackOut_279_1 = 0;
        boolean stackOut_279_2 = false;
        cr stackOut_280_0 = null;
        int stackOut_280_1 = 0;
        cr stackOut_281_0 = null;
        int stackOut_281_1 = 0;
        cr stackOut_283_0 = null;
        int stackOut_283_1 = 0;
        boolean stackOut_283_2 = false;
        cr stackOut_284_0 = null;
        int stackOut_284_1 = 0;
        cr stackOut_285_0 = null;
        int stackOut_285_1 = 0;
        cr stackOut_287_0 = null;
        int stackOut_287_1 = 0;
        int stackOut_287_2 = 0;
        cr stackOut_289_0 = null;
        int stackOut_289_1 = 0;
        int stackOut_289_2 = 0;
        cr stackOut_290_0 = null;
        int stackOut_290_1 = 0;
        cr stackOut_291_0 = null;
        int stackOut_291_1 = 0;
        boolean stackOut_291_2 = false;
        cr stackOut_292_0 = null;
        int stackOut_292_1 = 0;
        cr stackOut_293_0 = null;
        int stackOut_293_1 = 0;
        cr stackOut_295_0 = null;
        int stackOut_295_1 = 0;
        boolean stackOut_295_2 = false;
        cr stackOut_296_0 = null;
        int stackOut_296_1 = 0;
        cr stackOut_297_0 = null;
        int stackOut_297_1 = 0;
        cr stackOut_299_0 = null;
        int stackOut_299_1 = 0;
        int stackOut_299_2 = 0;
        cr stackOut_301_0 = null;
        int stackOut_301_1 = 0;
        int stackOut_301_2 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    hq.b(mp.field_b, -127);
                    if (null != gd.field_j) {
                        statePc = 4;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ne.field_G.field_lb = true;
                    var5_ref = fo.field_f;
                    fo.field_f.field_db = 0;
                    var5_ref.field_Fb = 0;
                    hd.field_g.field_db = 0;
                    var6 = hd.field_g;
                    var6.field_Fb = 0;
                    kk.field_f.field_db = 0;
                    var7 = kk.field_f;
                    var7.field_Fb = 0;
                    if (cn.b(false)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var9_ref = gd.field_j.field_Nb;
                    ud.field_x.field_S = Vertigo2.a(new String[1], ie.field_Rb, 20).toUpperCase();
                    kk.field_f.a(88, lb.field_c.field_Fb, 40, -40 + lb.field_c.field_db, 0);
                    kk.field_f.field_S = Vertigo2.a(new String[1], od.field_Ob, 78);
                    var8 = kk.field_f;
                    if (var19 == 0) {
                        statePc = 258;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ud.field_x.field_S = fq.field_a.toUpperCase();
                    var9 = (2 + lb.field_c.field_Fb) / 2;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    fo.field_f.a(93, var9 - 2, 40, lb.field_c.field_db - 40, 0);
                    if ((gd.field_j.field_uc ^ -1) >= (gd.field_j.field_Qb ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    fo.field_f.field_S = eh.field_g.toUpperCase();
                    fo.field_f.field_lb = true;
                    if (var19 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    fo.field_f.field_S = fg.field_db.toUpperCase();
                    fo.field_f.field_lb = false;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    fo.field_f.field_Bb = fb.field_u.field_Bb;
                    if (kk.field_j <= 0) {
                        statePc = 29;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (1 != kk.field_j) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10_ref = e.field_l;
                    if (var19 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var10_ref = Vertigo2.a(new String[1], uo.field_c, 111);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (0 != (lo.field_d & 16)) {
                        statePc = 28;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackOut_21_0 = im.field_g;
                    stackIn_22_0 = stackOut_21_0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (!stackIn_22_0) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    fo.field_f.field_Bb = fb.field_u.field_Q;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    fo.field_f.field_S = fo.field_f.field_S + "<br>" + var10_ref;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    hd.field_g.a(82, -var9 + lb.field_c.field_Fb, 40, lb.field_c.field_db - 40, var9);
                    hd.field_g.field_S = gm.field_a.toUpperCase();
                    stackOut_29_0 = hd.field_g;
                    stackIn_36_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (!param0) {
                        statePc = 36;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = (cr) (Object) stackIn_30_0;
                    stackOut_30_1 = -1L;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    stackOut_31_0 = (cr) (Object) stackIn_31_0;
                    stackIn_36_0 = stackOut_31_0;
                    stackIn_32_0 = stackOut_31_0;
                    if (stackIn_31_1 != (r.field_h ^ -1L)) {
                        statePc = 36;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackOut_32_0 = (cr) (Object) stackIn_32_0;
                    stackIn_34_0 = stackOut_32_0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    stackOut_34_0 = (cr) (Object) stackIn_34_0;
                    stackOut_34_1 = 1;
                    stackIn_37_0 = stackOut_34_0;
                    stackIn_37_1 = stackOut_34_1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackOut_36_0 = (cr) (Object) stackIn_36_0;
                    stackOut_36_1 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_37_0.field_lb = stackIn_37_1 != 0;
                    var8 = hd.field_g;
                    var10 = 2;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (gr.field_W == null) {
                        statePc = 105;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (null == e.field_c) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    e.field_c = new byte[ol.field_A];
                    mn.field_t = new boolean[ol.field_A];
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var11_int = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if ((ol.field_A ^ -1) >= (var11_int ^ -1)) {
                        statePc = 51;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    mn.field_t[var11_int] = false;
                    var11_int++;
                    if (var19 != 0) {
                        statePc = 52;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var19 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var10 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (2 <= var10) {
                        statePc = 99;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var11_int = 0;
                    stackOut_53_0 = 0;
                    stackIn_100_0 = stackOut_53_0;
                    stackIn_54_0 = stackOut_53_0;
                    if (var19 != 0) {
                        statePc = 100;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var12 = stackIn_54_0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    stackOut_55_0 = gr.field_W.length;
                    stackOut_55_1 = var12;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (stackIn_56_0 <= stackIn_56_1) {
                        statePc = 91;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var13_array = gr.field_W[var12];
                    stackOut_57_0 = 0;
                    stackIn_92_0 = stackOut_57_0;
                    stackIn_58_0 = stackOut_57_0;
                    if (var19 != 0) {
                        statePc = 92;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var14_int = stackIn_58_0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if ((var13_array.length ^ -1) >= (var14_int ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var15 = var13_array[var14_int];
                    var16 = var13_array[var14_int + 1];
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    stackOut_61_0 = var15;
                    stackOut_61_1 = -1;
                    stackIn_84_0 = stackOut_61_0;
                    stackIn_84_1 = stackOut_61_1;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    if (var19 != 0) {
                        statePc = 84;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (stackIn_62_0 == stackIn_62_1) {
                        statePc = 70;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if ((255 & gd.field_j.field_fc[var15]) != var16) {
                        statePc = 90;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (-1 == (var10 ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackOut_71_0 = gd.field_j.field_Qb;
                    stackIn_74_0 = stackOut_71_0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackOut_73_0 = gd.field_j.field_uc;
                    stackIn_74_0 = stackOut_73_0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    var17_int = stackIn_74_0;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (var16 == var17_int) {
                        statePc = 79;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var19 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var14_int += 2;
                    if (var19 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var11_int = 1;
                    var14_int = -1;
                    var15 = 0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    stackOut_83_0 = var15;
                    stackOut_83_1 = var13_array.length;
                    stackIn_84_0 = stackOut_83_0;
                    stackIn_84_1 = stackOut_83_1;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (stackIn_84_0 >= stackIn_84_1) {
                        statePc = 89;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var16 = var13_array[var15];
                    stackOut_85_0 = var16;
                    stackOut_85_1 = var14_int;
                    stackIn_56_0 = stackOut_85_0;
                    stackIn_56_1 = stackOut_85_1;
                    stackIn_86_0 = stackOut_85_0;
                    stackIn_86_1 = stackOut_85_1;
                    if (var19 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (stackIn_86_0 <= stackIn_86_1) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var14_int = var16;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var15 += 2;
                    if (var19 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    mn.field_t[var14_int] = true;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    stackOut_91_0 = var11_int;
                    stackIn_92_0 = stackOut_91_0;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (stackIn_92_0 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (var19 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var10++;
                    if (var19 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    stackOut_99_0 = 2;
                    stackIn_100_0 = stackOut_99_0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (stackIn_100_0 > fn.field_z) {
                        statePc = 105;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (!cr.field_eb[12]) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var10 = 2;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if ((var10 ^ -1) > -3) {
                        statePc = 235;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (sf.field_f != null) {
                        statePc = 123;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    stackOut_109_0 = te.field_D;
                    stackIn_110_0 = stackOut_109_0;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    if (stackIn_110_0 != null) {
                        statePc = 123;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackOut_113_0 = qh.field_e;
                    stackIn_114_0 = stackOut_113_0;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if (stackIn_114_0 != null) {
                        statePc = 123;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    stackOut_117_0 = null;
                    stackIn_118_0 = stackOut_117_0;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (stackIn_118_0 != (Object) (Object) il.field_b) {
                        statePc = 123;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var11_int = 0;
                    var12 = 0;
                    var13_int = 0;
                    var14_int = 0;
                    var15 = 0;
                    var16 = 0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (var16 >= ol.field_A) {
                        statePc = 170;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var17_int = 255 & gd.field_j.field_fc[var16];
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    if (var19 != 0) {
                        statePc = 171;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    stackOut_127_0 = sf.field_f;
                    stackIn_128_0 = stackOut_127_0;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (stackIn_128_0 == null) {
                        statePc = 141;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    stackOut_131_0 = sf.field_f;
                    stackIn_132_0 = stackOut_131_0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if (stackIn_132_0[var16] == null) {
                        statePc = 141;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (sf.field_f[var16][var17_int]) {
                        statePc = 140;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var11_int = 1;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (null == te.field_D) {
                        statePc = 152;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (te.field_D[var16] == null) {
                        statePc = 152;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    var18_int = te.field_D[var16][var17_int];
                    if ((var13_int ^ -1) <= (var18_int ^ -1)) {
                        statePc = 147;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var13_int = var18_int;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (-1 == (var18_int ^ -1)) {
                        statePc = 152;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (vb.field_g) {
                        statePc = 152;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var11_int = 1;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (il.field_b == null) {
                        statePc = 157;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (null == il.field_b[var16]) {
                        statePc = 157;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var15 = var15 | il.field_b[var16][var17_int];
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    if (null == qh.field_e) {
                        statePc = 169;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (null == qh.field_e[var16]) {
                        statePc = 169;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var18_int = qh.field_e[var16][var17_int];
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (var18_int == 0) {
                        statePc = 167;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (vb.field_g) {
                        statePc = 167;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var11_int = 1;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if ((var14_int ^ -1) <= (var18_int ^ -1)) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var14_int = var18_int;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var16 = 0;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    var17 = vd.field_d.field_Nb.field_M;
                    var18 = (bs) (Object) var17.a((byte) 100);
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if (var18 == null) {
                        statePc = 212;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    stackOut_173_0 = var18.k(param3 + 15);
                    stackIn_213_0 = stackOut_173_0 ? 1 : 0;
                    stackIn_174_0 = stackOut_173_0;
                    if (var19 != 0) {
                        statePc = 213;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (!stackIn_174_0) {
                        statePc = 180;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (var19 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (var11_int == 0) {
                        statePc = 188;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (var18.field_Zb) {
                        statePc = 188;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var16 = 1;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if (var19 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if ((var18.field_Rb ^ -1) > (var13_int ^ -1)) {
                        statePc = 193;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var16 = 1;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    if (var19 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if ((var18.field_Mb ^ -1) > (var14_int ^ -1)) {
                        statePc = 200;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var16 = 1;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    if (var19 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if ((var15 & (var18.field_Kb ^ -1) ^ -1) >= -1) {
                        statePc = 207;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var16 = 1;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    if (var19 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (var12 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var18 = (bs) (Object) var17.b(35);
                    if (var19 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    stackOut_212_0 = fn.field_z;
                    stackIn_213_0 = stackOut_212_0;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    if (stackIn_213_0 < 2) {
                        statePc = 221;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    stackOut_214_0 = cr.field_eb;
                    stackIn_215_0 = stackOut_214_0;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    if (stackIn_215_0[12]) {
                        statePc = 220;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var16 = 0;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    if (var16 != 0) {
                        statePc = 224;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 224: {
                    hd.field_g.field_lb = false;
                    if (hd.field_g.field_G) {
                        statePc = 227;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if (el.field_e.field_b.field_Kb == 0) {
                        statePc = 231;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    ko.field_S = Vertigo2.a(new String[1], pb.field_e, param3 ^ -117);
                    if (var19 == 0) {
                        statePc = 234;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    ko.field_S = di.field_y;
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    if (var19 == 0) {
                        statePc = 258;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    hd.field_g.field_lb = false;
                    if (!hd.field_g.field_G) {
                        statePc = 258;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    if ((var13_int ^ -1) <= (ol.field_A ^ -1)) {
                        statePc = 249;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    stackOut_240_0 = mn.field_t[var13_int];
                    stackIn_250_0 = stackOut_240_0 ? 1 : 0;
                    stackIn_241_0 = stackOut_240_0;
                    if (var19 != 0) {
                        statePc = 250;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (stackIn_241_0) {
                        statePc = 245;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 245: {
                    var14 = "<col=A00000>" + md.field_C[var13_int] + "</col>";
                    if (var11 == null) {
                        statePc = 247;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    var12 = 1;
                    var11 = var11 + ", " + var14;
                    if (var19 == 0) {
                        statePc = 248;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var11 = var14;
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    var13_int++;
                    if (var19 == 0) {
                        statePc = 239;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    stackOut_249_0 = -1;
                    stackIn_250_0 = stackOut_249_0;
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    if (stackIn_250_0 != (var10 ^ -1)) {
                        statePc = 254;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    var13 = rn.field_y;
                    if (var12 != 0) {
                        statePc = 253;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var14 = Vertigo2.a(new String[1], fa.field_t, 14);
                    if (var19 == 0) {
                        statePc = 257;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var14 = ia.field_H + var11;
                    statePc = 257;
                    continue stateLoop;
                }
                case 254: {
                    var13 = lo.field_a;
                    if (var12 == 0) {
                        statePc = 256;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var14 = ni.field_e + var11;
                    if (var19 == 0) {
                        statePc = 257;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    var14 = Vertigo2.a(new String[1], eg.field_q, -123);
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    ko.field_S = "<col=A00000>" + var13 + "<br>" + var14;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    if (r.field_h == 0L) {
                        statePc = 265;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    var9 = (int)(r.field_h + -gk.a(param3 + 108));
                    var9 = (var9 + 999) / 1000;
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    if ((var9 ^ -1) > -2) {
                        statePc = 263;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var9 = 1;
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    var8.field_S = Vertigo2.a(new String[1], me.field_a, param3 ^ 89);
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    nb.field_D.field_S = Vertigo2.a(new String[2], nq.field_I, 9);
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    stackOut_266_0 = hk.field_o;
                    stackOut_266_1 = 0;
                    stackIn_277_0 = stackOut_266_0;
                    stackIn_277_1 = stackOut_266_1;
                    stackIn_267_0 = stackOut_266_0;
                    stackIn_267_1 = stackOut_266_1;
                    if (!param4) {
                        statePc = 277;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    stackOut_267_0 = (cr) (Object) stackIn_267_0;
                    stackOut_267_1 = stackIn_267_1;
                    stackOut_267_2 = param2;
                    stackIn_268_0 = stackOut_267_0;
                    stackIn_268_1 = stackOut_267_1;
                    stackIn_268_2 = stackOut_267_2;
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    stackOut_268_0 = (cr) (Object) stackIn_268_0;
                    stackOut_268_1 = stackIn_268_1;
                    stackIn_277_0 = stackOut_268_0;
                    stackIn_277_1 = stackOut_268_1;
                    stackIn_269_0 = stackOut_268_0;
                    stackIn_269_1 = stackOut_268_1;
                    if (stackIn_268_2) {
                        statePc = 277;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    stackOut_269_0 = (cr) (Object) stackIn_269_0;
                    stackOut_269_1 = stackIn_269_1;
                    stackIn_271_0 = stackOut_269_0;
                    stackIn_271_1 = stackOut_269_1;
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    stackOut_271_0 = (cr) (Object) stackIn_271_0;
                    stackOut_271_1 = stackIn_271_1;
                    stackOut_271_2 = im.field_g;
                    stackIn_272_0 = stackOut_271_0;
                    stackIn_272_1 = stackOut_271_1;
                    stackIn_272_2 = stackOut_271_2;
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    stackOut_272_0 = (cr) (Object) stackIn_272_0;
                    stackOut_272_1 = stackIn_272_1;
                    stackIn_277_0 = stackOut_272_0;
                    stackIn_277_1 = stackOut_272_1;
                    stackIn_273_0 = stackOut_272_0;
                    stackIn_273_1 = stackOut_272_1;
                    if (stackIn_272_2) {
                        statePc = 277;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    stackOut_273_0 = (cr) (Object) stackIn_273_0;
                    stackOut_273_1 = stackIn_273_1;
                    stackIn_275_0 = stackOut_273_0;
                    stackIn_275_1 = stackOut_273_1;
                    statePc = 275;
                    continue stateLoop;
                }
                case 275: {
                    stackOut_275_0 = (cr) (Object) stackIn_275_0;
                    stackOut_275_1 = stackIn_275_1;
                    stackOut_275_2 = 1;
                    stackIn_278_0 = stackOut_275_0;
                    stackIn_278_1 = stackOut_275_1;
                    stackIn_278_2 = stackOut_275_2;
                    statePc = 278;
                    continue stateLoop;
                }
                case 277: {
                    stackOut_277_0 = (cr) (Object) stackIn_277_0;
                    stackOut_277_1 = stackIn_277_1;
                    stackOut_277_2 = 0;
                    stackIn_278_0 = stackOut_277_0;
                    stackIn_278_1 = stackOut_277_1;
                    stackIn_278_2 = stackOut_277_2;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    ((cr) (Object) stackIn_278_0).a(stackIn_278_1, stackIn_278_2 != 0);
                    stackOut_278_0 = lb.field_c;
                    stackOut_278_1 = 0;
                    stackIn_289_0 = stackOut_278_0;
                    stackIn_289_1 = stackOut_278_1;
                    stackIn_279_0 = stackOut_278_0;
                    stackIn_279_1 = stackOut_278_1;
                    if (!param4) {
                        statePc = 289;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    stackOut_279_0 = (cr) (Object) stackIn_279_0;
                    stackOut_279_1 = stackIn_279_1;
                    stackOut_279_2 = param2;
                    stackIn_280_0 = stackOut_279_0;
                    stackIn_280_1 = stackOut_279_1;
                    stackIn_280_2 = stackOut_279_2;
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    stackOut_280_0 = (cr) (Object) stackIn_280_0;
                    stackOut_280_1 = stackIn_280_1;
                    stackIn_289_0 = stackOut_280_0;
                    stackIn_289_1 = stackOut_280_1;
                    stackIn_281_0 = stackOut_280_0;
                    stackIn_281_1 = stackOut_280_1;
                    if (stackIn_280_2) {
                        statePc = 289;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    stackOut_281_0 = (cr) (Object) stackIn_281_0;
                    stackOut_281_1 = stackIn_281_1;
                    stackIn_283_0 = stackOut_281_0;
                    stackIn_283_1 = stackOut_281_1;
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    stackOut_283_0 = (cr) (Object) stackIn_283_0;
                    stackOut_283_1 = stackIn_283_1;
                    stackOut_283_2 = im.field_g;
                    stackIn_284_0 = stackOut_283_0;
                    stackIn_284_1 = stackOut_283_1;
                    stackIn_284_2 = stackOut_283_2;
                    statePc = 284;
                    continue stateLoop;
                }
                case 284: {
                    stackOut_284_0 = (cr) (Object) stackIn_284_0;
                    stackOut_284_1 = stackIn_284_1;
                    stackIn_289_0 = stackOut_284_0;
                    stackIn_289_1 = stackOut_284_1;
                    stackIn_285_0 = stackOut_284_0;
                    stackIn_285_1 = stackOut_284_1;
                    if (stackIn_284_2) {
                        statePc = 289;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    stackOut_285_0 = (cr) (Object) stackIn_285_0;
                    stackOut_285_1 = stackIn_285_1;
                    stackIn_287_0 = stackOut_285_0;
                    stackIn_287_1 = stackOut_285_1;
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    stackOut_287_0 = (cr) (Object) stackIn_287_0;
                    stackOut_287_1 = stackIn_287_1;
                    stackOut_287_2 = 1;
                    stackIn_290_0 = stackOut_287_0;
                    stackIn_290_1 = stackOut_287_1;
                    stackIn_290_2 = stackOut_287_2;
                    statePc = 290;
                    continue stateLoop;
                }
                case 289: {
                    stackOut_289_0 = (cr) (Object) stackIn_289_0;
                    stackOut_289_1 = stackIn_289_1;
                    stackOut_289_2 = 0;
                    stackIn_290_0 = stackOut_289_0;
                    stackIn_290_1 = stackOut_289_1;
                    stackIn_290_2 = stackOut_289_2;
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    ((cr) (Object) stackIn_290_0).a(stackIn_290_1, stackIn_290_2 != 0);
                    stackOut_290_0 = wc.field_m;
                    stackOut_290_1 = param3;
                    stackIn_301_0 = stackOut_290_0;
                    stackIn_301_1 = stackOut_290_1;
                    stackIn_291_0 = stackOut_290_0;
                    stackIn_291_1 = stackOut_290_1;
                    if (!param4) {
                        statePc = 301;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    stackOut_291_0 = (cr) (Object) stackIn_291_0;
                    stackOut_291_1 = stackIn_291_1;
                    stackOut_291_2 = param2;
                    stackIn_292_0 = stackOut_291_0;
                    stackIn_292_1 = stackOut_291_1;
                    stackIn_292_2 = stackOut_291_2;
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    stackOut_292_0 = (cr) (Object) stackIn_292_0;
                    stackOut_292_1 = stackIn_292_1;
                    stackIn_301_0 = stackOut_292_0;
                    stackIn_301_1 = stackOut_292_1;
                    stackIn_293_0 = stackOut_292_0;
                    stackIn_293_1 = stackOut_292_1;
                    if (stackIn_292_2) {
                        statePc = 301;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    stackOut_293_0 = (cr) (Object) stackIn_293_0;
                    stackOut_293_1 = stackIn_293_1;
                    stackIn_295_0 = stackOut_293_0;
                    stackIn_295_1 = stackOut_293_1;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    stackOut_295_0 = (cr) (Object) stackIn_295_0;
                    stackOut_295_1 = stackIn_295_1;
                    stackOut_295_2 = im.field_g;
                    stackIn_296_0 = stackOut_295_0;
                    stackIn_296_1 = stackOut_295_1;
                    stackIn_296_2 = stackOut_295_2;
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    stackOut_296_0 = (cr) (Object) stackIn_296_0;
                    stackOut_296_1 = stackIn_296_1;
                    stackIn_301_0 = stackOut_296_0;
                    stackIn_301_1 = stackOut_296_1;
                    stackIn_297_0 = stackOut_296_0;
                    stackIn_297_1 = stackOut_296_1;
                    if (!stackIn_296_2) {
                        statePc = 301;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    stackOut_297_0 = (cr) (Object) stackIn_297_0;
                    stackOut_297_1 = stackIn_297_1;
                    stackIn_299_0 = stackOut_297_0;
                    stackIn_299_1 = stackOut_297_1;
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    stackOut_299_0 = (cr) (Object) stackIn_299_0;
                    stackOut_299_1 = stackIn_299_1;
                    stackOut_299_2 = 1;
                    stackIn_302_0 = stackOut_299_0;
                    stackIn_302_1 = stackOut_299_1;
                    stackIn_302_2 = stackOut_299_2;
                    statePc = 302;
                    continue stateLoop;
                }
                case 301: {
                    stackOut_301_0 = (cr) (Object) stackIn_301_0;
                    stackOut_301_1 = stackIn_301_1;
                    stackOut_301_2 = 0;
                    stackIn_302_0 = stackOut_301_0;
                    stackIn_302_1 = stackOut_301_1;
                    stackIn_302_2 = stackOut_301_2;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    ((cr) (Object) stackIn_302_0).a(stackIn_302_1, stackIn_302_2 != 0);
                    el.field_e.field_b.k(0);
                    if (gd.field_j == null) {
                        statePc = 324;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    if ((ne.field_G.field_tb ^ -1) == -1) {
                        statePc = 309;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    qk.d(gd.field_j.a((byte) -38), param1, 18964);
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    if (hd.field_g.field_tb == 0) {
                        statePc = 313;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    na.field_p = true;
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    if ((fo.field_f.field_tb ^ -1) != -1) {
                        statePc = 316;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 316: {
                    im.field_g = true;
                    statePc = 317;
                    continue stateLoop;
                }
                case 317: {
                    if (Vertigo2.field_M.field_tb != 0) {
                        statePc = 320;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 320: {
                    im.field_g = false;
                    statePc = 321;
                    continue stateLoop;
                }
                case 321: {
                    mg.a(false, param1, false, gd.field_j);
                    statePc = 324;
                    continue stateLoop;
                }
                case 324: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1, ed param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        Object stackOut_1_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = this;
                        stackIn_6_0 = stackOut_1_0;
                        stackIn_2_0 = stackOut_1_0;
                        if (1 != param2.h(-11)) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = this;
                        stackIn_4_0 = stackOut_2_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackOut_4_1 = 1;
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((gj) this).field_o = stackIn_7_1 != 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0 == 110) {
                            statePc = 19;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        int[] discarded$2 = ((gj) this).c(-57, -56);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) var4;
                        stackOut_14_1 = new StringBuilder().append("gj.C(").append(param0).append(44).append(param1).append(44);
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (param2 == null) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "{...}";
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_18_1 = stackOut_15_1;
                        stackIn_18_2 = stackOut_15_2;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 17: {
                    stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                    stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                    stackOut_17_2 = "null";
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw wn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 < -68) {
                break L0;
              } else {
                gj.b((byte) -14);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_z = null;
        }
    }

    static {
    }
}
