/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends nm {
    int field_x;
    int field_r;
    int field_s;
    int field_z;
    static tq field_l;
    static jp field_n;
    int field_o;
    static String field_C;
    jm field_G;
    int field_A;
    int field_q;
    int field_B;
    pq field_k;
    int field_p;
    kl field_y;
    int field_v;
    int field_D;
    int field_w;
    int field_t;
    int field_i;
    static int field_E;
    int field_m;
    oe field_F;
    int field_j;
    int field_u;

    final static void a(String param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        String stackIn_13_0 = null;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        boolean stackIn_36_0 = false;
        int stackIn_40_0 = 0;
        int stackIn_62_0 = 0;
        boolean stackIn_66_0 = false;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        int stackOut_2_0;
        String stackOut_12_0;
        int stackOut_22_0;
        int stackOut_26_0;
        int stackOut_30_0;
        int stackOut_32_0;
        boolean stackOut_35_0;
        int stackOut_39_0;
        int stackOut_61_0;
        boolean stackOut_65_0;
        int stackOut_73_0;
        RuntimeException stackOut_83_0;
        StringBuilder stackOut_83_1;
        RuntimeException stackOut_84_0;
        StringBuilder stackOut_84_1;
        String stackOut_84_2;
        RuntimeException stackOut_86_0;
        StringBuilder stackOut_86_1;
        String stackOut_86_2;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        go.field_e = go.field_e + 1;
                        if (-1 != oo.field_v) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = ll.field_b;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 != -1) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        oo.field_v = pq.field_k;
                        ll.field_b = po.field_a;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param1 == 22546) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        if (param0 == null) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (String) param0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (((String) (Object) stackIn_13_0).equals((Object) (Object) vq.field_J)) {
                            statePc = 60;
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
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (null != vq.field_J) {
                            statePc = 60;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (th.field_h) {
                            statePc = 32;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = go.field_e;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((stackIn_23_0 ^ -1) > (ue.field_e ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = ue.field_e;
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 + jh.field_a <= go.field_e) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = 1;
                        stackIn_33_0 = stackOut_30_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var2_int = stackIn_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (param0 == null) {
                            statePc = 46;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = th.field_h;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
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
                            statePc = 43;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = var2_int;
                        stackIn_40_0 = stackOut_39_0;
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
                        if (stackIn_40_0 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        go.field_e = ue.field_e;
                        if (var3 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        go.field_e = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ad.field_j = ll.field_b;
                        if (null != param0) {
                            statePc = 56;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var2_int != 0) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 59;
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
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        th.field_h = true;
                        if (var3 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        th.field_h = false;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        b.field_a = oo.field_v;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        vq.field_J = param0;
                        if (th.field_h) {
                            statePc = 72;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = go.field_e;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 >= ue.field_e) {
                            statePc = 72;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = kb.field_Xb;
                        stackIn_66_0 = stackOut_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0) {
                            statePc = 71;
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
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        b.field_a = oo.field_v;
                        go.field_e = 0;
                        ad.field_j = ll.field_b;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (!th.field_h) {
                            statePc = 80;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackOut_73_0 = go.field_e;
                        stackIn_74_0 = stackOut_73_0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (stackIn_74_0 == ol.field_y) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        th.field_h = false;
                        go.field_e = 0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        ll.field_b = -1;
                        oo.field_v = -1;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 82: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    try {
                        stackOut_83_0 = (RuntimeException) var2;
                        stackOut_83_1 = new StringBuilder().append("ka.G(");
                        stackIn_86_0 = stackOut_83_0;
                        stackIn_86_1 = stackOut_83_1;
                        stackIn_84_0 = stackOut_83_0;
                        stackIn_84_1 = stackOut_83_1;
                        if (param0 == null) {
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
                        stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
                        stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
                        stackOut_84_2 = "{...}";
                        stackIn_87_0 = stackOut_84_0;
                        stackIn_87_1 = stackOut_84_1;
                        stackIn_87_2 = stackOut_84_2;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 85: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 86: {
                    stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
                    stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
                    stackOut_86_2 = "null";
                    stackIn_87_0 = stackOut_86_0;
                    stackIn_87_1 = stackOut_86_1;
                    stackIn_87_2 = stackOut_86_2;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    throw qb.a((Throwable) (Object) stackIn_87_0, (String) (Object) (stackIn_87_2 + 44 + param1 + 41));
                }
                case 88: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, mm param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        vl var10 = null;
        int var10_int = 0;
        int var11 = 0;
        id var12 = null;
        id var13 = null;
        int var14 = 0;
        mh var15 = null;
        mh var16 = null;
        mh var17 = null;
        mh var18 = null;
        mh var19 = null;
        int var20 = 0;
        String var21 = null;
        int var22 = 0;
        int var23 = 0;
        String var24 = null;
        int var24_int = 0;
        int var25_int = 0;
        String var25 = null;
        String var25_ref = null;
        int var26_int = 0;
        String var26 = null;
        int var27 = 0;
        int var28_int = 0;
        String var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31_int = 0;
        String var31 = null;
        int var32 = 0;
        mm stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        int stackIn_48_4 = 0;
        boolean stackIn_48_5 = false;
        mm stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        int stackIn_49_4 = 0;
        boolean stackIn_49_5 = false;
        mm stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        int stackIn_50_4 = 0;
        boolean stackIn_50_5 = false;
        int stackIn_50_6 = 0;
        int stackIn_66_0 = 0;
        mh stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        mh stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        mh stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        int stackIn_114_4 = 0;
        mm stackOut_47_0;
        int stackOut_47_1;
        int stackOut_47_2;
        int stackOut_47_3;
        int stackOut_47_4;
        boolean stackOut_47_5;
        mm stackOut_49_0;
        int stackOut_49_1;
        int stackOut_49_2;
        int stackOut_49_3;
        int stackOut_49_4;
        boolean stackOut_49_5;
        int stackOut_49_6;
        mm stackOut_48_0;
        int stackOut_48_1;
        int stackOut_48_2;
        int stackOut_48_3;
        int stackOut_48_4;
        boolean stackOut_48_5;
        int stackOut_48_6;
        int stackOut_65_0;
        int stackOut_64_0;
        mh stackOut_111_0;
        int stackOut_111_1;
        int stackOut_111_2;
        int stackOut_111_3;
        mh stackOut_113_0;
        int stackOut_113_1;
        int stackOut_113_2;
        int stackOut_113_3;
        int stackOut_113_4;
        mh stackOut_112_0;
        int stackOut_112_1;
        int stackOut_112_2;
        int stackOut_112_3;
        int stackOut_112_4;
        L0: {
          L1: {
            var32 = BrickABrac.field_J ? 1 : 0;
            var5_int = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            if (o.field_e == null) {
              break L1;
            } else {
              L2: {
                if (null != vl.field_a) {
                  break L2;
                } else {
                  if (null != bl.field_F) {
                    break L2;
                  } else {
                    if (null != ld.field_v) {
                      break L2;
                    } else {
                      if (null == me.field_e) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var9 = 0;
              L3: while (true) {
                if (var9 >= cq.field_p) {
                  break L1;
                } else {
                  var10_int = 255 & o.field_e.field_Tb[var9];
                  if (var32 != 0) {
                    break L0;
                  } else {
                    L4: {
                      if (null == vl.field_a) {
                        break L4;
                      } else {
                        if (null != vl.field_a[var9]) {
                          if (!vl.field_a[var9][var10_int]) {
                            break L4;
                          } else {
                            var5_int = 1;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (bl.field_F == null) {
                        break L5;
                      } else {
                        if (bl.field_F[var9] == null) {
                          break L5;
                        } else {
                          L6: {
                            var11 = bl.field_F[var9][var10_int];
                            if ((var11 ^ -1) == -1) {
                              break L6;
                            } else {
                              if (!ea.field_g) {
                                var5_int = 1;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (var11 > var6) {
                            var6 = var11;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L7: {
                      if (null == me.field_e) {
                        break L7;
                      } else {
                        if (null == me.field_e[var9]) {
                          break L7;
                        } else {
                          var8 = var8 | me.field_e[var9][var10_int];
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (null == ld.field_v) {
                        break L8;
                      } else {
                        if (ld.field_v[var9] != null) {
                          L9: {
                            var11 = ld.field_v[var9][var10_int];
                            if ((var11 ^ -1) == -1) {
                              break L9;
                            } else {
                              if (!ea.field_g) {
                                var5_int = 1;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (var11 > var7) {
                            var7 = var11;
                            break L8;
                          } else {
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    var9++;
                    if (var32 == 0) {
                      continue L3;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          L10: {
            stackOut_47_0 = (mm) param1;
            stackOut_47_1 = 2;
            stackOut_47_2 = param3 * 4 * (2 + np.field_a);
            stackOut_47_3 = np.field_a * 2 - -4;
            stackOut_47_4 = 22676;
            stackOut_47_5 = param0;
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_49_2 = stackOut_47_2;
            stackIn_49_3 = stackOut_47_3;
            stackIn_49_4 = stackOut_47_4;
            stackIn_49_5 = stackOut_47_5;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            stackIn_48_2 = stackOut_47_2;
            stackIn_48_3 = stackOut_47_3;
            stackIn_48_4 = stackOut_47_4;
            stackIn_48_5 = stackOut_47_5;
            if (param1 != o.field_b) {
              stackOut_49_0 = (mm) (Object) stackIn_49_0;
              stackOut_49_1 = stackIn_49_1;
              stackOut_49_2 = stackIn_49_2;
              stackOut_49_3 = stackIn_49_3;
              stackOut_49_4 = stackIn_49_4;
              stackOut_49_5 = stackIn_49_5;
              stackOut_49_6 = 0;
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              stackIn_50_3 = stackOut_49_3;
              stackIn_50_4 = stackOut_49_4;
              stackIn_50_5 = stackOut_49_5;
              stackIn_50_6 = stackOut_49_6;
              break L10;
            } else {
              stackOut_48_0 = (mm) (Object) stackIn_48_0;
              stackOut_48_1 = stackIn_48_1;
              stackOut_48_2 = stackIn_48_2;
              stackOut_48_3 = stackIn_48_3;
              stackOut_48_4 = stackIn_48_4;
              stackOut_48_5 = stackIn_48_5;
              stackOut_48_6 = 1;
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              stackIn_50_3 = stackOut_48_3;
              stackIn_50_4 = stackOut_48_4;
              stackIn_50_5 = stackOut_48_5;
              stackIn_50_6 = stackOut_48_6;
              break L10;
            }
          }
          var9 = ((mm) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2, stackIn_50_3, stackIn_50_4, stackIn_50_5, stackIn_50_6 != 0) ? 1 : 0;
          break L0;
        }
        var10 = param1.field_Rb.field_bb;
        var11 = 73 % ((param4 - 41) / 57);
        var12 = null;
        var13 = (id) (Object) var10.d(-67);
        L11: while (true) {
          L12: {
            L13: {
              if (null == var13) {
                break L13;
              } else {
                var14 = 0;
                if (var32 != 0) {
                  break L12;
                } else {
                  L14: {
                    if (null != var13.field_bb) {
                      break L14;
                    } else {
                      L15: {
                        var13.field_Rb = new mh(0L, vb.field_K);
                        var13.a(var13.field_Rb, 0);
                        var13.field_dc = new mh(0L, fp.field_v);
                        if (vd.field_e) {
                          var13.a(var13.field_dc, 0);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      var13.field_dc.field_S = 2;
                      var13.field_Tb = new mh(0L, ad.field_l);
                      var13.a(var13.field_Tb, 0);
                      var13.c(true);
                      var13.field_Vb = new mh(0L, ok.field_d);
                      var13.a(var13.field_Vb, 0);
                      var13.field_cc = new mh(0L, ee.field_s);
                      var13.a(var13.field_cc, 0);
                      var14 = 1;
                      break L14;
                    }
                  }
                  L16: {
                    var13.field_Rb.field_Mb = null;
                    var15 = var13.field_Rb;
                    var13.field_Rb.field_cb = 0;
                    var15.field_Ib = 0;
                    var13.field_dc.field_Mb = null;
                    var13.field_dc.field_cb = 0;
                    var16 = var13.field_dc;
                    var16.field_Ib = 0;
                    var13.field_Vb.field_Mb = null;
                    var17 = var13.field_Vb;
                    var13.field_Vb.field_cb = 0;
                    var13.field_cc.field_Mb = null;
                    var17.field_Ib = 0;
                    var18 = var13.field_cc;
                    var13.field_cc.field_cb = 0;
                    var18.field_Ib = 0;
                    var13.field_Tb.field_Mb = null;
                    var19 = var13.field_Tb;
                    var13.field_Tb.field_cb = 0;
                    var19.field_Ib = 0;
                    var13.field_Ib = param1.field_Rb.field_Ib;
                    var20 = 0;
                    var21 = var13.field_Yb;
                    var22 = 72;
                    if (param1 != fo.field_b) {
                      break L16;
                    } else {
                      var22 += 42;
                      break L16;
                    }
                  }
                  L17: {
                    var21 = dh.a(var13.field_Rb.field_O, var21, var22);
                    if (var21.equals((Object) (Object) var13.field_Yb)) {
                      stackOut_65_0 = 0;
                      stackIn_66_0 = stackOut_65_0;
                      break L17;
                    } else {
                      stackOut_64_0 = 1;
                      stackIn_66_0 = stackOut_64_0;
                      break L17;
                    }
                  }
                  L18: {
                    L19: {
                      var23 = stackIn_66_0;
                      if (4 > var13.field_Zb) {
                        break L19;
                      } else {
                        var21 = "<img=" + (mq.field_g + -4 + var13.field_Zb) + ">" + var21;
                        if (var32 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    if (0 >= var13.field_Zb) {
                      break L18;
                    } else {
                      var21 = "<img=" + (-1 + var13.field_Zb) + ">" + var21;
                      break L18;
                    }
                  }
                  L20: {
                    var13.field_Rb.field_Mb = var21;
                    if (var13.i(0)) {
                      break L20;
                    } else {
                      L21: {
                        L22: {
                          L23: {
                            var24_int = 16764006;
                            var25_int = 16777215;
                            if (var5_int == 0) {
                              break L23;
                            } else {
                              if (!var13.field_ec) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                          if ((var6 ^ -1) < (var13.field_Wb ^ -1)) {
                            break L22;
                          } else {
                            if (var7 > var13.field_ac) {
                              break L22;
                            } else {
                              if (0 < (var8 & (var13.field_Ub ^ -1))) {
                                break L22;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        var25_int = 8421504;
                        var24_int = 8414771;
                        break L21;
                      }
                      L24: {
                        L25: {
                          var13.field_Rb.field_vb = var25_int;
                          var13.field_Rb.field_Fb = var25_int;
                          var13.field_Rb.field_Y = var25_int;
                          var13.field_Vb.field_X = var24_int;
                          var13.field_dc.field_X = var24_int;
                          var13.field_Rb.field_X = var24_int;
                          var13.field_dc.field_vb = var25_int;
                          var13.field_dc.field_Fb = var25_int;
                          var13.field_dc.field_Y = var25_int;
                          var13.field_Vb.field_vb = var25_int;
                          var13.field_Vb.field_Fb = var25_int;
                          var13.field_Vb.field_Y = var25_int;
                          if (param1 != vp.field_u) {
                            break L25;
                          } else {
                            if (o.field_e.field_Rb) {
                              break L24;
                            } else {
                              var13.field_cc.field_Mb = mj.field_b;
                              if (var32 == 0) {
                                break L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        L26: {
                          if (var13.field_Qb) {
                            break L26;
                          } else {
                            L27: {
                              if (var13.field_fc) {
                                break L27;
                              } else {
                                var13.field_Vb.field_Mb = ea.field_f;
                                if (var32 == 0) {
                                  break L24;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            var13.field_Rb.field_Mb = rd.a(ce.field_g, new String[1], (byte) 103);
                            var13.field_Vb.field_Mb = ip.field_t;
                            var13.field_cc.field_Mb = gq.field_Wb;
                            if (var32 == 0) {
                              break L24;
                            } else {
                              break L26;
                            }
                          }
                        }
                        var13.field_Rb.field_Mb = rd.a(ll.field_a, new String[1], (byte) 103);
                        var13.field_cc.field_Mb = wl.field_L;
                        break L24;
                      }
                      L28: {
                        var26_int = 0;
                        if (null == o.field_e) {
                          break L28;
                        } else {
                          if (!hn.b((byte) 7)) {
                            break L28;
                          } else {
                            if ((oc.field_p ^ -1L) == (var13.field_gc ^ -1L)) {
                              break L28;
                            } else {
                              L29: {
                                if (null == var13.field_Vb.field_Mb) {
                                  break L29;
                                } else {
                                  var27 = var13.field_Vb.g(123) - -(2 * om.field_oc);
                                  var13.field_Vb.a(np.field_a, var20, var26_int, var27, (byte) 64);
                                  var26_int = var26_int + var27;
                                  break L29;
                                }
                              }
                              if (var13.field_cc.field_Mb != null) {
                                L30: {
                                  L31: {
                                    if (vp.field_u != param1) {
                                      break L31;
                                    } else {
                                      var27 = 40;
                                      if (var32 == 0) {
                                        break L30;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                  var27 = var13.field_cc.g(99) - -(2 * om.field_oc);
                                  break L30;
                                }
                                var13.field_cc.a(np.field_a, var20, var26_int, var27, (byte) 64);
                                var26_int = var26_int + var27;
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                      }
                      L32: {
                        stackOut_111_0 = var13.field_Rb;
                        stackOut_111_1 = np.field_a;
                        stackOut_111_2 = var20;
                        stackOut_111_3 = var26_int;
                        stackIn_113_0 = stackOut_111_0;
                        stackIn_113_1 = stackOut_111_1;
                        stackIn_113_2 = stackOut_111_2;
                        stackIn_113_3 = stackOut_111_3;
                        stackIn_112_0 = stackOut_111_0;
                        stackIn_112_1 = stackOut_111_1;
                        stackIn_112_2 = stackOut_111_2;
                        stackIn_112_3 = stackOut_111_3;
                        if (vd.field_e) {
                          stackOut_113_0 = (mh) (Object) stackIn_113_0;
                          stackOut_113_1 = stackIn_113_1;
                          stackOut_113_2 = stackIn_113_2;
                          stackOut_113_3 = stackIn_113_3;
                          stackOut_113_4 = 42;
                          stackIn_114_0 = stackOut_113_0;
                          stackIn_114_1 = stackOut_113_1;
                          stackIn_114_2 = stackOut_113_2;
                          stackIn_114_3 = stackOut_113_3;
                          stackIn_114_4 = stackOut_113_4;
                          break L32;
                        } else {
                          stackOut_112_0 = (mh) (Object) stackIn_112_0;
                          stackOut_112_1 = stackIn_112_1;
                          stackOut_112_2 = stackIn_112_2;
                          stackOut_112_3 = stackIn_112_3;
                          stackOut_112_4 = 0;
                          stackIn_114_0 = stackOut_112_0;
                          stackIn_114_1 = stackOut_112_1;
                          stackIn_114_2 = stackOut_112_2;
                          stackIn_114_3 = stackOut_112_3;
                          stackIn_114_4 = stackOut_112_4;
                          break L32;
                        }
                      }
                      L33: {
                        L34: {
                          ((mh) (Object) stackIn_114_0).a(stackIn_114_1, stackIn_114_2, stackIn_114_3, -stackIn_114_4 + var13.field_Ib + -var26_int, (byte) 64);
                          var13.field_dc.field_Mb = Integer.toString(var13.field_Wb);
                          var13.field_dc.a(np.field_a, var20, -40 + var13.field_Ib, 40, (byte) 64);
                          if (!var13.field_Rb.field_kb) {
                            break L34;
                          } else {
                            if (var23 == 0) {
                              break L34;
                            } else {
                              ep.field_e = var13.field_Yb;
                              if (null == wq.field_i) {
                                break L33;
                              } else {
                                if (wq.field_i[var13.field_Zb] != null) {
                                  ep.field_e = ep.field_e + " - " + wq.field_i[var13.field_Zb];
                                  if (var32 == 0) {
                                    break L33;
                                  } else {
                                    break L34;
                                  }
                                } else {
                                  break L33;
                                }
                              }
                            }
                          }
                        }
                        if (!var13.field_Rb.field_kb) {
                          break L33;
                        } else {
                          if (null == wq.field_i) {
                            break L33;
                          } else {
                            if (wq.field_i[var13.field_Zb] == null) {
                              break L33;
                            } else {
                              ep.field_e = wq.field_i[var13.field_Zb];
                              break L33;
                            }
                          }
                        }
                      }
                      var20 = var20 + np.field_a;
                      break L20;
                    }
                  }
                  L35: {
                    var24 = l.a((byte) -110, var21, var13.field_kc);
                    if (null == var24) {
                      break L35;
                    } else {
                      var25_int = var13.field_Tb.field_O.a(var24, -om.field_oc + var13.field_Ib + -om.field_oc);
                      var13.field_Tb.field_jb = var13.field_ic * 256 / cm.field_o;
                      var13.field_Tb.field_Mb = var24;
                      var13.field_Tb.a(var25_int * np.field_a, var20, om.field_oc, var13.field_Ib + -(2 * om.field_oc), (byte) 64);
                      var20 = var20 + np.field_a * var25_int;
                      break L35;
                    }
                  }
                  L36: {
                    if (var9 == 0) {
                      var13.field_C = var20 - var13.field_cb;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if (var14 != 0) {
                      param1.field_Rb.a((mh) (Object) var12, 2, (mh) (Object) var13, 17290);
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  L38: {
                    if (var13.field_L == 0) {
                      break L38;
                    } else {
                      if (var13.i(0)) {
                        break L38;
                      } else {
                        L39: {
                          if (0 != var13.field_Vb.field_L) {
                            break L39;
                          } else {
                            L40: {
                              if (var13.field_cc.field_L == 0) {
                                break L40;
                              } else {
                                rf.a(param2, var13.field_gc, true);
                                if (var32 == 0) {
                                  break L38;
                                } else {
                                  break L40;
                                }
                              }
                            }
                            mn.a(0, qo.field_O, var13, param1, (byte) 58, tb.field_fb, 0);
                            if (var32 == 0) {
                              break L38;
                            } else {
                              break L39;
                            }
                          }
                        }
                        hd.a(var13.field_gc, 66, param2);
                        break L38;
                      }
                    }
                  }
                  L41: {
                    var12 = var13;
                    if (!var13.field_G) {
                      break L41;
                    } else {
                      if (!var13.i(0)) {
                        L42: {
                          var25 = null;
                          if ((var13.field_gc ^ -1L) == (oc.field_p ^ -1L)) {
                            L43: {
                              if (var5_int == 0) {
                                break L43;
                              } else {
                                if (!var13.field_ec) {
                                  var25 = ug.field_J;
                                  break L42;
                                } else {
                                  break L43;
                                }
                              }
                            }
                            if (var13.field_ac >= var7) {
                              if (var6 > var13.field_Wb) {
                                var25 = rd.a(ea.field_h, new String[2], (byte) 103);
                                break L42;
                              } else {
                                if ((var8 & (var13.field_Ub ^ -1)) != 0) {
                                  L44: {
                                    var26_int = r.a((byte) -82, (var13.field_Ub ^ -1) & var8);
                                    var25 = ao.field_j;
                                    if (var26_int <= 0) {
                                      break L44;
                                    } else {
                                      if (eb.field_p == null) {
                                        break L44;
                                      } else {
                                        if ((var26_int ^ -1) < (eb.field_p.length ^ -1)) {
                                          break L44;
                                        } else {
                                          if (eb.field_p[var26_int - 1] != null) {
                                            var25_ref = eb.field_p[var26_int - 1][1];
                                            break L44;
                                          } else {
                                            break L44;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                            } else {
                              L45: {
                                var26_int = -var13.field_ac + var7;
                                if ((var26_int ^ -1) == -2) {
                                  var25 = hq.field_w;
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              var25 = rd.a(on.field_F, new String[2], (byte) 103);
                              break L42;
                            }
                          } else {
                            L46: {
                              if (var5_int == 0) {
                                break L46;
                              } else {
                                if (var13.field_ec) {
                                  break L46;
                                } else {
                                  var25 = rd.a(re.field_f, new String[1], (byte) 103);
                                  break L42;
                                }
                              }
                            }
                            if (var13.field_ac >= var7) {
                              if ((var13.field_Wb ^ -1) > (var6 ^ -1)) {
                                var25 = rd.a(cp.field_H, new String[2], (byte) 103);
                                break L42;
                              } else {
                                if (-1 == (var8 & (var13.field_Ub ^ -1) ^ -1)) {
                                  break L42;
                                } else {
                                  L47: {
                                    var26_int = r.a((byte) -82, (var13.field_Ub ^ -1) & var8);
                                    var25 = rd.a(kq.field_m, new String[1], (byte) 103);
                                    if ((var26_int ^ -1) >= -1) {
                                      break L47;
                                    } else {
                                      if (null == eb.field_p) {
                                        break L47;
                                      } else {
                                        if (var26_int > eb.field_p.length) {
                                          break L47;
                                        } else {
                                          if (eb.field_p[-1 + var26_int] != null) {
                                            var25 = rd.a(eb.field_p[var26_int + -1][2], new String[1], (byte) 103);
                                            break L47;
                                          } else {
                                            break L47;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L42;
                                }
                              }
                            } else {
                              L48: {
                                var26_int = var7 - var13.field_ac;
                                if (var26_int != 1) {
                                  break L48;
                                } else {
                                  var25 = rd.a(di.field_b, new String[1], (byte) 103);
                                  break L48;
                                }
                              }
                              var25 = rd.a(qh.field_g, new String[2], (byte) 103);
                              break L42;
                            }
                          }
                        }
                        if (var25 != null) {
                          var25 = "<col=A00000>" + var25;
                          var26 = null;
                          var27 = 0;
                          var28_int = 0;
                          L49: while (true) {
                            L50: {
                              L51: {
                                L52: {
                                  L53: {
                                    if (cq.field_p <= var28_int) {
                                      break L53;
                                    } else {
                                      var29 = o.field_e.field_Tb[var28_int] & 255;
                                      var30 = 0;
                                      if (var32 != 0) {
                                        break L52;
                                      } else {
                                        L54: {
                                          if (vl.field_a == null) {
                                            break L54;
                                          } else {
                                            if (vl.field_a[var28_int] == null) {
                                              break L54;
                                            } else {
                                              if (!vl.field_a[var28_int][var29]) {
                                                break L54;
                                              } else {
                                                if (!var13.field_ec) {
                                                  var30 = 1;
                                                  break L54;
                                                } else {
                                                  break L54;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L55: {
                                          if (null == bl.field_F) {
                                            break L55;
                                          } else {
                                            if (bl.field_F[var28_int] != null) {
                                              L56: {
                                                var31_int = bl.field_F[var28_int][var29];
                                                if (-1 == (var31_int ^ -1)) {
                                                  break L56;
                                                } else {
                                                  if (ea.field_g) {
                                                    break L56;
                                                  } else {
                                                    if (!var13.field_ec) {
                                                      var30 = 1;
                                                      break L56;
                                                    } else {
                                                      break L56;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var13.field_Wb >= var31_int) {
                                                break L55;
                                              } else {
                                                var30 = 1;
                                                break L55;
                                              }
                                            } else {
                                              break L55;
                                            }
                                          }
                                        }
                                        L57: {
                                          if (null == ld.field_v) {
                                            break L57;
                                          } else {
                                            if (null == ld.field_v[var28_int]) {
                                              break L57;
                                            } else {
                                              L58: {
                                                var31_int = ld.field_v[var28_int][var29];
                                                if ((var31_int ^ -1) == -1) {
                                                  break L58;
                                                } else {
                                                  if (ea.field_g) {
                                                    break L58;
                                                  } else {
                                                    if (var13.field_ec) {
                                                      break L58;
                                                    } else {
                                                      var30 = 1;
                                                      break L58;
                                                    }
                                                  }
                                                }
                                              }
                                              if ((var31_int ^ -1) >= (var13.field_ac ^ -1)) {
                                                break L57;
                                              } else {
                                                var30 = 1;
                                                break L57;
                                              }
                                            }
                                          }
                                        }
                                        L59: {
                                          if (null == me.field_e) {
                                            break L59;
                                          } else {
                                            if (me.field_e[var28_int] != null) {
                                              if ((me.field_e[var28_int][var29] & (var13.field_Ub ^ -1)) != 0) {
                                                var30 = 1;
                                                break L59;
                                              } else {
                                                break L59;
                                              }
                                            } else {
                                              break L59;
                                            }
                                          }
                                        }
                                        L60: {
                                          if (var30 == 0) {
                                            break L60;
                                          } else {
                                            L61: {
                                              var31 = "<col=A00000>" + rg.field_b[var28_int] + "</col>";
                                              if (var26 != null) {
                                                break L61;
                                              } else {
                                                var26 = var31;
                                                if (var32 == 0) {
                                                  break L60;
                                                } else {
                                                  break L61;
                                                }
                                              }
                                            }
                                            var26 = var26 + ", " + var31;
                                            var27 = 1;
                                            break L60;
                                          }
                                        }
                                        var28_int++;
                                        if (var32 == 0) {
                                          continue L49;
                                        } else {
                                          break L53;
                                        }
                                      }
                                    }
                                  }
                                  if (param1 != vp.field_u) {
                                    break L52;
                                  } else {
                                    if (hn.b((byte) 7)) {
                                      break L51;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                                L62: {
                                  if (var27 != 0) {
                                    break L62;
                                  } else {
                                    var25 = var25 + "<br>" + rd.a(jo.field_k, new String[1], (byte) 103);
                                    if (var32 == 0) {
                                      break L50;
                                    } else {
                                      break L62;
                                    }
                                  }
                                }
                                var25 = var25 + "<br>" + jm.field_l + var26;
                                if (var32 == 0) {
                                  break L50;
                                } else {
                                  break L51;
                                }
                              }
                              L63: {
                                if (var27 != 0) {
                                  break L63;
                                } else {
                                  var25 = var25 + "<br>" + rd.a(id.field_bc, new String[1], (byte) 103);
                                  if (var32 == 0) {
                                    break L50;
                                  } else {
                                    break L63;
                                  }
                                }
                              }
                              var25 = var25 + "<br>" + kb.field_Rb + var26;
                              break L50;
                            }
                            L64: {
                              if (vp.field_u != param1) {
                                break L64;
                              } else {
                                if (hn.b((byte) 7)) {
                                  break L64;
                                } else {
                                  var28 = o.field_e.field_Fc;
                                  var25 = var25 + "<br>" + rd.a(ba.field_y, new String[1], (byte) 103);
                                  break L64;
                                }
                              }
                            }
                            ep.field_e = var25;
                            break L41;
                          }
                        } else {
                          break L41;
                        }
                      } else {
                        break L41;
                      }
                    }
                  }
                  var13 = (id) (Object) var10.a((byte) 116);
                  if (var32 == 0) {
                    continue L11;
                  } else {
                    break L13;
                  }
                }
              }
            }
            break L12;
          }
          return;
        }
    }

    public static void c(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_l = null;
              field_C = null;
              if (param0 == 67) {
                break L0;
              } else {
                field_n = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_n = null;
        }
    }

    final void a(int param0) {
        ((ka) this).field_y = null;
        ((ka) this).field_F = null;
        ((ka) this).field_k = null;
        if (param0 > -39) {
            return;
        }
        try {
            ((ka) this).field_G = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ka.B(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, ta param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackOut_4_0;
        StringBuilder stackOut_4_1;
        RuntimeException stackOut_5_0;
        StringBuilder stackOut_5_1;
        String stackOut_5_2;
        RuntimeException stackOut_7_0;
        StringBuilder stackOut_7_1;
        String stackOut_7_2;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        vg.field_c = param3;
                        un.field_a = param0;
                        vo.field_A = param2;
                        if (param1 < -25) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_l = null;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) runtimeException;
                        stackOut_4_1 = new StringBuilder().append("ka.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param3 == null) {
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
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    throw qb.a((Throwable) (Object) stackIn_8_0, (String) (Object) (stackIn_8_2 + 41));
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_5_0;
        int stackOut_9_0;
        int stackOut_11_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 >= 60) {
                            statePc = 4;
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
                        field_E = -98;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!r.field_A) {
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
                        stackOut_5_0 = ga.field_i;
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
                        if ((stackIn_6_0 ^ -1) == (pp.field_a ^ -1)) {
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
                        stackOut_9_0 = 1;
                        stackIn_12_0 = stackOut_9_0;
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
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0 != 0;
                }
                case 13: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var1, "ka.E(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int[] param0, int param1, int[] param2, boolean param3, boolean param4, fr param5, boolean param6) {
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
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_21_0 = 0;
        Object stackIn_32_0 = null;
        fr stackIn_36_0 = null;
        Object stackIn_40_0 = null;
        fr stackIn_44_0 = null;
        Object stackIn_48_0 = null;
        fr stackIn_52_0 = null;
        Object stackIn_56_0 = null;
        int stackIn_73_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
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
        int stackOut_9_0;
        int stackOut_9_1;
        int stackOut_20_0;
        Object stackOut_31_0;
        fr stackOut_35_0;
        Object stackOut_39_0;
        fr stackOut_43_0;
        Object stackOut_47_0;
        fr stackOut_51_0;
        Object stackOut_55_0;
        int stackOut_72_0;
        int stackOut_73_0;
        int stackOut_73_1;
        boolean stackOut_78_0;
        int stackOut_78_1;
        RuntimeException stackOut_82_0;
        StringBuilder stackOut_82_1;
        RuntimeException stackOut_83_0;
        StringBuilder stackOut_83_1;
        String stackOut_83_2;
        RuntimeException stackOut_85_0;
        StringBuilder stackOut_85_1;
        String stackOut_85_2;
        RuntimeException stackOut_86_0;
        StringBuilder stackOut_86_1;
        RuntimeException stackOut_87_0;
        StringBuilder stackOut_87_1;
        String stackOut_87_2;
        RuntimeException stackOut_89_0;
        StringBuilder stackOut_89_1;
        String stackOut_89_2;
        RuntimeException stackOut_90_0;
        StringBuilder stackOut_90_1;
        RuntimeException stackOut_91_0;
        StringBuilder stackOut_91_1;
        String stackOut_91_2;
        RuntimeException stackOut_93_0;
        StringBuilder stackOut_93_1;
        String stackOut_93_2;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param0[3] >> 884720578;
                        var22 = param0[4] >> 187366146;
                        var23 = param0[5] >> -793747902;
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
                        if (param1 == -16283) {
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
                        field_l = null;
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
                        var24 = param0[6] >> -1578979166;
                        var25 = param0[7] >> -1410196254;
                        var26 = param0[8] >> 1747005122;
                        var27 = param0[9] >> -1479844382;
                        var28 = param0[10] >> -1123110078;
                        var13 = var25 * param2[4] + (var24 * param2[3] + param2[5] * var26) >> -1851555154;
                        var29 = param0[11] >> 1698870210;
                        var12 = param2[5] * var23 + (param2[3] * var21 + param2[4] * var22) >> 1320455630;
                        var16 = param2[8] * var26 + var24 * param2[6] - -(param2[7] * var25) >> -1560194834;
                        var18 = var23 * param2[11] + param2[10] * var22 + param2[9] * var21 >> 752126606;
                        var15 = param2[7] * var22 + var21 * param2[6] - -(param2[8] * var23) >> -1396707314;
                        var20 = var28 * param2[10] + (param2[9] * var27 + param2[11] * var29) >> 943031342;
                        var19 = param2[11] * var26 + (var25 * param2[10] + param2[9] * var24) >> -1237305522;
                        var14 = param2[3] * var27 - (-(param2[4] * var28) + -(param2[5] * var29)) >> -1818765842;
                        var17 = param2[8] * var29 + (var27 * param2[6] - -(var28 * param2[7])) >> -1906158834;
                        var21 = param2[0] + -param0[0];
                        var22 = param2[1] + -param0[1];
                        var23 = -param0[2] + param2[2];
                        var9 = param0[4] * var22 + var21 * param0[3] - -(var23 * param0[5]) >> -lc.field_k + 16;
                        var10 = var23 * param0[8] + (param0[7] * var22 + var21 * param0[6]) >> -lc.field_k + 16;
                        var11 = param0[11] * var23 + (var21 * param0[9] + var22 * param0[10]) >> 512572176;
                        var21 = mg.field_d;
                        var22 = mg.field_a;
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
                        if ((param5.field_w ^ -1) >= (var23 ^ -1)) {
                            statePc = 30;
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
                        var24 = param5.field_B[var23];
                        var25 = param5.field_Q[var23];
                        var26 = param5.field_P[var23];
                        var27 = var9 + (var24 * var12 - -(var15 * var25) + var26 * var18 >> -lc.field_k + 16);
                        var28 = var10 + (var26 * var19 + var24 * var13 + var25 * var16 >> -lc.field_k + 16);
                        var29 = var11 - -(var24 * var14 + var17 * var25 + var26 * var20 >> -1639293104);
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
                        stackOut_9_0 = var29 ^ -1;
                        stackOut_9_1 = -51;
                        stackIn_79_0 = stackOut_9_0;
                        stackIn_79_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var30 != 0) {
                            statePc = 79;
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
                        if (stackIn_10_0 > stackIn_10_1) {
                            statePc = 22;
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
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        da.field_M[var23] = var21 - -(var27 / var29);
                        ed.field_e[var23] = var28 / var29 + var22;
                        if (var7_int > var29) {
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
                        statePc = 81;
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
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        vo.field_v[var23] = var29;
                        if (var29 <= var8) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = var29;
                        stackOut_20_0 = var30;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        vo.field_v[var23] = -2147483648;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (param3) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        fh.field_f[var23] = var27 >> lc.field_k;
                        ep.field_f[var23] = var28 >> lc.field_k;
                        ml.field_c[var23] = var29;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (null == param5.field_F) {
                            statePc = 69;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = null;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((Object) (Object) stackIn_32_0 == (Object) (Object) param5.field_E) {
                            statePc = 69;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = (fr) param5;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (((fr) (Object) stackIn_36_0).field_O == null) {
                            statePc = 69;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = null;
                        stackIn_40_0 = stackOut_39_0;
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
                        if ((Object) (Object) stackIn_40_0 == (Object) (Object) param5.field_I) {
                            statePc = 69;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = (fr) param5;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (((fr) (Object) stackIn_44_0).field_D == null) {
                            statePc = 69;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = null;
                        stackIn_48_0 = stackOut_47_0;
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
                        if ((Object) (Object) stackIn_48_0 == (Object) (Object) param5.field_u) {
                            statePc = 69;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = (fr) param5;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (((fr) (Object) stackIn_52_0).field_g == null) {
                            statePc = 69;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackOut_55_0 = null;
                        stackIn_56_0 = stackOut_55_0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((Object) (Object) stackIn_56_0 == (Object) (Object) param5.field_s) {
                            statePc = 69;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (param5.field_i == null) {
                            statePc = 69;
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
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var23 = 0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (param5.field_C <= var23) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var24 = param5.field_F[var23];
                        var25 = param5.field_E[var23];
                        var26 = param5.field_O[var23];
                        nj.field_v[var23] = (var15 * var25 + (var12 * var24 + var18 * var26) >> 1451688848) + var9;
                        nd.field_e[var23] = var10 - -(var16 * var25 + (var24 * var13 - -(var26 * var19)) >> -1241826544);
                        jk.field_r[var23] = (var14 * var24 - (-(var25 * var17) - var20 * var26) >> 1401352272) + var11;
                        var24 = param5.field_I[var23];
                        var25 = param5.field_D[var23];
                        var26 = param5.field_u[var23];
                        lc.field_l[var23] = (var24 * var12 - -(var25 * var15) + var18 * var26 >> -1767590128) + var9;
                        bf.field_M[var23] = var10 + (var19 * var26 + (var13 * var24 + var16 * var25) >> -2095003824);
                        vq.field_G[var23] = (var26 * var20 + (var24 * var14 + var25 * var17) >> 364382832) + var11;
                        var24 = param5.field_g[var23];
                        var25 = param5.field_s[var23];
                        var26 = param5.field_i[var23];
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        vd.field_b[var23] = var9 - -(var25 * var15 + (var24 * var12 - -(var26 * var18)) >> -1105940656);
                        cc.field_I[var23] = var10 - -(var19 * var26 + var13 * var24 + var16 * var25 >> -1399812912);
                        il.field_D[var23] = (var14 * var24 - (-(var17 * var25) - var26 * var20) >> 1910887024) + var11;
                        var23++;
                        if (var30 != 0) {
                            statePc = 95;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var30 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 81;
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
                        if (!param4) {
                            statePc = 78;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 70: {
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
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var18 >= param5.field_o) {
                            statePc = 78;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = var18;
                        stackIn_73_0 = stackOut_72_0;
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
                        stackOut_73_0 = stackIn_73_0 ^ -1;
                        stackOut_73_1 = wl.field_R.length ^ -1;
                        stackIn_79_0 = stackOut_73_0;
                        stackIn_79_1 = stackOut_73_1;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        if (var30 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (stackIn_74_0 <= stackIn_74_1) {
                            statePc = 78;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var19 = param5.field_n[var18];
                        var20 = param5.field_H[var18];
                        var21 = param5.field_a[var18];
                        wl.field_R[var18] = var21 * var15 + (var9 * var19 + var20 * var12) >> 433828144;
                        ff.field_f[var18] = var21 * var16 + var13 * var20 + var19 * var10 >> 1969999280;
                        nn.field_h[var18] = var19 * var11 - (-(var20 * var14) + -(var21 * var17)) >> 1876052464;
                        var18++;
                        if (var30 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackOut_78_0 = param6;
                        stackOut_78_1 = var7_int;
                        stackIn_79_0 = stackOut_78_0 ? 1 : 0;
                        stackIn_79_1 = stackOut_78_1;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        bm.a(stackIn_79_0 != 0, stackIn_79_1, var8, false, param5);
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
                        stackOut_82_1 = new StringBuilder().append("ka.C(");
                        stackIn_85_0 = stackOut_82_0;
                        stackIn_85_1 = stackOut_82_1;
                        stackIn_83_0 = stackOut_82_0;
                        stackIn_83_1 = stackOut_82_1;
                        if (param0 == null) {
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
                        stackOut_86_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_86_2).append(44).append(param1).append(44);
                        stackIn_89_0 = stackOut_86_0;
                        stackIn_89_1 = stackOut_86_1;
                        stackIn_87_0 = stackOut_86_0;
                        stackIn_87_1 = stackOut_86_1;
                        if (param2 == null) {
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
                        stackOut_90_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_90_2).append(44).append(param3).append(44).append(param4).append(44);
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
                    throw qb.a((Throwable) (Object) stackIn_94_0, (String) (Object) (stackIn_94_2 + 44 + param6 + 41));
                }
                case 95: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ka() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "<%0> is not on your friend list.";
    }
}
