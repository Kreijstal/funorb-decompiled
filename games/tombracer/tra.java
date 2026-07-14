/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tra extends rj {
    private long field_H;
    static String field_A;
    private int field_I;
    private int field_F;
    private boolean field_E;
    private long field_G;
    private int field_B;
    private boolean field_D;
    static String[] field_z;
    private int field_C;

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        oaa var5_ref = null;
        long var6 = 0L;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((tra) this).field_I = 26;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((tra) this).field_r == null) {
                            statePc = 24;
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
                        stackOut_5_0 = param3;
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
                        if (stackIn_6_0 == 0) {
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
                        statePc = 24;
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
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((tra) this).field_r.a((ae) this, param0, param2 ^ 16777215, param1, ((tra) this).field_y);
                        if (!(((tra) this).field_r instanceof oaa)) {
                            statePc = 24;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_ref = (oaa) (Object) ((tra) this).field_r;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (((tra) this).field_B == ((tra) this).field_I) {
                            statePc = 17;
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
                        var5_ref.a(-1, (ae) this, param1, param0, ((tra) this).field_B, ((tra) this).field_I);
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
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var6 = bva.b((byte) -107);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-501L >= ((-((tra) this).field_H + var6) % 1000L ^ -1L)) {
                            statePc = 24;
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
                        var5_ref.a(((tra) this).field_I, param1, param2 + -22502, param0, (ae) this);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var5, "tra.T(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        Object stackIn_23_0 = null;
        int stackIn_37_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_95_0 = 0;
        Object stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        Object stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        Object stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        int stackIn_104_0 = 0;
        Object stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        Object stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_113_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_123_0 = 0;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        String stackIn_129_2 = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        Object stackOut_22_0 = null;
        int stackOut_36_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_94_0 = 0;
        Object stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        Object stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        int stackOut_100_2 = 0;
        Object stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        int stackOut_103_0 = 0;
        Object stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        Object stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        Object stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_112_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_122_0 = 0;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((tra) this).field_H = bva.b((byte) -107);
                        if (param0 == 60) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (-63 != (param0 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 124;
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
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        if (param3) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((tra) this).field_F = 110;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((param0 ^ -1) > -33) {
                            statePc = 38;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = -127;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 > (param0 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((tra) this).field_I == ((tra) this).field_B) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.k(0);
                        statePc = 19;
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
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (-1 == ((tra) this).field_C) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = this;
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
                        if ((((tra) this).field_o.length() ^ -1) > (((tra) this).field_C ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 36;
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
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((((tra) this).field_I ^ -1) <= (((tra) this).field_o.length() ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((tra) this).field_o = ((tra) this).field_o.substring(0, ((tra) this).field_I) + param0 + ((tra) this).field_o.substring(((tra) this).field_I, ((tra) this).field_o.length());
                        ((tra) this).field_I = ((tra) this).field_I + 1;
                        ((tra) this).field_B = ((tra) this).field_I;
                        if (!TombRacer.field_G) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ((tra) this).field_o = ((tra) this).field_o + param0;
                        ((tra) this).field_I = ((tra) this).field_o.length();
                        ((tra) this).field_B = ((tra) this).field_o.length();
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
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ((tra) this).i(200);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = 1;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return stackIn_37_0 != 0;
                }
                case 38: {
                    try {
                        if ((param2 ^ -1) != -86) {
                            statePc = 49;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (((tra) this).field_B == ((tra) this).field_I) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        this.k(0);
                        stackOut_42_0 = 1;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return stackIn_43_0 != 0;
                }
                case 44: {
                    try {
                        if (-1 > (((tra) this).field_I ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ((tra) this).field_B = -1 + ((tra) this).field_I;
                        this.k(0);
                        stackOut_47_0 = 1;
                        stackIn_48_0 = stackOut_47_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 48: {
                    return stackIn_48_0 != 0;
                }
                case 49: {
                    try {
                        if ((param2 ^ -1) == -102) {
                            statePc = 116;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (param2 == 13) {
                            statePc = 114;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if ((param2 ^ -1) == -97) {
                            statePc = 105;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (97 == param2) {
                            statePc = 96;
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
                        if ((param2 ^ -1) != -103) {
                            statePc = 64;
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
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.a(-127, 0);
                        stackOut_62_0 = 1;
                        stackIn_63_0 = stackOut_62_0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 63: {
                    return stackIn_63_0 != 0;
                }
                case 64: {
                    try {
                        if (param2 != 103) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        this.a(-123, ((tra) this).field_o.length());
                        stackOut_65_0 = 1;
                        stackIn_66_0 = stackOut_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 66: {
                    return stackIn_66_0 != 0;
                }
                case 67: {
                    try {
                        if ((param2 ^ -1) == -85) {
                            statePc = 94;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (!oj.field_tb[82]) {
                            statePc = 75;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = param2;
                        stackIn_72_0 = stackOut_71_0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (stackIn_72_0 == 65) {
                            statePc = 92;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (!oj.field_tb[82]) {
                            statePc = 83;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (-67 != (param2 ^ -1)) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        this.e(0);
                        stackOut_81_0 = 1;
                        stackIn_82_0 = stackOut_81_0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 82: {
                    return stackIn_82_0 != 0;
                }
                case 83: {
                    try {
                        if (!oj.field_tb[82]) {
                            statePc = 122;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackOut_84_0 = param2;
                        stackIn_85_0 = stackOut_84_0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if ((stackIn_85_0 ^ -1) == -68) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        this.d(31);
                        stackOut_90_0 = 1;
                        stackIn_91_0 = stackOut_90_0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 91: {
                    return stackIn_91_0 != 0;
                }
                case 92: {
                    try {
                        this.l(10571);
                        stackOut_92_0 = 1;
                        stackIn_93_0 = stackOut_92_0;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 93: {
                    return stackIn_93_0 != 0;
                }
                case 94: {
                    try {
                        this.c(93);
                        stackOut_94_0 = 1;
                        stackIn_95_0 = stackOut_94_0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 95: {
                    return stackIn_95_0 != 0;
                }
                case 96: {
                    try {
                        if ((((tra) this).field_I ^ -1) > (((tra) this).field_o.length() ^ -1)) {
                            statePc = 99;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackOut_99_0 = this;
                        stackOut_99_1 = -126;
                        stackIn_102_0 = stackOut_99_0;
                        stackIn_102_1 = stackOut_99_1;
                        stackIn_100_0 = stackOut_99_0;
                        stackIn_100_1 = stackOut_99_1;
                        if (oj.field_tb[82]) {
                            statePc = 102;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackOut_100_0 = this;
                        stackOut_100_1 = stackIn_100_1;
                        stackOut_100_2 = ((tra) this).field_I + 1;
                        stackIn_103_0 = stackOut_100_0;
                        stackIn_103_1 = stackOut_100_1;
                        stackIn_103_2 = stackOut_100_2;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackOut_102_0 = this;
                        stackOut_102_1 = stackIn_102_1;
                        stackOut_102_2 = this.b(-59);
                        stackIn_103_0 = stackOut_102_0;
                        stackIn_103_1 = stackOut_102_1;
                        stackIn_103_2 = stackOut_102_2;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        this.a(stackIn_103_1, stackIn_103_2);
                        stackOut_103_0 = 1;
                        stackIn_104_0 = stackOut_103_0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 104: {
                    return stackIn_104_0 != 0;
                }
                case 105: {
                    try {
                        if (0 < ((tra) this).field_I) {
                            statePc = 108;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackOut_108_0 = this;
                        stackOut_108_1 = 95;
                        stackIn_111_0 = stackOut_108_0;
                        stackIn_111_1 = stackOut_108_1;
                        stackIn_109_0 = stackOut_108_0;
                        stackIn_109_1 = stackOut_108_1;
                        if (!oj.field_tb[82]) {
                            statePc = 111;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        stackOut_109_0 = this;
                        stackOut_109_1 = stackIn_109_1;
                        stackOut_109_2 = this.b(param3);
                        stackIn_112_0 = stackOut_109_0;
                        stackIn_112_1 = stackOut_109_1;
                        stackIn_112_2 = stackOut_109_2;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        stackOut_111_0 = this;
                        stackOut_111_1 = stackIn_111_1;
                        stackOut_111_2 = -1 + ((tra) this).field_I;
                        stackIn_112_0 = stackOut_111_0;
                        stackIn_112_1 = stackOut_111_1;
                        stackIn_112_2 = stackOut_111_2;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        this.a(stackIn_112_1, stackIn_112_2);
                        stackOut_112_0 = 1;
                        stackIn_113_0 = stackOut_112_0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 113: {
                    return stackIn_113_0 != 0;
                }
                case 114: {
                    try {
                        ((tra) this).f(23);
                        stackOut_114_0 = 1;
                        stackIn_115_0 = stackOut_114_0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 115: {
                    return stackIn_115_0 != 0;
                }
                case 116: {
                    try {
                        if (((tra) this).field_B == ((tra) this).field_I) {
                            statePc = 119;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        this.k(0);
                        stackOut_117_0 = 1;
                        stackIn_118_0 = stackOut_117_0;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 118: {
                    return stackIn_118_0 != 0;
                }
                case 119: {
                    try {
                        if ((((tra) this).field_I ^ -1) <= (((tra) this).field_o.length() ^ -1)) {
                            statePc = 122;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        ((tra) this).field_B = 1 + ((tra) this).field_I;
                        this.k(0);
                        stackOut_120_0 = 1;
                        stackIn_121_0 = stackOut_120_0;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 121: {
                    return stackIn_121_0 != 0;
                }
                case 122: {
                    try {
                        stackOut_122_0 = 0;
                        stackIn_123_0 = stackOut_122_0;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 123: {
                    return stackIn_123_0 != 0;
                }
                case 124: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    try {
                        stackOut_125_0 = (RuntimeException) var5;
                        stackOut_125_1 = new StringBuilder().append("tra.P(").append(param0).append(44);
                        stackIn_128_0 = stackOut_125_0;
                        stackIn_128_1 = stackOut_125_1;
                        stackIn_126_0 = stackOut_125_0;
                        stackIn_126_1 = stackOut_125_1;
                        if (param1 == null) {
                            statePc = 128;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
                        stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
                        stackOut_126_2 = "{...}";
                        stackIn_129_0 = stackOut_126_0;
                        stackIn_129_1 = stackOut_126_1;
                        stackIn_129_2 = stackOut_126_2;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 127: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 128: {
                    stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
                    stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
                    stackOut_128_2 = "null";
                    stackIn_129_0 = stackOut_128_0;
                    stackIn_129_1 = stackOut_128_1;
                    stackIn_129_2 = stackOut_128_2;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    throw tba.a((Throwable) (Object) stackIn_129_0, stackIn_129_2 + 44 + param2 + 44 + param3 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, nh[] param1, byte param2, int param3, ha param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        ssa var10_ref = null;
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
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_103_0 = 0;
        nh[] stackIn_107_0 = null;
        int stackIn_115_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_126_0 = 0;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        String stackIn_136_2 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        RuntimeException stackIn_139_0 = null;
        StringBuilder stackIn_139_1 = null;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        String stackIn_140_2 = null;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_102_0 = 0;
        nh[] stackOut_106_0 = null;
        int stackOut_114_0 = 0;
        int stackOut_117_0 = 0;
        byte stackOut_125_0 = 0;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        String stackOut_133_2 = null;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        String stackOut_135_2 = null;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        String stackOut_137_2 = null;
        RuntimeException stackOut_139_0 = null;
        StringBuilder stackOut_139_1 = null;
        String stackOut_139_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10_ref = uja.a((byte) 65, param4);
                        if (param1 != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if ((param5 ^ -1) >= -1) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = -1;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 <= (param7 ^ -1)) {
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
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
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        if (param1[3] == null) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = param1[3].d();
                        stackIn_15_0 = stackOut_12_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var11 = stackIn_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null == param1[5]) {
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
                        stackOut_17_0 = param1[5].d();
                        stackIn_20_0 = stackOut_17_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var12 = stackIn_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (param1[1] == null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = param1[1].b();
                        stackIn_25_0 = stackOut_22_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var13 = stackIn_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (null != param1[7]) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = 0;
                        stackIn_30_0 = stackOut_27_0;
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
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = param1[7].b();
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var14 = stackIn_30_0;
                        var15 = param3 + param5;
                        var16 = param7 + param8;
                        var17 = var11 + param3;
                        var18 = -var12 + var15;
                        var19 = var13 + param8;
                        var20 = -var14 + var16;
                        var21 = var17;
                        var22 = var18;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var21 > var22) {
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
                        statePc = 35;
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
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var22 = param3 + var11 * param5 / (var11 - -var12);
                        var21 = param3 + var11 * param5 / (var11 - -var12);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var23 = var19;
                        var24 = var20;
                        if ((var23 ^ -1) >= (var24 ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var24 = var13 * param7 / (var13 + var14) + param8;
                        var23 = var13 * param7 / (var13 + var14) + param8;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null == param1[0]) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var10_ref.a(var21, param8, (byte) -12, var23, param3);
                        param1[0].a(param3, param8, param0, param9, param6);
                        var10_ref.a(97);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (null == param1[2]) {
                            statePc = 45;
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
                        var10_ref.a(var15, param8, (byte) -12, var23, var22);
                        param1[2].a(var18, param8, param0, param9, param6);
                        var10_ref.a(-88);
                        statePc = 43;
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
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (param1[6] != null) {
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
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var10_ref.a(var21, var24, (byte) -12, var16, param3);
                        param1[6].a(param3, var20, param0, param9, param6);
                        var10_ref.a(-33);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (null == param1[8]) {
                            statePc = 53;
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
                        var10_ref.a(var15, var24, (byte) -12, var16, var22);
                        param1[8].a(var18, var20, param0, param9, param6);
                        var10_ref.a(-66);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (null == param1[1]) {
                            statePc = 65;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (-1 == (param1[1].d() ^ -1)) {
                            statePc = 65;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var10_ref.a(var22, param8, (byte) -12, var23, var21);
                        var25 = var17;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((var25 ^ -1) <= (var18 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        param1[1].a(var25, param8, param0, param9, param6);
                        var25 = var25 + param1[1].d();
                        stackOut_59_0 = var27;
                        stackIn_60_0 = stackOut_59_0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var27 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var10_ref.a(100);
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (null == param1[7]) {
                            statePc = 77;
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
                        if (0 == param1[7].d()) {
                            statePc = 77;
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
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var10_ref.a(var22, var24, (byte) -12, var16, var21);
                        var25 = var17;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var25 >= var18) {
                            statePc = 76;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        param1[7].a(var25, var20, param0, param9, param6);
                        var25 = var25 + param1[7].d();
                        stackOut_71_0 = var27;
                        stackIn_72_0 = stackOut_71_0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (stackIn_72_0 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var27 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var10_ref.a(121);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (param1[3] == null) {
                            statePc = 89;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (param1[3].b() == 0) {
                            statePc = 89;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var10_ref.a(var21, var23, (byte) -12, var24, param3);
                        var25 = var19;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if ((var25 ^ -1) <= (var20 ^ -1)) {
                            statePc = 88;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        param1[3].a(param3, var25, param0, param9, param6);
                        var25 = var25 + param1[3].b();
                        stackOut_83_0 = var27;
                        stackIn_84_0 = stackOut_83_0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (stackIn_84_0 != 0) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var27 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var10_ref.a(-83);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (param1[5] == null) {
                            statePc = 101;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (-1 == (param1[5].b() ^ -1)) {
                            statePc = 101;
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
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var10_ref.a(var15, var23, (byte) -12, var24, var22);
                        var25 = var19;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (var20 <= var25) {
                            statePc = 100;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        param1[5].a(var18, var25, param0, param9, param6);
                        var25 = var25 + param1[5].b();
                        stackOut_95_0 = var27;
                        stackIn_96_0 = stackOut_95_0;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (stackIn_96_0 != 0) {
                            statePc = 101;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var27 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var10_ref.a(99);
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (param1[4] == null) {
                            statePc = 125;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackOut_102_0 = 0;
                        stackIn_103_0 = stackOut_102_0;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (stackIn_103_0 == param1[4].d()) {
                            statePc = 125;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackOut_106_0 = (nh[]) param1;
                        stackIn_107_0 = stackOut_106_0;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (((nh) (Object) stackIn_107_0[4]).b() != 0) {
                            statePc = 112;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var10_ref.a(var22, var23, (byte) -12, var24, var21);
                        var25 = var19;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if ((var25 ^ -1) <= (var20 ^ -1)) {
                            statePc = 124;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        stackOut_114_0 = var17;
                        stackIn_126_0 = stackOut_114_0;
                        stackIn_115_0 = stackOut_114_0;
                        if (var27 != 0) {
                            statePc = 126;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var26 = stackIn_115_0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (var26 >= var18) {
                            statePc = 122;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        param1[4].a(var26, var25, param0, param9, param6);
                        var26 = var26 + param1[4].d();
                        stackOut_117_0 = var27;
                        stackIn_118_0 = stackOut_117_0;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (stackIn_118_0 != 0) {
                            statePc = 123;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (var27 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var25 = var25 + param1[4].b();
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (var27 == 0) {
                            statePc = 113;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var10_ref.a(123);
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        stackOut_125_0 = param2;
                        stackIn_126_0 = stackOut_125_0;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (stackIn_126_0 < -39) {
                            statePc = 141;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        field_A = null;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 131: {
                    var10 = (RuntimeException) (Object) caughtException;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    try {
                        stackOut_132_0 = (RuntimeException) var10;
                        stackOut_132_1 = new StringBuilder().append("tra.AA(").append(param0).append(44);
                        stackIn_135_0 = stackOut_132_0;
                        stackIn_135_1 = stackOut_132_1;
                        stackIn_133_0 = stackOut_132_0;
                        stackIn_133_1 = stackOut_132_1;
                        if (param1 == null) {
                            statePc = 135;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        stackOut_133_0 = (RuntimeException) (Object) stackIn_133_0;
                        stackOut_133_1 = (StringBuilder) (Object) stackIn_133_1;
                        stackOut_133_2 = "{...}";
                        stackIn_136_0 = stackOut_133_0;
                        stackIn_136_1 = stackOut_133_1;
                        stackIn_136_2 = stackOut_133_2;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 134: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 135: {
                    stackOut_135_0 = (RuntimeException) (Object) stackIn_135_0;
                    stackOut_135_1 = (StringBuilder) (Object) stackIn_135_1;
                    stackOut_135_2 = "null";
                    stackIn_136_0 = stackOut_135_0;
                    stackIn_136_1 = stackOut_135_1;
                    stackIn_136_2 = stackOut_135_2;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    try {
                        stackOut_136_0 = (RuntimeException) (Object) stackIn_136_0;
                        stackOut_136_1 = ((StringBuilder) (Object) stackIn_136_1).append(stackIn_136_2).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_139_0 = stackOut_136_0;
                        stackIn_139_1 = stackOut_136_1;
                        stackIn_137_0 = stackOut_136_0;
                        stackIn_137_1 = stackOut_136_1;
                        if (param4 == null) {
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
                        stackOut_137_0 = (RuntimeException) (Object) stackIn_137_0;
                        stackOut_137_1 = (StringBuilder) (Object) stackIn_137_1;
                        stackOut_137_2 = "{...}";
                        stackIn_140_0 = stackOut_137_0;
                        stackIn_140_1 = stackOut_137_1;
                        stackIn_140_2 = stackOut_137_2;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 138: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 139: {
                    stackOut_139_0 = (RuntimeException) (Object) stackIn_139_0;
                    stackOut_139_1 = (StringBuilder) (Object) stackIn_139_1;
                    stackOut_139_2 = "null";
                    stackIn_140_0 = stackOut_139_0;
                    stackIn_140_1 = stackOut_139_1;
                    stackIn_140_2 = stackOut_139_2;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    throw tba.a((Throwable) (Object) stackIn_140_0, stackIn_140_2 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
                }
                case 141: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(int param0) {
        try {
            if (param0 != 0) {
                return;
            }
            try {
                String var2 = this.h(-106);
                // if_icmpgt L26
            } catch (RuntimeException runtimeException) {
                throw tba.a((Throwable) (Object) runtimeException, "tra.O(" + param0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void g(int param0) {
        pn var1 = null;
        byte[] var2 = null;
        // if_acmpeq L11
        if (param0 != 12890) {
            return;
        }
        try {
            if (lt.field_f == null) {
                var1 = new pn();
                var2 = var1.a(128, 0, 16, 128);
                lt.field_f = bw.a(270, var2, false);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tra.V(" + param0 + 41);
        }
    }

    private final void h(byte param0) {
        RuntimeException var2 = null;
        oaa var2_ref = null;
        bja var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!((tra) this).field_D) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((tra) this).field_t = 0;
                        ((tra) this).field_j = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (!(((tra) this).field_r instanceof oaa)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var2_ref = (oaa) (Object) ((tra) this).field_r;
                        var3 = var2_ref.a((ae) this, 14157);
                        var4 = var3.a(0);
                        var5 = var2_ref.a((byte) 117, (ae) this);
                        var6 = var2_ref.a((byte) -90) >> -1710596767;
                        var7 = 28 / ((param0 - 47) / 36);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 < -var6 + var5) {
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
                        statePc = 15;
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
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((tra) this).field_j = 0;
                        ((tra) this).field_t = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        var8 = ((tra) this).field_t - -var3.a((byte) -59, ((tra) this).field_I);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var8 > var5 - var6) {
                            statePc = 23;
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
                        if ((var6 ^ -1) < (var8 ^ -1)) {
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
                        statePc = 26;
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
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((tra) this).field_t = ((tra) this).field_t + (var6 - var8);
                        if (var9 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((tra) this).field_t = ((tra) this).field_t + -var8 + (var5 + -var6);
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
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (0 < ((tra) this).field_t) {
                            statePc = 33;
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
                        if (((tra) this).field_t < var6 + -var5) {
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
                        statePc = 38;
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
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ((tra) this).field_t = -var5 + var6;
                        if (var9 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ((tra) this).field_t = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "tra.LA(" + param0 + 41);
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void k(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
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
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        tra.g((byte) 76);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((tra) this).field_B != ((tra) this).field_I) {
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
                        statePc = 19;
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
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((tra) this).field_I <= ((tra) this).field_B) {
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
                        stackOut_8_0 = ((tra) this).field_B;
                        stackIn_11_0 = stackOut_8_0;
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
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = ((tra) this).field_I;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_int = stackIn_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((tra) this).field_B >= ((tra) this).field_I) {
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
                        stackOut_13_0 = ((tra) this).field_I;
                        stackIn_16_0 = stackOut_13_0;
                        statePc = 16;
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
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = ((tra) this).field_B;
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
                        var3 = stackIn_16_0;
                        ((tra) this).field_I = var2_int;
                        ((tra) this).field_B = var2_int;
                        ((tra) this).field_o = ((tra) this).field_o.substring(0, var2_int) + ((tra) this).field_o.substring(var3, ((tra) this).field_o.length());
                        ((tra) this).i(200);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "tra.NA(" + param0 + 41);
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1) {
        try {
            int var3_int = 36 / ((-89 - param0) / 32);
            ((tra) this).field_I = param1;
            // ifeq L29
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tra.OA(" + param0 + 44 + param1 + 41);
        }
    }

    void a(int param0, int param1, ae param2, int param3) {
        RuntimeException var5 = null;
        oaa var5_ref = null;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        super.a(param0, param1, param2, param3);
                        this.h((byte) -105);
                        if (((tra) this).field_s != 1) {
                            statePc = 31;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (((tra) this).field_r instanceof oaa) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 23;
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5_ref = (oaa) (Object) ((tra) this).field_r;
                        var6 = var5_ref.a((ae) this, (byte) 4, sta.field_B, param0, param3, jba.field_j);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var6 ^ -1) != 0) {
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
                        statePc = 23;
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!((tra) this).field_E) {
                            statePc = 22;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = var6;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((stackIn_12_0 ^ -1) <= (((tra) this).field_F ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = var6;
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
                        if ((stackIn_16_0 ^ -1) < (((tra) this).field_B ^ -1)) {
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6 = ((tra) this).field_F;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((tra) this).field_I = var6;
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
                        ((tra) this).field_H = bva.b((byte) -107);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        stackOut_26_0 = (RuntimeException) var5;
                        stackOut_26_1 = new StringBuilder().append("tra.A(").append(param0).append(44).append(param1).append(44);
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        if (param2 == null) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                        stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                        stackOut_27_2 = "{...}";
                        stackIn_30_0 = stackOut_27_0;
                        stackIn_30_1 = stackOut_27_1;
                        stackIn_30_2 = stackOut_27_2;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 29: {
                    stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                    stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                    stackOut_29_2 = "null";
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw tba.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param3 + 41);
                }
                case 31: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 > 70) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((tra) this).f(18);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!super.a(92, param1, param2, param3, param4, param5, param6)) {
                            statePc = 32;
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
                        if (!(((tra) this).field_r instanceof oaa)) {
                            statePc = 32;
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
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8_int = ((oaa) (Object) ((tra) this).field_r).a((ae) this, (byte) 4, sta.field_B, param1, param2, jba.field_j);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 60;
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (-1 == var8_int) {
                            statePc = 12;
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
                        stackOut_10_0 = this;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = var8_int;
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_13_2 = stackOut_10_2;
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
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = this;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.a(stackIn_13_1, stackIn_13_2);
                        var8_long = bva.b((byte) -107);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = this;
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (250L <= -((tra) this).field_G + var8_long) {
                            statePc = 17;
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
                        stackOut_15_0 = this;
                        stackOut_15_1 = 1;
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_18_1 = stackOut_15_1;
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
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = this;
                        stackOut_17_1 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((tra) this).field_E = stackIn_18_1 != 0;
                        if (((tra) this).field_E) {
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
                        statePc = 30;
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
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((tra) this).field_B = this.b(true);
                        ((tra) this).field_I = this.b(-76);
                        if ((((tra) this).field_I ^ -1) >= -1) {
                            statePc = 29;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = this;
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
                        if (((tra) this).field_o.charAt(-1 + ((tra) this).field_I) != 32) {
                            statePc = 29;
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
                        ((tra) this).field_I = ((tra) this).field_I - 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((tra) this).field_F = ((tra) this).field_I;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ((tra) this).field_G = var8_long;
                        stackOut_30_0 = 1;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0 != 0;
                }
                case 32: {
                    try {
                        stackOut_32_0 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return stackIn_33_0 != 0;
                }
                case 34: {
                    var8 = (RuntimeException) (Object) caughtException;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    try {
                        stackOut_35_0 = (RuntimeException) var8;
                        stackOut_35_1 = new StringBuilder().append("tra.L(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
                        stackIn_38_0 = stackOut_35_0;
                        stackIn_38_1 = stackOut_35_1;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        if (param5 == null) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                        stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                        stackOut_36_2 = "{...}";
                        stackIn_39_0 = stackOut_36_0;
                        stackIn_39_1 = stackOut_36_1;
                        stackIn_39_2 = stackOut_36_2;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 38: {
                    stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                    stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                    stackOut_38_2 = "null";
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    stackIn_39_2 = stackOut_38_2;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    throw tba.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param6 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = 54 / ((param0 - 31) / 62);
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
                        if (!(((tra) this).field_h instanceof cd)) {
                            statePc = 7;
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
                        ((cd) (Object) ((tra) this).field_h).a(-6038, (tra) this);
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
                        statePc = 7;
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
                    throw tba.a((Throwable) (Object) runtimeException, "tra.SA(" + param0 + 41);
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void d(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              try {
                var3 = -61 % ((-29 - param0) / 55);
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.k(0);
                this.a(var2, false);
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2_ref = (Exception) (Object) decompiledCaughtException;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            throw tba.a((Throwable) (Object) var2_ref2, "tra.H(" + param0 + 41);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int b(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        Object stackIn_7_0 = null;
        char stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_20_0 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_6_0 = null;
        char stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_14_1 = 0;
        int stackOut_19_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 != ((tra) this).field_I) {
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
                        stackOut_2_0 = ((tra) this).field_I;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var2_int = -1 + ((tra) this).field_I;
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
                        if (0 >= var2_int) {
                            statePc = 14;
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
                        stackOut_6_0 = this;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = ((tra) this).field_o.charAt(var2_int - 1);
                        stackOut_7_1 = 32;
                        stackIn_15_0 = stackOut_7_0;
                        stackIn_15_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (var3 != 0) {
                            statePc = 15;
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
                        if (stackIn_8_0 == stackIn_8_1) {
                            statePc = 14;
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
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_int--;
                        if (var3 == 0) {
                            statePc = 5;
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
                        stackOut_14_0 = param0;
                        stackOut_14_1 = 1;
                        stackIn_15_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_1 = stackOut_14_1;
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
                        if (stackIn_15_0 == stackIn_15_1) {
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
                        ((tra) this).field_F = -50;
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
                        stackOut_19_0 = var2_int;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0;
                }
                case 21: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "tra.F(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void i(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 200) {
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
                        this.k(-51);
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
                        if (!(((tra) this).field_h instanceof cd)) {
                            statePc = 10;
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
                        ((cd) (Object) ((tra) this).field_h).a((tra) this, -10);
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
                        statePc = 10;
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
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "tra.M(" + param0 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((tra) this).field_C == -1) {
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
                        var3_int = ((tra) this).field_C - ((tra) this).field_o.length();
                        if (-1 < (var3_int ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        param0 = param0.substring(0, var3_int);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((tra) this).field_I ^ -1) != (((tra) this).field_o.length() ^ -1)) {
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
                        ((tra) this).field_o = ((tra) this).field_o + param0;
                        if (!TombRacer.field_G) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((tra) this).field_o = ((tra) this).field_o.substring(0, ((tra) this).field_I) + param0 + ((tra) this).field_o.substring(((tra) this).field_I, ((tra) this).field_o.length());
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
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((tra) this).field_I = ((tra) this).field_I + param0.length();
                        if (!param1) {
                            statePc = 15;
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
                        this.d(104);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((tra) this).field_B = ((tra) this).field_I;
                        ((tra) this).i(200);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        stackOut_18_0 = (RuntimeException) var3;
                        stackOut_18_1 = new StringBuilder().append("tra.J(");
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (param0 == null) {
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
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "{...}";
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_22_2 = stackOut_19_2;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 21: {
                    stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                    stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                    stackOut_21_2 = "null";
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    throw tba.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void l(int param0) {
        try {
            this.e(0);
            this.k(param0 ^ param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tra.QA(" + param0 + 41);
        }
    }

    final void a(boolean param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null == param2) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param2 = "";
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1 == -16719) {
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
                        ((tra) this).field_D = false;
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
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((tra) this).field_o = param2;
                        var4_int = param2.length();
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-1 == ((tra) this).field_C) {
                            statePc = 17;
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
                        stackOut_10_0 = var4_int;
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
                        if (stackIn_11_0 > ((tra) this).field_C) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
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
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((tra) this).field_o = ((tra) this).field_o.substring(0, ((tra) this).field_C);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((tra) this).field_B = ((tra) this).field_o.length();
                        ((tra) this).field_I = ((tra) this).field_o.length();
                        if (param0) {
                            statePc = 28;
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
                        ((tra) this).i(param1 ^ -16775);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    try {
                        stackOut_23_0 = (RuntimeException) var4;
                        stackOut_23_1 = new StringBuilder().append("tra.MA(").append(param0).append(44).append(param1).append(44);
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        if (param2 == null) {
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
                        stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                        stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                        stackOut_24_2 = "{...}";
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_27_2 = stackOut_24_2;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 26: {
                    stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                    stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                    stackOut_26_2 = "null";
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    throw tba.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void g(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if ((ff.field_w ^ -1) < -33) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        cf.a(0, param0 + 8);
                        if (!TombRacer.field_G) {
                            statePc = 10;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var1_int = ff.field_w % 32;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (0 == var1_int) {
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_int = 32;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        cf.a(-var1_int + ff.field_w, param0 + -1);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0 == -113) {
                            statePc = 16;
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
                        tra.g(-73);
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var1, "tra.RA(" + param0 + 41);
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void f(int param0) {
        try {
            ((tra) this).field_o = "";
            ((tra) this).field_I = 0;
            int var2_int = -100 % ((param0 - -80) / 39);
            ((tra) this).field_B = 0;
            ((tra) this).i(200);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tra.KA(" + param0 + 41);
        }
    }

    public static void j(int param0) {
        try {
            field_z = null;
            field_A = null;
            int var1_int = 88 / ((-30 - param0) / 62);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tra.N(" + param0 + 41);
        }
    }

    tra(String param0, qc param1, int param2) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((tra) this).field_F = -1;
                    ((tra) this).field_E = false;
                    ((tra) this).field_G = 0L;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((tra) this).field_r = afa.field_c.field_e;
                        ((tra) this).field_C = param2;
                        ((tra) this).a(true, -16719, param0);
                        ((tra) this).field_D = true;
                        ((tra) this).field_H = bva.b((byte) -107);
                        statePc = 13;
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
                        stackOut_4_1 = new StringBuilder().append("tra.<init>(");
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param0 == null) {
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
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param1 == null) {
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
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
                }
                case 13: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        Object stackIn_7_0 = null;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_6_0 = null;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_15_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = ((tra) this).field_o.length();
                        if (var2_int != ((tra) this).field_I) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = ((tra) this).field_I;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var3 = 99 / ((param0 - 37) / 56);
                        var4 = 1 + ((tra) this).field_I;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var2_int ^ -1) >= (var4 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = ((tra) this).field_o.charAt(-1 + var4) ^ -1;
                        stackIn_16_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var5 != 0) {
                            statePc = 16;
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
                        stackOut_8_0 = stackIn_8_0;
                        stackOut_8_1 = -33;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        statePc = 9;
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
                            statePc = 15;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4++;
                        if (var5 == 0) {
                            statePc = 5;
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = var4;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "tra.PA(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final String h(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        String stackIn_11_0 = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        String stackOut_10_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3 = -77 / ((param0 - -20) / 55);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (((tra) this).field_I > ((tra) this).field_B) {
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
                        stackOut_2_0 = ((tra) this).field_I;
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
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = ((tra) this).field_B;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2_int = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((tra) this).field_I > ((tra) this).field_B) {
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
                        stackOut_7_0 = ((tra) this).field_B;
                        stackIn_10_0 = stackOut_7_0;
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
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = ((tra) this).field_I;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4 = stackIn_10_0;
                        stackOut_10_0 = ((tra) this).field_o.substring(var2_int, var4);
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var2, "tra.U(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Players: <%0>/<%1>";
        field_z = new String[]{null, "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "Esc", null, null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "`", null, null, null, "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", null, null, null, null, "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'", "#", null, null, null, null, "Z", "X", "C", "V", "B", "N", "M", "<", ">", "/", "\\", null, null, null, null, null, "Tab", "Shift", "Ctrl", "Space", "Enter", "Backspace", "Alt", "Keypad +", "Keypad -", "Keypad *", "Keypad /", "Keypad 5", null, null, null, null, "Left Arrow", "Right Arrow", "Up Arrow", "Down Arrow", "Insert", "Delete", "Home", "End", "Page Up", "Page Down", null, null, null, null, null, null};
    }
}
