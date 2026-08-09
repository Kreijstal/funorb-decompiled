/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static String field_d;
    static String[] field_c;
    static int field_b;
    static th field_a;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        int var1 = -111 % ((28 - param0) / 57);
        field_d = null;
    }

    final static jb[] a(byte[] param0, int param1) {
        byte[] dupTemp$0 = null;
        int stackIn_10_0 = 0;
        int stackIn_30_0 = 0;
        jb[] stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        jb[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7_ref_byte__ = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        wf var12 = null;
        byte[] var13 = null;
        wf var14 = null;
        int[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var24 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var12 = new wf(param0);
                        var14 = var12;
                        var3 = new jb[var14.d(true)];
                        var19 = new int[256];
                        var15 = var19;
                        var4 = var15;
                        var5 = 0;
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
                        if (var19.length <= var5) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4[var5] = var12.a(98);
                        var5++;
                        if (var11 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var11 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
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
                        var5 = -1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = 0;
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
                        if (var3.length <= var6) {
                            statePc = 29;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var3[var6] = new jb(640, 480, 256);
                        var3[var6].field_j = var4;
                        var21 = var3[var6].field_i;
                        var17 = var21;
                        var13 = var17;
                        var20 = var13;
                        var16 = var20;
                        var7_ref_byte__ = var16;
                        var8 = var14.d(true);
                        var10 = var8;
                        stackIn_30_0 = var10;
                        stackIn_10_0 = stackIn_30_0;
                        if (var11 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var10 ^ -1) == -2) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var10 ^ -1) != -3) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var11 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (3 == var10) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var5 = var6;
                        var14.a(82, 307200, 0, var20);
                        if (var11 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var14.a(122, 307200, 0, var21);
                        var5 = var6;
                        var3[var6].field_i = ui.a(480, var20, -29165).field_j;
                        if (var11 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var24 = var3[var5].field_i;
                        var14.a(109, 307200, 0, var20);
                        if ((var8 ^ -1) == -4) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        dupTemp$0 = ui.a(480, var20, -29165).field_j;
                        var7_ref_byte__ = dupTemp$0;
                        var3[var6].field_i = dupTemp$0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var10 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param0.length <= var10) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7_ref_byte__[var10] = (byte)(-param0[var10] + var24[var10]);
                        var10++;
                        if (var11 != 0) {
                            statePc = 28;
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
                        if (var11 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var6++;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = 112 % ((param1 - -19) / 47);
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
                        var7 = stackIn_30_0;
                        stackIn_31_0 = (jb[]) (var3);
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
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_34_0 = (RuntimeException) (var2);
                    stackIn_33_0 = stackIn_34_0;
                    stackIn_34_1 = new StringBuilder().append("ig.A(");
                    stackIn_33_1 = stackIn_34_1;
                    if (param0 == null) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_35_2 = "{...}";
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_35_2 = "null";
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    throw ld.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_d = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
