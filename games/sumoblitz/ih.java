/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static boolean field_c;
    static mn field_a;
    static String field_b;

    public static void a(byte param0) {
        try {
            field_b = null;
            field_a = null;
            if (param0 <= 11) {
                ih.a(-113);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ih.B(" + param0 + ')');
        }
    }

    final static void a(boolean param0, gk param1, int param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        boolean stackOut_9_0;
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
                    var19 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = mr.a((-param4 + param3) * 3, (byte) -115);
                        var6 = 3 * param4;
                        var7 = -10 + var5_int;
                        aw.C(-114);
                        if (0 >= param1.field_E) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == param1.field_a) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ad.c((byte) 71);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        sv.field_b = 0;
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param1.field_n ^ -1) >= (var8 ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param1.field_A[var8];
                        var10 = param1.field_b[var8];
                        var11 = param1.field_l[var8];
                        stackOut_9_0 = param0;
                        stackIn_52_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var19 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!stackIn_10_0) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var12 = we.field_z[var9];
                        var13 = hp.field_o[var9];
                        var14 = we.field_z[var10] - var12;
                        var15 = we.field_z[var11] - var12;
                        var16 = hp.field_o[var10] - var13;
                        var17 = hp.field_o[var11] + -var13;
                        if ((var14 * var17 - var16 * var15 ^ -1) > -1) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var19 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = gi.field_k[var9];
                        if (-2147483648 != var12) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var19 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var13 = gi.field_k[var10];
                        if (2147483647 != (var13 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var19 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var14 = gi.field_k[var11];
                        if ((var14 ^ -1) != 2147483647) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var19 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var15 = var12 + var13 - (-var14 - -var6);
                        stackIn_32_0 = -1;
                        stackIn_30_0 = stackIn_32_0;
                        stackIn_32_1 = rg.field_C.length;
                        stackIn_30_1 = stackIn_32_1;
                        if (0 > var7) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_33_0 = stackIn_30_0;
                        stackIn_33_1 = stackIn_30_1;
                        stackIn_33_2 = var15 >> var7;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = stackIn_32_0;
                        stackIn_33_1 = stackIn_32_1;
                        stackIn_33_2 = var15 << -var7;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var16 = stackIn_33_0 + (stackIn_33_1 - stackIn_33_2);
                        var17 = rg.field_C[var16];
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var17 >> -2059551676 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var16--;
                        stackIn_43_0 = 0;
                        stackIn_36_0 = stackIn_43_0;
                        stackIn_43_1 = var16;
                        stackIn_36_1 = stackIn_43_1;
                        if (var19 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 > stackIn_36_1) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var17 = rg.field_C[var16];
                        if (var19 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = var16 << 827781412;
                        stackIn_43_1 = -var17;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var18 = stackIn_43_0 - stackIn_43_1;
                        Sumoblitz.field_G[var18] = var8;
                        rg.field_C[var16] = var17 - -1;
                        if ((param1.field_E ^ -1) >= -1) {
                            statePc = 49;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (null == param1.field_a) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        dupTemp$0 = param1.field_a[var8];
                        cv.field_G[dupTemp$0] = cv.field_G[dupTemp$0] + 1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        sv.field_b = sv.field_b + 1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_52_0 = param2;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 == -1) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        field_a = (mn) null;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (0 >= param1.field_E) {
                            statePc = 71;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (param1.field_a == null) {
                            statePc = 71;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((cv.field_G.length ^ -1) >= (var9 ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var10 = cv.field_G[var9];
                        cv.field_G[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var19 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_69_0 = (RuntimeException) (var5);
                    stackIn_67_0 = stackIn_69_0;
                    stackIn_69_1 = new StringBuilder().append("ih.A(").append(param0).append(',');
                    stackIn_67_1 = stackIn_69_1;
                    if (param1 == null) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackIn_70_1 = (StringBuilder) ((Object) stackIn_67_1);
                    stackIn_70_2 = "{...}";
                    statePc = 70;
                    continue stateLoop;
                }
                case 69: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackIn_70_2 = "null";
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    throw qo.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 71: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        try {
            hc.field_f = wt.field_h[2];
            iv.field_i = wt.field_h[1];
            ki.field_f = wt.field_h[0];
            int var1_int = -21 / ((param0 - -59) / 40);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ih.C(" + param0 + ')');
        }
    }

    static {
        field_c = false;
        field_b = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
