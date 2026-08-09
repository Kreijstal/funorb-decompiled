/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vb extends kf implements jl {
    private qf field_W;
    static ji field_S;
    static boolean field_Z;
    static int[] field_X;
    static String[] field_U;
    static int field_V;
    static String field_Y;
    static String field_T;

    abstract int i(int param0);

    public static void j(int param0) {
        field_X = null;
        field_U = null;
        field_S = null;
        if (param0 > -17) {
            vb.j(-12);
        }
        field_Y = null;
        field_T = null;
    }

    abstract boolean k(int param0);

    final static void g(byte param0) {
        if (param0 != 105) {
            field_Z = true;
        }
        String var2 = (String) null;
        qf.a("", -99, (String) null);
    }

    public final nb a(int param0) {
        if (param0 > -86) {
            vb.j(-30);
        }
        return (nb) ((Object) this.field_W);
    }

    abstract int f(byte param0);

    void a(byte param0, qf param1) {
        try {
            if (param0 < 74) {
                field_S = (ji) null;
            }
            this.field_W = param1;
            this.field_W.field_g = (vb) (this);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "vb.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        int stackIn_4_0 = 0;
        w stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        w stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        w stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_19_0 = 0;
        qd stackIn_34_0 = null;
        int stackIn_48_0 = 0;
        qd stackIn_52_0 = null;
        qd stackIn_71_0 = null;
        Object stackIn_76_0 = null;
        int stackIn_77_0 = 0;
        qd stackOut_33_0;
        qd stackOut_51_0;
        qd stackOut_70_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        w var8_ref_w = null;
        qd var9 = null;
        int var9_int = 0;
        qd var10_ref_qd = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        w var14 = null;
        w var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        wj.field_Lb = hk.field_j;
                        vk.field_f = hk.field_i;
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = bf.field_r;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = tg.field_e;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        qf.a(stackIn_4_0, 97);
                        je.field_f.a(-42 + ee.field_i.field_N, ee.field_i.field_mb, 0, param1 + 117, 0);
                        he.field_jb.a(in.field_o.field_mb, param1 ^ -2, 0, kf.field_O, 0);
                        stackIn_6_0 = kl.field_r;
                        stackIn_5_0 = stackIn_6_0;
                        stackIn_6_1 = in.field_o.field_mb;
                        stackIn_5_1 = stackIn_6_1;
                        if (!pd.field_a) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_7_0 = (w) ((Object) stackIn_5_0);
                        stackIn_7_1 = stackIn_5_1;
                        stackIn_7_2 = 2 + (40 + vh.field_e - -2);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = (w) ((Object) stackIn_6_0);
                        stackIn_7_1 = stackIn_6_1;
                        stackIn_7_2 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((w) (Object) stackIn_7_0).a(stackIn_7_1 - stackIn_7_2, 0, 2 + kf.field_O, 18, 0);
                        ea.field_A.a(42 - -vh.field_e, 0, kf.field_O - param1, 18, -40 + (-2 + in.field_o.field_mb - vh.field_e));
                        tb.field_b.a(6, kf.field_O + 22, vh.field_e, 0, -2 + (-kf.field_O + in.field_o.field_N) - 20, in.field_o.field_mb, 2);
                        ma.field_G.a(ee.field_i.field_mb, 0, -40 + ee.field_i.field_N, 40, 0);
                        fl.field_b.a(oh.field_d.field_mb, 0, 0, 30, 0);
                        qm.field_a.a(oh.field_d.field_mb, 0, 30, -2 + oh.field_d.field_N + -70, 0);
                        var2_int = j.field_b - -3;
                        if ((b.field_P.length ^ -1) <= -3) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int--;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!param0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int--;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3 = (-10 + (-5 + (qm.field_a.field_N - 5) - -2 + (var2_int - -1) / 2)) / (1 + var2_int) - 2;
                        if ((var3 ^ -1) < -31) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = 30;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4 = -((2 + var3) * var2_int) + -5 + qm.field_a.field_N - 5;
                        if (-41 <= (var4 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4 = 40;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        li.field_d.a(-5 + qm.field_a.field_mb - 5, 0, 5, var4, 5);
                        var5 = var4 + 5 - -2;
                        var6 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var6 >= 4 + j.field_b) {
                            statePc = 75;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_77_0 = 1;
                        stackIn_19_0 = stackIn_77_0;
                        if (var13 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 != var6) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((b.field_P.length ^ -1) <= -3) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var13 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (3 != var6) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (mg.field_Vb <= 1) {
                            statePc = 74;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var6 == 3) {
                            statePc = 68;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (!param0) {
                            statePc = 38;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var6 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var14 = um.field_c[var6];
                        um.field_c[var6].field_N = 0;
                        var14.field_mb = 0;
                        var8 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (qa.field_v[var6].length <= var8) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = qa.field_v[var6][var8];
                        stackIn_76_0 = stackOut_33_0;
                        stackIn_34_0 = stackOut_33_0;
                        if (var13 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 == null) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = qa.field_v[var6][var8];
                        qa.field_v[var6][var8].field_N = 0;
                        var9.field_mb = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var8++;
                        if (var13 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var13 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (param0) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_48_0 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var6 >= 4) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_48_0 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (null != bn.field_f) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_48_0 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (bn.field_f[-4 + var6]) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_48_0 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_48_0 = 1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var7 = stackIn_48_0;
                        if (var7 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var8_ref_w = um.field_c[var6];
                        um.field_c[var6].field_N = 0;
                        var8_ref_w.field_mb = 0;
                        var9_int = 0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (qa.field_v[var6].length <= var9_int) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = qa.field_v[var6][var9_int];
                        stackIn_76_0 = stackOut_51_0;
                        stackIn_52_0 = stackOut_51_0;
                        if (var13 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 == null) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var10_ref_qd = qa.field_v[var6][var9_int];
                        qa.field_v[var6][var9_int].field_N = 0;
                        var10_ref_qd.field_mb = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var9_int++;
                        if (var13 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var13 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        um.field_c[var6].a(103, 0, var5, var3, 5);
                        var8 = 110;
                        if (!param0) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        qa.field_v[var6][0].a(var3, 2, var8, var5, 38, j.field_c, 500);
                        var8 += 40;
                        if (var13 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (qa.field_v[var6][0] == null) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var9 = qa.field_v[var6][0];
                        qa.field_v[var6][0].field_N = 0;
                        var9.field_mb = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var9_int = 2 + (-var8 + -5) + oh.field_d.field_mb;
                        var10 = qa.field_v[var6].length - 1;
                        var11 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var10 <= var11) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var12 = var9_int * var11 / var10;
                        qa.field_v[var6][var11 - -1].a(var3, 2, var8 + var12, var5, -var12 + ((1 + var11) * var9_int / var10 + -2), j.field_c, param1 + 502);
                        var11++;
                        if (var13 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var13 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var5 = var5 + (2 + var3);
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var13 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var15 = um.field_c[var6];
                        um.field_c[var6].field_N = 0;
                        var15.field_mb = 0;
                        var8 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (qa.field_v[var6].length <= var8) {
                            statePc = 74;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackOut_70_0 = qa.field_v[var6][var8];
                        stackIn_76_0 = stackOut_70_0;
                        stackIn_71_0 = stackOut_70_0;
                        if (var13 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (stackIn_71_0 == null) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var9 = qa.field_v[var6][var8];
                        qa.field_v[var6][var8].field_N = 0;
                        var9.field_mb = 0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var8++;
                        if (var13 == 0) {
                            statePc = 69;
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
                        var6++;
                        if (var13 == 0) {
                            statePc = 17;
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
                        mn.field_e.a(360, param1 ^ -2, 10, -10 + (-120 + hk.field_i + -14), hk.field_j + -360 >> 1115655457);
                        ie.field_a.a(mn.field_e.field_mb, 0, 0, 24, 0);
                        cl.field_C.a(mn.field_e.field_mb, 0, 24, mn.field_e.field_N - 24, 0);
                        cl.field_C.field_lb = ea.a(1, -20982, 3, cl.field_C.field_N, 8421504, 11579568);
                        gg.field_y.a(-10 + cl.field_C.field_mb, 0, 5, -10 + cl.field_C.field_N + -24 - 2, 5);
                        stackIn_76_0 = qc.field_q;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        ((w) (Object) stackIn_76_0).a(80, 0, -29 + cl.field_C.field_N, 24, (-80 + cl.field_C.field_mb) / 2);
                        stackIn_77_0 = -81;
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
                        bf.c((byte) stackIn_77_0);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 79: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var2), "vb.G(" + param0 + ',' + param1 + ')');
                }
                case 80: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    vb(int param0, int param1, int param2, int param3, gl param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 1;
              if (!param2) {
                break L1;
              } else {
                field_X = (int[]) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (param1 <= 1) {
                    break L4;
                  } else {
                    stackIn_9_0 = 1 & param1;

                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_9_0 == 0) {
                          break L5;
                        } else {
                          var3_int = var3_int * param0;
                          break L5;
                        }
                      }
                      param0 = param0 * param0;
                      param1 = param1 >> 1;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_9_0 = -2;
                break L3;
              }
              if (stackIn_9_0 != (param1 ^ -1)) {
                stackIn_13_0 = var3_int;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_11_0 = param0 * var3_int;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "vb.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static String a(char param0, int param1, int param2) {
        char[] var3;
        int var4;
        int var5;
        char[] var6;
        L0: {
          var5 = client.field_A ? 1 : 0;
          var6 = new char[param1];
          var3 = var6;
          if (param2 == -12681) {
            break L0;
          } else {
            field_X = (int[]) null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= param1) {
              break L2;
            } else {
              var6[var4] = param0;
              var4++;
              if (var5 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          return new String(var6);
        }
    }

    abstract int b(boolean param0);

    static {
        field_T = "Show tutorial again";
        field_Y = "To Customer Support";
        field_X = new int[]{2, 1, 2, 3, 2, 10, 2, 10, 3, 5, 5, 1, 1, 2, 5, 2, 3, 10, 1, 2, 5, 3, 5, 5, 1, 1, 1, 1, 2, 2, 3};
    }
}
