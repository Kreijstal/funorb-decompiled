/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    int[] field_h;
    int[] field_m;
    int[] field_j;
    int field_n;
    static String field_g;
    static wk field_k;
    static int field_i;
    int field_c;
    private int field_l;
    int[] field_o;
    private int field_b;
    static gh field_q;
    static int field_a;
    int[] field_e;
    private int field_p;
    static String field_d;
    int[] field_f;

    final static boolean b(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_8_0 = 0;
        long stackIn_11_0 = 0L;
        int stackIn_21_0 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        boolean stackIn_36_0 = false;
        int stackIn_46_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        long stackOut_10_0 = 0L;
        int stackOut_20_0 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        boolean stackOut_35_0 = false;
        int stackOut_45_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_59_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == -3) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        boolean discarded$1 = hd.c(-107);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null == ni.field_a) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = 1;
                        stackIn_8_0 = stackOut_5_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3_int = stackIn_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((ei.field_q ^ -1) != -10) {
                            statePc = 24;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = se.field_b;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!vk.a(stackIn_11_0, pa.field_h, f.field_x, dh.field_B, -21)) {
                            statePc = 24;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((dh.field_B ^ -1) == -3) {
                            statePc = 22;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var3_int == 0) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    try {
                        stackOut_22_0 = dl.a(se.field_b, pa.field_h, param0 + -119, dh.field_B, f.field_x);
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    try {
                        if (ei.field_q != 10) {
                            statePc = 34;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var3_int != 0) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0 != 0;
                }
                case 32: {
                    try {
                        pd.j(13171);
                        stackOut_32_0 = 1;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return stackIn_33_0 != 0;
                }
                case 34: {
                    try {
                        if (-12 != (ei.field_q ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = ob.field_v;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (!stackIn_36_0) {
                            statePc = 59;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if ((hk.field_ic ^ -1) != -3) {
                            statePc = 47;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (qm.a((byte) -31, fi.field_t, kh.field_q)) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackOut_45_0 = 0;
                        stackIn_46_0 = stackOut_45_0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 46: {
                    return stackIn_46_0 != 0;
                }
                case 47: {
                    try {
                        if (-3 == (hk.field_ic ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var3_int == 0) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = 0;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 52: {
                    return stackIn_52_0 != 0;
                }
                case 53: {
                    try {
                        if (ul.e((byte) 17)) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        oe.a(param2, fi.field_t, -6988, hk.field_ic, wn.field_f, (String) null);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = 1;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    return stackIn_58_0 != 0;
                }
                case 59: {
                    try {
                        stackOut_59_0 = 0;
                        stackIn_60_0 = stackOut_59_0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    return stackIn_60_0 != 0;
                }
                case 61: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var3, "hd.E(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int b(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        try {
          if (param0 > 44) {
            return stackIn_2_0;
          } else {
            stackOut_1_0 = 59;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = ((hd) this).field_b;
          stackIn_4_0 = stackOut_3_0;
        }
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        ie var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int[] var9_ref_int__ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        wk var14_ref_wk = null;
        int var15_int = 0;
        int[] var15 = null;
        wk var15_ref = null;
        wk var16_ref_wk = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_67_0 = 0;
        int[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        int[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        int[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        int[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        int[] stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        int stackIn_79_3 = 0;
        int[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        int stackIn_80_3 = 0;
        int[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int stackIn_81_3 = 0;
        int[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        int stackIn_82_3 = 0;
        int stackIn_82_4 = 0;
        int[] stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        int stackIn_86_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_170_1 = 0;
        int stackIn_180_0 = 0;
        int stackIn_180_1 = 0;
        int stackIn_185_0 = 0;
        int stackIn_185_1 = 0;
        int stackIn_195_0 = 0;
        int stackIn_195_1 = 0;
        int stackIn_198_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_211_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_214_1 = 0;
        int stackIn_221_0 = 0;
        int stackIn_221_1 = 0;
        int stackIn_229_0 = 0;
        int stackIn_237_0 = 0;
        int stackIn_240_0 = 0;
        int stackIn_240_1 = 0;
        int stackIn_247_0 = 0;
        int stackIn_247_1 = 0;
        int stackIn_257_0 = 0;
        int stackIn_259_0 = 0;
        int stackIn_261_0 = 0;
        int stackIn_263_0 = 0;
        int stackIn_263_1 = 0;
        int stackIn_265_0 = 0;
        int stackIn_268_0 = 0;
        int stackIn_268_1 = 0;
        int stackIn_276_0 = 0;
        int stackIn_276_1 = 0;
        int stackIn_283_0 = 0;
        int stackIn_283_1 = 0;
        int stackIn_288_0 = 0;
        int stackIn_290_0 = 0;
        int stackIn_290_1 = 0;
        int stackIn_292_0 = 0;
        int stackIn_292_1 = 0;
        int stackIn_298_0 = 0;
        int stackIn_308_0 = 0;
        int stackIn_313_0 = 0;
        int stackIn_313_1 = 0;
        int stackIn_323_0 = 0;
        int stackIn_323_1 = 0;
        int stackIn_335_0 = 0;
        int stackIn_335_1 = 0;
        int stackIn_341_0 = 0;
        int stackIn_341_1 = 0;
        int stackIn_343_0 = 0;
        int stackIn_343_1 = 0;
        int stackIn_348_0 = 0;
        int stackIn_348_1 = 0;
        int stackIn_372_0 = 0;
        int stackIn_372_1 = 0;
        int stackIn_378_0 = 0;
        int stackIn_378_1 = 0;
        int stackIn_380_0 = 0;
        int stackIn_380_1 = 0;
        int stackIn_382_0 = 0;
        int stackIn_385_0 = 0;
        int stackIn_385_1 = 0;
        int stackIn_390_0 = 0;
        int stackIn_394_0 = 0;
        int stackIn_409_0 = 0;
        int stackIn_412_0 = 0;
        int stackIn_412_1 = 0;
        int stackIn_419_0 = 0;
        int stackIn_419_1 = 0;
        int stackIn_422_0 = 0;
        int stackIn_425_0 = 0;
        int stackIn_430_0 = 0;
        int stackIn_438_0 = 0;
        int stackOut_66_0 = 0;
        int[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        int[] stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int[] stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        int stackOut_78_3 = 0;
        int[] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int[] stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int stackOut_77_3 = 0;
        int[] stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        int stackOut_79_3 = 0;
        int[] stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        int stackOut_81_3 = 0;
        int stackOut_81_4 = 0;
        int[] stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        int stackOut_80_3 = 0;
        int stackOut_80_4 = 0;
        int[] stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        int stackOut_85_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        int stackOut_145_0 = 0;
        int stackOut_145_1 = 0;
        int stackOut_149_0 = 0;
        int stackOut_149_1 = 0;
        int stackOut_161_0 = 0;
        int stackOut_161_1 = 0;
        int stackOut_163_0 = 0;
        int stackOut_163_1 = 0;
        int stackOut_169_0 = 0;
        int stackOut_169_1 = 0;
        int stackOut_179_0 = 0;
        int stackOut_179_1 = 0;
        int stackOut_184_0 = 0;
        int stackOut_184_1 = 0;
        int stackOut_194_0 = 0;
        int stackOut_194_1 = 0;
        int stackOut_197_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_213_1 = 0;
        int stackOut_220_0 = 0;
        int stackOut_220_1 = 0;
        int stackOut_228_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_239_1 = 0;
        int stackOut_246_0 = 0;
        int stackOut_246_1 = 0;
        int stackOut_256_0 = 0;
        int stackOut_258_0 = 0;
        int stackOut_260_0 = 0;
        int stackOut_262_0 = 0;
        int stackOut_262_1 = 0;
        int stackOut_264_0 = 0;
        int stackOut_267_0 = 0;
        int stackOut_267_1 = 0;
        int stackOut_275_0 = 0;
        int stackOut_275_1 = 0;
        int stackOut_282_0 = 0;
        int stackOut_282_1 = 0;
        int stackOut_287_0 = 0;
        int stackOut_289_0 = 0;
        int stackOut_289_1 = 0;
        int stackOut_291_0 = 0;
        int stackOut_291_1 = 0;
        int stackOut_297_0 = 0;
        int stackOut_307_0 = 0;
        int stackOut_312_0 = 0;
        int stackOut_312_1 = 0;
        int stackOut_322_0 = 0;
        int stackOut_322_1 = 0;
        int stackOut_334_0 = 0;
        int stackOut_334_1 = 0;
        int stackOut_340_0 = 0;
        int stackOut_340_1 = 0;
        int stackOut_342_0 = 0;
        int stackOut_342_1 = 0;
        int stackOut_347_0 = 0;
        int stackOut_347_1 = 0;
        int stackOut_371_0 = 0;
        int stackOut_371_1 = 0;
        int stackOut_377_0 = 0;
        int stackOut_377_1 = 0;
        int stackOut_379_0 = 0;
        int stackOut_379_1 = 0;
        int stackOut_381_0 = 0;
        int stackOut_384_0 = 0;
        int stackOut_384_1 = 0;
        int stackOut_389_0 = 0;
        int stackOut_393_0 = 0;
        int stackOut_408_0 = 0;
        int stackOut_411_0 = 0;
        int stackOut_411_1 = 0;
        int stackOut_418_0 = 0;
        int stackOut_418_1 = 0;
        int stackOut_421_0 = 0;
        int stackOut_424_0 = 0;
        int stackOut_429_0 = 0;
        int stackOut_437_0 = 0;
        L0: {
          var22 = SteelSentinels.field_G;
          ((hd) this).field_p = 100;
          ((hd) this).field_c = 0;
          ((hd) this).field_o = new int[((hd) this).field_p];
          ((hd) this).field_l = param2;
          ((hd) this).field_l = ((hd) this).field_l & -9;
          ((hd) this).field_b = ((hd) this).field_l % 8;
          if (-6 == (((hd) this).field_b ^ -1)) {
            ((hd) this).field_b = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-1 == ((hd) this).field_l) {
            ((hd) this).field_b = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var4_int = 20000;
          var4_int = 8000;
          if (-3 <= (param1 ^ -1)) {
            break L2;
          } else {
            var4_int = 16000;
            break L2;
          }
        }
        L3: {
          if (param0 == 1200) {
            break L3;
          } else {
            int discarded$1 = ((hd) this).a(4);
            break L3;
          }
        }
        L4: {
          if (-7 < (param1 ^ -1)) {
            break L4;
          } else {
            var4_int = 24000;
            break L4;
          }
        }
        L5: {
          if (12 <= param1) {
            var4_int = 32000;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var4_int = (32000 + var4_int) / 2;
          if (-1 == (((hd) this).field_b ^ -1)) {
            // wide iinc 4 4000
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (((hd) this).field_b != 4) {
            break L7;
          } else {
            var4_int = 32000;
            break L7;
          }
        }
        L8: {
          if (0 != (param2 ^ -1)) {
            break L8;
          } else {
            var4_int = 6528;
            break L8;
          }
        }
        L9: {
          if (10 != di.field_g) {
            break L9;
          } else {
            var4_int = ua.field_t[ol.field_Ub + ge.field_j * 10][2];
            break L9;
          }
        }
        ((hd) this).field_n = 15;
        ((hd) this).field_m = new int[((hd) this).field_n];
        ((hd) this).field_e = new int[((hd) this).field_n];
        var5 = new ie(new int[2]);
        var6 = 0;
        L10: while (true) {
          L11: {
            L12: {
              if (var6 >= 15) {
                break L12;
              } else {
                ((hd) this).field_e[var6] = 128 + var5.a(38, 60 * var4_int / 640);
                ((hd) this).field_m[var6] = var5.a(47, var4_int * 60 / 640) + 128;
                var6++;
                if (var22 != 0) {
                  break L11;
                } else {
                  if (var22 == 0) {
                    continue L10;
                  } else {
                    break L12;
                  }
                }
              }
            }
            L13: {
              if ((((hd) this).field_l ^ -1) != -17) {
                break L13;
              } else {
                var4_int = ua.field_t[ol.field_Ub + ge.field_j * 10][2];
                break L13;
              }
            }
            je.field_o = 0;
            ge.field_l = 0;
            fk.field_c = false;
            he.field_k = 0;
            hb.field_f = false;
            break L11;
          }
          L14: {
            if (((hd) this).field_l != 16) {
              break L14;
            } else {
              L15: {
                if (-2 != (di.field_g ^ -1)) {
                  break L15;
                } else {
                  if (-11 < (qh.field_Yb ^ -1)) {
                    break L15;
                  } else {
                    ((hd) this).field_m[0] = 3000;
                    ((hd) this).field_m[1] = 1000;
                    ((hd) this).field_e[0] = 4300;
                    ((hd) this).field_m[7] = 2000;
                    ((hd) this).field_m[6] = 1200;
                    ((hd) this).field_m[3] = 900;
                    ((hd) this).field_e[1] = 4000;
                    ((hd) this).field_m[8] = 2400;
                    ((hd) this).field_m[5] = 900;
                    ((hd) this).field_m[2] = 1200;
                    ((hd) this).field_m[9] = 1600;
                    ((hd) this).field_m[4] = 1100;
                    ((hd) this).field_m[10] = 1200;
                    ((hd) this).field_e[9] = 5000;
                    ((hd) this).field_m[12] = 900;
                    ((hd) this).field_m[11] = 1000;
                    ((hd) this).field_e[10] = 2500;
                    ((hd) this).field_m[13] = 800;
                    ((hd) this).field_e[12] = 3000;
                    ((hd) this).field_e[13] = 2800;
                    ((hd) this).field_m[14] = 900;
                    break L15;
                  }
                }
              }
              L16: {
                L17: {
                  if (-1 == (di.field_g ^ -1)) {
                    break L17;
                  } else {
                    if (1 == di.field_g) {
                      break L17;
                    } else {
                      if (-8 != (di.field_g ^ -1)) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                L18: {
                  ((hd) this).field_m[0] = 4000;
                  ((hd) this).field_m[1] = 1000;
                  ((hd) this).field_m[4] = 3000;
                  ((hd) this).field_m[2] = 1100;
                  ((hd) this).field_m[7] = 1000;
                  ((hd) this).field_m[5] = 3400;
                  ((hd) this).field_m[6] = 3000;
                  ((hd) this).field_m[3] = 3200;
                  ((hd) this).field_e[7] = 3000;
                  ((hd) this).field_m[8] = 1200;
                  ((hd) this).field_m[10] = 860;
                  ((hd) this).field_e[8] = 2900;
                  ((hd) this).field_m[9] = 900;
                  ((hd) this).field_m[11] = 800;
                  ((hd) this).field_e[10] = 3200;
                  ((hd) this).field_e[11] = 3600;
                  ((hd) this).field_m[12] = 860;
                  ((hd) this).field_e[12] = 700;
                  ((hd) this).field_m[13] = 800;
                  ((hd) this).field_e[13] = 4500;
                  ((hd) this).field_e[14] = 4600;
                  if ((di.field_g ^ -1) == -2) {
                    break L18;
                  } else {
                    if (-8 == (di.field_g ^ -1)) {
                      break L18;
                    } else {
                      break L14;
                    }
                  }
                }
                ((hd) this).field_e[10] = 700;
                ((hd) this).field_e[12] = 4000;
                he.field_k = 180000;
                ((hd) this).field_e[11] = 3200;
                if (var22 == 0) {
                  break L14;
                } else {
                  break L16;
                }
              }
              ((hd) this).field_m[13] = 1200;
              ((hd) this).field_m[9] = 4000;
              ((hd) this).field_m[10] = 3000;
              ((hd) this).field_m[4] = 800;
              ((hd) this).field_m[7] = 2000;
              ((hd) this).field_m[12] = 3200;
              ((hd) this).field_m[11] = 3400;
              ((hd) this).field_m[5] = 800;
              ((hd) this).field_m[8] = 3000;
              ((hd) this).field_e[2] = 3000;
              break L14;
            }
          }
          L19: {
            L20: {
              if (9 != di.field_g) {
                break L20;
              } else {
                ((hd) this).field_m[13] = 3000;
                ((hd) this).field_m[1] = 3000;
                ((hd) this).field_m[14] = 4000;
                ((hd) this).field_m[0] = 4000;
                var6 = 1;
                L21: while (true) {
                  if (13 < var6) {
                    break L20;
                  } else {
                    ((hd) this).field_m[var6] = (int)(600.0 * Math.random()) + 700;
                    var6++;
                    if (var22 != 0) {
                      break L19;
                    } else {
                      if (var22 == 0) {
                        continue L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                }
              }
            }
            L22: {
              if ((di.field_g ^ -1) != -6) {
                break L22;
              } else {
                he.field_k = 180000;
                break L22;
              }
            }
            var6 = 6;
            break L19;
          }
          L23: {
            var7 = 6;
            if (8000 >= var4_int) {
              var6--;
              var7--;
              break L23;
            } else {
              break L23;
            }
          }
          L24: {
            if (((hd) this).field_b == 2) {
              var7 = 0;
              ((hd) this).field_e[0] = 0;
              var6 = 0;
              ((hd) this).field_e[14] = 0;
              break L24;
            } else {
              break L24;
            }
          }
          L25: while (true) {
            L26: {
              L27: {
                if (((hd) this).field_n >= var4_int) {
                  break L27;
                } else {
                  var8_ref_int__ = ((hd) this).field_m;
                  var9_ref_int__ = ((hd) this).field_e;
                  var10 = ((hd) this).field_n;
                  ((hd) this).field_n = 2 * ((hd) this).field_n - 1;
                  stackOut_66_0 = var6 ^ -1;
                  stackIn_86_0 = stackOut_66_0;
                  stackIn_67_0 = stackOut_66_0;
                  if (var22 != 0) {
                    break L26;
                  } else {
                    L28: {
                      if (stackIn_67_0 >= -1) {
                        break L28;
                      } else {
                        var6--;
                        break L28;
                      }
                    }
                    L29: {
                      if ((var7 ^ -1) >= -1) {
                        break L29;
                      } else {
                        var7--;
                        break L29;
                      }
                    }
                    ((hd) this).field_e = new int[((hd) this).field_n];
                    ((hd) this).field_m = new int[((hd) this).field_n];
                    var11 = 0;
                    L30: while (true) {
                      L31: {
                        L32: {
                          if ((var10 - 1 ^ -1) >= (var11 ^ -1)) {
                            break L32;
                          } else {
                            ((hd) this).field_m[var11 * 2] = var8_ref_int__[var11];
                            ((hd) this).field_e[var11 * 2] = var9_ref_int__[var11];
                            var6 = var6 + Math.abs(-var8_ref_int__[1 + var11] + var8_ref_int__[var11]) / 24;
                            var7 = var7 + Math.abs(-var9_ref_int__[1 + var11] + var9_ref_int__[var11]) / 24;
                            stackOut_74_0 = ((hd) this).field_m;
                            stackOut_74_1 = 1 + 2 * var11;
                            stackOut_74_2 = (var8_ref_int__[var11] + var8_ref_int__[1 + var11]) / 2;
                            stackIn_84_0 = stackOut_74_0;
                            stackIn_84_1 = stackOut_74_1;
                            stackIn_84_2 = stackOut_74_2;
                            stackIn_75_0 = stackOut_74_0;
                            stackIn_75_1 = stackOut_74_1;
                            stackIn_75_2 = stackOut_74_2;
                            if (var22 != 0) {
                              break L31;
                            } else {
                              L33: {
                                stackOut_75_0 = (int[]) (Object) stackIn_75_0;
                                stackOut_75_1 = stackIn_75_1;
                                stackOut_75_2 = stackIn_75_2;
                                stackIn_78_0 = stackOut_75_0;
                                stackIn_78_1 = stackOut_75_1;
                                stackIn_78_2 = stackOut_75_2;
                                stackIn_76_0 = stackOut_75_0;
                                stackIn_76_1 = stackOut_75_1;
                                stackIn_76_2 = stackOut_75_2;
                                if ((var6 ^ -1) < -1) {
                                  stackOut_78_0 = (int[]) (Object) stackIn_78_0;
                                  stackOut_78_1 = stackIn_78_1;
                                  stackOut_78_2 = stackIn_78_2;
                                  stackOut_78_3 = -var6 + var5.a(-114, 1 + 2 * var6);
                                  stackIn_79_0 = stackOut_78_0;
                                  stackIn_79_1 = stackOut_78_1;
                                  stackIn_79_2 = stackOut_78_2;
                                  stackIn_79_3 = stackOut_78_3;
                                  break L33;
                                } else {
                                  stackOut_76_0 = (int[]) (Object) stackIn_76_0;
                                  stackOut_76_1 = stackIn_76_1;
                                  stackOut_76_2 = stackIn_76_2;
                                  stackIn_77_0 = stackOut_76_0;
                                  stackIn_77_1 = stackOut_76_1;
                                  stackIn_77_2 = stackOut_76_2;
                                  stackOut_77_0 = (int[]) (Object) stackIn_77_0;
                                  stackOut_77_1 = stackIn_77_1;
                                  stackOut_77_2 = stackIn_77_2;
                                  stackOut_77_3 = 0;
                                  stackIn_79_0 = stackOut_77_0;
                                  stackIn_79_1 = stackOut_77_1;
                                  stackIn_79_2 = stackOut_77_2;
                                  stackIn_79_3 = stackOut_77_3;
                                  break L33;
                                }
                              }
                              L34: {
                                stackIn_79_0[stackIn_79_1] = stackIn_79_2 + stackIn_79_3 * 4;
                                stackOut_79_0 = ((hd) this).field_e;
                                stackOut_79_1 = 1 + 2 * var11;
                                stackOut_79_2 = (var9_ref_int__[var11 - -1] + var9_ref_int__[var11]) / 2;
                                stackOut_79_3 = 4;
                                stackIn_81_0 = stackOut_79_0;
                                stackIn_81_1 = stackOut_79_1;
                                stackIn_81_2 = stackOut_79_2;
                                stackIn_81_3 = stackOut_79_3;
                                stackIn_80_0 = stackOut_79_0;
                                stackIn_80_1 = stackOut_79_1;
                                stackIn_80_2 = stackOut_79_2;
                                stackIn_80_3 = stackOut_79_3;
                                if ((var7 ^ -1) >= -1) {
                                  stackOut_81_0 = (int[]) (Object) stackIn_81_0;
                                  stackOut_81_1 = stackIn_81_1;
                                  stackOut_81_2 = stackIn_81_2;
                                  stackOut_81_3 = stackIn_81_3;
                                  stackOut_81_4 = 0;
                                  stackIn_82_0 = stackOut_81_0;
                                  stackIn_82_1 = stackOut_81_1;
                                  stackIn_82_2 = stackOut_81_2;
                                  stackIn_82_3 = stackOut_81_3;
                                  stackIn_82_4 = stackOut_81_4;
                                  break L34;
                                } else {
                                  stackOut_80_0 = (int[]) (Object) stackIn_80_0;
                                  stackOut_80_1 = stackIn_80_1;
                                  stackOut_80_2 = stackIn_80_2;
                                  stackOut_80_3 = stackIn_80_3;
                                  stackOut_80_4 = -var7 + var5.a(96, 2 * var7 + 1);
                                  stackIn_82_0 = stackOut_80_0;
                                  stackIn_82_1 = stackOut_80_1;
                                  stackIn_82_2 = stackOut_80_2;
                                  stackIn_82_3 = stackOut_80_3;
                                  stackIn_82_4 = stackOut_80_4;
                                  break L34;
                                }
                              }
                              stackIn_82_0[stackIn_82_1] = stackIn_82_2 - -(stackIn_82_3 * stackIn_82_4);
                              var6 = var6 - Math.abs(-var8_ref_int__[var11 - -1] + var8_ref_int__[var11]) / 24;
                              var7 = var7 - Math.abs(-var9_ref_int__[1 + var11] + var9_ref_int__[var11]) / 24;
                              var11++;
                              if (var22 == 0) {
                                continue L30;
                              } else {
                                break L32;
                              }
                            }
                          }
                        }
                        ((hd) this).field_m[-1 + ((hd) this).field_n] = var8_ref_int__[var10 - 1];
                        stackOut_83_0 = ((hd) this).field_e;
                        stackOut_83_1 = ((hd) this).field_n + -1;
                        stackOut_83_2 = var9_ref_int__[-1 + var10];
                        stackIn_84_0 = stackOut_83_0;
                        stackIn_84_1 = stackOut_83_1;
                        stackIn_84_2 = stackOut_83_2;
                        break L31;
                      }
                      stackIn_84_0[stackIn_84_1] = stackIn_84_2;
                      if (var22 == 0) {
                        continue L25;
                      } else {
                        break L27;
                      }
                    }
                  }
                }
              }
              stackOut_85_0 = 0;
              stackIn_86_0 = stackOut_85_0;
              break L26;
            }
            var8 = stackIn_86_0;
            var9 = 10000;
            var10 = 0;
            L35: while (true) {
              L36: {
                L37: {
                  if (var10 >= ((hd) this).field_n) {
                    break L37;
                  } else {
                    stackOut_88_0 = ((hd) this).field_m[var10] ^ -1;
                    stackOut_88_1 = var8 ^ -1;
                    stackIn_102_0 = stackOut_88_0;
                    stackIn_102_1 = stackOut_88_1;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    if (var22 != 0) {
                      break L36;
                    } else {
                      L38: {
                        if (stackIn_89_0 < stackIn_89_1) {
                          var8 = ((hd) this).field_m[var10];
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                      L39: {
                        if ((var9 ^ -1) >= (((hd) this).field_m[var10] ^ -1)) {
                          break L39;
                        } else {
                          var9 = ((hd) this).field_m[var10];
                          break L39;
                        }
                      }
                      L40: {
                        if ((((hd) this).field_e[var10] ^ -1) < (var8 ^ -1)) {
                          var8 = ((hd) this).field_e[var10];
                          break L40;
                        } else {
                          break L40;
                        }
                      }
                      L41: {
                        if ((((hd) this).field_e[var10] ^ -1) <= (var9 ^ -1)) {
                          break L41;
                        } else {
                          var9 = ((hd) this).field_e[var10];
                          break L41;
                        }
                      }
                      var10++;
                      if (var22 == 0) {
                        continue L35;
                      } else {
                        break L37;
                      }
                    }
                  }
                }
                stackOut_101_0 = 0;
                stackOut_101_1 = param2 ^ -1;
                stackIn_102_0 = stackOut_101_0;
                stackIn_102_1 = stackOut_101_1;
                break L36;
              }
              L42: {
                L43: {
                  if (stackIn_102_0 != stackIn_102_1) {
                    break L43;
                  } else {
                    var10 = 0;
                    L44: while (true) {
                      if (((hd) this).field_n <= var10) {
                        break L43;
                      } else {
                        var11_ref_int__ = ((hd) this).field_m;
                        var12 = var10;
                        ((hd) this).field_e[var10] = 0;
                        var11_ref_int__[var12] = 0;
                        var10++;
                        if (var22 != 0) {
                          break L42;
                        } else {
                          if (var22 == 0) {
                            continue L44;
                          } else {
                            break L43;
                          }
                        }
                      }
                    }
                  }
                }
                ((hd) this).field_f = new int[((hd) this).field_n];
                break L42;
              }
              L45: {
                L46: {
                  L47: {
                    if (-1 == param2) {
                      break L47;
                    } else {
                      L48: {
                        var10 = 2048;
                        if (-4 != (((hd) this).field_b ^ -1)) {
                          break L48;
                        } else {
                          L49: {
                            var12 = ((hd) this).field_n / 2;
                            var13 = 5000;
                            if ((var13 ^ -1) < (((hd) this).field_n / 4 ^ -1)) {
                              var13 = 4;
                              break L49;
                            } else {
                              break L49;
                            }
                          }
                          var14 = -var13 + var12;
                          L50: while (true) {
                            L51: {
                              L52: {
                                if (var13 + var12 < var14) {
                                  break L52;
                                } else {
                                  ((hd) this).field_m[var14] = ((hd) this).field_m[var14] / 2;
                                  ((hd) this).field_e[var14] = ((hd) this).field_m[var14];
                                  var14++;
                                  if (var22 != 0) {
                                    break L51;
                                  } else {
                                    if (var22 == 0) {
                                      continue L50;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                              }
                              var14 = 0;
                              break L51;
                            }
                            L53: while (true) {
                              if ((var14 ^ -1) <= -1001) {
                                break L48;
                              } else {
                                var15_int = -var13 + (var12 + -var14);
                                ((hd) this).field_m[var15_int] = (var14 * ((hd) this).field_m[var15_int] + (1000 - var14) * ((hd) this).field_m[var15_int] / 2) / 1000;
                                ((hd) this).field_e[var15_int] = (((hd) this).field_e[var15_int] * var14 + ((hd) this).field_m[var15_int] * (-var14 + 1000)) / 1000;
                                var15_int = var14 + var12 - -var13;
                                ((hd) this).field_m[var15_int] = (((hd) this).field_m[var15_int] * var14 + ((hd) this).field_m[var15_int] * (1000 - var14) / 2) / 1000;
                                ((hd) this).field_e[var15_int] = (((hd) this).field_m[var15_int] * (-var14 + 1000) - -(((hd) this).field_e[var15_int] * var14)) / 1000;
                                var14++;
                                if (var22 != 0) {
                                  break L46;
                                } else {
                                  if (var22 == 0) {
                                    continue L53;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var11 = 2400;
                      var12 = 0;
                      L54: while (true) {
                        L55: {
                          L56: {
                            if ((var12 ^ -1) <= (((hd) this).field_n ^ -1)) {
                              break L56;
                            } else {
                              ((hd) this).field_m[var12] = (-64 + -var9 + ((hd) this).field_m[var12]) * var10 / (-var9 + var8);
                              ((hd) this).field_e[var12] = (((hd) this).field_e[var12] - (var9 - -64)) * var11 / (var8 - var9);
                              stackOut_126_0 = 2;
                              stackOut_126_1 = ((hd) this).field_b;
                              stackIn_146_0 = stackOut_126_0;
                              stackIn_146_1 = stackOut_126_1;
                              stackIn_127_0 = stackOut_126_0;
                              stackIn_127_1 = stackOut_126_1;
                              if (var22 != 0) {
                                break L55;
                              } else {
                                L57: {
                                  if (stackIn_127_0 != stackIn_127_1) {
                                    L58: {
                                      if (-513 >= (((hd) this).field_m[var12] ^ -1)) {
                                        break L58;
                                      } else {
                                        ((hd) this).field_m[var12] = ((hd) this).field_m[var12] * ((hd) this).field_m[var12] / 512;
                                        break L58;
                                      }
                                    }
                                    L59: {
                                      if ((((hd) this).field_m[var12] ^ -1) >= (((hd) this).field_e[var12] ^ -1)) {
                                        break L59;
                                      } else {
                                        ((hd) this).field_e[var12] = ((hd) this).field_m[var12];
                                        break L59;
                                      }
                                    }
                                    L60: {
                                      if ((((hd) this).field_e[var12] ^ -1) > (((hd) this).field_m[var12] - -1024 ^ -1)) {
                                        ((hd) this).field_e[var12] = ((hd) this).field_m[var12];
                                        break L60;
                                      } else {
                                        break L60;
                                      }
                                    }
                                    L61: {
                                      if (((hd) this).field_m[var12] < ((hd) this).field_e[var12]) {
                                        break L61;
                                      } else {
                                        ((hd) this).field_f[var12] = ((hd) this).field_m[var12];
                                        if (var22 == 0) {
                                          break L57;
                                        } else {
                                          break L61;
                                        }
                                      }
                                    }
                                    var13 = ((hd) this).field_e[var12] + -((hd) this).field_m[var12];
                                    ((hd) this).field_f[var12] = ((hd) this).field_e[var12] - (-1024 + var13) / 2 - 80;
                                    break L57;
                                  } else {
                                    break L57;
                                  }
                                }
                                L62: {
                                  if ((((hd) this).field_b ^ -1) == -5) {
                                    var13_ref_int__ = ((hd) this).field_m;
                                    var14 = var12;
                                    var15 = ((hd) this).field_f;
                                    var16 = var12;
                                    ((hd) this).field_e[var12] = 0;
                                    var15[var16] = 0;
                                    var13_ref_int__[var14] = 0;
                                    break L62;
                                  } else {
                                    break L62;
                                  }
                                }
                                var12++;
                                if (var22 == 0) {
                                  continue L54;
                                } else {
                                  break L56;
                                }
                              }
                            }
                          }
                          stackOut_145_0 = 2;
                          stackOut_145_1 = ((hd) this).field_b;
                          stackIn_146_0 = stackOut_145_0;
                          stackIn_146_1 = stackOut_145_1;
                          break L55;
                        }
                        L63: {
                          if (stackIn_146_0 != stackIn_146_1) {
                            break L63;
                          } else {
                            var12 = 1;
                            L64: while (true) {
                              L65: {
                                if ((var12 ^ -1) <= (((hd) this).field_n + -1 ^ -1)) {
                                  break L65;
                                } else {
                                  stackOut_149_0 = ((hd) this).field_e[var12];
                                  stackOut_149_1 = ((hd) this).field_m[var12];
                                  stackIn_195_0 = stackOut_149_0;
                                  stackIn_195_1 = stackOut_149_1;
                                  stackIn_150_0 = stackOut_149_0;
                                  stackIn_150_1 = stackOut_149_1;
                                  if (var22 != 0) {
                                    break L45;
                                  } else {
                                    L66: {
                                      if (stackIn_150_0 < stackIn_150_1) {
                                        ((hd) this).field_m[var12] = ((hd) this).field_e[var12];
                                        break L66;
                                      } else {
                                        break L66;
                                      }
                                    }
                                    L67: {
                                      if (-1001 >= (((hd) this).field_m[var12] ^ -1)) {
                                        break L67;
                                      } else {
                                        ((hd) this).field_m[var12] = 1000 + ((hd) this).field_m[var12] + -1000;
                                        break L67;
                                      }
                                    }
                                    L68: {
                                      if ((((hd) this).field_m[var12] ^ -1) >= -1001) {
                                        break L68;
                                      } else {
                                        ((hd) this).field_m[var12] = (-1000 + ((hd) this).field_m[var12]) / 5 + 1000;
                                        break L68;
                                      }
                                    }
                                    ((hd) this).field_e[var12] = ((hd) this).field_m[var12];
                                    ((hd) this).field_f[var12] = ((hd) this).field_m[var12];
                                    var12++;
                                    if (var22 == 0) {
                                      continue L64;
                                    } else {
                                      break L65;
                                    }
                                  }
                                }
                              }
                              if (var22 == 0) {
                                break L47;
                              } else {
                                break L63;
                              }
                            }
                          }
                        }
                        var12 = 1;
                        L69: while (true) {
                          stackOut_161_0 = var12 ^ -1;
                          stackOut_161_1 = -1 + ((hd) this).field_n ^ -1;
                          stackIn_162_0 = stackOut_161_0;
                          stackIn_162_1 = stackOut_161_1;
                          L70: while (true) {
                            if (stackIn_162_0 <= stackIn_162_1) {
                              break L47;
                            } else {
                              stackOut_163_0 = ((hd) this).field_f[var12] ^ -1;
                              stackOut_163_1 = ((hd) this).field_e[var12] ^ -1;
                              stackIn_195_0 = stackOut_163_0;
                              stackIn_195_1 = stackOut_163_1;
                              stackIn_164_0 = stackOut_163_0;
                              stackIn_164_1 = stackOut_163_1;
                              if (var22 != 0) {
                                break L45;
                              } else {
                                L71: {
                                  if (stackIn_164_0 <= stackIn_164_1) {
                                    break L71;
                                  } else {
                                    L72: {
                                      L73: {
                                        var13 = -((hd) this).field_m[var12] + ((hd) this).field_e[var12];
                                        if (((hd) this).field_e[-1 + var12] != ((hd) this).field_f[var12 + -1]) {
                                          break L73;
                                        } else {
                                          var14 = 1;
                                          L74: while (true) {
                                            if ((var14 ^ -1) <= (var13 ^ -1)) {
                                              break L73;
                                            } else {
                                              stackOut_169_0 = 0;
                                              stackOut_169_1 = -var14 + var12;
                                              stackIn_180_0 = stackOut_169_0;
                                              stackIn_180_1 = stackOut_169_1;
                                              stackIn_170_0 = stackOut_169_0;
                                              stackIn_170_1 = stackOut_169_1;
                                              if (var22 != 0) {
                                                break L72;
                                              } else {
                                                if (stackIn_170_0 > stackIn_170_1) {
                                                  break L73;
                                                } else {
                                                  L75: {
                                                    var15_int = -((-var14 + var13) * 2 / var13) + (((hd) this).field_m[-var14 + var12] + (-var14 + var13) * (-var14 + var13) / var13);
                                                    if ((((hd) this).field_f[var12 + -var14] ^ -1) > (var15_int ^ -1)) {
                                                      ((hd) this).field_f[var12 - var14] = var15_int;
                                                      break L75;
                                                    } else {
                                                      break L75;
                                                    }
                                                  }
                                                  L76: {
                                                    if ((((hd) this).field_e[var12 + -var14] ^ -1) > (var15_int ^ -1)) {
                                                      ((hd) this).field_e[-var14 + var12] = var15_int;
                                                      break L76;
                                                    } else {
                                                      break L76;
                                                    }
                                                  }
                                                  var14++;
                                                  if (var22 == 0) {
                                                    continue L74;
                                                  } else {
                                                    break L73;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_179_0 = ((hd) this).field_e[var12 - -1];
                                      stackOut_179_1 = ((hd) this).field_f[var12 + 1];
                                      stackIn_180_0 = stackOut_179_0;
                                      stackIn_180_1 = stackOut_179_1;
                                      break L72;
                                    }
                                    if (stackIn_180_0 == stackIn_180_1) {
                                      var14 = 1;
                                      L77: while (true) {
                                        if ((var13 ^ -1) >= (var14 ^ -1)) {
                                          break L71;
                                        } else {
                                          stackOut_184_0 = var12 + var14;
                                          stackOut_184_1 = ((hd) this).field_n;
                                          stackIn_162_0 = stackOut_184_0;
                                          stackIn_162_1 = stackOut_184_1;
                                          stackIn_185_0 = stackOut_184_0;
                                          stackIn_185_1 = stackOut_184_1;
                                          if (var22 != 0) {
                                            continue L70;
                                          } else {
                                            if (stackIn_185_0 >= stackIn_185_1) {
                                              break L71;
                                            } else {
                                              L78: {
                                                var15_int = ((hd) this).field_m[var12 + var14] + ((-var14 + var13) * (var13 - var14) / var13 - (var13 + -var14) * 2 / var13);
                                                if ((((hd) this).field_f[var12 - -var14] ^ -1) > (var15_int ^ -1)) {
                                                  ((hd) this).field_f[var12 + var14] = var15_int;
                                                  break L78;
                                                } else {
                                                  break L78;
                                                }
                                              }
                                              L79: {
                                                if (var15_int <= ((hd) this).field_e[var14 + var12]) {
                                                  break L79;
                                                } else {
                                                  ((hd) this).field_e[var12 - -var14] = var15_int;
                                                  break L79;
                                                }
                                              }
                                              var14++;
                                              if (var22 == 0) {
                                                continue L77;
                                              } else {
                                                break L71;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L71;
                                    }
                                  }
                                }
                                var12++;
                                if (var22 == 0) {
                                  continue L69;
                                } else {
                                  break L47;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  ((hd) this).field_h = new int[((hd) this).field_p];
                  ((hd) this).field_j = new int[((hd) this).field_p];
                  break L46;
                }
                stackOut_194_0 = 4;
                stackOut_194_1 = ((hd) this).field_b;
                stackIn_195_0 = stackOut_194_0;
                stackIn_195_1 = stackOut_194_1;
                break L45;
              }
              L80: {
                L81: {
                  if (stackIn_195_0 != stackIn_195_1) {
                    break L81;
                  } else {
                    var10 = 0;
                    L82: while (true) {
                      stackOut_197_0 = -3;
                      stackIn_198_0 = stackOut_197_0;
                      L83: while (true) {
                        L84: {
                          L85: {
                            if (stackIn_198_0 >= (var10 ^ -1)) {
                              break L85;
                            } else {
                              var11 = 6000;
                              var12 = 1200;
                              var13 = ((hd) this).field_n / 6;
                              stackOut_199_0 = var10;
                              stackIn_257_0 = stackOut_199_0;
                              stackIn_200_0 = stackOut_199_0;
                              if (var22 != 0) {
                                break L84;
                              } else {
                                L86: {
                                  if (stackIn_200_0 != 0) {
                                    break L86;
                                  } else {
                                    var13 = -var13 + ((hd) this).field_n;
                                    break L86;
                                  }
                                }
                                L87: {
                                  L88: {
                                    var14 = kc.field_x[4][0].field_z;
                                    ((hd) this).field_o[((hd) this).field_c] = var13;
                                    ((hd) this).field_j[((hd) this).field_c] = -1;
                                    var12 = 16 * var14;
                                    var13 = var13 - var12 / 2;
                                    ((hd) this).field_h[((hd) this).field_c] = var11;
                                    var15_int = var13;
                                    var16_ref_wk = kc.field_x[4][0];
                                    if (-1 == (var10 ^ -1)) {
                                      break L88;
                                    } else {
                                      var13 = var13 + (-var16_ref_wk.field_A + var16_ref_wk.field_z + -var16_ref_wk.field_D << 1259828164);
                                      if (var22 == 0) {
                                        break L87;
                                      } else {
                                        break L88;
                                      }
                                    }
                                  }
                                  var13 = var13 + (var16_ref_wk.field_D << 711175812);
                                  break L87;
                                }
                                L89: {
                                  var12 = var16_ref_wk.field_A << 298004324;
                                  if (-2 != (var10 ^ -1)) {
                                    break L89;
                                  } else {
                                    var13 = var13 + var12;
                                    break L89;
                                  }
                                }
                                var17 = 0;
                                L90: while (true) {
                                  L91: {
                                    L92: {
                                      if (var17 >= var12) {
                                        break L92;
                                      } else {
                                        var18 = var17 >> 192803268;
                                        stackOut_210_0 = 0;
                                        stackIn_229_0 = stackOut_210_0;
                                        stackIn_211_0 = stackOut_210_0;
                                        if (var22 != 0) {
                                          break L91;
                                        } else {
                                          var19 = stackIn_211_0;
                                          L93: while (true) {
                                            L94: {
                                              L95: {
                                                if (var16_ref_wk.field_F <= var19) {
                                                  break L95;
                                                } else {
                                                  stackOut_213_0 = var18 + (var12 >> -579100092) * var19;
                                                  stackOut_213_1 = var16_ref_wk.field_E.length;
                                                  stackIn_221_0 = stackOut_213_0;
                                                  stackIn_221_1 = stackOut_213_1;
                                                  stackIn_214_0 = stackOut_213_0;
                                                  stackIn_214_1 = stackOut_213_1;
                                                  if (var22 != 0) {
                                                    break L94;
                                                  } else {
                                                    if (stackIn_214_0 >= stackIn_214_1) {
                                                      break L95;
                                                    } else {
                                                      if (0 != var16_ref_wk.field_E[var18 + (var12 >> -24029148) * var19]) {
                                                        break L95;
                                                      } else {
                                                        var19++;
                                                        if (var22 == 0) {
                                                          continue L93;
                                                        } else {
                                                          break L95;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_220_0 = var16_ref_wk.field_F;
                                              stackOut_220_1 = var19;
                                              stackIn_221_0 = stackOut_220_0;
                                              stackIn_221_1 = stackOut_220_1;
                                              break L94;
                                            }
                                            L96: {
                                              if (stackIn_221_0 <= stackIn_221_1) {
                                                break L96;
                                              } else {
                                                ((hd) this).field_m[var13] = var11 + -(var19 + var16_ref_wk.field_H) * 16;
                                                ((hd) this).field_e[var13] = ((hd) this).field_m[var13];
                                                ((hd) this).field_f[var13] = ((hd) this).field_m[var13];
                                                break L96;
                                              }
                                            }
                                            L97: {
                                              L98: {
                                                if (-1 == (var10 ^ -1)) {
                                                  break L98;
                                                } else {
                                                  var13--;
                                                  if (var22 == 0) {
                                                    break L97;
                                                  } else {
                                                    break L98;
                                                  }
                                                }
                                              }
                                              var13++;
                                              break L97;
                                            }
                                            var17++;
                                            if (var22 == 0) {
                                              continue L90;
                                            } else {
                                              break L92;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var13 = var15_int;
                                    var16_ref_wk = kc.field_x[4][1];
                                    var12 = var16_ref_wk.field_A << -790853180;
                                    stackOut_228_0 = 0;
                                    stackIn_229_0 = stackOut_228_0;
                                    break L91;
                                  }
                                  L99: {
                                    L100: {
                                      if (stackIn_229_0 == var10) {
                                        break L100;
                                      } else {
                                        var13 = var13 + (var16_ref_wk.field_z - (var16_ref_wk.field_A + var16_ref_wk.field_D) << 312423460);
                                        if (var22 == 0) {
                                          break L99;
                                        } else {
                                          break L100;
                                        }
                                      }
                                    }
                                    var13 = var13 + (var16_ref_wk.field_D << -179703068);
                                    break L99;
                                  }
                                  L101: {
                                    if (-2 != (var10 ^ -1)) {
                                      break L101;
                                    } else {
                                      var13 = var13 + var12;
                                      break L101;
                                    }
                                  }
                                  var17 = 0;
                                  L102: while (true) {
                                    L103: {
                                      if (var17 >= var12) {
                                        break L103;
                                      } else {
                                        var18 = var17 >> 762111236;
                                        stackOut_236_0 = 0;
                                        stackIn_198_0 = stackOut_236_0;
                                        stackIn_237_0 = stackOut_236_0;
                                        if (var22 != 0) {
                                          continue L83;
                                        } else {
                                          var19 = stackIn_237_0;
                                          L104: while (true) {
                                            L105: {
                                              L106: {
                                                if (var16_ref_wk.field_F <= var19) {
                                                  break L106;
                                                } else {
                                                  stackOut_239_0 = var18 + (var12 >> -1710219484) * var19;
                                                  stackOut_239_1 = var16_ref_wk.field_E.length;
                                                  stackIn_247_0 = stackOut_239_0;
                                                  stackIn_247_1 = stackOut_239_1;
                                                  stackIn_240_0 = stackOut_239_0;
                                                  stackIn_240_1 = stackOut_239_1;
                                                  if (var22 != 0) {
                                                    break L105;
                                                  } else {
                                                    if (stackIn_240_0 >= stackIn_240_1) {
                                                      break L106;
                                                    } else {
                                                      if (0 != var16_ref_wk.field_E[var18 + (var12 >> -498794108) * var19]) {
                                                        break L106;
                                                      } else {
                                                        var19++;
                                                        if (var22 == 0) {
                                                          continue L104;
                                                        } else {
                                                          break L106;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_246_0 = var16_ref_wk.field_F;
                                              stackOut_246_1 = var19;
                                              stackIn_247_0 = stackOut_246_0;
                                              stackIn_247_1 = stackOut_246_1;
                                              break L105;
                                            }
                                            L107: {
                                              if (stackIn_247_0 > stackIn_247_1) {
                                                ((hd) this).field_e[var13] = var11 + -(var16_ref_wk.field_H + var19) * 16;
                                                ((hd) this).field_f[var13] = -1 + ((hd) this).field_e[var13];
                                                break L107;
                                              } else {
                                                break L107;
                                              }
                                            }
                                            L108: {
                                              L109: {
                                                if (-1 == (var10 ^ -1)) {
                                                  break L109;
                                                } else {
                                                  var13--;
                                                  if (var22 == 0) {
                                                    break L108;
                                                  } else {
                                                    break L109;
                                                  }
                                                }
                                              }
                                              var13++;
                                              break L108;
                                            }
                                            var17++;
                                            if (var22 == 0) {
                                              continue L102;
                                            } else {
                                              break L103;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    ((hd) this).field_c = ((hd) this).field_c + 1;
                                    var10++;
                                    if (var22 == 0) {
                                      continue L82;
                                    } else {
                                      break L85;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_256_0 = 0;
                          stackIn_257_0 = stackOut_256_0;
                          break L84;
                        }
                        var10 = stackIn_257_0;
                        L110: while (true) {
                          stackOut_258_0 = 11;
                          stackIn_259_0 = stackOut_258_0;
                          L111: while (true) {
                            L112: {
                              L113: {
                                if (stackIn_259_0 <= var10) {
                                  break L113;
                                } else {
                                  var11 = -var5.a(75, 6000) + 8000;
                                  var12 = 1200;
                                  var13 = (var10 - 5) * 2150 + ((hd) this).field_n / 2;
                                  var14 = var5.a(22, 5) + 1;
                                  var15_int = kc.field_x[1][var14].field_z;
                                  ((hd) this).field_o[((hd) this).field_c] = var13;
                                  ((hd) this).field_j[((hd) this).field_c] = var14;
                                  var12 = var15_int * 16;
                                  var13 = var13 - var12 / 8;
                                  ((hd) this).field_h[((hd) this).field_c] = var11;
                                  var16_ref_wk = kc.field_x[1][var14];
                                  var17 = 2;
                                  var12 = var16_ref_wk.field_A << var17;
                                  var13 = var13 + (var16_ref_wk.field_D << var17);
                                  stackOut_260_0 = 0;
                                  stackIn_288_0 = stackOut_260_0;
                                  stackIn_261_0 = stackOut_260_0;
                                  if (var22 != 0) {
                                    break L112;
                                  } else {
                                    var18 = stackIn_261_0;
                                    L114: while (true) {
                                      stackOut_262_0 = var18;
                                      stackOut_262_1 = var12;
                                      stackIn_263_0 = stackOut_262_0;
                                      stackIn_263_1 = stackOut_262_1;
                                      L115: while (true) {
                                        L116: {
                                          if (stackIn_263_0 >= stackIn_263_1) {
                                            break L116;
                                          } else {
                                            var19 = var18 >> var17;
                                            stackOut_264_0 = 0;
                                            stackIn_259_0 = stackOut_264_0;
                                            stackIn_265_0 = stackOut_264_0;
                                            if (var22 != 0) {
                                              continue L111;
                                            } else {
                                              var20 = stackIn_265_0;
                                              L117: while (true) {
                                                L118: {
                                                  if (var20 >= var16_ref_wk.field_F) {
                                                    break L118;
                                                  } else {
                                                    stackOut_267_0 = var16_ref_wk.field_E.length;
                                                    stackOut_267_1 = var20 * (var12 >> var17) + var19;
                                                    stackIn_263_0 = stackOut_267_0;
                                                    stackIn_263_1 = stackOut_267_1;
                                                    stackIn_268_0 = stackOut_267_0;
                                                    stackIn_268_1 = stackOut_267_1;
                                                    if (var22 != 0) {
                                                      continue L115;
                                                    } else {
                                                      if (stackIn_268_0 <= stackIn_268_1) {
                                                        break L118;
                                                      } else {
                                                        if (-1 != (-16777216 & var16_ref_wk.field_E[var19 - -(var20 * (var12 >> var17))] ^ -1)) {
                                                          break L118;
                                                        } else {
                                                          var20++;
                                                          if (var22 == 0) {
                                                            continue L117;
                                                          } else {
                                                            break L118;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var21 = var20;
                                                L119: while (true) {
                                                  L120: {
                                                    L121: {
                                                      if ((var16_ref_wk.field_F ^ -1) >= (var21 ^ -1)) {
                                                        break L121;
                                                      } else {
                                                        stackOut_275_0 = var21 * (var12 >> var17) + var19 ^ -1;
                                                        stackOut_275_1 = var16_ref_wk.field_E.length ^ -1;
                                                        stackIn_283_0 = stackOut_275_0;
                                                        stackIn_283_1 = stackOut_275_1;
                                                        stackIn_276_0 = stackOut_275_0;
                                                        stackIn_276_1 = stackOut_275_1;
                                                        if (var22 != 0) {
                                                          break L120;
                                                        } else {
                                                          if (stackIn_276_0 <= stackIn_276_1) {
                                                            break L121;
                                                          } else {
                                                            if (-1 == (var16_ref_wk.field_E[(var12 >> var17) * var21 + var19] & -16777216 ^ -1)) {
                                                              break L121;
                                                            } else {
                                                              var21++;
                                                              if (var22 == 0) {
                                                                continue L119;
                                                              } else {
                                                                break L121;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    stackOut_282_0 = var16_ref_wk.field_F ^ -1;
                                                    stackOut_282_1 = var20 ^ -1;
                                                    stackIn_283_0 = stackOut_282_0;
                                                    stackIn_283_1 = stackOut_282_1;
                                                    break L120;
                                                  }
                                                  L122: {
                                                    if (stackIn_283_0 >= stackIn_283_1) {
                                                      break L122;
                                                    } else {
                                                      ((hd) this).field_e[var13] = var11 + (-(var20 + var16_ref_wk.field_H) << var17);
                                                      ((hd) this).field_f[var13] = (-(var16_ref_wk.field_H + var21) << var17) + var11;
                                                      break L122;
                                                    }
                                                  }
                                                  var13++;
                                                  var18++;
                                                  if (var22 == 0) {
                                                    continue L114;
                                                  } else {
                                                    break L116;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        ((hd) this).field_c = ((hd) this).field_c + 1;
                                        var10++;
                                        if (var22 == 0) {
                                          continue L110;
                                        } else {
                                          break L113;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_287_0 = 1;
                              stackIn_288_0 = stackOut_287_0;
                              break L112;
                            }
                            var10 = stackIn_288_0;
                            L123: while (true) {
                              stackOut_289_0 = ((hd) this).field_n - 1 ^ -1;
                              stackOut_289_1 = var10 ^ -1;
                              stackIn_290_0 = stackOut_289_0;
                              stackIn_290_1 = stackOut_289_1;
                              L124: while (true) {
                                if (stackIn_290_0 >= stackIn_290_1) {
                                  break L81;
                                } else {
                                  stackOut_291_0 = ((hd) this).field_f[var10];
                                  stackOut_291_1 = ((hd) this).field_e[var10];
                                  stackIn_323_0 = stackOut_291_0;
                                  stackIn_323_1 = stackOut_291_1;
                                  stackIn_292_0 = stackOut_291_0;
                                  stackIn_292_1 = stackOut_291_1;
                                  if (var22 != 0) {
                                    break L80;
                                  } else {
                                    L125: {
                                      if (stackIn_292_0 >= stackIn_292_1) {
                                        break L125;
                                      } else {
                                        L126: {
                                          L127: {
                                            var11 = 200;
                                            var12 = ((hd) this).field_e[var10];
                                            if (((hd) this).field_e[-1 + var10] != ((hd) this).field_f[-1 + var10]) {
                                              break L127;
                                            } else {
                                              var13 = 1;
                                              L128: while (true) {
                                                if (var11 <= var13) {
                                                  break L127;
                                                } else {
                                                  stackOut_297_0 = -var13 + var10;
                                                  stackIn_308_0 = stackOut_297_0;
                                                  stackIn_298_0 = stackOut_297_0;
                                                  if (var22 != 0) {
                                                    break L126;
                                                  } else {
                                                    if (stackIn_298_0 < 0) {
                                                      break L127;
                                                    } else {
                                                      L129: {
                                                        if (((hd) this).field_f[var10 - var13] >= var12) {
                                                          break L129;
                                                        } else {
                                                          ((hd) this).field_f[var10 - var13] = var12;
                                                          break L129;
                                                        }
                                                      }
                                                      L130: {
                                                        if (var12 > ((hd) this).field_e[var10 - var13]) {
                                                          ((hd) this).field_e[-var13 + var10] = var12;
                                                          break L130;
                                                        } else {
                                                          break L130;
                                                        }
                                                      }
                                                      var13++;
                                                      if (var22 == 0) {
                                                        continue L128;
                                                      } else {
                                                        break L127;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          stackOut_307_0 = ((hd) this).field_f[1 + var10] ^ -1;
                                          stackIn_308_0 = stackOut_307_0;
                                          break L126;
                                        }
                                        if (stackIn_308_0 == (((hd) this).field_e[var10 + 1] ^ -1)) {
                                          var13 = 1;
                                          L131: while (true) {
                                            if (var13 >= var11) {
                                              break L125;
                                            } else {
                                              stackOut_312_0 = var10 - -var13;
                                              stackOut_312_1 = ((hd) this).field_n;
                                              stackIn_290_0 = stackOut_312_0;
                                              stackIn_290_1 = stackOut_312_1;
                                              stackIn_313_0 = stackOut_312_0;
                                              stackIn_313_1 = stackOut_312_1;
                                              if (var22 != 0) {
                                                continue L124;
                                              } else {
                                                if (stackIn_313_0 >= stackIn_313_1) {
                                                  break L125;
                                                } else {
                                                  L132: {
                                                    if (var12 > ((hd) this).field_f[var10 + var13]) {
                                                      ((hd) this).field_f[var13 + var10] = var12;
                                                      break L132;
                                                    } else {
                                                      break L132;
                                                    }
                                                  }
                                                  L133: {
                                                    if ((((hd) this).field_e[var13 + var10] ^ -1) <= (var12 ^ -1)) {
                                                      break L133;
                                                    } else {
                                                      ((hd) this).field_e[var10 - -var13] = var12;
                                                      break L133;
                                                    }
                                                  }
                                                  var13++;
                                                  if (var22 == 0) {
                                                    continue L131;
                                                  } else {
                                                    break L125;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L125;
                                        }
                                      }
                                    }
                                    var10++;
                                    if (var22 == 0) {
                                      continue L123;
                                    } else {
                                      break L81;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_322_0 = -1;
                stackOut_322_1 = ((hd) this).field_b ^ -1;
                stackIn_323_0 = stackOut_322_0;
                stackIn_323_1 = stackOut_322_1;
                break L80;
              }
              L134: {
                L135: {
                  L136: {
                    if (stackIn_323_0 != stackIn_323_1) {
                      break L136;
                    } else {
                      var10 = kc.field_x[((hd) this).field_b].length;
                      var11 = ((hd) this).field_n / 8;
                      L137: while (true) {
                        L138: {
                          if ((-(((hd) this).field_n / 8) + ((hd) this).field_n ^ -1) >= (var11 ^ -1)) {
                            break L138;
                          } else {
                            var12 = ((hd) this).field_e[var11];
                            if (var22 != 0) {
                              break L135;
                            } else {
                              L139: {
                                if ((((hd) this).field_n + -(((hd) this).field_n / 16) ^ -1) >= (var11 ^ -1)) {
                                  break L139;
                                } else {
                                  if ((((hd) this).field_p ^ -1) < (((hd) this).field_c ^ -1)) {
                                    ((hd) this).field_o[((hd) this).field_c] = var11;
                                    var13 = var5.a(-115, var10);
                                    ((hd) this).field_j[((hd) this).field_c] = var13;
                                    var14_ref_wk = kc.field_x[((hd) this).field_b][var13];
                                    var11 = var11 - var14_ref_wk.field_z * 2;
                                    var15_int = var14_ref_wk.field_A * 4;
                                    var11 = var11 + var14_ref_wk.field_D * 4;
                                    var16 = 0;
                                    L140: while (true) {
                                      L141: {
                                        L142: {
                                          if (var15_int <= var16) {
                                            break L142;
                                          } else {
                                            stackOut_334_0 = var12 ^ -1;
                                            stackOut_334_1 = ((hd) this).field_e[var16 + var11] ^ -1;
                                            stackIn_341_0 = stackOut_334_0;
                                            stackIn_341_1 = stackOut_334_1;
                                            stackIn_335_0 = stackOut_334_0;
                                            stackIn_335_1 = stackOut_334_1;
                                            if (var22 != 0) {
                                              break L141;
                                            } else {
                                              L143: {
                                                if (stackIn_335_0 < stackIn_335_1) {
                                                  var12 = ((hd) this).field_e[var11 + var16];
                                                  break L143;
                                                } else {
                                                  break L143;
                                                }
                                              }
                                              var16++;
                                              if (var22 == 0) {
                                                continue L140;
                                              } else {
                                                break L142;
                                              }
                                            }
                                          }
                                        }
                                        ((hd) this).field_h[((hd) this).field_c] = var12 + (4 * var14_ref_wk.field_F + 4 * var14_ref_wk.field_H);
                                        stackOut_340_0 = var12;
                                        stackOut_340_1 = (var14_ref_wk.field_B + var14_ref_wk.field_F) * 4;
                                        stackIn_341_0 = stackOut_340_0;
                                        stackIn_341_1 = stackOut_340_1;
                                        break L141;
                                      }
                                      var12 = stackIn_341_0 + stackIn_341_1;
                                      var16 = 0;
                                      L144: while (true) {
                                        stackOut_342_0 = var16 ^ -1;
                                        stackOut_342_1 = var15_int ^ -1;
                                        stackIn_343_0 = stackOut_342_0;
                                        stackIn_343_1 = stackOut_342_1;
                                        L145: while (true) {
                                          L146: {
                                            L147: {
                                              if (stackIn_343_0 <= stackIn_343_1) {
                                                break L147;
                                              } else {
                                                var17 = var16 / 4;
                                                var18 = 0;
                                                if (var22 != 0) {
                                                  break L146;
                                                } else {
                                                  var11++;
                                                  L148: while (true) {
                                                    L149: {
                                                      if (var14_ref_wk.field_F <= var18) {
                                                        break L149;
                                                      } else {
                                                        stackOut_347_0 = 0;
                                                        stackOut_347_1 = kc.field_x[((hd) this).field_b][var13].field_E[var17 - -(var18 * var14_ref_wk.field_A)];
                                                        stackIn_343_0 = stackOut_347_0;
                                                        stackIn_343_1 = stackOut_347_1;
                                                        stackIn_348_0 = stackOut_347_0;
                                                        stackIn_348_1 = stackOut_347_1;
                                                        if (var22 != 0) {
                                                          continue L145;
                                                        } else {
                                                          if (stackIn_348_0 != stackIn_348_1) {
                                                            break L149;
                                                          } else {
                                                            var18++;
                                                            if (var22 == 0) {
                                                              continue L148;
                                                            } else {
                                                              break L149;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var16++;
                                                    if (var22 == 0) {
                                                      continue L144;
                                                    } else {
                                                      break L147;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            var11 = var11 + (var5.a(-117, 2048) - -(var15_int / 2));
                                            break L146;
                                          }
                                          ((hd) this).field_c = ((hd) this).field_c + 1;
                                          break L139;
                                        }
                                      }
                                    }
                                  } else {
                                    break L139;
                                  }
                                }
                              }
                              var11++;
                              if (var22 == 0) {
                                continue L137;
                              } else {
                                break L138;
                              }
                            }
                          }
                        }
                        if (var22 == 0) {
                          break L135;
                        } else {
                          break L136;
                        }
                      }
                    }
                  }
                  if (-3 != (((hd) this).field_b ^ -1)) {
                    break L135;
                  } else {
                    var10 = kc.field_x[((hd) this).field_b].length;
                    var11 = 0;
                    var12 = ((hd) this).field_n / 8;
                    L150: while (true) {
                      if ((var12 ^ -1) <= (-(((hd) this).field_n / 8) + ((hd) this).field_n ^ -1)) {
                        break L135;
                      } else {
                        var13 = ((hd) this).field_e[var12];
                        if (var22 != 0) {
                          break L134;
                        } else {
                          L151: {
                            if ((var12 ^ -1) <= (((hd) this).field_n + -(((hd) this).field_n / 16) ^ -1)) {
                              break L151;
                            } else {
                              if (((hd) this).field_p <= ((hd) this).field_c) {
                                break L151;
                              } else {
                                L152: {
                                  ((hd) this).field_o[((hd) this).field_c] = var12;
                                  var14 = var5.a(-96, var10);
                                  var11--;
                                  if (var14 > 2) {
                                    break L152;
                                  } else {
                                    if (0 >= var11) {
                                      break L152;
                                    } else {
                                      var14 = var5.a(52, -2 + var10) + 2;
                                      break L152;
                                    }
                                  }
                                }
                                ((hd) this).field_j[((hd) this).field_c] = var14;
                                var15_ref = kc.field_x[((hd) this).field_b][var14];
                                var12 = var12 - 2 * var15_ref.field_z;
                                var16 = var15_ref.field_A * 4;
                                var12 = var12 + 4 * var15_ref.field_D;
                                var17 = 0;
                                L153: while (true) {
                                  L154: {
                                    L155: {
                                      if (var17 >= var16) {
                                        break L155;
                                      } else {
                                        stackOut_371_0 = ((hd) this).field_e[var12 - -var17];
                                        stackOut_371_1 = var13;
                                        stackIn_378_0 = stackOut_371_0;
                                        stackIn_378_1 = stackOut_371_1;
                                        stackIn_372_0 = stackOut_371_0;
                                        stackIn_372_1 = stackOut_371_1;
                                        if (var22 != 0) {
                                          break L154;
                                        } else {
                                          L156: {
                                            if (stackIn_372_0 < stackIn_372_1) {
                                              var13 = ((hd) this).field_e[var12 + var17];
                                              break L156;
                                            } else {
                                              break L156;
                                            }
                                          }
                                          var17++;
                                          if (var22 == 0) {
                                            continue L153;
                                          } else {
                                            break L155;
                                          }
                                        }
                                      }
                                    }
                                    ((hd) this).field_h[((hd) this).field_c] = var13 - -(var15_ref.field_H * 8) - -(8 * var15_ref.field_F);
                                    stackOut_377_0 = var13;
                                    stackOut_377_1 = (var15_ref.field_B + var15_ref.field_F) * 8;
                                    stackIn_378_0 = stackOut_377_0;
                                    stackIn_378_1 = stackOut_377_1;
                                    break L154;
                                  }
                                  var13 = stackIn_378_0 + stackIn_378_1;
                                  var17 = 0;
                                  L157: while (true) {
                                    stackOut_379_0 = var16 ^ -1;
                                    stackOut_379_1 = var17 ^ -1;
                                    stackIn_380_0 = stackOut_379_0;
                                    stackIn_380_1 = stackOut_379_1;
                                    L158: while (true) {
                                      L159: {
                                        L160: {
                                          if (stackIn_380_0 >= stackIn_380_1) {
                                            break L160;
                                          } else {
                                            var18 = var17 / 4;
                                            stackOut_381_0 = 0;
                                            stackIn_390_0 = stackOut_381_0;
                                            stackIn_382_0 = stackOut_381_0;
                                            if (var22 != 0) {
                                              break L159;
                                            } else {
                                              var19 = stackIn_382_0;
                                              L161: while (true) {
                                                L162: {
                                                  if (var15_ref.field_F <= var19) {
                                                    break L162;
                                                  } else {
                                                    stackOut_384_0 = 0;
                                                    stackOut_384_1 = kc.field_x[((hd) this).field_b][var14].field_E[var18 + var19 * var15_ref.field_A];
                                                    stackIn_380_0 = stackOut_384_0;
                                                    stackIn_380_1 = stackOut_384_1;
                                                    stackIn_385_0 = stackOut_384_0;
                                                    stackIn_385_1 = stackOut_384_1;
                                                    if (var22 != 0) {
                                                      continue L158;
                                                    } else {
                                                      if (stackIn_385_0 != stackIn_385_1) {
                                                        break L162;
                                                      } else {
                                                        var19++;
                                                        if (var22 == 0) {
                                                          continue L161;
                                                        } else {
                                                          break L162;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var12++;
                                                var17++;
                                                if (var22 == 0) {
                                                  continue L157;
                                                } else {
                                                  break L160;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_389_0 = var14;
                                        stackIn_390_0 = stackOut_389_0;
                                        break L159;
                                      }
                                      L163: {
                                        L164: {
                                          if (stackIn_390_0 > 1) {
                                            break L164;
                                          } else {
                                            var17 = 0;
                                            L165: while (true) {
                                              L166: {
                                                L167: {
                                                  if ((var17 ^ -1) <= -1001) {
                                                    break L167;
                                                  } else {
                                                    var18 = -var17 + ((hd) this).field_o[((hd) this).field_c] + -1000;
                                                    stackOut_393_0 = var18;
                                                    stackIn_409_0 = stackOut_393_0;
                                                    stackIn_394_0 = stackOut_393_0;
                                                    if (var22 != 0) {
                                                      break L166;
                                                    } else {
                                                      L168: {
                                                        if (stackIn_394_0 < 0) {
                                                          break L168;
                                                        } else {
                                                          if ((var18 ^ -1) > (((hd) this).field_n ^ -1)) {
                                                            ((hd) this).field_e[var18] = ((-var17 + 1000) * 1124 + ((hd) this).field_e[var18] * var17) / 1000;
                                                            ((hd) this).field_m[var18] = (-(0 * var17) - (0 - ((hd) this).field_m[var18] * var17)) / 1000;
                                                            ((hd) this).field_f[var18] = -100 + ((hd) this).field_e[var18];
                                                            if ((((hd) this).field_f[var18] ^ -1) <= (((hd) this).field_m[var18] - -1024 ^ -1)) {
                                                              break L168;
                                                            } else {
                                                              ((hd) this).field_f[var18] = ((hd) this).field_e[var18];
                                                              break L168;
                                                            }
                                                          } else {
                                                            break L168;
                                                          }
                                                        }
                                                      }
                                                      L169: {
                                                        var18 = var17 + (1000 + ((hd) this).field_o[((hd) this).field_c]);
                                                        if ((var18 ^ -1) > -1) {
                                                          break L169;
                                                        } else {
                                                          if (var18 >= ((hd) this).field_n) {
                                                            break L169;
                                                          } else {
                                                            ((hd) this).field_e[var18] = (1124000 + (-(var17 * 1124) + var17 * ((hd) this).field_e[var18])) / 1000;
                                                            ((hd) this).field_m[var18] = (((hd) this).field_m[var18] * var17 + 0 + -(var17 * 0)) / 1000;
                                                            ((hd) this).field_f[var18] = 1024;
                                                            if (((hd) this).field_f[var18] >= ((hd) this).field_m[var18] - -1024) {
                                                              break L169;
                                                            } else {
                                                              ((hd) this).field_f[var18] = ((hd) this).field_e[var18];
                                                              break L169;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var17++;
                                                      if (var22 == 0) {
                                                        continue L165;
                                                      } else {
                                                        break L167;
                                                      }
                                                    }
                                                  }
                                                }
                                                stackOut_408_0 = 0;
                                                stackIn_409_0 = stackOut_408_0;
                                                break L166;
                                              }
                                              var17 = stackIn_409_0;
                                              L170: while (true) {
                                                L171: {
                                                  L172: {
                                                    if ((var17 ^ -1) <= -2001) {
                                                      break L172;
                                                    } else {
                                                      var18 = var17 - (-((hd) this).field_o[((hd) this).field_c] + 1000);
                                                      stackOut_411_0 = var18 ^ -1;
                                                      stackOut_411_1 = -1;
                                                      stackIn_419_0 = stackOut_411_0;
                                                      stackIn_419_1 = stackOut_411_1;
                                                      stackIn_412_0 = stackOut_411_0;
                                                      stackIn_412_1 = stackOut_411_1;
                                                      if (var22 != 0) {
                                                        break L171;
                                                      } else {
                                                        L173: {
                                                          if (stackIn_412_0 > stackIn_412_1) {
                                                            break L173;
                                                          } else {
                                                            if ((((hd) this).field_n ^ -1) >= (var18 ^ -1)) {
                                                              break L173;
                                                            } else {
                                                              ((hd) this).field_e[var18] = 1124;
                                                              ((hd) this).field_f[var18] = 1024;
                                                              ((hd) this).field_m[var18] = 0;
                                                              break L173;
                                                            }
                                                          }
                                                        }
                                                        var17++;
                                                        if (var22 == 0) {
                                                          continue L170;
                                                        } else {
                                                          break L172;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  stackOut_418_0 = -var16;
                                                  stackOut_418_1 = ((hd) this).field_o[((hd) this).field_c];
                                                  stackIn_419_0 = stackOut_418_0;
                                                  stackIn_419_1 = stackOut_418_1;
                                                  break L171;
                                                }
                                                var17 = stackIn_419_0 + stackIn_419_1;
                                                var11 = 2;
                                                var18 = 0;
                                                L174: while (true) {
                                                  if (var18 >= var16 << 689788545) {
                                                    break L164;
                                                  } else {
                                                    var19 = var18 / 8;
                                                    stackOut_421_0 = 0;
                                                    stackIn_438_0 = stackOut_421_0;
                                                    stackIn_422_0 = stackOut_421_0;
                                                    if (var22 != 0) {
                                                      break L163;
                                                    } else {
                                                      var20 = stackIn_422_0;
                                                      L175: while (true) {
                                                        L176: {
                                                          L177: {
                                                            if (var20 >= var15_ref.field_F) {
                                                              break L177;
                                                            } else {
                                                              stackOut_424_0 = kc.field_x[((hd) this).field_b][var14].field_E[var19 - -(var20 * var15_ref.field_A)];
                                                              stackIn_430_0 = stackOut_424_0;
                                                              stackIn_425_0 = stackOut_424_0;
                                                              if (var22 != 0) {
                                                                break L176;
                                                              } else {
                                                                if (stackIn_425_0 != 0) {
                                                                  break L177;
                                                                } else {
                                                                  var20++;
                                                                  if (var22 == 0) {
                                                                    continue L175;
                                                                  } else {
                                                                    break L177;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          stackOut_429_0 = var17 ^ -1;
                                                          stackIn_430_0 = stackOut_429_0;
                                                          break L176;
                                                        }
                                                        L178: {
                                                          if (stackIn_430_0 > -1) {
                                                            break L178;
                                                          } else {
                                                            if ((var17 ^ -1) >= (((hd) this).field_n ^ -1)) {
                                                              ((hd) this).field_e[var17] = ((hd) this).field_h[((hd) this).field_c] + -(var20 << -1253277117);
                                                              if (-1125 >= (((hd) this).field_e[var17] ^ -1)) {
                                                                break L178;
                                                              } else {
                                                                ((hd) this).field_e[var17] = 1124;
                                                                break L178;
                                                              }
                                                            } else {
                                                              break L178;
                                                            }
                                                          }
                                                        }
                                                        var17++;
                                                        var18++;
                                                        if (var22 == 0) {
                                                          continue L174;
                                                        } else {
                                                          break L164;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_437_0 = ((hd) this).field_b;
                                        stackIn_438_0 = stackOut_437_0;
                                        break L163;
                                      }
                                      L179: {
                                        if (stackIn_438_0 == 2) {
                                          var12 = var12 + (var5.a(53, 128) - -var16);
                                          break L179;
                                        } else {
                                          break L179;
                                        }
                                      }
                                      ((hd) this).field_c = ((hd) this).field_c + 1;
                                      break L151;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12++;
                          if (var22 == 0) {
                            continue L150;
                          } else {
                            break L135;
                          }
                        }
                      }
                    }
                  }
                }
                break L134;
              }
              return;
            }
          }
        }
    }

    final int b(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (0 > param1) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = ((hd) this).field_f[0];
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    try {
                        if (param0 >= 117) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        boolean discarded$2 = hd.b(-45, 66, -70);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param1 < ((hd) this).field_n) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = ((hd) this).field_f[-1 + ((hd) this).field_n];
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    try {
                        stackOut_12_0 = ((hd) this).field_f[param1];
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var3, "hd.G(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean c(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int stackIn_5_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        vi.i(126);
                        var1_int = -85 / ((37 - param0) / 58);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (jd.field_rb == null) {
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
                        stackOut_2_0 = 1;
                        stackIn_5_0 = stackOut_2_0;
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
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var1, "hd.B(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          var2_int = 97 % ((-63 - param0) / 52);
          stackOut_0_0 = ((hd) this).field_n;
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_1_0;
        }
        return 0;
    }

    final int a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!param0) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((hd) this).field_l = -68;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1 >= 0) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = ((hd) this).field_e[0];
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        if ((param1 ^ -1) <= (((hd) this).field_n ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = ((hd) this).field_e[-1 + ((hd) this).field_n];
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    try {
                        stackOut_12_0 = ((hd) this).field_e[param1];
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var3, "hd.C(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0) {
        nk var1 = null;
        int var2_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        nk stackIn_62_0 = null;
        nk stackIn_62_1 = null;
        gk stackIn_62_2 = null;
        int stackIn_62_3 = 0;
        int stackIn_62_4 = 0;
        int stackIn_62_5 = 0;
        int stackIn_62_6 = 0;
        int stackIn_62_7 = 0;
        qd[] stackIn_62_8 = null;
        qd[] stackIn_62_9 = null;
        int stackIn_62_10 = 0;
        qd stackIn_62_11 = null;
        qd stackIn_62_12 = null;
        int stackIn_62_13 = 0;
        int stackIn_62_14 = 0;
        nk stackIn_63_0 = null;
        nk stackIn_63_1 = null;
        gk stackIn_63_2 = null;
        int stackIn_63_3 = 0;
        int stackIn_63_4 = 0;
        int stackIn_63_5 = 0;
        int stackIn_63_6 = 0;
        int stackIn_63_7 = 0;
        qd[] stackIn_63_8 = null;
        qd[] stackIn_63_9 = null;
        int stackIn_63_10 = 0;
        qd stackIn_63_11 = null;
        qd stackIn_63_12 = null;
        int stackIn_63_13 = 0;
        int stackIn_63_14 = 0;
        nk stackIn_64_0 = null;
        nk stackIn_64_1 = null;
        gk stackIn_64_2 = null;
        int stackIn_64_3 = 0;
        int stackIn_64_4 = 0;
        int stackIn_64_5 = 0;
        int stackIn_64_6 = 0;
        int stackIn_64_7 = 0;
        qd[] stackIn_64_8 = null;
        qd[] stackIn_64_9 = null;
        int stackIn_64_10 = 0;
        qd stackIn_64_11 = null;
        qd stackIn_64_12 = null;
        int stackIn_64_13 = 0;
        int stackIn_64_14 = 0;
        nk stackIn_65_0 = null;
        nk stackIn_65_1 = null;
        gk stackIn_65_2 = null;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        int stackIn_65_5 = 0;
        int stackIn_65_6 = 0;
        int stackIn_65_7 = 0;
        qd[] stackIn_65_8 = null;
        qd[] stackIn_65_9 = null;
        int stackIn_65_10 = 0;
        qd stackIn_65_11 = null;
        qd stackIn_65_12 = null;
        int stackIn_65_13 = 0;
        int stackIn_65_14 = 0;
        nk stackIn_66_0 = null;
        nk stackIn_66_1 = null;
        gk stackIn_66_2 = null;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        int stackIn_66_5 = 0;
        int stackIn_66_6 = 0;
        int stackIn_66_7 = 0;
        qd[] stackIn_66_8 = null;
        qd[] stackIn_66_9 = null;
        int stackIn_66_10 = 0;
        qd stackIn_66_11 = null;
        qd stackIn_66_12 = null;
        int stackIn_66_13 = 0;
        int stackIn_66_14 = 0;
        nk stackIn_67_0 = null;
        nk stackIn_67_1 = null;
        gk stackIn_67_2 = null;
        int stackIn_67_3 = 0;
        int stackIn_67_4 = 0;
        int stackIn_67_5 = 0;
        int stackIn_67_6 = 0;
        int stackIn_67_7 = 0;
        qd[] stackIn_67_8 = null;
        qd[] stackIn_67_9 = null;
        int stackIn_67_10 = 0;
        qd stackIn_67_11 = null;
        qd stackIn_67_12 = null;
        int stackIn_67_13 = 0;
        int stackIn_67_14 = 0;
        int stackIn_67_15 = 0;
        nk stackOut_61_0 = null;
        nk stackOut_61_1 = null;
        gk stackOut_61_2 = null;
        int stackOut_61_3 = 0;
        int stackOut_61_4 = 0;
        int stackOut_61_5 = 0;
        int stackOut_61_6 = 0;
        int stackOut_61_7 = 0;
        qd[] stackOut_61_8 = null;
        qd[] stackOut_61_9 = null;
        int stackOut_61_10 = 0;
        qd stackOut_61_11 = null;
        qd stackOut_61_12 = null;
        int stackOut_61_13 = 0;
        int stackOut_61_14 = 0;
        nk stackOut_64_0 = null;
        nk stackOut_64_1 = null;
        gk stackOut_64_2 = null;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        int stackOut_64_5 = 0;
        int stackOut_64_6 = 0;
        int stackOut_64_7 = 0;
        qd[] stackOut_64_8 = null;
        qd[] stackOut_64_9 = null;
        int stackOut_64_10 = 0;
        qd stackOut_64_11 = null;
        qd stackOut_64_12 = null;
        int stackOut_64_13 = 0;
        int stackOut_64_14 = 0;
        nk stackOut_66_0 = null;
        nk stackOut_66_1 = null;
        gk stackOut_66_2 = null;
        int stackOut_66_3 = 0;
        int stackOut_66_4 = 0;
        int stackOut_66_5 = 0;
        int stackOut_66_6 = 0;
        int stackOut_66_7 = 0;
        qd[] stackOut_66_8 = null;
        qd[] stackOut_66_9 = null;
        int stackOut_66_10 = 0;
        qd stackOut_66_11 = null;
        qd stackOut_66_12 = null;
        int stackOut_66_13 = 0;
        int stackOut_66_14 = 0;
        int stackOut_66_15 = 0;
        nk stackOut_65_0 = null;
        nk stackOut_65_1 = null;
        gk stackOut_65_2 = null;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        int stackOut_65_5 = 0;
        int stackOut_65_6 = 0;
        int stackOut_65_7 = 0;
        qd[] stackOut_65_8 = null;
        qd[] stackOut_65_9 = null;
        int stackOut_65_10 = 0;
        qd stackOut_65_11 = null;
        qd stackOut_65_12 = null;
        int stackOut_65_13 = 0;
        int stackOut_65_14 = 0;
        int stackOut_65_15 = 0;
        nk stackOut_62_0 = null;
        nk stackOut_62_1 = null;
        gk stackOut_62_2 = null;
        int stackOut_62_3 = 0;
        int stackOut_62_4 = 0;
        int stackOut_62_5 = 0;
        int stackOut_62_6 = 0;
        int stackOut_62_7 = 0;
        qd[] stackOut_62_8 = null;
        qd[] stackOut_62_9 = null;
        int stackOut_62_10 = 0;
        qd stackOut_62_11 = null;
        qd stackOut_62_12 = null;
        int stackOut_62_13 = 0;
        int stackOut_62_14 = 0;
        nk stackOut_63_0 = null;
        nk stackOut_63_1 = null;
        gk stackOut_63_2 = null;
        int stackOut_63_3 = 0;
        int stackOut_63_4 = 0;
        int stackOut_63_5 = 0;
        int stackOut_63_6 = 0;
        int stackOut_63_7 = 0;
        qd[] stackOut_63_8 = null;
        qd[] stackOut_63_9 = null;
        int stackOut_63_10 = 0;
        qd stackOut_63_11 = null;
        qd stackOut_63_12 = null;
        int stackOut_63_13 = 0;
        int stackOut_63_14 = 0;
        int stackOut_63_15 = 0;
        L0: {
          var4 = SteelSentinels.field_G;
          ao.field_H = new ul();
          if (li.field_z != null) {
            break L0;
          } else {
            li.field_z = new gk[10];
            break L0;
          }
        }
        L1: {
          if (null != si.field_l) {
            break L1;
          } else {
            si.field_l = new gk[256];
            break L1;
          }
        }
        L2: {
          if (null != ng.field_c) {
            break L2;
          } else {
            ng.field_c = new gk[20];
            break L2;
          }
        }
        L3: {
          if (wi.field_C == null) {
            wi.field_C = new gk[21];
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (ui.field_V != null) {
            break L4;
          } else {
            ui.field_V = new gk[12];
            break L4;
          }
        }
        L5: {
          if (lb.field_Zb == null) {
            lb.field_Zb = new gk[4];
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (null != jd.field_qb) {
            break L6;
          } else {
            jd.field_qb = new gk[12];
            break L6;
          }
        }
        L7: {
          if (null != mb.field_nc) {
            break L7;
          } else {
            mb.field_nc = new gk[15];
            break L7;
          }
        }
        L8: {
          if (null != vc.field_b) {
            break L8;
          } else {
            vc.field_b = new gk[20];
            break L8;
          }
        }
        L9: {
          if (fa.field_a == null) {
            fa.field_a = new gk[12];
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if (null != hk.field_Ec) {
            break L10;
          } else {
            hk.field_Ec = new gk[15];
            break L10;
          }
        }
        L11: {
          if (ne.field_R == null) {
            ne.field_R = new gk[21];
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          L13: {
            if (null == qb.field_L) {
              qb.field_L = new gk[18];
              var2_int = 0;
              L14: while (true) {
                if (var2_int >= 18) {
                  break L13;
                } else {
                  qb.field_L[var2_int] = na.field_a;
                  var2_int++;
                  if (var4 != 0) {
                    break L12;
                  } else {
                    if (var4 == 0) {
                      continue L14;
                    } else {
                      break L13;
                    }
                  }
                }
              }
            } else {
              break L13;
            }
          }
          if (ea.field_b != null) {
            break L12;
          } else {
            ea.field_b = new gk[10];
            break L12;
          }
        }
        L15: {
          if (cf.field_u == null) {
            cf.field_u = new gk[15];
            break L15;
          } else {
            break L15;
          }
        }
        var1 = new nk(fa.field_a[0], 1, 32, 53, 0, 0, new qd[5]);
        var1.field_N = 109;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(lb.field_Zb[0], 1, 64, 98, 0, 0, new qd[5]);
        var1.field_N = 107;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(lb.field_Zb[2], 1, 64, 140, 0, 0, new qd[6]);
        var1.field_N = 108;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(jd.field_qb[2], 2, 58, 63, -16384, 4096, new qd[3]);
        var1.field_N = 1;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(jd.field_qb[4], 4, 64, 55, -12288, 4096, new qd[3]);
        var1.field_N = 2;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(jd.field_qb[3], 8, 67, 78, -21845, 8192, new qd[5]);
        var1.field_N = 3;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(jd.field_qb[1], 1, 64, 138, 0, 0, new qd[6]);
        var1.field_N = 0;
        var1 = wh.a(0, var1);
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(jd.field_qb[4], 1024, 64, 55, -16384, 4096, new qd[2]);
        var1.field_N = 96;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(li.field_z[0], 2, 52, 68, -16384, 1024, new qd[3]);
        var1.field_N = 53;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(li.field_z[8], 8, 65, 68, -16384, 4096, new qd[3]);
        var1.field_N = 54;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(li.field_z[6], 4, 76, 42, -16384, 2048, new qd[3]);
        var1.field_N = 56;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(li.field_z[6], 1024, 76, 42, -16384, 2048, new qd[1]);
        var1.field_N = 97;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(li.field_z[2], 1, 64, 188, 0, 0, new qd[13]);
        var1.field_N = 55;
        var1 = wh.a(0, var1);
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(mb.field_nc[4], 2, 60, 62, -16384, 4096, new qd[3]);
        var1.field_N = 60;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(mb.field_nc[5], 8, 63, 50, -16384, 4096, new qd[3]);
        var1.field_N = 59;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(mb.field_nc[7], 4, 64, 45, -13107, 8192, new qd[4]);
        var1.field_N = 58;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(mb.field_nc[7], 1024, 64, 45, -21845, 8192, new qd[2]);
        var1.field_N = 98;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(mb.field_nc[0], 1, 58, 176, 0, 0, new qd[9]);
        var1.field_N = 57;
        var1 = wh.a(0, var1);
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ea.field_b[7], 2, 99, 80, -16384, 4096, new qd[3]);
        var1.field_N = 61;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ea.field_b[1], 1, 63, 120, 0, 0, new qd[8]);
        var1.field_N = 62;
        var1 = wh.a(0, var1);
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(cf.field_u[9], 2, 66, 23, -16384, 4096, new qd[2]);
        var1.field_N = 64;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(cf.field_u[10], 8, 65, 35, -24576, 13107, new qd[4]);
        var1.field_N = 67;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(cf.field_u[7], 4, 65, 32, -29672, 8192, new qd[3]);
        var1.field_N = 66;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(cf.field_u[5], 1024, 64, 38, -18384, 10922, new qd[2]);
        var1.field_N = 99;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(cf.field_u[0], 1, 58, 195, 0, 0, new qd[9]);
        var1.field_N = 65;
        var1 = wh.a(0, var1);
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(qb.field_L[1], 2, 60, 61, -16384, 0, new qd[3]);
        var1.field_N = 68;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(qb.field_L[0], 8, 42, 50, -21845, 10922, new qd[3]);
        var1.field_N = 71;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(qb.field_L[9], 4, 62, 55, -8192, 8192, new qd[3]);
        var1.field_N = 70;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(qb.field_L[9], 1024, 62, 55, -16384, 8192, new qd[2]);
        var1.field_N = 100;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(qb.field_L[5], 1, 58, 169, 0, 0, new qd[9]);
        var1.field_N = 69;
        var1 = wh.a(0, var1);
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ng.field_c[15], 2, 84, 115, -16384, 4096, new qd[2]);
        var1.field_N = 74;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ui.field_V[10], 8, 113, 118, -16384, 2048, new qd[8]);
        var1.field_N = 73;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ng.field_c[17], 1, 120, 170, 0, 0, new qd[7]);
        var1.field_N = 72;
        var1 = wh.a(0, var1);
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(vc.field_b[7], 2, 83, 85, -16384, 4096, new qd[3]);
        var1.field_N = 78;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(vc.field_b[0], 32, 76, 171, -16384, 0, new qd[4]);
        var1.field_N = 83;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(vc.field_b[2], 4, 64, 103, -16384, 4096, new qd[3]);
        var1.field_N = 76;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(vc.field_b[2], 1024, 64, 103, -16384, 4096, new qd[2]);
        var1.field_N = 102;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(vc.field_b[3], 8, 64, 93, -16384, 2048, new qd[4]);
        var1.field_N = 77;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(vc.field_b[10], 1, 66, 263, 0, 0, new qd[7]);
        var1.field_N = 75;
        var1 = wh.a(0, var1);
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ui.field_V[7], 2, 150, 112, -16384, 4096, new qd[3]);
        var1.field_N = 82;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ui.field_V[6], 2048, 100, 122, -16384, 4096, new qd[9]);
        var1.field_N = 80;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ui.field_V[11], 1024, 108, 153, -16384, 4096, new qd[3]);
        var1.field_N = 103;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ui.field_V[10], 8, 113, 113, -16384, 8192, new qd[5]);
        var1.field_N = 81;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ui.field_V[5], 1, 128, 258, 0, 0, new qd[10]);
        var1.field_N = 79;
        var1 = wh.a(0, var1);
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(hk.field_Ec[8], 2, 154, 97, -16384, 8192, new qd[2]);
        var1.field_N = 87;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(hk.field_Ec[11], 4, 125, 100, -16384, 4096, new qd[3]);
        var1.field_N = 85;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(hk.field_Ec[1], 1024, 150, 100, -16384, 4096, new qd[2]);
        var1.field_N = 104;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(hk.field_Ec[10], 8, 125, 91, -16384, 8192, new qd[3]);
        var1.field_N = 86;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(hk.field_Ec[9], 1, 146, 257, 0, 4096, new qd[16]);
        var1.field_N = 84;
        var1 = wh.a(0, var1);
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ne.field_R[20], 2, 153, 58, -16384, 8192, new qd[2]);
        var1.field_N = 91;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ne.field_R[3], 2048, 120, 73, -16384, 4096, new qd[5]);
        var1.field_N = 89;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ne.field_R[0], 1024, 120, 73, -26384, 4096, new qd[2]);
        var1.field_N = 105;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ne.field_R[13], 8, 128, 52, -16384, 4096, new qd[3]);
        var1.field_N = 90;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(ne.field_R[12], 1, 146, 293, 0, 0, new qd[8]);
        var1.field_N = 88;
        var1 = wh.a(0, var1);
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(wi.field_C[9], 2, 100, 148, -16384, 4096, new qd[2]);
        var1.field_N = 95;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(wi.field_C[2], 2048, 125, 91, -16384, 8192, new qd[3]);
        var1.field_N = 93;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(wi.field_C[12], 1024, 128, 99, -16384, 4096, new qd[2]);
        var1.field_N = 106;
        ao.field_H.a(3, (ck) (Object) var1);
        var1 = new nk(wi.field_C[10], 1, 146, 405, 0, 0, new qd[16]);
        var1.field_N = 92;
        var1 = wh.a(0, var1);
        ao.field_H.a(3, (ck) (Object) var1);
        var2 = new int[]{17, 18, 19, 20, 21, 22, 27};
        var3 = 0;
        L16: while (true) {
          L17: {
            L18: {
              if (var2.length <= var3) {
                break L18;
              } else {
                var1 = new nk(si.field_l[var2[var3] + 11], 16, 32, 39, 0, 1024, new qd[2]);
                var1.field_N = var2[var3];
                ao.field_H.a(3, (ck) (Object) var1);
                var3++;
                if (var4 != 0) {
                  break L17;
                } else {
                  if (var4 == 0) {
                    continue L16;
                  } else {
                    break L18;
                  }
                }
              }
            }
            var2 = new int[]{28, 29, 30};
            break L17;
          }
          var3 = 0;
          L19: while (true) {
            L20: {
              L21: {
                if (var2.length <= var3) {
                  break L21;
                } else {
                  var1 = new nk(si.field_l[11 - -var2[var3]], 32, 32, 32, 0, 1024, new qd[2]);
                  var1.field_N = var2[var3];
                  ao.field_H.a(3, (ck) (Object) var1);
                  var3++;
                  if (var4 != 0) {
                    break L20;
                  } else {
                    if (var4 == 0) {
                      continue L19;
                    } else {
                      break L21;
                    }
                  }
                }
              }
              var2 = new int[]{23, 24, 25, 26};
              break L20;
            }
            var3 = 0;
            L22: while (true) {
              L23: {
                L24: {
                  if ((var3 ^ -1) <= (var2.length ^ -1)) {
                    break L24;
                  } else {
                    var1 = new nk(si.field_l[-17 + var2[var3] + 28], 128, 32, 27, 0, 1024, new qd[2]);
                    var1.field_N = var2[var3];
                    ao.field_H.a(3, (ck) (Object) var1);
                    var3++;
                    if (var4 != 0) {
                      break L23;
                    } else {
                      if (var4 == 0) {
                        continue L22;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                var2 = new int[]{36, 37, 51, 50};
                break L23;
              }
              var3 = 0;
              L25: while (true) {
                L26: {
                  L27: {
                    if (var2.length <= var3) {
                      break L27;
                    } else {
                      if (var4 != 0) {
                        break L26;
                      } else {
                        L28: {
                          stackOut_61_0 = null;
                          stackOut_61_1 = null;
                          stackOut_61_2 = si.field_l[var2[var3] + 28 - 17];
                          stackOut_61_3 = 256;
                          stackOut_61_4 = 32;
                          stackOut_61_5 = 22;
                          stackOut_61_6 = 0;
                          stackOut_61_7 = 1024;
                          stackOut_61_8 = new qd[2];
                          stackOut_61_9 = new qd[2];
                          stackOut_61_10 = 1;
                          stackOut_61_11 = null;
                          stackOut_61_12 = null;
                          stackOut_61_13 = 0;
                          stackOut_61_14 = 0;
                          stackIn_64_0 = stackOut_61_0;
                          stackIn_64_1 = stackOut_61_1;
                          stackIn_64_2 = stackOut_61_2;
                          stackIn_64_3 = stackOut_61_3;
                          stackIn_64_4 = stackOut_61_4;
                          stackIn_64_5 = stackOut_61_5;
                          stackIn_64_6 = stackOut_61_6;
                          stackIn_64_7 = stackOut_61_7;
                          stackIn_64_8 = stackOut_61_8;
                          stackIn_64_9 = stackOut_61_9;
                          stackIn_64_10 = stackOut_61_10;
                          stackIn_64_11 = stackOut_61_11;
                          stackIn_64_12 = stackOut_61_12;
                          stackIn_64_13 = stackOut_61_13;
                          stackIn_64_14 = stackOut_61_14;
                          stackIn_62_0 = stackOut_61_0;
                          stackIn_62_1 = stackOut_61_1;
                          stackIn_62_2 = stackOut_61_2;
                          stackIn_62_3 = stackOut_61_3;
                          stackIn_62_4 = stackOut_61_4;
                          stackIn_62_5 = stackOut_61_5;
                          stackIn_62_6 = stackOut_61_6;
                          stackIn_62_7 = stackOut_61_7;
                          stackIn_62_8 = stackOut_61_8;
                          stackIn_62_9 = stackOut_61_9;
                          stackIn_62_10 = stackOut_61_10;
                          stackIn_62_11 = stackOut_61_11;
                          stackIn_62_12 = stackOut_61_12;
                          stackIn_62_13 = stackOut_61_13;
                          stackIn_62_14 = stackOut_61_14;
                          if (var2[var3] != 50) {
                            stackOut_64_0 = null;
                            stackOut_64_1 = null;
                            stackOut_64_2 = (gk) (Object) stackIn_64_2;
                            stackOut_64_3 = stackIn_64_3;
                            stackOut_64_4 = stackIn_64_4;
                            stackOut_64_5 = stackIn_64_5;
                            stackOut_64_6 = stackIn_64_6;
                            stackOut_64_7 = stackIn_64_7;
                            stackOut_64_8 = (qd[]) (Object) stackIn_64_8;
                            stackOut_64_9 = (qd[]) (Object) stackIn_64_9;
                            stackOut_64_10 = stackIn_64_10;
                            stackOut_64_11 = null;
                            stackOut_64_12 = null;
                            stackOut_64_13 = stackIn_64_13;
                            stackOut_64_14 = stackIn_64_14;
                            stackIn_66_0 = stackOut_64_0;
                            stackIn_66_1 = stackOut_64_1;
                            stackIn_66_2 = stackOut_64_2;
                            stackIn_66_3 = stackOut_64_3;
                            stackIn_66_4 = stackOut_64_4;
                            stackIn_66_5 = stackOut_64_5;
                            stackIn_66_6 = stackOut_64_6;
                            stackIn_66_7 = stackOut_64_7;
                            stackIn_66_8 = stackOut_64_8;
                            stackIn_66_9 = stackOut_64_9;
                            stackIn_66_10 = stackOut_64_10;
                            stackIn_66_11 = stackOut_64_11;
                            stackIn_66_12 = stackOut_64_12;
                            stackIn_66_13 = stackOut_64_13;
                            stackIn_66_14 = stackOut_64_14;
                            stackIn_65_0 = stackOut_64_0;
                            stackIn_65_1 = stackOut_64_1;
                            stackIn_65_2 = stackOut_64_2;
                            stackIn_65_3 = stackOut_64_3;
                            stackIn_65_4 = stackOut_64_4;
                            stackIn_65_5 = stackOut_64_5;
                            stackIn_65_6 = stackOut_64_6;
                            stackIn_65_7 = stackOut_64_7;
                            stackIn_65_8 = stackOut_64_8;
                            stackIn_65_9 = stackOut_64_9;
                            stackIn_65_10 = stackOut_64_10;
                            stackIn_65_11 = stackOut_64_11;
                            stackIn_65_12 = stackOut_64_12;
                            stackIn_65_13 = stackOut_64_13;
                            stackIn_65_14 = stackOut_64_14;
                            if (var2[var3] != 37) {
                              stackOut_66_0 = null;
                              stackOut_66_1 = null;
                              stackOut_66_2 = (gk) (Object) stackIn_66_2;
                              stackOut_66_3 = stackIn_66_3;
                              stackOut_66_4 = stackIn_66_4;
                              stackOut_66_5 = stackIn_66_5;
                              stackOut_66_6 = stackIn_66_6;
                              stackOut_66_7 = stackIn_66_7;
                              stackOut_66_8 = (qd[]) (Object) stackIn_66_8;
                              stackOut_66_9 = (qd[]) (Object) stackIn_66_9;
                              stackOut_66_10 = stackIn_66_10;
                              stackOut_66_11 = null;
                              stackOut_66_12 = null;
                              stackOut_66_13 = stackIn_66_13;
                              stackOut_66_14 = stackIn_66_14;
                              stackOut_66_15 = 100;
                              stackIn_67_0 = stackOut_66_0;
                              stackIn_67_1 = stackOut_66_1;
                              stackIn_67_2 = stackOut_66_2;
                              stackIn_67_3 = stackOut_66_3;
                              stackIn_67_4 = stackOut_66_4;
                              stackIn_67_5 = stackOut_66_5;
                              stackIn_67_6 = stackOut_66_6;
                              stackIn_67_7 = stackOut_66_7;
                              stackIn_67_8 = stackOut_66_8;
                              stackIn_67_9 = stackOut_66_9;
                              stackIn_67_10 = stackOut_66_10;
                              stackIn_67_11 = stackOut_66_11;
                              stackIn_67_12 = stackOut_66_12;
                              stackIn_67_13 = stackOut_66_13;
                              stackIn_67_14 = stackOut_66_14;
                              stackIn_67_15 = stackOut_66_15;
                              break L28;
                            } else {
                              stackOut_65_0 = null;
                              stackOut_65_1 = null;
                              stackOut_65_2 = (gk) (Object) stackIn_65_2;
                              stackOut_65_3 = stackIn_65_3;
                              stackOut_65_4 = stackIn_65_4;
                              stackOut_65_5 = stackIn_65_5;
                              stackOut_65_6 = stackIn_65_6;
                              stackOut_65_7 = stackIn_65_7;
                              stackOut_65_8 = (qd[]) (Object) stackIn_65_8;
                              stackOut_65_9 = (qd[]) (Object) stackIn_65_9;
                              stackOut_65_10 = stackIn_65_10;
                              stackOut_65_11 = null;
                              stackOut_65_12 = null;
                              stackOut_65_13 = stackIn_65_13;
                              stackOut_65_14 = stackIn_65_14;
                              stackOut_65_15 = 50;
                              stackIn_67_0 = stackOut_65_0;
                              stackIn_67_1 = stackOut_65_1;
                              stackIn_67_2 = stackOut_65_2;
                              stackIn_67_3 = stackOut_65_3;
                              stackIn_67_4 = stackOut_65_4;
                              stackIn_67_5 = stackOut_65_5;
                              stackIn_67_6 = stackOut_65_6;
                              stackIn_67_7 = stackOut_65_7;
                              stackIn_67_8 = stackOut_65_8;
                              stackIn_67_9 = stackOut_65_9;
                              stackIn_67_10 = stackOut_65_10;
                              stackIn_67_11 = stackOut_65_11;
                              stackIn_67_12 = stackOut_65_12;
                              stackIn_67_13 = stackOut_65_13;
                              stackIn_67_14 = stackOut_65_14;
                              stackIn_67_15 = stackOut_65_15;
                              break L28;
                            }
                          } else {
                            stackOut_62_0 = null;
                            stackOut_62_1 = null;
                            stackOut_62_2 = (gk) (Object) stackIn_62_2;
                            stackOut_62_3 = stackIn_62_3;
                            stackOut_62_4 = stackIn_62_4;
                            stackOut_62_5 = stackIn_62_5;
                            stackOut_62_6 = stackIn_62_6;
                            stackOut_62_7 = stackIn_62_7;
                            stackOut_62_8 = (qd[]) (Object) stackIn_62_8;
                            stackOut_62_9 = (qd[]) (Object) stackIn_62_9;
                            stackOut_62_10 = stackIn_62_10;
                            stackOut_62_11 = null;
                            stackOut_62_12 = null;
                            stackOut_62_13 = stackIn_62_13;
                            stackOut_62_14 = stackIn_62_14;
                            stackIn_63_0 = stackOut_62_0;
                            stackIn_63_1 = stackOut_62_1;
                            stackIn_63_2 = stackOut_62_2;
                            stackIn_63_3 = stackOut_62_3;
                            stackIn_63_4 = stackOut_62_4;
                            stackIn_63_5 = stackOut_62_5;
                            stackIn_63_6 = stackOut_62_6;
                            stackIn_63_7 = stackOut_62_7;
                            stackIn_63_8 = stackOut_62_8;
                            stackIn_63_9 = stackOut_62_9;
                            stackIn_63_10 = stackOut_62_10;
                            stackIn_63_11 = stackOut_62_11;
                            stackIn_63_12 = stackOut_62_12;
                            stackIn_63_13 = stackOut_62_13;
                            stackIn_63_14 = stackOut_62_14;
                            stackOut_63_0 = null;
                            stackOut_63_1 = null;
                            stackOut_63_2 = (gk) (Object) stackIn_63_2;
                            stackOut_63_3 = stackIn_63_3;
                            stackOut_63_4 = stackIn_63_4;
                            stackOut_63_5 = stackIn_63_5;
                            stackOut_63_6 = stackIn_63_6;
                            stackOut_63_7 = stackIn_63_7;
                            stackOut_63_8 = (qd[]) (Object) stackIn_63_8;
                            stackOut_63_9 = (qd[]) (Object) stackIn_63_9;
                            stackOut_63_10 = stackIn_63_10;
                            stackOut_63_11 = null;
                            stackOut_63_12 = null;
                            stackOut_63_13 = stackIn_63_13;
                            stackOut_63_14 = stackIn_63_14;
                            stackOut_63_15 = 500;
                            stackIn_67_0 = stackOut_63_0;
                            stackIn_67_1 = stackOut_63_1;
                            stackIn_67_2 = stackOut_63_2;
                            stackIn_67_3 = stackOut_63_3;
                            stackIn_67_4 = stackOut_63_4;
                            stackIn_67_5 = stackOut_63_5;
                            stackIn_67_6 = stackOut_63_6;
                            stackIn_67_7 = stackOut_63_7;
                            stackIn_67_8 = stackOut_63_8;
                            stackIn_67_9 = stackOut_63_9;
                            stackIn_67_10 = stackOut_63_10;
                            stackIn_67_11 = stackOut_63_11;
                            stackIn_67_12 = stackOut_63_12;
                            stackIn_67_13 = stackOut_63_13;
                            stackIn_67_14 = stackOut_63_14;
                            stackIn_67_15 = stackOut_63_15;
                            break L28;
                          }
                        }
                        new qd(stackIn_67_13, stackIn_67_14, stackIn_67_15);
                        stackIn_67_9[stackIn_67_10] = stackIn_67_11;
                        new nk(stackIn_67_2, stackIn_67_3, stackIn_67_4, stackIn_67_5, stackIn_67_6, stackIn_67_7, stackIn_67_8);
                        var1 = stackIn_67_0;
                        var1.field_N = var2[var3];
                        ao.field_H.a(3, (ck) (Object) var1);
                        var3++;
                        if (var4 == 0) {
                          continue L25;
                        } else {
                          break L27;
                        }
                      }
                    }
                  }
                  var1 = new nk(jd.field_qb[5], 512, 64, 64, 0, 1024, new qd[2]);
                  var1.field_N = 49;
                  ao.field_H.a(3, (ck) (Object) var1);
                  var1 = new nk(ea.field_b[8], 32, 64, 96, 0, 1024, new qd[2]);
                  var1.field_N = 31;
                  ao.field_H.a(3, (ck) (Object) var1);
                  var1 = new nk(ne.field_R[2], 32, 98, 144, 0, 1024, new qd[2]);
                  var1.field_N = 35;
                  ao.field_H.a(3, (ck) (Object) var1);
                  var1 = new nk(cf.field_u[8], 32, 80, 69, 0, 1024, new qd[2]);
                  var1.field_N = 32;
                  ao.field_H.a(3, (ck) (Object) var1);
                  var1 = new nk(qb.field_L[11], 32, 59, 65, 0, 1024, new qd[2]);
                  var1.field_N = 33;
                  ao.field_H.a(3, (ck) (Object) var1);
                  var1 = new nk(ng.field_c[14], 32, 49, 52, 0, 1024, new qd[2]);
                  var1.field_N = 34;
                  ao.field_H.a(3, (ck) (Object) var1);
                  var1 = new nk(ui.field_V[9], 32, 132, 124, 0, 1024, new qd[2]);
                  var1.field_N = 38;
                  ao.field_H.a(3, (ck) (Object) var1);
                  var1 = new nk(ng.field_c[13], 64, 65, 96, 0, 1024, new qd[2]);
                  var1.field_N = 43;
                  ao.field_H.a(3, (ck) (Object) var1);
                  var1 = new nk(wi.field_C[15], 64, 115, 157, 0, 1024, new qd[2]);
                  var1.field_N = 48;
                  ao.field_H.a(3, (ck) (Object) var1);
                  var1 = new nk(wi.field_C[0], 64, 143, 152, 0, 1024, new qd[2]);
                  var1.field_N = 52;
                  ao.field_H.a(3, (ck) (Object) var1);
                  var1 = new nk(ne.field_R[6], 64, 39, 127, 0, 1024, new qd[2]);
                  var1.field_N = 46;
                  ao.field_H.a(3, (ck) (Object) var1);
                  var1 = new nk(vc.field_b[15], 64, 147, 168, 0, 1024, new qd[2]);
                  var1.field_N = 45;
                  ao.field_H.a(3, (ck) (Object) var1);
                  var1 = new nk(ui.field_V[4], 64, 114, 145, 0, 1024, new qd[2]);
                  var1.field_N = 44;
                  ao.field_H.a(3, (ck) (Object) var1);
                  var1 = new nk(hk.field_Ec[12], 64, 117, 140, 0, 1024, new qd[2]);
                  var1.field_N = 47;
                  ao.field_H.a(3, (ck) (Object) var1);
                  hc.field_bb = new nk[110];
                  break L26;
                }
                var3 = 0;
                L29: while (true) {
                  L30: {
                    L31: {
                      if (-111 >= (var3 ^ -1)) {
                        break L31;
                      } else {
                        hc.field_bb[var3] = ul.a(var3, (byte) 67);
                        var3++;
                        if (var4 != 0) {
                          break L30;
                        } else {
                          if (var4 == 0) {
                            continue L29;
                          } else {
                            break L31;
                          }
                        }
                      }
                    }
                    break L30;
                  }
                  L32: {
                    if (!lg.field_i) {
                      break L32;
                    } else {
                      var4++;
                      SteelSentinels.field_G = var4;
                      break L32;
                    }
                  }
                  return;
                }
              }
            }
          }
        }
    }

    final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if ((param1 ^ -1) <= -1) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = ((hd) this).field_m[0];
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0;
                }
                case 3: {
                    try {
                        if (param0 <= -94) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 52;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    try {
                        if (((hd) this).field_n > param1) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = ((hd) this).field_m[((hd) this).field_n + -1];
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        stackOut_9_0 = ((hd) this).field_m[param1];
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw ci.a((Throwable) (Object) var3, "hd.H(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        try {
            field_g = null;
            field_d = null;
            field_q = null;
            field_k = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "hd.D(" + param0 + 41);
        }
    }

    hd(int param0, int param1) {
        try {
            ((hd) this).a(1200, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "hd.<init>(" + param0 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "You haven't enough solarite cubes to engineer the <%0> at this time.<br><br>Earn more solarite cubes by playing Rated games.";
        field_a = 0;
        field_d = "You need to play <%0> more rated games to unlock this option.";
    }
}
