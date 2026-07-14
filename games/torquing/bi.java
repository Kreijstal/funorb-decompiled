/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static pc field_f;
    private boolean field_t;
    static String field_u;
    ei field_e;
    static String field_I;
    static int field_p;
    ei field_B;
    int field_n;
    private int field_j;
    private int[] field_m;
    private double field_h;
    private int field_E;
    kh field_i;
    private tl[] field_D;
    private int field_S;
    private int field_U;
    private int field_o;
    private int field_F;
    private double field_K;
    private int field_N;
    private String field_T;
    vg field_P;
    private boolean field_w;
    private sg field_C;
    private int field_H;
    private kg[] field_Q;
    int field_s;
    int field_L;
    private int field_r;
    private int field_x;
    private int field_l;
    private int field_G;
    private int field_c;
    private Torquing field_A;
    private int field_M;
    hc field_d;
    private int[] field_a;
    private int field_v;
    private boolean field_g;
    private int field_k;
    private boolean field_y;
    int[] field_b;
    int field_z;
    int field_q;
    private boolean field_J;

    private final void h(int param0) {
        RuntimeException var2 = null;
        tl[] var2_array = null;
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
        int var5_int = 0;
        pj var5 = null;
        kh[] var6_ref_kh__ = null;
        int var6 = 0;
        int var7 = 0;
        kh var8 = null;
        int var9 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_21_0 = 0;
        kh stackIn_25_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        kh stackIn_43_0 = null;
        Object stackIn_47_0 = null;
        boolean stackOut_3_0 = false;
        int stackOut_9_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_20_0 = 0;
        kh stackOut_24_0 = null;
        Object stackOut_38_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        kh stackOut_42_0 = null;
        Object stackOut_46_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        fd.a(-109);
                        re.field_d[1] = 80.0;
                        ((bi) this).field_x = 0;
                        re.field_d[0] = 0.0;
                        var2_array = ((bi) this).field_d.field_q;
                        ((bi) this).field_D = new tl[var2_array.length];
                        dk.a((Object[]) (Object) var2_array, 0, (Object[]) (Object) ((bi) this).field_D, 0, ((bi) this).field_D.length);
                        var3 = 0;
                        var4_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var4_int ^ -1) <= (((bi) this).field_D.length ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = ((bi) this).field_D[var4_int].f(25468);
                        stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var9 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!stackIn_4_0) {
                            statePc = 8;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3++;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4_int++;
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((bi) this).field_m = new int[var3];
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4_int = stackIn_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4_int >= ((bi) this).field_D.length) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = ((bi) this).field_D[var4_int].f(25468);
                        stackIn_21_0 = stackOut_12_0 ? 1 : 0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var9 != 0) {
                            statePc = 21;
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
                        if (!stackIn_13_0) {
                            statePc = 19;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3--;
                        ((bi) this).field_m[var3] = var4_int;
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
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4_int++;
                        if (var9 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((bi) this).field_C = ((bi) this).field_P.a(-63, ((bi) this).field_d);
                        ((bi) this).field_P.b(0, ((bi) this).field_i);
                        stackOut_20_0 = 12;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        int[] array$1 = new int[stackIn_21_0];
                        array$1[0] = 0;
                        array$1[1] = 0;
                        array$1[2] = 0;
                        array$1[3] = 65536;
                        array$1[4] = 0;
                        array$1[5] = 0;
                        array$1[6] = 0;
                        array$1[7] = 65536;
                        array$1[8] = 0;
                        array$1[9] = 0;
                        array$1[10] = 0;
                        array$1[11] = 65536;
                        var4 = array$1;
                        var5_int = 42 % ((-34 - param0) / 44);
                        var6_ref_kh__ = vc.field_c;
                        var7 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var7 >= var6_ref_kh__.length) {
                            statePc = 31;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var8 = var6_ref_kh__[var7];
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = (kh) var8;
                        stackIn_43_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var9 != 0) {
                            statePc = 43;
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
                        if (stackIn_25_0 != null) {
                            statePc = 29;
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
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((bi) this).field_C.a(var8, var4);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7++;
                        if (var9 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var5_int = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var5_int >= ((bi) this).field_C.field_y) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ((bi) this).field_C.a(var5_int, 80, 1365, -1, -12, 12);
                        var5_int++;
                        if (var9 != 0) {
                            statePc = 38;
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
                        if (var9 == 0) {
                            statePc = 32;
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
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.a(false, 0);
                        ((bi) this).field_w = false;
                        ((bi) this).field_T = ki.a("ff9040", "ffffff", 93, ((bi) this).field_T);
                        ((bi) this).field_z = 0;
                        ((bi) this).field_k = ((bi) this).field_d.a(-31648);
                        ((bi) this).field_r = 3000;
                        ((bi) this).field_c = 0;
                        ((bi) this).field_v = ((bi) this).field_d.a(false);
                        int[] discarded$2 = ap.a(gj.field_i, il.field_m[((bi) this).field_v]);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = this;
                        stackIn_41_0 = stackOut_38_0;
                        stackIn_39_0 = stackOut_38_0;
                        if ((((bi) this).field_L ^ -1) != -19) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = this;
                        stackOut_39_1 = 1;
                        stackIn_42_0 = stackOut_39_0;
                        stackIn_42_1 = stackOut_39_1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = this;
                        stackOut_41_1 = 0;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((bi) this).field_y = stackIn_42_1 != 0;
                        ((bi) this).field_J = false;
                        ((bi) this).field_h = Double.NEGATIVE_INFINITY;
                        ((bi) this).field_K = -1.0;
                        stackOut_42_0 = ((bi) this).field_d.a(-100, false);
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var5 = stackIn_43_0.field_k;
                        var6 = var5.field_k + -1;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var6 < 0) {
                            statePc = 56;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var9 != 0) {
                            statePc = 56;
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
                        stackOut_46_0 = this;
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
                        if (((bi) this).field_h < re.field_d[1] * (double)var5.field_y[var6]) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((bi) this).field_h = re.field_d[1] * (double)var5.field_y[var6];
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var6--;
                        if (var9 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw rb.a((Throwable) (Object) var2, "bi.Q(" + param0 + 41);
                }
                case 56: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void g(int param0) {
        RuntimeException var2 = null;
        qk var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        tl[] var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_21_0 = 0;
        int stackIn_50_0 = 0;
        int[] stackIn_54_0 = null;
        Object stackIn_84_0 = null;
        Object stackIn_94_0 = null;
        tl[] stackIn_98_0 = null;
        tl[] stackIn_102_0 = null;
        int stackIn_111_0 = 0;
        int stackIn_115_0 = 0;
        int[] stackIn_162_0 = null;
        int[] stackIn_166_0 = null;
        int[] stackOut_14_0 = null;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_49_0 = 0;
        int[] stackOut_53_0 = null;
        Object stackOut_83_0 = null;
        Object stackOut_93_0 = null;
        tl[] stackOut_97_0 = null;
        tl[] stackOut_101_0 = null;
        int stackOut_110_0 = 0;
        int stackOut_114_0 = 0;
        int[] stackOut_161_0 = null;
        int[] stackOut_165_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_ref = new qk(0, ((bi) this).field_L, ((bi) this).field_N, ((bi) this).field_S, ((bi) this).field_F, ((bi) this).field_G);
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
                        if (!je.a((byte) 77)) {
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
                        bo.field_l.a((byte) 54, (q) (Object) var2_ref);
                        if (var9 == 0) {
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
                        le.a((byte) 83, 5, var2_ref);
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
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (1 + ((bi) this).field_L > nh.field_k) {
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
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        nh.field_k = ((bi) this).field_L - -1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (wi.field_a.length - 1 == ((bi) this).field_L) {
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
                        stackOut_14_0 = wi.field_a;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((stackIn_15_0[((bi) this).field_L + 1] ^ -1) == (wi.field_a[((bi) this).field_L] ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = 1;
                        stackIn_21_0 = stackOut_18_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3 = stackIn_21_0;
                        var4 = wi.field_a[((bi) this).field_L];
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var3 == 0) {
                            statePc = 82;
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
                        if (var4 == 1) {
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
                        if ((var4 ^ -1) == -3) {
                            statePc = 41;
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
                        if (var4 != 4) {
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
                        this.a(2, (byte) 78, 253);
                        if (var9 == 0) {
                            statePc = 47;
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
                        if (7 != var4) {
                            statePc = 47;
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
                        this.a(3, (byte) 125, 252);
                        if (var9 == 0) {
                            statePc = 47;
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
                        this.a(1, (byte) 9, 254);
                        if (var9 == 0) {
                            statePc = 47;
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
                        this.a(0, (byte) 83, 255);
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
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var5_int = ((bi) this).field_G & 63;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (-1 <= (var4 ^ -1)) {
                            statePc = 60;
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
                        stackOut_49_0 = var4;
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
                        if (stackIn_50_0 > wi.field_a[var5_int]) {
                            statePc = 59;
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
                        stackOut_53_0 = hg.field_d;
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
                        if ((stackIn_54_0[var5_int] ^ -1) == -1) {
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
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        this.a(4, (byte) 118, 251);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (0 == var5_int) {
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
                        statePc = 82;
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
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if ((var4 ^ -1) != -3) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        this.a(5, (byte) 71, 250);
                        if (var9 == 0) {
                            statePc = 82;
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
                        if (-5 == (var4 ^ -1)) {
                            statePc = 79;
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
                        if (var4 != 7) {
                            statePc = 82;
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
                        this.a(7, (byte) 112, 248);
                        if (-1 == ((bi) this).field_T.indexOf("ffffff")) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        this.a(13, (byte) 25, 242);
                        if (var9 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        this.a(6, (byte) 6, 249);
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
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (-1 >= ((bi) this).field_T.indexOf("ff9040")) {
                            statePc = 90;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackOut_83_0 = this;
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
                        if ((((bi) this).field_T.indexOf("ffffff") ^ -1) == 0) {
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
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        ((bi) this).field_l = ((bi) this).field_l + ((bi) this).field_U;
                        ((bi) this).field_U = ((bi) this).field_U * 2;
                        ((bi) this).field_s = ((bi) this).field_U;
                        this.a(12, (byte) 61, 243);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        ((bi) this).field_T = ki.a("ff9040", "ff0000", -104, ((bi) this).field_T);
                        var5 = ((bi) this).field_d.field_q;
                        var6 = 0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (((bi) this).field_D.length <= var6) {
                            statePc = 109;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var9 != 0) {
                            statePc = 148;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackOut_93_0 = null;
                        stackIn_94_0 = stackOut_93_0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (stackIn_94_0 != (Object) (Object) ((bi) this).field_D[var6]) {
                            statePc = 108;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackOut_97_0 = (tl[]) var5;
                        stackIn_98_0 = stackOut_97_0;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if ((stackIn_98_0[var6].field_r ^ -1) == -1) {
                            statePc = 108;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackOut_101_0 = (tl[]) var5;
                        stackIn_102_0 = stackOut_101_0;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (stackIn_102_0[var6].field_r == 7) {
                            statePc = 108;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        ((bi) this).field_b[wi.field_a[((bi) this).field_L]] = ((bi) this).field_b[wi.field_a[((bi) this).field_L]] + 1;
                        ((bi) this).field_G = ((bi) this).field_G + 4096;
                        ((bi) this).field_S = ((bi) this).field_S + (((bi) this).field_N << 114136940);
                        statePc = 106;
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
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var6++;
                        if (var9 == 0) {
                            statePc = 91;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (var3 == 0) {
                            statePc = 147;
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
                        stackOut_110_0 = var4;
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
                        if ((stackIn_111_0 ^ -1) == -2) {
                            statePc = 120;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        stackOut_114_0 = var4;
                        stackIn_115_0 = stackOut_114_0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if ((stackIn_115_0 ^ -1) == -4) {
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
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var6 = 0;
                        var7 = 0;
                        var8 = 0;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (var4 < var8) {
                            statePc = 127;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var7 = var7 + mh.field_k[var4];
                        var6 = var6 + ((bi) this).field_b[var4];
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var8++;
                        if (var9 != 0) {
                            statePc = 130;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (var9 == 0) {
                            statePc = 121;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (var6 >= var7 * 8 / 10) {
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
                        statePc = 137;
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
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (1 != var4) {
                            statePc = 134;
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
                        this.a(8, (byte) 33, 247);
                        if (var9 == 0) {
                            statePc = 137;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        this.a(10, (byte) 13, 245);
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (var7 == var6) {
                            statePc = 140;
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
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if ((var4 ^ -1) != -2) {
                            statePc = 144;
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
                        this.a(9, (byte) 23, 246);
                        if (var9 == 0) {
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
                        this.a(11, (byte) 24, 244);
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
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        dd.field_d = dd.field_d | ((bi) this).field_z;
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (-256 == (dd.field_d ^ -1)) {
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
                        statePc = 158;
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
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if (!ia.a(-22426, 0)) {
                            statePc = 155;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 154;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        this.a(16, (byte) 11, 239);
                        if (var9 == 0) {
                            statePc = 158;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        this.a(15, (byte) 30, 240);
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 174;
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
                        if (param0 >= 25) {
                            statePc = 160;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 159: {
                    return;
                }
                case 160: {
                    try {
                        if (-1 > (wp.field_w ^ -1)) {
                            statePc = 172;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        stackOut_161_0 = qc.field_ab;
                        stackIn_162_0 = stackOut_161_0;
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (stackIn_162_0.length <= 1) {
                            statePc = 172;
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
                case 165: {
                    try {
                        stackOut_165_0 = qc.field_ab;
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
                        if ((stackIn_166_0[1] + qc.field_ab[0] ^ -1) < (nh.field_k ^ -1)) {
                            statePc = 172;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        nh.field_k = -1 + (qc.field_ab[0] - -qc.field_ab[1]);
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        ((bi) this).field_J = true;
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 174: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw rb.a((Throwable) (Object) var2, "bi.T(" + param0 + 41);
                }
                case 175: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(int param0) {
        try {
            ((bi) this).field_w = true;
            if (param0 != -7045) {
                bi.a((java.applet.Applet) null, (byte) -76);
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bi.N(" + param0 + 41);
        }
    }

    final void b(byte param0, int param1) {
        try {
            ((bi) this).field_k = ((bi) this).field_k + param1;
            if (param0 < 120) {
                ((bi) this).field_k = -84;
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bi.I(" + param0 + 44 + param1 + 41);
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        ti[] var2_array = null;
        tl[] var2_array2 = null;
        int var2_int = 0;
        int var3 = 0;
        ti var4 = null;
        tl var4_ref = null;
        int var5 = 0;
        ti stackIn_7_0 = null;
        wl[] stackIn_37_0 = null;
        ti stackOut_6_0 = null;
        wl[] stackOut_36_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((bi) this).field_e.a(0);
                        if (null == ((bi) this).field_d.field_k) {
                            statePc = 14;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2_array = ((bi) this).field_d.field_k;
                        var3 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((var3 ^ -1) <= (var2_array.length ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4 = var2_array[var3];
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 != 0) {
                            statePc = 16;
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
                        stackOut_6_0 = (ti) var4;
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
                        if (stackIn_7_0 != null) {
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
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4.b((byte) 62);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param0 == 1) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        var2_array2 = ((bi) this).field_d.field_q;
                        var3 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var2_array2.length <= var3) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4_ref = var2_array2[var3];
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4_ref.field_c = -1;
                        var4_ref.field_h = null;
                        var3++;
                        if (var5 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var5 == 0) {
                            statePc = 17;
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
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (((bi) this).field_d.field_m != null) {
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
                        ((bi) this).b(param0 ^ 8);
                        ((bi) this).field_g = true;
                        ((bi) this).field_q = 9;
                        ((bi) this).field_d = ig.field_q;
                        la.field_k[9].a(true);
                        this.h(-83);
                        ((bi) this).field_r = 0;
                        if (var5 == 0) {
                            statePc = 46;
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
                        ((bi) this).field_d = ((bi) this).field_d.field_m;
                        ((bi) this).field_G = ((bi) this).field_G + 64;
                        ((bi) this).field_L = ((bi) this).field_L + 1;
                        ((bi) this).field_F = ((bi) this).field_F + (((bi) this).field_N << -961057594);
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
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var2_int = wi.field_a[((bi) this).field_L];
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((1 + var2_int ^ -1) != (((bi) this).field_q ^ -1)) {
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
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((bi) this).field_i = tp.field_a;
                        ((bi) this).field_q = var2_int + 1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (ri.field_E < 2) {
                            statePc = 42;
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
                        stackOut_36_0 = la.field_k;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (!((wl) (Object) stackIn_37_0[((bi) this).field_q]).e(17)) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
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
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        la.field_k[((bi) this).field_q].g();
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
                        this.h(67);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw rb.a((Throwable) (Object) var2, "bi.O(" + param0 + 41);
                }
                case 46: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static af a(sm param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        di stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        di stackOut_0_0 = null;
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
                        var2_int = -94 / ((23 - param1) / 43);
                        stackOut_0_0 = new di(param0);
                        stackIn_1_0 = stackOut_0_0;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return (af) (Object) stackIn_1_0;
                }
                case 2: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        stackOut_3_0 = (RuntimeException) var2;
                        stackOut_3_1 = new StringBuilder().append("bi.B(");
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
                    throw rb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        StringBuilder var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3 = new StringBuilder(((bi) this).field_T);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        StringBuilder discarded$2 = gd.a(-20980, var3, (CharSequence) (Object) "ff9040", 5 + 13 * param0);
                        ((bi) this).field_T = var3.toString();
                        if (param1 < -26) {
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
                        ((bi) this).field_Q = null;
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
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((bi) this).field_T.indexOf("ffffff") != -1) {
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
                        th.a(100, th.field_F[18]);
                        if (Torquing.field_u == 0) {
                            statePc = 12;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        th.a(100, th.field_F[17]);
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
                        th.a(100, th.field_F[19]);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw rb.a((Throwable) (Object) runtimeException, "bi.CA(" + param0 + 44 + param1 + 41);
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) {
        try {
            int var2_int = -38 % ((param0 - 62) / 48);
            ((bi) this).field_x = Math.max(10, ((bi) this).field_x);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bi.U(" + param0 + 41);
        }
    }

    final void a(byte param0, kh param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == -68) {
                            statePc = 4;
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
                        ((bi) this).b((byte) 62);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((bi) this).field_H = param3;
                        ((bi) this).field_E = param2;
                        ((bi) this).field_P.b(0, param1);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var5;
                        stackOut_7_1 = new StringBuilder().append("bi.D(").append(param0).append(44);
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
                    throw rb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 41);
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, sg param2, int param3) {
        kg var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        kg[] var7 = null;
        int var8 = 0;
        kg[] stackIn_4_0 = null;
        kg[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_9_0 = null;
        kg[] stackIn_18_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        kg[] stackOut_3_0 = null;
        kg[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_8_0 = null;
        kg[] stackOut_17_0 = null;
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
                    var8 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = new kg(param2, param3, param1);
                        var6 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((((bi) this).field_Q.length ^ -1) >= (var6 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = ((bi) this).field_Q;
                        stackIn_18_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var8 != 0) {
                            statePc = 18;
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
                        stackOut_4_0 = (kg[]) (Object) stackIn_4_0;
                        stackOut_4_1 = var6;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
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
                        if (stackIn_5_0[stackIn_5_1] == null) {
                            statePc = 14;
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
                        stackOut_8_0 = this;
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
                        if (((bi) this).field_Q[var6].field_a == null) {
                            statePc = 14;
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
                        statePc = 12;
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((bi) this).field_Q[var6] = var5;
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
                        var6++;
                        if (var8 == 0) {
                            statePc = 2;
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
                        var6 = ((bi) this).field_Q.length;
                        stackOut_17_0 = new kg[var6 - -1];
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7 = stackIn_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        dk.a((Object[]) (Object) ((bi) this).field_Q, 0, (Object[]) (Object) var7, 0, var6);
                        if (param0 == 538) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((bi) this).field_L = -15;
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
                        var7[var6] = var5;
                        ((bi) this).field_Q = var7;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var5_ref = (RuntimeException) (Object) caughtException;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        stackOut_26_0 = (RuntimeException) var5_ref;
                        stackOut_26_1 = new StringBuilder().append("bi.J(").append(param0).append(44).append(param1).append(44);
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
                    throw rb.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param3 + 41);
                }
                case 31: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_9_0 = 0;
        Object stackIn_13_0 = null;
        int stackIn_19_0 = 0;
        Torquing stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Torquing stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Torquing stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        Torquing stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Torquing stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Torquing stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Torquing stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackOut_8_0 = 0;
        Object stackOut_12_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        Torquing stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Torquing stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Torquing stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Torquing stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Torquing stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Torquing stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        Torquing stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == -103) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        af discarded$2 = bi.a((sm) null, -1);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((bi) this).b(9);
                        ((bi) this).field_g = true;
                        if (!je.a((byte) 77)) {
                            statePc = 25;
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
                        if (((bi) this).field_U != 0) {
                            statePc = 16;
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
                        stackOut_8_0 = -1;
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
                        if (stackIn_9_0 != (ao.field_f ^ -1)) {
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
                        stackOut_12_0 = this;
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
                        if (((bi) this).field_L == 0) {
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
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 1;
                        stackIn_19_0 = stackOut_16_0;
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
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var2_int = stackIn_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = ((bi) this).field_A;
                        stackOut_20_1 = 1;
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (var2_int == 0) {
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
                        stackOut_21_0 = (Torquing) (Object) stackIn_21_0;
                        stackOut_21_1 = stackIn_21_1;
                        stackOut_21_2 = 7;
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
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = (Torquing) (Object) stackIn_23_0;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((Torquing) (Object) stackIn_24_0).a(stackIn_24_1 != 0, stackIn_24_2, 1, false);
                        if (Torquing.field_u == 0) {
                            statePc = 34;
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
                        stackOut_25_0 = ((bi) this).field_A;
                        stackOut_25_1 = 1;
                        stackIn_30_0 = stackOut_25_0;
                        stackIn_30_1 = stackOut_25_1;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        if (ao.field_f == 0) {
                            statePc = 30;
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
                        stackOut_26_0 = (Torquing) (Object) stackIn_26_0;
                        stackOut_26_1 = stackIn_26_1;
                        stackIn_28_0 = stackOut_26_0;
                        stackIn_28_1 = stackOut_26_1;
                        statePc = 28;
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
                case 28: {
                    try {
                        stackOut_28_0 = (Torquing) (Object) stackIn_28_0;
                        stackOut_28_1 = stackIn_28_1;
                        stackOut_28_2 = 8;
                        stackIn_31_0 = stackOut_28_0;
                        stackIn_31_1 = stackOut_28_1;
                        stackIn_31_2 = stackOut_28_2;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = (Torquing) (Object) stackIn_30_0;
                        stackOut_30_1 = stackIn_30_1;
                        stackOut_30_2 = 2;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        stackIn_31_2 = stackOut_30_2;
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
                        ((Torquing) (Object) stackIn_31_0).a(stackIn_31_1 != 0, stackIn_31_2, 1, false);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw rb.a((Throwable) (Object) var2, "bi.G(" + param0 + 41);
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        tl[] var3 = null;
        int var4 = 0;
        tl var5 = null;
        pj var6 = null;
        int var7 = 0;
        Object stackIn_10_0 = null;
        int stackIn_14_0 = 0;
        Object stackOut_9_0 = null;
        int stackOut_13_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = ((bi) this).field_D;
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!param0) {
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
                        ((bi) this).field_v = 112;
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
                        statePc = 25;
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
                        if ((var4 ^ -1) <= (var3.length ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = var3[var4];
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 != 0) {
                            statePc = 26;
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
                        stackOut_9_0 = null;
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
                        if (stackIn_10_0 == (Object) (Object) var5) {
                            statePc = 21;
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
                        stackOut_13_0 = 31;
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
                        if (stackIn_14_0 == var5.field_r) {
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
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
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
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var6 = var5.d(-2).field_k;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        gq.a(var6.field_f, 4, param1);
                        gq.a(var6.field_s, 4, param1);
                        gq.a(var6.field_l, 4, param1);
                        if (var7 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4++;
                        if (var7 == 0) {
                            statePc = 6;
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
                        statePc = 26;
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
                case 25: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw rb.a((Throwable) (Object) runtimeException, "bi.AA(" + param0 + 44 + param1 + 41);
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static we a(fj param0, byte param1) {
        RuntimeException var2 = null;
        we stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        we stackOut_4_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 == 13) {
                            statePc = 4;
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
                        bi.a((java.applet.Applet) null, (byte) 44);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = new we(param0.g(65536), param0.g(65536), param0.g(65536), param0.g(65536), param0.e((byte) 62), param0.e((byte) 62), param0.i((byte) -101));
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var2;
                        stackOut_7_1 = new StringBuilder().append("bi.BA(");
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param0 == null) {
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
                    throw rb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 >= 77) {
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
                        field_f = null;
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
                        if (qm.a(param1, (byte) 45) == null) {
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
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        stackOut_10_0 = (RuntimeException) var2;
                        stackOut_10_1 = new StringBuilder().append("bi.F(").append(param0).append(44);
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (param1 == null) {
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
                    throw rb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        Object stackOut_1_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (0 != (((bi) this).field_T.indexOf("ffffff") ^ -1)) {
                            statePc = 8;
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
                        stackOut_1_0 = this;
                        stackIn_2_0 = stackOut_1_0;
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
                        if ((((bi) this).field_T.indexOf("ff9040") ^ -1) == 0) {
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
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param1 = param1 * 2;
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
                        ((bi) this).field_j = ((bi) this).field_j - param1;
                        ((bi) this).field_U = ((bi) this).field_U + param1;
                        ((bi) this).field_s = ((bi) this).field_U;
                        if (param0 >= 94) {
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
                        this.a(91, -43, (sg) null, 50);
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
                    var3 = (RuntimeException) (Object) caughtException;
                    throw rb.a((Throwable) (Object) var3, "bi.C(" + param0 + 44 + param1 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, double param1, double param2, sg param3, double param4, int param5) {
        RuntimeException var10 = null;
        Object stackIn_2_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        Object stackOut_1_0 = null;
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
                    try {
                        if (((bi) this).field_c < param5) {
                            statePc = 8;
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
                        stackOut_1_0 = this;
                        stackIn_2_0 = stackOut_1_0;
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
                        ((bi) this).field_c = ((bi) this).field_c - 1;
                        if ((((bi) this).field_c - 1 ^ -1) <= -1) {
                            statePc = 8;
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
                        ((bi) this).field_P.a(param5 + 80);
                        this.a(538, 16, param3, ((bi) this).field_P.field_c);
                        th.a(param5 ^ 100, th.field_F[14]);
                        th.a(100, th.field_F[15]);
                        if (Torquing.field_u == 0) {
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
                        th.a(100, th.field_F[16]);
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
                        ((bi) this).field_P.a(param1, param4, param5 + 1, param2);
                        this.a(538, 0, param3, param0);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var10 = (RuntimeException) (Object) caughtException;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) var10;
                        stackOut_14_1 = new StringBuilder().append("bi.L(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (param3 == null) {
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
                    throw rb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 44 + param5 + 41);
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        try {
            ((bi) this).field_c = ((bi) this).field_c + 1;
            if (param0 != 0) {
                ((bi) this).field_z = -49;
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bi.K(" + param0 + 41);
        }
    }

    final void f(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 1000) {
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
                        ((bi) this).field_G = 31;
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
                        ((bi) this).field_i = tp.field_a;
                        ((bi) this).field_c = 0;
                        ((bi) this).a((byte) -68, tp.field_a, 1365, 80);
                        ((bi) this).field_j = ((bi) this).field_j + ((bi) this).field_U;
                        if (ri.field_E < 2) {
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
                        var2_int = ((bi) this).field_G & 63;
                        ((bi) this).field_S = ((bi) this).field_S + (((bi) this).field_L - var2_int) * ((bi) this).field_N;
                        ((bi) this).field_G = ((bi) this).field_G + (((bi) this).field_L + -var2_int);
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
                        ((bi) this).field_U = 0;
                        this.h(-116);
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
                    throw rb.a((Throwable) (Object) var2, "bi.R(" + param0 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        bm var2_ref = null;
        int var3 = 0;
        Object stackIn_3_0 = null;
        wc stackIn_13_0 = null;
        Object stackIn_26_0 = null;
        bm stackIn_30_0 = null;
        bm stackIn_34_0 = null;
        Object stackOut_2_0 = null;
        wc stackOut_12_0 = null;
        Object stackOut_25_0 = null;
        bm stackOut_29_0 = null;
        bm stackOut_33_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((ri.field_E ^ -1) > -3) {
                            statePc = 9;
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
                        stackOut_2_0 = this;
                        stackIn_3_0 = stackOut_2_0;
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
                        if (!((bi) this).field_t) {
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
                        ((bi) this).field_M = 779830527;
                        ((bi) this).field_j = -((bi) this).field_U + 318907172;
                        ((bi) this).field_o = 1086213241;
                        ((bi) this).field_t = false;
                        ((bi) this).field_l = 2121488289;
                        if (var3 == 0) {
                            statePc = 43;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (0 >= ((bi) this).field_U) {
                            statePc = 43;
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
                        stackOut_12_0 = gn.field_l;
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
                        if (stackIn_13_0 != null) {
                            statePc = 43;
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
                        if (((bi) this).field_U <= 0) {
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
                        if (!je.a((byte) 85)) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return;
                }
                case 23: {
                    try {
                        var2_ref = vl.field_c;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (null == var2_ref) {
                            statePc = 40;
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
                        stackOut_25_0 = null;
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
                        if (stackIn_26_0 == (Object) (Object) var2_ref.field_p) {
                            statePc = 40;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = (bm) var2_ref;
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
                        if (!bn.a(stackIn_30_0.field_p[1][9], -17310)) {
                            statePc = 40;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = (bm) var2_ref;
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((stackIn_34_0.field_n[1][9] ^ -1) >= (((bi) this).field_U ^ -1)) {
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
                        gn.field_l = new wc(11, 65524, ((bi) this).field_M, ((bi) this).field_o, ((bi) this).field_l, ((bi) this).field_j, new int[1]);
                        if (var3 == 0) {
                            statePc = 43;
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
                        gn.field_l = va.a(true, ((bi) this).field_j, ((bi) this).field_M, 11, ((bi) this).field_o, 3, ((bi) this).field_l, new int[1], 65524);
                        vl.field_c = null;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 48;
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
                        if (param0 == 9) {
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
                        field_f = null;
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
                    throw rb.a((Throwable) (Object) var2, "bi.P(" + param0 + 41);
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        qp var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 > 1) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        af discarded$2 = bi.a((sm) null, 34);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4_int = 1 << param0;
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
                        if ((var4_int & fa.field_b ^ -1) != -1) {
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
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        ao.field_f = ao.field_f | var4_int;
                        fa.field_b = fa.field_b | var4_int;
                        ((bi) this).field_B.a((byte) 54, (q) (Object) new tj(param0));
                        if (!((bi) this).field_t) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = new qp(param0, param2, ((bi) this).field_N, ((bi) this).field_S, ((bi) this).field_F, ((bi) this).field_G);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (je.a((byte) 61)) {
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
                        wc.a(var5, (byte) 99, 4);
                        if (Torquing.field_u == 0) {
                            statePc = 22;
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
                        jh.field_y.a((byte) 54, (q) (Object) var5);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 22;
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
                case 21: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw rb.a((Throwable) (Object) var4, "bi.M(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 22: {
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
              if (param0 >= 121) {
                break L0;
              } else {
                ((bi) this).a(-53);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          ((bi) this).field_P.e(66);
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            int var2_int = 0;
            Exception var2 = null;
            RuntimeException var2_ref = null;
            java.net.URL var3 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2_int = 35 % ((param1 - -53) / 50);
                            var3 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                            param0.getAppletContext().showDocument(og.a(var3, param0, (byte) -70), "_top");
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = (stateCaught_0 instanceof Exception ? 2 : 4);
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var2 = (Exception) (Object) caughtException;
                            var2.printStackTrace();
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = (RuntimeException) var2_ref;
                            stackOut_5_1 = new StringBuilder().append("bi.A(");
                            stackIn_8_0 = stackOut_5_0;
                            stackIn_8_1 = stackOut_5_1;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            if (param0 == null) {
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
                            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                            stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                            stackOut_6_2 = "{...}";
                            stackIn_9_0 = stackOut_6_0;
                            stackIn_9_1 = stackOut_6_1;
                            stackIn_9_2 = stackOut_6_2;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 8: {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "null";
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
                    }
                    case 10: {
                        return;
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

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        kh var3_ref_kh = null;
        sb var3_ref_sb = null;
        String var3_ref = null;
        int var4 = 0;
        int var5_int = 0;
        t var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        int stackIn_13_0 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_53_0 = null;
        int stackIn_68_0 = 0;
        int stackIn_82_0 = 0;
        Object stackIn_96_0 = null;
        vn stackIn_109_0 = null;
        String stackIn_109_1 = null;
        int stackIn_109_2 = 0;
        int stackIn_109_3 = 0;
        vn stackIn_111_0 = null;
        String stackIn_111_1 = null;
        int stackIn_111_2 = 0;
        int stackIn_111_3 = 0;
        vn stackIn_112_0 = null;
        String stackIn_112_1 = null;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        int stackIn_112_4 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_119_0 = 0;
        Object stackIn_123_0 = null;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_12_0 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_41_0 = null;
        Object stackOut_52_0 = null;
        int stackOut_67_0 = 0;
        int stackOut_81_0 = 0;
        Object stackOut_95_0 = null;
        vn stackOut_108_0 = null;
        String stackOut_108_1 = null;
        int stackOut_108_2 = 0;
        int stackOut_108_3 = 0;
        vn stackOut_109_0 = null;
        String stackOut_109_1 = null;
        int stackOut_109_2 = 0;
        int stackOut_109_3 = 0;
        int stackOut_109_4 = 0;
        vn stackOut_111_0 = null;
        String stackOut_111_1 = null;
        int stackOut_111_2 = 0;
        int stackOut_111_3 = 0;
        int stackOut_111_4 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_118_0 = 0;
        Object stackOut_122_0 = null;
        int stackOut_134_0 = 0;
        int stackOut_134_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((bi) this).field_c >= 0) {
                            statePc = 10;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = this;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((bi) this).field_c != -2147483648) {
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
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ph.d(0, 0, ph.field_j, ph.field_d, 16777215);
                        ((bi) this).field_c = -2147483648;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        var2_int = ((bi) this).field_q - 1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var2_int ^ -1) > -1) {
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
                        stackOut_12_0 = var2_int;
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
                        if (stackIn_13_0 < 8) {
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
                        gm.field_r[7].b(0, 0);
                        if (var8 == 0) {
                            statePc = 32;
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
                        if (1 != ((bi) this).field_d.a(false)) {
                            statePc = 26;
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
                        stackOut_22_0 = null;
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
                        if (stackIn_23_0 != (Object) (Object) hi.field_h[var2_int]) {
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
                        gm.field_r[var2_int].b(0, 0);
                        if (var8 == 0) {
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
                        hi.field_h[var2_int].b(0, 0);
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
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (((bi) this).field_K < 0.0) {
                            statePc = 39;
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
                        if (ce.field_b) {
                            statePc = 40;
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
                        gj.field_i[1] = (int)((double)gj.field_i[1] + ((bi) this).field_K);
                        if (var8 == 0) {
                            statePc = 40;
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
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ((bi) this).field_P.a(true, gj.field_i);
                        var3 = vf.field_j[((bi) this).field_v][0];
                        var4 = vf.field_j[((bi) this).field_v][1];
                        var5_int = vf.field_j[((bi) this).field_v][2];
                        gj.field_i[1] = gj.field_i[1] + (var4 * gj.field_i[7] + var3 * gj.field_i[4] + var5_int * gj.field_i[10] >> -207182928);
                        gj.field_i[0] = gj.field_i[0] + (gj.field_i[9] * var5_int + (gj.field_i[6] * var4 + var3 * gj.field_i[3]) >> 2033481328);
                        gj.field_i[2] = gj.field_i[2] + (gj.field_i[11] * var5_int + (var3 * gj.field_i[5] - -(var4 * gj.field_i[8])) >> 200640624);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((bi) this).field_C.a(((bi) this).field_P.field_c, ((bi) this).field_H, ((bi) this).field_E, -1, -12, 12);
                        if (((bi) this).field_J) {
                            statePc = 48;
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
                        stackOut_41_0 = this;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((bi) this).field_c < 0) {
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
                        ((bi) this).field_P.b(1);
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
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var3_ref_int__ = ((bi) this).field_m;
                        var4 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var3_ref_int__.length ^ -1) >= (var4 ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var5_int = var3_ref_int__[var4];
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var8 != 0) {
                            statePc = 61;
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
                        stackOut_52_0 = null;
                        stackIn_53_0 = stackOut_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 != (Object) (Object) ((bi) this).field_D[var5_int]) {
                            statePc = 58;
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
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        ((bi) this).field_D[var5_int].b(1);
                        ((bi) this).field_C.a(((bi) this).field_D[var5_int].field_c, 80, 1365, -1, -12, 12);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var4++;
                        if (var8 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        sg.a(((bi) this).field_C.field_g[((bi) this).field_P.field_c], 80, 1365, -1, -12, 12);
                        sg.a(vc.field_c[1], 80, 1365, -1, -12, 12);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (!param0) {
                            statePc = 65;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        ((bi) this).e(14);
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
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        sg.a(vc.field_c[7], 80, 1365, -1, -12, 12);
                        var3_ref_kh = (kh) (Object) on.field_e.c((byte) -122);
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var3_ref_kh == null) {
                            statePc = 72;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        sg.a(var3_ref_kh, 80, 1365, -1, -12, 12);
                        var3_ref_kh = (kh) (Object) on.field_e.b((byte) -110);
                        stackOut_67_0 = var8;
                        stackIn_68_0 = stackOut_67_0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (stackIn_68_0 != 0) {
                            statePc = 147;
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
                        if (var8 == 0) {
                            statePc = 66;
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
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var3 = 9;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var3 > 16) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        sg discarded$1 = ((bi) this).field_C;
                        sg.a(vc.field_c[var3], 80, 1365, -1, -12, 12);
                        var3++;
                        if (var8 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var8 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        ((bi) this).field_C.a(gj.field_i);
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var3_ref_sb = (sb) (Object) ((bi) this).field_e.b(0);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var3_ref_sb == null) {
                            statePc = 86;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var3_ref_sb.c(-103);
                        var3_ref_sb = (sb) (Object) ((bi) this).field_e.f(-24059);
                        stackOut_81_0 = var8;
                        stackIn_82_0 = stackOut_81_0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (stackIn_82_0 != 0) {
                            statePc = 90;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var8 == 0) {
                            statePc = 80;
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
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (!ti.field_k) {
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
                        statePc = 147;
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
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        bd.field_w.e(-bd.field_w.field_s + 640, 0, 162);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var3_ref = wh.a(((bi) this).field_k, (byte) -119);
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (((bi) this).field_d == ig.field_q) {
                            statePc = 108;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        dd.field_c.a(var3_ref, 628, 23, 16711680, -1);
                        if (10000 <= ((bi) this).field_k) {
                            statePc = 108;
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
                        if (((bi) this).field_J) {
                            statePc = 108;
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
                        if ((((bi) this).field_v ^ -1) == -1) {
                            statePc = 105;
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
                        dd.field_c.c(var3_ref, 258, 224, 16711680, -1);
                        if (var8 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        dd.field_c.c(var3_ref, 344, 262, 16711680, -1);
                        statePc = 106;
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
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackOut_108_0 = dd.field_c;
                        stackOut_108_1 = Integer.toString(Math.abs(((bi) this).field_U));
                        stackOut_108_2 = 628;
                        stackOut_108_3 = 67;
                        stackIn_111_0 = stackOut_108_0;
                        stackIn_111_1 = stackOut_108_1;
                        stackIn_111_2 = stackOut_108_2;
                        stackIn_111_3 = stackOut_108_3;
                        stackIn_109_0 = stackOut_108_0;
                        stackIn_109_1 = stackOut_108_1;
                        stackIn_109_2 = stackOut_108_2;
                        stackIn_109_3 = stackOut_108_3;
                        if (!((bi) this).field_t) {
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
                        stackOut_109_0 = (vn) (Object) stackIn_109_0;
                        stackOut_109_1 = (String) (Object) stackIn_109_1;
                        stackOut_109_2 = stackIn_109_2;
                        stackOut_109_3 = stackIn_109_3;
                        stackOut_109_4 = 16776960;
                        stackIn_112_0 = stackOut_109_0;
                        stackIn_112_1 = stackOut_109_1;
                        stackIn_112_2 = stackOut_109_2;
                        stackIn_112_3 = stackOut_109_3;
                        stackIn_112_4 = stackOut_109_4;
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
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        stackOut_111_0 = (vn) (Object) stackIn_111_0;
                        stackOut_111_1 = (String) (Object) stackIn_111_1;
                        stackOut_111_2 = stackIn_111_2;
                        stackOut_111_3 = stackIn_111_3;
                        stackOut_111_4 = 16711680;
                        stackIn_112_0 = stackOut_111_0;
                        stackIn_112_1 = stackOut_111_1;
                        stackIn_112_2 = stackOut_111_2;
                        stackIn_112_3 = stackOut_111_3;
                        stackIn_112_4 = stackOut_111_4;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        ((vn) (Object) stackIn_112_0).a(stackIn_112_1, stackIn_112_2, stackIn_112_3, stackIn_112_4, -1);
                        var4 = 0;
                        var5_int = 528;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (8 <= var4) {
                            statePc = 133;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        stackOut_114_0 = -1;
                        stackOut_114_1 = dd.field_d >> var4 & 1 ^ -1;
                        stackIn_135_0 = stackOut_114_0;
                        stackIn_135_1 = stackOut_114_1;
                        stackIn_115_0 = stackOut_114_0;
                        stackIn_115_1 = stackOut_114_1;
                        if (var8 != 0) {
                            statePc = 135;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (stackIn_115_0 != stackIn_115_1) {
                            statePc = 126;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackOut_118_0 = 1;
                        stackIn_119_0 = stackOut_118_0;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if ((stackIn_119_0 & ((bi) this).field_z >> var4 ^ -1) == -1) {
                            statePc = 129;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        stackOut_122_0 = this;
                        stackIn_123_0 = stackOut_122_0;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if ((((bi) this).field_k % 1000 ^ -1) <= -501) {
                            statePc = 129;
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
                        ue.field_c[var4].e(var5_int, 118, 162);
                        if (var8 == 0) {
                            statePc = 132;
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
                        ph.b(var5_int, 118, ue.field_c[var4].field_w, ue.field_c[var4].field_u, 16777215, 118);
                        ue.field_c[var4 + 8].e(var5_int, 118, 81);
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var5_int = var5_int + ue.field_c[var4].field_w;
                        var4++;
                        if (var8 == 0) {
                            statePc = 113;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var4 = 0;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        stackOut_134_0 = ((bi) this).field_c ^ -1;
                        stackOut_134_1 = var4 ^ -1;
                        stackIn_135_0 = stackOut_134_0;
                        stackIn_135_1 = stackOut_134_1;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (stackIn_135_0 >= stackIn_135_1) {
                            statePc = 142;
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
                        kk.field_n.d(583 - -(var4 * 8), 143);
                        var4++;
                        if (var8 != 0) {
                            statePc = 146;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if (var8 == 0) {
                            statePc = 134;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if (!((bi) this).field_w) {
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
                        ia.field_f.d(553, 143);
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
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        dd.field_c.b(((bi) this).field_T, 538, 102, 16711680, -1);
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (-1 <= (((bi) this).field_r ^ -1)) {
                            statePc = 151;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var3 = (((bi) this).field_r - 1) / 1000;
                        var4 = -(1000 * var3) + ((bi) this).field_r;
                        var5 = hq.field_h[var3];
                        var6 = var4 * var5.field_s / 1000;
                        var7 = var5.field_t * var4 / 1000;
                        var5.b((-var6 + 640) / 2, (480 - var7) / 2, var6, var7);
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 150: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw rb.a((Throwable) (Object) var2, "bi.H(" + param0 + 41);
                }
                case 151: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void i(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        sb var7 = null;
        double[] var7_array = null;
        ed var7_ref = null;
        int var8 = 0;
        pj var8_ref = null;
        int var9_int = 0;
        double[] var9 = null;
        int[] var9_array = null;
        double var9_double = 0.0;
        tl var9_ref = null;
        kh var10_ref_kh = null;
        int var10 = 0;
        short[] var10_ref_short__ = null;
        double var10_double = 0.0;
        kg[] var10_ref_kg__ = null;
        int var11_int = 0;
        tl var11 = null;
        double var12_double = 0.0;
        kg var12 = null;
        double var14_double = 0.0;
        tl var14 = null;
        ed var16 = null;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        Object stackIn_3_0 = null;
        boolean stackIn_11_0 = false;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_210_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_232_0 = 0;
        boolean stackIn_243_0 = false;
        boolean stackIn_291_0 = false;
        Object stackIn_295_0 = null;
        double stackIn_322_0 = 0.0;
        double stackIn_329_0 = 0.0;
        vg stackIn_338_0 = null;
        double[] stackIn_338_1 = null;
        int stackIn_338_2 = 0;
        double stackIn_338_3 = 0.0;
        int stackIn_338_4 = 0;
        int stackIn_338_5 = 0;
        vg stackIn_340_0 = null;
        double[] stackIn_340_1 = null;
        int stackIn_340_2 = 0;
        double stackIn_340_3 = 0.0;
        int stackIn_340_4 = 0;
        int stackIn_340_5 = 0;
        vg stackIn_341_0 = null;
        double[] stackIn_341_1 = null;
        int stackIn_341_2 = 0;
        double stackIn_341_3 = 0.0;
        int stackIn_341_4 = 0;
        int stackIn_341_5 = 0;
        int stackIn_341_6 = 0;
        Object stackIn_344_0 = null;
        double stackIn_348_0 = 0.0;
        double stackIn_356_0 = 0.0;
        int stackIn_366_0 = 0;
        kg[] stackIn_398_0 = null;
        kg[] stackIn_399_0 = null;
        int stackIn_399_1 = 0;
        int stackIn_414_0 = 0;
        int stackIn_418_0 = 0;
        int stackIn_422_0 = 0;
        int[] stackIn_442_0 = null;
        int stackIn_455_0 = 0;
        Object stackIn_459_0 = null;
        Torquing stackIn_481_0 = null;
        int stackIn_481_1 = 0;
        Torquing stackIn_483_0 = null;
        int stackIn_483_1 = 0;
        Torquing stackIn_485_0 = null;
        int stackIn_485_1 = 0;
        Torquing stackIn_486_0 = null;
        int stackIn_486_1 = 0;
        int stackIn_486_2 = 0;
        int stackIn_491_0 = 0;
        Object stackIn_495_0 = null;
        int stackIn_501_0 = 0;
        Torquing stackIn_503_0 = null;
        int stackIn_503_1 = 0;
        Torquing stackIn_505_0 = null;
        int stackIn_505_1 = 0;
        Torquing stackIn_506_0 = null;
        int stackIn_506_1 = 0;
        int stackIn_506_2 = 0;
        kg[] stackIn_508_0 = null;
        Object stackIn_512_0 = null;
        Object stackIn_523_0 = null;
        Object stackIn_527_0 = null;
        Object stackIn_529_0 = null;
        Object stackIn_533_0 = null;
        tl stackIn_533_1 = null;
        int stackIn_540_0 = 0;
        tl stackIn_544_0 = null;
        Object stackIn_556_0 = null;
        Object stackIn_556_1 = null;
        int stackIn_558_0 = 0;
        wl[] stackIn_564_0 = null;
        Throwable caughtException = null;
        Object stackOut_2_0 = null;
        boolean stackOut_10_0 = false;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_207_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_231_0 = 0;
        boolean stackOut_242_0 = false;
        boolean stackOut_290_0 = false;
        Object stackOut_294_0 = null;
        double stackOut_321_0 = 0.0;
        double stackOut_325_0 = 0.0;
        double stackOut_327_0 = 0.0;
        double stackOut_328_0 = 0.0;
        vg stackOut_337_0 = null;
        double[] stackOut_337_1 = null;
        int stackOut_337_2 = 0;
        double stackOut_337_3 = 0.0;
        int stackOut_337_4 = 0;
        int stackOut_337_5 = 0;
        vg stackOut_338_0 = null;
        double[] stackOut_338_1 = null;
        int stackOut_338_2 = 0;
        double stackOut_338_3 = 0.0;
        int stackOut_338_4 = 0;
        int stackOut_338_5 = 0;
        int stackOut_338_6 = 0;
        vg stackOut_340_0 = null;
        double[] stackOut_340_1 = null;
        int stackOut_340_2 = 0;
        double stackOut_340_3 = 0.0;
        int stackOut_340_4 = 0;
        int stackOut_340_5 = 0;
        int stackOut_340_6 = 0;
        Object stackOut_343_0 = null;
        double stackOut_347_0 = 0.0;
        double stackOut_355_0 = 0.0;
        int stackOut_363_0 = 0;
        int stackOut_365_0 = 0;
        kg[] stackOut_397_0 = null;
        kg[] stackOut_398_0 = null;
        int stackOut_398_1 = 0;
        int stackOut_413_0 = 0;
        int stackOut_417_0 = 0;
        int stackOut_421_0 = 0;
        int[] stackOut_441_0 = null;
        int stackOut_454_0 = 0;
        Object stackOut_458_0 = null;
        Torquing stackOut_480_0 = null;
        int stackOut_480_1 = 0;
        Torquing stackOut_481_0 = null;
        int stackOut_481_1 = 0;
        Torquing stackOut_483_0 = null;
        int stackOut_483_1 = 0;
        int stackOut_483_2 = 0;
        Torquing stackOut_485_0 = null;
        int stackOut_485_1 = 0;
        int stackOut_485_2 = 0;
        int stackOut_490_0 = 0;
        Object stackOut_494_0 = null;
        int stackOut_498_0 = 0;
        int stackOut_500_0 = 0;
        Torquing stackOut_502_0 = null;
        int stackOut_502_1 = 0;
        Torquing stackOut_503_0 = null;
        int stackOut_503_1 = 0;
        int stackOut_503_2 = 0;
        Torquing stackOut_505_0 = null;
        int stackOut_505_1 = 0;
        int stackOut_505_2 = 0;
        kg[] stackOut_507_0 = null;
        Object stackOut_511_0 = null;
        Object stackOut_522_0 = null;
        Object stackOut_526_0 = null;
        Object stackOut_527_0 = null;
        Object stackOut_532_0 = null;
        tl stackOut_532_1 = null;
        int stackOut_539_0 = 0;
        tl stackOut_543_0 = null;
        Object stackOut_555_0 = null;
        tl stackOut_555_1 = null;
        int stackOut_557_0 = 0;
        wl[] stackOut_563_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (jb.a(110)) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = this;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (((bi) this).field_J) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    np.a(la.field_k[((bi) this).field_q], false, 124);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    ((bi) this).field_j = ((bi) this).field_j + 1;
                    ((bi) this).field_F = ((bi) this).field_F - ((bi) this).field_M;
                    ((bi) this).field_S = ((bi) this).field_S + ((bi) this).field_M;
                    ((bi) this).field_l = ((bi) this).field_l + 1;
                    ((bi) this).field_s = ((bi) this).field_U;
                    if (-3 < (ri.field_E ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = ce.field_b;
                    stackIn_11_0 = stackOut_10_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (!stackIn_11_0) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ko.field_b = false;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var2_int = 0;
                    var3 = 0;
                    var4 = 0;
                    var5 = 0;
                    var6 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (!ak.c(-85)) {
                        statePc = 211;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var7_int = po.field_z;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    stackOut_20_0 = var7_int ^ -1;
                    stackIn_212_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (var21 != 0) {
                        statePc = 212;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackOut_21_0 = stackIn_21_0;
                    stackOut_21_1 = -99;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (stackIn_22_0 != stackIn_22_1) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var21 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var7_int != 99) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var21 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (-97 == (var7_int ^ -1)) {
                        statePc = 107;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (97 == var7_int) {
                        statePc = 113;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var7_int != 102) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var21 == 0) {
                        statePc = 119;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if ((var7_int ^ -1) != -105) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var21 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (-106 != (var7_int ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var21 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (103 != var7_int) {
                        statePc = 64;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var21 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (42 == var7_int) {
                        statePc = 131;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if ((var7_int ^ -1) != -44) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var21 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (-101 == (var7_int ^ -1)) {
                        statePc = 143;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if ((var7_int ^ -1) == -83) {
                        statePc = 143;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (84 != var7_int) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (var21 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if ((var7_int ^ -1) != -84) {
                        statePc = 91;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (var21 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (-14 == (var7_int ^ -1)) {
                        statePc = 148;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (!mm.field_h) {
                        statePc = 100;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    ((bi) this).field_P.field_g[2] = ((bi) this).field_P.field_g[2] + 10.0;
                    ((bi) this).field_M = ((bi) this).field_M + 1;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    var3++;
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var3--;
                    if (!mm.field_h) {
                        statePc = 149;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    ((bi) this).field_P.field_g[2] = ((bi) this).field_P.field_g[2] - 10.0;
                    ((bi) this).field_M = ((bi) this).field_M + 2;
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var4++;
                    ((bi) this).field_y = false;
                    if (mm.field_h) {
                        statePc = 112;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 112: {
                    ((bi) this).field_P.field_g[0] = ((bi) this).field_P.field_g[0] - 10.0;
                    ((bi) this).field_M = ((bi) this).field_M + 4;
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    ((bi) this).field_y = false;
                    var4--;
                    if (mm.field_h) {
                        statePc = 118;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 118: {
                    ((bi) this).field_M = ((bi) this).field_M + 8;
                    ((bi) this).field_P.field_g[0] = ((bi) this).field_P.field_g[0] + 10.0;
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    ((bi) this).field_y = false;
                    var4++;
                    var3++;
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    ((bi) this).field_y = false;
                    var3++;
                    var4--;
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    ((bi) this).field_y = false;
                    var3--;
                    var4--;
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var4++;
                    ((bi) this).field_y = false;
                    var3--;
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (!mm.field_h) {
                        statePc = 149;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    ((bi) this).field_M = ((bi) this).field_M + 16;
                    ((bi) this).field_P.field_g[1] = ((bi) this).field_P.field_g[1] + 10.0;
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (mm.field_h) {
                        statePc = 142;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 142: {
                    ((bi) this).field_P.field_g[1] = ((bi) this).field_P.field_g[1] - 10.0;
                    ((bi) this).field_M = ((bi) this).field_M + 32;
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (!((bi) this).field_w) {
                        statePc = 149;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var6 = 1;
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var5 = 1;
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var2_int = 1;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (2 <= ri.field_E) {
                        statePc = 152;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var7_int = po.field_z;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (var7_int != 70) {
                        statePc = 157;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (var21 == 0) {
                        statePc = 191;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (var7_int == 51) {
                        statePc = 194;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (38 != var7_int) {
                        statePc = 166;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (var21 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (var7_int == 49) {
                        statePc = 196;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (var7_int != 101) {
                        statePc = 175;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (var21 == 0) {
                        statePc = 198;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (var7_int == 48) {
                        statePc = 199;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (-81 == (var7_int ^ -1)) {
                        statePc = 200;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if ((var7_int ^ -1) != -70) {
                        statePc = 187;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (var21 == 0) {
                        statePc = 200;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (-58 != (var7_int ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (var21 == 0) {
                        statePc = 206;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    ti.field_k = ti.field_k ^ true;
                    if (var21 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    ce.field_b = true;
                    if (var21 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    ce.field_b = false;
                    if (var21 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (!ce.field_b) {
                        statePc = 18;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    ko.field_b = true;
                    if (var21 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    ((bi) this).field_k = ((bi) this).field_k + 30000;
                    ((bi) this).field_t = true;
                    if (var21 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    ((bi) this).field_k = ((bi) this).field_k - 1000;
                    if (var21 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    ((bi) this).field_k = 0;
                    ((bi) this).field_T = ki.a("ff9040", "ffffff", -93, ((bi) this).field_T.toString());
                    ((bi) this).g(62);
                    vl.field_c = null;
                    if (!je.a((byte) 117)) {
                        statePc = 203;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 203: {
                    gn.field_l = va.a(true, ((bi) this).field_j, ((bi) this).field_M, 11, ((bi) this).field_o, 3, ((bi) this).field_l, new int[1], 65524);
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    ((bi) this).field_l = ((bi) this).field_l - ((bi) this).field_U;
                    ((bi) this).field_U = 0;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    return;
                }
                case 206: {
                    if (i.field_P[81]) {
                        statePc = 209;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    stackOut_207_0 = 1;
                    stackIn_210_0 = stackOut_207_0;
                    statePc = 210;
                    continue stateLoop;
                }
                case 209: {
                    stackOut_209_0 = 0;
                    stackIn_210_0 = stackOut_209_0;
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    mm.field_h = stackIn_210_0 != 0;
                    ((bi) this).field_t = ((bi) this).field_t | mm.field_h;
                    if (var21 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var7_int = ((bi) this).field_a[0];
                    stackOut_211_0 = be.field_o[var7_int * 32 & 2047];
                    stackIn_212_0 = stackOut_211_0;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    var8 = stackIn_212_0;
                    var9_int = be.field_l[32 * var7_int & 2047];
                    ((bi) this).field_a[0] = 0;
                    ((bi) this).field_a[11] = var8;
                    ((bi) this).field_a[3] = var8;
                    ((bi) this).field_a[9] = var9_int;
                    ((bi) this).field_a[5] = -var9_int;
                    ((bi) this).field_P.field_h.a(vc.field_c[1], ((bi) this).field_a);
                    var10_ref_kh = (kh) (Object) on.field_e.c((byte) -119);
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    if (var10_ref_kh == null) {
                        statePc = 219;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    ((bi) this).field_P.field_h.a(var10_ref_kh, ((bi) this).field_a);
                    var10_ref_kh = (kh) (Object) on.field_e.b((byte) 72);
                    stackOut_214_0 = var21;
                    stackIn_215_0 = stackOut_214_0;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    if (stackIn_215_0 != 0) {
                        statePc = 229;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (var21 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    var10 = 9;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    if (-17 > (var10 ^ -1)) {
                        statePc = 225;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    ((bi) this).field_P.field_h.a(vc.field_c[var10], ((bi) this).field_a);
                    var10++;
                    if (var21 != 0) {
                        statePc = 226;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (var21 == 0) {
                        statePc = 220;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    ((bi) this).field_a[0] = 1 + var7_int;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    if (0 != (7 & var7_int)) {
                        statePc = 228;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    var10_ref_short__ = vc.field_c[9].field_l.field_m;
                    var11_int = (short)(65535 & var10_ref_short__[0] - -1024);
                    dk.a(var10_ref_short__, 0, var10_ref_short__.length, (short) var11_int);
                    ((bi) this).field_M = ((bi) this).field_M ^ var11_int << 613208131;
                    ((bi) this).field_o = ((bi) this).field_o ^ var11_int << 1035955139;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    this.a(false, var7_int);
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    var7 = (sb) (Object) ((bi) this).field_e.b(0);
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    if (null == var7) {
                        statePc = 236;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var7.a((byte) -114);
                    var7 = (sb) (Object) ((bi) this).field_e.f(-24059);
                    stackOut_231_0 = var21;
                    stackIn_232_0 = stackOut_231_0;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    if (stackIn_232_0 != 0) {
                        statePc = 240;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (var21 == 0) {
                        statePc = 230;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    if (var2_int != 0) {
                        statePc = 239;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 239: {
                    ((bi) this).field_A.a(true, 1, 2, false);
                    statePc = 240;
                    continue stateLoop;
                }
                case 240: {
                    return;
                }
                case 241: {
                    if ((ri.field_E ^ -1) > -3) {
                        statePc = 250;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    stackOut_242_0 = ce.field_b;
                    stackIn_243_0 = stackOut_242_0;
                    statePc = 243;
                    continue stateLoop;
                }
                case 243: {
                    if (!stackIn_243_0) {
                        statePc = 250;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    if (ko.field_b) {
                        statePc = 250;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    return;
                }
                case 250: {
                    if (-1 > (((bi) this).field_r ^ -1)) {
                        statePc = 253;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (-1001 != (((bi) this).field_r ^ -1)) {
                        statePc = 257;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    th.a(100, th.field_F[4]);
                    if (var21 == 0) {
                        statePc = 275;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if (-2001 == (((bi) this).field_r ^ -1)) {
                        statePc = 272;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (-3001 == (((bi) this).field_r ^ -1)) {
                        statePc = 269;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if ((((bi) this).field_r ^ -1) < -21) {
                        statePc = 275;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    qj.a(((bi) this).field_r, -5205, 96, th.field_F[5]);
                    if (var21 == 0) {
                        statePc = 275;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    th.a(100, th.field_F[2]);
                    if (var21 == 0) {
                        statePc = 275;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    th.a(100, th.field_F[3]);
                    statePc = 275;
                    continue stateLoop;
                }
                case 275: {
                    ((bi) this).field_r = ((bi) this).field_r - 20;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    return;
                }
                case 277: {
                    if (-1 <= (((bi) this).field_x ^ -1)) {
                        statePc = 287;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    if ((((bi) this).field_x ^ -1) <= -513) {
                        statePc = 287;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var7_ref = ql.field_u;
                    ((bi) this).field_x = Math.min(512, ((bi) this).field_x + 10);
                    bc.field_a.a(true);
                    var7_ref.a(0.0, 0.0, 1.0, (byte) 51, 3.141592653589793 * (double)(il.field_m[((bi) this).field_v][2] * 2) / 2048.0);
                    bc.field_a.a(var7_ref, 65536);
                    var7_ref.a(1.0, 0.0, 0.0, (byte) 54, 3.141592653589793 * (double)(2 * il.field_m[((bi) this).field_v][0]) / 2048.0);
                    bc.field_a.a(var7_ref, 65536);
                    var7_ref.a(0.0, 1.0, 0.0, (byte) 63, (double)(il.field_m[((bi) this).field_v][1] * 2) * 3.141592653589793 / 2048.0);
                    bc.field_a.a(var7_ref, 65536);
                    var7_ref.a(0.0, 0.0, 1.0, (byte) 87, 3.141592653589793 * (double)(2 * -((bi) this).field_x) / 2048.0);
                    bc.field_a.a(var7_ref, 65536);
                    bc.field_a.a(gj.field_i, (byte) 113);
                    re.field_d[0] = 80.0 * (double)be.field_l[((bi) this).field_x] / 65535.0;
                    re.field_d[1] = (double)be.field_o[((bi) this).field_x] * 80.0 / 65535.0;
                    ((bi) this).field_h = Double.NEGATIVE_INFINITY;
                    var8_ref = ((bi) this).field_d.a(-100, false).field_k;
                    var9_int = -1 + var8_ref.field_k;
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    if (-1 < (var9_int ^ -1)) {
                        statePc = 287;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    ((bi) this).field_h = Math.max(((bi) this).field_h, re.field_d[1] * (double)var8_ref.field_y[var9_int] + (1000.0 + (double)var8_ref.field_j[var9_int] * re.field_d[0]) + (double)var8_ref.field_v[var9_int] * re.field_d[2]);
                    var9_int--;
                    if (var21 != 0) {
                        statePc = 288;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    if (var21 == 0) {
                        statePc = 282;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    var3 = Math.min(Math.max(var3, -10), 10);
                    statePc = 288;
                    continue stateLoop;
                }
                case 288: {
                    var7_array = new double[3];
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    var7_array[0] = 2670.0 * (double)(be.field_o[((bi) this).field_x] * var3) / 65535.0;
                    var7_array[1] = 2670.0 * (double)(-be.field_l[((bi) this).field_x] * var3) / 65535.0;
                    var7_array[2] = (double)Math.min(Math.max(var4, -10), 10) * 2670.0;
                    if ((((bi) this).field_c ^ -1) > -1) {
                        statePc = 298;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    stackOut_290_0 = mm.field_h;
                    stackIn_291_0 = stackOut_290_0;
                    statePc = 291;
                    continue stateLoop;
                }
                case 291: {
                    if (stackIn_291_0) {
                        statePc = 298;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    stackOut_294_0 = this;
                    stackIn_295_0 = stackOut_294_0;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    if (!((bi) this).field_J) {
                        statePc = 337;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    if (!mm.field_h) {
                        statePc = 304;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    ((bi) this).field_P.c(0);
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    var8 = 1;
                    if (!((bi) this).field_J) {
                        statePc = 367;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    var9 = new double[4];
                    ap.a(((bi) this).field_P.field_g, 6, ((bi) this).field_P.field_g, 10, var9, 0, 0.08);
                    var10 = 0;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if (-5 >= (var10 ^ -1)) {
                        statePc = 311;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    ((bi) this).field_P.field_g[var10 + 6] = ((bi) this).field_P.field_g[var10 + 6] + var9[var10];
                    var10++;
                    if (var21 != 0) {
                        statePc = 312;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if (var21 == 0) {
                        statePc = 306;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    var10 = 0;
                    statePc = 312;
                    continue stateLoop;
                }
                case 312: {
                    if ((var10 ^ -1) <= -4) {
                        statePc = 319;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    ((bi) this).field_P.field_g[10 - -var10] = ((bi) this).field_P.field_g[10 - -var10] * 0.8;
                    var10++;
                    if (var21 != 0) {
                        statePc = 367;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    if (var21 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    var10_double = 0.1;
                    var12_double = ((bi) this).field_P.field_g[8];
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    if (var12_double >= 1.0) {
                        statePc = 328;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    stackOut_321_0 = -1.0;
                    stackIn_322_0 = stackOut_321_0;
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    if (stackIn_322_0 < var12_double) {
                        statePc = 327;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    stackOut_325_0 = 3.141592653589793;
                    stackIn_329_0 = stackOut_325_0;
                    statePc = 329;
                    continue stateLoop;
                }
                case 327: {
                    stackOut_327_0 = Math.acos(var12_double);
                    stackIn_329_0 = stackOut_327_0;
                    statePc = 329;
                    continue stateLoop;
                }
                case 328: {
                    stackOut_328_0 = 0.0;
                    stackIn_329_0 = stackOut_328_0;
                    statePc = 329;
                    continue stateLoop;
                }
                case 329: {
                    var14_double = stackIn_329_0;
                    var16 = ql.field_u;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    if (0.0001 > var14_double) {
                        statePc = 334;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    if (3.141492653589793 >= var14_double) {
                        statePc = 335;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    var19 = var10_double;
                    var17 = 1.0 - var10_double;
                    if (var21 == 0) {
                        statePc = 336;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    var17 = Math.sin((-var10_double + 1.0) * var14_double);
                    var19 = Math.sin(var14_double * var10_double);
                    statePc = 336;
                    continue stateLoop;
                }
                case 336: {
                    var16.field_b = var19 + var17 * ((bi) this).field_P.field_g[8];
                    var16.field_d = ((bi) this).field_P.field_g[7] * var17;
                    var16.field_a = var17 * ((bi) this).field_P.field_g[6];
                    var16.field_e = ((bi) this).field_P.field_g[9] * var17;
                    var16.a((byte) -123);
                    ((bi) this).field_P.field_g[8] = var16.field_b;
                    ((bi) this).field_P.field_g[6] = var16.field_a;
                    ((bi) this).field_P.field_g[7] = var16.field_d;
                    ((bi) this).field_P.field_g[9] = var16.field_e;
                    ((bi) this).field_P.c(0);
                    ((bi) this).field_P.field_h.a(((bi) this).field_P.field_h.field_g[((bi) this).field_P.field_c], ((bi) this).field_P.field_f);
                    statePc = 367;
                    continue stateLoop;
                }
                case 337: {
                    stackOut_337_0 = ((bi) this).field_P;
                    stackOut_337_1 = (double[]) var7_array;
                    stackOut_337_2 = var5;
                    stackOut_337_3 = 0.08;
                    stackOut_337_4 = var6;
                    stackOut_337_5 = 0;
                    stackIn_340_0 = stackOut_337_0;
                    stackIn_340_1 = stackOut_337_1;
                    stackIn_340_2 = stackOut_337_2;
                    stackIn_340_3 = stackOut_337_3;
                    stackIn_340_4 = stackOut_337_4;
                    stackIn_340_5 = stackOut_337_5;
                    stackIn_338_0 = stackOut_337_0;
                    stackIn_338_1 = stackOut_337_1;
                    stackIn_338_2 = stackOut_337_2;
                    stackIn_338_3 = stackOut_337_3;
                    stackIn_338_4 = stackOut_337_4;
                    stackIn_338_5 = stackOut_337_5;
                    if (((bi) this).field_d != ig.field_q) {
                        statePc = 340;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 338: {
                    stackOut_338_0 = (vg) (Object) stackIn_338_0;
                    stackOut_338_1 = (double[]) (Object) stackIn_338_1;
                    stackOut_338_2 = stackIn_338_2;
                    stackOut_338_3 = stackIn_338_3;
                    stackOut_338_4 = stackIn_338_4;
                    stackOut_338_5 = stackIn_338_5;
                    stackOut_338_6 = 1;
                    stackIn_341_0 = stackOut_338_0;
                    stackIn_341_1 = stackOut_338_1;
                    stackIn_341_2 = stackOut_338_2;
                    stackIn_341_3 = stackOut_338_3;
                    stackIn_341_4 = stackOut_338_4;
                    stackIn_341_5 = stackOut_338_5;
                    stackIn_341_6 = stackOut_338_6;
                    statePc = 341;
                    continue stateLoop;
                }
                case 340: {
                    stackOut_340_0 = (vg) (Object) stackIn_340_0;
                    stackOut_340_1 = (double[]) (Object) stackIn_340_1;
                    stackOut_340_2 = stackIn_340_2;
                    stackOut_340_3 = stackIn_340_3;
                    stackOut_340_4 = stackIn_340_4;
                    stackOut_340_5 = stackIn_340_5;
                    stackOut_340_6 = 0;
                    stackIn_341_0 = stackOut_340_0;
                    stackIn_341_1 = stackOut_340_1;
                    stackIn_341_2 = stackOut_340_2;
                    stackIn_341_3 = stackOut_340_3;
                    stackIn_341_4 = stackOut_340_4;
                    stackIn_341_5 = stackOut_340_5;
                    stackIn_341_6 = stackOut_340_6;
                    statePc = 341;
                    continue stateLoop;
                }
                case 341: {
                    var9_double = ((vg) (Object) stackIn_341_0).a(stackIn_341_1, stackIn_341_2 != 0, stackIn_341_3, stackIn_341_4 != 0, stackIn_341_5, stackIn_341_6 != 0);
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    if (!((bi) this).field_y) {
                        statePc = 354;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    stackOut_343_0 = this;
                    stackIn_344_0 = stackOut_343_0;
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    if (((bi) this).field_P.field_g[2] > 1400.0) {
                        statePc = 354;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 347: {
                    stackOut_347_0 = 0.0;
                    stackIn_348_0 = stackOut_347_0;
                    statePc = 348;
                    continue stateLoop;
                }
                case 348: {
                    if (stackIn_348_0 <= ((bi) this).field_P.field_g[5]) {
                        statePc = 353;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 353: {
                    this.a(14, (byte) 127, 241);
                    statePc = 354;
                    continue stateLoop;
                }
                case 354: {
                    if (var9_double <= ((bi) this).field_h) {
                        statePc = 362;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    stackOut_355_0 = -1.0;
                    stackIn_356_0 = stackOut_355_0;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    if (stackIn_356_0 == ((bi) this).field_K) {
                        statePc = 361;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 361: {
                    ((bi) this).field_K = 0.08 * ((bi) this).field_P.field_g[4];
                    th.a(100, th.field_F[22]);
                    statePc = 362;
                    continue stateLoop;
                }
                case 362: {
                    if (var9_double >= 100000.0 + ((bi) this).field_h) {
                        statePc = 365;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    stackOut_363_0 = 1;
                    stackIn_366_0 = stackOut_363_0;
                    statePc = 366;
                    continue stateLoop;
                }
                case 365: {
                    stackOut_365_0 = 0;
                    stackIn_366_0 = stackOut_365_0;
                    statePc = 366;
                    continue stateLoop;
                }
                case 366: {
                    var8 = stackIn_366_0;
                    statePc = 367;
                    continue stateLoop;
                }
                case 367: {
                    if (ig.field_q == ((bi) this).field_d) {
                        statePc = 370;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 370: {
                    var9 = ((bi) this).field_d.f(14);
                    ((bi) this).field_P.field_g[0] = var9[0];
                    ((bi) this).field_P.field_g[2] = var9[2];
                    statePc = 371;
                    continue stateLoop;
                }
                case 371: {
                    var9_array = ((bi) this).field_m;
                    var10 = 0;
                    statePc = 372;
                    continue stateLoop;
                }
                case 372: {
                    if ((var9_array.length ^ -1) >= (var10 ^ -1)) {
                        statePc = 393;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    var11_int = var9_array[var10];
                    statePc = 374;
                    continue stateLoop;
                }
                case 374: {
                    if (var21 != 0) {
                        statePc = 395;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    if (((bi) this).field_D[var11_int] == null) {
                        statePc = 392;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 378: {
                    var12_double = ((bi) this).field_D[var11_int].a(0, 0.08);
                    statePc = 379;
                    continue stateLoop;
                }
                case 379: {
                    if (var12_double > ((bi) this).field_h + 100000.0) {
                        statePc = 382;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 382: {
                    var14 = ((bi) this).field_D[var11_int];
                    statePc = 383;
                    continue stateLoop;
                }
                case 383: {
                    this.a(538, 0, var14.field_h, var14.field_c);
                    if (null == ig.field_r[13]) {
                        statePc = 386;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 386: {
                    ig.field_r[13] = nj.a(th.field_F[13], 100, 96);
                    statePc = 387;
                    continue stateLoop;
                }
                case 387: {
                    if (!ig.field_r[13].e(17)) {
                        statePc = 390;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 390: {
                    ig.field_r[13].c(0);
                    ni.a(ig.field_r[13], true);
                    statePc = 391;
                    continue stateLoop;
                }
                case 391: {
                    ((bi) this).field_D[var11_int] = null;
                    statePc = 392;
                    continue stateLoop;
                }
                case 392: {
                    var10++;
                    if (var21 == 0) {
                        statePc = 372;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 393: {
                    if (param0 > 35) {
                        statePc = 395;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    return;
                }
                case 395: {
                    var9_int = 0;
                    statePc = 396;
                    continue stateLoop;
                }
                case 396: {
                    if ((((bi) this).field_Q.length ^ -1) >= (var9_int ^ -1)) {
                        statePc = 409;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 397: {
                    stackOut_397_0 = ((bi) this).field_Q;
                    stackIn_508_0 = stackOut_397_0;
                    stackIn_398_0 = stackOut_397_0;
                    if (var21 != 0) {
                        statePc = 508;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    stackOut_398_0 = (kg[]) (Object) stackIn_398_0;
                    stackOut_398_1 = var9_int;
                    stackIn_399_0 = stackOut_398_0;
                    stackIn_399_1 = stackOut_398_1;
                    statePc = 399;
                    continue stateLoop;
                }
                case 399: {
                    if (stackIn_399_0[stackIn_399_1] == null) {
                        statePc = 408;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    ((bi) this).field_Q[var9_int].a(true);
                    if (((bi) this).field_Q[var9_int].field_a == null) {
                        statePc = 407;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 407: {
                    ((bi) this).field_Q[var9_int] = null;
                    statePc = 408;
                    continue stateLoop;
                }
                case 408: {
                    var9_int++;
                    if (var21 == 0) {
                        statePc = 396;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 409: {
                    if (!((bi) this).field_J) {
                        statePc = 412;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 412: {
                    ((bi) this).field_k = ((bi) this).field_k - 20;
                    if (((bi) this).field_d == ig.field_q) {
                        statePc = 428;
                    } else {
                        statePc = 413;
                    }
                    continue stateLoop;
                }
                case 413: {
                    stackOut_413_0 = 10000;
                    stackIn_414_0 = stackOut_413_0;
                    statePc = 414;
                    continue stateLoop;
                }
                case 414: {
                    if (stackIn_414_0 < ((bi) this).field_k) {
                        statePc = 428;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 417: {
                    stackOut_417_0 = 0;
                    stackIn_418_0 = stackOut_417_0;
                    statePc = 418;
                    continue stateLoop;
                }
                case 418: {
                    if (stackIn_418_0 >= ((bi) this).field_k) {
                        statePc = 428;
                    } else {
                        statePc = 421;
                    }
                    continue stateLoop;
                }
                case 421: {
                    stackOut_421_0 = -21;
                    stackIn_422_0 = stackOut_421_0;
                    statePc = 422;
                    continue stateLoop;
                }
                case 422: {
                    if (stackIn_422_0 >= ((20 + (((bi) this).field_k + -1)) % 1000 ^ -1)) {
                        statePc = 428;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 425: {
                    th.a(100, th.field_F[20]);
                    statePc = 428;
                    continue stateLoop;
                }
                case 428: {
                    if (!((bi) this).field_J) {
                        statePc = 451;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    if (((bi) this).field_k <= 0) {
                        statePc = 438;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    var9_int = 300;
                    statePc = 433;
                    continue stateLoop;
                }
                case 433: {
                    if (((bi) this).field_k < var9_int) {
                        statePc = 436;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 436: {
                    var9_int = ((bi) this).field_k;
                    statePc = 437;
                    continue stateLoop;
                }
                case 437: {
                    ((bi) this).field_k = ((bi) this).field_k - var9_int;
                    ((bi) this).a((byte) 115, (1 + ((bi) this).field_d.field_s) * var9_int / 100);
                    if (var21 == 0) {
                        statePc = 521;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 438: {
                    if (((bi) this).field_d.field_m == null) {
                        statePc = 445;
                    } else {
                        statePc = 441;
                    }
                    continue stateLoop;
                }
                case 441: {
                    stackOut_441_0 = wi.field_a;
                    stackIn_442_0 = stackOut_441_0;
                    statePc = 442;
                    continue stateLoop;
                }
                case 442: {
                    if ((stackIn_442_0[((bi) this).field_L - -1] ^ -1) == (wi.field_a[((bi) this).field_L] ^ -1)) {
                        statePc = 448;
                    } else {
                        statePc = 445;
                    }
                    continue stateLoop;
                }
                case 445: {
                    ((bi) this).field_A.a(true, wi.field_a[((bi) this).field_L], 8, false);
                    if (var21 == 0) {
                        statePc = 521;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    ((bi) this).field_A.a(true, ((bi) this).field_L + 1, 6, false);
                    if (var21 == 0) {
                        statePc = 521;
                    } else {
                        statePc = 451;
                    }
                    continue stateLoop;
                }
                case 451: {
                    if (ig.field_q == ((bi) this).field_d) {
                        statePc = 465;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 454: {
                    stackOut_454_0 = 0;
                    stackIn_455_0 = stackOut_454_0;
                    statePc = 455;
                    continue stateLoop;
                }
                case 455: {
                    if (stackIn_455_0 < ((bi) this).field_k) {
                        statePc = 465;
                    } else {
                        statePc = 458;
                    }
                    continue stateLoop;
                }
                case 458: {
                    stackOut_458_0 = this;
                    stackIn_459_0 = stackOut_458_0;
                    statePc = 459;
                    continue stateLoop;
                }
                case 459: {
                    if (((bi) this).field_k <= -20) {
                        statePc = 465;
                    } else {
                        statePc = 462;
                    }
                    continue stateLoop;
                }
                case 462: {
                    this.b(12, 1);
                    th.a(100, th.field_F[21]);
                    if (var21 == 0) {
                        statePc = 521;
                    } else {
                        statePc = 465;
                    }
                    continue stateLoop;
                }
                case 465: {
                    if (var8 != 0) {
                        statePc = 471;
                    } else {
                        statePc = 468;
                    }
                    continue stateLoop;
                }
                case 468: {
                    this.b(12, 0);
                    if (var21 == 0) {
                        statePc = 521;
                    } else {
                        statePc = 471;
                    }
                    continue stateLoop;
                }
                case 471: {
                    if ((((bi) this).field_c ^ -1) > -1) {
                        statePc = 507;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 474: {
                    if (0 <= ((bi) this).field_k) {
                        statePc = 521;
                    } else {
                        statePc = 477;
                    }
                    continue stateLoop;
                }
                case 477: {
                    ((bi) this).b(9);
                    ((bi) this).field_g = true;
                    if (je.a((byte) 69)) {
                        statePc = 487;
                    } else {
                        statePc = 480;
                    }
                    continue stateLoop;
                }
                case 480: {
                    stackOut_480_0 = ((bi) this).field_A;
                    stackOut_480_1 = 1;
                    stackIn_485_0 = stackOut_480_0;
                    stackIn_485_1 = stackOut_480_1;
                    stackIn_481_0 = stackOut_480_0;
                    stackIn_481_1 = stackOut_480_1;
                    if (0 != ao.field_f) {
                        statePc = 485;
                    } else {
                        statePc = 481;
                    }
                    continue stateLoop;
                }
                case 481: {
                    stackOut_481_0 = (Torquing) (Object) stackIn_481_0;
                    stackOut_481_1 = stackIn_481_1;
                    stackIn_483_0 = stackOut_481_0;
                    stackIn_483_1 = stackOut_481_1;
                    statePc = 483;
                    continue stateLoop;
                }
                case 483: {
                    stackOut_483_0 = (Torquing) (Object) stackIn_483_0;
                    stackOut_483_1 = stackIn_483_1;
                    stackOut_483_2 = 2;
                    stackIn_486_0 = stackOut_483_0;
                    stackIn_486_1 = stackOut_483_1;
                    stackIn_486_2 = stackOut_483_2;
                    statePc = 486;
                    continue stateLoop;
                }
                case 485: {
                    stackOut_485_0 = (Torquing) (Object) stackIn_485_0;
                    stackOut_485_1 = stackIn_485_1;
                    stackOut_485_2 = 8;
                    stackIn_486_0 = stackOut_485_0;
                    stackIn_486_1 = stackOut_485_1;
                    stackIn_486_2 = stackOut_485_2;
                    statePc = 486;
                    continue stateLoop;
                }
                case 486: {
                    ((Torquing) (Object) stackIn_486_0).a(stackIn_486_1 != 0, stackIn_486_2, 2, false);
                    if (var21 == 0) {
                        statePc = 521;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 487: {
                    if (((bi) this).field_U != 0) {
                        statePc = 498;
                    } else {
                        statePc = 490;
                    }
                    continue stateLoop;
                }
                case 490: {
                    stackOut_490_0 = ao.field_f;
                    stackIn_491_0 = stackOut_490_0;
                    statePc = 491;
                    continue stateLoop;
                }
                case 491: {
                    if (stackIn_491_0 != 0) {
                        statePc = 498;
                    } else {
                        statePc = 494;
                    }
                    continue stateLoop;
                }
                case 494: {
                    stackOut_494_0 = this;
                    stackIn_495_0 = stackOut_494_0;
                    statePc = 495;
                    continue stateLoop;
                }
                case 495: {
                    if ((((bi) this).field_L ^ -1) == -1) {
                        statePc = 500;
                    } else {
                        statePc = 498;
                    }
                    continue stateLoop;
                }
                case 498: {
                    stackOut_498_0 = 1;
                    stackIn_501_0 = stackOut_498_0;
                    statePc = 501;
                    continue stateLoop;
                }
                case 500: {
                    stackOut_500_0 = 0;
                    stackIn_501_0 = stackOut_500_0;
                    statePc = 501;
                    continue stateLoop;
                }
                case 501: {
                    var9_int = stackIn_501_0;
                    statePc = 502;
                    continue stateLoop;
                }
                case 502: {
                    stackOut_502_0 = ((bi) this).field_A;
                    stackOut_502_1 = 1;
                    stackIn_505_0 = stackOut_502_0;
                    stackIn_505_1 = stackOut_502_1;
                    stackIn_503_0 = stackOut_502_0;
                    stackIn_503_1 = stackOut_502_1;
                    if (var9_int == 0) {
                        statePc = 505;
                    } else {
                        statePc = 503;
                    }
                    continue stateLoop;
                }
                case 503: {
                    stackOut_503_0 = (Torquing) (Object) stackIn_503_0;
                    stackOut_503_1 = stackIn_503_1;
                    stackOut_503_2 = 7;
                    stackIn_506_0 = stackOut_503_0;
                    stackIn_506_1 = stackOut_503_1;
                    stackIn_506_2 = stackOut_503_2;
                    statePc = 506;
                    continue stateLoop;
                }
                case 505: {
                    stackOut_505_0 = (Torquing) (Object) stackIn_505_0;
                    stackOut_505_1 = stackIn_505_1;
                    stackOut_505_2 = 0;
                    stackIn_506_0 = stackOut_505_0;
                    stackIn_506_1 = stackOut_505_1;
                    stackIn_506_2 = stackOut_505_2;
                    statePc = 506;
                    continue stateLoop;
                }
                case 506: {
                    ((Torquing) (Object) stackIn_506_0).a(stackIn_506_1 != 0, stackIn_506_2, 2, false);
                    if (var21 == 0) {
                        statePc = 521;
                    } else {
                        statePc = 507;
                    }
                    continue stateLoop;
                }
                case 507: {
                    var9_int = 1;
                    stackOut_507_0 = ((bi) this).field_Q;
                    stackIn_508_0 = stackOut_507_0;
                    statePc = 508;
                    continue stateLoop;
                }
                case 508: {
                    var10_ref_kg__ = stackIn_508_0;
                    var11_int = 0;
                    statePc = 509;
                    continue stateLoop;
                }
                case 509: {
                    if ((var10_ref_kg__.length ^ -1) >= (var11_int ^ -1)) {
                        statePc = 517;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 510: {
                    var12 = var10_ref_kg__[var11_int];
                    statePc = 511;
                    continue stateLoop;
                }
                case 511: {
                    stackOut_511_0 = null;
                    stackIn_529_0 = stackOut_511_0;
                    stackIn_512_0 = stackOut_511_0;
                    if (var21 != 0) {
                        statePc = 529;
                    } else {
                        statePc = 512;
                    }
                    continue stateLoop;
                }
                case 512: {
                    if (stackIn_512_0 == (Object) (Object) var12) {
                        statePc = 516;
                    } else {
                        statePc = 515;
                    }
                    continue stateLoop;
                }
                case 515: {
                    var9_int = 0;
                    statePc = 516;
                    continue stateLoop;
                }
                case 516: {
                    var11_int++;
                    if (var21 == 0) {
                        statePc = 509;
                    } else {
                        statePc = 517;
                    }
                    continue stateLoop;
                }
                case 517: {
                    if (var9_int != 0) {
                        statePc = 520;
                    } else {
                        statePc = 521;
                    }
                    continue stateLoop;
                }
                case 520: {
                    this.b(12, 2);
                    statePc = 521;
                    continue stateLoop;
                }
                case 521: {
                    if (((bi) this).field_g) {
                        statePc = 562;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 522: {
                    stackOut_522_0 = this;
                    stackIn_523_0 = stackOut_522_0;
                    statePc = 523;
                    continue stateLoop;
                }
                case 523: {
                    if (((bi) this).field_J) {
                        statePc = 562;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 526: {
                    stackOut_526_0 = null;
                    stackIn_527_0 = stackOut_526_0;
                    statePc = 527;
                    continue stateLoop;
                }
                case 527: {
                    stackOut_527_0 = stackIn_527_0;
                    stackIn_529_0 = stackOut_527_0;
                    statePc = 529;
                    continue stateLoop;
                }
                case 529: {
                    var9_array = (int[]) (Object) stackIn_529_0;
                    var10 = 0;
                    statePc = 530;
                    continue stateLoop;
                }
                case 530: {
                    if ((var10 ^ -1) <= (((bi) this).field_D.length ^ -1)) {
                        statePc = 555;
                    } else {
                        statePc = 531;
                    }
                    continue stateLoop;
                }
                case 531: {
                    var11 = ((bi) this).field_D[var10];
                    statePc = 532;
                    continue stateLoop;
                }
                case 532: {
                    stackOut_532_0 = null;
                    stackOut_532_1 = (tl) var11;
                    stackIn_556_0 = stackOut_532_0;
                    stackIn_556_1 = (Object) (Object) stackOut_532_1;
                    stackIn_533_0 = stackOut_532_0;
                    stackIn_533_1 = stackOut_532_1;
                    if (var21 != 0) {
                        statePc = 556;
                    } else {
                        statePc = 533;
                    }
                    continue stateLoop;
                }
                case 533: {
                    if (stackIn_533_0 == (Object) (Object) stackIn_533_1) {
                        statePc = 554;
                    } else {
                        statePc = 536;
                    }
                    continue stateLoop;
                }
                case 536: {
                    if ((var11.field_r ^ -1) == -4) {
                        statePc = 554;
                    } else {
                        statePc = 539;
                    }
                    continue stateLoop;
                }
                case 539: {
                    stackOut_539_0 = -26;
                    stackIn_540_0 = stackOut_539_0;
                    statePc = 540;
                    continue stateLoop;
                }
                case 540: {
                    if (stackIn_540_0 < (var11.field_r ^ -1)) {
                        statePc = 550;
                    } else {
                        statePc = 543;
                    }
                    continue stateLoop;
                }
                case 543: {
                    stackOut_543_0 = (tl) var11;
                    stackIn_544_0 = stackOut_543_0;
                    statePc = 544;
                    continue stateLoop;
                }
                case 544: {
                    if ((stackIn_544_0.field_r ^ -1) < -32) {
                        statePc = 550;
                    } else {
                        statePc = 547;
                    }
                    continue stateLoop;
                }
                case 547: {
                    if (var21 == 0) {
                        statePc = 554;
                    } else {
                        statePc = 550;
                    }
                    continue stateLoop;
                }
                case 550: {
                    if (!var11.a(0, ((bi) this).field_P.field_g)) {
                        statePc = 554;
                    } else {
                        statePc = 553;
                    }
                    continue stateLoop;
                }
                case 553: {
                    var11.field_t = (tl) (Object) var9_array;
                    var9_ref = var11;
                    var11.a(80);
                    ((bi) this).field_D[var10] = null;
                    statePc = 554;
                    continue stateLoop;
                }
                case 554: {
                    var10++;
                    if (var21 == 0) {
                        statePc = 530;
                    } else {
                        statePc = 555;
                    }
                    continue stateLoop;
                }
                case 555: {
                    stackOut_555_0 = null;
                    stackOut_555_1 = (tl) var9_ref;
                    stackIn_556_0 = stackOut_555_0;
                    stackIn_556_1 = (Object) (Object) stackOut_555_1;
                    statePc = 556;
                    continue stateLoop;
                }
                case 556: {
                    if (stackIn_556_0 == stackIn_556_1) {
                        statePc = 562;
                    } else {
                        statePc = 557;
                    }
                    continue stateLoop;
                }
                case 557: {
                    var9_ref.a((bi) this, 19);
                    var9_ref = var9_ref.field_t;
                    stackOut_557_0 = var21;
                    stackIn_558_0 = stackOut_557_0;
                    statePc = 558;
                    continue stateLoop;
                }
                case 558: {
                    if (stackIn_558_0 != 0) {
                        statePc = 572;
                    } else {
                        statePc = 559;
                    }
                    continue stateLoop;
                }
                case 559: {
                    if (var21 == 0) {
                        statePc = 555;
                    } else {
                        statePc = 562;
                    }
                    continue stateLoop;
                }
                case 562: {
                    if (jb.field_d != 10) {
                        statePc = 572;
                    } else {
                        statePc = 563;
                    }
                    continue stateLoop;
                }
                case 563: {
                    stackOut_563_0 = la.field_k;
                    stackIn_564_0 = stackOut_563_0;
                    statePc = 564;
                    continue stateLoop;
                }
                case 564: {
                    if (((wl) (Object) stackIn_564_0[10]).e(17)) {
                        statePc = 572;
                    } else {
                        statePc = 567;
                    }
                    continue stateLoop;
                }
                case 567: {
                    np.a(la.field_k[((bi) this).field_q], false, 127);
                    statePc = 572;
                    continue stateLoop;
                }
                case 572: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(int param0) {
        try {
            field_u = null;
            field_I = null;
            field_f = null;
            if (param0 != -3) {
                af discarded$0 = bi.a((sm) null, 58);
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bi.V(" + param0 + 41);
        }
    }

    private final void b(int param0, int param1) {
        try {
            ((bi) this).b(param0 ^ 5);
            eq.field_b = param1;
            ((bi) this).field_A.a(true, 5, 2, false);
            la.field_k[param0].a(false);
            jh.a(la.field_k[12], param0 ^ 12);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bi.W(" + param0 + 44 + param1 + 41);
        }
    }

    bi(Torquing param0, int param1) {
        RuntimeException var3 = null;
        StringBuilder var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Torquing.field_u;
                    ((bi) this).field_t = false;
                    ((bi) this).field_e = new ei();
                    ((bi) this).field_B = new ei();
                    ((bi) this).field_E = 1365;
                    ((bi) this).field_N = -17;
                    ((bi) this).field_S = -1878996731;
                    ((bi) this).field_L = 0;
                    ((bi) this).field_H = 80;
                    ((bi) this).field_w = false;
                    ((bi) this).field_F = 68616224;
                    ((bi) this).field_G = 0;
                    ((bi) this).field_i = tp.field_a;
                    ((bi) this).field_n = 0;
                    ((bi) this).field_v = 0;
                    ((bi) this).field_a = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
                    ((bi) this).field_Q = new kg[1];
                    ((bi) this).field_c = 0;
                    ((bi) this).field_b = new int[qc.field_ab.length];
                    ((bi) this).field_z = 0;
                    ((bi) this).field_J = false;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((bi) this).field_o = 50456792;
                        ((bi) this).field_A = param0;
                        dd.field_d = 0;
                        ao.field_f = 0;
                        ((bi) this).field_M = -1046390103;
                        ((bi) this).field_G = ((bi) this).field_G + (param1 + (param1 << -954880442));
                        ((bi) this).field_S = ((bi) this).field_S + ((bi) this).field_N * ((param1 << -1531723610) + param1);
                        ((bi) this).field_l = -547216422;
                        ((bi) this).field_j = 538264946;
                        ((bi) this).field_L = param1;
                        if (null == gj.field_i) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        gj.field_i = new int[12];
                        int[] discarded$3 = ap.a(gj.field_i, il.field_m[((bi) this).field_v]);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((bi) this).field_T == null) {
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
                        statePc = 14;
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
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3_ref = new StringBuilder(104);
                        var4 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var4 ^ -1) <= -9) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        StringBuilder discarded$4 = var3_ref.append("<col=ffffff>");
                        StringBuilder discarded$5 = var3_ref.append(fh.field_s.charAt(var4));
                        var4++;
                        if (var5 != 0) {
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
                        if (var5 == 0) {
                            statePc = 8;
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
                        ((bi) this).field_T = var3_ref.toString();
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
                        ((bi) this).field_d = ol.field_f[param1];
                        ((bi) this).field_q = 1 + wi.field_a[param1];
                        ((bi) this).field_P = new vg();
                        this.h(104);
                        vl.field_c = null;
                        gn.field_l = null;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        stackOut_17_0 = (RuntimeException) var3;
                        stackOut_17_1 = new StringBuilder().append("bi.<init>(");
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param0 == null) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_21_2 = stackOut_18_2;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 20: {
                    stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                    stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                    stackOut_20_2 = "null";
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw rb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 41);
                }
                case 22: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = null;
        field_I = "Suggested names: ";
    }
}
