/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class BachelorFridge extends ms {
    private boolean field_x;
    public static int field_y;

    private final void a(boolean param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_68_0 = false;
        boolean stackIn_72_0 = false;
        boolean stackIn_79_0 = false;
        boolean stackIn_108_0 = false;
        boolean stackIn_116_0 = false;
        boolean stackIn_121_0 = false;
        int stackIn_141_0 = 0;
        boolean stackOut_67_0 = false;
        boolean stackOut_71_0 = false;
        boolean stackOut_78_0 = false;
        boolean stackOut_107_0 = false;
        boolean stackOut_115_0 = false;
        boolean stackOut_120_0 = false;
        int stackOut_140_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((ha.field_l ^ -1) != (ha.field_k ^ -1)) {
                            statePc = 148;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (kha.field_f) {
                            statePc = 21;
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
                case 5: {
                    try {
                        lo.a(75);
                        kha.field_f = this.i((byte) -120);
                        if (!kha.field_f) {
                            statePc = 20;
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
                        if (mg.field_m == null) {
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
                        statePc = 21;
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
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (bp.e(-29919)) {
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
                        me.d((byte) -123);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
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
                        uq.g((byte) 67);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return;
                }
                case 21: {
                    try {
                        var3_int = 0;
                        var4 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (!param0) {
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
                        statePc = 66;
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
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (kaa.field_m != iba.field_s) {
                            statePc = 60;
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
                        if (-1 == iba.field_s) {
                            statePc = 50;
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
                        if (iba.field_s == -3) {
                            statePc = 43;
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
                        if (1 == (iba.field_s ^ -1)) {
                            statePc = 41;
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
                        if (!tn.a(iba.field_s, 124)) {
                            statePc = 66;
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
                        eg.field_p[iba.field_s].e(8456);
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var3_int = 1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        gs.field_f.a(false, true);
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
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (!kaa.b(127)) {
                            statePc = 66;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        gs.field_f.b((byte) 94);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (hm.field_b) {
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
                        dj.field_c.a(true, false);
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
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (!kaa.b(127)) {
                            statePc = 66;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        dj.field_c.h(480);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var4 = 1;
                        var3_int = 1;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (this.k((byte) -55)) {
                            statePc = 65;
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
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        rs.a(true);
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (!hm.field_b) {
                            statePc = 120;
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
                        stackOut_67_0 = bka.field_h;
                        stackIn_68_0 = stackOut_67_0;
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
                        if (stackIn_68_0) {
                            statePc = 120;
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
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = pha.field_a;
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
                        if (stackIn_72_0) {
                            statePc = 120;
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
                        if (!vs.field_d) {
                            statePc = 85;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 81;
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
                        stackOut_78_0 = lna.field_q;
                        stackIn_79_0 = stackOut_78_0;
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
                        if (stackIn_79_0) {
                            statePc = 84;
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
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 83;
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
                        var3_int = 0;
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
                        pma.a((byte) 122, var3_int != 0);
                        if (!gja.field_n) {
                            statePc = 89;
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
                        sna.field_fb.a(var4 != 0, false);
                        statePc = 87;
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
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (vs.field_d) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (dj.field_c != null) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        uda.b(var4 != 0, 180, 320, 110);
                        dj.field_c.a(var4 != 0, false);
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (!kaa.b(127)) {
                            statePc = 120;
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
                        if (!wj.field_g) {
                            statePc = 106;
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
                        if (!vs.field_d) {
                            statePc = 105;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (aka.a(12, 13, 15, (byte) -125)) {
                            statePc = 96;
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
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        boolean discarded$2 = wb.a(13, 15, false, 12);
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (null == sna.field_fb) {
                            statePc = 114;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        stackOut_107_0 = gja.field_n;
                        stackIn_108_0 = stackOut_107_0;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (!stackIn_108_0) {
                            statePc = 114;
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
                        sna.field_fb.h(480);
                        statePc = 112;
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
                        statePc = 204;
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
                        if (null == dj.field_c) {
                            statePc = 96;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackOut_115_0 = vs.field_d;
                        stackIn_116_0 = stackOut_115_0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (!stackIn_116_0) {
                            statePc = 96;
                        } else {
                            statePc = 117;
                        }
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
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        dj.field_c.h(480);
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        stackOut_120_0 = hm.field_b;
                        stackIn_121_0 = stackOut_120_0;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (stackIn_121_0) {
                            statePc = 125;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        eia.b((byte) -116);
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (wj.field_g) {
                            statePc = 132;
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
                        if (0 < jaa.field_q) {
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
                        statePc = 138;
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
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        jaa.field_q = jaa.field_q - 1;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if ((saa.field_b ^ -1) >= (jaa.field_q ^ -1)) {
                            statePc = 138;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        jaa.field_q = jaa.field_q + 1;
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
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        var5 = saa.field_b * saa.field_b;
                        var6 = var5 + -(jaa.field_q * jaa.field_q);
                        var7 = 360 + 120 * var6 / var5;
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        bka.a(-14305, var7);
                        if (mka.field_f.b((byte) 90) == null) {
                            statePc = 147;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        stackOut_140_0 = -336;
                        stackIn_141_0 = stackOut_140_0;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        t.field_v = t.field_v + 1;
                        if (stackIn_141_0 != (t.field_v + 1 ^ -1)) {
                            statePc = 147;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        t.field_v = 0;
                        bw discarded$3 = mka.field_f.a(false);
                        statePc = 145;
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
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (bt.field_s == ha.field_k) {
                            statePc = 178;
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
                        if (jba.field_x == ha.field_k) {
                            statePc = 160;
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
                        nm.field_A = nm.field_A - 1;
                        if (0 != nm.field_A) {
                            statePc = 191;
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
                        ha.field_k = ha.field_l;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
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
                        if (bp.e(-29919)) {
                            statePc = 177;
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
                        mg.field_m = null;
                        me.d((byte) -125);
                        nh.b(-122);
                        kaa.field_m = taa.field_l;
                        if (ge.field_L) {
                            statePc = 168;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        oq.a(false, false);
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        if (!jl.field_r) {
                            statePc = 173;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        lg.a(true, -4, false);
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        if (tn.a(kaa.field_m, 127)) {
                            statePc = 176;
                        } else {
                            statePc = 174;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
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
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        rs.a(true);
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        ha.field_k = mj.field_i;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        nm.field_A = nm.field_A + 1;
                        if (-17 == (nm.field_A ^ -1)) {
                            statePc = 183;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        if (!ge.field_L) {
                            statePc = 187;
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
                        ft.c((byte) -41);
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        wg.a(false);
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
                        ha.field_k = jba.field_x;
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
                        if (14 != kaa.field_m) {
                            statePc = 192;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        if (-4 == kaa.field_m) {
                            statePc = 195;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 194;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        sja.field_fb.c(9, (byte) 118);
                        bka.field_h = true;
                        kaa.field_m = iba.field_s;
                        jaa.field_q = saa.field_b;
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        if (param1 >= 86) {
                            statePc = 198;
                        } else {
                            statePc = 197;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 197: {
                    return;
                }
                case 198: {
                    try {
                        if (4 != (kaa.field_m ^ -1)) {
                            statePc = 202;
                        } else {
                            statePc = 199;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        rja.a(11, pw.field_w.f((byte) -62), 1);
                        kaa.field_m = iba.field_s;
                        pha.field_a = true;
                        statePc = 200;
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
                case 202: {
                    try {
                        jja.c(20757);
                        statePc = 205;
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 204: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var3, "BachelorFridge.E(" + param0 + 44 + param1 + 41);
                }
                case 205: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean k(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == -55) {
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
                        ((BachelorFridge) this).field_x = false;
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
                        var2_int = 32;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((iba.field_s ^ -1) != -1) {
                            statePc = 10;
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
                        if (-3 != kaa.field_m) {
                            statePc = 10;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2_int = 64;
                        gs.field_f.a(false, false);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (null == gs.field_f) {
                            statePc = 25;
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
                        stackOut_11_0 = -3;
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
                        if (stackIn_12_0 == iba.field_s) {
                            statePc = 19;
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
                        stackOut_15_0 = 1;
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
                        if (stackIn_16_0 != iba.field_s) {
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
                        if (-1 == (kaa.field_m ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
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
                case 22: {
                    try {
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
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var2_int = 64;
                        gs.field_f.a(false, false);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        tma.field_v = tma.field_v + 1;
                        if (var2_int >= tma.field_v + 1) {
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
                        stackOut_26_0 = 1;
                        stackIn_29_0 = stackOut_26_0;
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
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = 0;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0 != 0;
                }
                case 30: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var2, "BachelorFridge.G(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(float param0, boolean param1) {
        try {
            fla.field_r = param0;
            if (!param1) {
                ((BachelorFridge) this).a((byte) 111);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "BachelorFridge.I(" + param0 + 44 + param1 + 41);
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        java.awt.Canvas var2_ref = null;
        int var3_int = 0;
        ji var3 = null;
        Runtime var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_30_0 = false;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_101_0 = 0;
        boolean stackOut_29_0 = false;
        int stackOut_54_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_77_0 = 0;
        boolean stackOut_77_1 = false;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_100_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_ref = pha.a(109);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (sn.c(83)) {
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
                        statePc = 7;
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
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        bn.a(0, var2_ref, gja.b(-16103));
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        if (sg.field_r) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        jq.a(var2_ref, -128);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        if (!cj.b(true)) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        dea.a(rla.field_i, 100.0f, 116);
                        jq.a(var2_ref, -128);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        if (kha.field_f) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        bea.e(117);
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (kaa.field_m == iba.field_s) {
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
                        this.h((byte) 103);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        cf.a(true, iba.field_s, vla.field_w, (byte) 46);
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
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (!vla.field_w) {
                            statePc = 35;
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
                        stackOut_29_0 = sia.field_h;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (!stackIn_30_0) {
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
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ji.a(aja.e(11), 62);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var3 = (ji) (Object) mka.field_f.b((byte) 90);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var3 != null) {
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
                        statePc = 49;
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
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var5 = t.field_v;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (80 > var5) {
                            statePc = 47;
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
                        if (-231 < (var5 ^ -1)) {
                            statePc = 46;
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
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var4 = -(var5 / 2) + 123;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var4 = 8;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var4 = var5 / 2 - 32;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        dg.a(4, 8 + var4, aha.field_D.a(pp.field_g[var3.field_h]) - -56, aha.field_D.field_B + aha.field_D.field_u, 5, 0, 128);
                        og.field_a[var3.field_h].d(8, var4);
                        aha.field_D.c(pp.field_g[var3.field_h], 48, -2 + (8 + var4) - -aha.field_D.field_u, 12320512, -1);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (vs.a(23864)) {
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
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        dg.g(0, 0, dg.field_i, dg.field_c);
                        gla.a(-101, uma.field_J[0].field_p, uma.field_J[0].field_q, uma.field_J);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (!nba.b((byte) -125)) {
                            statePc = 65;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = 23864;
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
                        if (vs.a(stackIn_55_0)) {
                            statePc = 65;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = 15000;
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
                        if (paa.a(stackIn_59_0)) {
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
                        dg.g(0, 0, dg.field_i, dg.field_c);
                        bla.a(uma.field_J[0].field_q, uma.field_J, (byte) 15, uma.field_J[0].field_p);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (param0 >= 1) {
                            statePc = 69;
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
                        ((BachelorFridge) this).field_x = true;
                        statePc = 67;
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
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (vs.a(23864)) {
                            statePc = 81;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackOut_70_0 = 15000;
                        stackIn_71_0 = stackOut_70_0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (paa.a(stackIn_71_0)) {
                            statePc = 76;
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
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackOut_76_0 = -1;
                        stackIn_79_0 = stackOut_76_0;
                        stackIn_77_0 = stackOut_76_0;
                        if (null != kga.field_c) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackOut_77_0 = stackIn_77_0;
                        stackOut_77_1 = kt.field_i;
                        stackIn_80_0 = stackOut_77_0;
                        stackIn_80_1 = stackOut_77_1 ? 1 : 0;
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
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackOut_79_0 = stackIn_79_0;
                        stackOut_79_1 = 1;
                        stackIn_80_0 = stackOut_79_0;
                        stackIn_80_1 = stackOut_79_1;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        rla.a((byte) stackIn_80_0, stackIn_80_1 != 0);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (ha.field_l != ha.field_k) {
                            statePc = 84;
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
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var3_int = nm.field_A * 256 / 16;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (-1 > (var3_int ^ -1)) {
                            statePc = 88;
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
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        dg.f(0, 0, dg.field_i, dg.field_c, 0, var3_int);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (aha.field_D == null) {
                            statePc = 96;
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
                        if (-3 >= (hea.field_r ^ -1)) {
                            statePc = 95;
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
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var3_ref = Runtime.getRuntime();
                        var4 = (int)(var3_ref.totalMemory() + -var3_ref.freeMemory()) >> -1839978198;
                        aha.field_D.c(pr.field_i + " fps; " + var4 + "KiB", 20, 20, 16777215, 0);
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (!kha.field_f) {
                            statePc = 107;
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
                        if (mk.field_p == -1) {
                            statePc = 107;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackOut_100_0 = -1;
                        stackIn_101_0 = stackOut_100_0;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (stackIn_101_0 != gd.field_m) {
                            statePc = 106;
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
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 105;
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
                        vv.field_c[kr.field_vb].e(mk.field_p + -vv.field_c[kr.field_vb].field_t, gd.field_m - vv.field_c[kr.field_vb].field_u);
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
                        av.a(0, -106, var2_ref, 0);
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 109: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var2, "BachelorFridge.B(" + param0 + 41);
                }
                case 110: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void r(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (null == nha.field_c) {
                break L0;
              } else {
                aha.a((byte) 54, nha.field_c);
                nha.field_c = null;
                mia.b(32);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          fga.field_h = daa.c(param0 + 98, 3);
          vb.field_j = ifa.a(5, false, false, -78, false);
          wia.field_b = daa.c(-94, 6);
          aka.field_w = daa.c(param0 + 103, 7);
          uga.field_B = daa.c(param0 + 96, 8);
          fda.field_l = daa.c(param0 ^ 73, 9);
          tca.field_m = daa.c(param0 ^ 52, 10);
          fda.field_k = daa.c(83, param0);
          ria.field_i = daa.c(103, 12);
          pr.field_j = daa.c(-60, 13);
          iga.field_d = ifa.a(14, false, false, 114, false);
          wba.field_f = daa.c(107, 15);
          wb.field_l = daa.c(-127, 16);
          vd.field_y = daa.c(80, 17);
          fw.field_j = daa.c(68, 18);
          uda.field_U = daa.c(69, 19);
          rt.a(dca.field_y, (byte) 120, ju.field_r);
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 76) {
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
                        boolean discarded$3 = this.i((byte) 56);
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
                        eia.a((byte) -15);
                        if (kga.field_c == null) {
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
                        lga.c((byte) 116);
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
                        jea.a(true);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var2, "BachelorFridge.A(" + param0 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(vr param0, byte param1, float param2, float param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
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
                        fla.field_r = (float)param0.a(true) * (-param2 + param3) / 100.0f + param2;
                        var5_int = 12 % ((param1 - 57) / 48);
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
                        stackOut_3_1 = new StringBuilder().append("BachelorFridge.F(");
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
                    throw pe.a((Throwable) (Object) stackIn_7_0, (String) (Object) (stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41));
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public BachelorFridge() {
        ((BachelorFridge) this).field_x = false;
    }

    public final void init() {
        try {
            ((BachelorFridge) this).a(-8771, "bachelorfridge", 21);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "BachelorFridge.init()");
        }
    }

    private final void a(float param0, vr param1, float param2, int param3, String param4) {
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
                    try {
                        fla.field_r = (param2 - param0) * (float)param1.a(0, param4) / 100.0f + param0;
                        if (param3 <= -109) {
                            statePc = 13;
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
                        ((BachelorFridge) this).field_x = false;
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
                        stackOut_4_1 = new StringBuilder().append("BachelorFridge.L(").append(param0).append(44);
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
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param4 == null) {
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
                    throw pe.a((Throwable) (Object) stackIn_12_0, (String) (Object) (stackIn_12_2 + 41));
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean j(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        ee[] var3 = null;
        vr stackIn_5_0 = null;
        int stackIn_11_0 = 0;
        vr stackIn_14_0 = null;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_33_0 = 0;
        vr stackOut_4_0 = null;
        int stackOut_10_0 = 0;
        vr stackOut_13_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_32_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        th.a(25);
                        if (((BachelorFridge) this).field_x) {
                            statePc = 27;
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
                        if (!vb.field_j.a(param0 + -7)) {
                            statePc = 10;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = vb.field_j;
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
                        if (!((vr) (Object) stackIn_5_0).a("minimal", 20637)) {
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
                        statePc = 12;
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
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        dea.a(ej.a(vb.field_j, kj.field_a, (byte) -12, "minimal", iea.field_b), 75.0f, 118);
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    try {
                        if (!wia.field_b.a(0)) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = wia.field_b;
                        stackIn_14_0 = stackOut_13_0;
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
                        if (!((vr) (Object) stackIn_14_0).a("minimal", 20637)) {
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 21;
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
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        dea.a(ej.a(vb.field_j, kj.field_a, (byte) -12, "minimal", iea.field_b), 75.0f, param0 + 111);
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    try {
                        if (!ria.field_i.a(param0 ^ 7)) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (ria.field_i.b((byte) 95)) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        dea.a(kh.a(ria.field_i, (byte) -57, kj.field_a, iea.field_b), 80.0f, 115);
                        stackOut_25_0 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0 != 0;
                }
                case 27: {
                    try {
                        ((BachelorFridge) this).field_x = true;
                        var2_array = wia.field_b.a((byte) 123, "smallfont", "minimal");
                        var3 = bla.a(param0 ^ 29612, "minimal", "smallfont", vb.field_j);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        aha.field_D = qm.a(var3, var2_array, 0);
                        jha.field_g = qm.a(var3, var2_array, 0);
                        hfa.field_z = ll.a(var2_array, -8659, var3);
                        fn.field_n = qca.a(var2_array, 1, false, var3, 0, 0);
                        fn.field_n.field_M = bfa.field_c;
                        iu.a(-1638641311, ria.field_i);
                        qha.a(124, vb.field_j);
                        if (param0 == 7) {
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
                        ((BachelorFridge) this).field_x = true;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
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
                        stackOut_32_0 = 1;
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
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var2, "BachelorFridge.H(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) {
        mfa.b(0);
        jr.a(86);
        fo.a(-15135);
        ri.a(false);
        vc.a(-96);
        sv.a(24173);
        jb.b();
        wi.b(true);
        ji.a(125);
        eaa.b(7);
        ga.a((byte) -123);
        og.a((byte) 16);
        gj.p(-1);
        saa.d((byte) -128);
        us.b(12745);
        iw.a(-119);
        db.a(0);
        ml.a((byte) 63);
        vm.a((byte) -87);
        kb.a(92);
        v.a(-203);
        pj.a(96);
        vr.b(-19779);
        oja.a(-32341);
        dj.a((byte) -75);
        cba.a((byte) -44);
        ck.e(-12132);
        dl.d((byte) -39);
        pn.a((byte) -60);
        dg.a();
        gr.b(12653);
        pb.d();
        i.a((byte) -122);
        au.a(-31824);
        ms.g((byte) 109);
        gi.a(101);
        tca.a((byte) -84);
        nn.a(0);
        sca.b((byte) -33);
        po.a();
        vda.a((byte) -62);
        lu.d((byte) -19);
        f.a(true);
        um.a((byte) 106);
        vw.b(7130);
        rt.a((byte) -91);
        ka.a((byte) 40);
        dt.a((byte) -125);
        im.a((byte) -66);
        gs.a(0);
        jn.a(-22089);
        oma.a((byte) 51);
        tn.a(0);
        qm.a(0);
        qha.a(124);
        kg.a((byte) 36);
        qe.a((byte) 93);
        jla.b(true);
        da.a(-47);
        mu.a(9072);
        bw.b((byte) 127);
        dga.a((byte) -97);
        jd.a((byte) 89);
        lda.a((byte) -127);
        oaa.a(-3681);
        tb.a(-7778);
        fba.a(2);
        hi.a((byte) 97);
        sna.e((byte) -110);
        uha.g((byte) 110);
        ema.f(0);
        eu.a(false);
        rf.b(-67);
        vaa.a(-1);
        tja.a(8192);
        mba.a(-90);
        eo.c((byte) 114);
        st.a((byte) 120);
        rp.e((byte) 104);
        tea.q(10462);
        hga.o(8405024);
        sja.o(33);
        dka.a(26727);
        ph.j(31826);
        hh.b(-1);
        qh.a(23312);
        ed.a(69);
        lr.a(34);
        jca.a(-8270);
        ie.a(0);
        tw.a(97);
        to.a(53);
        is.a(12836);
        hs.a((byte) -127);
        pf.l(-6199);
        rk.c((byte) 114);
        tj.a((byte) -114);
        nha.a(-18307);
        it.d(119);
        jfa.c(false);
        m.a((byte) 113);
        w.a(66);
        vi.a(-117);
        gma.a(-5377);
        on.e(-29639);
        go.e(98);
        lt.b((byte) -104);
        ae.a(30317);
        ala.a(-84);
        cw.h(-41);
        pna.f(1);
        ok.f(7576);
        ik.a((byte) 38);
        uq.f(87);
        oda.b(14124);
        kca.a((byte) 32);
        lm.a((byte) -52);
        fja.a(6220);
        pga.a(470);
        rfa.a((byte) -101);
        ss.a();
        rba.a(-52);
        il.a(4);
        lf.b(123);
        ina.f((byte) -101);
        lna.a((byte) 126);
        qaa.b(false);
        ec.a(-29584);
        dma.a(false);
        mda.a(15);
        dq.a(-19100);
        wba.a(-96);
        iga.a(false);
        dn.a(-114);
        ko.a((byte) -73);
        we.a((byte) -124);
        ola.d((byte) -120);
        jna.a(30862);
        uf.a((byte) 24);
        d.d((byte) 7);
        op.e((byte) 53);
        bia.a(56);
        pja.a((byte) -120);
        dba.a((byte) 62);
        dfa.a(false);
        wia.b(788454);
        as.a((byte) 121);
        wo.c((byte) 96);
        pu.c((byte) 123);
        or.c((byte) -77);
        kj.a((byte) -110);
        vs.b(10530);
        aj.a(76);
        ng.c(-621);
        pfa.b(false);
        fs.c((byte) -59);
        ad.c(false);
        mk.a(1);
        ua.a(-9);
        cl.b(false);
        in.b(-1);
        qfa.g(97);
        ta.a(255);
        se.f(103);
        fp.d(12);
        fg.a((byte) 127);
        gg.a((byte) -106);
        cga.b(true);
        kn.b(50);
        id.b(35);
        fh.c((byte) 73);
        vga.b();
        jja.c((byte) -90);
        kc.a((byte) 94);
        rm.a(-101);
        ti.b(3);
        lc.c(false);
        jm.c((byte) 107);
        pp.c((byte) -75);
        bf.c((byte) -79);
        vg.c((byte) 97);
        rv.b(-4);
        ib.a(-102);
        paa.b(2);
        ve.d((byte) -45);
        rha.c(-62);
        lw.a(true);
        cia.c((byte) -96);
        vca.a(488250252);
        ii.b(-225);
        md.b(28075);
        sq.c();
        qi.a(10);
        jt.b(true);
        ula.a(0);
        nl.a(-85);
        pv.a(-15565);
        gba.i(2);
        wl.f(0);
        lha.a(1);
        mq.a(213);
        rma.c(1);
        en.a(-10132);
        ur.a(107);
        cr.a(21592);
        nu.a(76);
        pca.a();
        bv.a(98);
        rh.a(0);
        oe.a(false);
        nv.f(20038);
        cc.a((byte) -122);
        wk.a(-24);
        jc.e(127);
        hr.a(true);
        rda.a(true);
        g.c((byte) -124);
        eka.a(123);
        un.a(2);
        sda.a();
        dv.c();
        mga.b();
        hm.a(-123);
        em.o(-22799);
        gha.a((byte) -124);
        ai.a(22309);
        ma.a(0);
        iea.a(24166);
        cla.a(-60);
        eea.a((byte) -79);
        ls.a(-118);
        vl.a((byte) 91);
        fka.a(-2779);
        sd.a(0);
        nca.a((byte) 87);
        sea.a((byte) -78);
        wd.c(1);
        via.a(1);
        vv.b(0);
        wj.c(1023);
        hfa.g(-81);
        am.c(true);
        vf.j(-99);
        vd.i(20742);
        rna.a(7);
        gk.a(false);
        qw.a((byte) -119);
        pda.e(-3);
        pha.a(true);
        ru.b(42);
        uka.b((byte) 81);
        lba.a((byte) -68);
        bi.d((byte) -97);
        ge.e((byte) -111);
        vn.k(-9063);
        lka.g((byte) -127);
        uda.n(114);
        de.a(1);
        dd.a(0);
        aha.b(true);
        nf.d((byte) -127);
        dia.a(14213);
        bfa.a(true);
        iaa.a((byte) 93);
        jea.a(1);
        sr.b((byte) 127);
        eia.a(124);
        pr.a(-96);
        qb.d(124);
        kma.e(-1);
        qo.a(3);
        oa.f(116);
        qg.a(4096);
        co.a(true);
        faa.a((byte) -113);
        gl.d(-44);
        uma.m(-30829);
        lq.a(71);
        sh.e((byte) -92);
        lla.d((byte) 0);
        sha.b(3);
        sa.b(0);
        ena.b(false);
        qt.b(-29205);
        gca.c((byte) 113);
        oq.a((byte) -47);
        aa.b(-124);
        ld.b(true);
        qs.b(-5232);
        wm.b(false);
        ds.b(-1182);
        qba.b(2753);
        ll.d((byte) 63);
        gd.d((byte) -49);
        wv.b(-91);
        gn.d((byte) -66);
        ep.b(1);
        jf.b(0);
        di.d((byte) -53);
        vj.b(106);
        dja.b(-14190);
        hp.a(-107);
        oc.b(32586);
        sb.b(2630);
        sla.a((byte) 52);
        aq.a((byte) -125);
        kaa.d((byte) 114);
        he.d((byte) 119);
        rw.a((byte) -121);
        hv.a(false);
        bha.d((byte) 60);
        r.b(-1);
        mn.b(102);
        ij.d((byte) 123);
        fr.d((byte) 3);
        sn.b(-103);
        wja.d((byte) -106);
        jka.b(11178);
        nda.b(-110);
        ol.d((byte) -123);
        p.b(0);
        cp.a(64);
        uv.e((byte) -12);
        pe.d(-33);
        ig.d(0);
        jia.b(false);
        cd.d(0);
        ska.e((byte) 20);
        afa.d(103);
        ada.d(-15840);
        wq.d(110);
        et.d(-61);
        qa.b(false);
        jh.d(4096);
        bh.e((byte) -93);
        sk.d(-124);
        wt.d(19564);
        an.f((byte) 86);
        ag.d(108);
        jq.b(true);
        rc.d(-2);
        aea.d(106);
        sj.d(0);
        wla.d(1);
        hda.e(122);
        gt.d(-118);
        ama.e((byte) -118);
        ef.b(false);
        oj.e((byte) -116);
        fn.f((byte) 121);
        qna.e((byte) -106);
        dc.b(true);
        qea.a(-454605656);
        qk.d(89);
        lfa.e((byte) -128);
        qca.d(-98);
        dm.b((byte) -100);
        gla.a((byte) -62);
        wha.a(-1);
        ou.b(-124);
        ul.b(false);
        bc.a();
        tq.c(-15298);
        raa.h(2);
        re.h(-124);
        du.a(8192);
        oea.g(-8333);
        uca.a(false);
        kda.a(-1);
        ao.a((byte) -44);
        ca.c(-64);
        if (param0 > 49) {
          ov.c(-5);
          gb.b(-22615);
          ne.a(18072);
          cq.c((byte) 67);
          ff.c(16777215);
          pka.a(-8155);
          oka.b((byte) 115);
          cm.c(-75);
          pt.a(65);
          hl.h(2);
          gu.a(true);
          nea.f(18178);
          ap.a(54);
          kka.a(-1);
          n.a((byte) 103);
          qia.b(-127);
          bs.a(122);
          af.a(9680);
          eq.a(0);
          ft.d((byte) -73);
          ika.a(true);
          si.a(-28415);
          kga.a(15238);
          hja.a((byte) 124);
          rs.a(2);
          qc.a((byte) 80);
          oha.b(-256);
          t.c((byte) -107);
          tv.a(true);
          hd.d(1);
          a.c(16763049);
          gfa.a(17733);
          nla.a(false);
          dha.a(true);
          gw.a(25354);
          cea.a(65536);
          su.a(true);
          ho.a(82);
          mka.b(false);
          mc.a(-57);
          lga.b(-4);
          kha.a(-118);
          kr.f(-127);
          uu.f((byte) 20);
          fj.c((byte) 22);
          kja.b(1900);
          hk.a(true);
          ot.b((byte) -91);
          bd.c((byte) -124);
          jda.a(0);
          es.b(true);
          nq.c((byte) -115);
          at.a(5849);
          iha.d(111);
          cj.a(-51);
          ida.b(true);
          qf.d(28766);
          taa.d((byte) -41);
          fu.d((byte) 70);
          fha.d((byte) 9);
          wn.d(10);
          cb.d((byte) 106);
          iu.e(-15434);
          gm.b(false);
          df.c(15);
          td.b(false);
          bca.c(15);
          ew.d(16776);
          ana.d((byte) 127);
          ra.d(11919);
          hia.d((byte) -74);
          fl.b(false);
          ek.d(8);
          vla.f((byte) -103);
          mv.e((byte) 126);
          rea.c((byte) -108);
          fga.a(false);
          sia.c(10371);
          uea.c((byte) -113);
          bu.c(123);
          jha.c((byte) 126);
          eda.c(60);
          fa.c(117);
          ip.c((byte) -36);
          nd.a(false);
          nj.c(256);
          qla.c(-24);
          dw.a(false);
          bma.d((byte) -102);
          aca.c(-111);
          bn.c(109);
          pi.a(false);
          oia.c(126);
          mw.c(16);
          jj.b(false);
          hw.b(false);
          mj.b((byte) 87);
          gaa.d(350);
          ub.d(1);
          iia.a(1314859432);
          ej.b(0);
          oca.d((byte) -122);
          tga.a(-111);
          ow.a(-1);
          lv.d((byte) -47);
          wp.b(80);
          fi.d((byte) -80);
          bg.b(5);
          bja.a(-10744);
          ns.a(-11);
          iv.a(-124);
          lia.d((byte) 42);
          qq.a(5);
          cn.e((byte) 85);
          bj.d((byte) -13);
          rla.d((byte) 29);
          ela.d((byte) 80);
          sl.d((byte) 116);
          bm.d((byte) 3);
          ro.a(101);
          o.e((byte) -7);
          dh.d((byte) -78);
          fda.d((byte) 25);
          ic.b(false);
          kq.d((byte) -91);
          kt.a(-23401);
          mh.a(-15947);
          pea.e((byte) 116);
          jk.d((byte) -115);
          dla.a(1097);
          jma.d(24831);
          eg.c((byte) -72);
          fia.c(false);
          jw.d(32);
          c.a(-20330);
          wa.d((byte) -74);
          wb.d(10046);
          li.d(-46);
          dp.d(-114);
          nia.b(false);
          cha.d(-30518);
          bda.d(-18);
          dea.d(-35);
          iq.d((byte) -106);
          sc.d(-31258);
          lh.b(-12847);
          ha.c(true);
          jv.c((byte) 79);
          ut.b(-8696);
          gja.c(4177);
          hba.e((byte) 92);
          ba.f((byte) -45);
          ql.c((byte) -74);
          uj.d((byte) 20);
          jba.d(-128);
          kw.c((byte) 80);
          uaa.c((byte) -126);
          wda.a(4);
          kna.a(36);
          ona.f(1);
          aja.b(-50);
          ug.c((byte) 10);
          qd.c((byte) 81);
          laa.d(false);
          ni.b(-83);
          ia.c(300);
          uc.c((byte) -102);
          vma.b(-93);
          vu.c((byte) 106);
          lo.a((byte) -93);
          rg.a(0);
          gea.b(4096);
          fm.a(101);
          bga.b(false);
          mla.a((byte) 93);
          tt.e((byte) 84);
          wg.d(22753);
          el.f((byte) -24);
          hna.d(99);
          hka.d(-111);
          hb.d(-98);
          kf.b((byte) 110);
          aia.c((byte) -127);
          pk.c(-106);
          fw.a(-8668);
          uw.f(6144);
          tl.d((byte) -89);
          fv.e((byte) -35);
          gka.e(-3);
          mr.c(0);
          cu.d(32);
          mi.d((byte) -119);
          ak.d((byte) 52);
          pw.d(-124);
          tg.b(1);
          jl.d(-17509);
          maa.e((byte) 72);
          sw.c(true);
          mna.d((byte) 125);
          hha.g(0);
          ria.a(127);
          fla.c(-36);
          pba.d(-1);
          nna.f((byte) 121);
          io.b(-125);
          hla.d(-72);
          vea.e((byte) 65);
          ifa.b(80);
          ju.e((byte) -67);
          kla.d(119);
          vk.d((byte) 110);
          wf.e(2);
          dk.b(-19353);
          pm.e(-38);
          qn.c((byte) 108);
          h.d((byte) 45);
          bk.e(25);
          bt.d(-17811);
          gp.d(-13837);
          sm.d(-1);
          vq.e((byte) 123);
          eha.b(-1452);
          cma.b(false);
          nh.c((byte) 98);
          nt.e(4);
          fb.c((byte) -91);
          fna.c(false);
          ui.c(true);
          wfa.c(false);
          uga.f((byte) 21);
          dr.c(true);
          wga.d((byte) -69);
          lb.f((byte) 39);
          vfa.b(-14431);
          bea.d(true);
          lma.g(-1111);
          ts.c(true);
          lca.d((byte) -113);
          bna.d(-61);
          eb.c((byte) -48);
          tba.d(9);
          gf.a(false);
          mp.b(95);
          uk.d(-36);
          sg.c((byte) 113);
          ps.d((byte) -102);
          cka.d(-26);
          nw.c(false);
          cja.d(-23353);
          la.d(2);
          dca.e((byte) -87);
          te.c(35);
          tp.e((byte) -75);
          oga.d(-98);
          er.f((byte) -120);
          fq.c((byte) 127);
          fk.e((byte) 49);
          cf.a(0);
          aka.e((byte) -95);
          dda.a(false);
          hea.c(-116);
          rn.d(119);
          baa.g(-122);
          mja.b(78);
          oo.d((byte) -85);
          nm.e(25280);
          mg.e(-62);
          mt.b(1687);
          nb.d(-103);
          eja.e(101);
          kk.d(19691);
          bp.e((byte) 119);
          ud.c(false);
          ica.d((byte) -113);
          aw.e((byte) 26);
          hj.c((byte) -96);
          l.d((byte) -119);
          tma.c(false);
          ija.b(-4);
          rb.d((byte) -36);
          mea.f(121);
          ffa.c(22533);
          rl.b(0);
          me.d(100);
          od.b(false);
          wc.c((byte) 126);
          jaa.d(-100);
          cca.d(75);
          ch.c(14);
          vh.e((byte) -3);
          vt.b(0);
          b.b(5910);
          ja.b(0);
          oi.f(-6887);
          uba.b(0);
          ln.d(4);
          kea.b(-26857);
          tla.c(false);
          fd.d(0);
          rr.f(-13421);
          ci.b(-115);
          jga.d(0);
          ki.e(-1);
          wh.b(0);
          nma.d(-1);
          bla.b(42);
          pg.d(0);
          nr.e(1);
          vka.d((byte) -107);
          lp.d((byte) 84);
          sma.e((byte) -40);
          ob.c(0);
          qga.c((byte) -87);
          ct.d((byte) -118);
          gq.b(false);
          ce.e((byte) 120);
          vo.a((byte) -128);
          nga.a(-20804);
          rj.b((byte) -122);
          vb.a(-126);
          fe.a(-127);
          rga.a((byte) -84);
          ((BachelorFridge) this).field_r = null;
          return;
        } else {
          return;
        }
    }

    private final void h(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (-1 != (iba.field_s ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = kaa.field_m;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((stackIn_2_0 ^ -1) == 2) {
                            statePc = 23;
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
                case 5: {
                    try {
                        if (gs.field_f == null) {
                            statePc = 25;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = iba.field_s;
                        stackIn_9_0 = stackOut_8_0;
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
                        if ((stackIn_9_0 ^ -1) == 2) {
                            statePc = 16;
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
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = iba.field_s;
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
                        if ((stackIn_13_0 ^ -1) != -2) {
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
                        if (kaa.field_m == 0) {
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
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        gb.a(-(tma.field_v << 170942306) + 256, 16777215);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return;
                }
                case 23: {
                    try {
                        gb.a(tma.field_v << 1942692866, 16777215);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return;
                }
                case 25: {
                    try {
                        if (param0 >= 26) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return;
                }
                case 27: {
                    try {
                        if (16 > tma.field_v) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        cf.a(false, kaa.field_m, sia.field_h, (byte) 47);
                        kp.a(3959817, -tma.field_v + 32);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        cf.a(false, iba.field_s, vla.field_w, (byte) 61);
                        kp.b(3959817, tma.field_v);
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
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var2, "BachelorFridge.M(" + param0 + 41);
                }
                case 36: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean i(byte param0) {
        byte[] var2 = null;
        int var2_int = 0;
        ee[] var3 = null;
        kv[][] var4 = null;
        kv[][] var5 = null;
        int var6_int = 0;
        String[][] var6 = null;
        int var7 = 0;
        var7 = field_y;
        iha.e(5);
        th.a(25);
        if (aka.field_w != null) {
          L0: {
            if (!mt.field_p.a(0)) {
              break L0;
            } else {
              if (mt.field_p.a("basic", 20637)) {
                L1: {
                  waa.a(0, 0);
                  if (!mt.field_p.a(0)) {
                    break L1;
                  } else {
                    if (!mt.field_p.a("lobby", 20637)) {
                      break L1;
                    } else {
                      L2: {
                        waa.a(0, 1);
                        if (!vfa.field_p.a(0)) {
                          break L2;
                        } else {
                          if (vfa.field_p.a("lobby", 20637)) {
                            L3: {
                              waa.a(0, 2);
                              if (!aka.field_w.a(0)) {
                                break L3;
                              } else {
                                if (aka.field_w.b((byte) 120)) {
                                  L4: {
                                    waa.a(0, 3);
                                    if (!uga.field_B.a(0)) {
                                      break L4;
                                    } else {
                                      if (!uga.field_B.b((byte) 105)) {
                                        break L4;
                                      } else {
                                        L5: {
                                          waa.a(0, 4);
                                          if (!fda.field_l.a(0)) {
                                            break L5;
                                          } else {
                                            if (!fda.field_l.b((byte) 113)) {
                                              break L5;
                                            } else {
                                              L6: {
                                                waa.a(0, 5);
                                                if (!tca.field_m.a(0)) {
                                                  break L6;
                                                } else {
                                                  if (!tca.field_m.b((byte) 120)) {
                                                    break L6;
                                                  } else {
                                                    L7: {
                                                      waa.a(0, 6);
                                                      if (!vb.field_j.a(0)) {
                                                        break L7;
                                                      } else {
                                                        if (vb.field_j.a("basic", 20637)) {
                                                          L8: {
                                                            waa.a(0, 7);
                                                            if (!vb.field_j.a(0)) {
                                                              break L8;
                                                            } else {
                                                              if (!vb.field_j.a("bacteria_components", 20637)) {
                                                                break L8;
                                                              } else {
                                                                L9: {
                                                                  waa.a(0, 8);
                                                                  if (!wia.field_b.a(0)) {
                                                                    break L9;
                                                                  } else {
                                                                    if (!wia.field_b.a("basic", 20637)) {
                                                                      break L9;
                                                                    } else {
                                                                      L10: {
                                                                        waa.a(0, 9);
                                                                        if (!ria.field_i.a(0)) {
                                                                          break L10;
                                                                        } else {
                                                                          if (!ria.field_i.b((byte) 123)) {
                                                                            break L10;
                                                                          } else {
                                                                            L11: {
                                                                              waa.a(0, 10);
                                                                              if (!uda.field_U.a(0)) {
                                                                                break L11;
                                                                              } else {
                                                                                if (!uda.field_U.b((byte) 106)) {
                                                                                  break L11;
                                                                                } else {
                                                                                  L12: {
                                                                                    waa.a(0, 11);
                                                                                    if (!vd.field_y.a(0)) {
                                                                                      break L12;
                                                                                    } else {
                                                                                      if (vd.field_y.b((byte) 115)) {
                                                                                        L13: {
                                                                                          waa.a(0, 12);
                                                                                          if (!fw.field_j.a(0)) {
                                                                                            break L13;
                                                                                          } else {
                                                                                            if (fw.field_j.b((byte) 118)) {
                                                                                              L14: {
                                                                                                waa.a(0, 13);
                                                                                                if (!pr.field_j.a(0)) {
                                                                                                  break L14;
                                                                                                } else {
                                                                                                  if (!pr.field_j.b((byte) 104)) {
                                                                                                    break L14;
                                                                                                  } else {
                                                                                                    L15: {
                                                                                                      waa.a(0, 14);
                                                                                                      if (!fga.field_h.a(0)) {
                                                                                                        break L15;
                                                                                                      } else {
                                                                                                        if (!fga.field_h.b((byte) 120)) {
                                                                                                          break L15;
                                                                                                        } else {
                                                                                                          L16: {
                                                                                                            waa.a(0, 15);
                                                                                                            if (!iga.field_d.a(0)) {
                                                                                                              break L16;
                                                                                                            } else {
                                                                                                              if (iga.field_d.b((byte) 113)) {
                                                                                                                L17: {
                                                                                                                  waa.a(0, 16);
                                                                                                                  if (!wba.field_f.a(0)) {
                                                                                                                    break L17;
                                                                                                                  } else {
                                                                                                                    if (!wba.field_f.b((byte) 100)) {
                                                                                                                      break L17;
                                                                                                                    } else {
                                                                                                                      L18: {
                                                                                                                        waa.a(0, 17);
                                                                                                                        if (!wb.field_l.a(0)) {
                                                                                                                          break L18;
                                                                                                                        } else {
                                                                                                                          if (wb.field_l.b((byte) 99)) {
                                                                                                                            L19: {
                                                                                                                              waa.a(0, 18);
                                                                                                                              if (!fda.field_k.a(0)) {
                                                                                                                                break L19;
                                                                                                                              } else {
                                                                                                                                if (fda.field_k.b((byte) 101)) {
                                                                                                                                  waa.a(0, 19);
                                                                                                                                  of.b(108);
                                                                                                                                  this.a(78.5999984741211f, true);
                                                                                                                                  ((BachelorFridge) this).a((byte) 50);
                                                                                                                                  waa.a(0, 20);
                                                                                                                                  pu.a(tca.field_m, fda.field_l, -21201, aka.field_w, uga.field_B);
                                                                                                                                  oe.a(230, (byte) 108);
                                                                                                                                  ke.b(34);
                                                                                                                                  aka.field_w = null;
                                                                                                                                  this.a(81.0999984741211f, true);
                                                                                                                                  waa.a(0, 21);
                                                                                                                                  return false;
                                                                                                                                } else {
                                                                                                                                  break L19;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                            this.a(fda.field_k, (byte) -6, 78.5f, 78.5999984741211f);
                                                                                                                            return false;
                                                                                                                          } else {
                                                                                                                            break L18;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                      this.a(wb.field_l, (byte) 110, 78.0999984741211f, 78.5f);
                                                                                                                      return false;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                this.a(wba.field_f, (byte) -62, 78.0f, 78.0999984741211f);
                                                                                                                return false;
                                                                                                              } else {
                                                                                                                break L16;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                          this.a(iga.field_d, (byte) 110, 60.79999923706055f, 78.0f);
                                                                                                          return false;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    this.a(fga.field_h, (byte) -7, 60.70000076293945f, 60.79999923706055f);
                                                                                                    return false;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              this.a(pr.field_j, (byte) -108, 60.5f, 60.70000076293945f);
                                                                                              return false;
                                                                                            } else {
                                                                                              break L13;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        this.a(fw.field_j, (byte) -121, 60.400001525878906f, 60.5f);
                                                                                        return false;
                                                                                      } else {
                                                                                        break L12;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  this.a(vd.field_y, (byte) 109, 60.29999923706055f, 60.400001525878906f);
                                                                                  return false;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.a(uda.field_U, (byte) 120, 60.0f, 60.29999923706055f);
                                                                            return false;
                                                                          }
                                                                        }
                                                                      }
                                                                      this.a(ria.field_i, (byte) 127, 60.0f, 60.0f);
                                                                      return false;
                                                                    }
                                                                  }
                                                                }
                                                                this.a(59.79999923706055f, wia.field_b, 60.0f, -113, "basic");
                                                                return false;
                                                              }
                                                            }
                                                          }
                                                          this.a(55.5f, vb.field_j, 59.79999923706055f, -119, "bacteria_components");
                                                          return false;
                                                        } else {
                                                          break L7;
                                                        }
                                                      }
                                                    }
                                                    this.a(25.399999618530273f, vb.field_j, 55.5f, -121, "basic");
                                                    return false;
                                                  }
                                                }
                                              }
                                              this.a(tca.field_m, (byte) 115, 23.299999237060547f, 25.399999618530273f);
                                              return false;
                                            }
                                          }
                                        }
                                        this.a(fda.field_l, (byte) -100, 23.299999237060547f, 23.299999237060547f);
                                        return false;
                                      }
                                    }
                                  }
                                  this.a(uga.field_B, (byte) -91, 0.8999999761581421f, 23.299999237060547f);
                                  return false;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            this.a(aka.field_w, (byte) -102, 0.6000000238418579f, 0.8999999761581421f);
                            return false;
                          } else {
                            break L2;
                          }
                        }
                      }
                      this.a(0.5f, vfa.field_p, 0.6000000238418579f, -119, "lobby");
                      return false;
                    }
                  }
                }
                this.a(0.20000000298023224f, mt.field_p, 0.5f, -115, "lobby");
                return false;
              } else {
                break L0;
              }
            }
          }
          this.a(0.0f, mt.field_p, 0.20000000298023224f, -116, "basic");
          return false;
        } else {
          this.a(84.5999984741211f, true);
          waa.a(0, 22);
          if (null == wba.field_f) {
            L20: {
              this.a(84.9000015258789f, true);
              waa.a(0, 23);
              if (wb.field_l == null) {
                break L20;
              } else {
                qla.d(-64);
                nw.a(wb.field_l, (byte) 2);
                mea.e(0);
                wb.field_l = null;
                break L20;
              }
            }
            this.a(85.30000305175781f, true);
            waa.a(0, 24);
            if (null != uga.field_B) {
              ((BachelorFridge) this).a((byte) 100);
              uga.field_B = null;
              mia.b(32);
              return false;
            } else {
              this.a(85.9000015258789f, true);
              waa.a(0, 25);
              if (null != tca.field_m) {
                L21: {
                  ((BachelorFridge) this).a((byte) 125);
                  if (!lha.b(18)) {
                    break L21;
                  } else {
                    tca.field_m = null;
                    break L21;
                  }
                }
                mia.b(32);
                return false;
              } else {
                this.a(94.0999984741211f, true);
                waa.a(0, 26);
                if (iga.field_d == null) {
                  this.a(94.30000305175781f, true);
                  waa.a(0, 27);
                  if (null == wia.field_b) {
                    this.a(99.0f, true);
                    waa.a(0, 30);
                    if (null != ria.field_i) {
                      bka.a(ria.field_i, true);
                      ria.field_i = null;
                      return false;
                    } else {
                      this.a(99.30000305175781f, true);
                      waa.a(0, 31);
                      if (pr.field_j != null) {
                        iia.a(-167571320, pr.field_j);
                        pr.field_j = null;
                        return false;
                      } else {
                        this.a(99.5999984741211f, true);
                        waa.a(0, 32);
                        if (fga.field_h == null) {
                          this.a(99.69999694824219f, true);
                          waa.a(0, 33);
                          ek.d((byte) -19);
                          uw.g(-128);
                          eh discarded$3 = ju.field_r.a((java.awt.Component) (Object) dca.field_y, false, 123);
                          var2_int = 0;
                          if (param0 < -117) {
                            L22: while (true) {
                              if (var2_int >= 16) {
                                iba.field_s = 0;
                                kaa.field_m = 0;
                                jca.a(50, -14350);
                                ala.a(26219, wc.field_p);
                                mia.b(32);
                                waa.a(0, 34);
                                tia.b(false);
                                return true;
                              } else {
                                eg.field_p[var2_int] = vfa.a(19341, var2_int);
                                var2_int++;
                                continue L22;
                              }
                            }
                          } else {
                            return false;
                          }
                        } else {
                          ika.a((byte) 18, new il(fga.field_h.a((byte) 123, "huffman", "")));
                          fga.field_h = null;
                          mia.b(32);
                          return false;
                        }
                      }
                    }
                  } else {
                    ((BachelorFridge) this).a((byte) 3);
                    var2 = wia.field_b.a((byte) 123, "menufont", "basic");
                    var3 = bla.a(29611, "basic", "menufont", vb.field_j);
                    p.a(2, var2, 256);
                    taa.field_u = hla.a(4676, var3, var2);
                    kca.field_c = qca.a(var2, 2, false, var3, 0, 0);
                    kca.field_c.field_M = bfa.field_c;
                    dja.field_l = jr.a("basic", (byte) 110, vb.field_j, "fridgefont", wia.field_b);
                    la.a(3, dja.field_l);
                    kla.field_w = jr.a("basic", (byte) 124, vb.field_j, "smallfridgefont", wia.field_b);
                    iia.a(kla.field_w, 1);
                    fha.field_j = new String[2][2];
                    int discarded$4 = kla.field_w.a(fu.field_l[0], new int[1], fha.field_j[0]);
                    int discarded$5 = kla.field_w.a(fu.field_l[1], new int[1], fha.field_j[1]);
                    var2 = wia.field_b.a((byte) 123, "tinyfont", "basic");
                    var3 = bla.a(29611, "basic", "tinyfont", vb.field_j);
                    ad.field_h = hl.a(16777215, (byte) 107, var3, 65793, var2);
                    ad.field_h.field_M = ce.field_w;
                    wt.field_k = hla.a(4676, var3, var2);
                    g.field_g = vfa.a("midfont", vb.field_j, -50, "basic", wia.field_b);
                    var2 = wia.field_b.a((byte) 123, "arenafont", "basic");
                    var3 = bla.a(29611, "basic", "arenafont", vb.field_j);
                    b.field_t = hl.a(16777215, (byte) 107, var3, 65793, var2);
                    b.field_t.field_M = ce.field_w;
                    fu.a(vb.field_j, false);
                    uq.field_zb = an.a((byte) -127, vb.field_j, "basic", "generic_frame");
                    uma.field_J = an.a((byte) -123, vb.field_j, "basic", "generic_frame");
                    og.field_a = pi.a(vb.field_j, -8845, "basic", "achievements_large");
                    ona.field_yb = hca.a("basic", mt.field_p, 71, "unachieved");
                    rc.field_l = hca.a("basic", mt.field_p, 84, "orbcoin");
                    ui.a((byte) -33, ona.field_yb);
                    ui.a((byte) -33, rc.field_l);
                    jb.a((oh) (Object) new wi(vd.field_y, fw.field_j, uda.field_U, 32, false));
                    sw.field_p = new kv(32, 32);
                    sw.field_p.b();
                    rc.field_l.e(0, 0, 32, 32);
                    hga.field_U.a((byte) -97);
                    rc.field_l = null;
                    var4 = new kv[1 + ena.field_o.length][];
                    var5 = new kv[1 + ena.field_o.length][];
                    var6_int = 0;
                    L23: while (true) {
                      if ((ena.field_o.length ^ -1) >= (var6_int ^ -1)) {
                        var6 = lna.field_y;
                        r.a(cma.field_y, -1, mt.field_p, lna.field_y, tj.field_c, jha.field_j, pt.field_b, 4, fda.field_k, vfa.field_p, var6, var4, true, var5, 5);
                        nda.field_l = hca.a("basic", vb.field_j, -99, "lobby_game_logo");
                        iw.a(200, (byte) -89);
                        bca.a(-114, mt.field_p, vfa.field_p);
                        vh.a(0, lga.field_n, 0, 16777215, 0, (java.applet.Applet) this);
                        vb.field_j = null;
                        wia.field_b = null;
                        vfa.field_p = null;
                        mia.b(32);
                        return false;
                      } else {
                        L24: {
                          if (null == ena.field_o[var6_int]) {
                            var4[var6_int] = null;
                            var5[var6_int] = null;
                            break L24;
                          } else {
                            var4[var6_int] = gw.a("basic", ena.field_o[var6_int], vb.field_j, -113);
                            var5[var6_int] = null;
                            break L24;
                          }
                        }
                        var6_int++;
                        continue L23;
                      }
                    }
                  }
                } else {
                  pj.a(true, iga.field_d);
                  iga.field_d = null;
                  return false;
                }
              }
            }
          } else {
            ce.a(wba.field_f, 15);
            wba.field_f = null;
            return false;
          }
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        cfa var3_ref_cfa = null;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        int var4 = 0;
        int[] var4_ref_int__ = null;
        jna[] var4_ref_jna__ = null;
        pf var5_ref = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kg stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        java.awt.Canvas stackIn_29_0 = null;
        boolean stackIn_33_0 = false;
        Object stackIn_77_0 = null;
        Object stackIn_79_0 = null;
        Object stackIn_81_0 = null;
        Object stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_85_0 = 0;
        boolean stackIn_157_0 = false;
        boolean stackIn_210_0 = false;
        int stackIn_235_0 = 0;
        int stackIn_248_0 = 0;
        boolean stackIn_275_0 = false;
        boolean stackIn_279_0 = false;
        boolean stackIn_283_0 = false;
        kg stackOut_2_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        java.awt.Canvas stackOut_28_0 = null;
        boolean stackOut_32_0 = false;
        Object stackOut_76_0 = null;
        Object stackOut_77_0 = null;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_84_0 = 0;
        boolean stackOut_156_0 = false;
        boolean stackOut_209_0 = false;
        int stackOut_234_0 = 0;
        int stackOut_247_0 = 0;
        boolean stackOut_274_0 = false;
        boolean stackOut_278_0 = false;
        boolean stackOut_282_0 = false;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        int discarded$5 = sma.e(30);
                        md.field_l = jfa.e(-93);
                        if (null == kga.field_c) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = kga.field_c;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((kg) (Object) stackIn_3_0).field_f) {
                            statePc = 8;
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
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        lga.c((byte) 108);
                        hea.b(4);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = this;
                        stackOut_9_1 = -30;
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (null == kga.field_c) {
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
                        stackOut_10_2 = 1;
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
                        statePc = 296;
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
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((BachelorFridge) this).b(stackIn_13_1, stackIn_13_2 != 0);
                        if (!ed.field_a) {
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
                        this.r(11);
                        ed.field_a = false;
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
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        vr.field_b = vr.field_b + 1;
                        var2_int = 89 % ((40 - param0) / 49);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!sn.c(63)) {
                            statePc = 27;
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
                        if (!pw.field_z) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
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
                case 22: {
                    try {
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
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        eh discarded$6 = ju.field_r.a((java.awt.Component) (Object) dca.field_y, true, 124);
                        pw.field_z = true;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((BachelorFridge) this).l(10);
                        if (!sn.c(106)) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return;
                }
                case 27: {
                    try {
                        if (!sg.field_r) {
                            statePc = 39;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = sia.field_i;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 != dca.field_y) {
                            statePc = 36;
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
                case 32: {
                    try {
                        stackOut_32_0 = pw.field_z;
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
                        if (!stackIn_33_0) {
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
                        eh discarded$7 = ju.field_r.a((java.awt.Component) (Object) dca.field_y, false, 124);
                        sia.field_i = dca.field_y;
                        pw.field_z = false;
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
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (!sg.field_r) {
                            statePc = 117;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (cj.b(true)) {
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
                        bs.c((byte) -117);
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
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
                        if (!vs.a(23864)) {
                            statePc = 73;
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
                        if (ha.field_k != ha.field_l) {
                            statePc = 70;
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
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var3 = ib.a(true);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var3 != 2) {
                            statePc = 57;
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
                        lga.c((byte) 109);
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (3 == var3) {
                            statePc = 66;
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
                        if ((var3 ^ -1) != -5) {
                            statePc = 69;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        ge.field_L = true;
                        au.a(0, im.field_a, false);
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
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
                        oq.a(true, false);
                        statePc = 67;
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
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        this.a(true, (byte) 91);
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        this.a(false, (byte) 93);
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
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
                        if (!paa.a(15000)) {
                            statePc = 99;
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
                        stackOut_76_0 = this;
                        stackIn_81_0 = stackOut_76_0;
                        stackIn_77_0 = stackOut_76_0;
                        if (kga.field_c == null) {
                            statePc = 81;
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
                        stackOut_77_0 = this;
                        stackIn_79_0 = stackOut_77_0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackOut_79_0 = this;
                        stackOut_79_1 = 1;
                        stackIn_82_0 = stackOut_79_0;
                        stackIn_82_1 = stackOut_79_1;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackOut_81_0 = this;
                        stackOut_81_1 = 0;
                        stackIn_82_0 = stackOut_81_0;
                        stackIn_82_1 = stackOut_81_1;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var3 = ((BachelorFridge) this).a(stackIn_82_1 != 0, -48);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (1 == var3) {
                            statePc = 88;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackOut_84_0 = var3;
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
                        if (stackIn_85_0 != 2) {
                            statePc = 98;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (null != kga.field_c) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        lga.c((byte) 118);
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if ((var3 ^ -1) == -3) {
                            statePc = 97;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        dh.a((java.applet.Applet) this, 59);
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        this.a(true, (byte) 115);
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (!nba.b((byte) -99)) {
                            statePc = 114;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (ha.field_l != ha.field_k) {
                            statePc = 111;
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
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var3 = jk.d(2);
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (var3 != 1) {
                            statePc = 110;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        jl.field_r = true;
                        au.a(0, gba.field_Ib, false);
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        this.a(true, (byte) 126);
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        this.a(false, (byte) 98);
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
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
                        this.a(false, (byte) 125);
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
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
                        aca.a((byte) -118, vc.field_a);
                        if (this.j((byte) 7)) {
                            statePc = 122;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        sg.field_r = true;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (!bp.e(-29919)) {
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
                        statePc = 130;
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
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var3_ref_cfa = (cfa) (Object) tla.field_q.a(false);
                        if (var3_ref_cfa == null) {
                            statePc = 130;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        rm.a(4, 122, var3_ref_cfa);
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (!uv.a((byte) 122, mfa.field_b)) {
                            statePc = 226;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (ri.field_a == 9) {
                            statePc = 135;
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
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        rs.a(true);
                        bka.field_h = false;
                        kaa.field_m = 10;
                        fia.field_s = ig.field_m.g(-84);
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (ri.field_a == 14) {
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
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        rs.a(true);
                        dfa.a(150, ul.a(-58, 4), ul.a(-51, 2000), 0, jha.field_j, cma.field_y.length, mia.d((byte) -104), efa.c(true), 1024, ms.n(96));
                        eka.a(vv.a(31185), -83, jha.c(-31068));
                        wj.field_g = true;
                        hm.field_b = true;
                        bka.field_h = false;
                        kaa.field_m = -2;
                        ip.a((byte) 22, kaa.field_m);
                        tla.d(-91);
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if ((ri.field_a ^ -1) != -16) {
                            statePc = 155;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (!hm.field_b) {
                            statePc = 154;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        rs.a(true);
                        ih.d((byte) -83);
                        fu.d(13042);
                        if (2 != (hp.field_c ^ -1)) {
                            statePc = 150;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        kj.b((byte) -88);
                        hp.field_c = 0;
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        vs.field_d = false;
                        gja.field_n = false;
                        kaa.field_m = 0;
                        sia.field_h = false;
                        nu.field_b = true;
                        ge.field_D = true;
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        hm.field_b = false;
                        rf.a(-128);
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        pha.field_a = false;
                        bka.field_h = false;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (10 != ri.field_a) {
                            statePc = 163;
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
                        stackOut_156_0 = hm.field_b;
                        stackIn_157_0 = stackOut_156_0;
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
                        if (!stackIn_157_0) {
                            statePc = 163;
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
                        sa.d(-7);
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 162;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (68 == ri.field_a) {
                            statePc = 166;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        var3_ref_int__ = vv.a((byte) 124);
                        var4_ref_int__ = var3_ref_int__;
                        var5_ref = ig.field_m;
                        var6 = ((lu) (Object) var5_ref).b(16711935);
                        var7 = 0;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if ((var6 ^ -1) >= (var7 ^ -1)) {
                            statePc = 171;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        var4_ref_int__[var7] = ((lu) (Object) var5_ref).f(-111);
                        var7++;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 170;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        var4_ref_int__ = var3_ref_int__;
                        var5_ref_int__ = sg.field_q;
                        var6 = 0;
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        if (-9 >= (var6 ^ -1)) {
                            statePc = 176;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        var4_ref_int__[var6] = dda.a(var4_ref_int__[var6], var5_ref_int__[var6] ^ -1);
                        var6++;
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        if (!dma.field_a) {
                            statePc = 184;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        var4 = 0;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        if (pp.field_g.length <= var4) {
                            statePc = 184;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (!hp.a(var4, (byte) -66, var3_ref_int__)) {
                            statePc = 183;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        mka.field_f.a((bw) (Object) new ji(var4), true);
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        var4++;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        var4_ref_int__ = sg.field_q;
                        var5_ref_int__ = var3_ref_int__;
                        var6 = 0;
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if (var6 >= 8) {
                            statePc = 189;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        var4_ref_int__[var6] = mp.a(var4_ref_int__[var6], var5_ref_int__[var6]);
                        var6++;
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        var4_ref_int__ = nga.field_i;
                        var5_ref_int__ = var3_ref_int__;
                        var6 = 0;
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        if ((var6 ^ -1) <= -9) {
                            statePc = 192;
                        } else {
                            statePc = 191;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        var4_ref_int__[var6] = mp.a(var4_ref_int__[var6], var5_ref_int__[var6]);
                        var6++;
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if (69 == ri.field_a) {
                            statePc = 196;
                        } else {
                            statePc = 194;
                        }
                        continue stateLoop;
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
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        if (!kha.field_f) {
                            statePc = 130;
                        } else {
                            statePc = 197;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        mg.field_m = new mu((lu) (Object) ig.field_m);
                        rba.a(mg.field_m, (byte) 125);
                        ep.field_m = ig.field_m.e((byte) 65);
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        if (ri.field_a == 76) {
                            statePc = 201;
                        } else {
                            statePc = 199;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        statePc = 205;
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
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        int discarded$8 = ig.field_m.a(3);
                        int discarded$9 = ig.field_m.a(3);
                        var3 = ig.field_m.b(16711935);
                        var4_ref_jna__ = new jna[var3];
                        var5 = 0;
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        if (var5 >= var3) {
                            statePc = 204;
                        } else {
                            statePc = 203;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        var4_ref_jna__[var5] = ima.a((lu) (Object) ig.field_m, true);
                        var5++;
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        if (-60 == (ri.field_a ^ -1)) {
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
                        statePc = 217;
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 207;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        if (vs.field_d) {
                            statePc = 215;
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
                        stackOut_209_0 = gja.field_n;
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
                        if (stackIn_210_0) {
                            statePc = 215;
                        } else {
                            statePc = 211;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        rs.a(true);
                        vs.field_d = false;
                        wma.field_b = 0;
                        gja.field_n = false;
                        kaa.field_m = -2;
                        wj.field_g = true;
                        sia.field_h = false;
                        nu.field_b = true;
                        rf.a(-128);
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        pha.field_a = false;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        if (!lo.b((byte) -102)) {
                            statePc = 221;
                        } else {
                            statePc = 218;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 220;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 220;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        if (!lfa.d(-124)) {
                            statePc = 225;
                        } else {
                            statePc = 222;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        ((BachelorFridge) this).a(true);
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        hna.a(0, 96);
                        statePc = 227;
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        if (wj.field_g) {
                            statePc = 230;
                        } else {
                            statePc = 228;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 229;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        statePc = 231;
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 229;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        wma.field_b = 0;
                        statePc = 231;
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        if (!er.d(11154)) {
                            statePc = 297;
                        } else {
                            statePc = 232;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        var3 = ((BachelorFridge) this).g(-127);
                        statePc = 233;
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        if (0 == var3) {
                            statePc = 240;
                        } else {
                            statePc = 234;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        stackOut_234_0 = var3;
                        stackIn_235_0 = stackOut_234_0;
                        statePc = 235;
                        continue stateLoop;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        if ((stackIn_235_0 ^ -1) == -2) {
                            statePc = 240;
                        } else {
                            statePc = 236;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 239;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        statePc = 238;
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 239;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 239;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        statePc = 268;
                        continue stateLoop;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 239;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        if (1 != var3) {
                            statePc = 244;
                        } else {
                            statePc = 241;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_240) {
                        caughtException = stateCaught_240;
                        statePc = 243;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        bka.field_h = true;
                        pha.field_a = true;
                        statePc = 268;
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 246;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 246;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        if (iba.field_s == -3) {
                            statePc = 264;
                        } else {
                            statePc = 245;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        statePc = 247;
                        continue stateLoop;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        stackOut_247_0 = -13;
                        stackIn_248_0 = stackOut_247_0;
                        statePc = 248;
                        continue stateLoop;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        if (stackIn_248_0 == (iba.field_s ^ -1)) {
                            statePc = 264;
                        } else {
                            statePc = 249;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 253;
                        continue stateLoop;
                    }
                }
                case 249: {
                    try {
                        statePc = 251;
                        continue stateLoop;
                    } catch (Throwable stateCaught_249) {
                        caughtException = stateCaught_249;
                        statePc = 253;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 253;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        if (hm.field_b) {
                            statePc = 256;
                        } else {
                            statePc = 252;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        statePc = 254;
                        continue stateLoop;
                    } catch (Throwable stateCaught_252) {
                        caughtException = stateCaught_252;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        statePc = 267;
                        continue stateLoop;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 255: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_255) {
                        caughtException = stateCaught_255;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        nu.field_b = true;
                        ge.field_D = true;
                        sia.field_h = false;
                        if (vs.field_d) {
                            statePc = 260;
                        } else {
                            statePc = 257;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 259;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        lg.a(true, 0, false);
                        statePc = 263;
                        continue stateLoop;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 262;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 262;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        fia.field_s = ck.field_f;
                        hb.a(2, 10, 0, false);
                        statePc = 261;
                        continue stateLoop;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 262;
                        continue stateLoop;
                    }
                }
                case 261: {
                    try {
                        statePc = 263;
                        continue stateLoop;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        rs.a(true);
                        eg.field_p[iba.field_s].a(false, 32);
                        hm.field_b = false;
                        gja.field_n = false;
                        vs.field_d = false;
                        rf.a(-128);
                        statePc = 267;
                        continue stateLoop;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 266;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        nu.field_b = true;
                        sia.field_h = false;
                        lg.a(true, 0, false);
                        statePc = 265;
                        continue stateLoop;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 266;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        statePc = 267;
                        continue stateLoop;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        bka.field_h = false;
                        pha.field_a = false;
                        statePc = 268;
                        continue stateLoop;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        var4 = 0;
                        statePc = 269;
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        if (2 == var3) {
                            statePc = 272;
                        } else {
                            statePc = 270;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 271;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        statePc = 273;
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 271;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        var4 = 1;
                        statePc = 273;
                        continue stateLoop;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        if (gs.field_f != null) {
                            statePc = 288;
                        } else {
                            statePc = 274;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        stackOut_274_0 = hm.field_b;
                        stackIn_275_0 = stackOut_274_0;
                        statePc = 275;
                        continue stateLoop;
                    } catch (Throwable stateCaught_274) {
                        caughtException = stateCaught_274;
                        statePc = 277;
                        continue stateLoop;
                    }
                }
                case 275: {
                    try {
                        if (stackIn_275_0) {
                            statePc = 288;
                        } else {
                            statePc = 276;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_275) {
                        caughtException = stateCaught_275;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        statePc = 278;
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 277: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_277) {
                        caughtException = stateCaught_277;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        stackOut_278_0 = bka.field_h;
                        stackIn_279_0 = stackOut_278_0;
                        statePc = 279;
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 279: {
                    try {
                        if (stackIn_279_0) {
                            statePc = 288;
                        } else {
                            statePc = 280;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_279) {
                        caughtException = stateCaught_279;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 280: {
                    try {
                        statePc = 282;
                        continue stateLoop;
                    } catch (Throwable stateCaught_280) {
                        caughtException = stateCaught_280;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 281: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_281) {
                        caughtException = stateCaught_281;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 282: {
                    try {
                        stackOut_282_0 = pha.field_a;
                        stackIn_283_0 = stackOut_282_0;
                        statePc = 283;
                        continue stateLoop;
                    } catch (Throwable stateCaught_282) {
                        caughtException = stateCaught_282;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 283: {
                    try {
                        if (stackIn_283_0) {
                            statePc = 288;
                        } else {
                            statePc = 284;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_283) {
                        caughtException = stateCaught_283;
                        statePc = 287;
                        continue stateLoop;
                    }
                }
                case 284: {
                    try {
                        statePc = 286;
                        continue stateLoop;
                    } catch (Throwable stateCaught_284) {
                        caughtException = stateCaught_284;
                        statePc = 287;
                        continue stateLoop;
                    }
                }
                case 285: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_285) {
                        caughtException = stateCaught_285;
                        statePc = 287;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        statePc = 289;
                        continue stateLoop;
                    } catch (Throwable stateCaught_286) {
                        caughtException = stateCaught_286;
                        statePc = 287;
                        continue stateLoop;
                    }
                }
                case 287: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_287) {
                        caughtException = stateCaught_287;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 288: {
                    try {
                        var4 = 1;
                        statePc = 289;
                        continue stateLoop;
                    } catch (Throwable stateCaught_288) {
                        caughtException = stateCaught_288;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 289: {
                    try {
                        if (er.d(11154)) {
                            statePc = 291;
                        } else {
                            statePc = 290;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_289) {
                        caughtException = stateCaught_289;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 290: {
                    try {
                        var4 = 0;
                        statePc = 291;
                        continue stateLoop;
                    } catch (Throwable stateCaught_290) {
                        caughtException = stateCaught_290;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 291: {
                    try {
                        if (var4 == 0) {
                            statePc = 297;
                        } else {
                            statePc = 292;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_291) {
                        caughtException = stateCaught_291;
                        statePc = 294;
                        continue stateLoop;
                    }
                }
                case 292: {
                    try {
                        ih.e(10);
                        statePc = 293;
                        continue stateLoop;
                    } catch (Throwable stateCaught_292) {
                        caughtException = stateCaught_292;
                        statePc = 294;
                        continue stateLoop;
                    }
                }
                case 293: {
                    try {
                        statePc = 297;
                        continue stateLoop;
                    } catch (Throwable stateCaught_293) {
                        caughtException = stateCaught_293;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 294: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_294) {
                        caughtException = stateCaught_294;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 296: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pe.a((Throwable) (Object) var2, "BachelorFridge.C(" + param0 + 41);
                }
                case 297: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              ((BachelorFridge) this).a(70, 4, 0, 1, false, false, 2, 20);
              nja.field_a = 16711935;
              jc.field_t = 2603264;
              fa.field_f = 16777215;
              mt.field_v = 2603264;
              ru.field_c = 16711935;
              wk.field_f = 16777215;
              ((BachelorFridge) this).a(false, (byte) 62, true, true, false, false, false);
              mfa.field_b[64] = 1;
              mfa.field_b[63] = 1;
              mfa.field_b[57] = -2;
              mfa.field_b[79] = -2;
              mfa.field_b[9] = -1;
              mfa.field_b[58] = -2;
              mfa.field_b[61] = 4;
              mfa.field_b[84] = 1;
              mfa.field_b[65] = 1;
              if (param0 >= 50) {
                break L0;
              } else {
                ((BachelorFridge) this).field_x = true;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          mfa.field_b[66] = 1;
          mfa.field_b[69] = -2;
          mfa.field_b[60] = 7;
          mfa.field_b[68] = -1;
          mfa.field_b[78] = -2;
          mfa.field_b[70] = 8;
          mfa.field_b[73] = -2;
          mfa.field_b[62] = -1;
          mfa.field_b[67] = 1;
          mfa.field_b[82] = -2;
          mfa.field_b[59] = 0;
          mfa.field_b[10] = -1;
          mfa.field_b[80] = -2;
          mfa.field_b[76] = -2;
          mfa.field_b[75] = 2;
          mfa.field_b[74] = -2;
        }
    }

    static {
    }
}
