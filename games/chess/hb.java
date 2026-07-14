/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static km[][] field_b;
    static ci field_a;

    final static jd[] a(int param0) {
        RuntimeException var1 = null;
        jd[] stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        jd[] stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 == 2) {
                break L0;
              } else {
                field_a = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = new jd[]{ph.field_g, le.field_g, dn.field_f};
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            return;
        }
        try {
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "hb.C(" + param0 + 41);
        }
    }

    final static void a(boolean param0, int[] param1, byte param2, int[] param3, boolean param4, em param5, boolean param6) {
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
        Object stackIn_33_0 = null;
        em stackIn_37_0 = null;
        Object stackIn_41_0 = null;
        em stackIn_45_0 = null;
        Object stackIn_49_0 = null;
        em stackIn_53_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        Object stackOut_32_0 = null;
        em stackOut_36_0 = null;
        Object stackOut_40_0 = null;
        em stackOut_44_0 = null;
        Object stackOut_48_0 = null;
        em stackOut_52_0 = null;
        Object stackOut_56_0 = null;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param1[3] >> 1121653890;
                        var22 = param1[4] >> -1975997662;
                        var23 = param1[5] >> -1844573758;
                        var24 = param1[6] >> -1082345118;
                        var25 = param1[7] >> 223070882;
                        var26 = param1[8] >> 1693934434;
                        var27 = param1[9] >> -991589438;
                        var28 = param1[10] >> 861434242;
                        var29 = param1[11] >> -1919178974;
                        var13 = var26 * param3[5] + (param3[3] * var24 - -(var25 * param3[4])) >> 273393998;
                        var12 = var23 * param3[5] + (param3[4] * var22 + var21 * param3[3]) >> 1741426958;
                        var17 = var29 * param3[8] + param3[7] * var28 + param3[6] * var27 >> -1698766322;
                        var15 = param3[6] * var21 - (-(param3[7] * var22) + -(var23 * param3[8])) >> -1721154226;
                        var18 = param3[10] * var22 + (var21 * param3[9] + param3[11] * var23) >> -1058468370;
                        var19 = param3[11] * var26 + var24 * param3[9] - -(var25 * param3[10]) >> 569565998;
                        var14 = param3[4] * var28 + var27 * param3[3] + param3[5] * var29 >> -106583538;
                        var16 = param3[6] * var24 - -(param3[7] * var25) - -(var26 * param3[8]) >> -459876978;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2 == -98) {
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
                        field_a = null;
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
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var20 = var28 * param3[10] + (var27 * param3[9] - -(param3[11] * var29)) >> -56722770;
                        var21 = param3[0] - param1[0];
                        var22 = param3[1] + -param1[1];
                        var23 = -param1[2] + param3[2];
                        var9 = var23 * param1[5] + (var22 * param1[4] + param1[3] * var21) >> 16 + -pd.field_Tb;
                        var10 = param1[6] * var21 - (-(var22 * param1[7]) + -(var23 * param1[8])) >> 16 - pd.field_Tb;
                        var11 = param1[9] * var21 - -(param1[10] * var22) + var23 * param1[11] >> -430761104;
                        var21 = nh.field_n;
                        var22 = nh.field_f;
                        var23 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var23 ^ -1) <= (param5.field_d ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var24 = param5.field_z[var23];
                        var25 = param5.field_a[var23];
                        var26 = param5.field_H[var23];
                        var27 = (var25 * var15 + (var24 * var12 + var18 * var26) >> 16 - pd.field_Tb) + var9;
                        var28 = var10 - -(var16 * var25 + (var13 * var24 + var26 * var19) >> -pd.field_Tb + 16);
                        var29 = (var26 * var20 + (var24 * var14 - -(var25 * var17)) >> -852066352) + var11;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var29 ^ -1) > -51) {
                            statePc = 23;
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
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        qm.field_c[var23] = var27 / var29 + var21;
                        tc.field_w[var23] = var28 / var29 + var22;
                        jd.field_i[var23] = var29;
                        if (var29 < var7_int) {
                            statePc = 17;
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 81;
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
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var29 ^ -1) < (var8 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 81;
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
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        jd.field_i[var23] = -2147483648;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (!param0) {
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
                        ve.field_Gb[var23] = var27 >> pd.field_Tb;
                        ob.field_u[var23] = var28 >> pd.field_Tb;
                        qi.field_p[var23] = var29;
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
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var23++;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param5.field_q == null) {
                            statePc = 69;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = null;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((Object) (Object) stackIn_33_0 == (Object) (Object) param5.field_Q) {
                            statePc = 69;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = (em) param5;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (((em) (Object) stackIn_37_0).field_w == null) {
                            statePc = 69;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = null;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((Object) (Object) stackIn_41_0 == (Object) (Object) param5.field_h) {
                            statePc = 69;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = (em) param5;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (((em) (Object) stackIn_45_0).field_L == null) {
                            statePc = 69;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = null;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((Object) (Object) stackIn_49_0 == (Object) (Object) param5.field_u) {
                            statePc = 69;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = (em) param5;
                        stackIn_53_0 = stackOut_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (((em) (Object) stackIn_53_0).field_p == null) {
                            statePc = 69;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = null;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if ((Object) (Object) stackIn_57_0 == (Object) (Object) param5.field_D) {
                            statePc = 69;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (null == param5.field_s) {
                            statePc = 69;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var23 = 0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if ((var23 ^ -1) <= (param5.field_e ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var24 = param5.field_q[var23];
                        var25 = param5.field_Q[var23];
                        var26 = param5.field_w[var23];
                        wj.field_d[var23] = (var25 * var15 + var24 * var12 + var26 * var18 >> -1701582576) + var9;
                        he.field_Gb[var23] = (var25 * var16 + (var24 * var13 + var19 * var26) >> 1803913264) + var10;
                        qh.field_e[var23] = var11 + (var25 * var17 + var24 * var14 + var20 * var26 >> -437912848);
                        var24 = param5.field_h[var23];
                        var25 = param5.field_L[var23];
                        var26 = param5.field_u[var23];
                        db.field_n[var23] = var9 + (var26 * var18 + (var15 * var25 + var12 * var24) >> 1334533008);
                        t.field_M[var23] = var10 - -(var26 * var19 + var24 * var13 - -(var16 * var25) >> -351389872);
                        uc.field_e[var23] = var11 + (var25 * var17 + (var24 * var14 - -(var26 * var20)) >> -203396816);
                        var24 = param5.field_p[var23];
                        var25 = param5.field_D[var23];
                        var26 = param5.field_s[var23];
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        l.field_n[var23] = var9 - -(var26 * var18 + (var12 * var24 - -(var15 * var25)) >> -1784293584);
                        wk.field_d[var23] = var10 + (var26 * var19 + var13 * var24 + var25 * var16 >> 2089018352);
                        ld.field_p[var23] = (var14 * var24 + (var17 * var25 + var20 * var26) >> 34974000) + var11;
                        var23++;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (param6) {
                            statePc = 72;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var9 = param3[3];
                        var10 = param3[4];
                        var11 = param3[5];
                        var12 = param3[6];
                        var13 = param3[7];
                        var14 = param3[8];
                        var15 = param3[9];
                        var16 = param3[10];
                        var17 = param3[11];
                        var18 = 0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackOut_73_0 = var18 ^ -1;
                        stackOut_73_1 = param5.field_t ^ -1;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (stackIn_74_0 <= stackIn_74_1) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((lk.field_c.length ^ -1) >= (var18 ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var19 = param5.field_b[var18];
                        var20 = param5.field_f[var18];
                        var21 = param5.field_F[var18];
                        lk.field_c[var18] = var20 * var12 + (var9 * var19 + var15 * var21) >> 1957328560;
                        ab.field_r[var18] = var19 * var10 - -(var20 * var13) - -(var16 * var21) >> -1519736080;
                        pa.field_o[var18] = var21 * var17 + var14 * var20 + var19 * var11 >> -1910767984;
                        var18++;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        ja.a(param5, var8, (byte) -100, var7_int, param4);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 81: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    try {
                        stackOut_82_0 = (RuntimeException) var7;
                        stackOut_82_1 = new StringBuilder().append("hb.D(").append(param0).append(44);
                        stackIn_85_0 = stackOut_82_0;
                        stackIn_85_1 = stackOut_82_1;
                        stackIn_83_0 = stackOut_82_0;
                        stackIn_83_1 = stackOut_82_1;
                        if (param1 == null) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
                        stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
                        stackOut_83_2 = "{...}";
                        stackIn_86_0 = stackOut_83_0;
                        stackIn_86_1 = stackOut_83_1;
                        stackIn_86_2 = stackOut_83_2;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 85: {
                    stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
                    stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
                    stackOut_85_2 = "null";
                    stackIn_86_0 = stackOut_85_0;
                    stackIn_86_1 = stackOut_85_1;
                    stackIn_86_2 = stackOut_85_2;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    try {
                        stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
                        stackOut_86_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_86_2).append(44).append(param2).append(44);
                        stackIn_89_0 = stackOut_86_0;
                        stackIn_89_1 = stackOut_86_1;
                        stackIn_87_0 = stackOut_86_0;
                        stackIn_87_1 = stackOut_86_1;
                        if (param3 == null) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
                        stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
                        stackOut_87_2 = "{...}";
                        stackIn_90_0 = stackOut_87_0;
                        stackIn_90_1 = stackOut_87_1;
                        stackIn_90_2 = stackOut_87_2;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 88: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 89: {
                    stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
                    stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
                    stackOut_89_2 = "null";
                    stackIn_90_0 = stackOut_89_0;
                    stackIn_90_1 = stackOut_89_1;
                    stackIn_90_2 = stackOut_89_2;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    try {
                        stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
                        stackOut_90_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_90_2).append(44).append(param4).append(44);
                        stackIn_93_0 = stackOut_90_0;
                        stackIn_93_1 = stackOut_90_1;
                        stackIn_91_0 = stackOut_90_0;
                        stackIn_91_1 = stackOut_90_1;
                        if (param5 == null) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
                        stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
                        stackOut_91_2 = "{...}";
                        stackIn_94_0 = stackOut_91_0;
                        stackIn_94_1 = stackOut_91_1;
                        stackIn_94_2 = stackOut_91_2;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 92: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 93: {
                    stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
                    stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
                    stackOut_93_2 = "null";
                    stackIn_94_0 = stackOut_93_0;
                    stackIn_94_1 = stackOut_93_1;
                    stackIn_94_2 = stackOut_93_2;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    throw fk.a((Throwable) (Object) stackIn_94_0, (String) (Object) (stackIn_94_2 + 44 + param6 + 41));
                }
                case 95: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 == -118) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        hc.field_b = param0;
                        uk.a(false, 12);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) runtimeException;
                        stackOut_5_1 = new StringBuilder().append("hb.A(");
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (param0 == null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                        stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                        stackOut_6_2 = "{...}";
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_9_2 = stackOut_6_2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 8: {
                    stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                    stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                    stackOut_8_2 = "null";
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    throw fk.a((Throwable) (Object) stackIn_9_0, (String) (Object) (stackIn_9_2 + 44 + param1 + 41));
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new km[2][7];
    }
}
