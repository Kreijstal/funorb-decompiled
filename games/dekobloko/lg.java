/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends kf implements vn {
    static se field_Y;
    private ek field_V;
    private ek field_S;
    private ek field_X;
    static int field_W;
    static String field_T;
    static int field_U;

    public lg() {
        super(0, 0, 476, 225, (gl) null);
        this.field_X = new ek(i.field_f, (kg) null);
        this.field_S = new ek(ec.field_q, (kg) null);
        this.field_V = new ek(ic.field_b, (kg) null);
        fk var1 = new fk();
        this.field_X.field_p = (gl) ((Object) var1);
        this.field_S.field_p = (gl) ((Object) var1);
        this.field_V.field_p = (gl) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -176982079;
        this.field_S.b(30, var4, -var3 + this.field_t >> 389726337, -var2 + (this.field_y - 48), -16555);
        this.field_V.b(30, var4, var4 + ((-var3 + this.field_t >> 485816257) + var2), -48 + (this.field_y - var2), -16555);
        this.field_X.b(30, var3, this.field_t + -var3 >> -18885599, -(2 * var2) + -78 + this.field_y, -16555);
        this.field_S.field_v = (kg) (this);
        this.field_X.field_v = (kg) (this);
        this.field_X.field_B = tm.field_h;
        this.field_V.field_v = (kg) (this);
        this.field_V.field_B = kh.field_c;
        this.b(this.field_S, (byte) -55);
        this.b(this.field_X, (byte) -55);
        this.b(this.field_V, (byte) -55);
    }

    public static void f(byte param0) {
        if (param0 != 1) {
            field_T = (String) null;
            field_T = null;
            field_Y = null;
            return;
        }
        field_T = null;
        field_Y = null;
    }

    final static int a(int param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_85_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        sc.field_n = sc.field_n + 65536;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (um.a(dk.field_c, sc.field_n, param0 + 11469) < 65536) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        sc.field_n = sc.field_n - dk.field_c;
                        stackIn_7_0 = rb.field_b + 1;
                        stackIn_4_0 = stackIn_7_0;
                        if (var5 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        rb.field_b = stackIn_4_0;
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = -1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_int = stackIn_7_0;
                        if (null != d.field_h) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (vi.field_z == null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2_int = vi.field_z.length;
                        if (var5 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int = d.field_h.length;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-1 == var2_int) {
                            statePc = 33;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (ac.field_F >= dk.field_g) {
                            statePc = 22;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ac.field_F = ac.field_F + 1;
                        if (dk.field_i >= ac.field_F) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (null == d.field_h) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (d.field_h[wh.field_a] == null) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (ac.field_F < dk.field_g) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (d.field_h[(1 + wh.field_a) % var2_int] == null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ac.field_F = ac.field_F - 1;
                        if (var5 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ac.field_F = ac.field_F - 1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (dk.field_g > ac.field_F) {
                            statePc = 30;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        bh.field_m = wh.field_a;
                        if (lb.field_b) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        wh.field_a = wh.field_a - 1;
                        if (wh.field_a >= 0) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        wh.field_a = wh.field_a + var2_int;
                        if (var5 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        wh.field_a = wh.field_a + 1;
                        if (wh.field_a < var2_int) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        wh.field_a = wh.field_a - var2_int;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ac.field_F = ac.field_F - dk.field_g;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (dk.field_i < ac.field_F) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        lb.field_b = true;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (ge.field_h == null) {
                            statePc = 56;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var3 = -(ge.field_h.field_C / 2) + 357;
                        var4 = 0;
                        if (ig.field_Yb == 0) {
                            statePc = 44;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (nf.field_h <= var3) {
                            statePc = 44;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (nf.field_h < ge.field_h.field_H + var3) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (he.field_S <= 269 + -ge.field_h.field_I) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (he.field_S >= 269) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        lb.field_b = false;
                        var4 = 1;
                        ac.field_F = dk.field_g;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-587 <= (he.field_S ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (he.field_S >= ge.field_h.field_I + 586) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        lb.field_b = true;
                        var4 = 1;
                        ac.field_F = dk.field_g;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var4 != 0) {
                            statePc = 56;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (ac.field_F <= dk.field_i) {
                            statePc = 56;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var3 >= pm.field_f) {
                            statePc = 56;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (pm.field_f < ge.field_h.field_H + var3) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (269 - ge.field_h.field_I >= bh.field_g) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (bh.field_g >= 269) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ac.field_F = dk.field_i;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (-587 <= (bh.field_g ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (bh.field_g < 586 - -ge.field_h.field_I) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ac.field_F = dk.field_i;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (param0 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackIn_58_0 = 81;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 58: {
                    return stackIn_58_0;
                }
                case 59: {
                    try {
                        if (!param1) {
                            statePc = 84;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                        if (rg.field_a.b((byte) 114)) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (-1 == (rg.field_a.field_h ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_65_0 = 3;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 65: {
                    return stackIn_65_0;
                }
                case 66: {
                    try {
                        if ((rg.field_a.field_h ^ -1) == -2) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_69_0 = 2;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 69: {
                    return stackIn_69_0;
                }
                case 70: {
                    stackIn_72_0 = -125;
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    try {
                        stackIn_72_0 = -125;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (!ab.c((byte) stackIn_72_0)) {
                            statePc = 84;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        rg.field_a.a((byte) 58, 0);
                        if (!rg.field_a.b((byte) 114)) {
                            statePc = 80;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (rg.field_a.field_h != 0) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackIn_76_0 = 3;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 76: {
                    return stackIn_76_0;
                }
                case 77: {
                    try {
                        if (1 != rg.field_a.field_h) {
                            statePc = 80;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackIn_79_0 = 1;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 79: {
                    return stackIn_79_0;
                }
                case 80: {
                    try {
                        if (wh.field_c != 13) {
                            statePc = 71;
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
                        stackIn_82_0 = 1;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 82: {
                    stackIn_85_0 = stackIn_82_0;
                    stackIn_83_0 = stackIn_85_0;
                    if (var5 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    return stackIn_83_0;
                }
                case 84: {
                    try {
                        stackIn_85_0 = 0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 85: {
                    return stackIn_85_0;
                }
                case 86: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var2), "lg.F(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        if (param0 != 8927) {
            field_Y = (se) null;
            hm.a(4, (byte) -111);
            return;
        }
        hm.a(4, (byte) -111);
    }

    final static void a(boolean param0, int param1) {
        if (param1 <= -101) {
          if (null == kb.field_i) {
            return;
          } else {
            hk.d(hk.field_c, hk.field_h, hk.field_g + -hk.field_c, hk.field_b - hk.field_h);
            kb.field_i.a(1141039778, param0);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        if (param1 >= -103) {
          field_W = 48;
          var5 = param0 + this.field_u;
          var6 = this.field_D - -param3;
          hh.field_e.a(hh.field_c, var5 - -20, var6 + 20, this.field_t - 40, this.field_y + -50, 16777215, -1, 1, 0, hh.field_e.field_R);
          super.a(param0, -109, param2, param3);
          return;
        } else {
          var5 = param0 + this.field_u;
          var6 = this.field_D - -param3;
          hh.field_e.a(hh.field_c, var5 - -20, var6 + 20, this.field_t - 40, this.field_y + -50, 16777215, -1, 1, 0, hh.field_e.field_R);
          super.a(param0, -109, param2, param3);
          return;
        }
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_S == param2) {
                  break L2;
                } else {
                  L3: {
                    if (param2 != this.field_X) {
                      break L3;
                    } else {
                      ha.e(0);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (this.field_V != param2) {
                    break L1;
                  } else {
                    rk.c(false);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              vb.g((byte) 105);
              break L1;
            }
            if (param0 == 67) {
              break L0;
            } else {
              field_T = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("lg.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(95, param1, param2, param3)) {
              if ((param1 ^ -1) != -99) {
                if (-100 != (param1 ^ -1)) {
                  var5_int = 86 / ((param0 - -22) / 49);
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = this.a(32, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a(param2, (byte) -74);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("lg.QA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    static {
        field_T = "Discard";
        field_U = -1;
    }
}
