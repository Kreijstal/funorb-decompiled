/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ft {
    static il field_c;
    int field_b;
    static boolean field_a;

    public static void a(byte param0) {
        try {
            int var1_int = 62 % ((param0 - 12) / 39);
            field_c = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ft.D(" + param0 + 41);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 < 75) {
                field_c = null;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                param1.getAppletContext().showDocument(sda.a(param1, -1, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "ft.toString()");
        }
    }

    final static void a(an param0, int param1, int[] param2, int[] param3, boolean param4, boolean param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_51_0 = null;
        an stackIn_55_0 = null;
        an stackIn_59_0 = null;
        int[] stackIn_75_0 = null;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_38_0 = null;
        Object stackOut_42_0 = null;
        Object stackOut_46_0 = null;
        Object stackOut_50_0 = null;
        an stackOut_54_0 = null;
        an stackOut_58_0 = null;
        int[] stackOut_74_0 = null;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_80_0 = 0;
        boolean stackOut_80_1 = false;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param3[3] >> 1934635298;
                        var22 = param3[4] >> -2075374558;
                        var23 = param3[5] >> 1251086882;
                        var24 = param3[6] >> -2138636670;
                        var25 = param3[7] >> 1498001762;
                        var26 = param3[8] >> -1735598046;
                        var27 = param3[9] >> -2003742334;
                        var28 = param3[10] >> 1098126402;
                        var12 = var23 * param2[5] + var21 * param2[3] - -(param2[4] * var22) >> 1935767630;
                        var13 = param2[3] * var24 - (-(param2[4] * var25) + -(param2[5] * var26)) >> 1695478830;
                        var29 = param3[11] >> 1042674946;
                        var19 = param2[10] * var25 + var24 * param2[9] - -(param2[11] * var26) >> -1322869106;
                        var14 = var27 * param2[3] - -(param2[4] * var28) - -(var29 * param2[5]) >> 150918478;
                        var18 = var23 * param2[11] + (var22 * param2[10] + var21 * param2[9]) >> 1165201550;
                        var15 = param2[8] * var23 + (param2[6] * var21 + param2[7] * var22) >> 1430796526;
                        var17 = var28 * param2[7] + (var27 * param2[6] - -(param2[8] * var29)) >> 253423150;
                        if (param1 == 1251086882) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var20 = param2[11] * var29 + param2[10] * var28 + var27 * param2[9] >> -2103803986;
                        var16 = var26 * param2[8] + param2[6] * var24 - -(param2[7] * var25) >> -1108782258;
                        var21 = param2[0] + -param3[0];
                        var22 = -param3[1] + param2[1];
                        var23 = -param3[2] + param2[2];
                        var9 = param3[5] * var23 + (param3[3] * var21 - -(param3[4] * var22)) >> -hma.field_a + 16;
                        var10 = param3[8] * var23 + (param3[6] * var21 - -(param3[7] * var22)) >> 16 + -hma.field_a;
                        var11 = param3[10] * var22 + var21 * param3[9] - -(var23 * param3[11]) >> -751660592;
                        var21 = uoa.field_f;
                        var22 = uoa.field_g;
                        var23 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0.field_I <= var23) {
                            statePc = 29;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var24 = param0.field_l[var23];
                        var25 = param0.field_h[var23];
                        var26 = param0.field_t[var23];
                        var27 = var9 + (var24 * var12 - -(var15 * var25) + var18 * var26 >> -hma.field_a + 16);
                        var28 = var10 + (var13 * var24 - (-(var16 * var25) + -(var19 * var26)) >> 16 + -hma.field_a);
                        var29 = (var25 * var17 + (var24 * var14 + var20 * var26) >> 2041045360) + var11;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = var29 ^ -1;
                        stackOut_6_1 = -51;
                        stackIn_81_0 = stackOut_6_0;
                        stackIn_81_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (var30 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 <= stackIn_7_1) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        wp.field_c[var23] = -2147483648;
                        if (var30 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ds.field_f[var23] = var27 / var29 + var21;
                        mg.field_e[var23] = var28 / var29 + var22;
                        if ((var29 ^ -1) > (var7_int ^ -1)) {
                            statePc = 18;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7_int = var29;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var8 ^ -1) > (var29 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8 = var29;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        wp.field_c[var23] = var29;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!param6) {
                            statePc = 28;
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
                        bma.field_p[var23] = var27 >> hma.field_a;
                        ipa.field_M[var23] = var28 >> hma.field_a;
                        iia.field_v[var23] = var29;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (null == param0.field_j) {
                            statePc = 71;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = null;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 == (Object) (Object) param0.field_F) {
                            statePc = 71;
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
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = null;
                        stackIn_35_0 = stackOut_34_0;
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
                        if (stackIn_35_0 == (Object) (Object) param0.field_o) {
                            statePc = 71;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = null;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 == (Object) (Object) param0.field_x) {
                            statePc = 71;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = null;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (stackIn_43_0 == (Object) (Object) param0.field_G) {
                            statePc = 71;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = null;
                        stackIn_47_0 = stackOut_46_0;
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
                        if (stackIn_47_0 == (Object) (Object) param0.field_J) {
                            statePc = 71;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = null;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 == (Object) (Object) param0.field_E) {
                            statePc = 71;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = (an) param0;
                        stackIn_55_0 = stackOut_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0.field_v == null) {
                            statePc = 71;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = (an) param0;
                        stackIn_59_0 = stackOut_58_0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (stackIn_59_0.field_L != null) {
                            statePc = 64;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var23 = 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if ((var23 ^ -1) <= (param0.field_u ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var24 = param0.field_j[var23];
                        var25 = param0.field_F[var23];
                        var26 = param0.field_o[var23];
                        rva.field_u[var23] = var9 + (var18 * var26 + (var15 * var25 + var24 * var12) >> -477582192);
                        un.field_r[var23] = var10 + (var16 * var25 + var24 * var13 + var26 * var19 >> 1981401872);
                        lq.field_o[var23] = (var25 * var17 + (var24 * var14 - -(var26 * var20)) >> 624850896) + var11;
                        var24 = param0.field_x[var23];
                        var25 = param0.field_G[var23];
                        var26 = param0.field_J[var23];
                        fva.field_c[var23] = var9 - -(var25 * var15 + var24 * var12 - -(var18 * var26) >> 1998056176);
                        hma.field_f[var23] = (var25 * var16 + var13 * var24 + var26 * var19 >> 2106204592) + var10;
                        gv.field_q[var23] = var11 + (var26 * var20 + (var25 * var17 + var14 * var24) >> 175809808);
                        var24 = param0.field_E[var23];
                        var25 = param0.field_v[var23];
                        var26 = param0.field_L[var23];
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        nc.field_b[var23] = var9 + (var26 * var18 + (var15 * var25 + var24 * var12) >> 741632464);
                        eq.field_p[var23] = var10 - -(var25 * var16 + (var13 * var24 - -(var19 * var26)) >> 1335959152);
                        bw.field_b[var23] = var11 + (var25 * var17 + var14 * var24 - -(var26 * var20) >> 540637360);
                        var23++;
                        if (var30 != 0) {
                            statePc = 97;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var30 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (!param4) {
                            statePc = 80;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var9 = param2[3];
                        var10 = param2[4];
                        var11 = param2[5];
                        var12 = param2[6];
                        var13 = param2[7];
                        var14 = param2[8];
                        var15 = param2[9];
                        var16 = param2[10];
                        var17 = param2[11];
                        var18 = 0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if ((var18 ^ -1) <= (param0.field_A ^ -1)) {
                            statePc = 80;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = ada.field_y;
                        stackIn_75_0 = stackOut_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = stackIn_75_0.length ^ -1;
                        stackOut_75_1 = var18 ^ -1;
                        stackIn_81_0 = stackOut_75_0;
                        stackIn_81_1 = stackOut_75_1;
                        stackIn_76_0 = stackOut_75_0;
                        stackIn_76_1 = stackOut_75_1;
                        if (var30 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (stackIn_76_0 >= stackIn_76_1) {
                            statePc = 80;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var19 = param0.field_k[var18];
                        var20 = param0.field_c[var18];
                        var21 = param0.field_r[var18];
                        ada.field_y[var18] = var19 * var9 + var20 * var12 + var21 * var15 >> 464724048;
                        ie.field_i[var18] = var19 * var10 + (var13 * var20 - -(var21 * var16)) >> -748737104;
                        dd.field_d[var18] = var21 * var17 + var14 * var20 + var19 * var11 >> -376922224;
                        var18++;
                        if (var30 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackOut_80_0 = var7_int;
                        stackOut_80_1 = param5;
                        stackIn_81_0 = stackOut_80_0;
                        stackIn_81_1 = stackOut_80_1 ? 1 : 0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        ck.a(stackIn_81_0, stackIn_81_1 != 0, param0, param1 ^ -1251095052, var8);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 83: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    try {
                        stackOut_84_0 = (RuntimeException) var7;
                        stackOut_84_1 = new StringBuilder().append("ft.A(");
                        stackIn_87_0 = stackOut_84_0;
                        stackIn_87_1 = stackOut_84_1;
                        stackIn_85_0 = stackOut_84_0;
                        stackIn_85_1 = stackOut_84_1;
                        if (param0 == null) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
                        stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
                        stackOut_85_2 = "{...}";
                        stackIn_88_0 = stackOut_85_0;
                        stackIn_88_1 = stackOut_85_1;
                        stackIn_88_2 = stackOut_85_2;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 86: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 87: {
                    stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
                    stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
                    stackOut_87_2 = "null";
                    stackIn_88_0 = stackOut_87_0;
                    stackIn_88_1 = stackOut_87_1;
                    stackIn_88_2 = stackOut_87_2;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    try {
                        stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
                        stackOut_88_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_88_2).append(44).append(param1).append(44);
                        stackIn_91_0 = stackOut_88_0;
                        stackIn_91_1 = stackOut_88_1;
                        stackIn_89_0 = stackOut_88_0;
                        stackIn_89_1 = stackOut_88_1;
                        if (param2 == null) {
                            statePc = 91;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
                        stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
                        stackOut_89_2 = "{...}";
                        stackIn_92_0 = stackOut_89_0;
                        stackIn_92_1 = stackOut_89_1;
                        stackIn_92_2 = stackOut_89_2;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 91: {
                    stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
                    stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
                    stackOut_91_2 = "null";
                    stackIn_92_0 = stackOut_91_0;
                    stackIn_92_1 = stackOut_91_1;
                    stackIn_92_2 = stackOut_91_2;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    try {
                        stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
                        stackOut_92_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_92_2).append(44);
                        stackIn_95_0 = stackOut_92_0;
                        stackIn_95_1 = stackOut_92_1;
                        stackIn_93_0 = stackOut_92_0;
                        stackIn_93_1 = stackOut_92_1;
                        if (param3 == null) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
                        stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
                        stackOut_93_2 = "{...}";
                        stackIn_96_0 = stackOut_93_0;
                        stackIn_96_1 = stackOut_93_1;
                        stackIn_96_2 = stackOut_93_2;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 94: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 95: {
                    stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
                    stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
                    stackOut_95_2 = "null";
                    stackIn_96_0 = stackOut_95_0;
                    stackIn_96_1 = stackOut_95_1;
                    stackIn_96_2 = stackOut_95_2;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    throw tba.a((Throwable) (Object) stackIn_96_0, stackIn_96_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
                }
                case 97: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(q param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if ((vga.field_n.a((byte) -16) ^ -1) > param1) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        vga.field_n.b((byte) -90, (vg) (Object) param0);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param0.c(param1 ^ 8174);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var2;
                        stackOut_7_1 = new StringBuilder().append("ft.B(");
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param0 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ft(int param0) {
        try {
            ((ft) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ft.<init>(" + param0 + 41);
        }
    }

    static {
    }
}
