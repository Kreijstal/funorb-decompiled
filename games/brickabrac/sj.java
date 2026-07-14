/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static String field_g;
    static ie field_f;
    static String field_e;
    static mh field_a;
    static String[] field_c;
    static mh field_d;
    static tb field_b;

    final static gb a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        gb var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        gb var8_ref_gb = null;
        int var8 = 0;
        int var9 = 0;
        gb var9_ref_gb = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_17_0 = 0;
        boolean stackIn_28_0 = false;
        int stackIn_44_0 = 0;
        Object stackIn_48_0 = null;
        mh stackIn_48_1 = null;
        Object stackIn_73_0 = null;
        mh stackIn_73_1 = null;
        Object stackIn_75_0 = null;
        mh stackIn_75_1 = null;
        int stackIn_87_0 = 0;
        gb stackIn_88_0 = null;
        boolean stackOut_4_0;
        int stackOut_16_0;
        boolean stackOut_27_0;
        int stackOut_43_0;
        Object stackOut_47_0;
        mh stackOut_47_1;
        Object stackOut_72_0;
        mh stackOut_72_1;
        Object stackOut_73_0;
        mh stackOut_73_1;
        int stackOut_84_0;
        int stackOut_86_0;
        gb stackOut_87_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_ref = null;
                        i.field_q.field_Rb.field_bb.c((byte) -61);
                        var5 = 0;
                        var6 = 0;
                        var7 = -1 + mm.field_Sb;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-1 < (var7 ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8_ref_gb = jk.field_s[var7];
                        var9 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = um.field_e;
                        stackIn_44_0 = stackOut_4_0 ? 1 : 0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var13 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0) {
                            statePc = 23;
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var5 ^ -1) <= (eh.field_k ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10_int = tm.a(var8_ref_gb.field_c, (byte) 18);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var10_int ^ -1) >= (var8_ref_gb.a(true) ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var8_ref_gb.field_e) {
                            statePc = 22;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 125;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!af.a(stackIn_17_0, var8_ref_gb.field_m)) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9 = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var9 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5++;
                        if (var8_ref_gb.field_b == null) {
                            statePc = 33;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = oi.field_d;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0) {
                            statePc = 33;
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
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (null == var8_ref_gb.field_b) {
                            statePc = 36;
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
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        on.field_E = on.field_E + 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var10 = kq.a(var8_ref_gb, (byte) 91);
                        var11 = var10 + dh.b(var8_ref_gb.field_j);
                        var12 = ik.a(-31126, var8_ref_gb);
                        var8_ref_gb.field_b = new mh(0L, field_a, var11);
                        var8_ref_gb.field_b.field_Fb = var12 + (-((var12 & 16711422) >> -1404152127) + (field_a.field_Fb >> -1654468767 & 8355711));
                        var8_ref_gb.field_b.field_Y = (field_a.field_Y >> 632761153 & 8355711) + -(8355711 & var12 >> 2038224449) + var12;
                        var8_ref_gb.field_b.field_X = var12;
                        var8_ref_gb.field_b.field_O = jq.field_y;
                        var6 = var6 + param1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var13 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8_ref_gb.field_b = null;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var7--;
                        if (var13 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var7 = 0;
                        stackOut_43_0 = 0;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var8 = stackIn_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((mm.field_Sb ^ -1) >= (var8 ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var9_ref_gb = jk.field_s[var8];
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = null;
                        stackOut_47_1 = var9_ref_gb.field_b;
                        stackIn_75_0 = stackOut_47_0;
                        stackIn_75_1 = stackOut_47_1;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        if (var13 != 0) {
                            statePc = 75;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((Object) (Object) stackIn_48_0 != (Object) (Object) stackIn_48_1) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        i.field_q.field_Rb.a(var9_ref_gb.field_b, 0);
                        var9_ref_gb.field_b.a(param1, var7, param0, var9_ref_gb.field_b.g(87), (byte) 64);
                        if (-1 != (var9_ref_gb.field_b.field_L ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var4_ref = var9_ref_gb;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var7 = var7 + param1;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var8++;
                        if (var13 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var8 = i.field_q.field_Rb.field_C + i.field_q.field_Rb.field_cb - (-var6 + var7);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        i.field_q.field_Rb.field_cb = i.field_q.field_Rb.field_cb - var8;
                        i.field_q.field_Rb.field_zb = i.field_q.field_Rb.field_zb + var8;
                        if (oi.field_d) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        i.field_q.field_Rb.field_cb = var7;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        i.field_q.field_Rb.field_C = var7 - i.field_q.field_Rb.field_cb;
                        if (!oi.field_d) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        oi.field_d = false;
                        i.field_q.field_Rb.field_zb = i.field_q.field_Qb.field_cb - i.field_q.field_Rb.field_cb;
                        nd.field_b = true;
                        i.field_q.field_Rb.field_Db = 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (param2 == -13294) {
                            statePc = 71;
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
                        field_d = null;
                        statePc = 69;
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
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (!ld.field_s) {
                            statePc = 78;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = null;
                        stackOut_72_1 = wp.field_k;
                        stackIn_73_0 = stackOut_72_0;
                        stackIn_73_1 = stackOut_72_1;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackOut_73_0 = (Object) (Object) stackIn_73_0;
                        stackOut_73_1 = (mh) (Object) stackIn_73_1;
                        stackIn_75_0 = stackOut_73_0;
                        stackIn_75_1 = stackOut_73_1;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((Object) (Object) stackIn_75_0 != (Object) (Object) stackIn_75_1) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        nd.field_b = true;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var9 = i.field_q.field_Qb.field_cb - (i.field_q.field_Rb.field_cb - -i.field_q.field_Rb.field_C);
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (!nd.field_b) {
                            statePc = 83;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        i.field_q.field_Rb.field_Db = var9 - i.field_q.field_Rb.field_zb;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        i.field_q.a(true, param1, true, 2 * (param1 * param3));
                        if ((var9 ^ -1) != (i.field_q.field_Rb.field_Db + i.field_q.field_Rb.field_zb ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackOut_84_0 = 1;
                        stackIn_87_0 = stackOut_84_0;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = 0;
                        stackIn_87_0 = stackOut_86_0;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        nd.field_b = stackIn_87_0 != 0;
                        stackOut_87_0 = (gb) var4_ref;
                        stackIn_88_0 = stackOut_87_0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 88: {
                    return (gb) (Object) stackIn_88_0;
                }
                case 89: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var4, "sj.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(java.applet.Applet param0, byte param1, String param2, String param3, long param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var6_ref2 = null;
            String var7 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            RuntimeException stackOut_12_0;
            StringBuilder stackOut_12_1;
            RuntimeException stackOut_13_0;
            StringBuilder stackOut_13_1;
            String stackOut_13_2;
            RuntimeException stackOut_15_0;
            StringBuilder stackOut_15_1;
            String stackOut_15_2;
            RuntimeException stackOut_16_0;
            StringBuilder stackOut_16_1;
            RuntimeException stackOut_17_0;
            StringBuilder stackOut_17_1;
            String stackOut_17_2;
            RuntimeException stackOut_19_0;
            StringBuilder stackOut_19_1;
            String stackOut_19_2;
            RuntimeException stackOut_20_0;
            StringBuilder stackOut_20_1;
            RuntimeException stackOut_21_0;
            StringBuilder stackOut_21_1;
            String stackOut_21_2;
            RuntimeException stackOut_23_0;
            StringBuilder stackOut_23_1;
            String stackOut_23_2;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (param1 > 66) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = (stateCaught_0 instanceof RuntimeException ? 11 : 3);
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            gb discarded$1 = sj.a(-31, 62, -5, -79);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 11 : 3);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var6_ref2 = param0.getParameter("cookiehost");
                            var7 = param3 + "=" + param2 + "; version=1; path=/; domain=" + var6_ref2;
                            if (0L > param4) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var7 = var7 + "; Expires=" + ke.a((byte) -75, ue.a(false) - -(param4 * 1000L)) + "; Max-Age=" + param4;
                            if (!BrickABrac.field_J) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var7 = var7 + "; Discard;";
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ne.a(param0, "document.cookie=\"" + var7 + "\"", 5797);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var6 = caughtException;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var6_ref = (RuntimeException) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = (RuntimeException) var6_ref;
                            stackOut_12_1 = new StringBuilder().append("sj.C(");
                            stackIn_15_0 = stackOut_12_0;
                            stackIn_15_1 = stackOut_12_1;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            if (param0 == null) {
                                statePc = 15;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                            stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                            stackOut_13_2 = "{...}";
                            stackIn_16_0 = stackOut_13_0;
                            stackIn_16_1 = stackOut_13_1;
                            stackIn_16_2 = stackOut_13_2;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 15: {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "null";
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44);
                            stackIn_19_0 = stackOut_16_0;
                            stackIn_19_1 = stackOut_16_1;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            if (param2 == null) {
                                statePc = 19;
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
                            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                            stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                            stackOut_17_2 = "{...}";
                            stackIn_20_0 = stackOut_17_0;
                            stackIn_20_1 = stackOut_17_1;
                            stackIn_20_2 = stackOut_17_2;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "null";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        try {
                            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
                            stackIn_23_0 = stackOut_20_0;
                            stackIn_23_1 = stackOut_20_1;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            if (param3 == null) {
                                statePc = 23;
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
                            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                            stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                            stackOut_21_2 = "{...}";
                            stackIn_24_0 = stackOut_21_0;
                            stackIn_24_1 = stackOut_21_1;
                            stackIn_24_2 = stackOut_21_2;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 23: {
                        stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                        stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                        stackOut_23_2 = "null";
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        throw qb.a((Throwable) (Object) stackIn_24_0, (String) (Object) (stackIn_24_2 + 44 + param4 + 41));
                    }
                    case 25: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        pi var1 = null;
        int var2 = 0;
        id var3_ref_id = null;
        int var3_int = 0;
        long var3 = 0L;
        om var3_ref_om = null;
        om var4_ref_om = null;
        int var4 = 0;
        om var4_ref = null;
        String var5 = null;
        int var5_int = 0;
        om var5_ref = null;
        String var6 = null;
        String var7 = null;
        id var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_28_0 = 0;
        String stackIn_169_0 = null;
        String stackIn_170_0 = null;
        String stackIn_171_0 = null;
        int stackIn_171_1 = 0;
        int stackIn_200_0 = 0;
        id stackIn_206_0 = null;
        id stackIn_207_0 = null;
        id stackIn_208_0 = null;
        int stackIn_208_1 = 0;
        boolean stackOut_16_0;
        boolean stackOut_17_0;
        int stackOut_27_0;
        String stackOut_168_0;
        String stackOut_170_0;
        int stackOut_170_1;
        String stackOut_169_0;
        int stackOut_169_1;
        int stackOut_199_0;
        int stackOut_198_0;
        id stackOut_205_0;
        id stackOut_207_0;
        int stackOut_207_1;
        id stackOut_206_0;
        int stackOut_206_1;
        L0: {
          L1: {
            L2: {
              var11 = BrickABrac.field_J ? 1 : 0;
              var1 = jl.field_e;
              var2 = ((wq) (Object) var1).l(255);
              if (var2 == 0) {
                break L2;
              } else {
                if ((var2 ^ -1) == -2) {
                  break L2;
                } else {
                  if (-3 == (var2 ^ -1)) {
                    break L2;
                  } else {
                    if (-4 == (var2 ^ -1)) {
                      break L2;
                    } else {
                      if (4 != var2) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            var3_ref_id = (id) (Object) mp.field_Tb.d(-8);
            L3: while (true) {
              L4: {
                L5: {
                  if (null == var3_ref_id) {
                    break L5;
                  } else {
                    var3_ref_id.b((byte) 111);
                    var3_ref_id.d(param0 + -30);
                    var3_ref_id = (id) (Object) mp.field_Tb.a((byte) 116);
                    if (var11 != 0) {
                      break L4;
                    } else {
                      if (var11 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var3_ref_id = (id) (Object) eq.field_m.b((byte) 89);
                break L4;
              }
              L6: while (true) {
                L7: {
                  L8: {
                    if (null == var3_ref_id) {
                      break L8;
                    } else {
                      stackOut_16_0 = var3_ref_id.field_Qb;
                      stackIn_28_0 = stackOut_16_0 ? 1 : 0;
                      stackIn_17_0 = stackOut_16_0;
                      if (var11 != 0) {
                        break L7;
                      } else {
                        stackOut_17_0 = stackIn_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        L9: {
                          L10: {
                            if (stackIn_18_0) {
                              break L10;
                            } else {
                              if (!var3_ref_id.field_fc) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            var3_ref_id.field_Qb = false;
                            if (!var3_ref_id.field_fc) {
                              break L11;
                            } else {
                              uf.field_c = uf.field_c - 1;
                              var3_ref_id.field_fc = false;
                              break L11;
                            }
                          }
                          wl.a(var3_ref_id, 17574);
                          break L9;
                        }
                        var3_ref_id = (id) (Object) eq.field_m.a(false);
                        if (var11 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_27_0 = -2;
                  stackIn_28_0 = stackOut_27_0;
                  break L7;
                }
                L12: {
                  if (stackIn_28_0 != (var2 ^ -1)) {
                    break L12;
                  } else {
                    if (o.field_e == null) {
                      break L12;
                    } else {
                      pk.field_g = o.field_e.field_Fc;
                      break L12;
                    }
                  }
                }
                L13: {
                  L14: {
                    if (4 == var2) {
                      break L14;
                    } else {
                      o.field_e = null;
                      if (var11 == 0) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  var3_int = ((wq) (Object) var1).i(65280);
                  o.field_e = new om(cq.field_p);
                  o.field_e.a((long)var3_int, -105);
                  eb.a(o.field_e, (wq) (Object) var1, 0, false);
                  ic.field_b = 0L;
                  break L13;
                }
                L15: {
                  L16: {
                    if (var2 == 2) {
                      break L16;
                    } else {
                      if (3 == var2) {
                        break L16;
                      } else {
                        nl.field_f = null;
                        if (var11 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  if (null == nl.field_f) {
                    nl.field_f = new om(cq.field_p);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L17: {
                  if (var2 != 3) {
                    break L17;
                  } else {
                    fh.field_d = true;
                    var3_int = 0;
                    L18: while (true) {
                      L19: {
                        L20: {
                          if (var3_int >= rh.field_d.length) {
                            break L20;
                          } else {
                            rh.field_d[var3_int] = ((wq) (Object) var1).b(true);
                            var3_int++;
                            if (var11 != 0) {
                              break L19;
                            } else {
                              if (var11 == 0) {
                                continue L18;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        bb.field_e = ((wq) (Object) var1).l(255);
                        mf.field_c = ((wq) (Object) var1).l(param0 + 222);
                        break L19;
                      }
                      var3_int = 0;
                      L21: while (true) {
                        L22: {
                          if (var3_int >= lj.field_p.length) {
                            break L22;
                          } else {
                            lj.field_p[var3_int] = ((wq) (Object) var1).b(true);
                            var3_int++;
                            if (var11 != 0) {
                              break L0;
                            } else {
                              if (var11 == 0) {
                                continue L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                        if (var11 == 0) {
                          break L0;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                }
                fh.field_d = false;
                if (var11 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L23: {
            if (-6 == (var2 ^ -1)) {
              break L23;
            } else {
              L24: {
                if (var2 != 6) {
                  break L24;
                } else {
                  L25: {
                    var3 = ((wq) (Object) var1).g(param0 ^ -32735);
                    var5_int = ((wq) (Object) var1).l(255);
                    var6 = (String) (Object) ab.a((byte) 96, var3);
                    if (var6 != null) {
                      L26: {
                        if (((id) (Object) var6).field_fc) {
                          uf.field_c = uf.field_c - 1;
                          ((id) (Object) var6).field_fc = false;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      L27: {
                        L28: {
                          if (var5_int == 0) {
                            break L28;
                          } else {
                            ((id) (Object) var6).field_kc = var5_int;
                            ((id) (Object) var6).field_ic = cm.field_o;
                            if (var11 == 0) {
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                        ((id) (Object) var6).b((byte) 111);
                        break L27;
                      }
                      ((id) (Object) var6).d(param0 ^ 34);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  if (var11 == 0) {
                    break L0;
                  } else {
                    break L24;
                  }
                }
              }
              L29: {
                if (-8 == (var2 ^ -1)) {
                  break L29;
                } else {
                  L30: {
                    if (-9 != (var2 ^ -1)) {
                      break L30;
                    } else {
                      L31: {
                        var3_int = ((wq) (Object) var1).i(65280);
                        var4_ref_om = (om) (Object) pn.field_i.a((long)var3_int, -1);
                        if (null != var4_ref_om) {
                          break L31;
                        } else {
                          var4_ref = new om(cq.field_p);
                          pn.field_i.a((long)var3_int, (tk) (Object) var4_ref, 47);
                          break L31;
                        }
                      }
                      eb.a(var4_ref, (wq) (Object) var1, 0, true);
                      ic.a(true, var4_ref);
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L30;
                      }
                    }
                  }
                  L32: {
                    if (9 != var2) {
                      break L32;
                    } else {
                      L33: {
                        var3_int = ((wq) (Object) var1).i(65280);
                        var4 = ((wq) (Object) var1).l(255);
                        var5_ref = (om) (Object) pn.field_i.a((long)var3_int, -1);
                        if (null != var5_ref) {
                          L34: {
                            L35: {
                              if (-1 == (var4 ^ -1)) {
                                break L35;
                              } else {
                                var5_ref.field_Zb = var4;
                                var5_ref.field_Wb = cm.field_o;
                                if (var11 == 0) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            var5_ref.b((byte) 111);
                            break L34;
                          }
                          var5_ref.d(3);
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L32;
                      }
                    }
                  }
                  L36: {
                    if (var2 != 10) {
                      break L36;
                    } else {
                      var3_ref_om = (om) (Object) rq.field_a.d(-62);
                      L37: while (true) {
                        L38: {
                          if (var3_ref_om == null) {
                            break L38;
                          } else {
                            var3_ref_om.b((byte) 111);
                            var3_ref_om.d(3);
                            var3_ref_om = (om) (Object) rq.field_a.a((byte) 116);
                            if (var11 != 0) {
                              break L0;
                            } else {
                              if (var11 == 0) {
                                continue L37;
                              } else {
                                break L38;
                              }
                            }
                          }
                        }
                        if (var11 == 0) {
                          break L0;
                        } else {
                          break L36;
                        }
                      }
                    }
                  }
                  L39: {
                    L40: {
                      if (-12 == (var2 ^ -1)) {
                        break L40;
                      } else {
                        if ((var2 ^ -1) != -13) {
                          break L39;
                        } else {
                          break L40;
                        }
                      }
                    }
                    L41: {
                      var3_int = ((wq) (Object) var1).i(65280);
                      var4_ref_om = (om) (Object) pn.field_i.a((long)var3_int, -1);
                      if (null == var4_ref_om) {
                        break L41;
                      } else {
                        L42: {
                          L43: {
                            if (var2 != 11) {
                              break L43;
                            } else {
                              var4_ref_om.field_Pb = true;
                              if (var11 == 0) {
                                break L42;
                              } else {
                                break L43;
                              }
                            }
                          }
                          var4_ref_om.field_dc = true;
                          break L42;
                        }
                        ic.a(true, var4_ref_om);
                        break L41;
                      }
                    }
                    if (var11 == 0) {
                      break L0;
                    } else {
                      break L39;
                    }
                  }
                  L44: {
                    if ((var2 ^ -1) == -14) {
                      break L44;
                    } else {
                      L45: {
                        L46: {
                          if ((var2 ^ -1) == -15) {
                            break L46;
                          } else {
                            if (16 != var2) {
                              break L45;
                            } else {
                              break L46;
                            }
                          }
                        }
                        L47: {
                          var3 = ((wq) (Object) var1).g(param0 ^ -32735);
                          var5 = (String) (Object) ab.a((byte) 96, var3);
                          if (null != var5) {
                            L48: {
                              L49: {
                                if ((var2 ^ -1) != -15) {
                                  break L49;
                                } else {
                                  ((id) (Object) var5).field_Qb = true;
                                  if (var11 == 0) {
                                    break L48;
                                  } else {
                                    break L49;
                                  }
                                }
                              }
                              if (!((id) (Object) var5).field_fc) {
                                uf.field_c = uf.field_c + 1;
                                ((id) (Object) var5).field_fc = true;
                                break L48;
                              } else {
                                break L48;
                              }
                            }
                            wl.a((id) (Object) var5, 17574);
                            break L47;
                          } else {
                            break L47;
                          }
                        }
                        if (var11 == 0) {
                          break L0;
                        } else {
                          break L45;
                        }
                      }
                      L50: {
                        if (-16 == (var2 ^ -1)) {
                          break L50;
                        } else {
                          if ((var2 ^ -1) == -18) {
                            break L50;
                          } else {
                            L51: {
                              if (18 == var2) {
                                break L51;
                              } else {
                                L52: {
                                  if (var2 == 19) {
                                    break L52;
                                  } else {
                                    L53: {
                                      if (20 != var2) {
                                        break L53;
                                      } else {
                                        eb.a(o.field_e, (wq) (Object) var1, 0, false);
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L53;
                                        }
                                      }
                                    }
                                    L54: {
                                      if (var2 == 21) {
                                        break L54;
                                      } else {
                                        L55: {
                                          if (22 != var2) {
                                            break L55;
                                          } else {
                                            m.field_h = ((wq) (Object) var1).i(65280);
                                            ko.field_s = ((wq) (Object) var1).c((byte) 119);
                                            if (var11 == 0) {
                                              break L0;
                                            } else {
                                              break L55;
                                            }
                                          }
                                        }
                                        L56: {
                                          if (var2 != 23) {
                                            break L56;
                                          } else {
                                            oc.field_p = ((wq) (Object) var1).g(-32768);
                                            if (var11 == 0) {
                                              break L0;
                                            } else {
                                              break L56;
                                            }
                                          }
                                        }
                                        rk.a("L1: " + eq.c((byte) -121), (Throwable) null, 108);
                                        hn.a((byte) 84);
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                    L57: {
                                      L58: {
                                        var3_int = ((wq) (Object) var1).i(65280);
                                        if ((var3_int ^ -1) != -1) {
                                          break L58;
                                        } else {
                                          ic.field_b = 0L;
                                          if (var11 == 0) {
                                            break L57;
                                          } else {
                                            break L58;
                                          }
                                        }
                                      }
                                      ic.field_b = (long)var3_int + ue.a(false);
                                      break L57;
                                    }
                                    if (var11 == 0) {
                                      break L0;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                                L59: {
                                  var3 = ((wq) (Object) var1).g(-32768);
                                  var5_int = ((wq) (Object) var1).l(255);
                                  var6 = (String) (Object) ac.a(var3, 2);
                                  if (null != var6) {
                                    L60: {
                                      L61: {
                                        if (0 == var5_int) {
                                          break L61;
                                        } else {
                                          ((id) (Object) var6).field_ic = cm.field_o;
                                          ((id) (Object) var6).field_kc = var5_int;
                                          if (var11 == 0) {
                                            break L60;
                                          } else {
                                            break L61;
                                          }
                                        }
                                      }
                                      ((id) (Object) var6).b((byte) 111);
                                      break L60;
                                    }
                                    ((id) (Object) var6).d(param0 + -30);
                                    o.field_e.field_cc = o.field_e.field_cc - 1;
                                    break L59;
                                  } else {
                                    break L59;
                                  }
                                }
                                if (var11 == 0) {
                                  break L0;
                                } else {
                                  break L51;
                                }
                              }
                            }
                            L62: {
                              var3 = ((wq) (Object) var1).g(-32768);
                              var5 = ((wq) (Object) var1).d(param0 + -34);
                              var6 = ((wq) (Object) var1).d(param0 + -34);
                              var7 = (String) (Object) ac.a(var3, 2);
                              if (null != var7) {
                                break L62;
                              } else {
                                var7 = (String) (Object) new id(var5, var6, var3);
                                BrickABrac.field_F.a(var3, (tk) (Object) var7, 48);
                                o.field_e.field_cc = o.field_e.field_cc + 1;
                                break L62;
                              }
                            }
                            L63: {
                              ((id) (Object) var7).field_Wb = ((wq) (Object) var1).i(65280);
                              var8_int = ((wq) (Object) var1).c((byte) 127);
                              stackOut_168_0 = (String) var7;
                              stackIn_170_0 = stackOut_168_0;
                              stackIn_169_0 = stackOut_168_0;
                              if (0 == (var8_int & 1)) {
                                stackOut_170_0 = (String) (Object) stackIn_170_0;
                                stackOut_170_1 = 0;
                                stackIn_171_0 = stackOut_170_0;
                                stackIn_171_1 = stackOut_170_1;
                                break L63;
                              } else {
                                stackOut_169_0 = (String) (Object) stackIn_169_0;
                                stackOut_169_1 = 1;
                                stackIn_171_0 = stackOut_169_0;
                                stackIn_171_1 = stackOut_169_1;
                                break L63;
                              }
                            }
                            ((id) (Object) stackIn_171_0).field_ec = stackIn_171_1 != 0;
                            ((id) (Object) var7).field_ac = var8_int >> 814731393;
                            ((id) (Object) var7).field_Zb = ((wq) (Object) var1).l(param0 ^ 222);
                            ((id) (Object) var7).field_Ub = ((wq) (Object) var1).l(param0 + 222);
                            mp.field_Tb.a((nm) (Object) var7, (byte) 3);
                            if (var11 == 0) {
                              break L0;
                            } else {
                              break L50;
                            }
                          }
                        }
                      }
                      L64: {
                        var3 = ((wq) (Object) var1).g(-32768);
                        var5_int = ((wq) (Object) var1).l(param0 ^ 222);
                        var6 = (String) (Object) ab.a((byte) 96, var3);
                        if (var6 == null) {
                          break L64;
                        } else {
                          L65: {
                            L66: {
                              if (15 != var2) {
                                break L66;
                              } else {
                                ((id) (Object) var6).field_Qb = false;
                                if (var11 == 0) {
                                  break L65;
                                } else {
                                  break L66;
                                }
                              }
                            }
                            if (((id) (Object) var6).field_fc) {
                              ((id) (Object) var6).field_fc = false;
                              uf.field_c = uf.field_c - 1;
                              break L65;
                            } else {
                              break L65;
                            }
                          }
                          L67: {
                            if ((var5_int ^ -1) == -1) {
                              break L67;
                            } else {
                              ((id) (Object) var6).field_ic = cm.field_o;
                              ((id) (Object) var6).field_kc = var5_int;
                              break L67;
                            }
                          }
                          wl.a((id) (Object) var6, 17574);
                          break L64;
                        }
                      }
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L44;
                      }
                    }
                  }
                  L68: {
                    var3_int = ((wq) (Object) var1).i(65280);
                    var4 = ((wq) (Object) var1).l(255);
                    var5_ref = (om) (Object) pn.field_i.a((long)var3_int, param0 + -34);
                    if (null == var5_ref) {
                      break L68;
                    } else {
                      L69: {
                        var6 = (String) (Object) var5_ref;
                        var5_ref.field_dc = false;
                        ((om) (Object) var6).field_Pb = false;
                        if (var4 == 0) {
                          break L69;
                        } else {
                          var5_ref.field_Zb = var4;
                          var5_ref.field_Wb = cm.field_o;
                          break L69;
                        }
                      }
                      ic.a(true, var5_ref);
                      break L68;
                    }
                  }
                  if (var11 == 0) {
                    break L0;
                  } else {
                    break L29;
                  }
                }
              }
              var3_ref_id = (id) (Object) ua.field_c.d(-61);
              L70: while (true) {
                L71: {
                  L72: {
                    if (var3_ref_id == null) {
                      break L72;
                    } else {
                      var3_ref_id.b((byte) 111);
                      var3_ref_id.d(3);
                      var3_ref_id = (id) (Object) ua.field_c.a((byte) 116);
                      if (var11 != 0) {
                        break L71;
                      } else {
                        if (var11 == 0) {
                          continue L70;
                        } else {
                          break L72;
                        }
                      }
                    }
                  }
                  uf.field_c = 0;
                  break L71;
                }
                if (var11 == 0) {
                  break L0;
                } else {
                  break L23;
                }
              }
            }
          }
          L73: {
            var3 = ((wq) (Object) var1).g(-32768);
            var5 = ((wq) (Object) var1).d(-1);
            var6 = ((wq) (Object) var1).d(-1);
            var7 = ((wq) (Object) var1).d(-1);
            var8 = ab.a((byte) 96, var3);
            if (var6.equals((Object) (Object) "")) {
              stackOut_199_0 = 0;
              stackIn_200_0 = stackOut_199_0;
              break L73;
            } else {
              stackOut_198_0 = 1;
              stackIn_200_0 = stackOut_198_0;
              break L73;
            }
          }
          L74: {
            L75: {
              var9 = stackIn_200_0;
              if (null != var8) {
                break L75;
              } else {
                var8 = new id(var5, var7, var3);
                eq.field_m.a(var3, (tk) (Object) var8, 86);
                if (var11 == 0) {
                  break L74;
                } else {
                  break L75;
                }
              }
            }
            if (var9 == 0) {
              break L74;
            } else {
              var8.a(var7, var5, (byte) -121);
              break L74;
            }
          }
          L76: {
            var8.field_Xb = ue.a(false) - (long)((wq) (Object) var1).e(255);
            var8.field_Wb = ((wq) (Object) var1).i(65280);
            var10 = ((wq) (Object) var1).c((byte) 110);
            var8.field_ac = var10 >> -324512415;
            stackOut_205_0 = (id) var8;
            stackIn_207_0 = stackOut_205_0;
            stackIn_206_0 = stackOut_205_0;
            if (-1 == (1 & var10 ^ -1)) {
              stackOut_207_0 = (id) (Object) stackIn_207_0;
              stackOut_207_1 = 0;
              stackIn_208_0 = stackOut_207_0;
              stackIn_208_1 = stackOut_207_1;
              break L76;
            } else {
              stackOut_206_0 = (id) (Object) stackIn_206_0;
              stackOut_206_1 = 1;
              stackIn_208_0 = stackOut_206_0;
              stackIn_208_1 = stackOut_206_1;
              break L76;
            }
          }
          ((id) (Object) stackIn_208_0).field_ec = stackIn_208_1 != 0;
          var8.field_Zb = ((wq) (Object) var1).l(255);
          var8.field_Ub = ((wq) (Object) var1).l(255);
          wl.a(var8, 17574);
          break L0;
        }
        L77: {
          if (param0 == 33) {
            break L77;
          } else {
            sj.a((java.applet.Applet) null, (byte) -55, (String) null, (String) null, -27L);
            break L77;
          }
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_f = null;
              field_a = null;
              field_d = null;
              field_c = null;
              if (param0 == 11) {
                break L0;
              } else {
                field_d = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_g = null;
          field_b = null;
          field_e = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Remove <%0> from friend list";
        field_e = "Confuse: reverse the paddle's controls.";
    }
}
