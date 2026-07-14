/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends gf {
    boolean field_p;
    static int field_h;
    ak field_w;
    static jp field_l;
    int field_v;
    int field_r;
    private int field_i;
    int field_x;
    static mh field_u;
    boolean field_n;
    static int field_j;
    int field_k;
    boolean field_s;
    private int field_m;
    private boolean field_y;
    boolean field_q;
    int field_o;
    private int field_t;

    private final void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        boolean stackIn_2_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        Object stackIn_20_1 = null;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        Object stackIn_24_1 = null;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        boolean[] stackIn_36_0 = null;
        boolean[] stackIn_50_0 = null;
        boolean[] stackIn_54_0 = null;
        int stackIn_60_0 = 0;
        boolean stackOut_1_0;
        int stackOut_5_0;
        int stackOut_7_0;
        int stackOut_13_0;
        int stackOut_14_0;
        int stackOut_14_1;
        int stackOut_16_0;
        int stackOut_16_1;
        int stackOut_18_0;
        int stackOut_19_0;
        Object stackOut_19_1;
        int stackOut_20_0;
        int stackOut_21_0;
        int stackOut_23_0;
        Object stackOut_23_1;
        int stackOut_24_0;
        int stackOut_25_0;
        int stackOut_27_0;
        int stackOut_27_1;
        int stackOut_29_0;
        int stackOut_29_1;
        boolean[] stackOut_35_0;
        boolean[] stackOut_49_0;
        boolean[] stackOut_53_0;
        int stackOut_57_0;
        int stackOut_59_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (pf.field_p) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = la.field_c;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (stackIn_2_0) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
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
                        statePc = 62;
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
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = stackIn_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0 == -1) {
                            statePc = 13;
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
                        this.a((byte) -2, (j) null);
                        statePc = 11;
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
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = var2_int;
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if ((((qj) this).field_o & (((qj) this).field_w.field_i | ((qj) this).field_w.field_g | ((qj) this).field_w.field_a)) != ((qj) this).field_o) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = stackIn_14_0;
                        stackOut_14_1 = 1;
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = stackIn_16_0;
                        stackOut_16_1 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var2_int = stackIn_17_0 & stackIn_17_1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = var2_int;
                        stackIn_29_0 = stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (2 >= ((qj) this).field_w.field_k) {
                            statePc = 29;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = stackIn_19_0;
                        stackOut_19_1 = this;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = stackIn_20_0;
                        stackIn_27_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if ((((qj) this).field_k ^ -1) > -1) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = stackIn_21_0;
                        stackIn_23_0 = stackOut_21_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = stackIn_23_0;
                        stackOut_23_1 = this;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = stackIn_24_0;
                        stackIn_29_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (((qj) this).field_w.field_l[((qj) this).field_k].field_U < 50) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = stackIn_25_0;
                        stackIn_27_0 = stackOut_25_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = stackIn_27_0;
                        stackOut_27_1 = 1;
                        stackIn_30_0 = stackOut_27_0;
                        stackIn_30_1 = stackOut_27_1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = stackIn_29_0;
                        stackOut_29_1 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var2_int = stackIn_30_0 & stackIn_30_1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var2_int == 0) {
                            statePc = 48;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (pe.field_l[fq.field_b]) {
                            statePc = 39;
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
                        stackOut_35_0 = pe.field_l;
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
                        if (!stackIn_36_0[td.field_u]) {
                            statePc = 42;
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
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ((qj) this).field_m = ((qj) this).field_m + 1;
                        ((qj) this).field_m = (((qj) this).field_m + 1) % ((qj) this).field_w.field_k;
                        if (!BrickABrac.field_J) {
                            statePc = 48;
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
                        if (!pe.field_l[ac.field_f]) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ((qj) this).field_m = ((qj) this).field_m - 1;
                        ((qj) this).field_m = (((qj) this).field_w.field_k + (((qj) this).field_m - 1)) % ((qj) this).field_w.field_k;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (pe.field_l[fq.field_b]) {
                            statePc = 57;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = pe.field_l;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (stackIn_50_0[ac.field_f]) {
                            statePc = 57;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = pe.field_l;
                        stackIn_54_0 = stackOut_53_0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (!stackIn_54_0[td.field_u]) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = 1;
                        stackIn_60_0 = stackOut_57_0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackOut_59_0 = 0;
                        stackIn_60_0 = stackOut_59_0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        la.field_c = stackIn_60_0 != 0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var2, "qj.W(" + param0 + 41);
                }
                case 63: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, int param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_3_0;
        int stackOut_5_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (eo.a(mk.field_b, param0, (byte) -75)) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 1;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        var3 = mk.field_b;
                        var4 = param0;
                        var3[var4 >> 775242053] = ud.d(var3[var4 >> 775242053], 1 << ik.a(31, var4));
                        var3 = pl.field_b;
                        var4 = param0;
                        var3[var4 >> 1405197989] = ud.d(var3[var4 >> 1405197989], param1 << ik.a(var4, 31));
                        kp.field_c.a((nm) (Object) new kq(param0), (byte) 3);
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    var3_ref = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var3_ref, "qj.FA(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          lb.a();
          if (!((qj) this).field_q) {
            return;
          } else {
            try {
              L0: {
                if (param0 <= -14) {
                  break L0;
                } else {
                  ((qj) this).a((byte) -47, -81);
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            throw decompiledCaughtException;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          this.g(41);
        }
    }

    final void a(pi param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackOut_10_0;
        StringBuilder stackOut_10_1;
        RuntimeException stackOut_11_0;
        StringBuilder stackOut_11_1;
        String stackOut_11_2;
        RuntimeException stackOut_13_0;
        StringBuilder stackOut_13_1;
        String stackOut_13_2;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var4_int = param0.l(255);
                        ((qj) this).field_w.field_l[var4_int].field_V = param0.j(48);
                        var5 = -101 % ((param2 - 26) / 60);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (param1) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((qj) this).field_w.field_g = ((qj) this).field_w.field_g | 1 << var4_int;
                        if (!BrickABrac.field_J) {
                            statePc = 15;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((qj) this).field_w.field_l[var4_int].field_zb = param0.l(255);
                        ((qj) this).field_w.field_a = ((qj) this).field_w.field_a | 1 << var4_int;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        stackOut_10_0 = (RuntimeException) runtimeException;
                        stackOut_10_1 = new StringBuilder().append("qj.A(");
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (param0 == null) {
                            statePc = 13;
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
                        stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                        stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                        stackOut_11_2 = "{...}";
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_14_2 = stackOut_11_2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 13: {
                    stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                    stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                    stackOut_13_2 = "null";
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw qb.a((Throwable) (Object) stackIn_14_0, (String) (Object) (stackIn_14_2 + 44 + param1 + 44 + param2 + 41));
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, pi param1) {
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
                        ((qj) this).field_w.field_l[((qj) this).field_k].field_E = ((qj) this).field_w.field_l[((qj) this).field_k].field_E + 5;
                        ((qj) this).field_w.field_l[((qj) this).field_k].field_p = param1.i(65280);
                        if (param0 == 33) {
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
                        this.a((byte) 15, (j) null);
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
                        stackOut_4_1 = new StringBuilder().append("qj.M(").append(param0).append(44);
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param1 == null) {
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

    private final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (this.a(param2, 1)) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (!((qj) this).field_s) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4_int = ((qj) this).field_w.field_l[0].field_ob;
                        ep.field_i = ep.field_i - (var4_int - -((qj) this).field_t);
                        var5 = ((qj) this).field_w.field_l[0].field_qb;
                        fp.field_z = fp.field_z + var5;
                        lp.field_wb.a((nm) (Object) new e(param2, param0, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
                        fp.field_z = fp.field_z + (var4_int + ((qj) this).field_t);
                        ep.field_i = ep.field_i - var5;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1 == 67) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((qj) this).field_i = 125;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var4, "qj.S(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        j var6 = null;
        vl var6_ref = null;
        vl var7 = null;
        j var8_ref_j = null;
        int var8 = 0;
        long var9_long = 0L;
        int var9_int = 0;
        j var9 = null;
        vn var9_ref = null;
        j var11 = null;
        j var12 = null;
        vn var13 = null;
        int var14 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_201_1 = 0;
        int stackIn_210_0 = 0;
        int stackIn_210_1 = 0;
        String stackIn_238_0 = null;
        Object stackIn_254_0 = null;
        int stackIn_254_1 = 0;
        int stackIn_254_2 = 0;
        Object stackIn_255_0 = null;
        int stackIn_255_1 = 0;
        int stackIn_255_2 = 0;
        Object stackIn_256_0 = null;
        int stackIn_256_1 = 0;
        int stackIn_256_2 = 0;
        Object stackIn_257_0 = null;
        int stackIn_257_1 = 0;
        int stackIn_257_2 = 0;
        int stackIn_257_3 = 0;
        int stackOut_13_0;
        int stackOut_12_0;
        int stackOut_14_0;
        int stackOut_15_0;
        int stackOut_16_0;
        int stackOut_17_0;
        int stackOut_18_0;
        int stackOut_19_0;
        int stackOut_19_1;
        int stackOut_20_0;
        int stackOut_20_1;
        int stackOut_103_0;
        boolean stackOut_110_0;
        int stackOut_115_0;
        int stackOut_128_0;
        int stackOut_200_0;
        int stackOut_200_1;
        int stackOut_209_0;
        int stackOut_209_1;
        String stackOut_237_0;
        String stackOut_236_0;
        Object stackOut_253_0;
        int stackOut_253_1;
        int stackOut_253_2;
        Object stackOut_256_0;
        int stackOut_256_1;
        int stackOut_256_2;
        int stackOut_256_3;
        Object stackOut_254_0;
        int stackOut_254_1;
        int stackOut_254_2;
        Object stackOut_255_0;
        int stackOut_255_1;
        int stackOut_255_2;
        int stackOut_255_3;
        var14 = BrickABrac.field_J ? 1 : 0;
        if (((qj) this).field_q) {
          L0: {
            if (null == oa.field_Sb) {
              break L0;
            } else {
              oa.field_Sb.e(1);
              if (!oa.field_Sb.field_q) {
                oa.field_Sb.d(59);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if ((km.field_i ^ -1) >= -1) {
              break L1;
            } else {
              km.field_i = km.field_i - 1;
              if ((km.field_i - 1 ^ -1) != -1) {
                break L1;
              } else {
                fq.field_c = null;
                ih.field_k = null;
                break L1;
              }
            }
          }
          L2: {
            if (0 == (((qj) this).field_w.field_l[((qj) this).field_m].field_M ^ -1)) {
              stackOut_13_0 = 0;
              stackIn_14_0 = stackOut_13_0;
              break L2;
            } else {
              stackOut_12_0 = 1;
              stackIn_14_0 = stackOut_12_0;
              break L2;
            }
          }
          L3: {
            L4: {
              var4_int = stackIn_14_0;
              stackOut_14_0 = var4_int;
              stackIn_20_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (((qj) this).field_p) {
                break L4;
              } else {
                stackOut_15_0 = stackIn_15_0;
                stackIn_20_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (-3 != (((qj) this).field_w.field_k ^ -1)) {
                  break L4;
                } else {
                  stackOut_16_0 = stackIn_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  stackOut_17_0 = stackIn_17_0;
                  stackIn_20_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (-1 == ((qj) this).field_w.field_l[-((qj) this).field_m + 1].field_M) {
                    break L4;
                  } else {
                    stackOut_18_0 = stackIn_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    stackOut_19_0 = stackIn_19_0;
                    stackOut_19_1 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L3;
                  }
                }
              }
            }
            stackOut_20_0 = stackIn_20_0;
            stackOut_20_1 = 0;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            break L3;
          }
          L5: {
            L6: {
              L7: {
                var4_int = stackIn_21_0 | stackIn_21_1;
                if (1 != ((qj) this).field_w.field_k) {
                  break L7;
                } else {
                  if (((qj) this).field_w.field_l[0].field_Z == 5) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (!((qj) this).field_w.field_c) {
                  break L8;
                } else {
                  ji.a(25459, true, oj.field_q, 1, 1, true);
                  if (var14 == 0) {
                    break L5;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (var4_int != 0) {
                  break L9;
                } else {
                  L10: {
                    if (oa.field_Sb == null) {
                      break L10;
                    } else {
                      if (!oa.field_Sb.field_q) {
                        break L10;
                      } else {
                        wj.a(1, true, oa.field_Sb.c(-109), false, 1, oa.field_Sb.field_n, true);
                        if (var14 == 0) {
                          break L5;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  ji.a(25459, true, cd.field_g, 1, 1, true);
                  if (var14 == 0) {
                    break L5;
                  } else {
                    break L9;
                  }
                }
              }
              ji.a(25459, true, uk.field_t, 1, 1, true);
              if (var14 == 0) {
                break L5;
              } else {
                break L6;
              }
            }
            ji.a(25459, true, c.field_j, 1, 1, true);
            break L5;
          }
          L11: {
            if (!((qj) this).field_w.field_c) {
              break L11;
            } else {
              if (-2 <= (((qj) this).field_w.field_k ^ -1)) {
                break L11;
              } else {
                be.field_j = be.field_j + 1;
                if (be.field_j + 1 != 300) {
                  break L11;
                } else {
                  L12: {
                    if (!m.field_a) {
                      break L12;
                    } else {
                      ml.field_f = ml.field_f + 1;
                      System.out.println("Concluded " + (ml.field_f + 1) + " games (" + cf.field_a + " errors)");
                      if ((1 << ((qj) this).field_k & ((qj) this).field_w.field_j) != 0) {
                        break L12;
                      } else {
                        ((qj) this).f(87);
                        break L12;
                      }
                    }
                  }
                  L13: {
                    po.a((byte) -97);
                    if (!((qj) this).field_p) {
                      break L13;
                    } else {
                      L14: {
                        if (op.field_a) {
                          break L14;
                        } else {
                          da.f((byte) 122);
                          if (var14 == 0) {
                            break L11;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L15: {
                        if (null == hd.field_d) {
                          break L15;
                        } else {
                          if (1 == (hd.field_d.field_a ^ -1)) {
                            break L11;
                          } else {
                            break L15;
                          }
                        }
                      }
                      ng.a(false, 101, 19);
                      if (var14 == 0) {
                        break L11;
                      } else {
                        break L13;
                      }
                    }
                  }
                  ng.a(false, 62, 20);
                  cc.field_G = true;
                  break L11;
                }
              }
            }
          }
          L16: {
            if (param2 < -52) {
              break L16;
            } else {
              ((qj) this).field_w = null;
              break L16;
            }
          }
          L17: {
            var5 = oo.field_w.a(-37880252, 10);
            var6_int = oo.field_w.a(-37880252, 3);
            if ((var5 ^ -1) == -1) {
              od.field_c = od.field_c + 1;
              fp.field_z = fp.field_z + og.field_Wb;
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            if (-2 == (var5 ^ -1)) {
              od.field_c = od.field_c - 2;
              fp.field_z = fp.field_z - 2 * og.field_Wb;
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            if ((var5 ^ -1) != -3) {
              break L19;
            } else {
              fp.field_z = fp.field_z + 2 * od.field_c;
              og.field_Wb = og.field_Wb + 2;
              break L19;
            }
          }
          L20: {
            if (var5 != 3) {
              break L20;
            } else {
              og.field_Wb = og.field_Wb - 1;
              fp.field_z = fp.field_z - od.field_c;
              break L20;
            }
          }
          L21: {
            if (-5 != (var5 ^ -1)) {
              break L21;
            } else {
              od.field_c = od.field_c + 1;
              ep.field_i = ep.field_i + og.field_Wb;
              break L21;
            }
          }
          L22: {
            if ((var5 ^ -1) != -6) {
              break L22;
            } else {
              ep.field_i = ep.field_i - og.field_Wb * 2;
              od.field_c = od.field_c - 2;
              break L22;
            }
          }
          L23: {
            if (6 != var5) {
              break L23;
            } else {
              ep.field_i = ep.field_i + og.field_Wb;
              od.field_c = od.field_c + 1;
              break L23;
            }
          }
          L24: {
            if (var5 == 7) {
              ep.field_i = ep.field_i - od.field_c * 2;
              og.field_Wb = og.field_Wb - 2;
              break L24;
            } else {
              break L24;
            }
          }
          L25: {
            if ((var5 ^ -1) != -9) {
              break L25;
            } else {
              fp.field_z = fp.field_z + var6_int;
              fp.field_z = fp.field_z - var6_int;
              break L25;
            }
          }
          L26: {
            if (-10 != (var5 ^ -1)) {
              break L26;
            } else {
              ep.field_i = ep.field_i + var6_int;
              fp.field_z = fp.field_z - var6_int;
              break L26;
            }
          }
          L27: {
            var5 = oo.field_w.a(-37880252, 5);
            if (-1 != (var5 ^ -1)) {
              break L27;
            } else {
              hg.field_e = hg.field_e ^ tm.field_g + qm.field_a << -2077966224;
              break L27;
            }
          }
          L28: {
            if (-2 != (var5 ^ -1)) {
              break L28;
            } else {
              ek.field_kb = ek.field_kb - tm.field_g;
              qm.field_a = qm.field_a - 1;
              break L28;
            }
          }
          L29: {
            if (var5 != 2) {
              break L29;
            } else {
              ek.field_kb = ek.field_kb + tm.field_g;
              qm.field_a = qm.field_a + 1;
              break L29;
            }
          }
          L30: {
            if (-4 == (var5 ^ -1)) {
              ek.field_kb = ek.field_kb - qm.field_a;
              tm.field_g = tm.field_g - 1;
              break L30;
            } else {
              break L30;
            }
          }
          L31: {
            if (-5 != (var5 ^ -1)) {
              break L31;
            } else {
              ek.field_kb = ek.field_kb + qm.field_a;
              tm.field_g = tm.field_g + 1;
              break L31;
            }
          }
          L32: {
            L33: {
              if (((qj) this).field_p) {
                var5 = 0;
                L34: while (true) {
                  if ((((qj) this).field_w.field_k ^ -1) >= (var5 ^ -1)) {
                    break L33;
                  } else {
                    stackOut_103_0 = ((qj) this).field_o & 1 << var5;
                    stackIn_111_0 = stackOut_103_0;
                    stackIn_104_0 = stackOut_103_0;
                    if (var14 != 0) {
                      break L32;
                    } else {
                      L35: {
                        L36: {
                          if (stackIn_104_0 != 0) {
                            break L36;
                          } else {
                            if (var14 == 0) {
                              break L35;
                            } else {
                              break L36;
                            }
                          }
                        }
                        var6 = ((qj) this).field_w.field_l[var5];
                        var6.field_vb[var6.field_F % 5] = 0;
                        break L35;
                      }
                      var5++;
                      if (var14 == 0) {
                        continue L34;
                      } else {
                        break L33;
                      }
                    }
                  }
                }
              } else {
                break L33;
              }
            }
            stackOut_110_0 = param1;
            stackIn_111_0 = stackOut_110_0 ? 1 : 0;
            break L32;
          }
          L37: {
            if (stackIn_111_0 == 0) {
              break L37;
            } else {
              this.a(-1);
              break L37;
            }
          }
          var5 = 0;
          L38: while (true) {
            L39: {
              L40: {
                if (var5 >= ((qj) this).field_w.field_k) {
                  break L40;
                } else {
                  stackOut_115_0 = ((qj) this).field_o & 1 << var5;
                  stackIn_129_0 = stackOut_115_0;
                  stackIn_116_0 = stackOut_115_0;
                  if (var14 != 0) {
                    break L39;
                  } else {
                    L41: {
                      L42: {
                        if (stackIn_116_0 != 0) {
                          break L42;
                        } else {
                          if (var14 == 0) {
                            break L41;
                          } else {
                            break L42;
                          }
                        }
                      }
                      L43: {
                        L44: {
                          var6 = ((qj) this).field_w.field_l[var5];
                          if (param1) {
                            break L44;
                          } else {
                            var6.field_db = 0;
                            if (var14 == 0) {
                              break L43;
                            } else {
                              break L44;
                            }
                          }
                        }
                        this.a((byte) 73, var6);
                        break L43;
                      }
                      if (((qj) this).field_p) {
                        var6.field_vb[var6.field_F % 5] = var6.field_db;
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    var5++;
                    if (var14 == 0) {
                      continue L38;
                    } else {
                      break L40;
                    }
                  }
                }
              }
              stackOut_128_0 = 0;
              stackIn_129_0 = stackOut_128_0;
              break L39;
            }
            L45: {
              L46: {
                var5 = stackIn_129_0;
                var6_ref = new vl();
                var7 = new vl();
                if (!r.field_A) {
                  break L46;
                } else {
                  if (km.field_i != 0) {
                    break L45;
                  } else {
                    L47: {
                      od.a((byte) 32);
                      var8_ref_j = ((qj) this).field_w.field_l[0];
                      if (2 != var8_ref_j.field_Z) {
                        break L47;
                      } else {
                        jc.a(var8_ref_j.field_db, 0, (byte) -85);
                        break L47;
                      }
                    }
                    L48: {
                      L49: {
                        if (-1 == (var8_ref_j.field_Z ^ -1)) {
                          break L49;
                        } else {
                          if (ka.a((byte) 62)) {
                            break L48;
                          } else {
                            break L49;
                          }
                        }
                      }
                      var5 = this.a(var7, true, var6_ref) ? 1 : 0;
                      break L48;
                    }
                    if (var14 == 0) {
                      break L45;
                    } else {
                      break L46;
                    }
                  }
                }
              }
              var5 = this.a(var7, true, var6_ref) ? 1 : 0;
              break L45;
            }
            L50: {
              bm.a(96, 96, false, -30791, var6_ref);
              bm.a(48, 48, true, -30791, var7);
              if (((qj) this).field_w.field_k != 1) {
                break L50;
              } else {
                L51: {
                  var8_ref_j = ((qj) this).field_w.field_l[0];
                  if (var8_ref_j.field_qb > ((qj) this).field_i) {
                    L52: {
                      L53: {
                        L54: {
                          var9_long = ue.a(false);
                          this.a(gq.field_Yb, ((qj) this).field_i, var9_long + -fl.field_l, true, 1000);
                          fl.field_l = var9_long;
                          ((qj) this).field_i = var8_ref_j.field_qb;
                          this.a(((qj) this).field_w.field_b.field_b, var8_ref_j.field_ob, (byte) -125, var8_ref_j.field_qb);
                          if ((((qj) this).field_i ^ -1) != -2) {
                            break L54;
                          } else {
                            if (0 == ((qj) this).field_w.field_b.field_b.field_h) {
                              var11 = var8_ref_j;
                              var8_ref_j.field_Q = 0;
                              var11.field_m = 0;
                              var8_ref_j.field_u = 0;
                              var12 = var8_ref_j;
                              var12.field_N = 0;
                              var13 = (vn) (Object) var8_ref_j.field_gb.d(-66);
                              L55: while (true) {
                                if (null == var13) {
                                  break L54;
                                } else {
                                  var13.field_I = 0;
                                  var13 = (vn) (Object) var8_ref_j.field_gb.a((byte) 116);
                                  if (var14 != 0) {
                                    break L53;
                                  } else {
                                    if (var14 == 0) {
                                      continue L55;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L54;
                            }
                          }
                        }
                        if (((qj) this).field_i > 1) {
                          break L53;
                        } else {
                          if (-2 != (((qj) this).field_w.field_b.field_b.field_h ^ -1)) {
                            break L52;
                          } else {
                            break L53;
                          }
                        }
                      }
                      if (lc.a(0, -119)) {
                        if (!(oa.field_Sb instanceof dp)) {
                          break L52;
                        } else {
                          this.a(false, 239, 16);
                          break L52;
                        }
                      } else {
                        break L52;
                      }
                    }
                    if ((((qj) this).field_i ^ -1) <= (((qj) this).field_w.field_b.a(95) ^ -1)) {
                      break L51;
                    } else {
                      w.field_r = lg.a(2, ((qj) this).field_w.field_b.a(((qj) this).field_i, (byte) -122), -1);
                      break L51;
                    }
                  } else {
                    break L51;
                  }
                }
                L56: {
                  if (var8_ref_j.field_tb) {
                    var9_int = (33423360 - 2 * (var8_ref_j.field_yb.field_j - -(var8_ref_j.field_yb.field_u / 2) << 191197160)) / 510;
                    nk.field_c.g();
                    oa.field_Sb.a(true, var9_int, 0, 0, 0);
                    kc.field_q.a((byte) 78);
                    ih.field_k = oa.field_Sb.c((byte) -116);
                    fq.field_c = oa.field_Sb.b(-102);
                    oa.field_Sb = rd.a(var8_ref_j.field_ab.field_p, (byte) 19);
                    km.field_i = 32;
                    var8_ref_j.field_tb = false;
                    pe.field_n = var8_ref_j.field_ab.field_p;
                    break L56;
                  } else {
                    break L56;
                  }
                }
                L57: {
                  L58: {
                    if (-1 > (var8_ref_j.field_qb ^ -1)) {
                      break L58;
                    } else {
                      if (((qj) this).field_w.field_b.field_b.field_h != 0) {
                        break L58;
                      } else {
                        break L57;
                      }
                    }
                  }
                  L59: {
                    if (dp.field_r[0] <= var8_ref_j.field_m) {
                      this.b(0, -64, 255);
                      break L59;
                    } else {
                      break L59;
                    }
                  }
                  L60: {
                    if ((var8_ref_j.field_m ^ -1) > (dp.field_r[1] ^ -1)) {
                      break L60;
                    } else {
                      this.b(1, 119, 254);
                      break L60;
                    }
                  }
                  L61: {
                    if ((var8_ref_j.field_m ^ -1) > (dp.field_r[2] ^ -1)) {
                      break L61;
                    } else {
                      this.b(2, -42, 253);
                      break L61;
                    }
                  }
                  L62: {
                    if (dp.field_r[39] <= var8_ref_j.field_m) {
                      this.b(39, 109, 216);
                      break L62;
                    } else {
                      break L62;
                    }
                  }
                  L63: {
                    if (var8_ref_j.field_qb + -((qj) this).field_t < dp.field_r[3]) {
                      break L63;
                    } else {
                      this.a(false, 252, 3);
                      break L63;
                    }
                  }
                  L64: {
                    if (var8_ref_j.field_qb - ((qj) this).field_t < dp.field_r[4]) {
                      break L64;
                    } else {
                      this.a(false, 251, 4);
                      break L64;
                    }
                  }
                  L65: {
                    if ((var8_ref_j.field_qb ^ -1) <= (dp.field_r[5] - 1 ^ -1)) {
                      this.a(250, 67, 5);
                      break L65;
                    } else {
                      break L65;
                    }
                  }
                  L66: {
                    if (-1 + dp.field_r[6] > var8_ref_j.field_qb) {
                      break L66;
                    } else {
                      if ((var8_ref_j.field_Z ^ -1) != -6) {
                        break L66;
                      } else {
                        this.a(249, 67, 6);
                        break L66;
                      }
                    }
                  }
                  L67: {
                    if (dp.field_r[7] <= var8_ref_j.field_ob) {
                      this.a((byte) 68, 7, 248);
                      break L67;
                    } else {
                      break L67;
                    }
                  }
                  L68: {
                    if (dp.field_r[8] <= var8_ref_j.field_ob) {
                      this.a((byte) 97, 8, 247);
                      break L68;
                    } else {
                      break L68;
                    }
                  }
                  L69: {
                    if ((var8_ref_j.field_ob ^ -1) <= (dp.field_r[40] ^ -1)) {
                      this.a((byte) 39, 40, 215);
                      break L69;
                    } else {
                      break L69;
                    }
                  }
                  var9_ref = (vn) (Object) var8_ref_j.field_gb.d(-119);
                  L70: while (true) {
                    L71: {
                      L72: {
                        if (var9_ref == null) {
                          break L72;
                        } else {
                          stackOut_200_0 = dp.field_r[9] ^ -1;
                          stackOut_200_1 = var9_ref.field_I ^ -1;
                          stackIn_210_0 = stackOut_200_0;
                          stackIn_210_1 = stackOut_200_1;
                          stackIn_201_0 = stackOut_200_0;
                          stackIn_201_1 = stackOut_200_1;
                          if (var14 != 0) {
                            break L71;
                          } else {
                            L73: {
                              if (stackIn_201_0 >= stackIn_201_1) {
                                this.b(9, 106, 246);
                                break L73;
                              } else {
                                break L73;
                              }
                            }
                            L74: {
                              if (var9_ref.field_I < dp.field_r[10]) {
                                break L74;
                              } else {
                                this.b(10, -52, 245);
                                if (var14 == 0) {
                                  break L72;
                                } else {
                                  break L74;
                                }
                              }
                            }
                            var9_ref = (vn) (Object) var8_ref_j.field_gb.a((byte) 116);
                            if (var14 == 0) {
                              continue L70;
                            } else {
                              break L72;
                            }
                          }
                        }
                      }
                      stackOut_209_0 = dp.field_r[22];
                      stackOut_209_1 = var8_ref_j.field_l;
                      stackIn_210_0 = stackOut_209_0;
                      stackIn_210_1 = stackOut_209_1;
                      break L71;
                    }
                    L75: {
                      if (stackIn_210_0 > stackIn_210_1) {
                        break L75;
                      } else {
                        this.b(22, -65, 233);
                        break L75;
                      }
                    }
                    L76: {
                      if ((var8_ref_j.field_hb ^ -1) > (dp.field_r[29] ^ -1)) {
                        break L76;
                      } else {
                        this.b(29, 114, 226);
                        break L76;
                      }
                    }
                    L77: {
                      if (dp.field_r[30] > var8_ref_j.field_u) {
                        break L77;
                      } else {
                        this.b(30, -118, 225);
                        break L77;
                      }
                    }
                    L78: {
                      if (dp.field_r[31] > var8_ref_j.field_u) {
                        break L78;
                      } else {
                        this.b(31, -33, 224);
                        break L78;
                      }
                    }
                    L79: {
                      if (var8_ref_j.field_N < dp.field_r[32]) {
                        break L79;
                      } else {
                        this.b(32, -94, 223);
                        break L79;
                      }
                    }
                    L80: {
                      if (var8_ref_j.field_N < dp.field_r[33]) {
                        break L80;
                      } else {
                        this.b(33, 112, 222);
                        break L80;
                      }
                    }
                    L81: {
                      if (var8_ref_j.field_t >= dp.field_r[19]) {
                        this.b(19, 85, 236);
                        break L81;
                      } else {
                        break L81;
                      }
                    }
                    L82: {
                      if ((var8_ref_j.field_t ^ -1) > (dp.field_r[20] ^ -1)) {
                        break L82;
                      } else {
                        this.b(20, -128, 235);
                        break L82;
                      }
                    }
                    if ((var8_ref_j.field_t ^ -1) <= (dp.field_r[21] ^ -1)) {
                      this.b(21, 109, 234);
                      break L57;
                    } else {
                      break L57;
                    }
                  }
                }
                L83: {
                  if (dj.field_b != var8_ref_j.field_ob) {
                    dj.field_b = var8_ref_j.field_ob;
                    vd.field_d = Integer.toString(dj.field_b);
                    break L83;
                  } else {
                    break L83;
                  }
                }
                if (pg.field_m != 1 + pp.a(var8_ref_j, (byte) 59, ((qj) this).field_w)) {
                  L84: {
                    pg.field_m = pp.a(var8_ref_j, (byte) -100, ((qj) this).field_w) + 1;
                    if ((pg.field_m ^ -1) > -11) {
                      stackOut_237_0 = "0" + pg.field_m;
                      stackIn_238_0 = stackOut_237_0;
                      break L84;
                    } else {
                      stackOut_236_0 = Integer.toString(pg.field_m);
                      stackIn_238_0 = stackOut_236_0;
                      break L84;
                    }
                  }
                  lq.field_e = (String) (Object) stackIn_238_0;
                  break L50;
                } else {
                  break L50;
                }
              }
            }
            L85: {
              L86: {
                if (!((qj) this).field_p) {
                  break L86;
                } else {
                  if ((((qj) this).field_o ^ -1) != -1) {
                    var8 = 0;
                    L87: while (true) {
                      if ((var8 ^ -1) <= (((qj) this).field_w.field_k ^ -1)) {
                        break L86;
                      } else {
                        if (var14 != 0) {
                          break L85;
                        } else {
                          L88: {
                            if ((((qj) this).field_o & 1 << var8 ^ -1) == -1) {
                              break L88;
                            } else {
                              if (((((qj) this).field_w.field_i | (((qj) this).field_w.field_a | ((qj) this).field_w.field_g)) & 1 << var8 ^ -1) != -1) {
                                break L88;
                              } else {
                                var9 = ((qj) this).field_w.field_l[var8];
                                if (var5 == 0) {
                                  break L88;
                                } else {
                                  if (0 != var9.field_F % 5) {
                                    break L88;
                                  } else {
                                    L89: {
                                      stackOut_253_0 = this;
                                      stackOut_253_1 = 120;
                                      stackOut_253_2 = var8;
                                      stackIn_256_0 = stackOut_253_0;
                                      stackIn_256_1 = stackOut_253_1;
                                      stackIn_256_2 = stackOut_253_2;
                                      stackIn_254_0 = stackOut_253_0;
                                      stackIn_254_1 = stackOut_253_1;
                                      stackIn_254_2 = stackOut_253_2;
                                      if (var9.field_F % 5 != 0) {
                                        stackOut_256_0 = this;
                                        stackOut_256_1 = stackIn_256_1;
                                        stackOut_256_2 = stackIn_256_2;
                                        stackOut_256_3 = 0;
                                        stackIn_257_0 = stackOut_256_0;
                                        stackIn_257_1 = stackOut_256_1;
                                        stackIn_257_2 = stackOut_256_2;
                                        stackIn_257_3 = stackOut_256_3;
                                        break L89;
                                      } else {
                                        stackOut_254_0 = this;
                                        stackOut_254_1 = stackIn_254_1;
                                        stackOut_254_2 = stackIn_254_2;
                                        stackIn_255_0 = stackOut_254_0;
                                        stackIn_255_1 = stackOut_254_1;
                                        stackIn_255_2 = stackOut_254_2;
                                        stackOut_255_0 = this;
                                        stackOut_255_1 = stackIn_255_1;
                                        stackOut_255_2 = stackIn_255_2;
                                        stackOut_255_3 = 1;
                                        stackIn_257_0 = stackOut_255_0;
                                        stackIn_257_1 = stackOut_255_1;
                                        stackIn_257_2 = stackOut_255_2;
                                        stackIn_257_3 = stackOut_255_3;
                                        break L89;
                                      }
                                    }
                                    this.a((byte) stackIn_257_1, stackIn_257_2, stackIn_257_3 != 0);
                                    break L88;
                                  }
                                }
                              }
                            }
                          }
                          var8++;
                          if (var14 == 0) {
                            continue L87;
                          } else {
                            break L86;
                          }
                        }
                      }
                    }
                  } else {
                    break L86;
                  }
                }
              }
              break L85;
            }
            return;
          }
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackOut_5_0;
        int stackOut_7_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 >= 93) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((qj) this).a(false, (byte) -87);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((qj) this).field_k != -2) {
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
                        statePc = 9;
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
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var2, "qj.D(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((qj) this).field_q = true;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!((qj) this).field_s) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (null != fj.field_Ub) {
                            statePc = 18;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (0 < ((qj) this).field_w.field_l[0].field_ob) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        fj.field_Ub = new sp(((qj) this).field_w.field_b.field_b.field_d, 65535 ^ ((qj) this).field_w.field_b.field_b.field_d, fp.field_z, ep.field_i, od.field_c, og.field_Wb, new int[2]);
                        if (og.h(-26090)) {
                            statePc = 18;
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
                        bd.a(3, (byte) 25, fj.field_Ub);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 18;
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
                case 17: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var2, "qj.R(" + param0 + 41);
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_13_0 = 0;
        Object stackIn_16_0 = null;
        int stackOut_10_0;
        int stackOut_12_0;
        Object stackOut_15_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!((qj) this).field_p) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (1 == ((qj) this).field_w.field_k) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 14;
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
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((qj) this).field_s) {
                            statePc = 14;
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
                        this.a(pp.a(((qj) this).field_w.field_l[0], (byte) 115, ((qj) this).field_w), false);
                        this.e(0);
                        this.a(gq.field_Yb, ((qj) this).field_r, -fl.field_l + ue.a(false), false, 1000);
                        jj.field_d = jj.field_d | ja.a(((qj) this).field_t, ((qj) this).field_w.field_b, -1 + ((qj) this).field_r, true);
                        if (-1 != (hh.field_b[0] ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 1;
                        stackIn_13_0 = stackOut_10_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        be.field_a = stackIn_13_0 != 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((qj) this).field_w.field_k != 1) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = this;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (((qj) this).field_w.field_l[0].field_Z == 8) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((qj) this).a(param1, (byte) 69);
                        if (!BrickABrac.field_J) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ng.a(param1, 107, 18);
                        ji.a(25459, true, cd.field_g, 1, 1, true);
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
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (param0 == 40) {
                            statePc = 27;
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
                    return;
                }
                case 27: {
                    try {
                        pe.field_n = si.field_k.field_m;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var3, "qj.J(" + param0 + 44 + param1 + 41);
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        sp stackIn_33_0 = null;
        int stackOut_2_0;
        sp stackOut_32_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        rj.a((byte) 80, to.field_k);
                        rj.a((byte) 80, me.field_d);
                        if (-2 > (((qj) this).field_w.field_k ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 9;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 == ((qj) this).field_w.field_l[0].field_Z) {
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
                        ji.a(25459, true, cd.field_g, 1, 1, true);
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
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!((qj) this).field_p) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        if (param1 == 69) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        if (og.h(-26090)) {
                            statePc = 29;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!ib.a(pl.field_b, -1)) {
                            statePc = 20;
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
                case 17: {
                    try {
                        ng.a(param0, 60, 9);
                        if (var4 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (fj.field_Ub != null) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ng.a(param0, 100, 0);
                        if (var4 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ng.a(param0, 68, 5);
                        if (var4 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (ib.a(pl.field_b, -1)) {
                            statePc = 39;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = fj.field_Ub;
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
                        if (stackIn_33_0 != null) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ng.a(param0, 121, 0);
                        if (var4 == 0) {
                            statePc = 44;
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
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ng.a(param0, 68, 10);
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
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var3, "qj.F(" + param0 + 44 + param1 + 41);
                }
                case 44: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, pi param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        p var5 = null;
        int var6_int = 0;
        j var6 = null;
        int var7 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackOut_22_0;
        StringBuilder stackOut_22_1;
        RuntimeException stackOut_23_0;
        StringBuilder stackOut_23_1;
        String stackOut_23_2;
        RuntimeException stackOut_25_0;
        StringBuilder stackOut_25_1;
        String stackOut_25_2;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param1.l(255);
                        if (((qj) this).field_w.field_k > var4_int) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        rk.a("K1: (" + var4_int + "/" + param1.field_l + ") " + eq.c((byte) -110), (Throwable) null, param0 + 125);
                        hn.a((byte) 89);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var5 = new p();
                        var5.field_k = param1.i(65280);
                        param1.n(-79);
                        var6_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var6_int >= 5) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5.field_n[var6_int] = param1.c(3, (byte) 117);
                        var6_int++;
                        if (var7 != 0) {
                            statePc = 15;
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
                        if (var7 == 0) {
                            statePc = 5;
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
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0 == -15) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.b(-25, 35, 50);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        param1.f((byte) 100);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!param2) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5.field_m = param1.e(255);
                        var5.field_l = true;
                        statePc = 17;
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
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var6 = ((qj) this).field_w.field_l[var4_int];
                        var6.field_E = var6.field_E + 5;
                        var6.field_q = var6.field_q + 5;
                        var6.field_eb.a((nm) (Object) var5, (byte) 3);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        stackOut_22_0 = (RuntimeException) var4;
                        stackOut_22_1 = new StringBuilder().append("qj.B(").append(param0).append(44);
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (param1 == null) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                        stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                        stackOut_23_2 = "{...}";
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        stackIn_26_2 = stackOut_23_2;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 25: {
                    stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                    stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                    stackOut_25_2 = "null";
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    throw qb.a((Throwable) (Object) stackIn_26_0, (String) (Object) (stackIn_26_2 + 44 + param2 + 41));
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, pi param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackOut_7_0;
        StringBuilder stackOut_7_1;
        RuntimeException stackOut_8_0;
        StringBuilder stackOut_8_1;
        String stackOut_8_2;
        RuntimeException stackOut_10_0;
        StringBuilder stackOut_10_1;
        String stackOut_10_2;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3_int = param1.l(param0 ^ 18615);
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
                        ((qj) this).field_w.field_l[var3_int].field_V = param1.j(48);
                        ((qj) this).field_w.field_i = ((qj) this).field_w.field_i | 1 << var3_int;
                        if (param0 == 18504) {
                            statePc = 12;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_u = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) runtimeException;
                        stackOut_7_1 = new StringBuilder().append("qj.CA(").append(param0).append(44);
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param1 == null) {
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
                    throw qb.a((Throwable) (Object) stackIn_11_0, (String) (Object) (stackIn_11_2 + 41));
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        j var5 = null;
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        try {
            int var4_int = 17 % ((29 - param0) / 57);
            // ifne L33
            k.field_h.e(-13413, 68);
            k.field_h.p(62);
            var5 = ((qj) this).field_w.field_l[param1];
            var6 = 0;
            do {
                // if_icmpge L101
                k.field_h.a(3, -17566, var5.field_vb[var6]);
                var6++;
                // ifne L109
            } while (var7 == 0);
            k.field_h.q(-105);
            // ifne L117
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "qj.EA(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final boolean a(char param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        j var4_ref = null;
        int var5 = 0;
        vn var5_ref_vn = null;
        int var6 = 0;
        int stackIn_28_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_95_0 = 0;
        Object stackIn_111_0 = null;
        int stackIn_124_0 = 0;
        boolean stackIn_127_0 = false;
        int stackIn_131_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_221_0 = 0;
        int stackIn_222_0 = 0;
        int stackIn_222_1 = 0;
        int stackIn_230_0 = 0;
        int stackIn_235_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_252_0 = 0;
        int stackIn_255_0 = 0;
        int stackIn_260_0 = 0;
        int stackIn_263_0 = 0;
        int stackIn_266_0 = 0;
        int stackIn_269_0 = 0;
        int stackIn_272_0 = 0;
        int stackIn_277_0 = 0;
        int stackIn_280_0 = 0;
        int stackIn_285_0 = 0;
        int stackOut_27_0;
        int stackOut_80_0;
        int stackOut_84_0;
        int stackOut_88_0;
        int stackOut_94_0;
        Object stackOut_110_0;
        int stackOut_123_0;
        boolean stackOut_126_0;
        int stackOut_130_0;
        int stackOut_140_0;
        int stackOut_150_0;
        int stackOut_155_0;
        int stackOut_158_0;
        int stackOut_163_0;
        int stackOut_168_0;
        int stackOut_173_0;
        int stackOut_182_0;
        int stackOut_188_0;
        int stackOut_195_0;
        int stackOut_201_0;
        int stackOut_213_0;
        int stackOut_220_0;
        int stackOut_221_0;
        int stackOut_221_1;
        int stackOut_229_0;
        int stackOut_234_0;
        int stackOut_248_0;
        int stackOut_251_0;
        int stackOut_254_0;
        int stackOut_259_0;
        int stackOut_262_0;
        int stackOut_265_0;
        int stackOut_268_0;
        int stackOut_271_0;
        int stackOut_276_0;
        int stackOut_279_0;
        int stackOut_282_0;
        int stackOut_284_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = oo.field_w.a(-37880252, 10);
                        var5 = oo.field_w.a(-37880252, 5);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var4_int ^ -1) != -1) {
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
                        fp.field_z = fp.field_z + og.field_Wb;
                        od.field_c = od.field_c + 1;
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
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (-2 == (var4_int ^ -1)) {
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
                        statePc = 10;
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
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        fp.field_z = fp.field_z - og.field_Wb * 2;
                        od.field_c = od.field_c - 2;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var4_int ^ -1) == -3) {
                            statePc = 13;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        og.field_Wb = og.field_Wb + 2;
                        fp.field_z = fp.field_z + od.field_c * 2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-4 != (var4_int ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        og.field_Wb = og.field_Wb - 1;
                        fp.field_z = fp.field_z - od.field_c;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (4 == var4_int) {
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
                        statePc = 22;
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
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        od.field_c = od.field_c + 1;
                        ep.field_i = ep.field_i + og.field_Wb;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-6 == (var4_int ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        od.field_c = od.field_c - 2;
                        ep.field_i = ep.field_i - 2 * og.field_Wb;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param1 > 98) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0 != 0;
                }
                case 29: {
                    try {
                        if (6 != var4_int) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ep.field_i = ep.field_i + og.field_Wb;
                        od.field_c = od.field_c + 1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var4_int == 7) {
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
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        og.field_Wb = og.field_Wb - 2;
                        ep.field_i = ep.field_i - od.field_c * 2;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (8 == var4_int) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        fp.field_z = fp.field_z + var5;
                        fp.field_z = fp.field_z - var5;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var4_int == 9) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ep.field_i = ep.field_i + var5;
                        fp.field_z = fp.field_z - var5;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var4_int = oo.field_w.a(-37880252, 5);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((var4_int ^ -1) == -1) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        hg.field_e = hg.field_e ^ tm.field_g + qm.field_a << 1285268400;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var4_int != 1) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ek.field_kb = ek.field_kb - tm.field_g;
                        qm.field_a = qm.field_a - 1;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var4_int != 2) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        qm.field_a = qm.field_a + 1;
                        ek.field_kb = ek.field_kb + tm.field_g;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((var4_int ^ -1) != -4) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        tm.field_g = tm.field_g - 1;
                        ek.field_kb = ek.field_kb - qm.field_a;
                        statePc = 60;
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
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var4_int != 4) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        tm.field_g = tm.field_g + 1;
                        ek.field_kb = ek.field_kb + qm.field_a;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((param2 ^ -1) != -14) {
                            statePc = 125;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var4_int = 1;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (((qj) this).field_p) {
                            statePc = 97;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (-2 == (((qj) this).field_w.field_k ^ -1)) {
                            statePc = 78;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (((qj) this).field_w.field_k == 2) {
                            statePc = 77;
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
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var4_int = 17;
                        if (var6 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var5 = ((qj) this).field_w.field_l[0].field_Z;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (5 == var5) {
                            statePc = 94;
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
                        stackOut_80_0 = 9;
                        stackIn_81_0 = stackOut_80_0;
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
                        if (stackIn_81_0 == var5) {
                            statePc = 94;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackOut_84_0 = var5;
                        stackIn_85_0 = stackOut_84_0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if ((stackIn_85_0 ^ -1) == -4) {
                            statePc = 94;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackOut_88_0 = -9;
                        stackIn_89_0 = stackOut_88_0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (stackIn_89_0 == (var5 ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        stackOut_94_0 = 1;
                        stackIn_95_0 = stackOut_94_0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 95: {
                    return stackIn_95_0 != 0;
                }
                case 96: {
                    try {
                        if (var6 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (((qj) this).c(113)) {
                            statePc = 108;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (((qj) this).field_w.field_c) {
                            statePc = 107;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (((((qj) this).field_w.field_a | (((qj) this).field_w.field_i | ((qj) this).field_w.field_g)) & 1 << ((qj) this).field_k ^ -1) != -1) {
                            statePc = 107;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var4_int = 2;
                        if (var6 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var4_int = 3;
                        if (var6 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var4_int = 4;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if ((((qj) this).field_w.field_k ^ -1) == -2) {
                            statePc = 120;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackOut_110_0 = this;
                        stackIn_111_0 = stackOut_110_0;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (!((qj) this).field_w.field_c) {
                            statePc = 120;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (200 >= be.field_j) {
                            statePc = 123;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        be.field_j = 299;
                        if (var6 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        ng.a(false, 64, var4_int);
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = 1;
                        stackIn_124_0 = stackOut_123_0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 124: {
                    return stackIn_124_0 != 0;
                }
                case 125: {
                    try {
                        if (-2 != (((qj) this).field_w.field_k ^ -1)) {
                            statePc = 142;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        stackOut_126_0 = r.field_A;
                        stackIn_127_0 = stackOut_126_0;
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (!stackIn_127_0) {
                            statePc = 142;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        stackOut_130_0 = 113;
                        stackIn_131_0 = stackOut_130_0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (ka.a((byte) stackIn_131_0)) {
                            statePc = 136;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (84 == param2) {
                            statePc = 139;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        im.b(-8);
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        stackOut_140_0 = 1;
                        stackIn_141_0 = stackOut_140_0;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 141: {
                    return stackIn_141_0 != 0;
                }
                case 142: {
                    try {
                        if (1 != ((qj) this).field_w.field_k) {
                            statePc = 281;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (!((qj) this).field_y) {
                            statePc = 281;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        var4_ref = ((qj) this).field_w.field_l[0];
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (48 == param2) {
                            statePc = 150;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        ((qj) this).field_s = true;
                        var4_ref.field_m = dp.field_r[0] + -5;
                        stackOut_150_0 = 1;
                        stackIn_151_0 = stackOut_150_0;
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 151: {
                    return stackIn_151_0 != 0;
                }
                case 152: {
                    try {
                        if ((param2 ^ -1) == -69) {
                            statePc = 155;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        var4_ref.field_m = dp.field_r[1] - 5;
                        ((qj) this).field_s = true;
                        stackOut_155_0 = 1;
                        stackIn_156_0 = stackOut_155_0;
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 156: {
                    return stackIn_156_0 != 0;
                }
                case 157: {
                    try {
                        if (66 != param2) {
                            statePc = 160;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        var4_ref.field_m = -5 + dp.field_r[2];
                        ((qj) this).field_s = true;
                        stackOut_158_0 = 1;
                        stackIn_159_0 = stackOut_158_0;
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 159: {
                    return stackIn_159_0 != 0;
                }
                case 160: {
                    try {
                        if ((param2 ^ -1) == -51) {
                            statePc = 163;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        ((qj) this).field_t = -dp.field_r[3] + (var4_ref.field_qb + 1);
                        ((qj) this).field_s = true;
                        stackOut_163_0 = 1;
                        stackIn_164_0 = stackOut_163_0;
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 164: {
                    return stackIn_164_0 != 0;
                }
                case 165: {
                    try {
                        if ((param2 ^ -1) == -35) {
                            statePc = 168;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        ((qj) this).field_s = true;
                        ((qj) this).field_t = var4_ref.field_qb + 1 + -dp.field_r[4];
                        stackOut_168_0 = 1;
                        stackIn_169_0 = stackOut_168_0;
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 169: {
                    return stackIn_169_0 != 0;
                }
                case 170: {
                    try {
                        if (51 == param2) {
                            statePc = 173;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        var4_ref.field_ob = dp.field_r[7] + -20;
                        ((qj) this).field_s = true;
                        stackOut_173_0 = 1;
                        stackIn_174_0 = stackOut_173_0;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 174: {
                    return stackIn_174_0 != 0;
                }
                case 175: {
                    try {
                        if (-53 != (param2 ^ -1)) {
                            statePc = 179;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        ((qj) this).field_s = true;
                        var4_ref.field_ob = -20 + dp.field_r[8];
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if ((param2 ^ -1) != -54) {
                            statePc = 190;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        var5_ref_vn = (vn) (Object) var4_ref.field_gb.d(-19);
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        if (var5_ref_vn == null) {
                            statePc = 187;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        var5_ref_vn.field_I = dp.field_r[9] + -2;
                        var5_ref_vn = (vn) (Object) var4_ref.field_gb.a((byte) 116);
                        stackOut_182_0 = var6;
                        stackIn_183_0 = stackOut_182_0;
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        if (stackIn_183_0 != 0) {
                            statePc = 188;
                        } else {
                            statePc = 184;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        if (var6 == 0) {
                            statePc = 181;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        ((qj) this).field_s = true;
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        stackOut_188_0 = 1;
                        stackIn_189_0 = stackOut_188_0;
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 189: {
                    return stackIn_189_0 != 0;
                }
                case 190: {
                    try {
                        if (param2 == 39) {
                            statePc = 193;
                        } else {
                            statePc = 191;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        statePc = 203;
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        var5_ref_vn = (vn) (Object) var4_ref.field_gb.d(-114);
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        if (var5_ref_vn == null) {
                            statePc = 200;
                        } else {
                            statePc = 195;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        var5_ref_vn.field_I = dp.field_r[10] - 2;
                        var5_ref_vn = (vn) (Object) var4_ref.field_gb.a((byte) 116);
                        stackOut_195_0 = var6;
                        stackIn_196_0 = stackOut_195_0;
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        if (stackIn_196_0 != 0) {
                            statePc = 201;
                        } else {
                            statePc = 197;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        if (var6 == 0) {
                            statePc = 194;
                        } else {
                            statePc = 198;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        ((qj) this).field_s = true;
                        statePc = 201;
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        stackOut_201_0 = 1;
                        stackIn_202_0 = stackOut_201_0;
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 202: {
                    return stackIn_202_0 != 0;
                }
                case 203: {
                    try {
                        if (param2 != 54) {
                            statePc = 215;
                        } else {
                            statePc = 204;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        var4_ref.field_qb = var4_ref.field_qb + 1;
                        if (tk.field_q > var4_ref.field_qb + 1) {
                            statePc = 210;
                        } else {
                            statePc = 205;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        var4_ref.field_Z = 5;
                        if (var6 == 0) {
                            statePc = 213;
                        } else {
                            statePc = 208;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        statePc = 210;
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        var4_ref.field_Z = 0;
                        statePc = 211;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        ((qj) this).field_s = true;
                        var4_ref.field_P = 0;
                        stackOut_213_0 = 1;
                        stackIn_214_0 = stackOut_213_0;
                        statePc = 214;
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 214: {
                    return stackIn_214_0 != 0;
                }
                case 215: {
                    try {
                        if (-56 == (param2 ^ -1)) {
                            statePc = 218;
                        } else {
                            statePc = 216;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        statePc = 231;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        var5 = 0;
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        if (29 <= var5) {
                            statePc = 229;
                        } else {
                            statePc = 220;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        stackOut_220_0 = to.field_f[var5];
                        stackIn_230_0 = stackOut_220_0;
                        stackIn_221_0 = stackOut_220_0;
                        if (var6 != 0) {
                            statePc = 230;
                        } else {
                            statePc = 221;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        stackOut_221_0 = stackIn_221_0;
                        stackOut_221_1 = -1;
                        stackIn_222_0 = stackOut_221_0;
                        stackIn_222_1 = stackOut_221_1;
                        statePc = 222;
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        if (stackIn_222_0 > stackIn_222_1) {
                            statePc = 227;
                        } else {
                            statePc = 223;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        statePc = 225;
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        statePc = 228;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        var4_ref.field_o[var5] = (byte)(-1 + to.field_f[var5]);
                        statePc = 228;
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        var5++;
                        if (var6 == 0) {
                            statePc = 219;
                        } else {
                            statePc = 229;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        ((qj) this).field_s = true;
                        stackOut_229_0 = 1;
                        stackIn_230_0 = stackOut_229_0;
                        statePc = 230;
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 230: {
                    return stackIn_230_0 != 0;
                }
                case 231: {
                    try {
                        if (param2 == 56) {
                            statePc = 234;
                        } else {
                            statePc = 232;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        statePc = 236;
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        var4_ref.field_rb = 5;
                        ((qj) this).field_s = true;
                        stackOut_234_0 = 1;
                        stackIn_235_0 = stackOut_234_0;
                        statePc = 235;
                        continue stateLoop;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 235: {
                    return stackIn_235_0 != 0;
                }
                case 236: {
                    try {
                        if ((param2 ^ -1) > -17) {
                            statePc = 250;
                        } else {
                            statePc = 237;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        if (25 < param2) {
                            statePc = 250;
                        } else {
                            statePc = 238;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        statePc = 240;
                        continue stateLoop;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        var5 = -16 - (-param2 - 1);
                        statePc = 241;
                        continue stateLoop;
                    } catch (Throwable stateCaught_240) {
                        caughtException = stateCaught_240;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        ((qj) this).field_s = true;
                        if (!pe.field_l[81]) {
                            statePc = 245;
                        } else {
                            statePc = 242;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 244;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        var5 += 10;
                        statePc = 243;
                        continue stateLoop;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 244;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        statePc = 245;
                        continue stateLoop;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        if (-12 <= (var5 ^ -1)) {
                            statePc = 248;
                        } else {
                            statePc = 246;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        statePc = 250;
                        continue stateLoop;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        oa.field_Sb = rd.a(var5, (byte) 19);
                        stackOut_248_0 = 1;
                        stackIn_249_0 = stackOut_248_0;
                        statePc = 249;
                        continue stateLoop;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 249: {
                    return stackIn_249_0 != 0;
                }
                case 250: {
                    try {
                        if (70 != param2) {
                            statePc = 253;
                        } else {
                            statePc = 251;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        var4_ref.field_l = 6;
                        ((qj) this).field_s = true;
                        stackOut_251_0 = 1;
                        stackIn_252_0 = stackOut_251_0;
                        statePc = 252;
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 252: {
                    return stackIn_252_0 != 0;
                }
                case 253: {
                    try {
                        if (param2 != 69) {
                            statePc = 256;
                        } else {
                            statePc = 254;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        ((qj) this).field_s = true;
                        var4_ref.field_hb = -1 + dp.field_r[29];
                        stackOut_254_0 = 1;
                        stackIn_255_0 = stackOut_254_0;
                        statePc = 255;
                        continue stateLoop;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 255: {
                    return stackIn_255_0 != 0;
                }
                case 256: {
                    try {
                        if (-41 == (param2 ^ -1)) {
                            statePc = 259;
                        } else {
                            statePc = 257;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        statePc = 261;
                        continue stateLoop;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        var4_ref.field_u = -1 + dp.field_r[30];
                        ((qj) this).field_s = true;
                        stackOut_259_0 = 1;
                        stackIn_260_0 = stackOut_259_0;
                        statePc = 260;
                        continue stateLoop;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 260: {
                    return stackIn_260_0 != 0;
                }
                case 261: {
                    try {
                        if (41 != param2) {
                            statePc = 264;
                        } else {
                            statePc = 262;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        var4_ref.field_u = dp.field_r[31] - 1;
                        ((qj) this).field_s = true;
                        stackOut_262_0 = 1;
                        stackIn_263_0 = stackOut_262_0;
                        statePc = 263;
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 263: {
                    return stackIn_263_0 != 0;
                }
                case 264: {
                    try {
                        if (param2 != 32) {
                            statePc = 267;
                        } else {
                            statePc = 265;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        var4_ref.field_N = dp.field_r[32] + -1;
                        ((qj) this).field_s = true;
                        stackOut_265_0 = 1;
                        stackIn_266_0 = stackOut_265_0;
                        statePc = 266;
                        continue stateLoop;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 266: {
                    return stackIn_266_0 != 0;
                }
                case 267: {
                    try {
                        if (param2 != 35) {
                            statePc = 270;
                        } else {
                            statePc = 268;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        var4_ref.field_N = -1 + dp.field_r[33];
                        ((qj) this).field_s = true;
                        stackOut_268_0 = 1;
                        stackIn_269_0 = stackOut_268_0;
                        statePc = 269;
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 269: {
                    return stackIn_269_0 != 0;
                }
                case 270: {
                    try {
                        if (49 != param2) {
                            statePc = 273;
                        } else {
                            statePc = 271;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        ((qj) this).field_s = true;
                        var4_ref.field_m = dp.field_r[39] + -5;
                        stackOut_271_0 = 1;
                        stackIn_272_0 = stackOut_271_0;
                        statePc = 272;
                        continue stateLoop;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 272: {
                    return stackIn_272_0 != 0;
                }
                case 273: {
                    try {
                        if (param2 == 36) {
                            statePc = 276;
                        } else {
                            statePc = 274;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        statePc = 278;
                        continue stateLoop;
                    } catch (Throwable stateCaught_274) {
                        caughtException = stateCaught_274;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        ((qj) this).field_s = true;
                        var4_ref.field_ob = dp.field_r[40] + -20;
                        stackOut_276_0 = 1;
                        stackIn_277_0 = stackOut_276_0;
                        statePc = 277;
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 277: {
                    return stackIn_277_0 != 0;
                }
                case 278: {
                    try {
                        if (38 != param2) {
                            statePc = 281;
                        } else {
                            statePc = 279;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 279: {
                    try {
                        var4_ref.field_Z = 0;
                        ((qj) this).field_s = true;
                        var4_ref.field_P = 0;
                        stackOut_279_0 = 1;
                        stackIn_280_0 = stackOut_279_0;
                        statePc = 280;
                        continue stateLoop;
                    } catch (Throwable stateCaught_279) {
                        caughtException = stateCaught_279;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 280: {
                    return stackIn_280_0 != 0;
                }
                case 281: {
                    try {
                        if (pf.field_p) {
                            statePc = 284;
                        } else {
                            statePc = 282;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_281) {
                        caughtException = stateCaught_281;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 282: {
                    try {
                        stackOut_282_0 = 1;
                        stackIn_285_0 = stackOut_282_0;
                        statePc = 285;
                        continue stateLoop;
                    } catch (Throwable stateCaught_282) {
                        caughtException = stateCaught_282;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 284: {
                    try {
                        stackOut_284_0 = 0;
                        stackIn_285_0 = stackOut_284_0;
                        statePc = 285;
                        continue stateLoop;
                    } catch (Throwable stateCaught_284) {
                        caughtException = stateCaught_284;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 285: {
                    return stackIn_285_0 != 0;
                }
                case 286: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var4, "qj.T(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, long param2, boolean param3, int param4) {
        int var7_int = 0;
        // ifne L24
        // ifne L24
        try {
            param1 = param1 + param0 * 1000;
            // ifeq L43
            var7_int = 1;
            hq.a(param1, var7_int, param4 + -468, ((int)param2 - -500) / param4);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "qj.U(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            if (((qj) this).field_p) {
            } else {
              throw new IllegalStateException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
            throw decompiledCaughtException;
          }
          ((qj) this).field_w.field_i = ((qj) this).field_w.field_i | 1 << ((qj) this).field_k;
          var2_int = 116 % ((param0 - -55) / 62);
          k.field_h.e(-13413, 66);
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var2 = decompiledCaughtException;
        throw qb.a((Throwable) (Object) var2, "qj.C(" + param0 + 41);
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (this.a(param2, 1)) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (!param0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((qj) this).field_q = true;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((qj) this).field_s) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4_int = ((qj) this).field_w.field_l[0].field_ob;
                        var5 = ((qj) this).field_w.field_l[0].field_qb;
                        fp.field_z = fp.field_z - (((qj) this).field_t + var4_int);
                        ep.field_i = ep.field_i + (-((qj) this).field_t + var5);
                        lp.field_wb.a((nm) (Object) new e(param2, param1, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
                        fp.field_z = fp.field_z - (-((qj) this).field_t + var5);
                        ep.field_i = ep.field_i + (((qj) this).field_t + var4_int);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var4, "qj.N(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1) {
        int var3_int = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 119) {
            return;
        }
        try {
            var3_int = 0;
            do {
                // if_icmpge L56
                ((qj) this).field_w.field_l[var3_int].field_qb = param1;
                var3_int++;
                // ifne L114
            } while (var4 == 0);
            if ((((qj) this).field_w.field_k ^ -1) == -2) {
                ((qj) this).field_t = param1;
                ((qj) this).field_i = param1;
                var3_int = param1;
                fp.field_z = fp.field_z + var3_int;
                w.field_r = lg.a(2, ((qj) this).field_w.field_b.a(((qj) this).field_i, (byte) -122), -1);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "qj.K(" + param0 + 44 + param1 + 41);
        }
    }

    final static void b(byte param0, boolean param1) {
        String[] var3 = null;
        oi var4 = null;
        try {
            int var2_int = 9 % ((param0 - -73) / 49);
            // ifnonnull L30
            var3 = new String[]{we.field_c, pg.field_q};
            var4 = new oi(qh.field_b, kk.a(false, qh.field_b.field_i, hi.field_w), 3);
            r.field_A = false;
            oa.field_Sb = rd.a(0, (byte) 19);
            sk.a(var3, 0, var4, 2, param1, -12665);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "qj.V(" + param0 + 44 + param1 + 41);
        }
    }

    final void a(pi param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        boolean stackIn_8_0 = false;
        boolean stackIn_10_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        boolean stackOut_4_0;
        boolean stackOut_5_0;
        boolean stackOut_6_0;
        boolean stackOut_8_0;
        int stackOut_8_1;
        boolean stackOut_10_0;
        int stackOut_10_1;
        RuntimeException stackOut_15_0;
        StringBuilder stackOut_15_1;
        RuntimeException stackOut_16_0;
        StringBuilder stackOut_16_1;
        String stackOut_16_2;
        RuntimeException stackOut_18_0;
        StringBuilder stackOut_18_1;
        String stackOut_18_2;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = param1;
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
                        if ((((qj) this).field_w.field_k ^ -1) >= (var3_int ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var4 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = op.field_a;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((qj) this).field_w.field_m[var3_int] = param0.b(true);
                        stackOut_5_0 = stackIn_5_0;
                        stackIn_10_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (0 > param0.b(true)) {
                            statePc = 10;
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
                        stackOut_6_0 = stackIn_6_0;
                        stackIn_8_0 = stackOut_6_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = stackIn_8_0;
                        stackOut_8_1 = 1;
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = stackIn_10_0;
                        stackOut_10_1 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        op.field_a = stackIn_11_0 | stackIn_11_1 != 0;
                        var3_int++;
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((qj) this).field_w.a(false);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        stackOut_15_0 = (RuntimeException) runtimeException;
                        stackOut_15_1 = new StringBuilder().append("qj.Q(");
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_18_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param0 == null) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "{...}";
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_19_2 = stackOut_16_2;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 18: {
                    stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                    stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                    stackOut_18_2 = "null";
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw qb.a((Throwable) (Object) stackIn_19_0, (String) (Object) (stackIn_19_2 + 44 + param1 + 41));
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(int param0) {
        try {
            field_u = null;
            field_l = null;
            int var1_int = 47 / ((param0 - 14) / 59);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "qj.BA(" + param0 + 41);
        }
    }

    private final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!param1) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((qj) this).field_n = true;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((qj) this).field_w.field_k == 1) {
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
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3_int = param0;
                        ep.field_i = ep.field_i - var3_int;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((qj) this).field_r = param0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var3, "qj.I(" + param0 + 44 + param1 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4_int = 0;
        int var6 = 0;
        int var7 = 0;
        if (!(!this.a(param0, 1))) {
            return;
        }
        try {
            if (!((qj) this).field_s) {
                var4_int = param0;
                int var5 = param2;
                // if_icmpne L45
                var6 = ed.field_f[var4_int];
                // if_icmpgt L71
                ek.field_kb = ek.field_kb + hg.field_e;
                var7 = 1 << var6;
                hg.field_e = hg.field_e ^ var7;
                ek.field_kb = ek.field_kb - hg.field_e;
                lp.field_wb.a((nm) (Object) new e(param0, param2, hg.field_e, ek.field_kb, tm.field_g, qm.field_a), (byte) 3);
            }
            var4_int = 90 % ((param1 - 36) / 46);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "qj.E(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.a(param1, 1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (param0 > 17) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (!((qj) this).field_s) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((param1 ^ -1) != -8) {
                            statePc = 13;
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
                        fp.field_z = fp.field_z - ((qj) this).field_t;
                        if (var5 == 0) {
                            statePc = 16;
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
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ep.field_i = ep.field_i - ((qj) this).field_t;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        lp.field_wb.a((nm) (Object) new e(param1, param2, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
                        if (-8 == (param1 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ep.field_i = ep.field_i + ((qj) this).field_t;
                        if (var5 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        fp.field_z = fp.field_z + ((qj) this).field_t;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var4, "qj.HA(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(vl param0, boolean param1, vl param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        vl var5 = null;
        int var6_int = 0;
        j var6 = null;
        j var7_ref_j = null;
        int var7 = 0;
        int var8_int = 0;
        j var8 = null;
        ge var9_ref_ge = null;
        int var9 = 0;
        p var10_ref_p = null;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        int var13 = 0;
        vl stackIn_6_0 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        boolean stackIn_30_0 = false;
        int stackIn_48_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        j stackIn_94_0 = null;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        j stackIn_117_0 = null;
        int stackIn_124_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_154_0 = 0;
        int stackIn_154_1 = 0;
        int stackIn_171_0 = 0;
        int stackIn_171_1 = 0;
        j stackIn_188_0 = null;
        j stackIn_190_0 = null;
        j stackIn_193_0 = null;
        int stackIn_203_0 = 0;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        RuntimeException stackIn_208_0 = null;
        StringBuilder stackIn_208_1 = null;
        RuntimeException stackIn_209_0 = null;
        StringBuilder stackIn_209_1 = null;
        String stackIn_209_2 = null;
        RuntimeException stackIn_210_0 = null;
        StringBuilder stackIn_210_1 = null;
        RuntimeException stackIn_212_0 = null;
        StringBuilder stackIn_212_1 = null;
        RuntimeException stackIn_213_0 = null;
        StringBuilder stackIn_213_1 = null;
        String stackIn_213_2 = null;
        Object stackOut_3_0;
        vl stackOut_5_0;
        int stackOut_7_0;
        int stackOut_10_0;
        int stackOut_10_1;
        boolean stackOut_29_0;
        int stackOut_47_0;
        int stackOut_54_0;
        boolean stackOut_86_0;
        int stackOut_86_1;
        int stackOut_91_0;
        int stackOut_91_1;
        j stackOut_93_0;
        int stackOut_100_0;
        int stackOut_100_1;
        j stackOut_116_0;
        int stackOut_123_0;
        int stackOut_136_0;
        int stackOut_136_1;
        int stackOut_147_0;
        int stackOut_147_1;
        int stackOut_153_0;
        int stackOut_153_1;
        int stackOut_170_0;
        int stackOut_170_1;
        j stackOut_187_0;
        j stackOut_188_0;
        j stackOut_192_0;
        int stackOut_202_0;
        RuntimeException stackOut_205_0;
        StringBuilder stackOut_205_1;
        RuntimeException stackOut_206_0;
        StringBuilder stackOut_206_1;
        String stackOut_206_2;
        RuntimeException stackOut_208_0;
        StringBuilder stackOut_208_1;
        String stackOut_208_2;
        RuntimeException stackOut_209_0;
        StringBuilder stackOut_209_1;
        RuntimeException stackOut_210_0;
        StringBuilder stackOut_210_1;
        String stackOut_210_2;
        RuntimeException stackOut_212_0;
        StringBuilder stackOut_212_1;
        String stackOut_212_2;
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
                        var4_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!((qj) this).field_p) {
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
                        stackOut_3_0 = null;
                        stackIn_6_0 = (vl) (Object) stackOut_3_0;
                        statePc = 6;
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
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = new vl();
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = (vl) (Object) stackIn_6_0;
                        var6_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = var6_int ^ -1;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 <= (((qj) this).field_w.field_k ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7_ref_j = ((qj) this).field_w.field_l[var6_int];
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 1 << var6_int & (((qj) this).field_w.field_i | (((qj) this).field_w.field_g | ((qj) this).field_w.field_a)) ^ -1;
                        stackOut_10_1 = -1;
                        stackIn_87_0 = stackOut_10_0;
                        stackIn_87_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (var13 != 0) {
                            statePc = 87;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 == stackIn_11_1) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7_ref_j.field_U = var7_ref_j.field_U + 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((1 << var6_int & ((qj) this).field_o ^ -1) != -1) {
                            statePc = 42;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var7_ref_j.field_q == 0) {
                            statePc = 85;
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
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var8_int = 1;
                        if (var7_ref_j.field_q <= 25) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8_int = 3;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (50 < var7_ref_j.field_q) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var8_int = -25 + var7_ref_j.field_q;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9 = 0;
                        var10_ref_p = (p) (Object) var7_ref_j.field_eb.d(-84);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var9 >= var8_int) {
                            statePc = 41;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((qj) this).field_w.a((byte) 120, var6_int);
                        var7_ref_j.field_db = var10_ref_p.a((byte) -104);
                        ((qj) this).field_w.a(var7_ref_j, param0, var5, 0);
                        var7_ref_j.field_F = var7_ref_j.field_F + 1;
                        stackOut_29_0 = var10_ref_p.c(1);
                        stackIn_8_0 = stackOut_29_0 ? 1 : 0;
                        stackIn_30_0 = stackOut_29_0;
                        if (var13 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (!stackIn_30_0) {
                            statePc = 40;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var10_ref_p.b((byte) 111);
                        var7_ref_j.field_p = var10_ref_p.field_k;
                        if (!var10_ref_p.field_l) {
                            statePc = 39;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var11 = null;
                        var12 = var7_ref_j.a(param1, (StringBuilder) var11) ^ var7_ref_j.e(120);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var10_ref_p.field_m == var12) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        hn.a((byte) 91);
                        rk.a("T2 " + var10_ref_p.field_m + " " + var12 + " ", (Throwable) null, 54);
                        cf.field_a = cf.field_a + 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var10_ref_p = (p) (Object) var7_ref_j.field_eb.d(-21);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9++;
                        var7_ref_j.field_q = var7_ref_j.field_q - 1;
                        if (var13 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var13 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (!((qj) this).field_p) {
                            statePc = 67;
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
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var8_int = var7_ref_j.field_F - var7_ref_j.field_E;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var8_int <= 30) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = 0;
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
                        if (stackIn_48_0 == de.field_x % 10) {
                            statePc = 85;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (40 >= var8_int) {
                            statePc = 61;
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
                        stackOut_54_0 = 0;
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
                        if (stackIn_55_0 != de.field_x % 5) {
                            statePc = 61;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var13 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (50 != var8_int) {
                            statePc = 67;
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
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var13 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (((((qj) this).field_w.field_a | (((qj) this).field_w.field_g | ((qj) this).field_w.field_i)) & 1 << var6_int ^ -1) == -1) {
                            statePc = 73;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var13 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        ((qj) this).field_w.a((byte) 127, var6_int);
                        ((qj) this).field_w.a(var7_ref_j, param2, var5, 0);
                        if (((qj) this).field_p) {
                            statePc = 79;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        ((qj) this).field_w.a(var6_int, 1, var5, (byte) -122);
                        var7_ref_j.field_p = var7_ref_j.field_Q;
                        statePc = 77;
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
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var4_int = var4_int | 1;
                        var7_ref_j.field_F = var7_ref_j.field_F + 1;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var5 == null) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var5.c((byte) -110);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var7_ref_j.c(-101);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var6_int++;
                        if (var13 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var6_int = 0;
                        stackOut_86_0 = param1;
                        stackOut_86_1 = 1;
                        stackIn_87_0 = stackOut_86_0 ? 1 : 0;
                        stackIn_87_1 = stackOut_86_1;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (stackIn_87_0 == stackIn_87_1) {
                            statePc = 91;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        ((qj) this).field_k = 29;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = ((qj) this).field_w.field_k;
                        stackOut_91_1 = var6_int;
                        stackIn_92_0 = stackOut_91_0;
                        stackIn_92_1 = stackOut_91_1;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (stackIn_92_0 <= stackIn_92_1) {
                            statePc = 132;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var7_ref_j = ((qj) this).field_w.field_l[var6_int];
                        var8_int = 0;
                        stackOut_93_0 = (j) var7_ref_j;
                        stackIn_190_0 = stackOut_93_0;
                        stackIn_94_0 = stackOut_93_0;
                        if (var13 != 0) {
                            statePc = 190;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var9_ref_ge = (ge) (Object) ((j) (Object) stackIn_94_0).field_pb.d(-48);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (null == var9_ref_ge) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var8_int = var8_int | 1 << var9_ref_ge.field_i;
                        var9_ref_ge = (ge) (Object) var7_ref_j.field_pb.a((byte) 116);
                        if (var13 != 0) {
                            statePc = 91;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var13 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var9 = 0;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (-30 >= (var9 ^ -1)) {
                            statePc = 131;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackOut_100_0 = to.field_f[var9];
                        stackOut_100_1 = 1;
                        stackIn_92_0 = stackOut_100_0;
                        stackIn_92_1 = stackOut_100_1;
                        stackIn_101_0 = stackOut_100_0;
                        stackIn_101_1 = stackOut_100_1;
                        if (var13 != 0) {
                            statePc = 92;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (stackIn_101_0 >= stackIn_101_1) {
                            statePc = 105;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (var13 == 0) {
                            statePc = 130;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var10 = (20 * var7_ref_j.field_o[var9] << -1472610392) / to.field_f[var9];
                        if ((1 << var9 & var8_int) == 0) {
                            statePc = 107;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var10 = 5120;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var7_ref_j.field_xb[var9] = var7_ref_j.field_xb[var9] + (-var7_ref_j.field_cb[var9] + var10) / 100;
                        var7_ref_j.field_xb[var9] = 7 * var7_ref_j.field_xb[var9] / 8;
                        if (512 >= var7_ref_j.field_xb[var9]) {
                            statePc = 111;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var7_ref_j.field_xb[var9] = 512;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (511 < (var7_ref_j.field_xb[var9] ^ -1)) {
                            statePc = 114;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var7_ref_j.field_xb[var9] = -512;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var7_ref_j.field_cb[var9] = var7_ref_j.field_cb[var9] + var7_ref_j.field_xb[var9];
                        if ((var7_ref_j.field_xb[var9] ^ -1) >= -1) {
                            statePc = 120;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        stackOut_116_0 = (j) var7_ref_j;
                        stackIn_117_0 = stackOut_116_0;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (((j) (Object) stackIn_117_0).field_cb[var9] > var10) {
                            statePc = 129;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (-1 >= (var7_ref_j.field_xb[var9] ^ -1)) {
                            statePc = 130;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = var10;
                        stackIn_124_0 = stackOut_123_0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if ((stackIn_124_0 ^ -1) < (var7_ref_j.field_cb[var9] ^ -1)) {
                            statePc = 129;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var7_ref_j.field_cb[var9] = var10;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var9++;
                        if (var13 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var6_int++;
                        if (var13 == 0) {
                            statePc = 91;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (((qj) this).field_w.field_k <= 1) {
                            statePc = 147;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var6_int = 0;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (var6_int >= ((qj) this).field_w.field_k) {
                            statePc = 147;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var7_ref_j = ((qj) this).field_w.field_l[var6_int];
                        var8_int = var7_ref_j.field_p + var7_ref_j.field_ub << 2067259976;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        var7_ref_j.field_J = var7_ref_j.field_J + (var8_int + -var7_ref_j.field_G) / 100;
                        var7_ref_j.field_J = 7 * var7_ref_j.field_J / 8;
                        stackOut_136_0 = var7_ref_j.field_J;
                        stackOut_136_1 = 1280;
                        stackIn_148_0 = stackOut_136_0;
                        stackIn_148_1 = stackOut_136_1;
                        stackIn_137_0 = stackOut_136_0;
                        stackIn_137_1 = stackOut_136_1;
                        if (var13 != 0) {
                            statePc = 148;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (stackIn_137_0 > stackIn_137_1) {
                            statePc = 141;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var7_ref_j.field_J = 1280;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var7_ref_j.field_G = var7_ref_j.field_G + var7_ref_j.field_J;
                        if ((var7_ref_j.field_G ^ -1) >= (var8_int ^ -1)) {
                            statePc = 146;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        var7_ref_j.field_G = var8_int;
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        var6_int++;
                        if (var13 == 0) {
                            statePc = 134;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        stackOut_147_0 = -2;
                        stackOut_147_1 = ((qj) this).field_w.field_k ^ -1;
                        stackIn_148_0 = stackOut_147_0;
                        stackIn_148_1 = stackOut_147_1;
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (stackIn_148_0 > stackIn_148_1) {
                            statePc = 150;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        var6_int = ((qj) this).field_w.a(125);
                        var7 = 0;
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if ((((qj) this).field_w.field_k ^ -1) >= (var7 ^ -1)) {
                            statePc = 167;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        var8 = ((qj) this).field_w.field_l[var7];
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        stackOut_153_0 = -1;
                        stackOut_153_1 = 1 << var7 & var6_int ^ -1;
                        stackIn_171_0 = stackOut_153_0;
                        stackIn_171_1 = stackOut_153_1;
                        stackIn_154_0 = stackOut_153_0;
                        stackIn_154_1 = stackOut_153_1;
                        if (var13 != 0) {
                            statePc = 171;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (stackIn_154_0 != stackIn_154_1) {
                            statePc = 160;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        var8.field_M = -1;
                        if (var13 == 0) {
                            statePc = 166;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 162;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 162;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if (var8.field_M != -1) {
                            statePc = 166;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        var8.field_M = 500;
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        var7++;
                        if (var13 == 0) {
                            statePc = 151;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if (!((qj) this).field_p) {
                            statePc = 170;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        stackOut_170_0 = ((qj) this).field_w.field_k ^ -1;
                        stackOut_170_1 = -2;
                        stackIn_171_0 = stackOut_170_0;
                        stackIn_171_1 = stackOut_170_1;
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (stackIn_171_0 == stackIn_171_1) {
                            statePc = 187;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        if (((qj) this).field_w.field_c) {
                            statePc = 202;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        ((qj) this).field_w.field_a = ((qj) this).field_w.field_a | ((qj) this).field_w.c(-17566);
                        ((qj) this).field_w.field_g = ((qj) this).field_w.field_g | ((qj) this).field_w.a((byte) -92);
                        if (!((qj) this).field_w.b(82)) {
                            statePc = 202;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        if (-1 != ((qj) this).field_w.field_h) {
                            statePc = 184;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        ((qj) this).field_w.field_h = 0;
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        var6_int = ((qj) this).field_w.field_h;
                        var7 = 1 - ((qj) this).field_w.field_h;
                        if ((((qj) this).field_w.field_a & 1 << var7 ^ -1) == -1) {
                            statePc = 186;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        var6_int = var7;
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        ((qj) this).field_w.field_l[var6_int].field_zb = 1;
                        ((qj) this).field_w.field_m[0] = var6_int;
                        ((qj) this).field_w.field_l[-var6_int + 1].field_zb = 2;
                        ((qj) this).field_w.field_m[1] = 1 - var6_int;
                        ((qj) this).field_w.a(false);
                        op.field_a = true;
                        if (var13 == 0) {
                            statePc = 202;
                        } else {
                            statePc = 187;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        stackOut_187_0 = ((qj) this).field_w.field_l[0];
                        stackIn_188_0 = stackOut_187_0;
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        stackOut_188_0 = (j) (Object) stackIn_188_0;
                        stackIn_190_0 = stackOut_188_0;
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        var6 = (j) (Object) stackIn_190_0;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if (-9 == (var6.field_Z ^ -1)) {
                            statePc = 196;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        stackOut_192_0 = (j) var6;
                        stackIn_193_0 = stackOut_192_0;
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if ((((j) (Object) stackIn_193_0).field_Z ^ -1) != -10) {
                            statePc = 202;
                        } else {
                            statePc = 194;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        ((qj) this).a((byte) 40, false);
                        if (8 != var6.field_Z) {
                            statePc = 201;
                        } else {
                            statePc = 197;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        cc.field_G = true;
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        stackOut_202_0 = var4_int;
                        stackIn_203_0 = stackOut_202_0;
                        statePc = 203;
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 203: {
                    return stackIn_203_0 != 0;
                }
                case 204: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    try {
                        stackOut_205_0 = (RuntimeException) var4;
                        stackOut_205_1 = new StringBuilder().append("qj.P(");
                        stackIn_208_0 = stackOut_205_0;
                        stackIn_208_1 = stackOut_205_1;
                        stackIn_206_0 = stackOut_205_0;
                        stackIn_206_1 = stackOut_205_1;
                        if (param0 == null) {
                            statePc = 208;
                        } else {
                            statePc = 206;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        stackOut_206_0 = (RuntimeException) (Object) stackIn_206_0;
                        stackOut_206_1 = (StringBuilder) (Object) stackIn_206_1;
                        stackOut_206_2 = "{...}";
                        stackIn_209_0 = stackOut_206_0;
                        stackIn_209_1 = stackOut_206_1;
                        stackIn_209_2 = stackOut_206_2;
                        statePc = 209;
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 207: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 208: {
                    stackOut_208_0 = (RuntimeException) (Object) stackIn_208_0;
                    stackOut_208_1 = (StringBuilder) (Object) stackIn_208_1;
                    stackOut_208_2 = "null";
                    stackIn_209_0 = stackOut_208_0;
                    stackIn_209_1 = stackOut_208_1;
                    stackIn_209_2 = stackOut_208_2;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    try {
                        stackOut_209_0 = (RuntimeException) (Object) stackIn_209_0;
                        stackOut_209_1 = ((StringBuilder) (Object) stackIn_209_1).append(stackIn_209_2).append(44).append(param1).append(44);
                        stackIn_212_0 = stackOut_209_0;
                        stackIn_212_1 = stackOut_209_1;
                        stackIn_210_0 = stackOut_209_0;
                        stackIn_210_1 = stackOut_209_1;
                        if (param2 == null) {
                            statePc = 212;
                        } else {
                            statePc = 210;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 211;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        stackOut_210_0 = (RuntimeException) (Object) stackIn_210_0;
                        stackOut_210_1 = (StringBuilder) (Object) stackIn_210_1;
                        stackOut_210_2 = "{...}";
                        stackIn_213_0 = stackOut_210_0;
                        stackIn_213_1 = stackOut_210_1;
                        stackIn_213_2 = stackOut_210_2;
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 211;
                        continue stateLoop;
                    }
                }
                case 211: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 212: {
                    stackOut_212_0 = (RuntimeException) (Object) stackIn_212_0;
                    stackOut_212_1 = (StringBuilder) (Object) stackIn_212_1;
                    stackOut_212_2 = "null";
                    stackIn_213_0 = stackOut_212_0;
                    stackIn_213_1 = stackOut_212_1;
                    stackIn_213_2 = stackOut_212_2;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    throw qb.a((Throwable) (Object) stackIn_213_0, (String) (Object) (stackIn_213_2 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(nc param0, int param1, byte param2, int param3) {
        pn var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackOut_13_0;
        StringBuilder stackOut_13_1;
        RuntimeException stackOut_14_0;
        StringBuilder stackOut_14_1;
        String stackOut_14_2;
        RuntimeException stackOut_16_0;
        StringBuilder stackOut_16_1;
        String stackOut_16_2;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!((qj) this).field_s) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        ep.field_i = ep.field_i + (param3 + param0.field_b);
                        if (param2 <= -87) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((qj) this).field_p = true;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        fp.field_z = fp.field_z - (param1 + ((qj) this).field_t);
                        var5 = new pn(param0.field_h, -1 + param3, fp.field_z, ep.field_i, od.field_c, og.field_Wb);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        kq.field_j.a((nm) (Object) var5, (byte) 3);
                        fp.field_z = fp.field_z - (param0.field_b + param3);
                        ep.field_i = ep.field_i + (param1 - -((qj) this).field_t);
                        if ((hh.field_b[param0.field_h] ^ -1) <= (param3 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        hh.field_b[param0.field_h] = param3;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var5_ref = (RuntimeException) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) var5_ref;
                        stackOut_13_1 = new StringBuilder().append("qj.AA(");
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param0 == null) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                        stackOut_14_2 = "{...}";
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_17_2 = stackOut_14_2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                    stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                    stackOut_16_2 = "null";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw qb.a((Throwable) (Object) stackIn_17_0, (String) (Object) (stackIn_17_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41));
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(pi param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        ge var6 = null;
        int var7 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackOut_3_0;
        StringBuilder stackOut_3_1;
        RuntimeException stackOut_4_0;
        StringBuilder stackOut_4_1;
        String stackOut_4_2;
        RuntimeException stackOut_6_0;
        StringBuilder stackOut_6_1;
        String stackOut_6_2;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3_int = param0.l(255);
                        var4 = param0.l(255);
                        var5 = param0.e(255);
                        var6 = new ge(0, 0, var4);
                        var7 = 102 / ((-65 - param1) / 34);
                        var6.field_y = var5;
                        ((qj) this).field_w.field_l[var3_int].field_kb.a((Object) (Object) var6, (byte) -39);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        stackOut_3_0 = (RuntimeException) runtimeException;
                        stackOut_3_1 = new StringBuilder().append("qj.G(");
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_6_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (param0 == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
                        stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
                        stackOut_4_2 = "{...}";
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 6: {
                    stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                    stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                    stackOut_6_2 = "null";
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    throw qb.a((Throwable) (Object) stackIn_7_0, (String) (Object) (stackIn_7_2 + 44 + param1 + 41));
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, j param1) {
        RuntimeException var3 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        Object stackOut_17_0;
        RuntimeException stackOut_37_0;
        StringBuilder stackOut_37_1;
        RuntimeException stackOut_38_0;
        StringBuilder stackOut_38_1;
        String stackOut_38_2;
        RuntimeException stackOut_40_0;
        StringBuilder stackOut_40_1;
        String stackOut_40_2;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        param1.field_db = 0;
                        if (!pe.field_l[param1.field_bb]) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        param1.field_db = param1.field_db | 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!pe.field_l[param1.field_j]) {
                            statePc = 8;
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
                        param1.field_db = param1.field_db | 2;
                        statePc = 6;
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
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (pe.field_l[param1.field_I]) {
                            statePc = 11;
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
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param1.field_db = param1.field_db | 4;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param0 > 50) {
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
                        ((qj) this).b(60);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (((qj) this).field_w.field_k == 1) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = this;
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
                        if (!((qj) this).field_p) {
                            statePc = 42;
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
                        if (!pe.field_l[ah.field_w[1][0]]) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        param1.field_db = param1.field_db | 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (!pe.field_l[ah.field_w[1][1]]) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        param1.field_db = param1.field_db | 2;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (pe.field_l[ah.field_w[1][2]]) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        param1.field_db = param1.field_db | 4;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    try {
                        stackOut_37_0 = (RuntimeException) var3;
                        stackOut_37_1 = new StringBuilder().append("qj.GA(").append(param0).append(44);
                        stackIn_40_0 = stackOut_37_0;
                        stackIn_40_1 = stackOut_37_1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        if (param1 == null) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                        stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                        stackOut_38_2 = "{...}";
                        stackIn_41_0 = stackOut_38_0;
                        stackIn_41_1 = stackOut_38_1;
                        stackIn_41_2 = stackOut_38_2;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 40: {
                    stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                    stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                    stackOut_40_2 = "null";
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    stackIn_41_2 = stackOut_40_2;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    throw qb.a((Throwable) (Object) stackIn_41_0, (String) (Object) (stackIn_41_2 + 41));
                }
                case 42: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void g(int param0) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int[] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        j var7_ref_j = null;
        vo var8 = null;
        int var8_int = 0;
        jp var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        boolean stackIn_62_0 = false;
        int stackIn_70_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_109_0 = 0;
        boolean stackIn_111_0 = false;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        boolean stackIn_112_0 = false;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        boolean stackIn_113_0 = false;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        boolean stackIn_115_0 = false;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        boolean stackIn_117_0 = false;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        boolean stackIn_118_0 = false;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_118_3 = 0;
        boolean stackIn_119_0 = false;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_119_3 = 0;
        j stackIn_119_4 = null;
        int stackIn_119_5 = 0;
        int stackIn_119_6 = 0;
        boolean stackIn_120_0 = false;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        int stackIn_120_3 = 0;
        j stackIn_120_4 = null;
        int stackIn_120_5 = 0;
        int stackIn_120_6 = 0;
        int stackIn_120_7 = 0;
        boolean stackIn_121_0 = false;
        int stackIn_121_1 = 0;
        int stackIn_121_2 = 0;
        int stackIn_121_3 = 0;
        j stackIn_121_4 = null;
        int stackIn_121_5 = 0;
        int stackIn_121_6 = 0;
        boolean stackIn_123_0 = false;
        int stackIn_123_1 = 0;
        int stackIn_123_2 = 0;
        int stackIn_123_3 = 0;
        j stackIn_123_4 = null;
        int stackIn_123_5 = 0;
        int stackIn_123_6 = 0;
        boolean stackIn_125_0 = false;
        int stackIn_125_1 = 0;
        int stackIn_125_2 = 0;
        int stackIn_125_3 = 0;
        j stackIn_125_4 = null;
        int stackIn_125_5 = 0;
        int stackIn_125_6 = 0;
        boolean stackIn_126_0 = false;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        int stackIn_126_3 = 0;
        j stackIn_126_4 = null;
        int stackIn_126_5 = 0;
        int stackIn_126_6 = 0;
        int stackIn_126_7 = 0;
        int stackIn_131_0 = 0;
        boolean stackIn_133_0 = false;
        int stackIn_133_1 = 0;
        int stackIn_133_2 = 0;
        boolean stackIn_134_0 = false;
        int stackIn_134_1 = 0;
        int stackIn_134_2 = 0;
        int stackIn_134_3 = 0;
        boolean stackIn_135_0 = false;
        int stackIn_135_1 = 0;
        int stackIn_135_2 = 0;
        boolean stackIn_137_0 = false;
        int stackIn_137_1 = 0;
        int stackIn_137_2 = 0;
        boolean stackIn_139_0 = false;
        int stackIn_139_1 = 0;
        int stackIn_139_2 = 0;
        boolean stackIn_140_0 = false;
        int stackIn_140_1 = 0;
        int stackIn_140_2 = 0;
        int stackIn_140_3 = 0;
        boolean stackIn_141_0 = false;
        int stackIn_141_1 = 0;
        int stackIn_141_2 = 0;
        int stackIn_141_3 = 0;
        j stackIn_141_4 = null;
        int stackIn_141_5 = 0;
        int stackIn_141_6 = 0;
        boolean stackIn_142_0 = false;
        int stackIn_142_1 = 0;
        int stackIn_142_2 = 0;
        int stackIn_142_3 = 0;
        j stackIn_142_4 = null;
        int stackIn_142_5 = 0;
        int stackIn_142_6 = 0;
        int stackIn_142_7 = 0;
        boolean stackIn_143_0 = false;
        int stackIn_143_1 = 0;
        int stackIn_143_2 = 0;
        int stackIn_143_3 = 0;
        j stackIn_143_4 = null;
        int stackIn_143_5 = 0;
        int stackIn_143_6 = 0;
        boolean stackIn_145_0 = false;
        int stackIn_145_1 = 0;
        int stackIn_145_2 = 0;
        int stackIn_145_3 = 0;
        j stackIn_145_4 = null;
        int stackIn_145_5 = 0;
        int stackIn_145_6 = 0;
        boolean stackIn_147_0 = false;
        int stackIn_147_1 = 0;
        int stackIn_147_2 = 0;
        int stackIn_147_3 = 0;
        j stackIn_147_4 = null;
        int stackIn_147_5 = 0;
        int stackIn_147_6 = 0;
        boolean stackIn_148_0 = false;
        int stackIn_148_1 = 0;
        int stackIn_148_2 = 0;
        int stackIn_148_3 = 0;
        j stackIn_148_4 = null;
        int stackIn_148_5 = 0;
        int stackIn_148_6 = 0;
        int stackIn_148_7 = 0;
        int stackIn_154_0 = 0;
        boolean stackIn_156_0 = false;
        int stackIn_156_1 = 0;
        int stackIn_156_2 = 0;
        boolean stackIn_157_0 = false;
        int stackIn_157_1 = 0;
        int stackIn_157_2 = 0;
        int stackIn_157_3 = 0;
        boolean stackIn_158_0 = false;
        int stackIn_158_1 = 0;
        int stackIn_158_2 = 0;
        boolean stackIn_160_0 = false;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        boolean stackIn_162_0 = false;
        int stackIn_162_1 = 0;
        int stackIn_162_2 = 0;
        boolean stackIn_163_0 = false;
        int stackIn_163_1 = 0;
        int stackIn_163_2 = 0;
        int stackIn_163_3 = 0;
        int[] stackIn_182_0 = null;
        int stackOut_8_0;
        int stackOut_8_1;
        int stackOut_15_0;
        int stackOut_39_0;
        int stackOut_39_1;
        int stackOut_50_0;
        int stackOut_50_1;
        int stackOut_57_0;
        int stackOut_57_1;
        boolean stackOut_61_0;
        int stackOut_69_0;
        int stackOut_87_0;
        int stackOut_89_0;
        int stackOut_92_0;
        int stackOut_96_0;
        int stackOut_98_0;
        int stackOut_101_0;
        int stackOut_103_0;
        int stackOut_106_0;
        int stackOut_108_0;
        boolean stackOut_110_0;
        int stackOut_110_1;
        int stackOut_110_2;
        boolean stackOut_111_0;
        int stackOut_111_1;
        int stackOut_111_2;
        int stackOut_111_3;
        boolean stackOut_112_0;
        int stackOut_112_1;
        int stackOut_112_2;
        boolean stackOut_113_0;
        int stackOut_113_1;
        int stackOut_113_2;
        boolean stackOut_115_0;
        int stackOut_115_1;
        int stackOut_115_2;
        int stackOut_115_3;
        boolean stackOut_117_0;
        int stackOut_117_1;
        int stackOut_117_2;
        int stackOut_117_3;
        boolean stackOut_118_0;
        int stackOut_118_1;
        int stackOut_118_2;
        int stackOut_118_3;
        j stackOut_118_4;
        int stackOut_118_5;
        int stackOut_118_6;
        boolean stackOut_119_0;
        int stackOut_119_1;
        int stackOut_119_2;
        int stackOut_119_3;
        j stackOut_119_4;
        int stackOut_119_5;
        int stackOut_119_6;
        int stackOut_119_7;
        boolean stackOut_120_0;
        int stackOut_120_1;
        int stackOut_120_2;
        int stackOut_120_3;
        j stackOut_120_4;
        int stackOut_120_5;
        int stackOut_120_6;
        boolean stackOut_121_0;
        int stackOut_121_1;
        int stackOut_121_2;
        int stackOut_121_3;
        j stackOut_121_4;
        int stackOut_121_5;
        int stackOut_121_6;
        boolean stackOut_123_0;
        int stackOut_123_1;
        int stackOut_123_2;
        int stackOut_123_3;
        j stackOut_123_4;
        int stackOut_123_5;
        int stackOut_123_6;
        int stackOut_123_7;
        boolean stackOut_125_0;
        int stackOut_125_1;
        int stackOut_125_2;
        int stackOut_125_3;
        j stackOut_125_4;
        int stackOut_125_5;
        int stackOut_125_6;
        int stackOut_125_7;
        int stackOut_128_0;
        int stackOut_130_0;
        boolean stackOut_132_0;
        int stackOut_132_1;
        int stackOut_132_2;
        boolean stackOut_133_0;
        int stackOut_133_1;
        int stackOut_133_2;
        int stackOut_133_3;
        boolean stackOut_134_0;
        int stackOut_134_1;
        int stackOut_134_2;
        boolean stackOut_135_0;
        int stackOut_135_1;
        int stackOut_135_2;
        boolean stackOut_137_0;
        int stackOut_137_1;
        int stackOut_137_2;
        int stackOut_137_3;
        boolean stackOut_139_0;
        int stackOut_139_1;
        int stackOut_139_2;
        int stackOut_139_3;
        boolean stackOut_140_0;
        int stackOut_140_1;
        int stackOut_140_2;
        int stackOut_140_3;
        j stackOut_140_4;
        int stackOut_140_5;
        int stackOut_140_6;
        boolean stackOut_141_0;
        int stackOut_141_1;
        int stackOut_141_2;
        int stackOut_141_3;
        j stackOut_141_4;
        int stackOut_141_5;
        int stackOut_141_6;
        int stackOut_141_7;
        boolean stackOut_142_0;
        int stackOut_142_1;
        int stackOut_142_2;
        int stackOut_142_3;
        j stackOut_142_4;
        int stackOut_142_5;
        int stackOut_142_6;
        boolean stackOut_143_0;
        int stackOut_143_1;
        int stackOut_143_2;
        int stackOut_143_3;
        j stackOut_143_4;
        int stackOut_143_5;
        int stackOut_143_6;
        boolean stackOut_145_0;
        int stackOut_145_1;
        int stackOut_145_2;
        int stackOut_145_3;
        j stackOut_145_4;
        int stackOut_145_5;
        int stackOut_145_6;
        int stackOut_145_7;
        boolean stackOut_147_0;
        int stackOut_147_1;
        int stackOut_147_2;
        int stackOut_147_3;
        j stackOut_147_4;
        int stackOut_147_5;
        int stackOut_147_6;
        int stackOut_147_7;
        int stackOut_151_0;
        int stackOut_153_0;
        boolean stackOut_155_0;
        int stackOut_155_1;
        int stackOut_155_2;
        boolean stackOut_156_0;
        int stackOut_156_1;
        int stackOut_156_2;
        int stackOut_156_3;
        boolean stackOut_157_0;
        int stackOut_157_1;
        int stackOut_157_2;
        boolean stackOut_158_0;
        int stackOut_158_1;
        int stackOut_158_2;
        boolean stackOut_160_0;
        int stackOut_160_1;
        int stackOut_160_2;
        int stackOut_160_3;
        boolean stackOut_162_0;
        int stackOut_162_1;
        int stackOut_162_2;
        int stackOut_162_3;
        int[] stackOut_181_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = -76 / ((-79 - param0) / 35);
                        var2_array = kh.field_c[((qj) this).field_w.field_k - 1];
                        var3 = kh.field_e[((qj) this).field_w.field_k - 1];
                        var5 = kh.field_h[-1 + ((qj) this).field_w.field_k];
                        var6 = ((qj) this).field_m;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null != oa.field_Sb) {
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
                        statePc = 36;
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
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var7 ^ -1) <= (((qj) this).field_w.field_k ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = ((qj) this).field_w.field_l[var6].field_yb;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 1;
                        stackOut_8_1 = ((qj) this).field_w.field_k;
                        stackIn_40_0 = stackOut_8_0;
                        stackIn_40_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var11 != 0) {
                            statePc = 40;
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
                            statePc = 13;
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
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = (-((var8.field_j - -(var8.field_u / 2) << -563346808) * 2) + 33423360) / 510;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        oa.field_Sb.a(true, var9, 0, 0, 0);
                        if (oa.field_Sb.field_m == 7) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = -6;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 == (((qj) this).field_w.field_l[var6].field_Z ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
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
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        gh.a(121, true);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (km.field_i > 0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var10 = km.field_i * 256 / 32;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        nk.field_c.b(0, 0, var10);
                        if (var11 == 0) {
                            statePc = 36;
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
                        if (-2 != (var5[var7] ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
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
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        vi.a((byte) 76, 306 + var2_array[var7], var2_array[var7], var3[var7], var3[var7] - -480);
                        var9 = (-(2 * (var8.field_j - -(var8.field_u / 2) << 1524245384)) + 20054016) / 306;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        oa.field_Sb.a(var3[var7], (byte) -107, var2_array[var7], var6, var9 / 2);
                        sc.b(-122);
                        if (var11 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        vi.a((byte) 124, 153 + var2_array[var7], var2_array[var7], var3[var7], 233 + var3[var7]);
                        oa.field_Sb.a((byte) -102, var6, var2_array[var7], var3[var7]);
                        sc.b(-79);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var6++;
                        var6 = var6 % ((qj) this).field_w.field_k;
                        var7++;
                        if (var11 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (oa.field_Sb != null) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = ((qj) this).field_w.field_k;
                        stackOut_39_1 = 2;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 <= stackIn_40_1) {
                            statePc = 47;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var7 = ((qj) this).field_w.field_k;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var7 ^ -1) <= -6) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        oa.field_Sb.a((byte) -79, -1, var2_array[var7], var3[var7]);
                        lb.d(var2_array[var7], var3[var7], 153, 233, 0, 160);
                        var7++;
                        if (var11 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var11 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var6 = ((qj) this).field_m;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var7 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var7 >= ((qj) this).field_w.field_k) {
                            statePc = 57;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = tn.field_C ^ -1;
                        stackOut_50_1 = var5[var7] ^ -1;
                        stackIn_58_0 = stackOut_50_0;
                        stackIn_58_1 = stackOut_50_1;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        if (var11 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 != stackIn_51_1) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        gr.b(var5[var7], -28463);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        pi.a((byte) 90, var6, var5[var7], var3[var7], ((qj) this).field_w, var2_array[var7]);
                        var6++;
                        var6 = var6 % ((qj) this).field_w.field_k;
                        var7++;
                        if (var11 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = ((qj) this).field_w.field_k ^ -1;
                        stackOut_57_1 = -2;
                        stackIn_58_0 = stackOut_57_0;
                        stackIn_58_1 = stackOut_57_1;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 != stackIn_58_1) {
                            statePc = 83;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var7_ref_j = ((qj) this).field_w.field_l[0];
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        nh.a(526, 482, -40, -1, cd.field_h, -1);
                        lb.d(7, 473, 510, 7, 0, 96);
                        lb.d(524, 0, 116, 480, 0, 96);
                        nh.a(125, 482, -40, 516, cd.field_h, -1);
                        tk.a(130, ((qj) this).field_w, nn.field_g, var7_ref_j, (byte) -104, 527, 10, 85);
                        nh.a(125, 9, -40, 516, cd.field_h, 137);
                        if (!r.field_A) {
                            statePc = 67;
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
                        stackOut_61_0 = wc.field_b;
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
                        if (stackIn_62_0) {
                            statePc = 67;
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
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        ua.a(var7_ref_j, 524, 85, -68, 147, 81, ((qj) this).field_w);
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        nh.a(125, 9, -40, 516, cd.field_h, 229);
                        a.a(640, ((qj) this).field_w, var7_ref_j);
                        if (!r.field_A) {
                            statePc = 73;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackOut_69_0 = 124;
                        stackIn_70_0 = stackOut_69_0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (ka.a((byte) stackIn_70_0)) {
                            statePc = 79;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (null == var7_ref_j.field_fb) {
                            statePc = 82;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        ui.a(var7_ref_j.field_fb, nn.field_g, 0, (tp[]) null, 80, 621, 1729, 340, 85, -1);
                        if (var11 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        ui.a(tb.field_eb + ro.field_v, ob.field_D, 6, c.field_i, 100, 621, 1729, 340, 230, 0);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (2 != ((qj) this).field_w.field_k) {
                            statePc = 149;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (((qj) this).field_p) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackOut_87_0 = 1;
                        stackIn_90_0 = stackOut_87_0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackOut_89_0 = 0;
                        stackIn_90_0 = stackOut_89_0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var7 = stackIn_90_0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (!((qj) this).field_p) {
                            statePc = 96;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackOut_92_0 = -1;
                        stackIn_93_0 = stackOut_92_0;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (stackIn_93_0 != (((qj) this).field_o ^ -1)) {
                            statePc = 98;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackOut_96_0 = 1;
                        stackIn_99_0 = stackOut_96_0;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        stackOut_98_0 = 0;
                        stackIn_99_0 = stackOut_98_0;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var8_int = stackIn_99_0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (((qj) this).field_p) {
                            statePc = 103;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackOut_101_0 = 1;
                        stackIn_104_0 = stackOut_101_0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        stackOut_103_0 = ((qj) this).field_m;
                        stackIn_104_0 = stackOut_103_0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var9 = stackIn_104_0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if ((((qj) this).field_o & 1 << var9) == 0) {
                            statePc = 108;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackOut_106_0 = 1;
                        stackIn_109_0 = stackOut_106_0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackOut_108_0 = 0;
                        stackIn_109_0 = stackOut_108_0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var10 = stackIn_109_0;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackOut_110_0 = ((qj) this).field_n;
                        stackOut_110_1 = -103;
                        stackOut_110_2 = var2_array[0];
                        stackIn_115_0 = stackOut_110_0;
                        stackIn_115_1 = stackOut_110_1;
                        stackIn_115_2 = stackOut_110_2;
                        stackIn_111_0 = stackOut_110_0;
                        stackIn_111_1 = stackOut_110_1;
                        stackIn_111_2 = stackOut_110_2;
                        if (var8_int != 0) {
                            statePc = 115;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        stackOut_111_0 = stackIn_111_0;
                        stackOut_111_1 = stackIn_111_1;
                        stackOut_111_2 = stackIn_111_2;
                        stackOut_111_3 = var10;
                        stackIn_112_0 = stackOut_111_0;
                        stackIn_112_1 = stackOut_111_1;
                        stackIn_112_2 = stackOut_111_2;
                        stackIn_112_3 = stackOut_111_3;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackOut_112_0 = stackIn_112_0;
                        stackOut_112_1 = stackIn_112_1;
                        stackOut_112_2 = stackIn_112_2;
                        stackIn_117_0 = stackOut_112_0;
                        stackIn_117_1 = stackOut_112_1;
                        stackIn_117_2 = stackOut_112_2;
                        stackIn_113_0 = stackOut_112_0;
                        stackIn_113_1 = stackOut_112_1;
                        stackIn_113_2 = stackOut_112_2;
                        if (stackIn_112_3 == 0) {
                            statePc = 117;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        stackOut_113_0 = stackIn_113_0;
                        stackOut_113_1 = stackIn_113_1;
                        stackOut_113_2 = stackIn_113_2;
                        stackIn_115_0 = stackOut_113_0;
                        stackIn_115_1 = stackOut_113_1;
                        stackIn_115_2 = stackOut_113_2;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackOut_115_0 = stackIn_115_0;
                        stackOut_115_1 = stackIn_115_1;
                        stackOut_115_2 = stackIn_115_2;
                        stackOut_115_3 = 1;
                        stackIn_118_0 = stackOut_115_0;
                        stackIn_118_1 = stackOut_115_1;
                        stackIn_118_2 = stackOut_115_2;
                        stackIn_118_3 = stackOut_115_3;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackOut_117_0 = stackIn_117_0;
                        stackOut_117_1 = stackIn_117_1;
                        stackOut_117_2 = stackIn_117_2;
                        stackOut_117_3 = 0;
                        stackIn_118_0 = stackOut_117_0;
                        stackIn_118_1 = stackOut_117_1;
                        stackIn_118_2 = stackOut_117_2;
                        stackIn_118_3 = stackOut_117_3;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackOut_118_0 = stackIn_118_0;
                        stackOut_118_1 = stackIn_118_1;
                        stackOut_118_2 = stackIn_118_2;
                        stackOut_118_3 = stackIn_118_3;
                        stackOut_118_4 = ((qj) this).field_w.field_l[var9];
                        stackOut_118_5 = var3[0];
                        stackOut_118_6 = var9;
                        stackIn_123_0 = stackOut_118_0;
                        stackIn_123_1 = stackOut_118_1;
                        stackIn_123_2 = stackOut_118_2;
                        stackIn_123_3 = stackOut_118_3;
                        stackIn_123_4 = stackOut_118_4;
                        stackIn_123_5 = stackOut_118_5;
                        stackIn_123_6 = stackOut_118_6;
                        stackIn_119_0 = stackOut_118_0;
                        stackIn_119_1 = stackOut_118_1;
                        stackIn_119_2 = stackOut_118_2;
                        stackIn_119_3 = stackOut_118_3;
                        stackIn_119_4 = stackOut_118_4;
                        stackIn_119_5 = stackOut_118_5;
                        stackIn_119_6 = stackOut_118_6;
                        if (var7 != 0) {
                            statePc = 123;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        stackOut_119_0 = stackIn_119_0;
                        stackOut_119_1 = stackIn_119_1;
                        stackOut_119_2 = stackIn_119_2;
                        stackOut_119_3 = stackIn_119_3;
                        stackOut_119_4 = (j) (Object) stackIn_119_4;
                        stackOut_119_5 = stackIn_119_5;
                        stackOut_119_6 = stackIn_119_6;
                        stackOut_119_7 = var10;
                        stackIn_120_0 = stackOut_119_0;
                        stackIn_120_1 = stackOut_119_1;
                        stackIn_120_2 = stackOut_119_2;
                        stackIn_120_3 = stackOut_119_3;
                        stackIn_120_4 = stackOut_119_4;
                        stackIn_120_5 = stackOut_119_5;
                        stackIn_120_6 = stackOut_119_6;
                        stackIn_120_7 = stackOut_119_7;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        stackOut_120_0 = stackIn_120_0;
                        stackOut_120_1 = stackIn_120_1;
                        stackOut_120_2 = stackIn_120_2;
                        stackOut_120_3 = stackIn_120_3;
                        stackOut_120_4 = (j) (Object) stackIn_120_4;
                        stackOut_120_5 = stackIn_120_5;
                        stackOut_120_6 = stackIn_120_6;
                        stackIn_125_0 = stackOut_120_0;
                        stackIn_125_1 = stackOut_120_1;
                        stackIn_125_2 = stackOut_120_2;
                        stackIn_125_3 = stackOut_120_3;
                        stackIn_125_4 = stackOut_120_4;
                        stackIn_125_5 = stackOut_120_5;
                        stackIn_125_6 = stackOut_120_6;
                        stackIn_121_0 = stackOut_120_0;
                        stackIn_121_1 = stackOut_120_1;
                        stackIn_121_2 = stackOut_120_2;
                        stackIn_121_3 = stackOut_120_3;
                        stackIn_121_4 = stackOut_120_4;
                        stackIn_121_5 = stackOut_120_5;
                        stackIn_121_6 = stackOut_120_6;
                        if (stackIn_120_7 == 0) {
                            statePc = 125;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        stackOut_121_0 = stackIn_121_0;
                        stackOut_121_1 = stackIn_121_1;
                        stackOut_121_2 = stackIn_121_2;
                        stackOut_121_3 = stackIn_121_3;
                        stackOut_121_4 = (j) (Object) stackIn_121_4;
                        stackOut_121_5 = stackIn_121_5;
                        stackOut_121_6 = stackIn_121_6;
                        stackIn_123_0 = stackOut_121_0;
                        stackIn_123_1 = stackOut_121_1;
                        stackIn_123_2 = stackOut_121_2;
                        stackIn_123_3 = stackOut_121_3;
                        stackIn_123_4 = stackOut_121_4;
                        stackIn_123_5 = stackOut_121_5;
                        stackIn_123_6 = stackOut_121_6;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = stackIn_123_0;
                        stackOut_123_1 = stackIn_123_1;
                        stackOut_123_2 = stackIn_123_2;
                        stackOut_123_3 = stackIn_123_3;
                        stackOut_123_4 = (j) (Object) stackIn_123_4;
                        stackOut_123_5 = stackIn_123_5;
                        stackOut_123_6 = stackIn_123_6;
                        stackOut_123_7 = 1;
                        stackIn_126_0 = stackOut_123_0;
                        stackIn_126_1 = stackOut_123_1;
                        stackIn_126_2 = stackOut_123_2;
                        stackIn_126_3 = stackOut_123_3;
                        stackIn_126_4 = stackOut_123_4;
                        stackIn_126_5 = stackOut_123_5;
                        stackIn_126_6 = stackOut_123_6;
                        stackIn_126_7 = stackOut_123_7;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        stackOut_125_0 = stackIn_125_0;
                        stackOut_125_1 = stackIn_125_1;
                        stackOut_125_2 = stackIn_125_2;
                        stackOut_125_3 = stackIn_125_3;
                        stackOut_125_4 = (j) (Object) stackIn_125_4;
                        stackOut_125_5 = stackIn_125_5;
                        stackOut_125_6 = stackIn_125_6;
                        stackOut_125_7 = 0;
                        stackIn_126_0 = stackOut_125_0;
                        stackIn_126_1 = stackOut_125_1;
                        stackIn_126_2 = stackOut_125_2;
                        stackIn_126_3 = stackOut_125_3;
                        stackIn_126_4 = stackOut_125_4;
                        stackIn_126_5 = stackOut_125_5;
                        stackIn_126_6 = stackOut_125_6;
                        stackIn_126_7 = stackOut_125_7;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        om.a(stackIn_126_0, (byte) stackIn_126_1, stackIn_126_2, stackIn_126_3 != 0, (j) (Object) stackIn_126_4, stackIn_126_5, stackIn_126_6, stackIn_126_7 != 0, ((qj) this).field_w);
                        var9 = 1 + -var9;
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (0 == (1 << var9 & ((qj) this).field_o)) {
                            statePc = 130;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        stackOut_128_0 = 1;
                        stackIn_131_0 = stackOut_128_0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        stackOut_130_0 = 0;
                        stackIn_131_0 = stackOut_130_0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var10 = stackIn_131_0;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackOut_132_0 = ((qj) this).field_n;
                        stackOut_132_1 = -103;
                        stackOut_132_2 = var2_array[1];
                        stackIn_137_0 = stackOut_132_0;
                        stackIn_137_1 = stackOut_132_1;
                        stackIn_137_2 = stackOut_132_2;
                        stackIn_133_0 = stackOut_132_0;
                        stackIn_133_1 = stackOut_132_1;
                        stackIn_133_2 = stackOut_132_2;
                        if (var8_int != 0) {
                            statePc = 137;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        stackOut_133_0 = stackIn_133_0;
                        stackOut_133_1 = stackIn_133_1;
                        stackOut_133_2 = stackIn_133_2;
                        stackOut_133_3 = var10;
                        stackIn_134_0 = stackOut_133_0;
                        stackIn_134_1 = stackOut_133_1;
                        stackIn_134_2 = stackOut_133_2;
                        stackIn_134_3 = stackOut_133_3;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        stackOut_134_0 = stackIn_134_0;
                        stackOut_134_1 = stackIn_134_1;
                        stackOut_134_2 = stackIn_134_2;
                        stackIn_139_0 = stackOut_134_0;
                        stackIn_139_1 = stackOut_134_1;
                        stackIn_139_2 = stackOut_134_2;
                        stackIn_135_0 = stackOut_134_0;
                        stackIn_135_1 = stackOut_134_1;
                        stackIn_135_2 = stackOut_134_2;
                        if (stackIn_134_3 == 0) {
                            statePc = 139;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        stackOut_135_0 = stackIn_135_0;
                        stackOut_135_1 = stackIn_135_1;
                        stackOut_135_2 = stackIn_135_2;
                        stackIn_137_0 = stackOut_135_0;
                        stackIn_137_1 = stackOut_135_1;
                        stackIn_137_2 = stackOut_135_2;
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        stackOut_137_0 = stackIn_137_0;
                        stackOut_137_1 = stackIn_137_1;
                        stackOut_137_2 = stackIn_137_2;
                        stackOut_137_3 = 1;
                        stackIn_140_0 = stackOut_137_0;
                        stackIn_140_1 = stackOut_137_1;
                        stackIn_140_2 = stackOut_137_2;
                        stackIn_140_3 = stackOut_137_3;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        stackOut_139_0 = stackIn_139_0;
                        stackOut_139_1 = stackIn_139_1;
                        stackOut_139_2 = stackIn_139_2;
                        stackOut_139_3 = 0;
                        stackIn_140_0 = stackOut_139_0;
                        stackIn_140_1 = stackOut_139_1;
                        stackIn_140_2 = stackOut_139_2;
                        stackIn_140_3 = stackOut_139_3;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        stackOut_140_0 = stackIn_140_0;
                        stackOut_140_1 = stackIn_140_1;
                        stackOut_140_2 = stackIn_140_2;
                        stackOut_140_3 = stackIn_140_3;
                        stackOut_140_4 = ((qj) this).field_w.field_l[var9];
                        stackOut_140_5 = var3[1];
                        stackOut_140_6 = var9;
                        stackIn_145_0 = stackOut_140_0;
                        stackIn_145_1 = stackOut_140_1;
                        stackIn_145_2 = stackOut_140_2;
                        stackIn_145_3 = stackOut_140_3;
                        stackIn_145_4 = stackOut_140_4;
                        stackIn_145_5 = stackOut_140_5;
                        stackIn_145_6 = stackOut_140_6;
                        stackIn_141_0 = stackOut_140_0;
                        stackIn_141_1 = stackOut_140_1;
                        stackIn_141_2 = stackOut_140_2;
                        stackIn_141_3 = stackOut_140_3;
                        stackIn_141_4 = stackOut_140_4;
                        stackIn_141_5 = stackOut_140_5;
                        stackIn_141_6 = stackOut_140_6;
                        if (var7 != 0) {
                            statePc = 145;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        stackOut_141_0 = stackIn_141_0;
                        stackOut_141_1 = stackIn_141_1;
                        stackOut_141_2 = stackIn_141_2;
                        stackOut_141_3 = stackIn_141_3;
                        stackOut_141_4 = (j) (Object) stackIn_141_4;
                        stackOut_141_5 = stackIn_141_5;
                        stackOut_141_6 = stackIn_141_6;
                        stackOut_141_7 = var10;
                        stackIn_142_0 = stackOut_141_0;
                        stackIn_142_1 = stackOut_141_1;
                        stackIn_142_2 = stackOut_141_2;
                        stackIn_142_3 = stackOut_141_3;
                        stackIn_142_4 = stackOut_141_4;
                        stackIn_142_5 = stackOut_141_5;
                        stackIn_142_6 = stackOut_141_6;
                        stackIn_142_7 = stackOut_141_7;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        stackOut_142_0 = stackIn_142_0;
                        stackOut_142_1 = stackIn_142_1;
                        stackOut_142_2 = stackIn_142_2;
                        stackOut_142_3 = stackIn_142_3;
                        stackOut_142_4 = (j) (Object) stackIn_142_4;
                        stackOut_142_5 = stackIn_142_5;
                        stackOut_142_6 = stackIn_142_6;
                        stackIn_147_0 = stackOut_142_0;
                        stackIn_147_1 = stackOut_142_1;
                        stackIn_147_2 = stackOut_142_2;
                        stackIn_147_3 = stackOut_142_3;
                        stackIn_147_4 = stackOut_142_4;
                        stackIn_147_5 = stackOut_142_5;
                        stackIn_147_6 = stackOut_142_6;
                        stackIn_143_0 = stackOut_142_0;
                        stackIn_143_1 = stackOut_142_1;
                        stackIn_143_2 = stackOut_142_2;
                        stackIn_143_3 = stackOut_142_3;
                        stackIn_143_4 = stackOut_142_4;
                        stackIn_143_5 = stackOut_142_5;
                        stackIn_143_6 = stackOut_142_6;
                        if (stackIn_142_7 == 0) {
                            statePc = 147;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        stackOut_143_0 = stackIn_143_0;
                        stackOut_143_1 = stackIn_143_1;
                        stackOut_143_2 = stackIn_143_2;
                        stackOut_143_3 = stackIn_143_3;
                        stackOut_143_4 = (j) (Object) stackIn_143_4;
                        stackOut_143_5 = stackIn_143_5;
                        stackOut_143_6 = stackIn_143_6;
                        stackIn_145_0 = stackOut_143_0;
                        stackIn_145_1 = stackOut_143_1;
                        stackIn_145_2 = stackOut_143_2;
                        stackIn_145_3 = stackOut_143_3;
                        stackIn_145_4 = stackOut_143_4;
                        stackIn_145_5 = stackOut_143_5;
                        stackIn_145_6 = stackOut_143_6;
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        stackOut_145_0 = stackIn_145_0;
                        stackOut_145_1 = stackIn_145_1;
                        stackOut_145_2 = stackIn_145_2;
                        stackOut_145_3 = stackIn_145_3;
                        stackOut_145_4 = (j) (Object) stackIn_145_4;
                        stackOut_145_5 = stackIn_145_5;
                        stackOut_145_6 = stackIn_145_6;
                        stackOut_145_7 = 1;
                        stackIn_148_0 = stackOut_145_0;
                        stackIn_148_1 = stackOut_145_1;
                        stackIn_148_2 = stackOut_145_2;
                        stackIn_148_3 = stackOut_145_3;
                        stackIn_148_4 = stackOut_145_4;
                        stackIn_148_5 = stackOut_145_5;
                        stackIn_148_6 = stackOut_145_6;
                        stackIn_148_7 = stackOut_145_7;
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        stackOut_147_0 = stackIn_147_0;
                        stackOut_147_1 = stackIn_147_1;
                        stackOut_147_2 = stackIn_147_2;
                        stackOut_147_3 = stackIn_147_3;
                        stackOut_147_4 = (j) (Object) stackIn_147_4;
                        stackOut_147_5 = stackIn_147_5;
                        stackOut_147_6 = stackIn_147_6;
                        stackOut_147_7 = 0;
                        stackIn_148_0 = stackOut_147_0;
                        stackIn_148_1 = stackOut_147_1;
                        stackIn_148_2 = stackOut_147_2;
                        stackIn_148_3 = stackOut_147_3;
                        stackIn_148_4 = stackOut_147_4;
                        stackIn_148_5 = stackOut_147_5;
                        stackIn_148_6 = stackOut_147_6;
                        stackIn_148_7 = stackOut_147_7;
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        om.a(stackIn_148_0, (byte) stackIn_148_1, stackIn_148_2, stackIn_148_3 != 0, (j) (Object) stackIn_148_4, stackIn_148_5, stackIn_148_6, stackIn_148_7 != 0, ((qj) this).field_w);
                        if (var11 == 0) {
                            statePc = 164;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        var3 = kh.field_e[4];
                        var2_array = kh.field_c[4];
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        nh.a(169, 482, -40, -1, cd.field_h, -1);
                        nh.a(169, 482, -40, 472, cd.field_h, -1);
                        if (-1 == (((qj) this).field_o & 1 << ((qj) this).field_m ^ -1)) {
                            statePc = 153;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        stackOut_151_0 = 1;
                        stackIn_154_0 = stackOut_151_0;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        stackOut_153_0 = 0;
                        stackIn_154_0 = stackOut_153_0;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        var7 = stackIn_154_0;
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        stackOut_155_0 = ((qj) this).field_n;
                        stackOut_155_1 = -103;
                        stackOut_155_2 = var2_array[0];
                        stackIn_160_0 = stackOut_155_0;
                        stackIn_160_1 = stackOut_155_1;
                        stackIn_160_2 = stackOut_155_2;
                        stackIn_156_0 = stackOut_155_0;
                        stackIn_156_1 = stackOut_155_1;
                        stackIn_156_2 = stackOut_155_2;
                        if (var7 != 0) {
                            statePc = 160;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        stackOut_156_0 = stackIn_156_0;
                        stackOut_156_1 = stackIn_156_1;
                        stackOut_156_2 = stackIn_156_2;
                        stackOut_156_3 = 0;
                        stackIn_157_0 = stackOut_156_0;
                        stackIn_157_1 = stackOut_156_1;
                        stackIn_157_2 = stackOut_156_2;
                        stackIn_157_3 = stackOut_156_3;
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        stackOut_157_0 = stackIn_157_0;
                        stackOut_157_1 = stackIn_157_1;
                        stackOut_157_2 = stackIn_157_2;
                        stackIn_162_0 = stackOut_157_0;
                        stackIn_162_1 = stackOut_157_1;
                        stackIn_162_2 = stackOut_157_2;
                        stackIn_158_0 = stackOut_157_0;
                        stackIn_158_1 = stackOut_157_1;
                        stackIn_158_2 = stackOut_157_2;
                        if (stackIn_157_3 != ((qj) this).field_o) {
                            statePc = 162;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        stackOut_158_0 = stackIn_158_0;
                        stackOut_158_1 = stackIn_158_1;
                        stackOut_158_2 = stackIn_158_2;
                        stackIn_160_0 = stackOut_158_0;
                        stackIn_160_1 = stackOut_158_1;
                        stackIn_160_2 = stackOut_158_2;
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        stackOut_160_0 = stackIn_160_0;
                        stackOut_160_1 = stackIn_160_1;
                        stackOut_160_2 = stackIn_160_2;
                        stackOut_160_3 = 1;
                        stackIn_163_0 = stackOut_160_0;
                        stackIn_163_1 = stackOut_160_1;
                        stackIn_163_2 = stackOut_160_2;
                        stackIn_163_3 = stackOut_160_3;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        stackOut_162_0 = stackIn_162_0;
                        stackOut_162_1 = stackIn_162_1;
                        stackOut_162_2 = stackIn_162_2;
                        stackOut_162_3 = 0;
                        stackIn_163_0 = stackOut_162_0;
                        stackIn_163_1 = stackOut_162_1;
                        stackIn_163_2 = stackOut_162_2;
                        stackIn_163_3 = stackOut_162_3;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        om.a(stackIn_163_0, (byte) stackIn_163_1, stackIn_163_2, stackIn_163_3 != 0, ((qj) this).field_w.field_l[((qj) this).field_m], var3[0], ((qj) this).field_m, var7 != 0, ((qj) this).field_w);
                        nh.a(169, 9, -40, -1, cd.field_h, 0 + (var3[2] + -3));
                        nh.a(169, 9, -40, 472, cd.field_h, -3 + var3[2] - 0);
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (-2 > (((qj) this).field_w.field_k ^ -1)) {
                            statePc = 167;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if (((((qj) this).field_w.field_g | ((qj) this).field_w.field_i) & 1 << ((qj) this).field_m) != 0) {
                            statePc = 171;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        v.a(var2_array[0], 424, false, ((qj) this).field_w, ((qj) this).field_m, var3[0]);
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (-3 != (((qj) this).field_w.field_k ^ -1)) {
                            statePc = 178;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        if (0 != (1 << 1 + -((qj) this).field_m & (((qj) this).field_w.field_g | ((qj) this).field_w.field_i))) {
                            statePc = 178;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        v.a(var2_array[1], 424, false, ((qj) this).field_w, 1 + -((qj) this).field_m, var3[1]);
                        statePc = 176;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        var3 = kh.field_e[((qj) this).field_w.field_k + -1];
                        var6 = ((qj) this).field_m;
                        var2_array = kh.field_c[((qj) this).field_w.field_k - 1];
                        var7 = 0;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if ((((qj) this).field_w.field_k ^ -1) >= (var7 ^ -1)) {
                            statePc = 191;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if (var11 != 0) {
                            statePc = 191;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        stackOut_181_0 = (int[]) var5;
                        stackIn_182_0 = stackOut_181_0;
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        if (stackIn_182_0[var7] == 2) {
                            statePc = 187;
                        } else {
                            statePc = 183;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 186;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        var8_ref = ul.field_k[((qj) this).field_w.field_l[var6].field_H];
                        var9 = ob.field_D.field_F - -ob.field_D.field_P;
                        lb.d(var2_array[var7], 235 - -var3[var7] + -23, 153, var9, 0, 141);
                        var8_ref.c(-var8_ref.field_x + (153 + var2_array[var7]), 0 + (-var8_ref.field_z + var3[var7]) + 233);
                        ce.field_e.c(((qj) this).field_w.field_f[var6], var2_array[var7] + 4, 2 + var3[var7] + 223, 2, -1);
                        statePc = 188;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        var6++;
                        var6 = var6 % ((qj) this).field_w.field_k;
                        var7++;
                        if (var11 == 0) {
                            statePc = 179;
                        } else {
                            statePc = 191;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 190;
                        continue stateLoop;
                    }
                }
                case 190: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var2, "qj.DA(" + param0 + 41);
                }
                case 191: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    qj(String[] param0, int param1, int param2, oi param3, int[] param4, int[] param5) {
        this(false, false, param0, param1, param2, param3, param4, param5);
    }

    final void f(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!((qj) this).field_p) {
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
                        throw new IllegalStateException();
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        k.field_h.e(-13413, 67);
                        var2_int = 68 % ((param0 - -65) / 59);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var2, "qj.O(" + param0 + 41);
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    qj(boolean param0, boolean param1, String[] param2, int param3, int param4, oi param5, int[] param6, int[] param7) {
        super(-1);
        RuntimeException var9 = null;
        int[] var9_array = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        Object stackOut_1_0;
        Object stackOut_2_0;
        int stackOut_2_1;
        Object stackOut_3_0;
        int stackOut_3_1;
        int stackOut_13_0;
        int stackOut_13_1;
        Object stackOut_20_0;
        Object stackOut_21_0;
        int stackOut_21_1;
        Object stackOut_22_0;
        Object stackOut_23_0;
        Object stackOut_25_0;
        int stackOut_25_1;
        Object stackOut_27_0;
        int stackOut_27_1;
        Object stackOut_28_0;
        int stackOut_28_1;
        int stackOut_33_0;
        int stackOut_33_1;
        RuntimeException stackOut_41_0;
        StringBuilder stackOut_41_1;
        RuntimeException stackOut_42_0;
        StringBuilder stackOut_42_1;
        String stackOut_42_2;
        RuntimeException stackOut_44_0;
        StringBuilder stackOut_44_1;
        String stackOut_44_2;
        RuntimeException stackOut_45_0;
        StringBuilder stackOut_45_1;
        RuntimeException stackOut_46_0;
        StringBuilder stackOut_46_1;
        String stackOut_46_2;
        RuntimeException stackOut_48_0;
        StringBuilder stackOut_48_1;
        String stackOut_48_2;
        RuntimeException stackOut_49_0;
        StringBuilder stackOut_49_1;
        RuntimeException stackOut_50_0;
        StringBuilder stackOut_50_1;
        String stackOut_50_2;
        RuntimeException stackOut_52_0;
        StringBuilder stackOut_52_1;
        String stackOut_52_2;
        RuntimeException stackOut_53_0;
        StringBuilder stackOut_53_1;
        RuntimeException stackOut_54_0;
        StringBuilder stackOut_54_1;
        String stackOut_54_2;
        RuntimeException stackOut_56_0;
        StringBuilder stackOut_56_1;
        String stackOut_56_2;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = BrickABrac.field_J ? 1 : 0;
                    ((qj) this).field_x = 0;
                    ((qj) this).field_s = false;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((qj) this).field_n = param1;
                        ((qj) this).field_p = param0;
                        ((qj) this).field_o = param4;
                        ((qj) this).field_k = param3;
                        stackOut_1_0 = this;
                        stackIn_3_0 = stackOut_1_0;
                        stackIn_2_0 = stackOut_1_0;
                        if (kb.field_Yb < 2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = this;
                        stackOut_2_1 = 1;
                        stackIn_4_0 = stackOut_2_0;
                        stackIn_4_1 = stackOut_2_1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = this;
                        stackOut_3_1 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((qj) this).field_y = stackIn_4_1 != 0;
                        var9_array = pl.field_b;
                        var10 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (8 <= var10) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9_array[var10] = 0;
                        var10++;
                        if (var11 != 0) {
                            statePc = 11;
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
                        if (var11 == 0) {
                            statePc = 5;
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
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((qj) this).field_w = new ak(param2, ((qj) this).field_o, param5, param6, param7);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9_int = 0;
                        var10 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((qj) this).field_w.field_k <= var10) {
                            statePc = 20;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = ((qj) this).field_o & 1 << var10 ^ -1;
                        stackOut_13_1 = -1;
                        stackIn_34_0 = stackOut_13_0;
                        stackIn_34_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (var11 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 != stackIn_14_1) {
                            statePc = 18;
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9_int++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var10++;
                        if (var11 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = this;
                        stackIn_28_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (-3 == (var9_int ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = this;
                        stackOut_21_1 = -1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
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
                        stackOut_22_0 = this;
                        stackIn_27_0 = stackOut_22_0;
                        stackIn_23_0 = stackOut_22_0;
                        if (stackIn_22_1 < (((qj) this).field_k ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = this;
                        stackIn_25_0 = stackOut_23_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = this;
                        stackOut_25_1 = ((qj) this).field_k;
                        stackIn_29_0 = stackOut_25_0;
                        stackIn_29_1 = stackOut_25_1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = this;
                        stackOut_27_1 = 0;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = this;
                        stackOut_28_1 = 1;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((qj) this).field_m = stackIn_29_1;
                        if (oo.field_w != null) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        oo.field_w = new fo(new int[1]);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        km.field_i = 0;
                        to.field_k = kl.a(ta.field_e[2], 256, 0);
                        me.field_d = kl.a(ta.field_e[2], 256, 0);
                        to.field_k.f(-1);
                        me.field_d.f(-1);
                        l discarded$2 = sk.a((byte) 125, to.field_k);
                        l discarded$3 = sk.a((byte) 5, me.field_d);
                        tn.field_C = 1;
                        stackOut_33_0 = tn.field_C;
                        stackOut_33_1 = -28463;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        gr.b(stackIn_34_0, stackIn_34_1);
                        pg.field_m = -1;
                        dj.field_b = -1;
                        if (jo.field_j == null) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        jo.field_j = rd.a(cm.field_p, new String[1], (byte) 103).toLowerCase();
                        ff.field_j = pn.field_j.toLowerCase();
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        be.field_j = 0;
                        op.field_a = false;
                        fl.field_l = ue.a(false);
                        gq.field_Yb = param5.field_b.field_h;
                        tk.field_q = param5.a(96);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    var9 = (RuntimeException) (Object) caughtException;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    try {
                        stackOut_41_0 = (RuntimeException) var9;
                        stackOut_41_1 = new StringBuilder().append("qj.<init>(").append(param0).append(44).append(param1).append(44);
                        stackIn_44_0 = stackOut_41_0;
                        stackIn_44_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (param2 == null) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                        stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                        stackOut_42_2 = "{...}";
                        stackIn_45_0 = stackOut_42_0;
                        stackIn_45_1 = stackOut_42_1;
                        stackIn_45_2 = stackOut_42_2;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 44: {
                    stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                    stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
                    stackOut_44_2 = "null";
                    stackIn_45_0 = stackOut_44_0;
                    stackIn_45_1 = stackOut_44_1;
                    stackIn_45_2 = stackOut_44_2;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    try {
                        stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                        stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(44).append(param3).append(44).append(param4).append(44);
                        stackIn_48_0 = stackOut_45_0;
                        stackIn_48_1 = stackOut_45_1;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        if (param5 == null) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                        stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                        stackOut_46_2 = "{...}";
                        stackIn_49_0 = stackOut_46_0;
                        stackIn_49_1 = stackOut_46_1;
                        stackIn_49_2 = stackOut_46_2;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 48: {
                    stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                    stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                    stackOut_48_2 = "null";
                    stackIn_49_0 = stackOut_48_0;
                    stackIn_49_1 = stackOut_48_1;
                    stackIn_49_2 = stackOut_48_2;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    try {
                        stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                        stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(44);
                        stackIn_52_0 = stackOut_49_0;
                        stackIn_52_1 = stackOut_49_1;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        if (param6 == null) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                        stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                        stackOut_50_2 = "{...}";
                        stackIn_53_0 = stackOut_50_0;
                        stackIn_53_1 = stackOut_50_1;
                        stackIn_53_2 = stackOut_50_2;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 52: {
                    stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                    stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                    stackOut_52_2 = "null";
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    stackIn_53_2 = stackOut_52_2;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    try {
                        stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                        stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(44);
                        stackIn_56_0 = stackOut_53_0;
                        stackIn_56_1 = stackOut_53_1;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        if (param7 == null) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
                        stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
                        stackOut_54_2 = "{...}";
                        stackIn_57_0 = stackOut_54_0;
                        stackIn_57_1 = stackOut_54_1;
                        stackIn_57_2 = stackOut_54_2;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 56: {
                    stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
                    stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
                    stackOut_56_2 = "null";
                    stackIn_57_0 = stackOut_56_0;
                    stackIn_57_1 = stackOut_56_1;
                    stackIn_57_2 = stackOut_56_2;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    throw qb.a((Throwable) (Object) stackIn_57_0, (String) (Object) (stackIn_57_2 + 41));
                }
                case 58: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
