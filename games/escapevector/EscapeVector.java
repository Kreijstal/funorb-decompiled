/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

public final class EscapeVector extends g {
    static String field_z;
    public static int field_A;

    final void e(byte param0) {
        try {
            int var2_int = -74 / ((-71 - param0) / 55);
            eh.field_k = false;
            this.m(-27273);
            jd.a((byte) -54);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "EscapeVector.O(" + param0 + 41);
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        af stackIn_12_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_78_0 = 0;
        boolean stackIn_140_0 = false;
        boolean stackIn_148_0 = false;
        hl[] stackIn_159_0 = null;
        af stackOut_11_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Object stackOut_45_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_77_0 = 0;
        boolean stackOut_139_0 = false;
        boolean stackOut_147_0 = false;
        hl[] stackOut_158_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!ik.field_h[1]) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        gk.field_c = false;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!ik.field_h[2]) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        gk.field_c = true;
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2_int = 119 % ((param0 - -39) / 33);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (null == df.field_d) {
                            statePc = 18;
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
                        stackOut_11_0 = df.field_d;
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
                        if (!stackIn_12_0.field_c) {
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
                        ri.a(-25123);
                        oj.a((byte) 97);
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        bj.field_C.d();
                        ig.field_l.d();
                        stackOut_18_0 = this;
                        stackOut_18_1 = -1;
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (null == df.field_d) {
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
                        stackOut_19_0 = this;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = 1;
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
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = this;
                        stackOut_21_1 = stackIn_21_1;
                        stackOut_21_2 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((EscapeVector) this).a(stackIn_22_1, stackIn_22_2 != 0);
                        if (!of.field_b) {
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
                        this.f(true);
                        of.field_b = false;
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        od.field_s = false;
                        de.field_j = false;
                        r.field_y = false;
                        if (ii.b(16836)) {
                            statePc = 129;
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
                        if (!uk.field_h) {
                            statePc = 116;
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
                        if (!mb.b((byte) -120)) {
                            statePc = 113;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (mj.a((byte) 79)) {
                            statePc = 66;
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
                        if (!da.c((byte) -127)) {
                            statePc = 63;
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
                        if (ma.field_a == null) {
                            statePc = 45;
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
                        ma.field_a.s((byte) -41);
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackOut_45_0 = this;
                        stackIn_48_0 = stackOut_45_0;
                        stackIn_46_0 = stackOut_45_0;
                        if (df.field_d == null) {
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
                        stackOut_46_0 = this;
                        stackOut_46_1 = 1;
                        stackIn_49_0 = stackOut_46_0;
                        stackIn_49_1 = stackOut_46_1;
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = this;
                        stackOut_48_1 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var3 = ((EscapeVector) this).a(stackIn_49_1 != 0, -556);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var3 != 1) {
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
                        ri.a(-25123);
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var3 != 2) {
                            statePc = 62;
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
                        if (df.field_d == null) {
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
                        ri.a(-25123);
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        gk.a(-9787, oc.d((byte) -119));
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var4 == 0) {
                            statePc = 119;
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
                        mb.a((byte) -90);
                        this.q(1);
                        if (var4 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (ma.field_a == null) {
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        pf.e((byte) -125);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (mj.field_d == 0) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        sj.a(8192, (byte) 51);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        de.field_j = true;
                        if (null == ma.field_a) {
                            statePc = 84;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackOut_77_0 = 20;
                        stackIn_78_0 = stackOut_77_0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (stackIn_78_0 > mj.field_d) {
                            statePc = 84;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        de.field_j = false;
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (1000 <= mj.field_d) {
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
                        mj.field_d = mj.field_d + 1;
                        statePc = 86;
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var3 = fn.b(-14);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if ((var3 ^ -1) != -3) {
                            statePc = 93;
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
                        ri.a(-25123);
                        statePc = 91;
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (var3 != 3) {
                            statePc = 97;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        eo.a(24, true);
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (-5 != (var3 ^ -1)) {
                            statePc = 101;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        da.a((byte) -112);
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (!mj.a((byte) 92)) {
                            statePc = 104;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (null == ma.field_a) {
                            statePc = 108;
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
                        da.field_c.b(ch.field_a.field_j, 320);
                        if (var4 == 0) {
                            statePc = 111;
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
                        pl.field_q.b(-26480, pl.field_q.field_b.field_j);
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        mj.field_d = 0;
                        gi.a((byte) -67);
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (var4 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        ac.a(25972, mg.field_f);
                        km.b((byte) -59);
                        if (var4 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        this.n((byte) -96);
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (!rg.a(wd.field_u, 109)) {
                            statePc = 124;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        ((EscapeVector) this).f(127);
                        if (var4 != 0) {
                            statePc = 125;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (var4 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        rn.a(0, 30785);
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (!um.a(17830)) {
                            statePc = 138;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        int discarded$1 = ((EscapeVector) this).k((byte) -67);
                        if (var4 == 0) {
                            statePc = 138;
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
                        ((EscapeVector) this).j(-9926);
                        if (!ii.b(16836)) {
                            statePc = 134;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 138;
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (!mj.a((byte) 125)) {
                            statePc = 138;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        eo.a(24, true);
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (dj.field_c == null) {
                            statePc = 146;
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
                        stackOut_139_0 = r.field_y;
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
                        if (!stackIn_140_0) {
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
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        dj.field_c.g(2048);
                        dj.field_c = null;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (null == mb.field_a) {
                            statePc = 154;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        stackOut_147_0 = de.field_j;
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
                        if (stackIn_148_0) {
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
                        mb.field_a.g(2048);
                        mb.field_a = null;
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (od.field_s) {
                            statePc = 168;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        var3 = 0;
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        if (gd.field_K.length <= var3) {
                            statePc = 168;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (var4 != 0) {
                            statePc = 168;
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
                        stackOut_158_0 = gd.field_K;
                        stackIn_159_0 = stackOut_158_0;
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        if (stackIn_159_0[var3] != null) {
                            statePc = 164;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        gd.field_K[var3].g(256);
                        gd.field_K[var3] = null;
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        var3++;
                        if (var4 == 0) {
                            statePc = 156;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 167: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "EscapeVector.H(" + param0 + 41);
                }
                case 168: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void l(byte param0) {
        try {
            field_z = null;
            if (param0 >= -76) {
                EscapeVector.a((String) null, 38, -112, (byte) -73);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "EscapeVector.CB(" + param0 + 41);
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              EscapeVector.l((byte) -95);
              ag.a(47);
              nm.a(false);
              ek.a(69);
              dj.a((byte) -116);
              g.i((byte) -73);
              rn.a(false);
              eh.d((byte) -111);
              ad.b(-1);
              eg.a(-1);
              ca.a((byte) 104);
              em.a();
              mf.c(124);
              wl.a();
              nb.a(-111);
              n.a((byte) 70);
              td.a(128);
              dl.b((byte) -96);
              bg.a(13);
              rc.a(-49153);
              an.a(18);
              gm.a(8192);
              be.a((byte) -127);
              bm.a((byte) 110);
              ii.a(20);
              gi.c(-13885);
              mg.a(true);
              um.a(false);
              j.a(-76);
              ok.a(true);
              eo.b((byte) -72);
              vn.a((byte) 107);
              uc.a((byte) -59);
              af.a((byte) 71);
              pk.b(false);
              ak.c((byte) 77);
              dn.h(-1);
              ta.f(0);
              en.a(1);
              kg.f(80);
              p.b(99);
              sb.e(-4470);
              kk.b(-4);
              sk.b(true);
              rg.b((byte) 123);
              pj.b((byte) 6);
              cn.b(true);
              ce.b(-32408);
              o.d();
              ie.e();
              oe.f((byte) 69);
              t.b((byte) -34);
              ig.h(-60);
              pf.a(459);
              tf.a(-92);
              wc.a((byte) 49);
              dd.a(104);
              uj.a((byte) -106);
              jj.b(9);
              sa.a(false);
              hg.c(-71);
              nf.f(-363232252);
              fl.a((byte) -11);
              fi.b(-26317);
              ji.a(2097152);
              ge.b((byte) -58);
              gn.b(false);
              vd.c((byte) 80);
              sl.a(127);
              le.a(91);
              f.a((byte) 18);
              dh.a((byte) 124);
              ob.a((byte) 123);
              mj.a(true);
              jc.b(-1);
              gk.a((byte) -98);
              ug.a(true);
              ke.a(-71);
              wk.a(false);
              da.a(0);
              kc.a(-28377);
              tb.o(0);
              qc.t(-106);
              w.n(300);
              ng.j((byte) 124);
              pn.q(-5);
              bf.l(-125);
              h.k(96);
              oi.h((byte) 95);
              sn.a((byte) -118);
              uf.b(-27204);
              pa.a((byte) 103);
              dk.g(1);
              qe.b(0);
              we.a();
              in.a();
              u.a();
              ec.a((byte) -72);
              ib.a(0);
              kh.a((byte) 65);
              ac.c(105);
              na.d(3);
              od.d(-12548);
              oc.h(109);
              li.a(68);
              m.e(-1600199832);
              am.a((byte) -107);
              rb.a((byte) -85);
              pi.a((byte) 102);
              ic.a(false);
              co.a((byte) 63);
              cd.f(-1);
              fd.a((byte) 86);
              se.a((byte) 23);
              cb.a(-13379);
              bn.a(true);
              lh.a((byte) 26);
              nl.a(16558);
              fk.a(124);
              vj.a(-102);
              c.n(106);
              tj.a(true);
              df.a((byte) -88);
              bk.h(-24811);
              s.d((byte) 34);
              jg.a(true);
              hk.c((byte) 8);
              ma.b(1);
              e.b(32153);
              oa.f(5);
              on.a(127);
              tm.n(-23008);
              k.b(-24239);
              bi.c();
              ri.b(-117);
              ui.a(true);
              ia.a(true);
              ml.a(-117);
              aa.b((byte) -96);
              mm.b(56);
              cf.a(3);
              rd.a(-56);
              bc.a(0);
              ua.a(0);
              pc.a(true);
              ol.g(4095);
              nn.b((byte) 103);
              hd.a(127);
              mh.a(true);
              fh.a((byte) 86);
              i.a();
              th.a(8192);
              mn.a((byte) 96);
              jd.b((byte) 77);
              ej.a(26);
              hn.a((byte) -44);
              he.a(true);
              sc.a((byte) -76);
              ve.a(0);
              pg.b(0);
              hm.d((byte) 58);
              hc.j(1);
              r.a((byte) 58);
              vg.i((byte) -112);
              bb.h((byte) 127);
              bj.g((byte) -68);
              wf.a(false);
              ch.a(-5691);
              wa.a(false);
              si.f(95);
              v.a((byte) -87);
              ff.a(100);
              fa.a(true);
              b.a((byte) 118);
              ph.a((byte) 106);
              aj.a(0);
              ti.a((byte) -101);
              kb.a(true);
              qf.b(116);
              cg.f(-1);
              vi.a(119);
              ja.a(123);
              id.b(-17129);
              sf.a(false);
              fg.a((byte) -119);
              de.a(true);
              lj.a(true);
              sj.a((byte) 123);
              of.a(122);
              pb.a(false);
              qj.b(-10497);
              ki.l(88);
              gd.i((byte) -87);
              ul.f((byte) -96);
              fj.n(-11555);
              jm.a((byte) 127);
              rh.j(-24896);
              oj.e((byte) 113);
              lf.a((byte) 113);
              bo.a((byte) 105);
              ah.f(-16187);
              jf.j(1);
              eb.a(true);
              q.a((byte) 59);
              cl.a();
              cj.a(17159);
              wh.a(true);
              km.c(-4);
              kn.c(true);
              ni.l(-105);
              qa.e((byte) 59);
              om.a(5468);
              qm.a((byte) 126);
              vb.b((byte) 99);
              sh.f(0);
              vk.g(28);
              jb.c(true);
              mc.a(8123);
              hb.a(false);
              rm.a(true);
              ij.d(-83);
              ik.d(65535);
              di.b(0);
              ll.a((byte) -77);
              ck.a((byte) -31);
              ha.a((byte) 97);
              re.c(-11967);
              un.a((byte) -93);
              ae.a(1);
              md.l(119);
              tg.h(0);
              rl.d(29152);
              qk.a((byte) -79);
              gj.b(3355);
              me.k(0);
              je.a(-109);
              jl.a(-30082);
              gl.b(false);
              wd.d(94);
              tc.e(96);
              gf.b(12474);
              gb.b(-5);
              ea.b((byte) 118);
              ci.b(4);
              mb.a(4);
              qh.a(7);
              vc.a(-126);
              uk.a(-1);
              ga.a(-3217);
              jh.a(false);
              qd.b(false);
              rk.a(122);
              fn.a(122);
              mi.a((byte) 75);
              al.a(-128);
              lm.b((byte) -10);
              d.a((byte) 65);
              qi.j(8);
              oh.a((byte) -20);
              wi.a(64);
              tl.a((byte) -43);
              ee.a(false);
              ld.b((byte) -71);
              pl.c(256);
              bh.d(11);
              dc.a(false);
              cc.d(50);
              ei.e(-116);
              bd.d(-119);
              if (param0 < -52) {
                break L0;
              } else {
                this.p(-97);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          ef.a(59);
          vl.a(-19467);
          kf.c((byte) 0);
          nk.g(29779);
          hi.g(14);
          dg.g(0);
          kl.g(-17);
          lb.g(-17318);
          ka.a((byte) 14);
          bl.d(255);
          sm.b(true);
          tk.b(31167);
          ((EscapeVector) this).field_s = null;
        }
    }

    private final void n(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        dd var2_ref = null;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ac.a(param0 ^ -25900, mg.field_f);
                        if (null != fh.field_g) {
                            statePc = 10;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        gn.a(-122);
                        dn.a(pg.field_f, param0 ^ -17595, 70.0f);
                        ((EscapeVector) this).e((byte) -128);
                        fh.field_g = oi.a(param0 ^ -92, sn.field_c, "", "fonts_squarish16", fi.field_j);
                        sn.field_c = null;
                        ea.field_f = fe.a("", fi.field_j, "titles_escape", true);
                        f.field_o = fe.a("", fi.field_j, "titles_vector", true);
                        oi.field_O = fe.a("", fi.field_j, "titles_achievements", true);
                        lf.field_I = fe.a("", fi.field_j, "titles_achievements_this_game", true);
                        na.field_w = fe.a("", fi.field_j, "titles_highscores", true);
                        jf.field_H = fe.a("", fi.field_j, "titles_instructions", true);
                        kb.field_c = fe.a("", fi.field_j, "titles_retrieval_levels", true);
                        p.field_c = fe.a("", fi.field_j, "titles_retribution_levels", true);
                        oj.field_Q = fe.a("", fi.field_j, "titles_simulator_levels", true);
                        k.field_j = fe.a("", fi.field_j, "titles_select_level_set", true);
                        pj.field_g = kh.a(fi.field_j, (byte) 123, "", "level_set_icons");
                        this.m((byte) 125);
                        s.field_H = fe.a("", fi.field_j, "seeker_mine", true);
                        od.field_b = fe.a("", fi.field_j, "seeker_mine_glow", true);
                        mf.field_m = fe.a("", fi.field_j, "rock_buster", true);
                        ga.field_b = fe.a("", fi.field_j, "interface_level_complete", true);
                        ij.field_g = fe.a("", fi.field_j, "interface_game_over", true);
                        mc.field_d = kh.a(fi.field_j, (byte) 124, "", "achievements");
                        bn.a(mc.field_d, 0);
                        hn.field_c = fe.a("basic", ve.field_h, "unachieved", true);
                        rm.field_e = fe.a("basic", ve.field_h, "locked", true);
                        qh.field_l = new ed(hn.field_c.field_A, hn.field_c.field_z);
                        qh.field_l.f();
                        mb.a(fe.a("", fi.field_j, "achievements_next_page_button", true), -84);
                        mi.field_m = new ed[mc.field_d.length];
                        var2_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((mc.field_d.length ^ -1) >= (var2_int ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        mi.field_m[var2_int] = new ed(32, 32);
                        mi.field_m[var2_int].g();
                        mc.field_d[var2_int].a(0, 0, 32, 32);
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 9;
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
                        if (var3 == 0) {
                            statePc = 3;
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        id.field_a = new ed(32, 32);
                        id.field_a.g();
                        hn.field_c.a(0, 0, 32, 32);
                        uj.field_b = new ed(32, 32);
                        uj.field_b.g();
                        rm.field_e.a(0, 0, 32, 32);
                        md.field_D.a(param0 ^ -35);
                        this.g(false);
                        vd.field_f = kh.a(fi.field_j, (byte) 123, "", "level_complete_tick");
                        af.field_a = ae.a("scrshots", "", (byte) -48, fi.field_j);
                        ve.field_h = null;
                        fn.a((byte) 92);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        if (null != ff.field_i) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        dn.a(qf.field_n, 17637, 80.0f);
                        ((EscapeVector) this).e((byte) 7);
                        var2_ref = new dd(22050, ie.field_q);
                        ff.field_i = kj.a(hn.field_h, "", "write-text").a().a(var2_ref);
                        en.field_d = kj.a(hn.field_h, "", "cursor").a().a(var2_ref);
                        bm.field_a = kj.a(hn.field_h, "", "interference").a().a(var2_ref);
                        qh.field_i = kj.a(hn.field_h, "", "interference_300ms").a().a(var2_ref);
                        nn.field_g = kj.a(hn.field_h, "", "mainmenu_formation").a().a(var2_ref);
                        oa.field_w = kj.a(hn.field_h, "", "mouseover").a().a(var2_ref);
                        b.field_b = kj.a(hn.field_h, "", "level_indicator").a().a(var2_ref);
                        pc.field_a = kj.a(hn.field_h, "", "button_formation").a().a(var2_ref);
                        uf.field_g = kj.a(hn.field_h, "", "frame-appear").a().a(var2_ref);
                        si.field_t = kj.a(hn.field_h, "", "photo-blob-grow").a().a(var2_ref);
                        vd.field_g = kj.a(hn.field_h, "", "photo-body-explode").a().a(var2_ref);
                        ob.field_d = kj.a(hn.field_h, "", "grid_effect_1").a().a(var2_ref);
                        pa.field_b = kj.a(hn.field_h, "", "grid_effect_2").a().a(var2_ref);
                        dd.field_g = in.a(jm.field_I, "", "pixelate").b().a(var2_ref);
                        oj.field_N = kj.a(hn.field_h, "", "gas-pump").a().a(var2_ref);
                        ng.field_mb = kj.a(hn.field_h, "", "gas-burn").a().a(var2_ref);
                        ka.field_e = kj.a(hn.field_h, "", "left-foot-down").a().a(var2_ref);
                        ri.field_b = kj.a(hn.field_h, "", "right-foot-down").a().a(var2_ref);
                        ni.field_M = kj.a(hn.field_h, "", "ship-fire").a().a(var2_ref);
                        gn.field_e = kj.a(hn.field_h, "", "ship-fire-three").a().a(var2_ref);
                        uk.field_j = kj.a(hn.field_h, "", "alien-fire").a().a(var2_ref);
                        th.field_G = kj.a(hn.field_h, "", "shield").a().a(var2_ref);
                        co.field_d = kj.a(hn.field_h, "", "shield_impact").a().a(var2_ref);
                        gm.field_b = kj.a(hn.field_h, "", "shield_empty").a().a(var2_ref);
                        qa.field_E = kj.a(hn.field_h, "", "fuel-start").a().a(var2_ref);
                        lm.field_d = kj.a(hn.field_h, "", "fuel-filling").a().a(var2_ref);
                        al.field_b = kj.a(hn.field_h, "", "fuel-stop").a().a(var2_ref);
                        fn.field_f = kj.a(hn.field_h, "", "fuel-full").a().a(var2_ref);
                        fg.field_a = kj.a(hn.field_h, "", "crate-attach").a().a(var2_ref);
                        rk.field_c = kj.a(hn.field_h, "", "tether-tighten").a().a(var2_ref);
                        bc.field_c = kj.a(hn.field_h, "", "tether-release").a().a(var2_ref);
                        nm.field_a = kj.a(hn.field_h, "", "powerup-collect").a().a(var2_ref);
                        vi.field_c = kj.a(hn.field_h, "", "repeller-active").a().a(var2_ref);
                        w.field_hb = kj.a(hn.field_h, "", "magnet-active").a().a(var2_ref);
                        of.field_h = kj.a(hn.field_h, "", "laser").a().a(var2_ref);
                        ib.field_a = kj.a(hn.field_h, "", "explosion-ship").a().a(var2_ref);
                        vn.field_c = kj.a(hn.field_h, "", "explosion_5_seconds").a().a(var2_ref);
                        pa.field_a = in.a(jm.field_I, "", "beeping").b().a(var2_ref);
                        this.a(param0 + 97, var2_ref);
                        ci.field_a = kj.a(hn.field_h, "", "mine_inactive_hum_2").a().a(var2_ref);
                        qi.field_J = kj.a(hn.field_h, "", "100Hz square").a();
                        ve.field_d = kj.a(hn.field_h, "", "explosion-seeker-mine").a().a(var2_ref);
                        kf.field_p = kj.a(hn.field_h, "", "rockbuster").a().a(var2_ref);
                        td.field_c = kj.a(hn.field_h, "", "explosion-rock-buster").a().a(var2_ref);
                        jh.field_k = kj.a(hn.field_h, "", "level_complete").a().a(var2_ref);
                        pl.field_o = kj.a(hn.field_h, "", "level_complete_score").a().a(var2_ref);
                        fn.a((byte) 106);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        if (null != fj.field_eb) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        dn.a(q.field_H, param0 + 17733, 90.0f);
                        ((EscapeVector) this).e((byte) 48);
                        var2_ref = (dd) (Object) new ec(hn.field_h, jm.field_I);
                        jm.field_I = null;
                        hn.field_h = null;
                        fj.field_eb = nm.a(2, "", (ec) (Object) var2_ref, oc.field_D, "music/menu");
                        ul.field_O = nm.a(param0 ^ -94, "", (ec) (Object) var2_ref, oc.field_D, "music/briefing");
                        wc.field_d = nm.a(2, "", (ec) (Object) var2_ref, oc.field_D, "music/panic");
                        rk.field_d = new ce[5];
                        rk.field_d[0] = nm.a(2, "", (ec) (Object) var2_ref, oc.field_D, "music/oss_area_1");
                        rk.field_d[1] = nm.a(2, "", (ec) (Object) var2_ref, oc.field_D, "music/oss_area_2");
                        rk.field_d[2] = nm.a(2, "", (ec) (Object) var2_ref, oc.field_D, "music/oss_area_3");
                        rk.field_d[3] = nm.a(2, "", (ec) (Object) var2_ref, oc.field_D, "music/oss_area_4");
                        rk.field_d[4] = nm.a(n.a((int) param0, -94), "", (ec) (Object) var2_ref, oc.field_D, "music/simulator");
                        oc.field_D = null;
                        fn.a((byte) 93);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        if (null != ld.field_h) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        dn.a(qa.field_H, param0 ^ -17595, 100.0f);
                        ((EscapeVector) this).e((byte) -127);
                        ld.field_h = bg.a(bj.field_B, ld.field_h, he.field_u, 0);
                        bj.field_B = null;
                        fn.a((byte) 51);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return;
                }
                case 19: {
                    try {
                        qi.a(50, true);
                        pl.field_q = new t();
                        hn.field_l = new ig(1, vh.f(param0 ^ -35));
                        hm.field_o = new pf(true);
                        rc.field_a = new ak(false, 1);
                        if (param0 == -96) {
                            statePc = 23;
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
                        field_z = null;
                        statePc = 21;
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
                case 23: {
                    try {
                        da.field_b = new ta();
                        qk.field_e = new dn(true);
                        oe.c((byte) 115);
                        boolean discarded$1 = fg.c(0);
                        this.l(param0 + 95);
                        uk.field_h = true;
                        vl.b(1, 0);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "EscapeVector.FB(" + param0 + 41);
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void l(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == -1) {
                break L0;
              } else {
                field_z = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          nb.a((java.applet.Applet) this, 1585176, (byte) -125, 6340704, vj.field_c, 192);
          aj.field_a = new fe((java.applet.Applet) this, sh.field_r, af.field_a, vj.field_c);
          af.field_a = null;
        }
    }

    final static void a(hg param0, hg param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
                        if (param0.field_d != null) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param0.c((byte) -69);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2 == -7) {
                            statePc = 6;
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
                    return;
                }
                case 6: {
                    try {
                        param0.field_d = param1.field_d;
                        param0.field_b = param1;
                        param0.field_d.field_b = param0;
                        param0.field_b.field_d = param0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) runtimeException;
                        stackOut_9_1 = new StringBuilder().append("EscapeVector.WA(");
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (param0 == null) {
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
                        stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                        stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                        stackOut_10_2 = "{...}";
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
                    throw (RuntimeException) (Object) caughtException;
                }
                case 12: {
                    stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                    stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                    stackOut_12_2 = "null";
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param1 == null) {
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
                    throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 41);
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void o(int param0) {
        try {
            jm.field_K[param0] = fe.a("", fi.field_j, "sprites_fuel_glow", true);
            jm.field_K[2] = fe.a("", fi.field_j, "sprites_turret_glow", true);
            jm.field_K[3] = fe.a("", fi.field_j, "sprites_magnet_glow", true);
            jm.field_K[4] = fe.a("", fi.field_j, "sprites_repeller_glow", true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "EscapeVector.DB(" + param0 + 41);
        }
    }

    final static ca n(int param0) {
        try {
            Throwable var1 = null;
            RuntimeException var1_ref = null;
            Object stackIn_2_0 = null;
            ca stackIn_4_0 = null;
            Object stackIn_6_0 = null;
            Object stackOut_1_0 = null;
            ca stackOut_3_0 = null;
            Object stackOut_5_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (param0 == 13) {
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
                            stackOut_1_0 = null;
                            stackIn_2_0 = stackOut_1_0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return (ca) (Object) stackIn_2_0;
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = (ca) Class.forName("a").newInstance();
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0;
                    }
                    case 5: {
                        try {
                            var1 = caughtException;
                            stackOut_5_0 = null;
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
                        return (ca) (Object) stackIn_6_0;
                    }
                    case 7: {
                        var1_ref = (RuntimeException) (Object) caughtException;
                        throw t.a((Throwable) (Object) var1_ref, "EscapeVector.GB(" + param0 + 41);
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

    final void b(boolean param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (df.field_d == null) {
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
                        ri.a(-25123);
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
                        if (param0) {
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
                        field_z = null;
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
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (bj.field_C != null) {
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
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        bj.field_C.c();
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
                        if (ig.field_l != null) {
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
                        ig.field_l.c();
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
                        di.a(1);
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
                    throw t.a((Throwable) (Object) var2, "EscapeVector.B(" + param0 + 41);
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void f(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (null == mg.field_c) {
                break L0;
              } else {
                qc.a(8, mg.field_c);
                mg.field_c = null;
                fn.a((byte) 57);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          fi.field_j = ve.a(1, 0, param0, 1, true);
          sn.field_c = mj.a(6, -125);
          hn.field_h = mj.a(2, -126);
          jm.field_I = mj.a(3, -127);
          oc.field_D = mj.a(4, -126);
          bj.field_B = mj.a(10, -124);
          he.field_u = mj.a(5, -128);
          gj.a((byte) 57, ei.field_m, ve.field_h);
          uf.a(ve.field_h, ei.field_m, (byte) -96);
          fl.field_n = new uc(70);
          fl.field_n.a(ve.field_h, ah.field_l, sm.field_d, "basic", 14826);
          fl.field_n.a(fi.field_j, ah.field_l, sm.field_d, "", 14826);
          fl.field_n.a(fi.field_j, ah.field_l, sm.field_d, "scrshots", 14826);
          fl.field_n.a(sn.field_c, c.field_o, qf.field_h, "", 14826);
          fl.field_n.a(bd.field_g, (byte) -125, gm.field_d, hn.field_h);
          fl.field_n.a(bd.field_g, (byte) -115, gm.field_d, jm.field_I);
          fl.field_n.a(bm.field_f, (byte) -119, uc.field_d, oc.field_D);
          fl.field_n.a(cd.field_r, (byte) -121, ek.field_b, bj.field_B);
        }
    }

    final static boolean a(tg param0, tg param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == -7457) {
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
                        field_z = null;
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
                        var3_int = -param1.field_pb + param0.field_pb;
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
                        if (param0.field_lb == di.field_f) {
                            statePc = 13;
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
                        if (null == param0.field_lb) {
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
                        statePc = 16;
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
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        // wide iinc 3 200
                        if (var4 == 0) {
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
                        // wide iinc 3 -200
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
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (di.field_f == param1.field_lb) {
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
                        if (param1.field_lb == null) {
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
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        // wide iinc 3 -200
                        if (var4 == 0) {
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
                        // wide iinc 3 200
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
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var3_int ^ -1) >= -1) {
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
                        stackOut_27_0 = 1;
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
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 31: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    try {
                        stackOut_32_0 = (RuntimeException) var3;
                        stackOut_32_1 = new StringBuilder().append("EscapeVector.TA(");
                        stackIn_35_0 = stackOut_32_0;
                        stackIn_35_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (param0 == null) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                        stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                        stackOut_33_2 = "{...}";
                        stackIn_36_0 = stackOut_33_0;
                        stackIn_36_1 = stackOut_33_1;
                        stackIn_36_2 = stackOut_33_2;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 35: {
                    stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                    stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                    stackOut_35_2 = "null";
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    try {
                        stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                        stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(44);
                        stackIn_39_0 = stackOut_36_0;
                        stackIn_39_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (param1 == null) {
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
                        stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                        stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                        stackOut_37_2 = "{...}";
                        stackIn_40_0 = stackOut_37_0;
                        stackIn_40_1 = stackOut_37_1;
                        stackIn_40_2 = stackOut_37_2;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 39: {
                    stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                    stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                    stackOut_39_2 = "null";
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    stackIn_40_2 = stackOut_39_2;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    throw t.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, dd param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        sf.field_e[0] = kj.a(hn.field_h, "", "explosion-fuel-tank").a().a(param1);
                        sf.field_e[param0] = kj.a(hn.field_h, "", "explosion-crate").a().a(param1);
                        sf.field_e[4] = kj.a(hn.field_h, "", "explosion-magnet-repeller").a().a(param1);
                        sf.field_e[3] = kj.a(hn.field_h, "", "explosion-magnet-repeller").a().a(param1);
                        sf.field_e[2] = kj.a(hn.field_h, "", "explosion-turret").a().a(param1);
                        sf.field_e[8] = kj.a(hn.field_h, "", "explosion-tnt").a().a(param1);
                        sf.field_e[5] = kj.a(hn.field_h, "", "explosion-tnt").a().a(param1);
                        sf.field_e[7] = kj.a(hn.field_h, "", "explosion-laser").a().a(param1);
                        sf.field_e[6] = kj.a(hn.field_h, "", "explosion-laser").a().a(param1);
                        sf.field_e[13] = kj.a(hn.field_h, "", "explosion-powerup").a().a(param1);
                        sf.field_e[12] = kj.a(hn.field_h, "", "explosion-powerup").a().a(param1);
                        sf.field_e[11] = kj.a(hn.field_h, "", "explosion-powerup").a().a(param1);
                        sf.field_e[10] = kj.a(hn.field_h, "", "explosion-powerup").a().a(param1);
                        sf.field_e[9] = kj.a(hn.field_h, "", "explosion-powerup").a().a(param1);
                        this.a((byte) -60, sf.field_e[0]);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        stackOut_3_0 = (RuntimeException) var3;
                        stackOut_3_1 = new StringBuilder().append("EscapeVector.LB(").append(param0).append(44);
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_6_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (param1 == null) {
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
                    throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void m(int param0) {
        RuntimeException var2 = null;
        tj var2_ref = null;
        java.awt.Canvas var3 = null;
        int var4 = 0;
        long var5 = 0L;
        long var7 = 0L;
        int var9 = 0;
        Object stackIn_81_0 = null;
        oe stackIn_85_0 = null;
        Object stackIn_93_0 = null;
        oe stackIn_97_0 = null;
        int stackIn_110_0 = 0;
        Object stackOut_80_0 = null;
        oe stackOut_84_0 = null;
        Object stackOut_92_0 = null;
        oe stackOut_96_0 = null;
        int stackOut_109_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_ref = qa.f((byte) -49);
                        var3 = bf.i((byte) 10);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0 == -27273) {
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
                        field_z = null;
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
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = hm.g(11187) ? 1 : 0;
                        if (!ii.b(16836)) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        gb.a(var4 != 0, (byte) 92, var3);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        if (uk.field_h) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ah.a(var3, 0);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return;
                }
                case 12: {
                    try {
                        if (!mb.b((byte) -64)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        dn.a(ff.field_a, 17637, 100.0f);
                        ah.a(var3, 0);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return;
                }
                case 17: {
                    try {
                        if (var2_ref == null) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var2_ref.j(107);
                        if (var9 == 0) {
                            statePc = 79;
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
                case 21: {
                    try {
                        if (ma.field_a != null) {
                            statePc = 26;
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
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ma.field_a.G(0);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (!wk.field_c) {
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
                        em.d();
                        aj.field_a.c(-76);
                        if (var9 == 0) {
                            statePc = 79;
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
                        if (pg.field_b) {
                            statePc = 76;
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
                        if (-1 < (od.field_q ^ -1)) {
                            statePc = 40;
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
                        hn.field_l.e(3);
                        if (var9 == 0) {
                            statePc = 79;
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
                        if (n.field_h) {
                            statePc = 73;
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
                        if (!e.field_a) {
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
                        da.field_b.i(3);
                        if (var9 == 0) {
                            statePc = 79;
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
                        if (!hn.field_n) {
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
                        rc.field_a.a(false);
                        if (var9 == 0) {
                            statePc = 79;
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
                        if (!ch.field_b) {
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
                        qk.field_e.c((byte) 120);
                        if (var9 == 0) {
                            statePc = 79;
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
                        if (null == da.field_c) {
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
                        da.field_c.d((byte) 126);
                        if (var9 == 0) {
                            statePc = 79;
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
                        if (null != pl.field_q) {
                            statePc = 72;
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
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        pl.field_q.a((byte) -16);
                        if (var9 == 0) {
                            statePc = 79;
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
                        this.e(false);
                        if (var9 == 0) {
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
                        hm.field_o.d(100);
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
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (!od.field_k) {
                            statePc = 91;
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
                        stackOut_80_0 = null;
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
                        if (stackIn_81_0 == (Object) (Object) ma.field_a) {
                            statePc = 91;
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
                        stackOut_84_0 = ma.field_a;
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
                        if (stackIn_85_0.field_F) {
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
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 91;
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
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        fh.field_g.c("EASY PEASY MODE IS ON", 320, 40, 16744576, -1);
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (!od.field_k) {
                            statePc = 103;
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
                        stackOut_92_0 = null;
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
                        if (stackIn_93_0 == (Object) (Object) ma.field_a) {
                            statePc = 103;
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
                        stackOut_96_0 = ma.field_a;
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
                        if (stackIn_97_0.field_gb) {
                            statePc = 102;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
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
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        fh.field_g.c("TIME HACK MODE IS ON", 320, 40, 16744576, -1);
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (2 > mg.field_b) {
                            statePc = 108;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (!gk.field_c) {
                            statePc = 108;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        fh.field_g.b("FPS: " + th.field_p, 636, 100, 16777215, 0);
                        fh.field_g.b("LPS: " + qf.field_j, 636, 120, 16777215, 0);
                        var5 = Runtime.getRuntime().totalMemory();
                        var7 = Runtime.getRuntime().freeMemory();
                        fh.field_g.b((var5 - var7) / 1000L + " kB / " + var5 / 1000L + " kB", 636, 140, 16777215, 0);
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (!da.c((byte) -106)) {
                            statePc = 116;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        stackOut_109_0 = 122;
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
                        if (mj.a((byte) stackIn_110_0)) {
                            statePc = 116;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        mh.a((byte) -111, var4 != 0);
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        nn.a(var3, 0, -1, 0);
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 118: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "EscapeVector.BB(" + param0 + 41);
                }
                case 119: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(boolean param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_7_1 = false;
        int stackIn_7_2 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_9_1 = false;
        int stackIn_9_2 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_10_1 = false;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        int stackIn_37_5 = 0;
        int stackIn_37_6 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        int stackIn_39_4 = 0;
        int stackIn_39_5 = 0;
        int stackIn_39_6 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        int stackIn_40_5 = 0;
        int stackIn_40_6 = 0;
        int stackIn_40_7 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        int stackIn_41_4 = 0;
        int stackIn_41_5 = 0;
        int stackIn_41_6 = 0;
        int stackIn_41_7 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_43_4 = 0;
        int stackIn_43_5 = 0;
        int stackIn_43_6 = 0;
        int stackIn_43_7 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        int stackIn_44_5 = 0;
        int stackIn_44_6 = 0;
        int stackIn_44_7 = 0;
        int stackIn_44_8 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        int stackIn_49_4 = 0;
        int stackIn_49_5 = 0;
        int stackIn_49_6 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        int stackIn_51_4 = 0;
        int stackIn_51_5 = 0;
        int stackIn_51_6 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        int stackIn_52_4 = 0;
        int stackIn_52_5 = 0;
        int stackIn_52_6 = 0;
        int stackIn_52_7 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        int stackIn_53_4 = 0;
        int stackIn_53_5 = 0;
        int stackIn_53_6 = 0;
        int stackIn_53_7 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_55_3 = 0;
        int stackIn_55_4 = 0;
        int stackIn_55_5 = 0;
        int stackIn_55_6 = 0;
        int stackIn_55_7 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_56_3 = 0;
        int stackIn_56_4 = 0;
        int stackIn_56_5 = 0;
        int stackIn_56_6 = 0;
        int stackIn_56_7 = 0;
        int stackIn_56_8 = 0;
        int stackIn_57_0 = 0;
        String stackIn_57_1 = null;
        int stackIn_59_0 = 0;
        String stackIn_59_1 = null;
        int stackIn_60_0 = 0;
        String stackIn_60_1 = null;
        int stackIn_60_2 = 0;
        int stackIn_61_0 = 0;
        String stackIn_61_1 = null;
        int stackIn_63_0 = 0;
        String stackIn_63_1 = null;
        int stackIn_64_0 = 0;
        String stackIn_64_1 = null;
        int stackIn_64_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_6_0 = 0;
        boolean stackOut_6_1 = false;
        int stackOut_6_2 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_7_1 = false;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_9_0 = 0;
        boolean stackOut_9_1 = false;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        int stackOut_36_5 = 0;
        int stackOut_36_6 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        int stackOut_37_5 = 0;
        int stackOut_37_6 = 0;
        int stackOut_37_7 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        int stackOut_39_5 = 0;
        int stackOut_39_6 = 0;
        int stackOut_39_7 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        int stackOut_40_4 = 0;
        int stackOut_40_5 = 0;
        int stackOut_40_6 = 0;
        int stackOut_40_7 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        int stackOut_41_4 = 0;
        int stackOut_41_5 = 0;
        int stackOut_41_6 = 0;
        int stackOut_41_7 = 0;
        int stackOut_41_8 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        int stackOut_43_5 = 0;
        int stackOut_43_6 = 0;
        int stackOut_43_7 = 0;
        int stackOut_43_8 = 0;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        int stackOut_48_4 = 0;
        int stackOut_48_5 = 0;
        int stackOut_48_6 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        int stackOut_49_4 = 0;
        int stackOut_49_5 = 0;
        int stackOut_49_6 = 0;
        int stackOut_49_7 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        int stackOut_51_5 = 0;
        int stackOut_51_6 = 0;
        int stackOut_51_7 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        int stackOut_52_4 = 0;
        int stackOut_52_5 = 0;
        int stackOut_52_6 = 0;
        int stackOut_52_7 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        int stackOut_53_4 = 0;
        int stackOut_53_5 = 0;
        int stackOut_53_6 = 0;
        int stackOut_53_7 = 0;
        int stackOut_53_8 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_55_3 = 0;
        int stackOut_55_4 = 0;
        int stackOut_55_5 = 0;
        int stackOut_55_6 = 0;
        int stackOut_55_7 = 0;
        int stackOut_55_8 = 0;
        int stackOut_56_0 = 0;
        String stackOut_56_1 = null;
        int stackOut_57_0 = 0;
        String stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_59_0 = 0;
        String stackOut_59_1 = null;
        int stackOut_59_2 = 0;
        int stackOut_60_0 = 0;
        String stackOut_60_1 = null;
        int stackOut_61_0 = 0;
        String stackOut_61_1 = null;
        int stackOut_61_2 = 0;
        int stackOut_63_0 = 0;
        String stackOut_63_1 = null;
        int stackOut_63_2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        em.d();
                        od.b(2);
                        var2 = nk.field_r;
                        var3 = ce.field_f.b(110) ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = var3;
                        stackOut_1_1 = 4;
                        stackIn_4_0 = stackOut_1_0;
                        stackIn_4_1 = stackOut_1_1;
                        stackIn_2_0 = stackOut_1_0;
                        stackIn_2_1 = stackOut_1_1;
                        if (null == de.field_i) {
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
                        stackOut_2_0 = stackIn_2_0;
                        stackOut_2_1 = stackIn_2_1;
                        stackOut_2_2 = 1;
                        stackIn_5_0 = stackOut_2_0;
                        stackIn_5_1 = stackOut_2_1;
                        stackIn_5_2 = stackOut_2_2;
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = stackIn_4_0;
                        stackOut_4_1 = stackIn_4_1;
                        stackOut_4_2 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        stackIn_5_2 = stackOut_4_2;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = dn.a(stackIn_5_0 != 0, stackIn_5_1, stackIn_5_2 != 0, ua.field_c.d(17523));
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = var3;
                        stackOut_6_1 = ua.field_c.d(17523);
                        stackOut_6_2 = -8;
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_9_2 = stackOut_6_2;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        if (null == de.field_i) {
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
                        stackOut_7_0 = stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = stackIn_7_2;
                        stackOut_7_3 = 1;
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_10_2 = stackOut_7_2;
                        stackIn_10_3 = stackOut_7_3;
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = stackIn_9_2;
                        stackOut_9_3 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        stackIn_10_3 = stackOut_9_3;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = qd.a(stackIn_10_0 != 0, stackIn_10_1, (byte) stackIn_10_2, stackIn_10_3 != 0);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = var3;
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (de.field_i == null) {
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
                        stackOut_12_0 = stackIn_12_0;
                        stackOut_12_1 = 1;
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        statePc = 15;
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = stackIn_14_0;
                        stackOut_14_1 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = ik.a(stackIn_15_0 != 0, stackIn_15_1 != 0, (byte) -112, ua.field_c.d(17523));
                        var7 = fh.field_g.b(var2);
                        var8 = fh.field_g.b(var4);
                        if (var8 <= var7) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7 = var8;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = fh.field_g.b(var5);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var8 > var7) {
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var7 = var8;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8 = fh.field_g.b(var6);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var8 > var7) {
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7 = var8;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var8 = var7 / 2 + 25;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (40 > mj.field_d) {
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
                        stackOut_29_0 = 0;
                        stackIn_32_0 = stackOut_29_0;
                        statePc = 32;
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = -mj.field_d + 40;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        fc.a(stackIn_32_0, -var8 + 320, var8 + 321, 405, true, 29788, true, 6324320, 3162160, 0, 195, true);
                        if (20 <= mj.field_d) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = (20 + -mj.field_d) * 2;
                        stackIn_36_0 = stackOut_33_0;
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = 0;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = stackIn_36_0;
                        stackOut_36_1 = 240;
                        stackOut_36_2 = 400;
                        stackOut_36_3 = 289;
                        stackOut_36_4 = 1;
                        stackOut_36_5 = 29788;
                        stackOut_36_6 = 0;
                        stackIn_39_0 = stackOut_36_0;
                        stackIn_39_1 = stackOut_36_1;
                        stackIn_39_2 = stackOut_36_2;
                        stackIn_39_3 = stackOut_36_3;
                        stackIn_39_4 = stackOut_36_4;
                        stackIn_39_5 = stackOut_36_5;
                        stackIn_39_6 = stackOut_36_6;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        stackIn_37_3 = stackOut_36_3;
                        stackIn_37_4 = stackOut_36_4;
                        stackIn_37_5 = stackOut_36_5;
                        stackIn_37_6 = stackOut_36_6;
                        if (-1 == (di.field_d.field_h ^ -1)) {
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
                        stackOut_37_0 = stackIn_37_0;
                        stackOut_37_1 = stackIn_37_1;
                        stackOut_37_2 = stackIn_37_2;
                        stackOut_37_3 = stackIn_37_3;
                        stackOut_37_4 = stackIn_37_4;
                        stackOut_37_5 = stackIn_37_5;
                        stackOut_37_6 = stackIn_37_6;
                        stackOut_37_7 = 6340704;
                        stackIn_40_0 = stackOut_37_0;
                        stackIn_40_1 = stackOut_37_1;
                        stackIn_40_2 = stackOut_37_2;
                        stackIn_40_3 = stackOut_37_3;
                        stackIn_40_4 = stackOut_37_4;
                        stackIn_40_5 = stackOut_37_5;
                        stackIn_40_6 = stackOut_37_6;
                        stackIn_40_7 = stackOut_37_7;
                        statePc = 40;
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = stackIn_39_0;
                        stackOut_39_1 = stackIn_39_1;
                        stackOut_39_2 = stackIn_39_2;
                        stackOut_39_3 = stackIn_39_3;
                        stackOut_39_4 = stackIn_39_4;
                        stackOut_39_5 = stackIn_39_5;
                        stackOut_39_6 = stackIn_39_6;
                        stackOut_39_7 = 16777215;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        stackIn_40_2 = stackOut_39_2;
                        stackIn_40_3 = stackOut_39_3;
                        stackIn_40_4 = stackOut_39_4;
                        stackIn_40_5 = stackOut_39_5;
                        stackIn_40_6 = stackOut_39_6;
                        stackIn_40_7 = stackOut_39_7;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = stackIn_40_0;
                        stackOut_40_1 = stackIn_40_1;
                        stackOut_40_2 = stackIn_40_2;
                        stackOut_40_3 = stackIn_40_3;
                        stackOut_40_4 = stackIn_40_4;
                        stackOut_40_5 = stackIn_40_5;
                        stackOut_40_6 = stackIn_40_6;
                        stackOut_40_7 = stackIn_40_7;
                        stackIn_43_0 = stackOut_40_0;
                        stackIn_43_1 = stackOut_40_1;
                        stackIn_43_2 = stackOut_40_2;
                        stackIn_43_3 = stackOut_40_3;
                        stackIn_43_4 = stackOut_40_4;
                        stackIn_43_5 = stackOut_40_5;
                        stackIn_43_6 = stackOut_40_6;
                        stackIn_43_7 = stackOut_40_7;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        stackIn_41_2 = stackOut_40_2;
                        stackIn_41_3 = stackOut_40_3;
                        stackIn_41_4 = stackOut_40_4;
                        stackIn_41_5 = stackOut_40_5;
                        stackIn_41_6 = stackOut_40_6;
                        stackIn_41_7 = stackOut_40_7;
                        if (di.field_d.field_h == 0) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = stackIn_41_0;
                        stackOut_41_1 = stackIn_41_1;
                        stackOut_41_2 = stackIn_41_2;
                        stackOut_41_3 = stackIn_41_3;
                        stackOut_41_4 = stackIn_41_4;
                        stackOut_41_5 = stackIn_41_5;
                        stackOut_41_6 = stackIn_41_6;
                        stackOut_41_7 = stackIn_41_7;
                        stackOut_41_8 = 3170352;
                        stackIn_44_0 = stackOut_41_0;
                        stackIn_44_1 = stackOut_41_1;
                        stackIn_44_2 = stackOut_41_2;
                        stackIn_44_3 = stackOut_41_3;
                        stackIn_44_4 = stackOut_41_4;
                        stackIn_44_5 = stackOut_41_5;
                        stackIn_44_6 = stackOut_41_6;
                        stackIn_44_7 = stackOut_41_7;
                        stackIn_44_8 = stackOut_41_8;
                        statePc = 44;
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = stackIn_43_0;
                        stackOut_43_1 = stackIn_43_1;
                        stackOut_43_2 = stackIn_43_2;
                        stackOut_43_3 = stackIn_43_3;
                        stackOut_43_4 = stackIn_43_4;
                        stackOut_43_5 = stackIn_43_5;
                        stackOut_43_6 = stackIn_43_6;
                        stackOut_43_7 = stackIn_43_7;
                        stackOut_43_8 = 8421504;
                        stackIn_44_0 = stackOut_43_0;
                        stackIn_44_1 = stackOut_43_1;
                        stackIn_44_2 = stackOut_43_2;
                        stackIn_44_3 = stackOut_43_3;
                        stackIn_44_4 = stackOut_43_4;
                        stackIn_44_5 = stackOut_43_5;
                        stackIn_44_6 = stackOut_43_6;
                        stackIn_44_7 = stackOut_43_7;
                        stackIn_44_8 = stackOut_43_8;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        fc.a(stackIn_44_0, stackIn_44_1, stackIn_44_2, stackIn_44_3, stackIn_44_4 != 0, stackIn_44_5, stackIn_44_6 != 0, stackIn_44_7, stackIn_44_8, 1, 262, param0);
                        if (mj.field_d >= 30) {
                            statePc = 47;
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
                        stackOut_45_0 = 2 * (30 - mj.field_d);
                        stackIn_48_0 = stackOut_45_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 66;
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = stackIn_48_0;
                        stackOut_48_1 = 280;
                        stackOut_48_2 = 360;
                        stackOut_48_3 = 359;
                        stackOut_48_4 = 1;
                        stackOut_48_5 = 29788;
                        stackOut_48_6 = 0;
                        stackIn_51_0 = stackOut_48_0;
                        stackIn_51_1 = stackOut_48_1;
                        stackIn_51_2 = stackOut_48_2;
                        stackIn_51_3 = stackOut_48_3;
                        stackIn_51_4 = stackOut_48_4;
                        stackIn_51_5 = stackOut_48_5;
                        stackIn_51_6 = stackOut_48_6;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        stackIn_49_2 = stackOut_48_2;
                        stackIn_49_3 = stackOut_48_3;
                        stackIn_49_4 = stackOut_48_4;
                        stackIn_49_5 = stackOut_48_5;
                        stackIn_49_6 = stackOut_48_6;
                        if (-2 == (di.field_d.field_h ^ -1)) {
                            statePc = 51;
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
                        stackOut_49_0 = stackIn_49_0;
                        stackOut_49_1 = stackIn_49_1;
                        stackOut_49_2 = stackIn_49_2;
                        stackOut_49_3 = stackIn_49_3;
                        stackOut_49_4 = stackIn_49_4;
                        stackOut_49_5 = stackIn_49_5;
                        stackOut_49_6 = stackIn_49_6;
                        stackOut_49_7 = 6340704;
                        stackIn_52_0 = stackOut_49_0;
                        stackIn_52_1 = stackOut_49_1;
                        stackIn_52_2 = stackOut_49_2;
                        stackIn_52_3 = stackOut_49_3;
                        stackIn_52_4 = stackOut_49_4;
                        stackIn_52_5 = stackOut_49_5;
                        stackIn_52_6 = stackOut_49_6;
                        stackIn_52_7 = stackOut_49_7;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = stackIn_51_0;
                        stackOut_51_1 = stackIn_51_1;
                        stackOut_51_2 = stackIn_51_2;
                        stackOut_51_3 = stackIn_51_3;
                        stackOut_51_4 = stackIn_51_4;
                        stackOut_51_5 = stackIn_51_5;
                        stackOut_51_6 = stackIn_51_6;
                        stackOut_51_7 = 16777215;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        stackIn_52_2 = stackOut_51_2;
                        stackIn_52_3 = stackOut_51_3;
                        stackIn_52_4 = stackOut_51_4;
                        stackIn_52_5 = stackOut_51_5;
                        stackIn_52_6 = stackOut_51_6;
                        stackIn_52_7 = stackOut_51_7;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = stackIn_52_0;
                        stackOut_52_1 = stackIn_52_1;
                        stackOut_52_2 = stackIn_52_2;
                        stackOut_52_3 = stackIn_52_3;
                        stackOut_52_4 = stackIn_52_4;
                        stackOut_52_5 = stackIn_52_5;
                        stackOut_52_6 = stackIn_52_6;
                        stackOut_52_7 = stackIn_52_7;
                        stackIn_55_0 = stackOut_52_0;
                        stackIn_55_1 = stackOut_52_1;
                        stackIn_55_2 = stackOut_52_2;
                        stackIn_55_3 = stackOut_52_3;
                        stackIn_55_4 = stackOut_52_4;
                        stackIn_55_5 = stackOut_52_5;
                        stackIn_55_6 = stackOut_52_6;
                        stackIn_55_7 = stackOut_52_7;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        stackIn_53_2 = stackOut_52_2;
                        stackIn_53_3 = stackOut_52_3;
                        stackIn_53_4 = stackOut_52_4;
                        stackIn_53_5 = stackOut_52_5;
                        stackIn_53_6 = stackOut_52_6;
                        stackIn_53_7 = stackOut_52_7;
                        if (di.field_d.field_h == 1) {
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
                        stackOut_53_0 = stackIn_53_0;
                        stackOut_53_1 = stackIn_53_1;
                        stackOut_53_2 = stackIn_53_2;
                        stackOut_53_3 = stackIn_53_3;
                        stackOut_53_4 = stackIn_53_4;
                        stackOut_53_5 = stackIn_53_5;
                        stackOut_53_6 = stackIn_53_6;
                        stackOut_53_7 = stackIn_53_7;
                        stackOut_53_8 = 3170352;
                        stackIn_56_0 = stackOut_53_0;
                        stackIn_56_1 = stackOut_53_1;
                        stackIn_56_2 = stackOut_53_2;
                        stackIn_56_3 = stackOut_53_3;
                        stackIn_56_4 = stackOut_53_4;
                        stackIn_56_5 = stackOut_53_5;
                        stackIn_56_6 = stackOut_53_6;
                        stackIn_56_7 = stackOut_53_7;
                        stackIn_56_8 = stackOut_53_8;
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackOut_55_0 = stackIn_55_0;
                        stackOut_55_1 = stackIn_55_1;
                        stackOut_55_2 = stackIn_55_2;
                        stackOut_55_3 = stackIn_55_3;
                        stackOut_55_4 = stackIn_55_4;
                        stackOut_55_5 = stackIn_55_5;
                        stackOut_55_6 = stackIn_55_6;
                        stackOut_55_7 = stackIn_55_7;
                        stackOut_55_8 = 8421504;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        stackIn_56_2 = stackOut_55_2;
                        stackIn_56_3 = stackOut_55_3;
                        stackIn_56_4 = stackOut_55_4;
                        stackIn_56_5 = stackOut_55_5;
                        stackIn_56_6 = stackOut_55_6;
                        stackIn_56_7 = stackOut_55_7;
                        stackIn_56_8 = stackOut_55_8;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        fc.a(stackIn_56_0, stackIn_56_1, stackIn_56_2, stackIn_56_3, stackIn_56_4 != 0, stackIn_56_5, stackIn_56_6 != 0, stackIn_56_7, stackIn_56_8, 2, 332, false);
                        pb.a(4);
                        fh.field_g.c(var2, 320, 235, 10551200, -1);
                        fh.field_g.c(var4, 320, 255, 10551200, -1);
                        stackOut_56_0 = 285;
                        stackOut_56_1 = cn.field_e;
                        stackIn_59_0 = stackOut_56_0;
                        stackIn_59_1 = stackOut_56_1;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        if ((di.field_d.field_h ^ -1) != -1) {
                            statePc = 59;
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
                        stackOut_57_0 = stackIn_57_0;
                        stackOut_57_1 = (String) (Object) stackIn_57_1;
                        stackOut_57_2 = 16777215;
                        stackIn_60_0 = stackOut_57_0;
                        stackIn_60_1 = stackOut_57_1;
                        stackIn_60_2 = stackOut_57_2;
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackOut_59_0 = stackIn_59_0;
                        stackOut_59_1 = (String) (Object) stackIn_59_1;
                        stackOut_59_2 = 6340704;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        stackIn_60_2 = stackOut_59_2;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        lb.a(stackIn_60_0, stackIn_60_1, stackIn_60_2, -128, 320);
                        fh.field_g.c(var5, 320, 325, 10551200, -1);
                        stackOut_60_0 = 355;
                        stackOut_60_1 = sj.field_j;
                        stackIn_63_0 = stackOut_60_0;
                        stackIn_63_1 = stackOut_60_1;
                        stackIn_61_0 = stackOut_60_0;
                        stackIn_61_1 = stackOut_60_1;
                        if (di.field_d.field_h == 1) {
                            statePc = 63;
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
                        stackOut_61_0 = stackIn_61_0;
                        stackOut_61_1 = (String) (Object) stackIn_61_1;
                        stackOut_61_2 = 6340704;
                        stackIn_64_0 = stackOut_61_0;
                        stackIn_64_1 = stackOut_61_1;
                        stackIn_64_2 = stackOut_61_2;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = stackIn_63_0;
                        stackOut_63_1 = (String) (Object) stackIn_63_1;
                        stackOut_63_2 = 16777215;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        stackIn_64_2 = stackOut_63_2;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        lb.a(stackIn_64_0, stackIn_64_1, stackIn_64_2, -118, 320);
                        fh.field_g.c(var6, 320, 385, 10551200, -1);
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2_ref, "EscapeVector.UA(" + param0 + 41);
                }
                case 67: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void init() {
        try {
            ((EscapeVector) this).a("escapevector", 640, 12);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "EscapeVector.init()");
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              ((EscapeVector) this).a(0, 11, 8, 7, 21, (byte) -99, false, 9);
              ie.a(22050, true, 10);
              bj.field_C = ie.a(g.field_r, (java.awt.Component) (Object) of.field_d, 0, 1024);
              ig.field_l = ie.a(g.field_r, (java.awt.Component) (Object) of.field_d, 1, 22050);
              rk.field_e = new hj();
              bj.field_C.b((wg) (Object) rk.field_e);
              pl.field_n = new hj();
              ec.field_a = new wb((wg) (Object) pl.field_n);
              ec.field_a.d(0.9399999976158142f);
              ec.field_a.b(14.826103210449219f);
              rk.field_e.a((wg) (Object) ec.field_a);
              nb.field_c = new hj();
              ma.field_b = new wb((wg) (Object) nb.field_c);
              if (param0 == -97) {
                break L0;
              } else {
                EscapeVector.a((String) null, 31, 49, (byte) 88);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          ma.field_b.d(0.9399999976158142f);
          ma.field_b.b(14.826103210449219f);
          ig.field_l.b((wg) (Object) ma.field_b);
          ((EscapeVector) this).a(true, (byte) -35, true, true, true);
          ua.field_c = new kg();
        }
    }

    public EscapeVector() {
    }

    private final void p(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          mb.field_f[0] = fe.a("", fi.field_j, "sprites_fuel", true);
          mb.field_f[1] = fe.a("", fi.field_j, "sprites_crate", true);
          mb.field_f[2] = fe.a("", fi.field_j, "sprites_turret", true);
          mb.field_f[3] = fe.a("", fi.field_j, "sprites_magnet", true);
          mb.field_f[4] = fe.a("", fi.field_j, "sprites_repeller", true);
          mb.field_f[5] = fe.a("", fi.field_j, "sprites_tnt", true);
          mb.field_f[6] = fe.a("", fi.field_j, "sprites_laser_left", true);
          var2_int = -111 / ((60 - param0) / 58);
          mb.field_f[7] = fe.a("", fi.field_j, "sprites_laser_right", true);
          mb.field_f[8] = fe.a("", fi.field_j, "sprites_barrier", true);
          mb.field_f[9] = fe.a("", fi.field_j, "sprites_powerup_shield", true);
          mb.field_f[10] = fe.a("", fi.field_j, "sprites_powerup_triple_shot", true);
          mb.field_f[11] = fe.a("", fi.field_j, "sprites_powerup_thrust", true);
          mb.field_f[12] = fe.a("", fi.field_j, "sprites_powerup_one_rockbuster", true);
          mb.field_f[13] = fe.a("", fi.field_j, "sprites_powerup_five_rockbusters", true);
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var2 = decompiledCaughtException;
        throw t.a((Throwable) (Object) var2, "EscapeVector.MB(" + param0 + 41);
    }

    private final void q(int param0) {
        tj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        tj stackIn_5_0 = null;
        tj stackIn_16_0 = null;
        oe stackIn_26_0 = null;
        int stackIn_41_0 = 0;
        tj stackOut_4_0 = null;
        tj stackOut_15_0 = null;
        oe stackOut_25_0 = null;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = qa.f((byte) -49);
                        if (param0 == 1) {
                            statePc = 3;
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
                    return;
                }
                case 3: {
                    try {
                        if (var2 == null) {
                            statePc = 22;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (tj) var2;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0.field_l) {
                            statePc = 22;
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
                        if ((lf.field_H ^ -1) == -2) {
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
                        vc.a(40, ul.field_O, true, (byte) -101);
                        lf.field_H = 1;
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
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-1 + var2.field_g.length > var2.field_E) {
                            statePc = 49;
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
                        stackOut_15_0 = (tj) var2;
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
                        if (stackIn_16_0.field_C == var2.field_B) {
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
                        statePc = 49;
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
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        wa.a(40 * var2.field_t / 100, 32471);
                        if (var4 == 0) {
                            statePc = 49;
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
                        if (null != var2) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = ma.field_a;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 != null) {
                            statePc = 35;
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
                        if (0 == lf.field_H) {
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
                        vc.a(64, fj.field_eb, true, (byte) -63);
                        lf.field_H = 0;
                        if (var4 == 0) {
                            statePc = 49;
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
                        if ((lf.field_H ^ -1) == -3) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = 1;
                        stackIn_41_0 = stackOut_38_0;
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
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var3 = stackIn_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (ma.field_a == null) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ma.field_a.e(var3 != 0, 0);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
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
                        lf.field_H = 2;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2_ref, "EscapeVector.EB(" + param0 + 41);
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        fh.field_g.c(param0, -1 + param1, -1 + param2, 0, -1, 64);
                        fh.field_g.c(param0, 1 + param1, -1 + param2, 0, -1, 64);
                        fh.field_g.c(param0, -1 + param1, param2 - -1, 0, -1, 64);
                        fh.field_g.c(param0, 1 + param1, 1 + param2, 0, -1, 64);
                        var4_int = 71 % ((52 - param3) / 53);
                        fh.field_g.a(param0, param1, param2, 16777215, -1);
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
                        stackOut_3_1 = new StringBuilder().append("EscapeVector.JB(");
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
                    throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void g(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (!param0) {
                break L0;
              } else {
                this.m((byte) 29);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          km.field_k = fe.a("", fi.field_j, "classic_level_select_bg", true);
          aj.field_c = fe.a("", fi.field_j, "vengeance_level_select_bg", true);
        }
    }

    private final void a(byte param0, hh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
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
                        if (param0 < -17) {
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
                        ((EscapeVector) this).a((byte) -2);
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
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (3 <= var3_int) {
                            statePc = 19;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = var3_int + 14;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        sf.field_e[var4] = param1;
                        var3_int++;
                        if (var5 != 0) {
                            statePc = 19;
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
                        if (var5 == 0) {
                            statePc = 6;
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
                        statePc = 19;
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
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) runtimeException;
                        stackOut_14_1 = new StringBuilder().append("EscapeVector.KB(").append(param0).append(44);
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (param1 == null) {
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
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "{...}";
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_18_1 = stackOut_15_1;
                        stackIn_18_2 = stackOut_15_2;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 17: {
                    stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                    stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                    stackOut_17_2 = "null";
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void m(byte param0) {
        try {
            this.p(-28);
            int var2_int = 116 / ((-30 - param0) / 47);
            this.o(0);
            qh.a(fi.field_j, (byte) -23);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "EscapeVector.IB(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Members' Expansion";
    }
}
