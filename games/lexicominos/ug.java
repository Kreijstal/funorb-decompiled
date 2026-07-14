/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends hf {
    private wb field_i;
    private int field_p;
    private byte[] field_w;
    private byte[] field_g;
    static String[] field_r;
    private int field_n;
    static double field_u;
    private e field_z;
    private int field_j;
    static dg field_q;
    private dl field_B;
    private kl field_C;
    private si field_t;
    static eg field_A;
    private dl field_f;
    private na field_k;
    static java.awt.Canvas field_y;
    private ng field_l;
    private int field_o;
    static int field_m;
    private boolean field_D;
    private boolean field_d;
    static String field_s;
    static long field_x;
    private ng field_v;
    private boolean field_e;
    private long field_h;

    final void b(int param0) {
        RuntimeException var2 = null;
        kd var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        Object stackIn_24_0 = null;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        Object stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == ((ug) this).field_v) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (((ug) this).a(false) == null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        if (param0 <= -68) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        e discarded$3 = ((ug) this).a(true);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_ref = ((ug) this).field_l.a(true);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (null == var2_ref) {
                            statePc = 47;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = (int)var2_ref.field_d;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var4 != 0) {
                            statePc = 47;
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
                        stackOut_15_0 = -1;
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
                        if (stackIn_16_0 < (var3 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = var3;
                        stackIn_20_0 = stackOut_19_0;
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
                        if (stackIn_20_0 >= ((ug) this).field_z.field_d) {
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
                        stackOut_23_0 = this;
                        stackIn_24_0 = stackOut_23_0;
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
                        if ((((ug) this).field_z.field_m[var3] ^ -1) != -1) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var2_ref.b((byte) -122);
                        if (var4 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (-1 == (((ug) this).field_w[var3] ^ -1)) {
                            statePc = 35;
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
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        si discarded$4 = this.a((byte) -128, 1, var3);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((((ug) this).field_w[var3] ^ -1) != 0) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        si discarded$5 = this.a((byte) -91, 2, var3);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (1 != ((ug) this).field_w[var3]) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var2_ref.b((byte) -118);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var2_ref = ((ug) this).field_l.f(2);
                        if (var4 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var2, "ug.F(" + param0 + 41);
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        si var2_ref = null;
        kd var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        Object stackIn_33_1 = null;
        int stackIn_54_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_80_0 = 0;
        Object stackIn_80_1 = null;
        int stackIn_101_0 = 0;
        boolean stackIn_111_0 = false;
        boolean stackIn_130_0 = false;
        byte stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        Object stackOut_32_1 = null;
        int stackOut_53_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_79_0 = 0;
        Object stackOut_79_1 = null;
        int stackOut_100_0 = 0;
        boolean stackOut_110_0 = false;
        boolean stackOut_129_0 = false;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == ((ug) this).field_v) {
                            statePc = 104;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null != ((ug) this).a(false)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (((ug) this).field_D) {
                            statePc = 59;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((ug) this).field_d) {
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
                case 8: {
                    try {
                        ((ug) this).field_v = null;
                        if (var5 == 0) {
                            statePc = 104;
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
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2_int = 1;
                        var3 = ((ug) this).field_v.a(true);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (null == var3) {
                            statePc = 27;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4 = (int)var3.field_d;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = ((ug) this).field_w[var4];
                        stackOut_14_1 = 1;
                        stackIn_28_0 = stackOut_14_0;
                        stackIn_28_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var5 != 0) {
                            statePc = 28;
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
                        if (stackIn_15_0 != stackIn_15_1) {
                            statePc = 19;
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
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        si discarded$5 = this.a((byte) -56, 2, var4);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (-2 == (((ug) this).field_w[var4] ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var2_int = 0;
                        stackOut_21_0 = var5;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 == 0) {
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
                        var3.b((byte) -128);
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
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var3 = ((ug) this).field_v.f(2);
                        if (var5 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = ((ug) this).field_z.field_m.length;
                        stackOut_27_1 = ((ug) this).field_o;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 <= stackIn_28_1) {
                            statePc = 53;
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
                        stackOut_29_0 = 0;
                        stackIn_54_0 = stackOut_29_0;
                        stackIn_30_0 = stackOut_29_0;
                        if (var5 != 0) {
                            statePc = 54;
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
                        stackOut_30_0 = stackIn_30_0;
                        stackIn_32_0 = stackOut_30_0;
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
                        stackOut_32_0 = stackIn_32_0;
                        stackOut_32_1 = this;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
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
                        if (stackIn_33_0 != ((ug) this).field_z.field_m[((ug) this).field_o]) {
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
                        ((ug) this).field_o = ((ug) this).field_o + 1;
                        if (var5 == 0) {
                            statePc = 27;
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
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (((ug) this).field_i.a(9172)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
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
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var2_int = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var5 == 0) {
                            statePc = 53;
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
                        if (-2 != (((ug) this).field_w[((ug) this).field_o] ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        si discarded$6 = this.a((byte) -25, 2, ((ug) this).field_o);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((((ug) this).field_w[((ug) this).field_o] ^ -1) == -2) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var3 = new kd();
                        var3.field_d = (long)((ug) this).field_o;
                        ((ug) this).field_v.b(105, var3);
                        var2_int = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((ug) this).field_o = ((ug) this).field_o + 1;
                        if (var5 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = var2_int;
                        stackIn_54_0 = stackOut_53_0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (stackIn_54_0 == 0) {
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
                        ((ug) this).field_o = 0;
                        ((ug) this).field_d = false;
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
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var5 == 0) {
                            statePc = 104;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var2_int = 1;
                        var3 = ((ug) this).field_v.a(true);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (null == var3) {
                            statePc = 74;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var4 = (int)var3.field_d;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = ((ug) this).field_w[var4] ^ -1;
                        stackOut_62_1 = -1;
                        stackIn_75_0 = stackOut_62_0;
                        stackIn_75_1 = stackOut_62_1;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        if (var5 != 0) {
                            statePc = 75;
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
                        if (stackIn_63_0 == stackIn_63_1) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
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
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        si discarded$7 = this.a((byte) -93, 1, var4);
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if ((((ug) this).field_w[var4] ^ -1) == -1) {
                            statePc = 72;
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
                        var3.b((byte) -116);
                        if (var5 == 0) {
                            statePc = 73;
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
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var2_int = 0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var3 = ((ug) this).field_v.f(2);
                        if (var5 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = ((ug) this).field_o ^ -1;
                        stackOut_74_1 = ((ug) this).field_z.field_m.length ^ -1;
                        stackIn_75_0 = stackOut_74_0;
                        stackIn_75_1 = stackOut_74_1;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (stackIn_75_0 <= stackIn_75_1) {
                            statePc = 100;
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
                        stackOut_76_0 = -1;
                        stackIn_101_0 = stackOut_76_0;
                        stackIn_77_0 = stackOut_76_0;
                        if (var5 != 0) {
                            statePc = 101;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackOut_77_0 = stackIn_77_0;
                        stackIn_79_0 = stackOut_77_0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 82;
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
                        stackOut_79_0 = stackIn_79_0;
                        stackOut_79_1 = this;
                        stackIn_80_0 = stackOut_79_0;
                        stackIn_80_1 = stackOut_79_1;
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
                        if (stackIn_80_0 != (((ug) this).field_z.field_m[((ug) this).field_o] ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        ((ug) this).field_o = ((ug) this).field_o + 1;
                        if (var5 == 0) {
                            statePc = 74;
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
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((((ug) this).field_C.field_c ^ -1) <= -251) {
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
                        statePc = 91;
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
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var2_int = 0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var5 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (((ug) this).field_w[((ug) this).field_o] != 0) {
                            statePc = 97;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        si discarded$8 = this.a((byte) -88, 1, ((ug) this).field_o);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if ((((ug) this).field_w[((ug) this).field_o] ^ -1) != -1) {
                            statePc = 99;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var3 = new kd();
                        var3.field_d = (long)((ug) this).field_o;
                        var2_int = 0;
                        ((ug) this).field_v.b(123, var3);
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        ((ug) this).field_o = ((ug) this).field_o + 1;
                        if (var5 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackOut_100_0 = var2_int;
                        stackIn_101_0 = stackOut_100_0;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (stackIn_101_0 != 0) {
                            statePc = 103;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        ((ug) this).field_o = 0;
                        ((ug) this).field_D = false;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (!((ug) this).field_e) {
                            statePc = 129;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (((ug) this).field_h > rf.c(0)) {
                            statePc = 129;
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
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var2_ref = (si) (Object) ((ug) this).field_k.c((byte) -120);
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (var2_ref == null) {
                            statePc = 128;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackOut_110_0 = var2_ref.field_v;
                        stackIn_130_0 = stackOut_110_0;
                        stackIn_111_0 = stackOut_110_0;
                        if (var5 != 0) {
                            statePc = 130;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (stackIn_111_0) {
                            statePc = 127;
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
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (var2_ref.field_r) {
                            statePc = 120;
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
                case 117: {
                    try {
                        var2_ref.field_r = true;
                        if (var5 == 0) {
                            statePc = 127;
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
                        if (!var2_ref.field_p) {
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
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var2_ref.b((byte) -122);
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var2_ref = (si) (Object) ((ug) this).field_k.a((byte) -91);
                        if (var5 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        ((ug) this).field_h = 1000L + rf.c(0);
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackOut_129_0 = param0;
                        stackIn_130_0 = stackOut_129_0;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (!stackIn_130_0) {
                            statePc = 136;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        int discarded$9 = ((ug) this).a(15, 40);
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 136;
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
                case 135: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var2, "ug.J(" + param0 + 41);
                }
                case 136: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1) {
        si var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3 = (si) (Object) ((ug) this).field_k.a((long)param0, (byte) 96);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (null != var3) {
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
                        statePc = 6;
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
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = var3.c((byte) 16);
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
                        if (param1 == 1215) {
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
                        stackOut_7_0 = -35;
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
                        stackOut_9_0 = 0;
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
                    var3_ref = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var3_ref, "ug.C(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null == ((ug) this).field_B) {
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
                        if (param0 == 11002) {
                            statePc = 7;
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
                        ((ug) this).field_v = null;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((ug) this).field_d = true;
                        if (((ug) this).field_v == null) {
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
                        statePc = 13;
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
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((ug) this).field_v = new ng();
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var2, "ug.K(" + param0 + 41);
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final e a(boolean param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        e stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_52_0 = null;
        e stackIn_62_0 = null;
        e stackOut_2_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_14_0 = null;
        Object stackOut_30_0 = null;
        Object stackOut_51_0 = null;
        e stackOut_61_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((ug) this).field_z == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = ((ug) this).field_z;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (null != ((ug) this).field_t) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!((ug) this).field_i.e(20)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = null;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return (e) (Object) stackIn_9_0;
                }
                case 10: {
                    try {
                        ((ug) this).field_t = (si) (Object) ((ug) this).field_i.a(5, 255, ((ug) this).field_j, (byte) 0, true);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (((ug) this).field_t.field_v) {
                            statePc = 14;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = null;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return (e) (Object) stackIn_15_0;
                }
                case 16: {
                    try {
                        var2_array = ((ug) this).field_t.d((byte) -125);
                        if (((ug) this).field_t instanceof fj) {
                            statePc = 36;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (null != var2_array) {
                            statePc = 20;
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
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((ug) this).field_z = new e(var2_array, ((ug) this).field_p, ((ug) this).field_g);
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
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var3 = (RuntimeException) (Object) caughtException;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((ug) this).field_i.c(-28488);
                        ((ug) this).field_z = null;
                        if (((ug) this).field_i.e(20)) {
                            statePc = 27;
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
                        ((ug) this).field_t = (si) (Object) ((ug) this).field_i.a(5, 255, ((ug) this).field_j, (byte) 0, true);
                        if (var4 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((ug) this).field_t = null;
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
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 63;
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
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return (e) (Object) stackIn_31_0;
                }
                case 32: {
                    try {
                        if (null != ((ug) this).field_f) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        fj discarded$1 = ((ug) this).field_C.a(var2_array, ((ug) this).field_j, 1, ((ug) this).field_f);
                        if (var4 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (null != var2_array) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ((ug) this).field_z = new e(var2_array, ((ug) this).field_p, ((ug) this).field_g);
                        if (((ug) this).field_z.field_s == ((ug) this).field_n) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var3 = (RuntimeException) (Object) caughtException;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((ug) this).field_z = null;
                        if (((ug) this).field_i.e(20)) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ((ug) this).field_t = (si) (Object) ((ug) this).field_i.a(5, 255, ((ug) this).field_j, (byte) 0, true);
                        if (var4 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((ug) this).field_t = null;
                        statePc = 49;
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
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = null;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 52: {
                    return (e) (Object) stackIn_52_0;
                }
                case 53: {
                    try {
                        if (null == ((ug) this).field_B) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        ((ug) this).field_w = new byte[((ug) this).field_z.field_d];
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (!param0) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        field_m = 43;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
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
                        ((ug) this).field_t = null;
                        stackOut_61_0 = ((ug) this).field_z;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 62: {
                    return stackIn_62_0;
                }
                case 63: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var2, "ug.E(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 121) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_s = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var1 = bd.field_l;
                        var2 = 0;
                        var3 = var1.length;
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
                        if ((var2 ^ -1) <= (var3 ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2++;
                        var1[var2] = 0;
                        var2++;
                        var1[var2] = 0;
                        var2++;
                        var1[var2] = 0;
                        var2++;
                        var1[var2] = 0;
                        var2++;
                        var1[var2] = 0;
                        var2++;
                        var1[var2] = 0;
                        var2++;
                        var1[var2] = 0;
                        var2++;
                        var1[var2] = 0;
                        if (var4 != 0) {
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
                        if (var4 == 0) {
                            statePc = 6;
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
                    var1_ref = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var1_ref, "ug.L(" + param0 + 41);
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static wj a(sh param0, int param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_9_0 = null;
        wj stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        Object stackOut_8_0 = null;
        wj stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2) {
                            statePc = 4;
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
                        field_q = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = param0.a(param1, -117);
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
                        if (null == var3) {
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
                        statePc = 10;
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
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = null;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return (wj) (Object) stackIn_9_0;
                }
                case 10: {
                    try {
                        stackOut_10_0 = new wj(var3);
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
                    var3_ref = (RuntimeException) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) var3_ref;
                        stackOut_13_1 = new StringBuilder().append("ug.H(");
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
                    throw ld.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final byte[] a(int param0, boolean param1) {
        si var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        byte[] stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3 = this.a((byte) -3, 0, param0);
                        if (var3 != null) {
                            statePc = 3;
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
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (byte[]) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        if (param1) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((ug) this).field_e = true;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = var3.d((byte) -106);
                        var3.b((byte) -116);
                        stackOut_7_0 = (byte[]) var4;
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
                    return stackIn_8_0;
                }
                case 9: {
                    var3_ref = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var3_ref, "ug.A(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final si a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        si var4_ref = null;
        Object var4_ref2 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        byte[] var7 = null;
        int var7_int = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        si stackIn_8_0 = null;
        int stackIn_29_0 = 0;
        Object stackIn_44_0 = null;
        int stackIn_46_0 = 0;
        Object stackIn_51_0 = null;
        Object stackIn_58_0 = null;
        Object stackIn_68_0 = null;
        int stackIn_72_0 = 0;
        Object stackIn_85_0 = null;
        byte stackIn_93_0 = 0;
        byte stackIn_93_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        dc stackIn_115_0 = null;
        Object stackIn_123_0 = null;
        byte[] stackIn_126_0 = null;
        byte stackIn_143_0 = 0;
        byte stackIn_143_1 = 0;
        Object stackIn_160_0 = null;
        int stackIn_165_0 = 0;
        int stackIn_165_1 = 0;
        dc stackIn_173_0 = null;
        int stackOut_3_0 = 0;
        si stackOut_7_0 = null;
        int stackOut_28_0 = 0;
        Object stackOut_43_0 = null;
        int stackOut_45_0 = 0;
        Object stackOut_50_0 = null;
        Object stackOut_57_0 = null;
        Object stackOut_67_0 = null;
        int stackOut_71_0 = 0;
        Object stackOut_84_0 = null;
        byte stackOut_92_0 = 0;
        byte stackOut_92_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        dc stackOut_114_0 = null;
        Object stackOut_122_0 = null;
        byte[] stackOut_125_0 = null;
        byte stackOut_142_0 = 0;
        byte stackOut_142_1 = 0;
        Object stackOut_159_0 = null;
        int stackOut_164_0 = 0;
        int stackOut_164_1 = 0;
        dc stackOut_172_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_ref = (si) (Object) ((ug) this).field_k.a((long)param2, (byte) 107);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4_ref == null) {
                            statePc = 15;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof Exception ? 6 : 174);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof Exception ? 6 : 174);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 != param1) {
                            statePc = 15;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof Exception ? 10 : 174);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 10 : 174);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 10 : 174);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (si) var4_ref;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof Exception ? 10 : 174);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0.field_p) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof Exception ? 13 : 174);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof Exception ? 13 : 174);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = (stateCaught_10 instanceof Exception ? 13 : 174);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!var4_ref.field_v) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = (stateCaught_11 instanceof Exception ? 13 : 174);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_ref.b((byte) -116);
                        var4_ref = null;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var4_ref != null) {
                            statePc = 62;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = (stateCaught_15 instanceof Exception ? 18 : 174);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((param1 ^ -1) == -1) {
                            statePc = 49;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof Exception ? 21 : 174);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = (stateCaught_17 instanceof Exception ? 21 : 174);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof Exception ? 21 : 174);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((param1 ^ -1) != -2) {
                            statePc = 30;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 24 : 174);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof Exception ? 24 : 174);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof Exception ? 24 : 174);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (null == ((ug) this).field_B) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof Exception ? 26 : 174);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof Exception ? 26 : 174);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof Exception ? 26 : 174);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = (stateCaught_25 instanceof Exception ? 26 : 174);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var4_ref2 = (dc) (Object) ((ug) this).field_C.a(param2, ((ug) this).field_B, 3);
                        stackOut_28_0 = var10;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof Exception ? 32 : 174);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((param1 ^ -1) != -3) {
                            statePc = 47;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = (stateCaught_30 instanceof Exception ? 35 : 174);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = (stateCaught_31 instanceof Exception ? 35 : 174);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = (stateCaught_32 instanceof Exception ? 35 : 174);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (((ug) this).field_B == null) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = (stateCaught_33 instanceof Exception ? 37 : 174);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = (stateCaught_34 instanceof Exception ? 37 : 174);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = (stateCaught_35 instanceof Exception ? 37 : 174);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = (stateCaught_36 instanceof Exception ? 37 : 174);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (-1 == ((ug) this).field_w[param2]) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = (stateCaught_39 instanceof Exception ? 41 : 174);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = (stateCaught_40 instanceof Exception ? 41 : 174);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (!((ug) this).field_i.a(9172)) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = null;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 44: {
                    return (si) (Object) stackIn_44_0;
                }
                case 45: {
                    try {
                        var4_ref2 = ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, false);
                        stackOut_45_0 = var10;
                        stackIn_46_0 = stackOut_45_0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = (stateCaught_46 instanceof Exception ? 48 : 174);
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = (stateCaught_47 instanceof Exception ? 48 : 174);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (null == ((ug) this).field_B) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = (stateCaught_49 instanceof Exception ? 53 : 174);
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = this;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = (stateCaught_50 instanceof Exception ? 53 : 174);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((((ug) this).field_w[param2] ^ -1) != 0) {
                            statePc = 60;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = (stateCaught_51 instanceof Exception ? 56 : 174);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = (stateCaught_52 instanceof Exception ? 56 : 174);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = (stateCaught_53 instanceof Exception ? 56 : 174);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (!((ug) this).field_i.e(20)) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = (stateCaught_54 instanceof Exception ? 56 : 174);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = null;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 58: {
                    return (si) (Object) stackIn_58_0;
                }
                case 59: {
                    try {
                        var4_ref2 = ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, true);
                        if (var10 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var4_ref2 = (dc) (Object) ((ug) this).field_C.a(((ug) this).field_B, (byte) -6, param2);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        ((ug) this).field_k.a((kd) (Object) var4_ref2, (byte) -114, (long)param2);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (param0 < 0) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = (stateCaught_62 instanceof Exception ? 65 : 174);
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        ug.a((byte) -68);
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = (stateCaught_63 instanceof Exception ? 65 : 174);
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (!((si) (Object) var4_ref2).field_v) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackOut_67_0 = null;
                        stackIn_68_0 = stackOut_67_0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 68: {
                    return (si) (Object) stackIn_68_0;
                }
                case 69: {
                    try {
                        var5 = ((si) (Object) var4_ref2).d((byte) 123);
                        if (!(var4_ref2 instanceof fj)) {
                            statePc = 124;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var5 == null) {
                            statePc = 77;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = (stateCaught_70 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = -3;
                        stackIn_72_0 = stackOut_71_0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = (stateCaught_71 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (stackIn_72_0 <= (var5.length ^ -1)) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = (stateCaught_72 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = (stateCaught_73 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = (stateCaught_75 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = (stateCaught_77 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        uh.field_v.reset();
                        uh.field_v.update(var5, 0, var5.length + -2);
                        var6_int = (int)uh.field_v.getValue();
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = (stateCaught_78 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if ((var6_int ^ -1) != (((ug) this).field_z.field_r[param2] ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = (stateCaught_79 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = (stateCaught_80 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = (stateCaught_82 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (((ug) this).field_z.field_o == null) {
                            statePc = 99;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = (stateCaught_83 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackOut_84_0 = null;
                        stackIn_85_0 = stackOut_84_0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = (stateCaught_84 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (stackIn_85_0 != (Object) (Object) ((ug) this).field_z.field_o[param2]) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = (stateCaught_85 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = (stateCaught_86 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = (stateCaught_88 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var7 = ((ug) this).field_z.field_o[param2];
                        var8 = si.a(0, var5, -99, var5.length - 2);
                        var9 = 0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = (stateCaught_90 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (64 <= var9) {
                            statePc = 99;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = (stateCaught_91 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackOut_92_0 = var7[var9];
                        stackOut_92_1 = var8[var9];
                        stackIn_100_0 = stackOut_92_0;
                        stackIn_100_1 = stackOut_92_1;
                        stackIn_93_0 = stackOut_92_0;
                        stackIn_93_1 = stackOut_92_1;
                        if (var10 != 0) {
                            statePc = 100;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = (stateCaught_92 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (stackIn_93_0 == stackIn_93_1) {
                            statePc = 98;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = (stateCaught_93 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = (stateCaught_94 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = (stateCaught_96 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var9++;
                        if (var10 == 0) {
                            statePc = 91;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = (stateCaught_98 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackOut_99_0 = (var5[var5.length - 2] & 255) << -966605144;
                        stackOut_99_1 = 255 & var5[-1 + var5.length];
                        stackIn_100_0 = stackOut_99_0;
                        stackIn_100_1 = stackOut_99_1;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = (stateCaught_99 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var7_int = stackIn_100_0 + stackIn_100_1;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = (stateCaught_100 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if ((var7_int ^ -1) != (((ug) this).field_z.field_t[param2] & 65535 ^ -1)) {
                            statePc = 104;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = (stateCaught_101 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = (stateCaught_102 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = (stateCaught_104 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (1 != ((ug) this).field_w[param2]) {
                            statePc = 108;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = (stateCaught_105 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = (stateCaught_106 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (((ug) this).field_w[param2] == 0) {
                            statePc = 109;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = (stateCaught_108 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        ((ug) this).field_w[param2] = (byte) 1;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = (stateCaught_109 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (((si) (Object) var4_ref2).field_p) {
                            statePc = 114;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = (stateCaught_110 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        ((si) (Object) var4_ref2).b((byte) -128);
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = (stateCaught_111 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = (stateCaught_112 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        stackOut_114_0 = (dc) var4_ref2;
                        stackIn_115_0 = stackOut_114_0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = (stateCaught_114 instanceof Exception ? 116 : 174);
                        continue stateLoop;
                    }
                }
                case 115: {
                    return (si) (Object) stackIn_115_0;
                }
                case 116: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        ((ug) this).field_w[param2] = (byte) -1;
                        ((si) (Object) var4_ref2).b((byte) -117);
                        if (!((si) (Object) var4_ref2).field_p) {
                            statePc = 122;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = (stateCaught_117 instanceof Exception ? 120 : 174);
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (((ug) this).field_i.e(20)) {
                            statePc = 122;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = (stateCaught_118 instanceof Exception ? 120 : 174);
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var4_ref2 = ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, true);
                        ((ug) this).field_k.a((kd) (Object) var4_ref2, (byte) -92, (long)param2);
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        stackOut_122_0 = null;
                        stackIn_123_0 = stackOut_122_0;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 123: {
                    return (si) (Object) stackIn_123_0;
                }
                case 124: {
                    try {
                        if (null == var5) {
                            statePc = 131;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = (stateCaught_124 instanceof RuntimeException ? 151 : 128);
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        stackOut_125_0 = (byte[]) var5;
                        stackIn_126_0 = stackOut_125_0;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = (stateCaught_125 instanceof RuntimeException ? 151 : 128);
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if ((stackIn_126_0.length ^ -1) >= -3) {
                            statePc = 131;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = (stateCaught_126 instanceof RuntimeException ? 151 : 130);
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = (stateCaught_127 instanceof RuntimeException ? 151 : 130);
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = (stateCaught_128 instanceof RuntimeException ? 151 : 130);
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = (stateCaught_129 instanceof RuntimeException ? 151 : 130);
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        uh.field_v.reset();
                        uh.field_v.update(var5, 0, -2 + var5.length);
                        var6_int = (int)uh.field_v.getValue();
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (var6_int == ((ug) this).field_z.field_r[param2]) {
                            statePc = 136;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = (stateCaught_133 instanceof RuntimeException ? 151 : 135);
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = (stateCaught_134 instanceof RuntimeException ? 151 : 135);
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (null == ((ug) this).field_z.field_o) {
                            statePc = 149;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = (stateCaught_136 instanceof RuntimeException ? 151 : 139);
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (null == ((ug) this).field_z.field_o[param2]) {
                            statePc = 149;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = (stateCaught_137 instanceof RuntimeException ? 151 : 139);
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var7 = ((ug) this).field_z.field_o[param2];
                        var8 = si.a(0, var5, -121, var5.length - 2);
                        var9 = 0;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (var9 >= 64) {
                            statePc = 149;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        stackOut_142_0 = var8[var9];
                        stackOut_142_1 = var7[var9];
                        stackIn_165_0 = stackOut_142_0;
                        stackIn_165_1 = stackOut_142_1;
                        stackIn_143_0 = stackOut_142_0;
                        stackIn_143_1 = stackOut_142_1;
                        if (var10 != 0) {
                            statePc = 165;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = (stateCaught_142 instanceof RuntimeException ? 151 : 145);
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (stackIn_143_0 == stackIn_143_1) {
                            statePc = 148;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = (stateCaught_143 instanceof RuntimeException ? 151 : 145);
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = (stateCaught_146 instanceof RuntimeException ? 151 : 147);
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var9++;
                        if (var10 == 0) {
                            statePc = 141;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        ((ug) this).field_i.field_p = 0;
                        ((ug) this).field_i.field_j = 0;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        var6_ref = (RuntimeException) (Object) caughtException;
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        ((ug) this).field_i.c(-28488);
                        ((si) (Object) var4_ref2).b((byte) -121);
                        if (!((si) (Object) var4_ref2).field_p) {
                            statePc = 159;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = (stateCaught_152 instanceof Exception ? 155 : 174);
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (!((ug) this).field_i.e(20)) {
                            statePc = 158;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = (stateCaught_153 instanceof Exception ? 157 : 174);
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = (stateCaught_154 instanceof Exception ? 157 : 174);
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = (stateCaught_155 instanceof Exception ? 157 : 174);
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = (stateCaught_156 instanceof Exception ? 157 : 174);
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        var4_ref2 = ((ug) this).field_i.a(5, ((ug) this).field_j, param2, (byte) 2, true);
                        ((ug) this).field_k.a((kd) (Object) var4_ref2, (byte) -75, (long)param2);
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        stackOut_159_0 = null;
                        stackIn_160_0 = stackOut_159_0;
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 160: {
                    return (si) (Object) stackIn_160_0;
                }
                case 161: {
                    try {
                        var5[-2 + var5.length] = (byte)(((ug) this).field_z.field_t[param2] >>> -1305027192);
                        var5[var5.length + -1] = (byte)((ug) this).field_z.field_t[param2];
                        if (((ug) this).field_B != null) {
                            statePc = 164;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = (stateCaught_161 instanceof RuntimeException ? 174 : 163);
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = (stateCaught_162 instanceof RuntimeException ? 174 : 163);
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        fj discarded$1 = ((ug) this).field_C.a(var5, param2, 1, ((ug) this).field_B);
                        stackOut_164_0 = ((ug) this).field_w[param2] ^ -1;
                        stackOut_164_1 = -2;
                        stackIn_165_0 = stackOut_164_0;
                        stackIn_165_1 = stackOut_164_1;
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        if (stackIn_165_0 != stackIn_165_1) {
                            statePc = 167;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        ((ug) this).field_w[param2] = (byte) 1;
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        if (!((si) (Object) var4_ref2).field_p) {
                            statePc = 171;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = (stateCaught_168 instanceof Exception ? 170 : 174);
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = (stateCaught_169 instanceof Exception ? 170 : 174);
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        ((si) (Object) var4_ref2).b((byte) -128);
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        stackOut_172_0 = (dc) var4_ref2;
                        stackIn_173_0 = stackOut_172_0;
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 173: {
                    return (si) (Object) stackIn_173_0;
                }
                case 174: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw ld.a((Throwable) (Object) var4, "ug.G(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_s = null;
              field_r = null;
              field_A = null;
              field_y = null;
              if (param0 == 64) {
                break L0;
              } else {
                field_y = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_q = null;
        }
    }

    ug(int param0, dl param1, dl param2, wb param3, kl param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
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
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((ug) this).field_k = new na(16);
                    ((ug) this).field_o = 0;
                    ((ug) this).field_l = new ng();
                    ((ug) this).field_h = 0L;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((ug) this).field_j = param0;
                        ((ug) this).field_B = param1;
                        if (((ug) this).field_B == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((ug) this).field_D = true;
                        ((ug) this).field_v = new ng();
                        if (!Lexicominos.field_L) {
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
                        ((ug) this).field_D = false;
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
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((ug) this).field_i = param3;
                        ((ug) this).field_n = param7;
                        ((ug) this).field_f = param2;
                        ((ug) this).field_g = param6;
                        ((ug) this).field_p = param5;
                        ((ug) this).field_e = param8;
                        ((ug) this).field_C = param4;
                        if (null == ((ug) this).field_f) {
                            statePc = 33;
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
                        ((ug) this).field_t = (si) (Object) ((ug) this).field_C.a(((ug) this).field_f, (byte) -6, ((ug) this).field_j);
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
                        statePc = 33;
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
                case 11: {
                    var10 = (RuntimeException) (Object) caughtException;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) var10;
                        stackOut_12_1 = new StringBuilder().append("ug.<init>(").append(param0).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param1 == null) {
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
                        stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
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
                    try {
                        stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                        stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        if (param4 == null) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                        stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                        stackOut_25_2 = "{...}";
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_28_2 = stackOut_25_2;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 27: {
                    stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                    stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                    stackOut_27_2 = "null";
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    stackIn_28_2 = stackOut_27_2;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    try {
                        stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                        stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44).append(param5).append(44);
                        stackIn_31_0 = stackOut_28_0;
                        stackIn_31_1 = stackOut_28_1;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        if (param6 == null) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                        stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                        stackOut_29_2 = "{...}";
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        stackIn_32_2 = stackOut_29_2;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 31: {
                    stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
                    stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
                    stackOut_31_2 = "null";
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    stackIn_32_2 = stackOut_31_2;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    throw ld.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param7 + 44 + param8 + 41);
                }
                case 33: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[16];
        field_u = 0.0;
        field_q = new dg();
        field_m = 0;
        field_s = "en-gb";
    }
}
