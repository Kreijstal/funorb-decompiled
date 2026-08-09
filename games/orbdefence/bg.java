/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    static im field_a;
    static String field_b;
    static String field_d;
    static int field_c;

    final static void a(int param0) {
        try {
            d.b((byte) -102);
            if (param0 != -2027485778) {
                bg.a((byte) -85);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "bg.B(" + param0 + ')');
        }
    }

    final static hj[] a(int param0, int param1) {
        hj[] stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        hj[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        try {
          L0: {
            var3 = -9 / ((-1 - param0) / 56);
            var2 = new hj[9];
            var2[4] = af.a(64, (byte) -51, param1);
            stackIn_1_0 = (hj[]) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "bg.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(boolean param0) {
        try {
            oe.field_p = param0;
            vh.field_j = false;
            il.a(-1, 0);
            qc.field_g = tl.field_h;
            tg.field_c = tl.field_h;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "bg.A(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == -107) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            field_a = null;
            field_b = null;
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "bg.D(" + param0 + ')');
        }
    }

    final static void a(int[] param0, wd param1, int param2, boolean param3, boolean param4, boolean param5, int[] param6) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
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
                    var30 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        if (param2 > 49) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        bg.a((byte) -95);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var21 = param6[3] >> -1906404542;
                        var22 = param6[4] >> -1982532062;
                        var23 = param6[5] >> -1873153118;
                        var24 = param6[6] >> 787065634;
                        var25 = param6[7] >> -952737182;
                        var26 = param6[8] >> 1724684066;
                        var27 = param6[9] >> -752585566;
                        var28 = param6[10] >> -1165269854;
                        var13 = param0[5] * var26 + (var24 * param0[3] - -(param0[4] * var25)) >> -2027485778;
                        var29 = param6[11] >> 928857442;
                        var12 = param0[4] * var22 + param0[3] * var21 + var23 * param0[5] >> -538694546;
                        var19 = param0[11] * var26 + (param0[9] * var24 - -(param0[10] * var25)) >> -926186674;
                        var17 = param0[7] * var28 + (var27 * param0[6] - -(param0[8] * var29)) >> -1087375122;
                        var18 = var21 * param0[9] - -(param0[10] * var22) + param0[11] * var23 >> -331465266;
                        var15 = param0[6] * var21 + (var22 * param0[7] - -(var23 * param0[8])) >> -1640742162;
                        var20 = param0[9] * var27 + (var28 * param0[10] + param0[11] * var29) >> -1134999730;
                        var16 = param0[7] * var25 + param0[6] * var24 + param0[8] * var26 >> -1835029490;
                        var14 = var27 * param0[3] + var28 * param0[4] - -(var29 * param0[5]) >> 125200110;
                        var21 = -param6[0] + param0[0];
                        var22 = -param6[1] + param0[1];
                        var23 = -param6[2] + param0[2];
                        var9 = param6[5] * var23 + var22 * param6[4] + var21 * param6[3] >> -sf.field_O + 16;
                        var10 = var23 * param6[8] + (var21 * param6[6] - -(var22 * param6[7])) >> 16 + -sf.field_O;
                        var11 = param6[10] * var22 + param6[9] * var21 - -(var23 * param6[11]) >> -1434483760;
                        var21 = wi.field_h;
                        var22 = wi.field_d;
                        var23 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var23 >= param1.field_c) {
                            statePc = 28;
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
                        var24 = param1.field_R[var23];
                        var25 = param1.field_x[var23];
                        var26 = param1.field_Q[var23];
                        var27 = var9 + (var12 * var24 - (-(var15 * var25) - var18 * var26) >> -sf.field_O + 16);
                        var28 = (var16 * var25 + var24 * var13 + var26 * var19 >> -sf.field_O + 16) + var10;
                        var29 = var11 + (var20 * var26 + (var17 * var25 + var24 * var14) >> -518943856);
                        stackIn_68_0 = var29;
                        stackIn_7_0 = stackIn_68_0;
                        stackIn_68_1 = 50;
                        stackIn_7_1 = stackIn_68_1;
                        if (var30 != 0) {
                            statePc = 68;
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
                        if (stackIn_7_0 >= stackIn_7_1) {
                            statePc = 13;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        dg.field_B[var23] = -2147483648;
                        if (var30 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        a.field_t[var23] = var21 - -(var27 / var29);
                        ph.field_x[var23] = var22 + var28 / var29;
                        if (var7_int > var29) {
                            statePc = 18;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 70;
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
                        statePc = 70;
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
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 70;
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
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        dg.field_B[var23] = var29;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!param5) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        gi.field_c[var23] = var27 >> sf.field_O;
                        el.field_A[var23] = var28 >> sf.field_O;
                        hi.field_i[var23] = var29;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param1.field_r == null) {
                            statePc = 59;
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
                        if (null == param1.field_j) {
                            statePc = 59;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (null == param1.field_g) {
                            statePc = 59;
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
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (null == param1.field_A) {
                            statePc = 59;
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
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (param1.field_L == null) {
                            statePc = 59;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (null == param1.field_b) {
                            statePc = 59;
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
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (param1.field_E == null) {
                            statePc = 59;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (null == param1.field_I) {
                            statePc = 59;
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
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (param1.field_f == null) {
                            statePc = 59;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var23 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (param1.field_u <= var23) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var24 = param1.field_r[var23];
                        var25 = param1.field_j[var23];
                        var26 = param1.field_g[var23];
                        a.field_s[var23] = var9 + (var24 * var12 - (-(var15 * var25) - var26 * var18) >> 1661087248);
                        cd.field_q[var23] = var10 + (var25 * var16 + var24 * var13 - -(var19 * var26) >> -421083280);
                        ia.field_j[var23] = (var17 * var25 + (var14 * var24 + var20 * var26) >> -1508563856) + var11;
                        var24 = param1.field_A[var23];
                        var25 = param1.field_L[var23];
                        var26 = param1.field_b[var23];
                        cc.field_j[var23] = var9 - -(var24 * var12 - (-(var25 * var15) + -(var18 * var26)) >> 1805461232);
                        jk.field_t[var23] = var10 + (var19 * var26 + var24 * var13 + var25 * var16 >> 364751632);
                        ve.field_N[var23] = (var14 * var24 - -(var25 * var17) - -(var26 * var20) >> 150029968) + var11;
                        var24 = param1.field_E[var23];
                        var25 = param1.field_I[var23];
                        var26 = param1.field_f[var23];
                        cf.field_b[var23] = (var25 * var15 + (var24 * var12 + var18 * var26) >> -562137488) + var9;
                        sd.field_e[var23] = (var13 * var24 - (-(var25 * var16) - var19 * var26) >> 1397542256) + var10;
                        fm.field_d[var23] = var11 - -(var26 * var20 + var25 * var17 + var24 * var14 >> 231077936);
                        var23++;
                        if (var30 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var30 == 0) {
                            statePc = 54;
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
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (!param3) {
                            statePc = 67;
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
                        var9 = param0[3];
                        var10 = param0[4];
                        var11 = param0[5];
                        var12 = param0[6];
                        var13 = param0[7];
                        var14 = param0[8];
                        var15 = param0[9];
                        var16 = param0[10];
                        var17 = param0[11];
                        var18 = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((var18 ^ -1) <= (param1.field_w ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_68_0 = var18;
                        stackIn_63_0 = stackIn_68_0;
                        stackIn_68_1 = ee.field_g.length;
                        stackIn_63_1 = stackIn_68_1;
                        if (var30 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 >= stackIn_63_1) {
                            statePc = 67;
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
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var19 = param1.field_K[var18];
                        var20 = param1.field_H[var18];
                        var21 = param1.field_G[var18];
                        ee.field_g[var18] = var12 * var20 + (var9 * var19 + var21 * var15) >> 753864784;
                        cf.field_e[var18] = var16 * var21 + (var13 * var20 + var19 * var10) >> 2048199440;
                        ue.field_H[var18] = var19 * var11 - -(var14 * var20) + var21 * var17 >> 480337936;
                        var18++;
                        if (var30 == 0) {
                            statePc = 61;
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
                        stackIn_68_0 = var7_int;
                        stackIn_68_1 = -2147483648;
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
                        mc.a(stackIn_68_0, stackIn_68_1, param1, param4, var8);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_73_0 = (RuntimeException) (var7);
                    stackIn_71_0 = stackIn_73_0;
                    stackIn_73_1 = new StringBuilder().append("bg.C(");
                    stackIn_71_1 = stackIn_73_1;
                    if (param0 == null) {
                        statePc = 73;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackIn_74_2 = "{...}";
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
                    stackIn_74_2 = "null";
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_0 = stackIn_77_0;
                    stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
                    stackIn_75_1 = stackIn_77_1;
                    if (param1 == null) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_75_1);
                    stackIn_78_2 = "{...}";
                    statePc = 78;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_78_2 = "null";
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_0 = stackIn_81_0;
                    stackIn_81_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_79_1 = stackIn_81_1;
                    if (param6 == null) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_79_1);
                    stackIn_82_2 = "{...}";
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
                    stackIn_82_2 = "null";
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    throw dd.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ')');
                }
                case 83: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_b = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_c = 0;
        field_d = "Name";
        field_a = null;
    }
}
