/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    private int field_C;
    private int[][] field_u;
    private static int[] field_l;
    private static int[] field_z;
    static int field_f;
    private ti[] field_D;
    private static int[] field_d;
    private static int[] field_t;
    static t[] field_e;
    private int[] field_F;
    int field_y;
    private int[][] field_v;
    private int[][] field_c;
    private static short[][] field_r;
    static int field_s;
    private static short[][] field_B;
    static int field_o;
    private int[] field_p;
    private static int[] field_k;
    private static int[] field_E;
    private static kh field_b;
    private int[] field_m;
    private int field_j;
    private boolean[] field_x;
    private int field_A;
    kh[] field_g;
    private int[][] field_G;
    private static boolean[] field_w;
    private int[] field_i;
    private int[] field_h;
    private static int[] field_n;
    private int[] field_q;
    static t[] field_a;

    final static void c() {
        field_b = new kh();
        field_b.field_k = (pj) (Object) new rm(0, 0, 0).a(0, 0, 1, 0, 0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((sg) this).field_F[param0] = param1;
        ((sg) this).field_h[param0] = param2;
        ((sg) this).field_i[param0] = param3;
    }

    final void a(int param0, ti[] param1) {
        ti[] var3 = null;
        int var4 = 0;
        ti[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ti[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ti[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ti[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ti stackIn_11_2 = null;
        ti[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ti[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ti[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_8_2 = null;
        ti[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ti stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 != null) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((sg) this).field_D[param0] = null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 3: {
                    var3 = new ti[param1.length];
                    ((sg) this).field_D = var3;
                    var4 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        if (var4 >= param1.length) {
                            statePc = 12;
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
                        stackOut_5_0 = (ti[]) var3;
                        stackOut_5_1 = var4;
                        stackIn_10_0 = stackOut_5_0;
                        stackIn_10_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (param1[var4] != null) {
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
                        stackOut_6_0 = (ti[]) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
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
                        stackOut_8_0 = (ti[]) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = null;
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = (ti) (Object) stackOut_8_2;
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
                    stackOut_10_0 = (ti[]) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = param1[var4].c((byte) 90);
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                    var4++;
                    statePc = 4;
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(int param0, int param1) {
        pj var3 = null;
        mp var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ec var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16_int = 0;
        ti var16 = null;
        int var17 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_28_0 = 0;
        Object stackIn_37_0 = null;
        ti stackIn_43_0 = null;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_97_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackIn_108_0 = 0;
        int stackOut_2_0 = 0;
        short stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        short stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_27_0 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_40_0 = null;
        ti stackOut_42_0 = null;
        int stackOut_46_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_96_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_107_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ((sg) this).field_g[param0].field_k;
                    var4 = ((sg) this).field_g[param0].field_q;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var4.field_q != null) {
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
                        stackOut_2_0 = -1;
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
                    throw (RuntimeException) (Object) caughtException;
                }
                case 4: {
                    stackOut_4_0 = var4.field_q[param1];
                    stackIn_5_0 = stackOut_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var5 = stackIn_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        if (var3.field_l[param1] == -1) {
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
                        stackOut_7_0 = 1;
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
                    throw (RuntimeException) (Object) caughtException;
                }
                case 9: {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var6 = stackIn_10_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        if (var3.field_z != null) {
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
                        stackOut_12_0 = -1;
                        stackIn_15_0 = stackOut_12_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 14: {
                    stackOut_14_0 = var3.field_z[param1];
                    stackIn_15_0 = stackOut_14_0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var7 = stackIn_15_0;
                    var8 = var3.field_p[param1];
                    var9 = var3.field_u[param1];
                    var10 = var3.field_t[param1];
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        field_k[0] = ((sg) this).field_v[param0][var8];
                        field_k[1] = ((sg) this).field_v[param0][var9];
                        field_k[2] = ((sg) this).field_v[param0][var10];
                        field_n[0] = ((sg) this).field_c[param0][var8];
                        field_n[1] = ((sg) this).field_c[param0][var9];
                        field_n[2] = ((sg) this).field_c[param0][var10];
                        field_d[0] = ((sg) this).field_u[param0][var8];
                        field_d[1] = ((sg) this).field_u[param0][var9];
                        field_d[2] = ((sg) this).field_u[param0][var10];
                        if (var8 != var9) {
                            statePc = 23;
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
                        stackOut_17_0 = var8;
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
                        if (stackIn_18_0 != var10) {
                            statePc = 23;
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
                        statePc = 21;
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
                case 21: {
                    try {
                        this.c(var7);
                        return;
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
                    var11 = var3.field_f[param1];
                    var12 = var3.field_s[param1];
                    var13 = var3.field_l[param1];
                    if (var5 == -1) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var14_int = var3.field_h[var5];
                    var15 = var3.field_g[var5];
                    var16_int = var3.field_i[var5];
                    g.field_b[0] = ((sg) this).field_v[param0][var14_int];
                    g.field_b[1] = ((sg) this).field_v[param0][var15];
                    g.field_b[2] = ((sg) this).field_v[param0][var16_int];
                    g.field_c[0] = ((sg) this).field_c[param0][var14_int];
                    g.field_c[1] = ((sg) this).field_c[param0][var15];
                    g.field_c[2] = ((sg) this).field_c[param0][var16_int];
                    g.field_a[0] = ((sg) this).field_u[param0][var14_int];
                    g.field_a[1] = ((sg) this).field_u[param0][var15];
                    g.field_a[2] = ((sg) this).field_u[param0][var16_int];
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var14 = be.field_c;
                    var15 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        if (field_f <= 0) {
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
                        stackOut_27_0 = var7;
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
                        if (stackIn_28_0 != -1) {
                            statePc = 35;
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
                        if (var5 == -1) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 34: {
                    var16_int = var14.b(var7);
                    var11 = be.a(var16_int, var11);
                    var12 = be.a(var16_int, var12);
                    var13 = be.a(var16_int, var13);
                    var5 = -1;
                    var15 = 1;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    try {
                        if (param0 != 0) {
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
                        stackOut_36_0 = this;
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
                        if (((sg) this).field_D != null) {
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
                        stackOut_40_0 = null;
                        stackIn_43_0 = (ti) (Object) stackOut_40_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 42: {
                    stackOut_42_0 = ((sg) this).field_D[param1];
                    stackIn_43_0 = stackOut_42_0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var16 = stackIn_43_0;
                    if (var16 == null) {
                        statePc = 95;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var17 = var16.a((byte) 91);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    try {
                        if (var17 == 1) {
                            statePc = 54;
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
                        stackOut_46_0 = var17;
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
                        if (stackIn_47_0 != 2) {
                            statePc = 73;
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
                        stackOut_50_0 = var5;
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
                        if (stackIn_51_0 == -1) {
                            statePc = 73;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var5 != -1) {
                            statePc = 63;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = var6;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 63: {
                    try {
                        if (var5 != -1) {
                            statePc = 71;
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
                        if (var6 != 0) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 67: {
                    be.field_c = var16.a(var11, -114);
                    var11 = 128;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    try {
                        if (var15 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        g.a(field_k, field_n, field_d, new int[3], new int[3]);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 71: {
                    be.field_c = var16.a(122, var7, var14);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    var5 = 0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 73: {
                    try {
                        if (var17 != 2) {
                            statePc = 94;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = var11;
                        stackOut_74_1 = 64;
                        stackIn_79_0 = stackOut_74_0;
                        stackIn_79_1 = stackOut_74_1;
                        stackIn_75_0 = stackOut_74_0;
                        stackIn_75_1 = stackOut_74_1;
                        if (var5 == -1) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = stackIn_75_0;
                        stackOut_75_1 = stackIn_75_1;
                        stackIn_77_0 = stackOut_75_0;
                        stackIn_77_1 = stackOut_75_1;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackOut_77_0 = stackIn_77_0;
                        stackOut_77_1 = stackIn_77_1;
                        stackOut_77_2 = 1;
                        stackIn_80_0 = stackOut_77_0;
                        stackIn_80_1 = stackOut_77_1;
                        stackIn_80_2 = stackOut_77_2;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 78: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 79: {
                    stackOut_79_0 = stackIn_79_0;
                    stackOut_79_1 = stackIn_79_1;
                    stackOut_79_2 = 0;
                    stackIn_80_0 = stackOut_79_0;
                    stackIn_80_1 = stackOut_79_1;
                    stackIn_80_2 = stackOut_79_2;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    var11 = sg.a(stackIn_80_0, stackIn_80_1, stackIn_80_2 != 0);
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    try {
                        if (var6 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackOut_82_0 = var12;
                        stackOut_82_1 = 64;
                        stackIn_87_0 = stackOut_82_0;
                        stackIn_87_1 = stackOut_82_1;
                        stackIn_83_0 = stackOut_82_0;
                        stackIn_83_1 = stackOut_82_1;
                        if (var5 == -1) {
                            statePc = 87;
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
                        stackOut_83_0 = stackIn_83_0;
                        stackOut_83_1 = stackIn_83_1;
                        stackIn_85_0 = stackOut_83_0;
                        stackIn_85_1 = stackOut_83_1;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackOut_85_0 = stackIn_85_0;
                        stackOut_85_1 = stackIn_85_1;
                        stackOut_85_2 = 1;
                        stackIn_88_0 = stackOut_85_0;
                        stackIn_88_1 = stackOut_85_1;
                        stackIn_88_2 = stackOut_85_2;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 86: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 87: {
                    stackOut_87_0 = stackIn_87_0;
                    stackOut_87_1 = stackIn_87_1;
                    stackOut_87_2 = 0;
                    stackIn_88_0 = stackOut_87_0;
                    stackIn_88_1 = stackOut_87_1;
                    stackIn_88_2 = stackOut_87_2;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var12 = sg.a(stackIn_88_0, stackIn_88_1, stackIn_88_2 != 0);
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    try {
                        stackOut_89_0 = var13;
                        stackOut_89_1 = 64;
                        stackIn_92_0 = stackOut_89_0;
                        stackIn_92_1 = stackOut_89_1;
                        stackIn_90_0 = stackOut_89_0;
                        stackIn_90_1 = stackOut_89_1;
                        if (var5 == -1) {
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
                        stackOut_90_0 = stackIn_90_0;
                        stackOut_90_1 = stackIn_90_1;
                        stackOut_90_2 = 1;
                        stackIn_93_0 = stackOut_90_0;
                        stackIn_93_1 = stackOut_90_1;
                        stackIn_93_2 = stackOut_90_2;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 91: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 92: {
                    stackOut_92_0 = stackIn_92_0;
                    stackOut_92_1 = stackIn_92_1;
                    stackOut_92_2 = 0;
                    stackIn_93_0 = stackOut_92_0;
                    stackIn_93_1 = stackOut_92_1;
                    stackIn_93_2 = stackOut_92_2;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    var13 = sg.a(stackIn_93_0, stackIn_93_1, stackIn_93_2 != 0);
                    statePc = 95;
                    continue stateLoop;
                }
                case 94: {
                    ((sg) this).field_D[param1] = null;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    try {
                        if (var5 != -1) {
                            statePc = 103;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackOut_96_0 = var6;
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
                        if (stackIn_97_0 == 0) {
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
                        stackOut_100_0 = 0;
                        stackIn_108_0 = stackOut_100_0;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 101: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 102: {
                    stackOut_102_0 = 1;
                    stackIn_108_0 = stackOut_102_0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 103: {
                    try {
                        stackOut_103_0 = var5 << 2 | 2;
                        stackIn_106_0 = stackOut_103_0;
                        stackIn_104_0 = stackOut_103_0;
                        if (var6 == 0) {
                            statePc = 106;
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
                        stackOut_104_0 = stackIn_104_0;
                        stackOut_104_1 = 0;
                        stackIn_107_0 = stackOut_104_0;
                        stackIn_107_1 = stackOut_104_1;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 105: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 106: {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = 1;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    stackOut_107_0 = stackIn_107_0 | stackIn_107_1;
                    stackIn_108_0 = stackOut_107_0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    var17 = stackIn_108_0;
                    nf.a(var17, var7, field_k, field_n, field_d, var11, var12, var13);
                    be.field_c = var14;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        t var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        t var8 = null;
        t var9 = null;
        t var10 = null;
        int var11 = 0;
        int var12 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = field_d[0];
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var2 >= 50) {
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
                        return;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 4: {
                    var3 = be.field_g + (field_k[0] << 9) / var2;
                    var4 = be.field_b + (field_n[0] << 9) / var2;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        if (param0 != -32768) {
                            statePc = 26;
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
                        if (ie.field_b != null) {
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
                        return;
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
                    var5_int = ie.field_b.field_P.field_f[3];
                    var6 = ie.field_b.field_P.field_f[4];
                    var7 = ie.field_b.field_P.field_f[5];
                    var11 = field_o >> 1 & 7;
                    if (var5_int < 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var8 = field_a[0 + var11];
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    var8 = field_a[24 + var11];
                    var5_int = -var5_int;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var6 < 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var9 = field_a[8 + var11];
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    var9 = field_a[32 + var11];
                    var6 = -var6;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var7 < 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10 = field_a[16 + var11];
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    var10 = field_a[40 + var11];
                    var7 = -var7;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var12 = var5_int + var6 + var7;
                    var5_int = (var5_int << 8) / var12;
                    var6 = (var6 << 8) / var12;
                    var7 = 256 - var5_int - var6;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        if (var7 >= 0) {
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
                        System.err.println(var5_int + "\t" + var6 + "\t" + var7);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 25: {
                    sg.a(var3 - (var8.field_w >> 1), var4 - (var8.field_u >> 1), var5_int, var8, var6, var9, var7, var10);
                    return;
                }
                case 26: {
                    var5 = field_e[param0];
                    var5.d(var3 - (var5.field_w >> 1), var4 - (var5.field_u >> 1));
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final ti b(int param0) {
        pj var2 = ((sg) this).field_g[0].field_k;
        int var3 = var2.field_p[param0];
        int var4 = var2.field_u[param0];
        int var5 = var2.field_t[param0];
        mp var6 = ((sg) this).field_g[0].field_q;
        int[] var7 = var6.field_s[0];
        int[] var8 = var6.field_s[1];
        int[] var9 = var6.field_s[2];
        int[] var10 = new int[]{var7[var3], var7[var4], var7[var5]};
        int[] var11 = new int[]{var8[var3], var8[var4], var8[var5]};
        int[] var12 = new int[]{var9[var3], var9[var4], var9[var5]};
        int var13 = var6.field_u[param0];
        return new ti(var10, var11, var12, var13);
    }

    private final static int a(int param0, int param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
          } else {
            return pj.a(param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw decompiledCaughtException;
        }
        return pj.a(param0, param1);
    }

    final void b(lm param0) {
        ti[] var2 = null;
        int var3 = 0;
        ti var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((sg) this).field_D == null) {
                        statePc = 9;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var2 = ((sg) this).field_D;
                    var3 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var3 >= var2.length) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var4 = var2[var3];
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        if (var4 == null) {
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
                        var4.a(param0, 2);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 8: {
                    var3++;
                    statePc = 2;
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int[] param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        pj var15 = null;
        int var16 = 0;
        int[][] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int stackIn_4_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (field_f > 1) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 1;
                        stackIn_4_0 = stackOut_1_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 3: {
                    stackOut_3_0 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    be.field_m = stackIn_4_0 != 0;
                    var5 = param0[3];
                    var6 = param0[6];
                    var7 = param0[9];
                    var8 = param0[4];
                    var9 = param0[7];
                    var10 = param0[10];
                    var11 = param0[5];
                    var12 = param0[8];
                    var13 = param0[11];
                    var14_int = -param0[0];
                    var15_int = -param0[1];
                    var16 = -param0[2];
                    var2 = var14_int * var5 + var15_int * var8 + var16 * var11 >> 16;
                    var3 = var14_int * var6 + var15_int * var9 + var16 * var12 >> 16;
                    var4 = var14_int * var7 + var15_int * var10 + var16 * var13 >> 16;
                    ((sg) this).field_A = 2147483647;
                    ((sg) this).field_j = 2147483647;
                    ((sg) this).field_C = -2147483648;
                    var14_int = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        if (var14_int >= ((sg) this).field_g.length) {
                            statePc = 19;
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
                        if (!((sg) this).field_x[var14_int]) {
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
                        statePc = 18;
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
                    var15 = ((sg) this).field_g[var14_int].field_k;
                    var16 = var15.field_k;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        if (var16 != 0) {
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
                        statePc = 18;
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
                    var17 = ((sg) this).field_g[var14_int].field_q.field_s;
                    var18 = var17[0];
                    var19 = var17[1];
                    var20 = var17[2];
                    var21 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var21 >= var16) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var22 = ((sg) this).field_F[var14_int] + var18[var21];
                    var23 = ((sg) this).field_h[var14_int] + var19[var21];
                    var24 = ((sg) this).field_i[var14_int] + var20[var21];
                    ((sg) this).field_A = Math.min(var23, ((sg) this).field_A);
                    ((sg) this).field_v[var14_int][var21] = var2 + (var22 * var5 + var23 * var8 + var24 * var11 >> 16);
                    ((sg) this).field_c[var14_int][var21] = var3 + (var22 * var6 + var23 * var9 + var24 * var12 >> 16);
                    var24 = var4 + (var22 * var7 + var23 * var10 + var24 * var13 >> 16);
                    ((sg) this).field_u[var14_int][var21] = var24;
                    ((sg) this).field_j = Math.min(var24, ((sg) this).field_j);
                    ((sg) this).field_C = Math.max(var24, ((sg) this).field_C);
                    var21++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 18: {
                    var14_int++;
                    statePc = 5;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        this.b();
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    var14 = (RuntimeException) (Object) caughtException;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final static void a(int[] param0, int param1, int[] param2, int param3, int[] param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_4_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!ia.a(-22426, 0)) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 16744448;
                        stackIn_4_0 = stackOut_1_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 3: {
                    stackOut_3_0 = 16711935;
                    stackIn_4_0 = stackOut_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var13 = stackIn_4_0;
                    var14 = -param10;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var14 >= 0) {
                        statePc = 13;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var15 = -param9;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var15 >= 0) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var16 = param1 * (param2[param7] & 255) + param3 * (param4[param7] & 255) + param5 * (param6[param7] & 255) >> 8;
                    param7++;
                    if (var16 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var17 = (var13 & 16711935) * var16;
                    var18 = (var17 & -16711936) + (var13 * var16 - var17 & 16711680) >>> 8;
                    var17 = param0[param8];
                    var19 = var18 + var17;
                    var18 = (var18 & 16711935) + (var17 & 16711935);
                    var17 = (var18 & 16777472) + (var19 - var18 & 65536);
                    param8++;
                    param0[param8] = var19 - var17 | var17 - (var17 >>> 8);
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    param8++;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var15++;
                    statePc = 7;
                    continue stateLoop;
                }
                case 12: {
                    param8 = param8 + param11;
                    param7 = param7 + param12;
                    var14++;
                    statePc = 5;
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, kh param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int[] var5_array = null;
        mp var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        mp stackIn_25_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        mp stackOut_24_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1.field_k == null) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = param1.field_k.field_k;
                        stackIn_4_0 = stackOut_1_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 3: {
                    stackOut_3_0 = param1.field_l.field_f;
                    stackIn_4_0 = stackOut_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var3 = stackIn_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        if (param1.field_k == null) {
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
                        stackOut_6_0 = param1.field_k.field_x;
                        stackIn_9_0 = stackOut_6_0;
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
                    stackOut_8_0 = param1.field_l.field_g;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var4 = stackIn_9_0;
                    ((sg) this).field_v[param0] = new int[var3];
                    ((sg) this).field_c[param0] = new int[var3];
                    ((sg) this).field_u[param0] = new int[var3];
                    ((sg) this).field_G[param0] = new int[var4];
                    if (((sg) this).field_g[param0] == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var6 = ((sg) this).field_g[param0].field_q;
                    var6.field_r = var6.field_r - 1;
                    var5_array = var6.field_t;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    var5_array = null;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    ((sg) this).field_g[param0] = param1;
                    var6 = param1.field_q;
                    if (var6 != null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var6 = new mp();
                    param1.field_q = new mp();
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        var6.field_r = var6.field_r + 1;
                        if (var5_array != null) {
                            statePc = 19;
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
                        if (var6.field_s != null) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 18: {
                    var5_array = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        if (var5_array == null) {
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
                        ((sg) this).a(param1, var5_array);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 23: {
                    try {
                        if (param1.field_l != null) {
                            statePc = 31;
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
                        stackOut_24_0 = (mp) var6;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0.field_t != null) {
                            statePc = 31;
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
                        var6.field_t = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
                        this.a(param1);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 31: {
                    try {
                        ((sg) this).field_x[param0] = false;
                        if (param0 != 0) {
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
                        ((sg) this).field_D = null;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 35: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(int param0) {
        ((sg) this).a(param0, field_b);
        ((sg) this).field_x[param0] = true;
    }

    private final int b(int param0, int param1) {
        pj var3 = ((sg) this).field_g[param0].field_k;
        int var4 = var3.field_p[param1];
        int var5 = var3.field_u[param1];
        int var6 = var3.field_t[param1];
        int var7 = ((sg) this).field_u[param0][var4];
        int var8 = ((sg) this).field_u[param0][var5];
        int var9 = ((sg) this).field_u[param0][var6];
        return Math.max(Math.max(var7, var8), var9) - ((sg) this).field_j;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((sg) this).field_g[param0].field_k != null) {
              break L0;
            } else {
              sg.a(((sg) this).field_g[param0], param1, param2, param3, param4, param5);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        throw decompiledCaughtException;
    }

    final void a(lm param0) {
        pj var2 = null;
        mp var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        boolean[] var12 = null;
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
        boolean[] stackIn_7_0 = null;
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        boolean[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        boolean[] stackIn_35_0 = null;
        boolean[] stackIn_39_0 = null;
        boolean[] stackIn_43_0 = null;
        boolean[] stackOut_6_0 = null;
        boolean[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        boolean[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        boolean[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        boolean[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        boolean[] stackOut_34_0 = null;
        boolean[] stackOut_38_0 = null;
        boolean[] stackOut_42_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ((sg) this).field_g[0].field_k;
                    var3 = ((sg) this).field_g[0].field_q;
                    var4 = var3.field_s[0];
                    var5 = var3.field_s[1];
                    var6 = var3.field_s[2];
                    var7 = var2.field_p;
                    var8 = var2.field_u;
                    var9 = var2.field_t;
                    var10 = var4.length;
                    var11 = var7.length;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((sg) this).field_D != null) {
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
                        ((sg) this).field_D = new ti[var11];
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 5: {
                    try {
                        if (field_w == null) {
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
                        stackOut_6_0 = (boolean[]) field_w;
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
                        if (stackIn_7_0.length >= var10) {
                            statePc = 13;
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
                        field_w = new boolean[var10];
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 13: {
                    var12 = field_w;
                    var13 = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        if (var13 >= var10) {
                            statePc = 22;
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
                        stackOut_15_0 = (boolean[]) var12;
                        stackOut_15_1 = var13;
                        stackIn_20_0 = stackOut_15_0;
                        stackIn_20_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param0.a(var4[var13], var5[var13], var6[var13]) != 2) {
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
                        stackOut_16_0 = (boolean[]) (Object) stackIn_16_0;
                        stackOut_16_1 = stackIn_16_1;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
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
                        stackOut_18_0 = (boolean[]) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = 1;
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
                    stackOut_20_0 = (boolean[]) (Object) stackIn_20_0;
                    stackOut_20_1 = stackIn_20_1;
                    stackOut_20_2 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_21_0[stackIn_21_1] = stackIn_21_2 != 0;
                    var13++;
                    statePc = 14;
                    continue stateLoop;
                }
                case 22: {
                    var13 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    try {
                        if (var13 >= var11) {
                            statePc = 62;
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
                        if (var2.field_l[var13] != -2) {
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
                        statePc = 61;
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
                    var14 = var7[var13];
                    var15 = var8[var13];
                    var16 = var9[var13];
                    var17 = var4[var14] - var4[var15];
                    var18 = var5[var14] - var5[var15];
                    var19 = var6[var14] - var6[var15];
                    var20 = var4[var16] - var4[var15];
                    var21 = var5[var16] - var5[var15];
                    var22 = var6[var16] - var6[var15];
                    var23 = var19 * var21 - var18 * var22;
                    var24 = var17 * var22 - var19 * var20;
                    var25 = var18 * var20 - var17 * var21;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    try {
                        if (var23 * -1 + var24 * -12 + var25 * 12 > 0) {
                            statePc = 33;
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
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 33: {
                    try {
                        if (param0.a()) {
                            statePc = 53;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = (boolean[]) var12;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0[var14]) {
                            statePc = 46;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = (boolean[]) var12;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0[var15]) {
                            statePc = 46;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
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
                        stackOut_42_0 = (boolean[]) var12;
                        stackIn_43_0 = stackOut_42_0;
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
                        if (!stackIn_43_0[var16]) {
                            statePc = 53;
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
                        if (((sg) this).field_D[var13] != null) {
                            statePc = 52;
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
                        ((sg) this).field_D[var13] = this.b(var13);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 52: {
                    ((sg) this).field_D[var13].a(true, param0);
                    statePc = 61;
                    continue stateLoop;
                }
                case 53: {
                    try {
                        if (!param0.a(var4[var14], var5[var14], var6[var14], var4[var15], var5[var15], var6[var15], var4[var16], var5[var16], var6[var16], var23, var24, var25)) {
                            statePc = 61;
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
                        if (((sg) this).field_D[var13] != null) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
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
                        ((sg) this).field_D[var13] = this.b(var13);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 60: {
                    ((sg) this).field_D[var13].a(true, param0);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var13++;
                    statePc = 23;
                    continue stateLoop;
                }
                case 62: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ti[] a(int param0) {
        ti[] var2 = null;
        ti[] var3 = null;
        int var4 = 0;
        ti[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ti[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ti[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ti[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ti stackIn_12_2 = null;
        ti[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ti[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ti[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_9_2 = null;
        ti[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ti stackOut_11_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ((sg) this).field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var2 != null) {
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
                        return null;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 4: {
                    var3 = new ti[var2.length];
                    var4 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        if (var4 >= var3.length) {
                            statePc = 13;
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
                        stackOut_6_0 = (ti[]) var3;
                        stackOut_6_1 = var4;
                        stackIn_11_0 = stackOut_6_0;
                        stackIn_11_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (var2[var4] != null) {
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
                        stackOut_7_0 = (ti[]) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
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
                        stackOut_9_0 = (ti[]) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = null;
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = (ti) (Object) stackOut_9_2;
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
                    stackOut_11_0 = (ti[]) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = var2[var4].c((byte) 56);
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_12_0[stackIn_12_1] = stackIn_12_2;
                    var4++;
                    statePc = 5;
                    continue stateLoop;
                }
                case 13: {
                    return var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, pj param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
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
        Object stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_19_0 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_49_0 = 0;
        int stackIn_66_0 = 0;
        int[] stackIn_79_0 = null;
        int[] stackIn_83_0 = null;
        int[] stackIn_90_0 = null;
        int[] stackIn_94_0 = null;
        int[] stackIn_101_0 = null;
        int[] stackIn_105_0 = null;
        int[] stackIn_112_0 = null;
        int[] stackIn_116_0 = null;
        int[] stackIn_123_0 = null;
        int[] stackIn_127_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int[] stackOut_36_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_65_0 = 0;
        int[] stackOut_78_0 = null;
        int[] stackOut_82_0 = null;
        int[] stackOut_89_0 = null;
        int[] stackOut_93_0 = null;
        int[] stackOut_100_0 = null;
        int[] stackOut_104_0 = null;
        int[] stackOut_111_0 = null;
        int[] stackOut_115_0 = null;
        int[] stackOut_122_0 = null;
        int[] stackOut_126_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1.field_l[param2] != -2) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        return true;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 3: {
                    var4 = param1.field_p[param2];
                    var5 = param1.field_u[param2];
                    var6 = param1.field_t[param2];
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        if (var4 != var5) {
                            statePc = 20;
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
                        if (var4 == var6) {
                            statePc = 18;
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
                        if (((sg) this).field_u[param0][var4] >= 50) {
                            statePc = 18;
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
                        if (((sg) this).field_u[param0][var6] >= 50) {
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
                    throw (RuntimeException) (Object) caughtException;
                }
                case 18: {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    var7 = ((sg) this).field_v[param0];
                    var8 = ((sg) this).field_c[param0];
                    var9 = ((sg) this).field_u[param0];
                    field_t[0] = -5000;
                    field_t[1] = -5000;
                    field_t[2] = -5000;
                    var10 = var9[var4];
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        if (var10 < 50) {
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
                        field_t[0] = be.field_g + (var7[var4] << 9) / var10;
                        field_l[0] = be.field_b + (var8[var4] << 9) / var10;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 25: {
                    var11 = var9[var5];
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        if (var11 < 50) {
                            statePc = 30;
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
                        field_t[1] = be.field_g + (var7[var5] << 9) / var11;
                        field_l[1] = be.field_b + (var8[var5] << 9) / var11;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 30: {
                    var12 = var9[var6];
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    try {
                        if (var12 < 50) {
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
                        field_t[2] = be.field_g + (var7[var6] << 9) / var12;
                        field_l[2] = be.field_b + (var8[var6] << 9) / var12;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 35: {
                    try {
                        if (field_t[0] == -5000) {
                            statePc = 43;
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
                        stackOut_36_0 = (int[]) field_t;
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
                        if (stackIn_37_0[1] == -5000) {
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
                        if (field_t[2] != -5000) {
                            statePc = 61;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 43: {
                    var13 = var7[var4];
                    var14 = var7[var5];
                    var15 = var7[var6];
                    var16 = var8[var4];
                    var17 = var8[var5];
                    var18 = var8[var6];
                    var13 = var13 - var14;
                    var15 = var15 - var14;
                    var16 = var16 - var17;
                    var18 = var18 - var17;
                    var10 = var10 - var11;
                    var12 = var12 - var11;
                    var19 = var16 * var12 - var10 * var18;
                    var20 = var10 * var15 - var13 * var12;
                    var21 = var13 * var18 - var16 * var15;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    try {
                        if (var14 * var19 + var17 * var20 + var11 * var21 > 0) {
                            statePc = 77;
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
                        if (field_s != 12) {
                            statePc = 59;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = param0;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 != 0) {
                            statePc = 59;
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
                        if (((sg) this).field_D == null) {
                            statePc = 58;
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
                        ((sg) this).field_D[param2] = null;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 58: {
                    return false;
                }
                case 59: {
                    return true;
                }
                case 61: {
                    try {
                        if ((field_t[0] - field_t[1]) * (field_l[2] - field_l[1]) - (field_l[0] - field_l[1]) * (field_t[2] - field_t[1]) > 0) {
                            statePc = 77;
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
                        if (field_s != 12) {
                            statePc = 76;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = param0;
                        stackIn_66_0 = stackOut_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (((sg) this).field_D == null) {
                            statePc = 75;
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
                        ((sg) this).field_D[param2] = null;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 74: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 75: {
                    return false;
                }
                case 76: {
                    return true;
                }
                case 77: {
                    try {
                        if (field_t[0] == -5000) {
                            statePc = 132;
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
                        stackOut_78_0 = (int[]) field_t;
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
                        if (stackIn_79_0[1] == -5000) {
                            statePc = 132;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackOut_82_0 = (int[]) field_t;
                        stackIn_83_0 = stackOut_82_0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (stackIn_83_0[2] == -5000) {
                            statePc = 132;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (field_t[0] >= 0) {
                            statePc = 97;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackOut_89_0 = (int[]) field_t;
                        stackIn_90_0 = stackOut_89_0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (stackIn_90_0[1] >= 0) {
                            statePc = 97;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackOut_93_0 = (int[]) field_t;
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
                        if (stackIn_94_0[2] < 0) {
                            statePc = 130;
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
                        if (field_t[0] <= be.field_p) {
                            statePc = 108;
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
                        stackOut_100_0 = (int[]) field_t;
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
                        if (stackIn_101_0[1] <= be.field_p) {
                            statePc = 108;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        stackOut_104_0 = (int[]) field_t;
                        stackIn_105_0 = stackOut_104_0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (stackIn_105_0[2] > be.field_p) {
                            statePc = 130;
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
                        if (field_l[0] >= 0) {
                            statePc = 119;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        stackOut_111_0 = (int[]) field_l;
                        stackIn_112_0 = stackOut_111_0;
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
                        if (stackIn_112_0[1] >= 0) {
                            statePc = 119;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackOut_115_0 = (int[]) field_l;
                        stackIn_116_0 = stackOut_115_0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (stackIn_116_0[2] < 0) {
                            statePc = 130;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (field_l[0] <= be.field_f) {
                            statePc = 132;
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
                        stackOut_122_0 = (int[]) field_l;
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
                        if (stackIn_123_0[1] <= be.field_f) {
                            statePc = 132;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        stackOut_126_0 = (int[]) field_l;
                        stackIn_127_0 = stackOut_126_0;
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (stackIn_127_0[2] <= be.field_f) {
                            statePc = 132;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
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
                case 130: {
                    try {
                        return true;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 131: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 132: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final static void a(int param0, int param1, int param2, t param3, int param4, t param5, int param6, t param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = 0;
                    var9 = param3.field_t;
                    var10 = param3.field_s;
                    var11 = ph.field_j - var10;
                    var12 = 0;
                    if (param1 >= ph.field_c) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var13 = ph.field_c - param1;
                    var9 = var9 - var13;
                    param1 = ph.field_c;
                    var8 = var8 + var13 * var10;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (param1 + var9 <= ph.field_h) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var9 = var9 - (param1 + var9 - ph.field_h);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (param0 >= ph.field_k) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var13 = ph.field_k - param0;
                    var10 = var10 - var13;
                    param0 = ph.field_k;
                    var8 = var8 + var13;
                    var12 = var12 + var13;
                    var11 = var11 + var13;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param0 + var10 <= ph.field_a) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var13 = param0 + var10 - ph.field_a;
                    var10 = var10 - var13;
                    var12 = var12 + var13;
                    var11 = var11 + var13;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        if (var10 <= 0) {
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
                        stackOut_9_0 = var9;
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
                        if (stackIn_10_0 > 0) {
                            statePc = 15;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
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
                    var13 = param0 + param1 * ph.field_j;
                    sg.a(ph.field_e, param2, param3.field_y, param4, param5.field_y, param6, param7.field_y, var8, var13, var10, var9, var11, var12);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(kh param0, int[] param1) {
        mp var3 = null;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        int var6_int = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        mp stackIn_6_0 = null;
        mp stackOut_5_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0.field_l != null) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        return;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 3: {
                    var3 = param0.field_q;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        if (var3 == null) {
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
                        stackOut_5_0 = (mp) var3;
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
                        if (stackIn_6_0.field_r > 0) {
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
                        return;
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
                    var4 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var4 >= 3) {
                        statePc = 29;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var5_int = -1;
                    var6_int = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        if (var6_int >= 3) {
                            statePc = 24;
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
                        if (param1[3 * var6_int + var4 + 3] != 65535) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 18: {
                    var5_int = var5_int + (var6_int + 1);
                    statePc = 23;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        if (param1[3 * var6_int + var4 + 3] == 0) {
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
                        var5_int -= 6;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 23: {
                    var6_int++;
                    statePc = 14;
                    continue stateLoop;
                }
                case 24: {
                    try {
                        if (var5_int < 0) {
                            statePc = 28;
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
                        param1[3 * var5_int + var4 + 3] = 65536;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 28: {
                    var4++;
                    statePc = 12;
                    continue stateLoop;
                }
                case 29: {
                    try {
                        if (var3.field_t != null) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var3.field_t = new int[12];
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 32: {
                    var4 = 1;
                    var5_int = 3;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    try {
                        if (var5_int >= 12) {
                            statePc = 39;
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
                        if (var3.field_t[var5_int] == param1[var5_int]) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 37: {
                    var4 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var5_int++;
                    statePc = 33;
                    continue stateLoop;
                }
                case 39: {
                    try {
                        if (var4 == 0) {
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
                        return;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 42: {
                    var4 = 3;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    try {
                        if (var4 >= 12) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var3.field_t[var4] = param1[var4];
                        var4++;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 46: {
                    var4 = param0.field_l.field_f;
                    var5 = param0.field_l.field_M;
                    var6 = param0.field_l.field_B;
                    var7 = param0.field_l.field_E;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    try {
                        if (var3.field_s != null) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var3.field_s = new int[][]{new int[var4], new int[var4], new int[var4]};
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 51: {
                    var8 = var3.field_s[0];
                    var9 = var3.field_s[1];
                    var10 = var3.field_s[2];
                    var11 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (var11 >= var4) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var12 = var5[var11];
                    var13 = var6[var11];
                    var14 = var7[var11];
                    var8[var11] = var12 * param1[3] + var13 * param1[6] + var14 * param1[9] >> 16;
                    var9[var11] = var12 * param1[4] + var13 * param1[7] + var14 * param1[10] >> 16;
                    var10[var11] = var12 * param1[5] + var13 * param1[8] + var14 * param1[11] >> 16;
                    var11++;
                    statePc = 52;
                    continue stateLoop;
                }
                case 54: {
                    var3.field_v = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a() {
        field_e = null;
        field_a = null;
        field_E = null;
        field_r = null;
        field_z = null;
        field_B = null;
        field_k = null;
        field_n = null;
        field_d = null;
        field_t = null;
        field_l = null;
        field_b = null;
        field_w = null;
    }

    private final void e(int param0) {
        int var2_int = 0;
        pj var2 = null;
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
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
                    var2_int = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var2_int >= 1024) {
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
                        field_E[var2_int] = 0;
                        var2_int++;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 4: {
                    var2 = ((sg) this).field_g[param0].field_k;
                    var3 = var2.field_x;
                    var4_int = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        if (var4_int >= var3) {
                            statePc = 11;
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
                        if (this.a(param0, var2, var4_int)) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 9: {
                    var5 = this.b(param0, var4_int);
                    field_E[var5 / 768] = field_E[var5 / 768] + 1;
                    field_r[var5 / 768][field_E[var5 / 768]] = (short) var4_int;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var4_int = (short)(var4_int + 1);
                    statePc = 5;
                    continue stateLoop;
                }
                case 11: {
                    var4 = ((sg) this).field_G[param0];
                    var5 = 0;
                    var6 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        if (var6 >= 1024) {
                            statePc = 33;
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
                        if (field_E[var6] != 0) {
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
                        statePc = 32;
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
                    var7 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        if (var7 >= 768) {
                            statePc = 22;
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
                        field_z[var7] = 0;
                        var7++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 22: {
                    var7 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var7 >= field_E[var6]) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var8 = field_r[var6][var7];
                    var9 = this.b(param0, var8);
                    field_z[var9 % 768] = field_z[var9 % 768] + 1;
                    field_B[var9 % 768][field_z[var9 % 768]] = (short) var8;
                    var7++;
                    statePc = 23;
                    continue stateLoop;
                }
                case 25: {
                    var7 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (var7 >= 768) {
                        statePc = 32;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var8 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    try {
                        if (var8 >= field_z[var7]) {
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
                        var5++;
                        var4[var5] = field_B[var7][var8];
                        var8++;
                        statePc = 28;
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
                    var7++;
                    statePc = 26;
                    continue stateLoop;
                }
                case 32: {
                    var6++;
                    statePc = 12;
                    continue stateLoop;
                }
                case 33: {
                    try {
                        if (var5 >= var4.length) {
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
                        var5++;
                        var4[var5] = -1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 36: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, int param1) {
        return ((sg) this).field_m[param0] > ((sg) this).field_m[param1];
    }

    private final static int[] a(short[] param0) {
        int[] var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var1 = new int[param0.length];
        var2 = 0;
        try {
          L0: while (true) {
            if (var2 >= var1.length) {
              break L0;
            } else {
              var1[var2] = param0[var2] & 65535;
              var2++;
              continue L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw decompiledCaughtException;
        }
        return var1;
    }

    private final void a(kh param0) {
        mp var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        kh stackIn_2_0 = null;
        mp stackIn_10_0 = null;
        kh stackOut_1_0 = null;
        mp stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0.field_k == null) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = (kh) param0;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (stackIn_2_0.field_k.field_k != 0) {
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
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        return;
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
                    var2 = param0.field_q;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        if (var2 == null) {
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
                        stackOut_9_0 = (mp) var2;
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
                        if (stackIn_10_0.field_r > 0) {
                            statePc = 15;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
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
                    var3 = param0.field_k.field_k;
                    var4 = param0.field_k.field_j;
                    var5 = param0.field_k.field_y;
                    var6 = param0.field_k.field_v;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        if (var2.field_s != null) {
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
                        var2.field_s = new int[][]{new int[var3], new int[var3], new int[var3]};
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 20: {
                    var7 = var2.field_s[0];
                    var8 = var2.field_s[1];
                    var9 = var2.field_s[2];
                    var10 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        if (var10 >= var3) {
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
                        var7[var10] = var4[var10];
                        var8[var10] = var5[var10];
                        var9[var10] = var6[var10];
                        var10++;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 24: {
                    var2.field_v = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(kh param0, int param1, int param2, int param3, int param4, int param5) {
        rm var6 = null;
        mp var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pj var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        dd var25_ref_dd = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        dd var34_ref_dd = null;
        dd var34_ref = null;
        int var34 = 0;
        int var35 = 0;
        rm stackIn_3_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_22_0 = null;
        int[] stackIn_26_0 = null;
        int[] stackIn_30_0 = null;
        pj stackIn_45_0 = null;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_75_0 = 0;
        rm stackIn_97_0 = null;
        int stackIn_103_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_132_0 = 0;
        rm stackOut_2_0 = null;
        int[] stackOut_17_0 = null;
        int[] stackOut_21_0 = null;
        int[] stackOut_25_0 = null;
        int[] stackOut_29_0 = null;
        pj stackOut_44_0 = null;
        int stackOut_62_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_74_0 = 0;
        rm stackOut_96_0 = null;
        int stackOut_100_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_131_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = param0.field_l;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var6 == null) {
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
                        stackOut_2_0 = (rm) var6;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0.field_f != 0) {
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
                        return;
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
                    var7 = param0.field_q;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        if (var7.field_r > 0) {
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
                        return;
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
                    try {
                        if (var7.field_v != null) {
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
                        var7.field_v = new int[5];
                        statePc = 35;
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
                    var8 = var7.field_v;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        if (var8[0] != param1) {
                            statePc = 35;
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
                        stackOut_17_0 = (int[]) var8;
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
                        if (stackIn_18_0[1] != param2) {
                            statePc = 35;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = (int[]) var8;
                        stackIn_22_0 = stackOut_21_0;
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
                        if (stackIn_22_0[2] != param3) {
                            statePc = 35;
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
                        stackOut_25_0 = (int[]) var8;
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
                        if (stackIn_26_0[3] != param4) {
                            statePc = 35;
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
                        stackOut_29_0 = (int[]) var8;
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
                        if (stackIn_30_0[4] != param5) {
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
                        return;
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
                    var8 = var7.field_v;
                    var8[0] = param1;
                    var8[1] = param2;
                    var8[2] = param3;
                    var8[3] = param4;
                    var8[4] = param5;
                    var9 = var7.field_t;
                    var10 = param3;
                    var11 = param4;
                    param3 = var9[3] * var10 + var9[4] * var11 + var9[5] * param5 >> 16;
                    param4 = var9[6] * var10 + var9[7] * var11 + var9[8] * param5 >> 16;
                    param5 = var9[9] * var10 + var9[10] * var11 + var9[11] * param5 >> 16;
                    var12 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
                    var13 = param2 * var12 >> 8;
                    var14 = var6.field_o.length;
                    if (param0.field_k != null) {
                        statePc = 42;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var15 = new pj(new pj[0], 0);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    try {
                        var15.field_k = var6.field_f;
                        var15.field_x = var6.field_g;
                        var15.field_m = var6.field_k;
                        var15.field_j = var6.field_M;
                        var15.field_y = var6.field_B;
                        var15.field_v = var6.field_E;
                        var15.field_p = var6.field_o;
                        var15.field_u = var6.field_y;
                        var15.field_t = var6.field_q;
                        if (var6.field_u == null) {
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
                        var15.field_h = sg.a(var6.field_u);
                        var15.field_g = sg.a(var6.field_n);
                        var15.field_i = sg.a(var6.field_x);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 41: {
                    var15.field_F = var6.field_D;
                    var15.field_z = var6.field_A;
                    param0.field_k = var15;
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    var15 = param0.field_k;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    try {
                        if (var15.field_f == null) {
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
                        stackOut_44_0 = (pj) var15;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0.field_f.length >= var14) {
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
                        var15.field_f = new int[var14];
                        var15.field_s = new int[var14];
                        var15.field_l = new int[var14];
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 51: {
                    var16 = var6.field_M;
                    var17 = var6.field_B;
                    var18 = var6.field_E;
                    var19 = var6.field_f;
                    if (var6.field_l != null) {
                        statePc = 92;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var6.field_l = new dd[var19];
                    var20 = 0;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    try {
                        if (var20 >= var14) {
                            statePc = 92;
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
                        if (var6.field_j == null) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
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
                        if (var6.field_j[var20] != 0) {
                            statePc = 91;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 60: {
                    var21 = var6.field_o[var20];
                    var22 = var6.field_y[var20];
                    var23 = var6.field_q[var20];
                    var24 = var16[var22] - var16[var21];
                    var25 = var17[var22] - var17[var21];
                    var26 = var18[var22] - var18[var21];
                    var27 = var16[var23] - var16[var21];
                    var28 = var17[var23] - var17[var21];
                    var29 = var18[var23] - var18[var21];
                    var30 = var25 * var29 - var28 * var26;
                    var31 = var26 * var27 - var29 * var24;
                    var32 = var24 * var28 - var27 * var25;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    try {
                        if (var30 > 8192) {
                            statePc = 81;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = var31;
                        stackIn_63_0 = stackOut_62_0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 > 8192) {
                            statePc = 81;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackOut_66_0 = var32;
                        stackIn_67_0 = stackOut_66_0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (stackIn_67_0 > 8192) {
                            statePc = 81;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackOut_70_0 = var30;
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
                        if (stackIn_71_0 < -8192) {
                            statePc = 81;
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
                        stackOut_74_0 = var31;
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
                        if (stackIn_75_0 < -8192) {
                            statePc = 81;
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
                        if (var32 >= -8192) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 80: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 81: {
                    var30 = var30 >> 1;
                    var31 = var31 >> 1;
                    var32 = var32 >> 1;
                    statePc = 61;
                    continue stateLoop;
                }
                case 82: {
                    var33 = (int)Math.sqrt((double)(var30 * var30 + var31 * var31 + var32 * var32));
                    if (var33 > 0) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var33 = 1;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    var30 = var30 * 256 / var33;
                    var31 = var31 * 256 / var33;
                    var32 = var32 * 256 / var33;
                    var34_ref_dd = var6.field_l[var21];
                    if (var34_ref_dd != null) {
                        statePc = 86;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var6.field_l[var21] = new dd();
                    var34_ref = new dd();
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    var34_ref.field_g = var34_ref.field_g + var30;
                    var34_ref.field_a = var34_ref.field_a + var31;
                    var34_ref.field_h = var34_ref.field_h + var32;
                    var34_ref.field_f = var34_ref.field_f + 1;
                    var34_ref_dd = var6.field_l[var22];
                    if (var34_ref_dd != null) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var6.field_l[var22] = new dd();
                    var34_ref = new dd();
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var34_ref.field_g = var34_ref.field_g + var30;
                    var34_ref.field_a = var34_ref.field_a + var31;
                    var34_ref.field_h = var34_ref.field_h + var32;
                    var34_ref.field_f = var34_ref.field_f + 1;
                    var34_ref_dd = var6.field_l[var23];
                    if (var34_ref_dd != null) {
                        statePc = 90;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var6.field_l[var23] = new dd();
                    var34_ref = new dd();
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var34_ref.field_g = var34_ref.field_g + var30;
                    var34_ref.field_a = var34_ref.field_a + var31;
                    var34_ref.field_h = var34_ref.field_h + var32;
                    var34_ref.field_f = var34_ref.field_f + 1;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    var20++;
                    statePc = 53;
                    continue stateLoop;
                }
                case 92: {
                    var20 = 0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (var20 >= var14) {
                        statePc = 144;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var21 = var6.field_o[var20];
                    var22 = var6.field_y[var20];
                    var23 = var6.field_q[var20];
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    try {
                        if (var6.field_D == null) {
                            statePc = 102;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackOut_96_0 = (rm) var6;
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
                        if (stackIn_97_0.field_D[var20] == -1) {
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
                        stackOut_100_0 = 1;
                        stackIn_103_0 = stackOut_100_0;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 101: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 102: {
                    stackOut_102_0 = 0;
                    stackIn_103_0 = stackOut_102_0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    var24 = stackIn_103_0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    try {
                        if (var6.field_j == null) {
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
                        if (var6.field_j[var20] != 0) {
                            statePc = 116;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 107: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 108: {
                    var27 = var6.field_m[var20];
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    try {
                        if (var13 == 0) {
                            statePc = 113;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (var6.field_l[var21].field_f != 0) {
                            statePc = 113;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 112: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 113: {
                    var25_ref_dd = var6.field_l[var21];
                    var26 = param1 + (param3 * var25_ref_dd.field_g + param4 * var25_ref_dd.field_a + param5 * var25_ref_dd.field_h) / (var13 * var25_ref_dd.field_f);
                    var15.field_f[var20] = sg.a(var27, var26, var24 != 0);
                    if (var6.field_l[var22].field_f != 0) {
                        statePc = 114;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var25_ref_dd = var6.field_l[var22];
                    var26 = param1 + (param3 * var25_ref_dd.field_g + param4 * var25_ref_dd.field_a + param5 * var25_ref_dd.field_h) / (var13 * var25_ref_dd.field_f);
                    var15.field_s[var20] = sg.a(var27, var26, var24 != 0);
                    if (var6.field_l[var23].field_f != 0) {
                        statePc = 115;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var25_ref_dd = var6.field_l[var23];
                    var26 = param1 + (param3 * var25_ref_dd.field_g + param4 * var25_ref_dd.field_a + param5 * var25_ref_dd.field_h) / (var13 * var25_ref_dd.field_f);
                    var15.field_l[var20] = sg.a(var27, var26, var24 != 0);
                    statePc = 143;
                    continue stateLoop;
                }
                case 116: {
                    if (var6.field_j[var20] != 1) {
                        statePc = 142;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var25 = var16[var22] - var16[var21];
                    var26 = var17[var22] - var17[var21];
                    var27 = var18[var22] - var18[var21];
                    var28 = var16[var23] - var16[var21];
                    var29 = var17[var23] - var17[var21];
                    var30 = var18[var23] - var18[var21];
                    var31 = var26 * var30 - var29 * var27;
                    var32 = var27 * var28 - var30 * var25;
                    var33 = var25 * var29 - var28 * var26;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    try {
                        if (var31 > 8192) {
                            statePc = 138;
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
                        stackOut_119_0 = var32;
                        stackIn_120_0 = stackOut_119_0;
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
                        if (stackIn_120_0 > 8192) {
                            statePc = 138;
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
                        stackOut_123_0 = var33;
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
                        if (stackIn_124_0 > 8192) {
                            statePc = 138;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        stackOut_127_0 = var31;
                        stackIn_128_0 = stackOut_127_0;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (stackIn_128_0 < -8192) {
                            statePc = 138;
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
                        stackOut_131_0 = var32;
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
                        if (stackIn_132_0 < -8192) {
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
                        if (var33 >= -8192) {
                            statePc = 139;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 137: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 138: {
                    var31 = var31 >> 1;
                    var32 = var32 >> 1;
                    var33 = var33 >> 1;
                    statePc = 118;
                    continue stateLoop;
                }
                case 139: {
                    var34 = (int)Math.sqrt((double)(var31 * var31 + var32 * var32 + var33 * var33));
                    if (var34 > 0) {
                        statePc = 141;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var34 = 1;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    var31 = var31 * 256 / var34;
                    var32 = var32 * 256 / var34;
                    var33 = var33 * 256 / var34;
                    var35 = param1 + (param3 * var31 + param4 * var32 + param5 * var33) / (var13 + var13 / 2);
                    var15.field_f[var20] = sg.a((int) var6.field_m[var20], var35, var24 != 0);
                    var15.field_l[var20] = -1;
                    statePc = 143;
                    continue stateLoop;
                }
                case 142: {
                    var15.field_l[var20] = -2;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    var20++;
                    statePc = 93;
                    continue stateLoop;
                }
                case 144: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_10_0 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_55_0 = 0;
        Object stackOut_9_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_48_0 = null;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var1 >= ((sg) this).field_g.length) {
                            statePc = 27;
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
                        if (((sg) this).field_x[var1]) {
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
                        this.e(var1);
                        ((sg) this).field_p[var1] = ((sg) this).field_G[var1].length - 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 8: {
                    try {
                        if (((sg) this).field_p[var1] < 0) {
                            statePc = 16;
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
                        stackOut_9_0 = this;
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
                        if (((sg) this).field_G[var1][((sg) this).field_p[var1]] != -1) {
                            statePc = 16;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((sg) this).field_p[var1] = ((sg) this).field_p[var1] - 1;
                        statePc = 8;
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
                    ((sg) this).field_p[var1] = -1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        stackOut_16_0 = ((sg) this).field_m;
                        stackOut_16_1 = var1;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (((sg) this).field_p[var1] != -1) {
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
                        stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = -2147483648;
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
                    stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                    stackOut_19_1 = stackIn_19_1;
                    stackOut_19_2 = this.b(var1, ((sg) this).field_G[var1][((sg) this).field_p[var1]]);
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_20_0[stackIn_20_1] = stackIn_20_2;
                    ((sg) this).field_q[var1] = var1;
                    var2 = var1;
                    var3 = (var1 - 1) / 2;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        if (var2 <= 0) {
                            statePc = 26;
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
                        if (!this.a(((sg) this).field_q[var2], ((sg) this).field_q[var3])) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 25: {
                    var4 = ((sg) this).field_q[var2];
                    ((sg) this).field_q[var2] = ((sg) this).field_q[var3];
                    ((sg) this).field_q[var3] = var4;
                    var2 = var3;
                    var3 = (var3 - 1) / 2;
                    statePc = 21;
                    continue stateLoop;
                }
                case 26: {
                    var1++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 27: {
                    if (((sg) this).field_m[((sg) this).field_q[0]] == -2147483648) {
                        statePc = 58;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var1 = ((sg) this).field_q[0];
                    var2 = ((sg) this).field_G[var1][((sg) this).field_p[var1]];
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    try {
                        this.c(var1, var2);
                        ((sg) this).field_p[var1] = ((sg) this).field_p[var1] - 1;
                        stackOut_29_0 = ((sg) this).field_m;
                        stackOut_29_1 = var1;
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        if (((sg) this).field_p[var1] <= 0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ((sg) this).field_m[var1] = this.b(var1, ((sg) this).field_G[var1][((sg) this).field_p[var1]]);
                        stackOut_30_0 = (int[]) (Object) stackIn_30_0;
                        stackOut_30_1 = stackIn_30_1;
                        stackOut_30_2 = this.b(var1, ((sg) this).field_G[var1][((sg) this).field_p[var1]]);
                        stackIn_33_0 = stackOut_30_0;
                        stackIn_33_1 = stackOut_30_1;
                        stackIn_33_2 = stackOut_30_2;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 32: {
                    stackOut_32_0 = (int[]) (Object) stackIn_32_0;
                    stackOut_32_1 = stackIn_32_1;
                    stackOut_32_2 = -2147483648;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    stackIn_33_2 = stackOut_32_2;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_33_0[stackIn_33_1] = stackIn_33_2;
                    var3 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var4 = 2 * var3 + 1;
                    var5 = var4 + 1;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    try {
                        if (var4 >= ((sg) this).field_q.length) {
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
                        stackOut_36_0 = this;
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
                        if (!this.a(var1, ((sg) this).field_q[var4])) {
                            statePc = 47;
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
                        if (var5 >= ((sg) this).field_q.length) {
                            statePc = 27;
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
                        if (!this.a(((sg) this).field_q[var5], var1)) {
                            statePc = 27;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 46: {
                    ((sg) this).field_q[var3] = ((sg) this).field_q[var5];
                    ((sg) this).field_q[var5] = var1;
                    var3 = var5;
                    statePc = 34;
                    continue stateLoop;
                }
                case 47: {
                    try {
                        if (var5 >= ((sg) this).field_q.length) {
                            statePc = 54;
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
                        stackOut_48_0 = this;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (!this.a(((sg) this).field_q[var5], ((sg) this).field_q[var4])) {
                            statePc = 54;
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
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = var5;
                        stackIn_55_0 = stackOut_52_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 54: {
                    stackOut_54_0 = var4;
                    stackIn_55_0 = stackOut_54_0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var6 = stackIn_55_0;
                    ((sg) this).field_q[var3] = ((sg) this).field_q[var6];
                    ((sg) this).field_q[var6] = var1;
                    var3 = var6;
                    statePc = 34;
                    continue stateLoop;
                }
                case 58: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    sg(int param0) {
        ((sg) this).field_y = param0;
        ((sg) this).field_g = new kh[param0];
        ((sg) this).field_F = new int[param0];
        ((sg) this).field_h = new int[param0];
        ((sg) this).field_i = new int[param0];
        ((sg) this).field_v = new int[param0][];
        ((sg) this).field_c = new int[param0][];
        ((sg) this).field_u = new int[param0][];
        ((sg) this).field_G = new int[param0][];
        ((sg) this).field_x = new boolean[param0];
        ((sg) this).field_D = null;
        ((sg) this).field_p = new int[param0];
        ((sg) this).field_m = new int[param0];
        ((sg) this).field_q = new int[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[3];
        field_f = 1;
        field_r = new short[1024][4096];
        field_E = new int[1024];
        field_B = new short[768][1024];
        field_d = new int[3];
        field_z = new int[768];
        field_k = new int[3];
        field_t = new int[3];
        field_n = new int[3];
    }
}
