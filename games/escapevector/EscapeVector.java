/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
            throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.O(" + param0 + ')');
        }
    }

    final void c(int param0) {
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
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
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        gk.field_c = false;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!ik.field_h[2]) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        gk.field_c = true;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_int = 119 % ((param0 - -39) / 33);
                        if (null == df.field_d) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!df.field_d.field_c) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ri.a(-25123);
                        oj.a((byte) 97);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        bj.field_C.d();
                        ig.field_l.d();
                        stackIn_16_0 = this;
                        stackIn_14_0 = stackIn_16_0;
                        stackIn_16_1 = -1;
                        stackIn_14_1 = stackIn_16_1;
                        if (null == df.field_d) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_17_0 = this;
                        stackIn_17_1 = stackIn_14_1;
                        stackIn_17_2 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = this;
                        stackIn_17_1 = stackIn_16_1;
                        stackIn_17_2 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.a(stackIn_17_1, stackIn_17_2 != 0);
                        if (!of.field_b) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.f(true);
                        of.field_b = false;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        od.field_s = false;
                        de.field_j = false;
                        r.field_y = false;
                        if (ii.b(16836)) {
                            statePc = 110;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!uk.field_h) {
                            statePc = 98;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!mb.b((byte) -120)) {
                            statePc = 95;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (mj.a((byte) 79)) {
                            statePc = 56;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (!da.c((byte) -127)) {
                            statePc = 53;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (ma.field_a == null) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ma.field_a.s((byte) -41);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_41_0 = this;
                        stackIn_39_0 = stackIn_41_0;
                        if (df.field_d == null) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_42_0 = this;
                        stackIn_42_1 = 1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = this;
                        stackIn_42_1 = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var3 = this.a(stackIn_42_1 != 0, -556);
                        if (var3 != 1) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ri.a(-25123);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var3 != 2) {
                            statePc = 52;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (df.field_d == null) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ri.a(-25123);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        gk.a(-9787, oc.d((byte) -119));
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var4 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        mb.a((byte) -90);
                        this.q(1);
                        if (var4 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (ma.field_a == null) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        pf.e((byte) -125);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (mj.field_d == 0) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        sj.a(8192, (byte) 51);
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        de.field_j = true;
                        if (null == ma.field_a) {
                            statePc = 72;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (20 > mj.field_d) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        de.field_j = false;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (1000 <= mj.field_d) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        mj.field_d = mj.field_d + 1;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var3 = fn.b(-14);
                        if ((var3 ^ -1) != -3) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        ri.a(-25123);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var3 != 3) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        eo.a(24, true);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (-5 != (var3 ^ -1)) {
                            statePc = 84;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        da.a((byte) -112);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (!mj.a((byte) 92)) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (null == ma.field_a) {
                            statePc = 91;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        da.field_c.b(ch.field_a.field_j, 320);
                        if (var4 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        pl.field_q.b(-26480, pl.field_q.field_b.field_j);
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        mj.field_d = 0;
                        gi.a((byte) -67);
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (var4 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        ac.a(25972, mg.field_f);
                        km.b((byte) -59);
                        if (var4 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        this.n((byte) -96);
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (!rg.a(wd.field_u, 109)) {
                            statePc = 105;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        this.f(127);
                        if (var4 != 0) {
                            statePc = 106;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (var4 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        rn.a(0, 30785);
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (!um.a(17830)) {
                            statePc = 118;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        this.k((byte) -67);
                        if (var4 == 0) {
                            statePc = 118;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        this.j(-9926);
                        if (!ii.b(16836)) {
                            statePc = 115;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (!mj.a((byte) 125)) {
                            statePc = 118;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        eo.a(24, true);
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (dj.field_c == null) {
                            statePc = 125;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (!r.field_y) {
                            statePc = 124;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        dj.field_c.g(2048);
                        dj.field_c = null;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (null == mb.field_a) {
                            statePc = 131;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (de.field_j) {
                            statePc = 131;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        mb.field_a.g(2048);
                        mb.field_a = null;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (od.field_s) {
                            statePc = 144;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var3 = 0;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (gd.field_K.length <= var3) {
                            statePc = 144;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (var4 != 0) {
                            statePc = 144;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (gd.field_K[var3] != null) {
                            statePc = 140;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        gd.field_K[var3].g(256);
                        gd.field_K[var3] = null;
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
                        var3++;
                        if (var4 == 0) {
                            statePc = 133;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 143: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw t.a((Throwable) ((Object) var2), "EscapeVector.H(" + param0 + ')');
                }
                case 144: {
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
            throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.CB(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
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
                break L1;
              } else {
                this.p(-97);
                break L1;
              }
            }
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
            this.field_s = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.E(" + param0 + ')');
        }
    }

    private final void n(byte param0) {
        int var2_int = 0;
        dd var2 = null;
        ec var2_ref = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2_ref2 = null;
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
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        gn.a(-122);
                        dn.a(pg.field_f, param0 ^ -17595, 70.0f);
                        this.e((byte) -128);
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
                        statePc = 24;
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
                        statePc = 24;
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
                        statePc = 24;
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
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
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
                        statePc = 24;
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
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        dn.a(qf.field_n, 17637, 80.0f);
                        this.e((byte) 7);
                        var2 = new dd(22050, ie.field_q);
                        ff.field_i = kj.a(hn.field_h, "", "write-text").a().a(var2);
                        en.field_d = kj.a(hn.field_h, "", "cursor").a().a(var2);
                        bm.field_a = kj.a(hn.field_h, "", "interference").a().a(var2);
                        qh.field_i = kj.a(hn.field_h, "", "interference_300ms").a().a(var2);
                        nn.field_g = kj.a(hn.field_h, "", "mainmenu_formation").a().a(var2);
                        oa.field_w = kj.a(hn.field_h, "", "mouseover").a().a(var2);
                        b.field_b = kj.a(hn.field_h, "", "level_indicator").a().a(var2);
                        pc.field_a = kj.a(hn.field_h, "", "button_formation").a().a(var2);
                        uf.field_g = kj.a(hn.field_h, "", "frame-appear").a().a(var2);
                        si.field_t = kj.a(hn.field_h, "", "photo-blob-grow").a().a(var2);
                        vd.field_g = kj.a(hn.field_h, "", "photo-body-explode").a().a(var2);
                        ob.field_d = kj.a(hn.field_h, "", "grid_effect_1").a().a(var2);
                        pa.field_b = kj.a(hn.field_h, "", "grid_effect_2").a().a(var2);
                        dd.field_g = in.a(jm.field_I, "", "pixelate").b().a(var2);
                        oj.field_N = kj.a(hn.field_h, "", "gas-pump").a().a(var2);
                        ng.field_mb = kj.a(hn.field_h, "", "gas-burn").a().a(var2);
                        ka.field_e = kj.a(hn.field_h, "", "left-foot-down").a().a(var2);
                        ri.field_b = kj.a(hn.field_h, "", "right-foot-down").a().a(var2);
                        ni.field_M = kj.a(hn.field_h, "", "ship-fire").a().a(var2);
                        gn.field_e = kj.a(hn.field_h, "", "ship-fire-three").a().a(var2);
                        uk.field_j = kj.a(hn.field_h, "", "alien-fire").a().a(var2);
                        th.field_G = kj.a(hn.field_h, "", "shield").a().a(var2);
                        co.field_d = kj.a(hn.field_h, "", "shield_impact").a().a(var2);
                        gm.field_b = kj.a(hn.field_h, "", "shield_empty").a().a(var2);
                        qa.field_E = kj.a(hn.field_h, "", "fuel-start").a().a(var2);
                        lm.field_d = kj.a(hn.field_h, "", "fuel-filling").a().a(var2);
                        al.field_b = kj.a(hn.field_h, "", "fuel-stop").a().a(var2);
                        fn.field_f = kj.a(hn.field_h, "", "fuel-full").a().a(var2);
                        fg.field_a = kj.a(hn.field_h, "", "crate-attach").a().a(var2);
                        rk.field_c = kj.a(hn.field_h, "", "tether-tighten").a().a(var2);
                        bc.field_c = kj.a(hn.field_h, "", "tether-release").a().a(var2);
                        nm.field_a = kj.a(hn.field_h, "", "powerup-collect").a().a(var2);
                        vi.field_c = kj.a(hn.field_h, "", "repeller-active").a().a(var2);
                        w.field_hb = kj.a(hn.field_h, "", "magnet-active").a().a(var2);
                        of.field_h = kj.a(hn.field_h, "", "laser").a().a(var2);
                        ib.field_a = kj.a(hn.field_h, "", "explosion-ship").a().a(var2);
                        vn.field_c = kj.a(hn.field_h, "", "explosion_5_seconds").a().a(var2);
                        pa.field_a = in.a(jm.field_I, "", "beeping").b().a(var2);
                        this.a(param0 + 97, var2);
                        ci.field_a = kj.a(hn.field_h, "", "mine_inactive_hum_2").a().a(var2);
                        qi.field_J = kj.a(hn.field_h, "", "100Hz square").a();
                        ve.field_d = kj.a(hn.field_h, "", "explosion-seeker-mine").a().a(var2);
                        kf.field_p = kj.a(hn.field_h, "", "rockbuster").a().a(var2);
                        td.field_c = kj.a(hn.field_h, "", "explosion-rock-buster").a().a(var2);
                        jh.field_k = kj.a(hn.field_h, "", "level_complete").a().a(var2);
                        pl.field_o = kj.a(hn.field_h, "", "level_complete_score").a().a(var2);
                        fn.a((byte) 106);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
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
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        dn.a(q.field_H, param0 + 17733, 90.0f);
                        this.e((byte) 48);
                        var2_ref = new ec(hn.field_h, jm.field_I);
                        jm.field_I = null;
                        hn.field_h = null;
                        fj.field_eb = nm.a(2, "", var2_ref, oc.field_D, "music/menu");
                        ul.field_O = nm.a(param0 ^ -94, "", var2_ref, oc.field_D, "music/briefing");
                        wc.field_d = nm.a(2, "", var2_ref, oc.field_D, "music/panic");
                        rk.field_d = new ce[5];
                        rk.field_d[0] = nm.a(2, "", var2_ref, oc.field_D, "music/oss_area_1");
                        rk.field_d[1] = nm.a(2, "", var2_ref, oc.field_D, "music/oss_area_2");
                        rk.field_d[2] = nm.a(2, "", var2_ref, oc.field_D, "music/oss_area_3");
                        rk.field_d[3] = nm.a(2, "", var2_ref, oc.field_D, "music/oss_area_4");
                        rk.field_d[4] = nm.a(n.a((int) param0, -94), "", var2_ref, oc.field_D, "music/simulator");
                        oc.field_D = null;
                        fn.a((byte) 93);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
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
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        dn.a(qa.field_H, param0 ^ -17595, 100.0f);
                        this.e((byte) -127);
                        ld.field_h = bg.a(bj.field_B, ld.field_h, he.field_u, 0);
                        bj.field_B = null;
                        fn.a((byte) 51);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
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
                            statePc = 22;
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
                        field_z = (String) null;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        da.field_b = new ta();
                        qk.field_e = new dn(true);
                        oe.c((byte) 115);
                        fg.c(0);
                        this.l(param0 + 95);
                        uk.field_h = true;
                        vl.b(1, 0);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var2_ref2 = (RuntimeException) ((Object) caughtException);
                    throw t.a((Throwable) ((Object) var2_ref2), "EscapeVector.FB(" + param0 + ')');
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_z = (String) null;
                break L1;
              }
            }
            nb.a((java.applet.Applet) (this), 1585176, (byte) -125, 6340704, vj.field_c, 192);
            aj.field_a = new fe((java.applet.Applet) (this), sh.field_r, af.field_a, vj.field_c);
            af.field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.AB(" + param0 + ')');
        }
    }

    final static void a(hg param0, hg param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.field_d != null) {
                param0.c((byte) -69);
                break L1;
              } else {
                break L1;
              }
            }
            if (param2 == -7) {
              param0.field_d = param1.field_d;
              param0.field_b = param1;
              param0.field_d.field_b = param0;
              param0.field_b.field_d = param0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("EscapeVector.WA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void o(int param0) {
        try {
            jm.field_K[param0] = fe.a("", fi.field_j, "sprites_fuel_glow", true);
            jm.field_K[2] = fe.a("", fi.field_j, "sprites_turret_glow", true);
            jm.field_K[3] = fe.a("", fi.field_j, "sprites_magnet_glow", true);
            jm.field_K[4] = fe.a("", fi.field_j, "sprites_repeller_glow", true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.DB(" + param0 + ')');
        }
    }

    final static ca n(int param0) {
        try {
            Throwable var1 = null;
            RuntimeException var1_ref = null;
            ca stackIn_2_0 = null;
            ca stackIn_4_0 = null;
            Object stackIn_6_0 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 13) {
                  try {
                    L1: {
                      stackIn_4_0 = (ca) (Class.forName("a").newInstance());
                      break L1;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var1 = decompiledCaughtException;
                    stackIn_6_0 = null;
                    return (ca) ((Object) stackIn_6_0);
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_2_0 = (ca) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw t.a((Throwable) ((Object) var1_ref), "EscapeVector.GB(" + param0 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_2_0;
            } else {
              return stackIn_4_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (df.field_d == null) {
                break L1;
              } else {
                ri.a(-25123);
                break L1;
              }
            }
            L2: {
              if (param0) {
                break L2;
              } else {
                field_z = (String) null;
                break L2;
              }
            }
            L3: {
              if (bj.field_C != null) {
                bj.field_C.c();
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (ig.field_l != null) {
                ig.field_l.c();
                break L4;
              } else {
                break L4;
              }
            }
            di.a(1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.B(" + param0 + ')');
        }
    }

    private final void f(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null == mg.field_c) {
                break L1;
              } else {
                qc.a(8, mg.field_c);
                mg.field_c = null;
                fn.a((byte) 57);
                break L1;
              }
            }
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.HB(" + param0 + ')');
        }
    }

    final static boolean a(tg param0, tg param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = field_A;
        try {
          L0: {
            L1: {
              if (param2 == -7457) {
                break L1;
              } else {
                field_z = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = -param1.field_pb + param0.field_pb;
                if (param0.field_lb == di.field_f) {
                  break L3;
                } else {
                  if (null == param0.field_lb) {
                    var3_int += 200;
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var3_int -= 200;
              break L2;
            }
            L4: {
              L5: {
                if (di.field_f == param1.field_lb) {
                  break L5;
                } else {
                  if (param1.field_lb == null) {
                    var3_int -= 200;
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              var3_int += 200;
              break L4;
            }
            L6: {
              if ((var3_int ^ -1) >= -1) {
                stackIn_26_0 = 0;
                break L6;
              } else {
                stackIn_26_0 = 1;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("EscapeVector.TA(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_31_0), stackIn_35_2 + ',' + param2 + ')');
        }
        return stackIn_26_0 != 0;
    }

    private final void a(int param0, dd param1) {
        hh dupTemp$8 = null;
        hh dupTemp$9 = null;
        hh dupTemp$10 = null;
        hh dupTemp$11 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            sf.field_e[0] = kj.a(hn.field_h, "", "explosion-fuel-tank").a().a(param1);
            sf.field_e[param0] = kj.a(hn.field_h, "", "explosion-crate").a().a(param1);
            dupTemp$8 = kj.a(hn.field_h, "", "explosion-magnet-repeller").a().a(param1);
            sf.field_e[4] = dupTemp$8;
            sf.field_e[3] = dupTemp$8;
            sf.field_e[2] = kj.a(hn.field_h, "", "explosion-turret").a().a(param1);
            dupTemp$9 = kj.a(hn.field_h, "", "explosion-tnt").a().a(param1);
            sf.field_e[8] = dupTemp$9;
            sf.field_e[5] = dupTemp$9;
            dupTemp$10 = kj.a(hn.field_h, "", "explosion-laser").a().a(param1);
            sf.field_e[7] = dupTemp$10;
            sf.field_e[6] = dupTemp$10;
            dupTemp$11 = kj.a(hn.field_h, "", "explosion-powerup").a().a(param1);
            sf.field_e[13] = dupTemp$11;
            sf.field_e[12] = dupTemp$11;
            sf.field_e[11] = dupTemp$11;
            sf.field_e[10] = dupTemp$11;
            sf.field_e[9] = dupTemp$11;
            this.a((byte) -60, sf.field_e[0]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("EscapeVector.LB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void m(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tj var2 = null;
        RuntimeException var2_ref = null;
        java.awt.Canvas var3 = null;
        int var4 = 0;
        long var5 = 0L;
        long var7 = 0L;
        int var9 = 0;
        var9 = field_A;
        try {
          L0: {
            L1: {
              var2 = qa.f((byte) -49);
              var3 = bf.i((byte) 10);
              if (param0 == -27273) {
                break L1;
              } else {
                field_z = (String) null;
                break L1;
              }
            }
            var4 = hm.g(11187) ? 1 : 0;
            if (!ii.b(16836)) {
              if (uk.field_h) {
                if (!mb.b((byte) -64)) {
                  dn.a(ff.field_a, 17637, 100.0f);
                  ah.a(var3, 0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      if (var2 == null) {
                        break L3;
                      } else {
                        var2.j(107);
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (ma.field_a != null) {
                        ma.field_a.G(0);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (!wk.field_c) {
                        break L5;
                      } else {
                        em.d();
                        aj.field_a.c(-76);
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (pg.field_b) {
                        break L6;
                      } else {
                        L7: {
                          if (-1 < (od.field_q ^ -1)) {
                            break L7;
                          } else {
                            hn.field_l.e(3);
                            if (var9 == 0) {
                              break L2;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (n.field_h) {
                            break L8;
                          } else {
                            L9: {
                              if (!e.field_a) {
                                break L9;
                              } else {
                                da.field_b.i(3);
                                if (var9 == 0) {
                                  break L2;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (!hn.field_n) {
                                break L10;
                              } else {
                                rc.field_a.a(false);
                                if (var9 == 0) {
                                  break L2;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (!ch.field_b) {
                                break L11;
                              } else {
                                qk.field_e.c((byte) 120);
                                if (var9 == 0) {
                                  break L2;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (null == da.field_c) {
                                break L12;
                              } else {
                                da.field_c.d((byte) 126);
                                if (var9 == 0) {
                                  break L2;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (null != pl.field_q) {
                              pl.field_q.a((byte) -16);
                              if (var9 == 0) {
                                break L2;
                              } else {
                                break L8;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        this.e(false);
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    hm.field_o.d(100);
                    break L2;
                  }
                  L13: {
                    if (!od.field_k) {
                      break L13;
                    } else {
                      if (null == ma.field_a) {
                        break L13;
                      } else {
                        if (ma.field_a.field_F) {
                          fh.field_g.c("EASY PEASY MODE IS ON", 320, 40, 16744576, -1);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  L14: {
                    if (!od.field_k) {
                      break L14;
                    } else {
                      if (null == ma.field_a) {
                        break L14;
                      } else {
                        if (ma.field_a.field_gb) {
                          fh.field_g.c("TIME HACK MODE IS ON", 320, 40, 16744576, -1);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  L15: {
                    if (2 > mg.field_b) {
                      break L15;
                    } else {
                      if (!gk.field_c) {
                        break L15;
                      } else {
                        fh.field_g.b("FPS: " + th.field_p, 636, 100, 16777215, 0);
                        fh.field_g.b("LPS: " + qf.field_j, 636, 120, 16777215, 0);
                        var5 = Runtime.getRuntime().totalMemory();
                        var7 = Runtime.getRuntime().freeMemory();
                        fh.field_g.b((var5 - var7) / 1000L + " kB / " + var5 / 1000L + " kB", 636, 140, 16777215, 0);
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (!da.c((byte) -106)) {
                      break L16;
                    } else {
                      if (mj.a((byte) 122)) {
                        break L16;
                      } else {
                        mh.a((byte) -111, var4 != 0);
                        break L16;
                      }
                    }
                  }
                  nn.a(var3, 0, -1, 0);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                ah.a(var3, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              gb.a(var4 != 0, (byte) 92, var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "EscapeVector.BB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void e(boolean param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_7_1 = false;
        int stackIn_7_2 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_8_1 = false;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_1;
        int stackIn_33_2;
        int stackIn_33_3;
        int stackIn_33_4;
        int stackIn_33_5;
        int stackIn_33_6;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_34_5 = 0;
        int stackIn_34_6 = 0;
        int stackIn_34_7 = 0;
        int stackIn_38_8 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_1;
        int stackIn_45_2;
        int stackIn_45_3;
        int stackIn_45_4;
        int stackIn_45_5;
        int stackIn_45_6;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_46_4 = 0;
        int stackIn_46_5 = 0;
        int stackIn_46_6 = 0;
        int stackIn_46_7 = 0;
        int stackIn_50_8 = 0;
        int stackIn_53_0 = 0;
        String stackIn_53_1 = null;
        int stackIn_54_0 = 0;
        String stackIn_54_1 = null;
        int stackIn_54_2 = 0;
        int stackIn_57_0 = 0;
        String stackIn_57_1 = null;
        int stackIn_58_0 = 0;
        String stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        RuntimeException decompiledCaughtException = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              em.d();
              od.b(2);
              var2 = nk.field_r;
              var3 = ce.field_f.b(110) ? 1 : 0;
              stackIn_3_0 = var3;

              stackIn_3_1 = 4;

              if (null == de.field_i) {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 0;
                break L1;
              } else {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 1;
                break L1;
              }
            }
            L2: {
              var4 = dn.a(stackIn_4_0 != 0, stackIn_4_1, stackIn_4_2 != 0, ua.field_c.d(17523));
              stackIn_7_0 = var3;

              stackIn_7_1 = ua.field_c.d(17523);

              stackIn_7_2 = -8;

              if (null == de.field_i) {
                stackIn_8_0 = stackIn_7_0;
                stackIn_8_1 = stackIn_7_1;
                stackIn_8_2 = stackIn_7_2;
                stackIn_8_3 = 0;
                break L2;
              } else {
                stackIn_8_0 = stackIn_7_0;
                stackIn_8_1 = stackIn_7_1;
                stackIn_8_2 = stackIn_7_2;
                stackIn_8_3 = 1;
                break L2;
              }
            }
            L3: {
              var5 = qd.a(stackIn_8_0 != 0, stackIn_8_1, (byte) stackIn_8_2, stackIn_8_3 != 0);
              stackIn_11_0 = var3;

              if (de.field_i == null) {
                stackIn_12_0 = stackIn_11_0;
                stackIn_12_1 = 0;
                break L3;
              } else {
                stackIn_12_0 = stackIn_11_0;
                stackIn_12_1 = 1;
                break L3;
              }
            }
            L4: {
              var6 = ik.a(stackIn_12_0 != 0, stackIn_12_1 != 0, (byte) -112, ua.field_c.d(17523));
              var7 = fh.field_g.b(var2);
              var8 = fh.field_g.b(var4);
              if (var8 <= var7) {
                break L4;
              } else {
                var7 = var8;
                break L4;
              }
            }
            L5: {
              var8 = fh.field_g.b(var5);
              if (var8 > var7) {
                var7 = var8;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var8 = fh.field_g.b(var6);
              if (var8 > var7) {
                var7 = var8;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var8 = var7 / 2 + 25;
              if (40 > mj.field_d) {
                stackIn_26_0 = -mj.field_d + 40;
                break L7;
              } else {
                stackIn_26_0 = 0;
                break L7;
              }
            }
            L8: {
              fc.a(stackIn_26_0, -var8 + 320, var8 + 321, 405, true, 29788, true, 6324320, 3162160, 0, 195, true);
              if (20 <= mj.field_d) {
                stackIn_30_0 = 0;
                break L8;
              } else {
                stackIn_30_0 = (20 + -mj.field_d) * 2;
                break L8;
              }
            }
            L9: {


              stackIn_33_1 = 240;

              stackIn_33_2 = 400;

              stackIn_33_3 = 289;

              stackIn_33_4 = 1;

              stackIn_33_5 = 29788;

              stackIn_33_6 = 0;

              if (-1 == (di.field_d.field_h ^ -1)) {

                stackIn_34_1 = stackIn_33_1;
                stackIn_34_2 = stackIn_33_2;
                stackIn_34_3 = stackIn_33_3;
                stackIn_34_4 = stackIn_33_4;
                stackIn_34_5 = stackIn_33_5;
                stackIn_34_6 = stackIn_33_6;
                stackIn_34_7 = 16777215;
                break L9;
              } else {

                stackIn_34_1 = stackIn_33_1;
                stackIn_34_2 = stackIn_33_2;
                stackIn_34_3 = stackIn_33_3;
                stackIn_34_4 = stackIn_33_4;
                stackIn_34_5 = stackIn_33_5;
                stackIn_34_6 = stackIn_33_6;
                stackIn_34_7 = 6340704;
                break L9;
              }
            }
            L10: {
















              if (di.field_d.field_h == 0) {








                stackIn_38_8 = 8421504;
                break L10;
              } else {








                stackIn_38_8 = 3170352;
                break L10;
              }
            }
            L11: {
              fc.a(stackIn_30_0, stackIn_34_1, stackIn_34_2, stackIn_34_3, stackIn_34_4 != 0, stackIn_34_5, stackIn_34_6 != 0, stackIn_34_7, stackIn_38_8, 1, 262, param0);
              if (mj.field_d >= 30) {
                stackIn_42_0 = 0;
                break L11;
              } else {
                stackIn_42_0 = 2 * (30 - mj.field_d);
                break L11;
              }
            }
            L12: {


              stackIn_45_1 = 280;

              stackIn_45_2 = 360;

              stackIn_45_3 = 359;

              stackIn_45_4 = 1;

              stackIn_45_5 = 29788;

              stackIn_45_6 = 0;

              if (-2 == (di.field_d.field_h ^ -1)) {

                stackIn_46_1 = stackIn_45_1;
                stackIn_46_2 = stackIn_45_2;
                stackIn_46_3 = stackIn_45_3;
                stackIn_46_4 = stackIn_45_4;
                stackIn_46_5 = stackIn_45_5;
                stackIn_46_6 = stackIn_45_6;
                stackIn_46_7 = 16777215;
                break L12;
              } else {

                stackIn_46_1 = stackIn_45_1;
                stackIn_46_2 = stackIn_45_2;
                stackIn_46_3 = stackIn_45_3;
                stackIn_46_4 = stackIn_45_4;
                stackIn_46_5 = stackIn_45_5;
                stackIn_46_6 = stackIn_45_6;
                stackIn_46_7 = 6340704;
                break L12;
              }
            }
            L13: {
















              if (di.field_d.field_h == 1) {








                stackIn_50_8 = 8421504;
                break L13;
              } else {








                stackIn_50_8 = 3170352;
                break L13;
              }
            }
            L14: {
              fc.a(stackIn_42_0, stackIn_46_1, stackIn_46_2, stackIn_46_3, stackIn_46_4 != 0, stackIn_46_5, stackIn_46_6 != 0, stackIn_46_7, stackIn_50_8, 2, 332, false);
              pb.a(4);
              fh.field_g.c(var2, 320, 235, 10551200, -1);
              fh.field_g.c(var4, 320, 255, 10551200, -1);
              stackIn_53_0 = 285;

              stackIn_53_1 = cn.field_e;

              if ((di.field_d.field_h ^ -1) != -1) {
                stackIn_54_0 = stackIn_53_0;
                stackIn_54_1 = (String) ((Object) stackIn_53_1);
                stackIn_54_2 = 6340704;
                break L14;
              } else {
                stackIn_54_0 = stackIn_53_0;
                stackIn_54_1 = (String) ((Object) stackIn_53_1);
                stackIn_54_2 = 16777215;
                break L14;
              }
            }
            L15: {
              lb.a(stackIn_54_0, stackIn_54_1, stackIn_54_2, -128, 320);
              fh.field_g.c(var5, 320, 325, 10551200, -1);
              stackIn_57_0 = 355;

              stackIn_57_1 = sj.field_j;

              if (di.field_d.field_h == 1) {
                stackIn_58_0 = stackIn_57_0;
                stackIn_58_1 = (String) ((Object) stackIn_57_1);
                stackIn_58_2 = 16777215;
                break L15;
              } else {
                stackIn_58_0 = stackIn_57_0;
                stackIn_58_1 = (String) ((Object) stackIn_57_1);
                stackIn_58_2 = 6340704;
                break L15;
              }
            }
            lb.a(stackIn_58_0, stackIn_58_1, stackIn_58_2, -118, 320);
            fh.field_g.c(var6, 320, 385, 10551200, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "EscapeVector.UA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
            this.a("escapevector", 640, 12);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.init()");
        }
    }

    final void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.a(0, 11, 8, 7, 21, (byte) -99, false, 9);
              ie.a(22050, true, 10);
              bj.field_C = ie.a(g.field_r, (java.awt.Component) ((Object) of.field_d), 0, 1024);
              ig.field_l = ie.a(g.field_r, (java.awt.Component) ((Object) of.field_d), 1, 22050);
              rk.field_e = new hj();
              bj.field_C.b(rk.field_e);
              pl.field_n = new hj();
              ec.field_a = new wb(pl.field_n);
              ec.field_a.d(0.9399999976158142f);
              ec.field_a.b(14.826103210449219f);
              rk.field_e.a(ec.field_a);
              nb.field_c = new hj();
              ma.field_b = new wb(nb.field_c);
              if (param0 == -97) {
                break L1;
              } else {
                EscapeVector.a((String) null, 31, 49, (byte) 88);
                break L1;
              }
            }
            ma.field_b.d(0.9399999976158142f);
            ma.field_b.b(14.826103210449219f);
            ig.field_l.b(ma.field_b);
            this.a(true, (byte) -35, true, true, true);
            ua.field_c = new kg();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.P(" + param0 + ')');
        }
    }

    public EscapeVector() {
    }

    private final void p(int param0) {
        try {
            mb.field_f[0] = fe.a("", fi.field_j, "sprites_fuel", true);
            mb.field_f[1] = fe.a("", fi.field_j, "sprites_crate", true);
            mb.field_f[2] = fe.a("", fi.field_j, "sprites_turret", true);
            mb.field_f[3] = fe.a("", fi.field_j, "sprites_magnet", true);
            mb.field_f[4] = fe.a("", fi.field_j, "sprites_repeller", true);
            mb.field_f[5] = fe.a("", fi.field_j, "sprites_tnt", true);
            mb.field_f[6] = fe.a("", fi.field_j, "sprites_laser_left", true);
            int var2_int = -111 / ((60 - param0) / 58);
            mb.field_f[7] = fe.a("", fi.field_j, "sprites_laser_right", true);
            mb.field_f[8] = fe.a("", fi.field_j, "sprites_barrier", true);
            mb.field_f[9] = fe.a("", fi.field_j, "sprites_powerup_shield", true);
            mb.field_f[10] = fe.a("", fi.field_j, "sprites_powerup_triple_shot", true);
            mb.field_f[11] = fe.a("", fi.field_j, "sprites_powerup_thrust", true);
            mb.field_f[12] = fe.a("", fi.field_j, "sprites_powerup_one_rockbuster", true);
            mb.field_f[13] = fe.a("", fi.field_j, "sprites_powerup_five_rockbusters", true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.MB(" + param0 + ')');
        }
    }

    private final void q(int param0) {
        tj var2 = null;
        int var4 = 0;
        int stackIn_37_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var4 = field_A;
        try {
          L0: {
            var2 = qa.f((byte) -49);
            if (param0 == 1) {
              L1: {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    if (var2.field_l) {
                      break L2;
                    } else {
                      L3: {
                        if ((lf.field_H ^ -1) == -2) {
                          break L3;
                        } else {
                          vc.a(40, ul.field_O, true, (byte) -101);
                          lf.field_H = 1;
                          break L3;
                        }
                      }
                      if (-1 + var2.field_g.length > var2.field_E) {
                        break L1;
                      } else {
                        if (var2.field_C == var2.field_B) {
                          wa.a(40 * var2.field_t / 100, 32471);
                          if (var4 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                L4: {
                  L5: {
                    if (null != var2) {
                      break L5;
                    } else {
                      if (ma.field_a != null) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (0 == lf.field_H) {
                    break L1;
                  } else {
                    vc.a(64, fj.field_eb, true, (byte) -63);
                    lf.field_H = 0;
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  if ((lf.field_H ^ -1) == -3) {
                    stackIn_37_0 = 0;
                    break L6;
                  } else {
                    stackIn_37_0 = 1;
                    break L6;
                  }
                }
                L7: {
                  var3 = stackIn_37_0;
                  if (ma.field_a == null) {
                    break L7;
                  } else {
                    ma.field_a.e(var3 != 0, 0);
                    break L7;
                  }
                }
                lf.field_H = 2;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "EscapeVector.EB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(String param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            fh.field_g.c(param0, -1 + param1, -1 + param2, 0, -1, 64);
            fh.field_g.c(param0, 1 + param1, -1 + param2, 0, -1, 64);
            fh.field_g.c(param0, -1 + param1, param2 - -1, 0, -1, 64);
            fh.field_g.c(param0, 1 + param1, 1 + param2, 0, -1, 64);
            var4_int = 71 % ((52 - param3) / 53);
            fh.field_g.a(param0, param1, param2, 16777215, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("EscapeVector.JB(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void g(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.m((byte) 29);
                break L1;
              }
            }
            km.field_k = fe.a("", fi.field_j, "classic_level_select_bg", true);
            aj.field_c = fe.a("", fi.field_j, "vengeance_level_select_bg", true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.VA(" + param0 + ')');
        }
    }

    private final void a(byte param0, hh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
                        if (param0 < -17) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a((byte) -2);
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
                        if (3 <= var3_int) {
                            statePc = 15;
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
                        var4 = var3_int + 14;
                        sf.field_e[var4] = param1;
                        var3_int++;
                        if (var5 != 0) {
                            statePc = 15;
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
                        if (var5 == 0) {
                            statePc = 4;
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_13_0 = (RuntimeException) (runtimeException);
                    stackIn_11_0 = stackIn_13_0;
                    stackIn_13_1 = new StringBuilder().append("EscapeVector.KB(").append(param0).append(',');
                    stackIn_11_1 = stackIn_13_1;
                    if (param1 == null) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_14_2 = "{...}";
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_14_2 = "null";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
                }
                case 15: {
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
            throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.IB(" + param0 + ')');
        }
    }

    static {
        field_z = "Members' Expansion";
    }
}
