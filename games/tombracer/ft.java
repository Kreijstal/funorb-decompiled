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
            throw tba.a((Throwable) ((Object) runtimeException), "ft.D(" + param0 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 < 75) {
                field_c = (il) null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "ft.toString()");
        }
    }

    final static void a(an param0, int param1, int[] param2, int[] param3, boolean param4, boolean param5, boolean param6) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
                        statePc = 71;
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
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0.field_I <= var23) {
                            statePc = 27;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 71;
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
                        stackIn_69_0 = var29 ^ -1;
                        stackIn_6_0 = stackIn_69_0;
                        stackIn_69_1 = -51;
                        stackIn_6_1 = stackIn_69_1;
                        if (var30 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 <= stackIn_6_1) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        wp.field_c[var23] = -2147483648;
                        if (var30 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ds.field_f[var23] = var27 / var29 + var21;
                        mg.field_e[var23] = var28 / var29 + var22;
                        if ((var29 ^ -1) > (var7_int ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7_int = var29;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var8 ^ -1) > (var29 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var8 = var29;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        wp.field_c[var23] = var29;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!param6) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        bma.field_p[var23] = var27 >> hma.field_a;
                        ipa.field_M[var23] = var28 >> hma.field_a;
                        iia.field_v[var23] = var29;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (null == param0.field_j) {
                            statePc = 60;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (null == param0.field_F) {
                            statePc = 60;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (null == param0.field_o) {
                            statePc = 60;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (null == param0.field_x) {
                            statePc = 60;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null == param0.field_G) {
                            statePc = 60;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (null == param0.field_J) {
                            statePc = 60;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (null == param0.field_E) {
                            statePc = 60;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (param0.field_v == null) {
                            statePc = 60;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (param0.field_L != null) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var23 = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((var23 ^ -1) <= (param0.field_u ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 56: {
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
                        nc.field_b[var23] = var9 + (var26 * var18 + (var15 * var25 + var24 * var12) >> 741632464);
                        eq.field_p[var23] = var10 - -(var25 * var16 + (var13 * var24 - -(var19 * var26)) >> 1335959152);
                        bw.field_b[var23] = var11 + (var25 * var17 + var14 * var24 - -(var26 * var20) >> 540637360);
                        var23++;
                        if (var30 != 0) {
                            statePc = 84;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var30 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (!param4) {
                            statePc = 68;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 61: {
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
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((var18 ^ -1) <= (param0.field_A ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_69_0 = ada.field_y.length ^ -1;
                        stackIn_64_0 = stackIn_69_0;
                        stackIn_69_1 = var18 ^ -1;
                        stackIn_64_1 = stackIn_69_1;
                        if (var30 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 >= stackIn_64_1) {
                            statePc = 68;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var19 = param0.field_k[var18];
                        var20 = param0.field_c[var18];
                        var21 = param0.field_r[var18];
                        ada.field_y[var18] = var19 * var9 + var20 * var12 + var21 * var15 >> 464724048;
                        ie.field_i[var18] = var19 * var10 + (var13 * var20 - -(var21 * var16)) >> -748737104;
                        dd.field_d[var18] = var21 * var17 + var14 * var20 + var19 * var11 >> -376922224;
                        var18++;
                        if (var30 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_69_0 = var7_int;
                        stackIn_69_1 = param5 ? 1 : 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        ck.a(stackIn_69_0, stackIn_69_1 != 0, param0, param1 ^ -1251095052, var8);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 71: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_74_0 = (RuntimeException) (var7);
                    stackIn_72_0 = stackIn_74_0;
                    stackIn_74_1 = new StringBuilder().append("ft.A(");
                    stackIn_72_1 = stackIn_74_1;
                    if (param0 == null) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_75_2 = "{...}";
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_75_2 = "null";
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_76_0 = stackIn_78_0;
                    stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param1).append(',');
                    stackIn_76_1 = stackIn_78_1;
                    if (param2 == null) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_79_2 = "{...}";
                    statePc = 79;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_79_2 = "null";
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_80_0 = stackIn_82_0;
                    stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',');
                    stackIn_80_1 = stackIn_82_1;
                    if (param3 == null) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_83_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_83_1 = (StringBuilder) ((Object) stackIn_80_1);
                    stackIn_83_2 = "{...}";
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
                    stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
                    stackIn_83_2 = "null";
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    throw tba.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                case 84: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(q param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if ((vga.field_n.a((byte) -16) ^ -1) > param1) {
                vga.field_n.b((byte) -90, param0);
                break L1;
              } else {
                break L1;
              }
            }
            param0.c(param1 ^ 8174);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("ft.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    ft(int param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ft.<init>(" + param0 + ')');
        }
    }

    static {
    }
}
