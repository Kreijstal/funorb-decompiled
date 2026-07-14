/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends ka {
    private boolean field_S;
    private int field_X;
    private boolean field_H;
    private int field_Z;
    private int field_M;
    private int field_V;
    private int field_w;
    private int field_n;
    private Geoblox field_p;
    private int field_K;
    int field_y;
    private int field_o;
    private int field_B;
    private int field_t;
    private int field_L;
    private int[] field_P;
    private int field_T;
    private boolean field_C;
    static String[] field_Q;
    private int field_N;
    private int field_s;
    private int field_Y;
    static int field_ab;
    private double field_A;
    private boolean field_E;
    private int field_D;
    private int field_u;
    private int field_I;
    private kl field_R;
    private int field_U;
    static String field_r;
    private int field_W;
    int field_q;
    private boolean field_v;
    static java.applet.Applet field_x;
    private int field_F;
    private int field_O;
    private int field_z;

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object stackIn_44_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_74_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_122_0 = 0;
        Object stackIn_132_0 = null;
        int stackIn_136_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_148_0 = 0;
        Object stackIn_158_0 = null;
        int stackIn_162_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_199_0 = 0;
        int stackIn_203_0 = 0;
        Object stackIn_213_0 = null;
        int stackIn_217_0 = 0;
        int stackIn_221_0 = 0;
        int stackIn_225_0 = 0;
        int stackIn_229_0 = 0;
        Object stackOut_43_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_73_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_121_0 = 0;
        Object stackOut_131_0 = null;
        int stackOut_135_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_147_0 = 0;
        Object stackOut_157_0 = null;
        int stackOut_161_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_202_0 = 0;
        Object stackOut_212_0 = null;
        int stackOut_216_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_228_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = t.field_i[((c) this).field_K][param0];
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3_int ^ -1) != -9) {
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
                        if (var4 == 0) {
                            statePc = 11;
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
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (-10 == (var3_int ^ -1)) {
                            statePc = 25;
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
                        statePc = 40;
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
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (102 == ki.field_d) {
                            statePc = 21;
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
                        if (-104 == (ki.field_d ^ -1)) {
                            statePc = 18;
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
                        super.a(param0, -53);
                        if (var4 == 0) {
                            statePc = 24;
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
                        j.field_gb = 80;
                        if (var4 == 0) {
                            statePc = 24;
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
                        j.field_gb = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.d(0);
                        if (var4 == 0) {
                            statePc = 242;
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
                        if (102 == ki.field_d) {
                            statePc = 37;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (103 == ki.field_d) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        super.a(param0, -70);
                        if (var4 == 0) {
                            statePc = 242;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
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
                        wg.a(-15346, 80);
                        if (var4 == 0) {
                            statePc = 242;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        wg.a(-15346, 0);
                        if (var4 == 0) {
                            statePc = 242;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (-14 != (ki.field_d ^ -1)) {
                            statePc = 67;
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
                        stackOut_43_0 = this;
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
                        if (((c) this).field_C) {
                            statePc = 67;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (((c) this).field_K != 1) {
                            statePc = 53;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ai.field_p = -1;
                        if (var4 == 0) {
                            statePc = 56;
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
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ai.field_p = oc.field_b;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((ai.field_p ^ -1) == (((c) this).field_K ^ -1)) {
                            statePc = 242;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (-2 == (((c) this).field_K ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackOut_60_0 = this;
                        stackIn_61_0 = stackOut_60_0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (((c) this).field_K != 0) {
                            statePc = 242;
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
                        oc.field_b = ((c) this).field_K;
                        if (var4 == 0) {
                            statePc = 242;
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
                        if (!((c) this).field_C) {
                            statePc = 239;
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
                        if ((ki.field_d ^ -1) == -85) {
                            statePc = 77;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackOut_73_0 = 83;
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
                        if (stackIn_74_0 != ki.field_d) {
                            statePc = 242;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (fh.c(-103)) {
                            statePc = 183;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if ((og.field_n ^ -1) < -1) {
                            statePc = 103;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackOut_83_0 = -1;
                        stackIn_84_0 = stackOut_83_0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (stackIn_84_0 == (((c) this).field_o ^ -1)) {
                            statePc = 180;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackOut_87_0 = -191;
                        stackIn_88_0 = stackOut_87_0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (stackIn_88_0 <= (qa.field_a ^ -1)) {
                            statePc = 103;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = qa.field_a;
                        stackIn_92_0 = stackOut_91_0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (stackIn_92_0 >= 449) {
                            statePc = 103;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        stackOut_95_0 = 265;
                        stackIn_96_0 = stackOut_95_0;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (stackIn_96_0 >= ue.field_e) {
                            statePc = 103;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackOut_99_0 = -300;
                        stackIn_100_0 = stackOut_99_0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (stackIn_100_0 < (ue.field_e ^ -1)) {
                            statePc = 180;
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
                        if (vl.field_n != null) {
                            statePc = 128;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (0 == ((c) this).field_o) {
                            statePc = 125;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        stackOut_109_0 = qa.field_a;
                        stackIn_110_0 = stackOut_109_0;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (stackIn_110_0 <= 260) {
                            statePc = 242;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        stackOut_113_0 = -381;
                        stackIn_114_0 = stackOut_113_0;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (stackIn_114_0 >= (qa.field_a ^ -1)) {
                            statePc = 242;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackOut_117_0 = ue.field_e;
                        stackIn_118_0 = stackOut_117_0;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (stackIn_118_0 <= 274) {
                            statePc = 242;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        stackOut_121_0 = -310;
                        stackIn_122_0 = stackOut_121_0;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (stackIn_122_0 >= (ue.field_e ^ -1)) {
                            statePc = 242;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        ((c) this).field_g = true;
                        ((c) this).field_C = false;
                        if (var4 == 0) {
                            statePc = 242;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (1 == ((c) this).field_o) {
                            statePc = 151;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        stackOut_131_0 = this;
                        stackIn_132_0 = stackOut_131_0;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if ((((c) this).field_o ^ -1) <= -1) {
                            statePc = 154;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        stackOut_135_0 = qa.field_a;
                        stackIn_136_0 = stackOut_135_0;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if ((stackIn_136_0 ^ -1) >= -351) {
                            statePc = 154;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        stackOut_139_0 = qa.field_a;
                        stackIn_140_0 = stackOut_139_0;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if ((stackIn_140_0 ^ -1) <= -471) {
                            statePc = 154;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        stackOut_143_0 = -328;
                        stackIn_144_0 = stackOut_143_0;
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (stackIn_144_0 <= (ue.field_e ^ -1)) {
                            statePc = 154;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        stackOut_147_0 = -363;
                        stackIn_148_0 = stackOut_147_0;
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (stackIn_148_0 >= (ue.field_e ^ -1)) {
                            statePc = 154;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        ((c) this).field_C = false;
                        boolean discarded$1 = em.b(255);
                        ((c) this).field_g = true;
                        if (var4 == 0) {
                            statePc = 242;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (-1 == (((c) this).field_o ^ -1)) {
                            statePc = 179;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        stackOut_157_0 = this;
                        stackIn_158_0 = stackOut_157_0;
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (((c) this).field_o >= 0) {
                            statePc = 242;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        stackOut_161_0 = -171;
                        stackIn_162_0 = stackOut_161_0;
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (stackIn_162_0 <= (qa.field_a ^ -1)) {
                            statePc = 242;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        stackOut_165_0 = -291;
                        stackIn_166_0 = stackOut_165_0;
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        if (stackIn_166_0 >= (qa.field_a ^ -1)) {
                            statePc = 242;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        stackOut_169_0 = ue.field_e;
                        stackIn_170_0 = stackOut_169_0;
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        if (stackIn_170_0 <= 327) {
                            statePc = 242;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        stackOut_173_0 = ue.field_e;
                        stackIn_174_0 = stackOut_173_0;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        if (stackIn_174_0 < 362) {
                            statePc = 179;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        statePc = 242;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        ((c) this).field_g = true;
                        ((c) this).field_C = false;
                        if (var4 == 0) {
                            statePc = 242;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        ((c) this).field_g = true;
                        ((c) this).field_C = false;
                        if (var4 == 0) {
                            statePc = 242;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        if (((c) this).field_o == 1) {
                            statePc = 206;
                        } else {
                            statePc = 184;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        stackOut_186_0 = -1;
                        stackIn_187_0 = stackOut_186_0;
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        if (stackIn_187_0 >= (((c) this).field_o ^ -1)) {
                            statePc = 209;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        stackOut_190_0 = qa.field_a;
                        stackIn_191_0 = stackOut_190_0;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if (stackIn_191_0 <= 350) {
                            statePc = 209;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        stackOut_194_0 = 470;
                        stackIn_195_0 = stackOut_194_0;
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        if (stackIn_195_0 <= qa.field_a) {
                            statePc = 209;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        stackOut_198_0 = -266;
                        stackIn_199_0 = stackOut_198_0;
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        if (stackIn_199_0 <= (ue.field_e ^ -1)) {
                            statePc = 209;
                        } else {
                            statePc = 200;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 205;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 205;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 205;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        stackOut_202_0 = ue.field_e;
                        stackIn_203_0 = stackOut_202_0;
                        statePc = 203;
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 205;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        if (stackIn_203_0 >= 299) {
                            statePc = 209;
                        } else {
                            statePc = 204;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        ((c) this).field_g = true;
                        ((c) this).field_C = false;
                        if (var4 == 0) {
                            statePc = 242;
                        } else {
                            statePc = 207;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 211;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        statePc = 209;
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 211;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 211;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        if (-1 == (((c) this).field_o ^ -1)) {
                            statePc = 234;
                        } else {
                            statePc = 210;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        statePc = 212;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        stackOut_212_0 = this;
                        stackIn_213_0 = stackOut_212_0;
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        if (((c) this).field_o >= 0) {
                            statePc = 242;
                        } else {
                            statePc = 214;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        stackOut_216_0 = -171;
                        stackIn_217_0 = stackOut_216_0;
                        statePc = 217;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        if (stackIn_217_0 <= (qa.field_a ^ -1)) {
                            statePc = 242;
                        } else {
                            statePc = 218;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        stackOut_220_0 = qa.field_a;
                        stackIn_221_0 = stackOut_220_0;
                        statePc = 221;
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        if ((stackIn_221_0 ^ -1) <= -291) {
                            statePc = 242;
                        } else {
                            statePc = 222;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 227;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 227;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 227;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        stackOut_224_0 = ue.field_e;
                        stackIn_225_0 = stackOut_224_0;
                        statePc = 225;
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 227;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        if (stackIn_225_0 <= 265) {
                            statePc = 242;
                        } else {
                            statePc = 226;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        statePc = 228;
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        stackOut_228_0 = -300;
                        stackIn_229_0 = stackOut_228_0;
                        statePc = 229;
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        if (stackIn_229_0 < (ue.field_e ^ -1)) {
                            statePc = 234;
                        } else {
                            statePc = 230;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 233;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        statePc = 232;
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 233;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 233;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        statePc = 242;
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 233;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        ((c) this).field_g = true;
                        if (null != el.field_o) {
                            statePc = 237;
                        } else {
                            statePc = 235;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 236;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        statePc = 238;
                        continue stateLoop;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 236;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        el.field_o.e((byte) -70);
                        statePc = 238;
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        el.field_i = 0;
                        ai.field_p = -1;
                        cd.field_j = 0;
                        if (var4 == 0) {
                            statePc = 242;
                        } else {
                            statePc = 239;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 241;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        super.a(param0, -100);
                        statePc = 240;
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 241;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        statePc = 242;
                        continue stateLoop;
                    } catch (Throwable stateCaught_240) {
                        caughtException = stateCaught_240;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        if (param1 <= -26) {
                            statePc = 248;
                        } else {
                            statePc = 243;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 245;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        ((c) this).c(59);
                        statePc = 244;
                        continue stateLoop;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 245;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        statePc = 248;
                        continue stateLoop;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 247: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var3, "c.M(" + param0 + 44 + param1 + 41);
                }
                case 248: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_23_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param0) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((c) this).field_F = 124;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((c) this).field_W = ((c) this).field_W % ee.field_A.field_s;
                        ((c) this).field_O = ((c) this).field_O % ee.field_A.field_o;
                        var2_int = -ee.field_A.field_s + ((c) this).field_W;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (640 <= var2_int) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = ee.field_A.field_o + ((c) this).field_O + 480;
                        stackIn_18_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var4 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3 = stackIn_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((-ee.field_A.field_o ^ -1) < (var3 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ee.field_A.c(var2_int, var3);
                        var3 = var3 - ee.field_A.field_o;
                        stackOut_10_0 = var4;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 != 0) {
                            statePc = 16;
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
                        if (var4 == 0) {
                            statePc = 9;
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
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var2_int = var2_int + ee.field_A.field_s;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var4 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((c) this).field_I = ((c) this).field_I % vc.field_j.field_o;
                        ((c) this).field_u = ((c) this).field_u % vc.field_j.field_s;
                        stackOut_17_0 = ((c) this).field_u + (vc.field_j.field_s + 640);
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var2_int = stackIn_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((-vc.field_j.field_s ^ -1) < (var2_int ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var4 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3 = ((c) this).field_I - -vc.field_j.field_o + 480;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((var3 ^ -1) > (-vc.field_j.field_o ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        vc.field_j.b(var2_int, var3);
                        var3 = var3 - vc.field_j.field_o;
                        stackOut_23_0 = var4;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 != 0) {
                            statePc = 29;
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
                        if (var4 == 0) {
                            statePc = 22;
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
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var2_int = var2_int - vc.field_j.field_s;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var4 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "c.I(" + param0 + 41);
                }
                case 32: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void g(byte param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((c) this).field_H) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((c) this).field_T < 0) {
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
                        statePc = 17;
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
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((c) this).field_T = ((c) this).field_T + 1;
                        if (var3 == 0) {
                            statePc = 17;
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
                        if (-4 < ((c) this).field_T) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
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
                        ((c) this).field_H = false;
                        if (var3 == 0) {
                            statePc = 17;
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
                        ((c) this).field_T = ((c) this).field_T - 1;
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
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param0 < -11) {
                            statePc = 23;
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
                        ((c) this).field_p = null;
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
                        statePc = 23;
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
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "c.Q(" + param0 + 41);
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_51_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_132_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_130_0 = 0;
        var12 = Geoblox.field_C;
        if (param0 == -28750) {
          L0: {
            this.b(false);
            var2_int = 270;
            var3 = 140;
            var4 = 400;
            if ((((c) this).field_K ^ -1) == -1) {
              break L0;
            } else {
              if (-2 == (((c) this).field_K ^ -1)) {
                break L0;
              } else {
                if ((((c) this).field_K ^ -1) != -5) {
                  L1: {
                    L2: {
                      if (2 != ((c) this).field_K) {
                        break L2;
                      } else {
                        var2_int = 235;
                        if (var12 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var2_int = 285;
                    break L1;
                  }
                  L3: {
                    L4: {
                      var5 = 120;
                      if ((((c) this).field_K ^ -1) != -4) {
                        break L4;
                      } else {
                        var5 += 10;
                        if (var12 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (-9 == (((c) this).field_K ^ -1)) {
                        break L5;
                      } else {
                        if ((((c) this).field_K ^ -1) == -8) {
                          break L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4 += 20;
                    var5 -= 10;
                    break L3;
                  }
                  ma.a(var3, var5, var2_int, (byte) -92, var4, ll.field_h);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L6: {
            if (((c) this).field_E) {
              break L6;
            } else {
              super.a(param0 + 0);
              break L6;
            }
          }
          L7: {
            L8: {
              if (-3 == (((c) this).field_K ^ -1)) {
                break L8;
              } else {
                if ((((c) this).field_K ^ -1) == -9) {
                  break L8;
                } else {
                  L9: {
                    L10: {
                      if (5 == ((c) this).field_K) {
                        break L10;
                      } else {
                        if (7 != ((c) this).field_K) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    kh.field_h[4].b(0, 20);
                    ac.a(false, false, (byte) -93);
                    if (var12 == 0) {
                      break L7;
                    } else {
                      break L9;
                    }
                  }
                  L11: {
                    if (-7 == (((c) this).field_K ^ -1)) {
                      break L11;
                    } else {
                      L12: {
                        if (((c) this).field_K != 4) {
                          break L12;
                        } else {
                          kh.field_h[8].b(0, 20);
                          ma.a(var3 + 10, 120, 100, (byte) -92, var4, ll.field_h);
                          var5 = 184;
                          dd.field_G.b(Geoblox.field_A, 320, var5, 0, -1);
                          var5 = 185;
                          int discarded$4 = fi.field_d.a(r.field_sb, 130, var5, 380, 300, 0, -1, 1, 0, 14);
                          ma.a(320, 120, 60, (byte) -92, var4, ll.field_h);
                          int discarded$5 = fi.field_d.a(bd.field_b, 130, 330, 380, 300, 0, -1, 1, 0, 14);
                          if (var12 == 0) {
                            break L7;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L13: {
                        if ((((c) this).field_K ^ -1) == -4) {
                          break L13;
                        } else {
                          L14: {
                            kh.field_h[0].b(0, 20);
                            if (((c) this).field_K == 0) {
                              break L14;
                            } else {
                              if (((c) this).field_K != 1) {
                                break L7;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if (((c) this).field_C) {
                            L15: {
                              if (!fh.c(-93)) {
                                break L15;
                              } else {
                                L16: {
                                  if (((c) this).field_y <= 200) {
                                    stackOut_50_0 = ((c) this).field_y;
                                    stackIn_51_0 = stackOut_50_0;
                                    break L16;
                                  } else {
                                    stackOut_49_0 = 200;
                                    stackIn_51_0 = stackOut_49_0;
                                    break L16;
                                  }
                                }
                                L17: {
                                  L18: {
                                    var5 = stackIn_51_0;
                                    vb.b(0, 0, 640, 480, 0, var5);
                                    ma.a(160, 150, 80, (byte) -92, 340, ll.field_h);
                                    var6 = 170;
                                    int discarded$6 = fi.field_d.a(ki.field_a, 160, var6, 320, 300, 0, -1, 1, 0, 16);
                                    var7 = 100;
                                    var8 = -(20 + var7 >> 374422529) + 410;
                                    var6 = 265;
                                    var9 = var8 - (-(var7 >> -1761100895) - 10);
                                    ma.a(var6, var8, 36, (byte) -92, 20 + var7, eb.field_g);
                                    if (1 == ((c) this).field_o) {
                                      break L18;
                                    } else {
                                      if (((c) this).field_o >= 0) {
                                        break L17;
                                      } else {
                                        if (350 >= qa.field_a) {
                                          break L17;
                                        } else {
                                          if (qa.field_a >= 470) {
                                            break L17;
                                          } else {
                                            if (-266 <= (ue.field_e ^ -1)) {
                                              break L17;
                                            } else {
                                              if (ue.field_e >= 299) {
                                                break L17;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  dd.field_G.field_K[0][wf.field_p] = 15488514;
                                  break L17;
                                }
                                L19: {
                                  L20: {
                                    dd.field_G.b(hh.field_b, var9, 30 + var6, 0, -1);
                                    var8 = 320 - (20 + var7 >> -708984479) - 90;
                                    dd.field_G.field_K[0][wf.field_p] = 16689938;
                                    var6 = 265;
                                    var9 = 10 + (var7 >> -733174591) + var8;
                                    ma.a(var6, var8, 36, (byte) -92, var7 + 20, eb.field_g);
                                    if (((c) this).field_o == 0) {
                                      break L20;
                                    } else {
                                      if (0 <= ((c) this).field_o) {
                                        break L19;
                                      } else {
                                        if (170 >= qa.field_a) {
                                          break L19;
                                        } else {
                                          if (-291 >= (qa.field_a ^ -1)) {
                                            break L19;
                                          } else {
                                            if ((ue.field_e ^ -1) >= -266) {
                                              break L19;
                                            } else {
                                              if (ue.field_e >= 299) {
                                                break L19;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  dd.field_G.field_K[0][wf.field_p] = 15488514;
                                  break L19;
                                }
                                dd.field_G.b(qb.field_L, var9, 30 + var6, 0, -1);
                                dd.field_G.field_K[0][wf.field_p] = 16689938;
                                if (var12 == 0) {
                                  break L7;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            L21: {
                              if (-1 <= (og.field_n ^ -1)) {
                                break L21;
                              } else {
                                L22: {
                                  if (vl.field_n != null) {
                                    break L22;
                                  } else {
                                    L23: {
                                      if (-201 > (((c) this).field_y ^ -1)) {
                                        stackOut_83_0 = 200;
                                        stackIn_84_0 = stackOut_83_0;
                                        break L23;
                                      } else {
                                        stackOut_82_0 = ((c) this).field_y;
                                        stackIn_84_0 = stackOut_82_0;
                                        break L23;
                                      }
                                    }
                                    L24: {
                                      L25: {
                                        var5 = stackIn_84_0;
                                        vb.b(0, 0, 640, 480, 0, var5);
                                        ma.a(160, 160, 95, (byte) -92, 320, ll.field_h);
                                        var6 = 170;
                                        var6 = var6 + 16 * fi.field_d.a(sj.field_e, 170, var6, 300, 300, 0, -1, 1, 0, 16);
                                        var6 += 40;
                                        var7 = 100;
                                        var8 = 320 + -(var7 + 20 >> 1183785761);
                                        var9 = (var7 >> 360391297) + (var8 + 10);
                                        ma.a(var6, var8, 36, (byte) -92, 20 + var7, eb.field_g);
                                        if (0 == ((c) this).field_o) {
                                          break L25;
                                        } else {
                                          if (260 >= qa.field_a) {
                                            break L24;
                                          } else {
                                            if (-381 >= (qa.field_a ^ -1)) {
                                              break L24;
                                            } else {
                                              if (-275 <= (ue.field_e ^ -1)) {
                                                break L24;
                                              } else {
                                                if ((ue.field_e ^ -1) <= -310) {
                                                  break L24;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      dd.field_G.field_K[0][wf.field_p] = 15488514;
                                      break L24;
                                    }
                                    dd.field_G.b(hh.field_b, var9, 30 + var6, 0, -1);
                                    dd.field_G.field_K[0][wf.field_p] = 16689938;
                                    if (var12 == 0) {
                                      break L7;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                                L26: {
                                  if (-201 <= (((c) this).field_y ^ -1)) {
                                    stackOut_98_0 = ((c) this).field_y;
                                    stackIn_99_0 = stackOut_98_0;
                                    break L26;
                                  } else {
                                    stackOut_97_0 = 200;
                                    stackIn_99_0 = stackOut_97_0;
                                    break L26;
                                  }
                                }
                                L27: {
                                  L28: {
                                    var5 = stackIn_99_0;
                                    vb.b(0, 0, 640, 480, 0, var5);
                                    ma.a(160, 160, 140, (byte) -92, 320, ll.field_h);
                                    var6 = 170;
                                    var7_ref = ue.field_c + " " + pb.field_v + " " + wj.field_C + " " + rb.field_a + " " + uj.field_d;
                                    var6 = var6 + 16 * fi.field_d.a(var7_ref, 170, var6, 300, 300, 0, -1, 1, 0, 16);
                                    var6 += 10;
                                    var8_ref = Integer.toString((1500 - ((c) this).field_y) / 150 - -1);
                                    if (-1 > ((1500 - ((c) this).field_y) / 150 ^ -1)) {
                                      break L28;
                                    } else {
                                      var6 = var6 + fi.field_d.a(wj.a(mj.field_c, new String[1], (byte) -51), 170, var6, 300, 300, 0, -1, 1, 0, 16) * 16;
                                      if (var12 == 0) {
                                        break L27;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  var6 = var6 + fi.field_d.a(wj.a(jk.field_b, new String[1], (byte) -45), 170, var6, 300, 300, 0, -1, 1, 0, 16) * 16;
                                  break L27;
                                }
                                L29: {
                                  L30: {
                                    var6 += 40;
                                    var9 = 100;
                                    var10 = -(20 + var9 >> -968821055) + 320 - -90;
                                    ma.a(var6, var10, 36, (byte) -92, var9 - -20, eb.field_g);
                                    var11 = 10 + ((var9 >> 1030901409) + var10);
                                    if (-2 == (((c) this).field_o ^ -1)) {
                                      break L30;
                                    } else {
                                      if (0 <= ((c) this).field_o) {
                                        break L29;
                                      } else {
                                        if ((qa.field_a ^ -1) >= -351) {
                                          break L29;
                                        } else {
                                          if (-471 >= (qa.field_a ^ -1)) {
                                            break L29;
                                          } else {
                                            if ((ue.field_e ^ -1) >= -318) {
                                              break L29;
                                            } else {
                                              if ((ue.field_e ^ -1) > -353) {
                                                break L30;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  dd.field_G.field_K[0][wf.field_p] = 15488514;
                                  break L29;
                                }
                                L31: {
                                  L32: {
                                    dd.field_G.b(rb.field_a, var11, 30 + var6, 0, -1);
                                    dd.field_G.field_K[0][wf.field_p] = 16689938;
                                    var10 = 320 + -(20 + var9 >> -1873231487) - 90;
                                    var11 = 10 + (var9 >> 687806689) + var10;
                                    ma.a(var6, var10, 36, (byte) -92, 20 + var9, eb.field_g);
                                    if (-1 == (((c) this).field_o ^ -1)) {
                                      break L32;
                                    } else {
                                      if (((c) this).field_o >= 0) {
                                        break L31;
                                      } else {
                                        if ((qa.field_a ^ -1) >= -171) {
                                          break L31;
                                        } else {
                                          if (qa.field_a >= 290) {
                                            break L31;
                                          } else {
                                            if (ue.field_e <= 317) {
                                              break L31;
                                            } else {
                                              if (ue.field_e >= 352) {
                                                break L31;
                                              } else {
                                                break L32;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  dd.field_G.field_K[0][wf.field_p] = 15488514;
                                  break L31;
                                }
                                dd.field_G.b(pb.field_v, var11, 30 + var6, 0, -1);
                                dd.field_G.field_K[0][wf.field_p] = 16689938;
                                if (var12 == 0) {
                                  break L7;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            L33: {
                              if (((c) this).field_y > 200) {
                                stackOut_131_0 = 200;
                                stackIn_132_0 = stackOut_131_0;
                                break L33;
                              } else {
                                stackOut_130_0 = ((c) this).field_y;
                                stackIn_132_0 = stackOut_130_0;
                                break L33;
                              }
                            }
                            L34: {
                              L35: {
                                var5 = stackIn_132_0;
                                vb.b(0, 0, 640, 480, 0, var5);
                                ma.a(170, 160, 80, (byte) -92, 320, ll.field_h);
                                var6 = 180;
                                int discarded$7 = fi.field_d.a(ki.field_a, 170, var6, 300, 300, 0, -1, 1, 0, 16);
                                var7 = 242;
                                var8 = 320 - (var7 + 20 >> -1731032895);
                                var9 = 10 + (var8 + (var7 >> -1298819903));
                                var6 = 265;
                                ma.a(var6, var8, 36, (byte) -92, var7 + 20, eb.field_g);
                                if (-1 == (((c) this).field_o ^ -1)) {
                                  break L35;
                                } else {
                                  if (-191 <= (qa.field_a ^ -1)) {
                                    break L34;
                                  } else {
                                    if ((qa.field_a ^ -1) <= -450) {
                                      break L34;
                                    } else {
                                      if (-266 <= (ue.field_e ^ -1)) {
                                        break L34;
                                      } else {
                                        if (299 <= ue.field_e) {
                                          break L34;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              dd.field_G.field_K[0][wf.field_p] = 15488514;
                              break L34;
                            }
                            dd.field_G.b(hh.field_b, var9, 30 + var6, 0, -1);
                            dd.field_G.field_K[0][wf.field_p] = 16689938;
                            if (var12 == 0) {
                              break L7;
                            } else {
                              break L13;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      L36: {
                        kh.field_h[5].b(0, 20);
                        if (((c) this).field_E) {
                          break L36;
                        } else {
                          this.b(-97, ((c) this).field_q);
                          if (var12 == 0) {
                            break L7;
                          } else {
                            break L36;
                          }
                        }
                      }
                      L37: {
                        L38: {
                          var5 = ((c) this).field_F;
                          if (((c) this).field_v) {
                            break L38;
                          } else {
                            var5 = 640 + -var5;
                            vb.e(0, 0, var5, 480);
                            this.b(-85, ((c) this).field_n);
                            ((c) this).field_S = true;
                            super.a(-28750);
                            ((c) this).field_S = false;
                            vb.e(var5, 0, 640, 480);
                            this.b(param0 ^ 28757, ((c) this).field_q);
                            super.a(-28750);
                            vb.e(0, 0, 640, 480);
                            qj.field_c.b((qj.field_c.field_o >> -182880703) + var5, 240, -49150, 4096);
                            if (var12 == 0) {
                              break L37;
                            } else {
                              break L38;
                            }
                          }
                        }
                        vb.e(var5, 0, 640, 480);
                        this.b(-17, ((c) this).field_n);
                        ((c) this).field_S = true;
                        super.a(-28750);
                        ((c) this).field_S = false;
                        vb.e(0, 0, var5, 480);
                        this.b(-48, ((c) this).field_q);
                        super.a(-28750);
                        vb.e(0, 0, 640, 480);
                        qj.field_c.b(-(qj.field_c.field_o >> 1729526785) + var5, 240, -16383, 4096);
                        break L37;
                      }
                      if (var12 == 0) {
                        break L7;
                      } else {
                        break L11;
                      }
                    }
                  }
                  kh.field_h[7].b(0, 20);
                  ac.a(false, true, (byte) -122);
                  if (var12 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
            }
            this.b(30);
            break L7;
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 121 % ((44 - param1) / 36);
                        var4 = t.field_i[((c) this).field_K][param0];
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var4 ^ -1) != -9) {
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
                        if (var5 == 0) {
                            statePc = 11;
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
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (9 == var4) {
                            statePc = 18;
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
                        statePc = 29;
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
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((j.field_gb ^ -1) >= -11) {
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
                        j.field_gb = j.field_gb - 10;
                        if (var5 == 0) {
                            statePc = 29;
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
                        j.field_gb = 0;
                        if (var5 == 0) {
                            statePc = 29;
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
                        if (oc.field_c <= 10) {
                            statePc = 24;
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
                        wg.a(-15346, oc.field_c - 10);
                        if (var5 == 0) {
                            statePc = 29;
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
                        wg.a(-15346, 0);
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
                        statePc = 29;
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
                case 28: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) runtimeException, "c.N(" + param0 + 44 + param1 + 41);
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(byte param0) {
        try {
            field_Q = null;
            field_x = null;
            field_r = null;
            if (param0 != 28) {
                char discarded$0 = c.c(79, (byte) -113);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "c.S(" + param0 + 41);
        }
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_7_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_38_0 = 0;
        Object stackOut_6_0 = null;
        int stackOut_13_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_37_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 < -40) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.b(77, -13);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (3 != ((c) this).field_K) {
                            statePc = 49;
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
                        stackOut_6_0 = this;
                        stackIn_7_0 = stackOut_6_0;
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
                        if (((c) this).field_E) {
                            statePc = 49;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
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
                        if (-5 == (((c) this).field_q ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = -4;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 == (((c) this).field_b ^ -1)) {
                            statePc = 44;
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
                        if (4 != ((c) this).field_q) {
                            statePc = 34;
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
                        if (((c) this).field_b == 2) {
                            statePc = 25;
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
                        statePc = 23;
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
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((c) this).field_b = 3;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (oc.field_b != 1) {
                            statePc = 49;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = -4;
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
                        if (stackIn_28_0 == (((c) this).field_b ^ -1)) {
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
                        statePc = 49;
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
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ((c) this).field_b = 0;
                        if (var3 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((((c) this).field_q ^ -1) != -1) {
                            statePc = 49;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
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
                        stackOut_37_0 = -1;
                        stackIn_38_0 = stackOut_37_0;
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
                        if (stackIn_38_0 == (((c) this).field_b ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((c) this).field_b = 1;
                        if (var3 == 0) {
                            statePc = 49;
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
                        ((c) this).field_b = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 49;
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
                case 48: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "c.C(" + param0 + 41);
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        Object stackIn_5_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_172_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_197_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_208_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_216_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_215_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2 >= 20) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = -109;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0;
                }
                case 3: {
                    try {
                        if (0 == ((c) this).field_K) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((c) this).field_K != 1) {
                            statePc = 21;
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
                        if (param0 < 149) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 490;
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
                        if (stackIn_12_0 < param0) {
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
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 19;
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
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = -1;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0;
                }
                case 19: {
                    try {
                        stackOut_19_0 = super.a(param0, param1, (byte) 127);
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0;
                }
                case 21: {
                    try {
                        if (-4 == (((c) this).field_K ^ -1)) {
                            statePc = 159;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-6 != (((c) this).field_K ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (param1 <= 435) {
                            statePc = 215;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = 470;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 <= param1) {
                            statePc = 215;
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
                        stackOut_32_0 = param0;
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
                        if ((stackIn_33_0 ^ -1) >= -280) {
                            statePc = 215;
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
                        if (361 <= param0) {
                            statePc = 215;
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
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return stackIn_40_0;
                }
                case 41: {
                    try {
                        if ((((c) this).field_K ^ -1) == -8) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = -9;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (stackIn_43_0 != (((c) this).field_K ^ -1)) {
                            statePc = 67;
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
                case 46: {
                    try {
                        if (param1 <= 437) {
                            statePc = 215;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = param1;
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
                        if ((stackIn_50_0 ^ -1) > -474) {
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
                        statePc = 215;
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
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((param0 ^ -1) >= -122) {
                            statePc = 61;
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
                        if (356 <= param0) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
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
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 217;
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
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 60: {
                    return stackIn_60_0;
                }
                case 61: {
                    try {
                        if (436 >= param0) {
                            statePc = 215;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (-519 >= (param1 ^ -1)) {
                            statePc = 215;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = 1;
                        stackIn_66_0 = stackOut_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 66: {
                    return stackIn_66_0;
                }
                case 67: {
                    try {
                        if (2 == ((c) this).field_K) {
                            statePc = 117;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (((c) this).field_K != 4) {
                            statePc = 92;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((param0 ^ -1) >= -172) {
                            statePc = 215;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = param0;
                        stackIn_75_0 = stackOut_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (stackIn_75_0 < 469) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (265 >= param1) {
                            statePc = 86;
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
                        if (-302 >= (param1 ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 82;
                        }
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
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackOut_84_0 = 0;
                        stackIn_85_0 = stackOut_84_0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 85: {
                    return stackIn_85_0;
                }
                case 86: {
                    try {
                        if (-396 <= (param1 ^ -1)) {
                            statePc = 215;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (431 <= param1) {
                            statePc = 215;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackOut_90_0 = 1;
                        stackIn_91_0 = stackOut_90_0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 91: {
                    return stackIn_91_0;
                }
                case 92: {
                    try {
                        if (6 != ((c) this).field_K) {
                            statePc = 215;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (param1 <= 430) {
                            statePc = 215;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackOut_96_0 = 470;
                        stackIn_97_0 = stackOut_96_0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (stackIn_97_0 <= param1) {
                            statePc = 215;
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
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (param0 <= 146) {
                            statePc = 108;
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
                        if (param0 >= 306) {
                            statePc = 108;
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
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackOut_106_0 = 0;
                        stackIn_107_0 = stackOut_106_0;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 107: {
                    return stackIn_107_0;
                }
                case 108: {
                    try {
                        if (param0 <= 326) {
                            statePc = 215;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        stackOut_109_0 = -487;
                        stackIn_110_0 = stackOut_109_0;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (stackIn_110_0 < (param0 ^ -1)) {
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
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackOut_115_0 = 1;
                        stackIn_116_0 = stackOut_115_0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 116: {
                    return stackIn_116_0;
                }
                case 117: {
                    try {
                        if (-381 <= (param1 ^ -1)) {
                            statePc = 145;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackOut_118_0 = param1;
                        stackIn_119_0 = stackOut_118_0;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if ((stackIn_119_0 ^ -1) <= -421) {
                            statePc = 145;
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
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (-62 <= (param0 ^ -1)) {
                            statePc = 129;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        stackOut_125_0 = 220;
                        stackIn_126_0 = stackOut_125_0;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (stackIn_126_0 > param0) {
                            statePc = 143;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if (241 >= param0) {
                            statePc = 137;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (param0 >= 400) {
                            statePc = 137;
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
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        stackOut_135_0 = 1;
                        stackIn_136_0 = stackOut_135_0;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 136: {
                    return stackIn_136_0;
                }
                case 137: {
                    try {
                        if (-421 <= (param0 ^ -1)) {
                            statePc = 215;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if ((param0 ^ -1) <= -580) {
                            statePc = 215;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        stackOut_141_0 = 2;
                        stackIn_142_0 = stackOut_141_0;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 142: {
                    return stackIn_142_0;
                }
                case 143: {
                    try {
                        stackOut_143_0 = 0;
                        stackIn_144_0 = stackOut_143_0;
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 144: {
                    return stackIn_144_0;
                }
                case 145: {
                    try {
                        if (-431 <= (param1 ^ -1)) {
                            statePc = 215;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        stackOut_146_0 = param1;
                        stackIn_147_0 = stackOut_146_0;
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (stackIn_147_0 >= 470) {
                            statePc = 215;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        stackOut_150_0 = param0;
                        stackIn_151_0 = stackOut_150_0;
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if (stackIn_151_0 <= 279) {
                            statePc = 215;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (-363 >= (param0 ^ -1)) {
                            statePc = 215;
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
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        stackOut_157_0 = 3;
                        stackIn_158_0 = stackOut_157_0;
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 158: {
                    return stackIn_158_0;
                }
                case 159: {
                    try {
                        if ((param1 ^ -1) >= -431) {
                            statePc = 215;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        stackOut_160_0 = param1;
                        stackIn_161_0 = stackOut_160_0;
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        if ((stackIn_161_0 ^ -1) <= -471) {
                            statePc = 215;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if ((((c) this).field_q ^ -1) == -1) {
                            statePc = 179;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        stackOut_167_0 = param0;
                        stackIn_168_0 = stackOut_167_0;
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        if ((stackIn_168_0 ^ -1) >= -131) {
                            statePc = 179;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 174;
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
                        stackOut_171_0 = param0;
                        stackIn_172_0 = stackOut_171_0;
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
                        if ((stackIn_172_0 ^ -1) > -254) {
                            statePc = 177;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        stackOut_177_0 = 0;
                        stackIn_178_0 = stackOut_177_0;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 178: {
                    return stackIn_178_0;
                }
                case 179: {
                    try {
                        if (param0 <= 268) {
                            statePc = 185;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if (391 <= param0) {
                            statePc = 185;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        stackOut_183_0 = 1;
                        stackIn_184_0 = stackOut_183_0;
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 184: {
                    return stackIn_184_0;
                }
                case 185: {
                    try {
                        if ((((c) this).field_q ^ -1) == -5) {
                            statePc = 198;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        stackOut_186_0 = -407;
                        stackIn_187_0 = stackOut_186_0;
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        if (stackIn_187_0 <= (param0 ^ -1)) {
                            statePc = 198;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        stackOut_190_0 = param0;
                        stackIn_191_0 = stackOut_190_0;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if ((stackIn_191_0 ^ -1) > -530) {
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
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        stackOut_196_0 = 2;
                        stackIn_197_0 = stackOut_196_0;
                        statePc = 197;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 197: {
                    return stackIn_197_0;
                }
                case 198: {
                    try {
                        if (((c) this).field_q != 4) {
                            statePc = 215;
                        } else {
                            statePc = 199;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        stackOut_199_0 = oc.field_b;
                        stackIn_200_0 = stackOut_199_0;
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        if (stackIn_200_0 == 1) {
                            statePc = 215;
                        } else {
                            statePc = 201;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        statePc = 203;
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        stackOut_203_0 = param0;
                        stackIn_204_0 = stackOut_203_0;
                        statePc = 204;
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        if ((stackIn_204_0 ^ -1) >= -407) {
                            statePc = 215;
                        } else {
                            statePc = 205;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 210;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 210;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 210;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        stackOut_207_0 = param0;
                        stackIn_208_0 = stackOut_207_0;
                        statePc = 208;
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 210;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        if ((stackIn_208_0 ^ -1) > -636) {
                            statePc = 213;
                        } else {
                            statePc = 209;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        statePc = 211;
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        stackOut_213_0 = 3;
                        stackIn_214_0 = stackOut_213_0;
                        statePc = 214;
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 214: {
                    return stackIn_214_0;
                }
                case 215: {
                    try {
                        stackOut_215_0 = -1;
                        stackIn_216_0 = stackOut_215_0;
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 216: {
                    return stackIn_216_0;
                }
                case 217: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var4, "c.P(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0) {
        RuntimeException var2 = null;
        String var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        String[] var3_ref_String__ = null;
        bg var4 = null;
        int[] var5 = null;
        String var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        String[] stackIn_43_1 = null;
        Object stackIn_51_0 = null;
        int[] stackIn_55_0 = null;
        Object stackIn_69_0 = null;
        Object stackIn_71_0 = null;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_41_0 = null;
        Object stackOut_42_0 = null;
        String[] stackOut_42_1 = null;
        Object stackOut_50_0 = null;
        int[] stackOut_54_0 = null;
        Object stackOut_68_0 = null;
        Object stackOut_69_0 = null;
        int stackOut_72_0 = 0;
        int stackOut_76_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ca.field_f != null) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = -115;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (fh.c(stackIn_3_0)) {
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
                        ca.field_f = qb.b(22, 1, 0, 10, 3);
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
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (0 == da.field_c) {
                            statePc = 22;
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
                        if (-3 == (da.field_c ^ -1)) {
                            statePc = 19;
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
                        if (da.field_c != 1) {
                            statePc = 25;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        kh.field_h[3].b(0, 20);
                        if (var10 == 0) {
                            statePc = 25;
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
                        kh.field_h[2].b(0, 20);
                        if (var10 == 0) {
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
                        kh.field_h[1].b(0, 20);
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
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (param0 == 30) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ((c) this).c(-78);
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
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (null == ca.field_f) {
                            statePc = 86;
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
                        if (stackIn_31_0 == (Object) (Object) ca.field_f.field_k) {
                            statePc = 86;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
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
                        if (ca.field_f.field_j) {
                            statePc = 38;
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
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var2_ref = eb.field_f;
                        var3 = 76 + (150 + dd.field_G.field_o);
                        dd.field_G.b(var2_ref, 322, var3, 0, -1);
                        if (var10 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var2_int = 0;
                        var3_ref_String__ = ca.field_f.field_k[da.field_c];
                        var4 = fi.field_d;
                        if (var3_ref_String__ == null) {
                            statePc = 83;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var5 = ca.field_f.field_h[da.field_c];
                        var6 = var4.field_o + 150;
                        var7 = 0;
                        var8_int = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var8_int >= 10) {
                            statePc = 67;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = null;
                        stackIn_71_0 = stackOut_41_0;
                        stackIn_42_0 = stackOut_41_0;
                        if (var10 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = stackIn_42_0;
                        stackOut_42_1 = (String[]) var3_ref_String__;
                        stackIn_43_0 = stackOut_42_0;
                        stackIn_43_1 = stackOut_42_1;
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
                        if (stackIn_43_0 != (Object) (Object) stackIn_43_1[var8_int]) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 66;
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
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var2_int = 1;
                        var9 = var3_ref_String__[var8_int];
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var7 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
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
                        if (stackIn_51_0 == (Object) (Object) el.field_o) {
                            statePc = 63;
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
                        stackOut_54_0 = (int[]) var5;
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
                        if (stackIn_55_0[var8_int] != Math.abs(el.field_o.field_o)) {
                            statePc = 63;
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
                        if (!ge.a(var9, (byte) 12)) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
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
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var7 = 1;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var4.c(1 + var8_int + ". ", 165, var6, 16610816, -1);
                        var4.a(var9, 165, var6, 16610816, -1);
                        var4.c(Integer.toString(var5[var8_int]), 500, var6, 16610816, -1);
                        if (var10 == 0) {
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
                        var4.c(1 + var8_int + ". ", 165, var6, 1, -1);
                        var4.a(var9, 165, var6, 1, -1);
                        var4.c(Integer.toString(var5[var8_int]), 500, var6, 1, -1);
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
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var6 += 15;
                        var8_int++;
                        if (var10 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var7 != 0) {
                            statePc = 83;
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
                        stackOut_68_0 = null;
                        stackIn_69_0 = stackOut_68_0;
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
                        stackOut_69_0 = stackIn_69_0;
                        stackIn_71_0 = stackOut_69_0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (stackIn_71_0 == (Object) (Object) el.field_o) {
                            statePc = 83;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = -1;
                        stackIn_73_0 = stackOut_72_0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (stackIn_73_0 == (el.field_o.field_o ^ -1)) {
                            statePc = 83;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackOut_76_0 = 2147483647;
                        stackIn_77_0 = stackOut_76_0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (stackIn_77_0 != (el.field_o.field_o ^ -1)) {
                            statePc = 82;
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
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var8 = wd.field_f;
                        var4.a(var8, 165, var6, 16724225, -1);
                        var4.c(Integer.toString(Math.abs(el.field_o.field_o)), 500, var6, 16724225, -1);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var2_int != 0) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var5_ref = sb.field_f;
                        var6 = 76 + dd.field_G.field_o + 150;
                        dd.field_G.b(var5_ref, 322, var6, 0, -1);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var10 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (fh.c(-89)) {
                            statePc = 90;
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
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var2_ref = g.field_l;
                        if (var10 == 0) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var2_ref = sb.field_f;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var3 = 150 - (-dd.field_G.field_o - 76);
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        dd.field_G.b(var2_ref, 322, var3, 0, -1);
                        if (!fh.c(param0 + -147)) {
                            statePc = 96;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        int discarded$2 = dd.field_G.a(ni.field_C, 125, 350, 395, 100, 0, -1, 1, 0, 26);
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (fh.c(param0 ^ -109)) {
                            statePc = 100;
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
                        var2_ref = ue.field_b;
                        int discarded$3 = fi.field_d.a(var2_ref, 140, 325, 360, 300, 0, -1, 1, 0, 16);
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 99: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "c.U(" + param0 + 41);
                }
                case 100: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void h(byte param0) {
        float var2_float = 0.0f;
        int var2_int = 0;
        int var3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          ((c) this).field_D = ((c) this).field_D + 1;
          if (-1 == ((((c) this).field_D + 1) % 5 ^ -1)) {
            ((c) this).field_O = ((c) this).field_O - 1;
            ((c) this).field_W = ((c) this).field_W + 1;
            this.g((byte) -102);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (3 != (((c) this).field_D & 3)) {
            break L1;
          } else {
            ((c) this).field_I = ((c) this).field_I - 1;
            ((c) this).field_u = ((c) this).field_u - 1;
            break L1;
          }
        }
        if (!((c) this).field_E) {
          L2: {
            jk.field_a = ((c) this).field_C;
            ((c) this).field_U = ((c) this).field_U + 1;
            ((c) this).field_y = ((c) this).field_y + 1;
            if (!((c) this).field_C) {
              break L2;
            } else {
              if (vl.field_n == null) {
                break L2;
              } else {
                if (((c) this).field_y <= 1500) {
                  break L2;
                } else {
                  boolean discarded$2 = em.b(255);
                  ((c) this).field_C = false;
                  break L2;
                }
              }
            }
          }
          L3: while (true) {
            L4: {
              L5: {
                if (!hh.a(108)) {
                  break L5;
                } else {
                  this.b((byte) 62);
                  if (var3 != 0) {
                    break L4;
                  } else {
                    if (var3 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              if (((c) this).field_K != 3) {
                break L4;
              } else {
                if (((c) this).field_b != 0) {
                  break L4;
                } else {
                  if (-1 != (((c) this).field_q ^ -1)) {
                    break L4;
                  } else {
                    if (((c) this).field_H) {
                      break L4;
                    } else {
                      ((c) this).field_b = ((c) this).field_b + 1;
                      break L4;
                    }
                  }
                }
              }
            }
            L6: {
              if (((c) this).field_K == 3) {
                L7: {
                  if (0 == (1 & ((c) this).field_D)) {
                    L8: {
                      ((c) this).field_z = ((c) this).field_z + 1;
                      ((c) this).field_Z = -(((c) this).field_z >> -137754207) + 60;
                      if ((((c) this).field_Z ^ -1) <= -16) {
                        break L8;
                      } else {
                        ((c) this).field_Z = 15;
                        if (var3 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    ((c) this).field_A = ((c) this).field_A + 0.1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L9: {
                  if (120 == ((c) this).field_z) {
                    ((c) this).field_X = qi.b(7, 1);
                    ((c) this).field_L = qi.b(7, 1);
                    ((c) this).field_z = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (-5 < (((c) this).field_q ^ -1)) {
                    if (((c) this).field_D % 24 == 0) {
                      ((c) this).field_w = ((c) this).field_w + 1;
                      if (-5 >= (((c) this).field_w ^ -1)) {
                        ((c) this).field_w = 0;
                        break L10;
                      } else {
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    if ((((c) this).field_q ^ -1) == -4) {
                      break L12;
                    } else {
                      if (4 == ((c) this).field_q) {
                        L13: {
                          if (49 <= (((c) this).field_D & 255)) {
                            break L13;
                          } else {
                            if (-1 == (15 & ((c) this).field_D ^ -1)) {
                              L14: {
                                ((c) this).field_w = ((c) this).field_w + 1;
                                if ((((c) this).field_w ^ -1) > -5) {
                                  break L14;
                                } else {
                                  ((c) this).field_w = 0;
                                  break L14;
                                }
                              }
                              ((c) this).field_B = ((c) this).field_B + 1;
                              if (4 <= ((c) this).field_B) {
                                ((c) this).field_B = 0;
                                if (var3 == 0) {
                                  break L11;
                                } else {
                                  break L13;
                                }
                              } else {
                                break L11;
                              }
                            } else {
                              break L11;
                            }
                          }
                        }
                        ((c) this).field_B = 0;
                        ((c) this).field_w = 0;
                        if (var3 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  var2_float = 0.019999999552965164f * (float)(((c) this).field_D % 50);
                  ((c) this).field_N = ((int)(var2_float * (float)((c) this).field_t) << -1025150840) + (jg.field_h[field_ab][((c) this).field_B] - -((int)(var2_float * (float)((c) this).field_V) << -774715792) + (int)((float)((c) this).field_M * var2_float));
                  if (((c) this).field_D % 50 != 49) {
                    break L11;
                  } else {
                    ((c) this).field_B = ((c) this).field_B + 1;
                    ((c) this).field_B = ((c) this).field_B % 7;
                    ((c) this).field_V = -((16751678 & jg.field_h[field_ab][((c) this).field_B]) >> -1539020080) + ((jg.field_h[field_ab][(1 + ((c) this).field_B) % 7] & 16754682) >> -580890576);
                    ((c) this).field_t = (255 & jg.field_h[field_ab][(((c) this).field_B + 1) % 7] >> -1088551928) - ((jg.field_h[field_ab][((c) this).field_B] & 65438) >> 2029681544);
                    ((c) this).field_M = (255 & jg.field_h[field_ab][(1 + ((c) this).field_B) % 7]) + -(255 & jg.field_h[field_ab][((c) this).field_B]);
                    break L11;
                  }
                }
                qa.b((byte) 127);
                break L6;
              } else {
                break L6;
              }
            }
            L15: {
              L16: {
                di.field_a = di.field_a - 1;
                if (0 <= di.field_a) {
                  break L16;
                } else {
                  if ((bi.field_g ^ -1) != -1) {
                    di.field_a = 50;
                    if (var3 == 0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  } else {
                    break L15;
                  }
                }
              }
              bi.field_g = 0;
              break L15;
            }
            L17: {
              if ((bi.field_g ^ -1) != -1) {
                L18: {
                  L19: {
                    if ((((c) this).field_K ^ -1) == -6) {
                      break L19;
                    } else {
                      if (7 == ((c) this).field_K) {
                        break L19;
                      } else {
                        break L18;
                      }
                    }
                  }
                  oe.a(false, false, param0 ^ 189);
                  break L18;
                }
                L20: {
                  if (((c) this).field_K == 6) {
                    oe.a(true, false, param0 + 131);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                if (-5 != (((c) this).field_K ^ -1)) {
                  break L17;
                } else {
                  oe.a(true, true, 160);
                  break L17;
                }
              } else {
                break L17;
              }
            }
            L21: {
              L22: {
                if (((c) this).field_C) {
                  break L22;
                } else {
                  ((c) this).a(true);
                  if (var3 == 0) {
                    break L21;
                  } else {
                    break L22;
                  }
                }
              }
              if (bi.field_g != 0) {
                L23: {
                  if (!fh.c(-104)) {
                    break L23;
                  } else {
                    L24: {
                      if (265 >= he.field_d) {
                        break L24;
                      } else {
                        if ((he.field_d ^ -1) <= -300) {
                          break L24;
                        } else {
                          L25: {
                            if (mc.field_a <= 350) {
                              break L25;
                            } else {
                              if (-471 >= (mc.field_a ^ -1)) {
                                break L25;
                              } else {
                                ((c) this).field_g = true;
                                ((c) this).field_C = false;
                                if (var3 == 0) {
                                  break L21;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          L26: {
                            L27: {
                              if (-171 <= (mc.field_a ^ -1)) {
                                break L27;
                              } else {
                                if (-291 < (mc.field_a ^ -1)) {
                                  break L26;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            ((c) this).field_g = false;
                            if (var3 == 0) {
                              break L21;
                            } else {
                              break L26;
                            }
                          }
                          L28: {
                            ((c) this).field_g = true;
                            if (null == el.field_o) {
                              break L28;
                            } else {
                              el.field_o.e((byte) -70);
                              break L28;
                            }
                          }
                          ai.field_p = -1;
                          el.field_i = 0;
                          cd.field_j = 0;
                          if (var3 == 0) {
                            break L21;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    ((c) this).field_g = false;
                    if (var3 == 0) {
                      break L21;
                    } else {
                      break L23;
                    }
                  }
                }
                L29: {
                  if (-1 <= (og.field_n ^ -1)) {
                    break L29;
                  } else {
                    if (null == vl.field_n) {
                      break L29;
                    } else {
                      L30: {
                        if ((he.field_d ^ -1) >= -318) {
                          break L30;
                        } else {
                          if (352 <= he.field_d) {
                            break L30;
                          } else {
                            L31: {
                              L32: {
                                if (-351 <= (mc.field_a ^ -1)) {
                                  break L32;
                                } else {
                                  if (-471 < (mc.field_a ^ -1)) {
                                    break L31;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                              L33: {
                                L34: {
                                  if (mc.field_a <= 170) {
                                    break L34;
                                  } else {
                                    if (mc.field_a < 290) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                ((c) this).field_g = false;
                                if (var3 == 0) {
                                  break L21;
                                } else {
                                  break L33;
                                }
                              }
                              ((c) this).field_C = false;
                              ((c) this).field_g = true;
                              if (var3 == 0) {
                                break L21;
                              } else {
                                break L31;
                              }
                            }
                            ((c) this).field_C = false;
                            boolean discarded$3 = em.b(255);
                            ((c) this).field_g = true;
                            if (var3 == 0) {
                              break L21;
                            } else {
                              break L30;
                            }
                          }
                        }
                      }
                      ((c) this).field_g = false;
                      if (var3 == 0) {
                        break L21;
                      } else {
                        break L29;
                      }
                    }
                  }
                }
                ((c) this).field_g = true;
                ((c) this).field_C = false;
                break L21;
              } else {
                break L21;
              }
            }
            L35: {
              L36: {
                if (qa.field_a != ((c) this).field_s) {
                  break L36;
                } else {
                  if ((ue.field_e ^ -1) != (((c) this).field_Y ^ -1)) {
                    break L36;
                  } else {
                    break L35;
                  }
                }
              }
              ((c) this).field_o = -1;
              break L35;
            }
            L37: {
              ((c) this).field_Y = ue.field_e;
              if (param0 == 29) {
                break L37;
              } else {
                ((c) this).a(11, 26);
                break L37;
              }
            }
            L38: {
              ((c) this).field_s = qa.field_a;
              if (((c) this).field_b != 0) {
                L39: {
                  L40: {
                    var2_int = (qa.field_a - -he.field_d - (-kd.field_c - ki.field_d)) % 8;
                    if (-1 == (var2_int ^ -1)) {
                      break L40;
                    } else {
                      L41: {
                        if ((var2_int ^ -1) == -2) {
                          break L41;
                        } else {
                          L42: {
                            if (var2_int == 2) {
                              break L42;
                            } else {
                              L43: {
                                if ((var2_int ^ -1) != -4) {
                                  break L43;
                                } else {
                                  oa.field_a = oa.field_a - gb.field_g;
                                  kb.field_d = kb.field_d + 1;
                                  if (var3 == 0) {
                                    break L39;
                                  } else {
                                    break L43;
                                  }
                                }
                              }
                              L44: {
                                if ((var2_int ^ -1) == -5) {
                                  break L44;
                                } else {
                                  L45: {
                                    if ((var2_int ^ -1) == -6) {
                                      break L45;
                                    } else {
                                      L46: {
                                        if (6 != var2_int) {
                                          break L46;
                                        } else {
                                          gb.field_g = gb.field_g - 1;
                                          ml.field_r = ml.field_r - kb.field_d;
                                          if (var3 == 0) {
                                            break L39;
                                          } else {
                                            break L46;
                                          }
                                        }
                                      }
                                      if (-8 == (var2_int ^ -1)) {
                                        kb.field_d = kb.field_d - 1;
                                        ml.field_r = ml.field_r - gb.field_g;
                                        if (var3 == 0) {
                                          break L39;
                                        } else {
                                          break L45;
                                        }
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                  kb.field_d = kb.field_d + 1;
                                  ml.field_r = ml.field_r + gb.field_g;
                                  if (var3 == 0) {
                                    break L39;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              gb.field_g = gb.field_g + 1;
                              ml.field_r = ml.field_r + kb.field_d;
                              if (var3 == 0) {
                                break L39;
                              } else {
                                break L42;
                              }
                            }
                          }
                          oa.field_a = oa.field_a - kb.field_d;
                          gb.field_g = gb.field_g + 1;
                          if (var3 == 0) {
                            break L39;
                          } else {
                            break L41;
                          }
                        }
                      }
                      oa.field_a = oa.field_a + gb.field_g;
                      kb.field_d = kb.field_d - 1;
                      if (var3 == 0) {
                        break L39;
                      } else {
                        break L40;
                      }
                    }
                  }
                  oa.field_a = oa.field_a + kb.field_d;
                  gb.field_g = gb.field_g - 1;
                  break L39;
                }
                L47: {
                  var2_int = (ki.field_d + qa.field_a - (-he.field_d + -kd.field_c)) % 5;
                  if (0 == var2_int) {
                    break L47;
                  } else {
                    L48: {
                      if (var2_int == 1) {
                        break L48;
                      } else {
                        L49: {
                          if ((var2_int ^ -1) != -3) {
                            break L49;
                          } else {
                            el.field_g = el.field_g - sc.field_f;
                            lb.field_b = lb.field_b - 1;
                            if (var3 == 0) {
                              break L38;
                            } else {
                              break L49;
                            }
                          }
                        }
                        L50: {
                          if (-4 != (var2_int ^ -1)) {
                            break L50;
                          } else {
                            sc.field_f = sc.field_f + 1;
                            el.field_g = el.field_g + lb.field_b;
                            if (var3 == 0) {
                              break L38;
                            } else {
                              break L50;
                            }
                          }
                        }
                        if ((var2_int ^ -1) != -5) {
                          break L38;
                        } else {
                          el.field_g = el.field_g - lb.field_b;
                          sc.field_f = sc.field_f - 1;
                          if (var3 == 0) {
                            break L38;
                          } else {
                            break L48;
                          }
                        }
                      }
                    }
                    el.field_g = el.field_g + sc.field_f;
                    lb.field_b = lb.field_b + 1;
                    if (var3 == 0) {
                      break L38;
                    } else {
                      break L47;
                    }
                  }
                }
                dc.field_a = dc.field_a | lb.field_b + el.field_g << 595332241;
                break L38;
              } else {
                break L38;
              }
            }
            return;
          }
        } else {
          this.e((byte) 104);
          return;
        }
    }

    private final void b(int param0, int param1) {
        int var3_int = 0;
        int var4_int = 0;
        Object var4 = null;
        String var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          L1: {
            var11 = Geoblox.field_C;
            var3_int = 180;
            vb.a(((c) this).field_P);
            if (param1 == 0) {
              break L1;
            } else {
              if (1 == param1) {
                break L1;
              } else {
                if (-3 == (param1 ^ -1)) {
                  break L1;
                } else {
                  ma.a(140, 30, 80, (byte) -92, 80, ll.field_h);
                  ma.a(242, 30, 80, (byte) -92, 80, ll.field_h);
                  if (var11 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          L2: {
            L3: {
              ma.a(140, 30, 80, (byte) -92, 80, ll.field_h);
              ma.a(242, 30, 80, (byte) -92, 80, ll.field_h);
              ma.a(345, 30, 80, (byte) -92, 80, ll.field_h);
              ri.a(70, 180, 29497);
              vf.field_L.e();
              vb.c();
              ke.field_a[1][((c) this).field_X][((c) this).field_L].b((vf.field_L.field_s >> 1398463873) + -(ke.field_a[1][((c) this).field_X][((c) this).field_L].field_s >> -2119905215), (vf.field_L.field_o >> -1954799455) + -(ke.field_a[1][((c) this).field_X][((c) this).field_L].field_o >> 112423521));
              sh.field_y.a(255);
              vb.b(((c) this).field_P);
              vb.b(50, 250, 90, 310);
              vf.field_L.g(1);
              vf.field_L.b(44, ((c) this).field_z + 200);
              vb.b(((c) this).field_P);
              vb.b(40, 355, 93, 415);
              var4_int = 70;
              var5 = 385;
              var6 = (int)(-Math.sin(((c) this).field_A) * (double)((c) this).field_Z + 0.5) + var4_int;
              var7 = (int)(0.5 + Math.cos(((c) this).field_A) * (double)((c) this).field_Z) + var5;
              var8 = (int)(((c) this).field_A / 6.283185307179586 * 65535.0 + 0.5);
              var9 = 2.0943741584421716;
              if (-16 == (((c) this).field_Z ^ -1)) {
                break L3;
              } else {
                vf.field_L.e();
                vb.c();
                ke.field_a[1][((c) this).field_X][((c) this).field_L].b(vf.field_L.field_s >> -1401802047, vf.field_L.field_o >> 1779537697, var8, 3072);
                sh.field_y.a(255);
                vb.b(((c) this).field_P);
                vb.b(40, 355, 103, 415);
                vf.field_L.g(1);
                vf.field_L.b(var6 - (vf.field_L.field_s >> 1920897793), var7 - (vf.field_L.field_o >> 21057857));
                var8 = (int)(0.5 + 65535.0 * ((((c) this).field_A + var9) / 6.283185307179586));
                var6 = var4_int - -(int)(0.5 + -Math.sin(((c) this).field_A + var9) * (double)((c) this).field_Z);
                var7 = (int)(0.5 + Math.cos(((c) this).field_A + var9) * (double)((c) this).field_Z) + var5;
                vf.field_L.e();
                vb.c();
                ke.field_a[1][((c) this).field_X][((c) this).field_L].b(vf.field_L.field_s >> -487715007, vf.field_L.field_o >> 278492609, var8, 3072);
                sh.field_y.a(255);
                vb.b(((c) this).field_P);
                vb.b(40, 355, 103, 415);
                vf.field_L.g(1);
                vf.field_L.b(var6 + -(vf.field_L.field_s >> -635951327), -(vf.field_L.field_o >> -1258578751) + var7);
                var9 = var9 * 2.0;
                var8 = (int)(0.5 + 65535.0 * ((var9 + ((c) this).field_A) / 6.283185307179586));
                var6 = (int)(-Math.sin(var9 + ((c) this).field_A) * (double)((c) this).field_Z + 0.5) + var4_int;
                var7 = var5 + (int)(Math.cos(var9 + ((c) this).field_A) * (double)((c) this).field_Z + 0.5);
                vf.field_L.e();
                vb.c();
                ke.field_a[1][((c) this).field_X][((c) this).field_L].b(vf.field_L.field_s >> -856243103, vf.field_L.field_o >> -2039870623, var8, 3072);
                sh.field_y.a(255);
                vb.b(((c) this).field_P);
                vb.b(40, 355, 103, 415);
                vf.field_L.g(1);
                vf.field_L.b(var6 + -(vf.field_L.field_s >> 105570977), var7 - (vf.field_L.field_o >> -1265029599));
                if (var11 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            wl.field_a.e();
            vb.c();
            mi.field_B[((c) this).field_w].a(-10 + (wl.field_a.field_s >> 984917473), (wl.field_a.field_o >> 1405073313) - 10, 20, 20);
            sh.field_y.a(255);
            vb.b(((c) this).field_P);
            vb.b(40, 355, 103, 415);
            wl.field_a.b(var6 - (wl.field_a.field_s >> -1019060543), var7 - (wl.field_a.field_s >> 394487777));
            var8 = (int)((((c) this).field_A + var9) / 6.283185307179586 * 65535.0 + 0.5);
            var6 = (int)(-Math.sin(var9 + ((c) this).field_A) * (double)((c) this).field_Z + 0.5) + var4_int;
            var7 = var5 - -(int)(0.5 + Math.cos(var9 + ((c) this).field_A) * (double)((c) this).field_Z);
            wl.field_a.e();
            vb.c();
            mi.field_B[((c) this).field_w].a((wl.field_a.field_s >> -1422082207) + -10, (wl.field_a.field_o >> -2056657503) - 10, 20, 20);
            sh.field_y.a(255);
            vb.b(((c) this).field_P);
            vb.b(40, 355, 103, 415);
            wl.field_a.b(var6 - (wl.field_a.field_s >> 430711393), -(wl.field_a.field_s >> -1508571071) + var7);
            var9 = var9 * 2.0;
            var8 = (int)(0.5 + (((c) this).field_A + var9) / 6.283185307179586 * 65535.0);
            var6 = (int)(0.5 + -Math.sin(var9 + ((c) this).field_A) * (double)((c) this).field_Z) + var4_int;
            var7 = var5 + (int)(Math.cos(((c) this).field_A + var9) * (double)((c) this).field_Z + 0.5);
            wl.field_a.e();
            vb.c();
            mi.field_B[((c) this).field_w].a((wl.field_a.field_s >> 758393505) + -10, -10 + (wl.field_a.field_o >> 1705859041), 20, 20);
            sh.field_y.a(255);
            vb.b(((c) this).field_P);
            vb.b(40, 355, 103, 415);
            wl.field_a.b(var6 - (wl.field_a.field_s >> -343158815), var7 + -(wl.field_a.field_s >> -1289823679));
            break L2;
          }
          vb.b(((c) this).field_P);
          break L0;
        }
        L4: {
          ma.a(140, 550, 40, (byte) -92, 60, ll.field_h);
          dd.field_G.b(param1 - -1 + "/5", 580, 170, 0, -1);
          var4 = null;
          var5 = 155;
          var6 = param1;
          if (var6 == 0) {
            dd.field_G.a(a.field_a[0], var5, var3_int, 0, -1);
            var4_ref = ec.field_e[0];
            dd.field_G.a(a.field_a[1], var5, var3_int - -110, 0, -1);
            break L4;
          } else {
            L5: {
              if (1 != var6) {
                break L5;
              } else {
                if (var11 == 0) {
                  dd.field_G.a(a.field_a[2], var5, var3_int, 0, -1);
                  var4_ref = ec.field_e[1];
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            if (var6 == 2) {
              dd.field_G.a(a.field_a[3], var5, var3_int, 0, -1);
              var4_ref = ec.field_e[2];
              break L4;
            } else {
              if (-4 == (var6 ^ -1)) {
                vf.field_L.e();
                vb.c();
                ka.field_m[1][((c) this).field_L][((c) this).field_w].b(-(ka.field_m[1][((c) this).field_L][((c) this).field_w].field_s >> 987161601) + (vf.field_L.field_s >> -1269651263), (vf.field_L.field_o >> 2090103937) - (ka.field_m[1][((c) this).field_L][((c) this).field_w].field_o >> 1687650273));
                sh.field_y.a(255);
                vb.b(((c) this).field_P);
                vf.field_L.b(70 + -(vf.field_L.field_s >> -389511871), -(vf.field_L.field_o >> 1896871265) + 180);
                vf.field_L.e();
                vb.c();
                s.field_G[1][((c) this).field_X].b((vf.field_L.field_s >> 58463713) - (s.field_G[1][((c) this).field_X].field_s >> -1377280415), (vf.field_L.field_o >> -516762015) + -(s.field_G[1][((c) this).field_X].field_o >> 2065312449), ((c) this).field_N);
                sh.field_y.a(255);
                vb.b(((c) this).field_P);
                vf.field_L.g(1);
                vf.field_L.b(70 - (vf.field_L.field_s >> -431583199), 282 - (vf.field_L.field_o >> -1230674015));
                dd.field_G.a(a.field_a[4], var5, var3_int, 0, -1);
                var4_ref = ec.field_e[3];
                break L4;
              } else {
                if (4 == var6) {
                  L6: {
                    vf.field_L.e();
                    vb.c();
                    fc.field_g[((c) this).field_w].b(-(fc.field_g[((c) this).field_w].field_s >> -1837581887) + (vf.field_L.field_s >> 1490350017), -(fc.field_g[((c) this).field_w].field_o >> -1811742495) + (vf.field_L.field_o >> 1651106433));
                    k.a(0, 0, vf.field_L.field_s, -27085, vf.field_L.field_o);
                    sh.field_y.a(255);
                    vb.b(((c) this).field_P);
                    vf.field_L.b(70 - (vf.field_L.field_s >> -502406015), 180 + -(vf.field_L.field_o >> 842923649));
                    vf.field_L.e();
                    vb.c();
                    if (((c) this).field_B < 4) {
                      break L6;
                    } else {
                      ((c) this).field_B = 0;
                      break L6;
                    }
                  }
                  hb.field_d[((c) this).field_B].b(-(hb.field_d[((c) this).field_B].field_s >> 1267431681) + (vf.field_L.field_s >> 992034401), (vf.field_L.field_o >> 1607733665) - (hb.field_d[((c) this).field_B].field_o >> 707716161));
                  k.a(0, 0, vf.field_L.field_s, -27085, vf.field_L.field_o);
                  sh.field_y.a(255);
                  vb.b(((c) this).field_P);
                  vf.field_L.b(70 + -(vf.field_L.field_s >> 1189368705), -(vf.field_L.field_o >> -1499046271) + 282);
                  dd.field_G.a(a.field_a[5], var5, var3_int, 0, -1);
                  var4_ref = ec.field_e[4];
                  break L4;
                } else {
                  break L4;
                }
              }
            }
          }
        }
        L7: {
          var6 = fi.field_d.field_o - -fi.field_d.field_q;
          if (param0 <= -14) {
            break L7;
          } else {
            ((c) this).a(-3, -61, false, -67, true, 116);
            break L7;
          }
        }
        var7 = 355;
        var3_int = var3_int + fi.field_d.a(var4_ref, var5, var3_int, var7, 300, 0, -1, 0, 0, 16) * var6;
        vb.b(((c) this).field_P);
    }

    final void a(int param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param2) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((c) this).field_q = -45;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7_int = t.field_i[((c) this).field_K][param0];
                        var8 = var7_int;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var8 ^ -1) == -9) {
                            statePc = 12;
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
                        if (var8 == 9) {
                            statePc = 26;
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
                        statePc = 41;
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
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        // wide iinc 2 -280
                        if (param1 <= 0) {
                            statePc = 22;
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
                        if (param1 >= sd.field_y.field_s) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        j.field_gb = 80 * param1 / sd.field_y.field_s;
                        if (var9 == 0) {
                            statePc = 25;
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
                        j.field_gb = 80;
                        if (var9 == 0) {
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
                        j.field_gb = 0;
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
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.d(0);
                        if (var9 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        // wide iinc 2 -280
                        if (param1 > 0) {
                            statePc = 32;
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
                        wg.a(-15346, 0);
                        if (var9 == 0) {
                            statePc = 49;
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
                        if ((sd.field_y.field_s ^ -1) >= (param1 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        wg.a(-15346, 80 * param1 / sd.field_y.field_s);
                        if (var9 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        wg.a(-15346, 80);
                        if (var9 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (!param4) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 45;
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
                        super.a(param0, param1, param2, param3, param4, param5);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    var7 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var7, "c.G(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static char c(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_6_0 = 0;
        char stackIn_19_0 = 0;
        int stackOut_5_0 = 0;
        char stackOut_18_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = 255 & param1;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if ((var2_int ^ -1) != -1) {
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
                        throw new IllegalArgumentException("" + Integer.toString(var2_int, 16));
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
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-129 < (var2_int ^ -1)) {
                            statePc = 14;
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
                        stackOut_5_0 = 160;
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
                        if (stackIn_6_0 > var2_int) {
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
                        statePc = 14;
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
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3 = lf.field_e[-128 + var2_int];
                        if (0 != var3) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = 63;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var2_int = var3;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param0 > 21) {
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
                        c.d((byte) -112);
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
                        stackOut_18_0 = (char)var2_int;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0;
                }
                case 20: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "c.A(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == -12831) {
                break L0;
              } else {
                ((c) this).a(true, (byte) 98, -83, 83);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          ((c) this).field_e = param1;
        }
    }

    private final void e(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_6_0 = null;
        Object stackOut_5_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 >= 73) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((c) this).field_V = 15;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0 != ((c) this).field_T) {
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
                        stackOut_5_0 = this;
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
                        if (((c) this).field_H) {
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
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return;
                }
                case 12: {
                    try {
                        if (0 != ((c) this).field_F) {
                            statePc = 25;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!((c) this).field_l) {
                            statePc = 22;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-5 == (((c) this).field_q ^ -1)) {
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
                        statePc = 25;
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
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((c) this).field_b = 3;
                        if (Geoblox.field_C == 0) {
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
                        ((c) this).field_b = ((c) this).a(qa.field_a, ue.field_e, (byte) 54);
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
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((c) this).field_F = ((c) this).field_F + 8;
                        if ((640 + qj.field_c.field_m ^ -1) > (((c) this).field_F ^ -1)) {
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
                        statePc = 31;
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
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ((c) this).field_E = false;
                        ((c) this).field_F = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "c.E(" + param0 + 41);
                }
                case 31: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void f(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        int stackIn_11_0 = 0;
        Object stackIn_28_0 = null;
        int stackIn_36_0 = 0;
        Object stackOut_3_0 = null;
        int stackOut_10_0 = 0;
        Object stackOut_27_0 = null;
        int stackOut_35_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 89) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        if (3 != ((c) this).field_K) {
                            statePc = 44;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = this;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!((c) this).field_E) {
                            statePc = 9;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 44;
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
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((((c) this).field_q ^ -1) == -5) {
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
                        stackOut_10_0 = -4;
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
                        if (stackIn_11_0 != (((c) this).field_b ^ -1)) {
                            statePc = 17;
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
                        ((c) this).field_b = 2;
                        if (Geoblox.field_C == 0) {
                            statePc = 34;
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
                        if (-5 == (((c) this).field_q ^ -1)) {
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
                        statePc = 34;
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
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((((c) this).field_b ^ -1) == -3) {
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
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((c) this).field_b = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-2 != (oc.field_b ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = this;
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
                        if (((c) this).field_b != 3) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((c) this).field_b = 1;
                        statePc = 32;
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
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (((c) this).field_q != 0) {
                            statePc = 44;
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
                        stackOut_35_0 = -1;
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
                        if (stackIn_36_0 != (((c) this).field_b ^ -1)) {
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
                        ((c) this).field_b = 2;
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
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "c.F(" + param0 + 41);
                }
                case 44: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    c(Geoblox param0, int param1) {
        super(t.field_i[param1].length, 140, 500, 140, 40);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((c) this).field_S = false;
                    ((c) this).field_L = 0;
                    ((c) this).field_H = false;
                    ((c) this).field_X = 0;
                    ((c) this).field_D = 0;
                    ((c) this).field_I = 115;
                    ((c) this).field_P = new int[4];
                    ((c) this).field_o = -1;
                    ((c) this).field_U = 0;
                    ((c) this).field_u = 123;
                    ((c) this).field_O = 0;
                    ((c) this).field_F = 0;
                    ((c) this).field_z = 0;
                    ((c) this).field_v = true;
                    ((c) this).field_W = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((c) this).field_K = param1;
                        ((c) this).field_p = param0;
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
                        stackOut_4_1 = new StringBuilder().append("c.<init>(");
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
                    throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
                }
                case 9: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void d(int param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        int stackIn_8_0 = 0;
        Object stackOut_3_0 = null;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 0) {
                            statePc = 2;
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
                    return;
                }
                case 2: {
                    try {
                        if (null == ((c) this).field_R) {
                            statePc = 13;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = this;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((c) this).field_R.l()) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
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
                        stackOut_7_0 = 50;
                        stackIn_8_0 = stackOut_7_0;
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
                        if (stackIn_8_0 < ((c) this).field_U) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
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
                case 11: {
                    try {
                        statePc = 16;
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
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((c) this).field_R = kl.a(fl.field_c[8], 100, j.field_gb);
                        ja.a(false, ((c) this).field_R);
                        ((c) this).field_U = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "c.H(" + param0 + 41);
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((c) this).field_D = ((c) this).field_D + 1;
                        if ((((c) this).field_D + 1) % 5 != 0) {
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
                        ((c) this).field_W = ((c) this).field_W + 1;
                        ((c) this).field_O = ((c) this).field_O - 1;
                        this.g((byte) -114);
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
                        if ((((c) this).field_D & 3) != 3) {
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
                        ((c) this).field_u = ((c) this).field_u - 1;
                        ((c) this).field_I = ((c) this).field_I - 1;
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
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0 == 16405) {
                            statePc = 14;
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
                        this.b(false);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "c.K(" + param0 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[] var6 = null;
        int var7 = 0;
        int stackIn_95_0 = 0;
        mg stackIn_100_0 = null;
        int stackIn_111_0 = 0;
        int stackIn_134_0 = 0;
        d stackIn_138_0 = null;
        Object stackIn_150_0 = null;
        int stackIn_154_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_175_0 = 0;
        Object stackIn_179_0 = null;
        gh stackIn_183_0 = null;
        gh stackIn_206_0 = null;
        int stackIn_210_0 = 0;
        gh stackIn_217_0 = null;
        int stackIn_224_0 = 0;
        int stackIn_240_0 = 0;
        int stackIn_266_0 = 0;
        int stackIn_277_0 = 0;
        Object stackIn_308_0 = null;
        int stackOut_94_0 = 0;
        mg stackOut_99_0 = null;
        int stackOut_108_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_133_0 = 0;
        d stackOut_137_0 = null;
        Object stackOut_149_0 = null;
        int stackOut_153_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_174_0 = 0;
        Object stackOut_178_0 = null;
        gh stackOut_182_0 = null;
        gh stackOut_205_0 = null;
        int stackOut_209_0 = 0;
        gh stackOut_216_0 = null;
        int stackOut_223_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_265_0 = 0;
        int stackOut_276_0 = 0;
        Object stackOut_307_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        td.a(-348, fl.field_c[29]);
                        var3_int = 0;
                        var4 = 0;
                        var5 = t.field_i[((c) this).field_K][param0];
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1 == -2) {
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
                        ((c) this).c(-70);
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
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6_int = var5;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6_int != 15) {
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
                        if (var7 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
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
                        if ((var6_int ^ -1) != -1) {
                            statePc = 17;
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
                        if (var7 == 0) {
                            statePc = 87;
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
                        if (1 != var6_int) {
                            statePc = 23;
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
                        if (var7 == 0) {
                            statePc = 113;
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
                        if (-3 != (var6_int ^ -1)) {
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
                        if (var7 == 0) {
                            statePc = 114;
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
                        if ((var6_int ^ -1) == -4) {
                            statePc = 123;
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
                        if ((var6_int ^ -1) != -5) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var7 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (14 != var6_int) {
                            statePc = 44;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var7 == 0) {
                            statePc = 145;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
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
                        if ((var6_int ^ -1) == -6) {
                            statePc = 148;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (-14 == (var6_int ^ -1)) {
                            statePc = 167;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (6 != var6_int) {
                            statePc = 56;
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
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var7 == 0) {
                            statePc = 199;
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
                        if ((var6_int ^ -1) == -8) {
                            statePc = 256;
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
                        if (-13 == (var6_int ^ -1)) {
                            statePc = 259;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((var6_int ^ -1) == -12) {
                            statePc = 270;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (-11 == (var6_int ^ -1)) {
                            statePc = 281;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (16 != var6_int) {
                            statePc = 74;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var7 == 0) {
                            statePc = 290;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (-18 == (var6_int ^ -1)) {
                            statePc = 293;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if ((var6_int ^ -1) == -19) {
                            statePc = 296;
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
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 299;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (1 == oc.field_b) {
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
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 85: {
                    return;
                }
                case 86: {
                    try {
                        var3_int = 1;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (var3_int != 0) {
                            statePc = 112;
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
                        if (!fh.c(param1 ^ 107)) {
                            statePc = 96;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (kc.field_c != 0) {
                            statePc = 96;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var3_int = 1;
                        stackOut_94_0 = var7;
                        stackIn_95_0 = stackOut_94_0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (stackIn_95_0 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (ca.field_f == null) {
                            statePc = 112;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackOut_99_0 = ca.field_f;
                        stackIn_100_0 = stackOut_99_0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (stackIn_100_0.field_j) {
                            statePc = 105;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (ca.field_f.field_k == null) {
                            statePc = 112;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var6 = ca.field_f.field_k[1];
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (var6[0] != null) {
                            statePc = 110;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackOut_108_0 = 1;
                        stackIn_111_0 = stackOut_108_0;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackOut_110_0 = 0;
                        stackIn_111_0 = stackOut_110_0;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var3_int = stackIn_111_0;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        kc.field_c = kc.field_c + 1;
                        pg.a(param1 ^ -9410);
                        el.field_o = new gh(((c) this).field_p, var3_int != 0);
                        le.a((byte) -39);
                        ai.field_p = -1;
                        statePc = 299;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        ai.field_p = -1;
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (fh.c(-100)) {
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
                        ai.field_p = 2;
                        if (var7 == 0) {
                            statePc = 299;
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
                        ai.field_p = 8;
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        ai.field_p = 3;
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (vl.field_n == null) {
                            statePc = 131;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        ((c) this).field_C = true;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (em.b(255)) {
                            statePc = 144;
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
                        stackOut_133_0 = -1;
                        stackIn_134_0 = stackOut_133_0;
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
                        if (stackIn_134_0 <= (og.field_n ^ -1)) {
                            statePc = 144;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        stackOut_137_0 = ka.field_i;
                        stackIn_138_0 = stackOut_137_0;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (sa.a(stackIn_138_0, (byte) 37)) {
                            statePc = 143;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        f.i((byte) -128);
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        ((c) this).field_o = 0;
                        ((c) this).field_g = false;
                        ((c) this).field_y = 0;
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        vl.field_p = 0;
                        ug.field_c = 0;
                        ra.field_d = -2147483648;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (2 == ((c) this).field_K) {
                            statePc = 164;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        stackOut_149_0 = this;
                        stackIn_150_0 = stackOut_149_0;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if ((((c) this).field_K ^ -1) == -5) {
                            statePc = 164;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        stackOut_153_0 = 6;
                        stackIn_154_0 = stackOut_153_0;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (stackIn_154_0 == ((c) this).field_K) {
                            statePc = 164;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        stackOut_157_0 = oc.field_b;
                        stackIn_158_0 = stackOut_157_0;
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (stackIn_158_0 != 1) {
                            statePc = 164;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        ai.field_p = 1;
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        ai.field_p = 0;
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if (null != el.field_o) {
                            statePc = 172;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        el.field_o.e((byte) -70);
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        ai.field_p = -1;
                        if (((c) this).field_K == 8) {
                            statePc = 195;
                        } else {
                            statePc = 174;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        stackOut_174_0 = 4;
                        stackIn_175_0 = stackOut_174_0;
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        if (stackIn_175_0 != ((c) this).field_K) {
                            statePc = 186;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        stackOut_178_0 = null;
                        stackIn_179_0 = stackOut_178_0;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (stackIn_179_0 == (Object) (Object) el.field_o) {
                            statePc = 186;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        stackOut_182_0 = el.field_o;
                        stackIn_183_0 = stackOut_182_0;
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        if (stackIn_183_0.field_e == 0) {
                            statePc = 195;
                        } else {
                            statePc = 184;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        if (((c) this).field_K == 7) {
                            statePc = 192;
                        } else {
                            statePc = 187;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 191;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 191;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 191;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        el.field_i = 6;
                        if (var7 == 0) {
                            statePc = 198;
                        } else {
                            statePc = 190;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        el.field_i = 5;
                        if (var7 == 0) {
                            statePc = 198;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        el.field_i = 2;
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        cd.field_j = ((c) this).field_K;
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 199;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        el.field_o.c(false);
                        el.field_o.a((byte) 127, wa.a(param1 ^ 25864));
                        el.field_o.a((byte) 127, el.field_o.field_q);
                        el.field_o.field_q = 0;
                        if (!fh.c(-114)) {
                            statePc = 236;
                        } else {
                            statePc = 200;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        if (el.field_o.field_Y) {
                            statePc = 213;
                        } else {
                            statePc = 203;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        statePc = 205;
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        stackOut_205_0 = el.field_o;
                        stackIn_206_0 = stackOut_205_0;
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        if (stackIn_206_0.field_o != 0) {
                            statePc = 213;
                        } else {
                            statePc = 207;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        statePc = 209;
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        stackOut_209_0 = -1;
                        stackIn_210_0 = stackOut_209_0;
                        statePc = 210;
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        if (stackIn_210_0 == (ug.field_c ^ -1)) {
                            statePc = 233;
                        } else {
                            statePc = 211;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        if (!el.field_o.field_Y) {
                            statePc = 220;
                        } else {
                            statePc = 214;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        stackOut_216_0 = el.field_o;
                        stackIn_217_0 = stackOut_216_0;
                        statePc = 217;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 219;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        if (stackIn_217_0.field_v < 750) {
                            statePc = 233;
                        } else {
                            statePc = 218;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        if (0 != el.field_o.field_o) {
                            statePc = 230;
                        } else {
                            statePc = 221;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        statePc = 223;
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        stackOut_223_0 = 0;
                        stackIn_224_0 = stackOut_223_0;
                        statePc = 224;
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 226;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        if (stackIn_224_0 != ug.field_c) {
                            statePc = 230;
                        } else {
                            statePc = 225;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 229;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        statePc = 227;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 229;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 229;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        ai.field_p = 0;
                        if (var7 == 0) {
                            statePc = 255;
                        } else {
                            statePc = 228;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        statePc = 230;
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        ai.field_p = 4;
                        if (var7 == 0) {
                            statePc = 255;
                        } else {
                            statePc = 231;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        statePc = 233;
                        continue stateLoop;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        ai.field_p = 0;
                        if (var7 == 0) {
                            statePc = 255;
                        } else {
                            statePc = 234;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        statePc = 236;
                        continue stateLoop;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        if (-1 != (el.field_o.field_o ^ -1)) {
                            statePc = 246;
                        } else {
                            statePc = 237;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 242;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        statePc = 239;
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 242;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 242;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        stackOut_239_0 = ug.field_c;
                        stackIn_240_0 = stackOut_239_0;
                        statePc = 240;
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 242;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        if ((stackIn_240_0 ^ -1) != -1) {
                            statePc = 246;
                        } else {
                            statePc = 241;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_240) {
                        caughtException = stateCaught_240;
                        statePc = 245;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        statePc = 243;
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 245;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 245;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        ai.field_p = 0;
                        if (var7 == 0) {
                            statePc = 255;
                        } else {
                            statePc = 244;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 248;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        statePc = 246;
                        continue stateLoop;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 248;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 248;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        el.field_o.e((byte) -70);
                        if (0 >= el.field_o.field_e) {
                            statePc = 252;
                        } else {
                            statePc = 247;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 251;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        statePc = 249;
                        continue stateLoop;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 251;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 251;
                        continue stateLoop;
                    }
                }
                case 249: {
                    try {
                        ai.field_p = 6;
                        if (var7 == 0) {
                            statePc = 255;
                        } else {
                            statePc = 250;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_249) {
                        caughtException = stateCaught_249;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        statePc = 252;
                        continue stateLoop;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        ai.field_p = 2;
                        statePc = 253;
                        continue stateLoop;
                    } catch (Throwable stateCaught_252) {
                        caughtException = stateCaught_252;
                        statePc = 254;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        statePc = 255;
                        continue stateLoop;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 255: {
                    try {
                        fi.a(param1 + 2, ll.field_d);
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 256;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_255) {
                        caughtException = stateCaught_255;
                        statePc = 258;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        gf.a(k.c(param1 ^ -125), 62);
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 257;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 261;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        statePc = 259;
                        continue stateLoop;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 261;
                        continue stateLoop;
                    }
                }
                case 258: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_258) {
                        caughtException = stateCaught_258;
                        statePc = 261;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        if (-5 >= (((c) this).field_q ^ -1)) {
                            statePc = 265;
                        } else {
                            statePc = 260;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 264;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        statePc = 262;
                        continue stateLoop;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 264;
                        continue stateLoop;
                    }
                }
                case 261: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 264;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        if (!((c) this).field_E) {
                            statePc = 267;
                        } else {
                            statePc = 263;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 264;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        statePc = 265;
                        continue stateLoop;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        var4 = 1;
                        stackOut_265_0 = var7;
                        stackIn_266_0 = stackOut_265_0;
                        statePc = 266;
                        continue stateLoop;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        if (stackIn_266_0 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 267;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 269;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        ((c) this).field_n = ((c) this).field_q;
                        ((c) this).field_q = ((c) this).field_q + 1;
                        ((c) this).field_v = true;
                        ((c) this).field_E = true;
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 268;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 272;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        statePc = 270;
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 272;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 272;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        if ((((c) this).field_q ^ -1) >= -1) {
                            statePc = 276;
                        } else {
                            statePc = 271;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 275;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        statePc = 273;
                        continue stateLoop;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 275;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 275;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        if (!((c) this).field_E) {
                            statePc = 278;
                        } else {
                            statePc = 274;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 275;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        statePc = 276;
                        continue stateLoop;
                    } catch (Throwable stateCaught_274) {
                        caughtException = stateCaught_274;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 275: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_275) {
                        caughtException = stateCaught_275;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        var4 = 1;
                        stackOut_276_0 = var7;
                        stackIn_277_0 = stackOut_276_0;
                        statePc = 277;
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 277: {
                    try {
                        if (stackIn_277_0 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 278;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_277) {
                        caughtException = stateCaught_277;
                        statePc = 280;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        ((c) this).field_n = ((c) this).field_q;
                        ((c) this).field_E = true;
                        ((c) this).field_q = ((c) this).field_q - 1;
                        ((c) this).field_v = false;
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 279;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 283;
                        continue stateLoop;
                    }
                }
                case 279: {
                    try {
                        statePc = 281;
                        continue stateLoop;
                    } catch (Throwable stateCaught_279) {
                        caughtException = stateCaught_279;
                        statePc = 283;
                        continue stateLoop;
                    }
                }
                case 280: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_280) {
                        caughtException = stateCaught_280;
                        statePc = 283;
                        continue stateLoop;
                    }
                }
                case 281: {
                    try {
                        if (!fh.c(-112)) {
                            statePc = 287;
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
                        statePc = 284;
                        continue stateLoop;
                    } catch (Throwable stateCaught_282) {
                        caughtException = stateCaught_282;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 283: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_283) {
                        caughtException = stateCaught_283;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 284: {
                    try {
                        ai.field_p = 7;
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 285;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_284) {
                        caughtException = stateCaught_284;
                        statePc = 289;
                        continue stateLoop;
                    }
                }
                case 285: {
                    try {
                        statePc = 287;
                        continue stateLoop;
                    } catch (Throwable stateCaught_285) {
                        caughtException = stateCaught_285;
                        statePc = 289;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_286) {
                        caughtException = stateCaught_286;
                        statePc = 289;
                        continue stateLoop;
                    }
                }
                case 287: {
                    try {
                        ai.field_p = 5;
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 288;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_287) {
                        caughtException = stateCaught_287;
                        statePc = 292;
                        continue stateLoop;
                    }
                }
                case 288: {
                    try {
                        statePc = 290;
                        continue stateLoop;
                    } catch (Throwable stateCaught_288) {
                        caughtException = stateCaught_288;
                        statePc = 292;
                        continue stateLoop;
                    }
                }
                case 289: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_289) {
                        caughtException = stateCaught_289;
                        statePc = 292;
                        continue stateLoop;
                    }
                }
                case 290: {
                    try {
                        da.field_c = 0;
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 291;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_290) {
                        caughtException = stateCaught_290;
                        statePc = 295;
                        continue stateLoop;
                    }
                }
                case 291: {
                    try {
                        statePc = 293;
                        continue stateLoop;
                    } catch (Throwable stateCaught_291) {
                        caughtException = stateCaught_291;
                        statePc = 295;
                        continue stateLoop;
                    }
                }
                case 292: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_292) {
                        caughtException = stateCaught_292;
                        statePc = 295;
                        continue stateLoop;
                    }
                }
                case 293: {
                    try {
                        da.field_c = 1;
                        if (var7 == 0) {
                            statePc = 299;
                        } else {
                            statePc = 294;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_293) {
                        caughtException = stateCaught_293;
                        statePc = 298;
                        continue stateLoop;
                    }
                }
                case 294: {
                    try {
                        statePc = 296;
                        continue stateLoop;
                    } catch (Throwable stateCaught_294) {
                        caughtException = stateCaught_294;
                        statePc = 298;
                        continue stateLoop;
                    }
                }
                case 295: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_295) {
                        caughtException = stateCaught_295;
                        statePc = 298;
                        continue stateLoop;
                    }
                }
                case 296: {
                    try {
                        da.field_c = 2;
                        statePc = 297;
                        continue stateLoop;
                    } catch (Throwable stateCaught_296) {
                        caughtException = stateCaught_296;
                        statePc = 298;
                        continue stateLoop;
                    }
                }
                case 297: {
                    try {
                        statePc = 299;
                        continue stateLoop;
                    } catch (Throwable stateCaught_297) {
                        caughtException = stateCaught_297;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 298: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_298) {
                        caughtException = stateCaught_298;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 299: {
                    try {
                        if (var4 == 0) {
                            statePc = 302;
                        } else {
                            statePc = 300;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_299) {
                        caughtException = stateCaught_299;
                        statePc = 301;
                        continue stateLoop;
                    }
                }
                case 300: {
                    try {
                        statePc = 303;
                        continue stateLoop;
                    } catch (Throwable stateCaught_300) {
                        caughtException = stateCaught_300;
                        statePc = 301;
                        continue stateLoop;
                    }
                }
                case 301: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_301) {
                        caughtException = stateCaught_301;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 302: {
                    try {
                        ((c) this).field_H = true;
                        a.field_e = -1;
                        statePc = 303;
                        continue stateLoop;
                    } catch (Throwable stateCaught_302) {
                        caughtException = stateCaught_302;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 303: {
                    try {
                        if ((((c) this).field_K ^ -1) == (ai.field_p ^ -1)) {
                            statePc = 316;
                        } else {
                            statePc = 304;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_303) {
                        caughtException = stateCaught_303;
                        statePc = 306;
                        continue stateLoop;
                    }
                }
                case 304: {
                    try {
                        if (-2 == (((c) this).field_K ^ -1)) {
                            statePc = 311;
                        } else {
                            statePc = 305;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_304) {
                        caughtException = stateCaught_304;
                        statePc = 310;
                        continue stateLoop;
                    }
                }
                case 305: {
                    try {
                        statePc = 307;
                        continue stateLoop;
                    } catch (Throwable stateCaught_305) {
                        caughtException = stateCaught_305;
                        statePc = 310;
                        continue stateLoop;
                    }
                }
                case 306: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_306) {
                        caughtException = stateCaught_306;
                        statePc = 310;
                        continue stateLoop;
                    }
                }
                case 307: {
                    try {
                        stackOut_307_0 = this;
                        stackIn_308_0 = stackOut_307_0;
                        statePc = 308;
                        continue stateLoop;
                    } catch (Throwable stateCaught_307) {
                        caughtException = stateCaught_307;
                        statePc = 310;
                        continue stateLoop;
                    }
                }
                case 308: {
                    try {
                        if ((((c) this).field_K ^ -1) != -1) {
                            statePc = 316;
                        } else {
                            statePc = 309;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_308) {
                        caughtException = stateCaught_308;
                        statePc = 313;
                        continue stateLoop;
                    }
                }
                case 309: {
                    try {
                        statePc = 311;
                        continue stateLoop;
                    } catch (Throwable stateCaught_309) {
                        caughtException = stateCaught_309;
                        statePc = 313;
                        continue stateLoop;
                    }
                }
                case 310: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_310) {
                        caughtException = stateCaught_310;
                        statePc = 313;
                        continue stateLoop;
                    }
                }
                case 311: {
                    try {
                        oc.field_b = ((c) this).field_K;
                        statePc = 312;
                        continue stateLoop;
                    } catch (Throwable stateCaught_311) {
                        caughtException = stateCaught_311;
                        statePc = 313;
                        continue stateLoop;
                    }
                }
                case 312: {
                    try {
                        statePc = 316;
                        continue stateLoop;
                    } catch (Throwable stateCaught_312) {
                        caughtException = stateCaught_312;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 313: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_313) {
                        caughtException = stateCaught_313;
                        statePc = 315;
                        continue stateLoop;
                    }
                }
                case 315: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var3, "c.L(" + param0 + 44 + param1 + 41);
                }
                case 316: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = t.field_i[((c) this).field_K][param1];
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3_int == 8) {
                            statePc = 8;
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
                        if (9 == var3_int) {
                            statePc = 15;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 24;
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
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (j.field_gb < 70) {
                            statePc = 12;
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
                        j.field_gb = 80;
                        if (var4 == 0) {
                            statePc = 24;
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
                        j.field_gb = j.field_gb + 10;
                        if (var4 == 0) {
                            statePc = 24;
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
                        if (-71 < (oc.field_c ^ -1)) {
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
                        wg.a(-15346, 80);
                        if (var4 == 0) {
                            statePc = 24;
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
                        wg.a(-15346, 10 + oc.field_c);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (param0 == 90) {
                            statePc = 30;
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
                        ((c) this).field_y = 120;
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
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) runtimeException, "c.V(" + param0 + 44 + param1 + 41);
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        nc var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_27_0 = 0;
        Object stackIn_36_0 = null;
        int stackIn_40_0 = 0;
        int stackIn_47_0 = 0;
        Object stackIn_51_0 = null;
        int stackIn_59_0 = 0;
        Object stackIn_69_0 = null;
        Object stackIn_73_0 = null;
        Object stackIn_77_0 = null;
        Object stackIn_92_0 = null;
        Object stackIn_96_0 = null;
        Object stackIn_103_0 = null;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_168_0 = 0;
        int stackIn_177_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_26_0 = 0;
        Object stackOut_35_0 = null;
        int stackOut_39_0 = 0;
        int stackOut_46_0 = 0;
        Object stackOut_50_0 = null;
        int stackOut_58_0 = 0;
        Object stackOut_68_0 = null;
        Object stackOut_72_0 = null;
        Object stackOut_76_0 = null;
        Object stackOut_91_0 = null;
        Object stackOut_95_0 = null;
        Object stackOut_102_0 = null;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        int stackOut_167_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_176_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 < -74) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (((c) this).field_S) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = ((c) this).field_q;
                        stackIn_7_0 = stackOut_4_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = ((c) this).field_n;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5_int = stackIn_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (3 != ((c) this).field_K) {
                            statePc = 24;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = param2;
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
                        if (stackIn_10_0 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = var5_int;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 == 0) {
                            statePc = 23;
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
                        if (param2 != 2) {
                            statePc = 24;
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
                        if (-5 != (var5_int ^ -1)) {
                            statePc = 24;
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return;
                }
                case 24: {
                    try {
                        var6 = t.field_i[((c) this).field_K][param2];
                        var7 = tl.field_f[var6];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var6 != 15) {
                            statePc = 34;
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
                        stackOut_26_0 = var5_int;
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
                        if ((stackIn_27_0 ^ -1) != -5) {
                            statePc = 33;
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
                        if (oc.field_b != 1) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
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
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return;
                }
                case 34: {
                    try {
                        if (3 != ((c) this).field_K) {
                            statePc = 57;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = this;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (!((c) this).field_E) {
                            statePc = 57;
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
                case 39: {
                    try {
                        stackOut_39_0 = -5;
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
                        if (stackIn_40_0 == (((c) this).field_q ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (-2 == (oc.field_b ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = -3;
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
                        if (stackIn_47_0 != (param2 ^ -1)) {
                            statePc = 57;
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
                        stackOut_50_0 = this;
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
                        if ((((c) this).field_b ^ -1) == -4) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        param0 = true;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if ((((c) this).field_K ^ -1) == -4) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = -3;
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
                        if (stackIn_59_0 != (((c) this).field_K ^ -1)) {
                            statePc = 65;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        // wide iinc 4 280
                        if (var14 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (-6 == (((c) this).field_K ^ -1)) {
                            statePc = 80;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackOut_68_0 = this;
                        stackIn_69_0 = stackOut_68_0;
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
                        if (((c) this).field_K == 7) {
                            statePc = 80;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = this;
                        stackIn_73_0 = stackOut_72_0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if ((((c) this).field_K ^ -1) == -7) {
                            statePc = 80;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackOut_76_0 = this;
                        stackIn_77_0 = stackOut_76_0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (((c) this).field_K != 4) {
                            statePc = 83;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        // wide iinc 4 295
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
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var8 = dd.field_G;
                        var9 = 320;
                        var10 = 160;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (0 == ((c) this).field_K) {
                            statePc = 88;
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
                        if (((c) this).field_K != 1) {
                            statePc = 89;
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
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var11 = 322;
                        if (var14 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var11 = var8.c(var7, 400);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (((c) this).field_K == 3) {
                            statePc = 136;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = this;
                        stackIn_92_0 = stackOut_91_0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (((c) this).field_K == 2) {
                            statePc = 136;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        stackOut_95_0 = this;
                        stackIn_96_0 = stackOut_95_0;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (((c) this).field_K == 6) {
                            statePc = 136;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if ((((c) this).field_K ^ -1) == -8) {
                            statePc = 128;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackOut_102_0 = this;
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
                        if ((((c) this).field_K ^ -1) == -9) {
                            statePc = 128;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (((c) this).field_K == 4) {
                            statePc = 119;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (!param0) {
                            statePc = 113;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var9 = var9 + ((c) this).field_T;
                        var10 = var10 + ((c) this).field_T;
                        param3 = param3 - ((c) this).field_T;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var10 = 320 + -(var11 - -20 >> -1545798207);
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        stackOut_114_0 = param3;
                        stackOut_114_1 = var10;
                        stackIn_117_0 = stackOut_114_0;
                        stackIn_117_1 = stackOut_114_1;
                        stackIn_115_0 = stackOut_114_0;
                        stackIn_115_1 = stackOut_114_1;
                        if (!param0) {
                            statePc = 117;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
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
                        stackOut_115_2 = ((c) this).field_T;
                        stackIn_118_0 = stackOut_115_0;
                        stackIn_118_1 = stackOut_115_1;
                        stackIn_118_2 = stackOut_115_2;
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
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackOut_117_0 = stackIn_117_0;
                        stackOut_117_1 = stackIn_117_1;
                        stackOut_117_2 = 0;
                        stackIn_118_0 = stackOut_117_0;
                        stackIn_118_1 = stackOut_117_1;
                        stackIn_118_2 = stackOut_117_2;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        ma.a(stackIn_118_0, stackIn_118_1 + stackIn_118_2, 36, (byte) -92, var11 + 20, eb.field_g);
                        if (var14 == 0) {
                            statePc = 163;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var11 = 278;
                        var10 = 320 - (var11 - -20 >> -228174143);
                        if (-14 == (var6 ^ -1)) {
                            statePc = 121;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        param3 = 395;
                        if (var14 == 0) {
                            statePc = 122;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        param3 = 265;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var9 = 10 + (var11 >> 102536641) + var10;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (param0) {
                            statePc = 126;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var10 = var10 + ((c) this).field_T;
                        param3 = param3 - ((c) this).field_T;
                        var9 = var9 + ((c) this).field_T;
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        ma.a(param3, var10, 36, (byte) -92, 20 + var11, eb.field_g);
                        if (var14 == 0) {
                            statePc = 163;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        param3 = 437;
                        if ((var6 ^ -1) != -14) {
                            statePc = 130;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var10 = 121;
                        var9 = (var11 >> -568798911) + var10 + 10;
                        if (var14 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var10 = 436;
                        var9 = (var11 >> -1065471359) + var10 + 10;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (param0) {
                            statePc = 134;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        var9 = var9 + ((c) this).field_T;
                        param3 = param3 - ((c) this).field_T;
                        var10 = var10 + ((c) this).field_T;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        ma.a(param3, var10, 36, (byte) -92, var11 - -20, eb.field_g);
                        if (var14 == 0) {
                            statePc = 163;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (((c) this).field_K == 3) {
                            statePc = 140;
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
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var11 = 160;
                        if (var14 == 0) {
                            statePc = 141;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var11 = 123;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var12 = (param3 + (-280 - ((c) this).field_k)) / ((c) this).field_d;
                        var9 = 320 + (var11 - -20) * (var12 + -1);
                        var10 = -(var11 >> -507344063) + var9;
                        if (6 != ((c) this).field_K) {
                            statePc = 144;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var9 += 86;
                        param3 = 430;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        var10 += 86;
                        if (var14 == 0) {
                            statePc = 157;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (-4 != (((c) this).field_K ^ -1)) {
                            statePc = 152;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var9 = 9 + (320 + (15 + var11) * (var12 - 1));
                        param3 = 430;
                        var10 = var9 + -(var11 >> -789315295);
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (15 == var6) {
                            statePc = 151;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        // wide iinc 10 -138
                        var11 = 229;
                        var9 = (var11 >> 1525654369) + var10;
                        if (var14 == 0) {
                            statePc = 157;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        param3 = 380;
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if ((var6 ^ -1) == -6) {
                            statePc = 156;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        var11 = 83;
                        var9 = 320;
                        param3 += 50;
                        var10 = var9 + -(var11 >> 761927361);
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (param0) {
                            statePc = 161;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        ma.a(param3, var10, 40, (byte) -92, var11, eb.field_g);
                        if (var14 == 0) {
                            statePc = 162;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 160;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        var9 = var9 + ((c) this).field_T;
                        var10 = var10 + ((c) this).field_T;
                        param3 = param3 - ((c) this).field_T;
                        ma.a(param3, var10, 40, (byte) -92, var11, eb.field_g);
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        param3 += 2;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (!param0) {
                            statePc = 165;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        dd.field_G.field_K[0][wf.field_p] = 15488514;
                        var12 = ((c) this).field_T;
                        if (var14 == 0) {
                            statePc = 166;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        var12 = 0;
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        if (var6 == 8) {
                            statePc = 171;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        stackOut_167_0 = 9;
                        stackIn_168_0 = stackOut_167_0;
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        if (stackIn_168_0 != var6) {
                            statePc = 179;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        var8.c(var7, 285 - -var12, 30 + param3, 0, -1);
                        sd.field_y.b(var12 + 280, param3 + 15);
                        if (var6 == 8) {
                            statePc = 176;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        stackOut_174_0 = oc.field_c;
                        stackIn_177_0 = stackOut_174_0;
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        stackOut_176_0 = j.field_gb;
                        stackIn_177_0 = stackOut_176_0;
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        var13 = stackIn_177_0;
                        var13 = var13 * (-4 + sd.field_y.field_s) / 80;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        re.field_h.b(280 + var13 + -1 + var12, 9 + param3);
                        if (var14 == 0) {
                            statePc = 182;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        var8.b(var7, var9, param3 + 30, 0, -1);
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        dd.field_G.field_K[0][wf.field_p] = 16689938;
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 184;
                        continue stateLoop;
                    }
                }
                case 184: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var5, "c.O(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 185: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_9_0 = null;
        int stackIn_13_0 = 0;
        Object stackIn_17_0 = null;
        int stackIn_46_0 = 0;
        Object stackIn_65_0 = null;
        int stackIn_87_0 = 0;
        int stackIn_91_0 = 0;
        Object stackIn_136_0 = null;
        int stackIn_140_0 = 0;
        Object stackIn_150_0 = null;
        Object stackIn_154_0 = null;
        Object stackIn_164_0 = null;
        int stackIn_180_0 = 0;
        Object stackIn_191_0 = null;
        Object stackIn_195_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_12_0 = 0;
        Object stackOut_16_0 = null;
        int stackOut_45_0 = 0;
        Object stackOut_64_0 = null;
        int stackOut_86_0 = 0;
        int stackOut_90_0 = 0;
        Object stackOut_135_0 = null;
        int stackOut_139_0 = 0;
        Object stackOut_149_0 = null;
        Object stackOut_153_0 = null;
        Object stackOut_163_0 = null;
        int stackOut_179_0 = 0;
        Object stackOut_190_0 = null;
        Object stackOut_194_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 62) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((c) this).field_X = -26;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!((c) this).field_g) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        if (((c) this).field_C) {
                            statePc = 20;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = this;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((((c) this).field_K ^ -1) == -1) {
                            statePc = 108;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == ((c) this).field_K) {
                            statePc = 108;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = this;
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
                        if ((((c) this).field_K ^ -1) == -5) {
                            statePc = 108;
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
                        if (-97 != (ki.field_d ^ -1)) {
                            statePc = 39;
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
                        if (!((c) this).field_C) {
                            statePc = 32;
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
                        if (-1 != (((c) this).field_o ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((c) this).field_o = 0;
                        if (var3 == 0) {
                            statePc = 104;
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
                        if (0 >= ((c) this).field_b) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((c) this).field_b = ((c) this).field_e;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ((c) this).field_b = ((c) this).field_b - 1;
                        ((c) this).field_l = true;
                        this.f((byte) 89);
                        if (var3 == 0) {
                            statePc = 104;
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
                        if ((ki.field_d ^ -1) == -98) {
                            statePc = 80;
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
                        if ((ki.field_d ^ -1) != -99) {
                            statePc = 61;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackOut_45_0 = 2;
                        stackIn_46_0 = stackOut_45_0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 != ((c) this).field_K) {
                            statePc = 61;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (((c) this).field_b >= 0) {
                            statePc = 55;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((c) this).field_b = 3;
                        if (var3 == 0) {
                            statePc = 104;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (5 != t.field_i[((c) this).field_K][((c) this).field_b]) {
                            statePc = 104;
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
                        ((c) this).field_b = 1;
                        if (var3 == 0) {
                            statePc = 104;
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
                        if (-100 != (ki.field_d ^ -1)) {
                            statePc = 104;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = this;
                        stackIn_65_0 = stackOut_64_0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if ((((c) this).field_K ^ -1) == -3) {
                            statePc = 70;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if ((((c) this).field_b ^ -1) <= -1) {
                            statePc = 74;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        ((c) this).field_b = 1;
                        if (var3 == 0) {
                            statePc = 104;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (t.field_i[((c) this).field_K][((c) this).field_b] == 5) {
                            statePc = 104;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        ((c) this).field_b = 3;
                        if (var3 == 0) {
                            statePc = 104;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (!((c) this).field_C) {
                            statePc = 97;
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
                        if (-2 == (((c) this).field_o ^ -1)) {
                            statePc = 104;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 89;
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
                        stackOut_86_0 = -122;
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
                        if (fh.c(stackIn_87_0)) {
                            statePc = 94;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackOut_90_0 = -1;
                        stackIn_91_0 = stackOut_90_0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (stackIn_91_0 <= (og.field_n ^ -1)) {
                            statePc = 104;
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
                        ((c) this).field_o = 1;
                        if (var3 == 0) {
                            statePc = 104;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        ((c) this).field_b = ((c) this).field_b + 1;
                        ((c) this).field_l = true;
                        if (((c) this).field_e > ((c) this).field_b) {
                            statePc = 103;
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
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        ((c) this).field_b = 0;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        this.c((byte) -117);
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (0 > ((c) this).field_b) {
                            statePc = 134;
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
                        ((c) this).a(((c) this).field_b, -49);
                        if (var3 == 0) {
                            statePc = 134;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (ki.field_d != 98) {
                            statePc = 118;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (0 >= ((c) this).field_b) {
                            statePc = 116;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        ((c) this).field_b = ((c) this).field_e;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        ((c) this).field_b = ((c) this).field_b - 1;
                        ((c) this).field_l = true;
                        this.f((byte) 89);
                        if (var3 == 0) {
                            statePc = 134;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if ((ki.field_d ^ -1) != -100) {
                            statePc = 128;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        ((c) this).field_b = ((c) this).field_b + 1;
                        if (((c) this).field_b >= ((c) this).field_e) {
                            statePc = 126;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        ((c) this).field_b = 0;
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        ((c) this).field_l = true;
                        this.c((byte) -107);
                        if (var3 == 0) {
                            statePc = 134;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (0 > ((c) this).field_b) {
                            statePc = 134;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        ((c) this).a(((c) this).field_b, -29);
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
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if ((ki.field_d ^ -1) != -70) {
                            statePc = 146;
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
                        stackOut_135_0 = this;
                        stackIn_136_0 = stackOut_135_0;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if ((((c) this).field_K ^ -1) != -4) {
                            statePc = 146;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        stackOut_139_0 = -5;
                        stackIn_140_0 = stackOut_139_0;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if (stackIn_140_0 >= (((c) this).field_q ^ -1)) {
                            statePc = 146;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        ((c) this).field_q = ((c) this).field_q + 1;
                        if (var3 == 0) {
                            statePc = 203;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if ((ki.field_d ^ -1) != -42) {
                            statePc = 160;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        stackOut_149_0 = this;
                        stackIn_150_0 = stackOut_149_0;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if ((((c) this).field_K ^ -1) != -4) {
                            statePc = 160;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        stackOut_153_0 = this;
                        stackIn_154_0 = stackOut_153_0;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if ((((c) this).field_q ^ -1) >= -1) {
                            statePc = 160;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        ((c) this).field_q = ((c) this).field_q - 1;
                        if (var3 == 0) {
                            statePc = 203;
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
                case 159: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 162;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if (13 != ki.field_d) {
                            statePc = 203;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        stackOut_163_0 = this;
                        stackIn_164_0 = stackOut_163_0;
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (((c) this).field_C) {
                            statePc = 203;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if (4 == ((c) this).field_K) {
                            statePc = 203;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        if (((c) this).field_K != 1) {
                            statePc = 176;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        ai.field_p = -1;
                        if (var3 == 0) {
                            statePc = 189;
                        } else {
                            statePc = 174;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        statePc = 176;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        if ((((c) this).field_K ^ -1) == -7) {
                            statePc = 186;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        stackOut_179_0 = -3;
                        stackIn_180_0 = stackOut_179_0;
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if (stackIn_180_0 == (((c) this).field_K ^ -1)) {
                            statePc = 186;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        ai.field_p = oc.field_b;
                        if (var3 == 0) {
                            statePc = 189;
                        } else {
                            statePc = 184;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        ai.field_p = 0;
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        if ((((c) this).field_K ^ -1) == (ai.field_p ^ -1)) {
                            statePc = 203;
                        } else {
                            statePc = 190;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        stackOut_190_0 = this;
                        stackIn_191_0 = stackOut_190_0;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if ((((c) this).field_K ^ -1) == -2) {
                            statePc = 198;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        stackOut_194_0 = this;
                        stackIn_195_0 = stackOut_194_0;
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        if ((((c) this).field_K ^ -1) != -1) {
                            statePc = 203;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        oc.field_b = ((c) this).field_K;
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        statePc = 203;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 202;
                        continue stateLoop;
                    }
                }
                case 202: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "c.D(" + param0 + 41);
                }
                case 203: {
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
        field_Q = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_ab = 0;
        field_r = "Names cannot start or end with space or underscore";
    }
}
